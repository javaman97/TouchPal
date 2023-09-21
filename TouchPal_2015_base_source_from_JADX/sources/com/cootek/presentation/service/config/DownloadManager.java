package com.cootek.presentation.service.config;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.service.PresentationSystem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DownloadManager {
    private static String ETAG_EXT = ".etag";
    public static final int TYPE_IME = 0;
    public static final int TYPE_NON_APK = 2;
    private static DownloadManager sInstance;

    public static DownloadManager getInstance() {
        if (sInstance == null) {
            sInstance = new DownloadManager(PresentationSystem.getInstance().getContext());
        }
        return sInstance;
    }

    private DownloadManager(Context context) {
    }

    public int getPartFileSize(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int available = fileInputStream.available();
            fileInputStream.close();
            return available;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public boolean createETagFile(File file, String str, int i) {
        File file2 = new File(file.getParentFile(), String.valueOf(file.getName()) + ETAG_EXT);
        try {
            file2.createNewFile();
            FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write(String.valueOf(str) + ":" + String.valueOf(i));
            fileWriter.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public boolean removeETagFile(File file) {
        File file2 = new File(file.getParentFile(), String.valueOf(file.getName()) + ETAG_EXT);
        if (!file2.exists()) {
            return true;
        }
        file2.delete();
        return true;
    }

    private String getETagPart(String str) {
        int indexOf;
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(":")) >= 0 && indexOf < str.length()) {
            return str.substring(0, indexOf);
        }
        return null;
    }

    private String getFileLenPart(String str) {
        int indexOf;
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(":")) >= 0 && indexOf < str.length()) {
            return str.substring(indexOf + 1, str.length());
        }
        return null;
    }

    public String getETag(File file) {
        if (PresentationSystem.DUMPINFO) {
            Log.d("DownloadManager", "downloadFileName: " + file.getName());
        }
        File file2 = new File(file.getParentFile(), String.valueOf(file.getName()) + ETAG_EXT);
        if (!file2.exists()) {
            return null;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = fileReader.read(cArr, 0, 1024);
                if (read == -1) {
                    fileReader.close();
                    return getETagPart(sb.toString());
                }
                sb.append(cArr, 0, read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public int getWholeFileSize(File file) {
        File file2 = new File(file.getParentFile(), String.valueOf(file.getName()) + ETAG_EXT);
        if (!file2.exists()) {
            return -1;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            char[] cArr = new char[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = fileReader.read(cArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
            fileReader.close();
            String fileLenPart = getFileLenPart(sb.toString());
            if (fileLenPart == null || !TextUtils.isDigitsOnly(fileLenPart)) {
                return -1;
            }
            return Integer.parseInt(fileLenPart);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public File getSdcardRoot() {
        return Environment.getExternalStorageDirectory();
    }
}
