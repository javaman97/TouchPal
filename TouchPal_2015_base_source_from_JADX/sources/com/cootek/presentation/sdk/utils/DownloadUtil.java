package com.cootek.presentation.sdk.utils;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.DownloadFile;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.toast.PresentToast;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.net.cmd.C2261Q;
import java.io.File;
import java.net.HttpURLConnection;

public class DownloadUtil {
    public static boolean parseAutoDownload(PresentToast presentToast) {
        if (!NetworkUtil.meetNetwork(1)) {
            return true;
        }
        String id = presentToast.getId();
        String autoDownloadUrl = presentToast.getAutoDownloadUrl();
        if (TextUtils.isEmpty(autoDownloadUrl)) {
            return false;
        }
        File prepareFile = prepareFile(presentToast.getId(), autoDownloadUrl);
        if (presentToast.autoFileDownloader == null) {
            presentToast.autoFileDownloader = new DownloadFile(autoDownloadUrl, id, false);
        }
        if (prepareFile.exists()) {
            if (PresentationSystem.DUMPINFO) {
                Log.d("chao", "file exists");
            }
            presentToast.autoFileDownloader.processFile(prepareFile.getAbsolutePath());
            return false;
        } else if (autoDownloadUrl.endsWith(PresentConfigXmlTag.POSTFIX_FILE_PATH_HTML)) {
            presentToast.autoFileDownloader.processFile(autoDownloadUrl);
            return false;
        } else if (autoDownloadUrl == null || !autoDownloadUrl.startsWith("http://")) {
            return true;
        } else {
            presentToast.autoFileDownloader.startDownload();
            return true;
        }
    }

    public static String unzipFile(String str) {
        String folderName = getFolderName(str);
        File file = new File(str);
        File file2 = new File(PresentationSystem.getInstance().getContext().getFilesDir(), String.valueOf(folderName) + File.separator + "tmp");
        File file3 = new File(PresentationSystem.getInstance().getContext().getFilesDir(), folderName);
        boolean extract = ZipCompressor.extract(file, file2, file3);
        file.delete();
        if (extract) {
            return file3.getAbsolutePath();
        }
        return null;
    }

    private static String getFolderName(String str) {
        return str.substring(str.lastIndexOf(47) + 1, str.lastIndexOf(C1389aD.f4374j));
    }

    public static String getEtagInHeader(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getHeaderField("ETag");
    }

    public static void setEtagInHeader(HttpURLConnection httpURLConnection, String str) {
        try {
            httpURLConnection.addRequestProperty(C2261Q.f9793an, str);
        } catch (Exception e) {
        }
    }

    private static String getDownloadFileName(String str, String str2) {
        return String.valueOf(str) + str2.substring(str2.lastIndexOf(C1389aD.f4374j), str2.length());
    }

    private static boolean isExternalStorageWritable() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return true;
        }
        return false;
    }

    public static File prepareDir() {
        File filesDir;
        if (isExternalStorageWritable()) {
            filesDir = Environment.getExternalStorageDirectory();
        } else {
            filesDir = PresentationSystem.getInstance().getContext().getFilesDir();
        }
        File file = new File(filesDir, "ndownloads");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static File prepareFile(String str, String str2) {
        return new File(prepareDir(), getDownloadFileName(str, str2));
    }
}
