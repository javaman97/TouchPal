package com.cootek.presentation.service.config;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.sdk.utils.DownloadUtil;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.smartinput5.net.cmd.C2250J;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.iflytek.cloud.ErrorCode;
import com.weibo.net.C4054q;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class PresentConfigDownloader {
    private static final int BUFFER_SIZE = 8192;
    private static final String PRESENT_ETAG_FILE_NAME = "tp_promo.xml.etag";
    private static final String PRESENT_FILE_URL = "/promotion/file";
    private static final String PRESENT_TEMP_FILE_NAME = "tp_promo.xml.tmp";
    private static final String TAG = "PresentFileDownloader";

    public static class DownloadResult {
        int errorCode = 0;
        boolean isSucceed = false;
        int retCode = 200;
    }

    private boolean copy(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read <= 0) {
                bufferedOutputStream.flush();
                return true;
            }
            bufferedOutputStream.write(bArr, 0, read);
        }
    }

    private boolean writeToTempFile(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return false;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        File file = getFile(PRESENT_TEMP_FILE_NAME);
        if (!file.exists()) {
            file.delete();
        }
        file.createNewFile();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), 8192);
        copy(bufferedInputStream, bufferedOutputStream);
        bufferedOutputStream.close();
        return true;
    }

    private void deleteTempFile() {
        File file = getFile(PRESENT_TEMP_FILE_NAME);
        if (file.exists()) {
            file.delete();
        }
    }

    private boolean copyTempFile() throws IOException {
        File file = getFile(PRESENT_TEMP_FILE_NAME);
        if (!file.exists()) {
            return false;
        }
        File file2 = getFile(PresentConfigXmlTag.PRESENT_FILE_NAME);
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
        copy(bufferedInputStream, bufferedOutputStream);
        bufferedInputStream.close();
        bufferedOutputStream.close();
        return true;
    }

    /* access modifiers changed from: protected */
    public DownloadResult download(String str, String str2) throws IOException, SecurityException {
        int i;
        HttpURLConnection httpURLConnection;
        IOException iOException;
        HttpURLConnection httpURLConnection2;
        Exception exc;
        HttpURLConnection httpURLConnection3;
        DownloadResult downloadResult = new DownloadResult();
        String format = String.format("%s%s?locale=%s", new Object[]{PresentationSystem.getServer(), "/promotion/file", str});
        if (PresentationSystem.DUMPINFO) {
            Log.d(TAG, String.format("downloadConfig url:%s", new Object[]{format}));
        }
        URL url = new URL(format);
        if (Build.VERSION.SDK_INT < 8) {
            System.setProperty("http.keepAlive", "false");
        }
        int i2 = 0;
        List<Pair<String, Integer>> proxy = PresentationSystem.getProxy();
        int i3 = 0;
        HttpURLConnection httpURLConnection4 = null;
        while (true) {
            if (i3 >= proxy.size() + 1) {
                i = i2;
                httpURLConnection = httpURLConnection4;
                break;
            }
            if (i3 == 0) {
                try {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                } catch (IOException e) {
                    iOException = e;
                    httpURLConnection2 = httpURLConnection4;
                    iOException.printStackTrace();
                    httpURLConnection = httpURLConnection2;
                    i = i2;
                    i3++;
                    httpURLConnection4 = httpURLConnection;
                    i2 = i;
                } catch (Exception e2) {
                    exc = e2;
                    httpURLConnection3 = httpURLConnection4;
                    exc.printStackTrace();
                    httpURLConnection = httpURLConnection3;
                    i = i2;
                    i3++;
                    httpURLConnection4 = httpURLConnection;
                    i2 = i;
                }
            } else {
                Pair pair = proxy.get(i3 - 1);
                httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) pair.first, ((Integer) pair.second).intValue())));
            }
            try {
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setConnectTimeout(ErrorCode.MSP_ERROR_MMP_BASE);
                httpURLConnection.setRequestMethod(C4054q.f16510f);
                httpURLConnection.setDoInput(true);
                if (!TextUtils.isEmpty(str2)) {
                    httpURLConnection.addRequestProperty(C2261Q.f9792am, String.format("auth_token=%s", new Object[]{str2}));
                }
                String lastEtag = getLastEtag();
                if (!TextUtils.isEmpty(lastEtag)) {
                    DownloadUtil.setEtagInHeader(httpURLConnection, lastEtag);
                }
                dumpHeader(httpURLConnection, true);
                httpURLConnection.connect();
                i = httpURLConnection.getResponseCode();
                if (i == 200 || i == 302 || i == 304 || i == 400 || i == 500) {
                    break;
                }
                i3++;
                httpURLConnection4 = httpURLConnection;
                i2 = i;
            } catch (IOException e3) {
                IOException iOException2 = e3;
                httpURLConnection2 = httpURLConnection;
                iOException = iOException2;
                iOException.printStackTrace();
                httpURLConnection = httpURLConnection2;
                i = i2;
                i3++;
                httpURLConnection4 = httpURLConnection;
                i2 = i;
            } catch (Exception e4) {
                Exception exc2 = e4;
                httpURLConnection3 = httpURLConnection;
                exc = exc2;
                exc.printStackTrace();
                httpURLConnection = httpURLConnection3;
                i = i2;
                i3++;
                httpURLConnection4 = httpURLConnection;
                i2 = i;
            }
        }
        if (PresentationSystem.DUMPINFO) {
            Log.d(TAG, "ret_code: " + i);
        }
        downloadResult.retCode = i;
        if (PresentationSystem.DUMPINFO) {
            Log.d(TAG, "repsonce--------------");
        }
        dumpHeader(httpURLConnection, false);
        if (i == 304) {
            downloadResult.isSucceed = true;
            downloadResult.retCode = i;
            return downloadResult;
        } else if (i != 200) {
            if (i == 444) {
                StringBuffer stringBuffer = new StringBuffer();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                    stringBuffer.append(C0911j.f2473c);
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (PresentationSystem.DUMPINFO) {
                    Log.i("Joe", "Downloader ResponseBody: " + stringBuffer.toString());
                }
                try {
                    downloadResult.errorCode = new JSONObject(stringBuffer.toString()).getInt(C2250J.f9627c);
                } catch (JSONException e5) {
                }
            }
            Log.e("test", new StringBuilder().append(httpURLConnection.getURL()).toString());
            httpURLConnection.disconnect();
            downloadResult.isSucceed = false;
            return downloadResult;
        } else {
            setLastEtag(DownloadUtil.getEtagInHeader(httpURLConnection));
            Log.d("chao", new StringBuilder().append(httpURLConnection.getURL()).toString());
            InputStream inputStream = httpURLConnection.getInputStream();
            boolean z = false;
            if (inputStream != null) {
                z = writeToTempFile(inputStream);
                inputStream.close();
            }
            httpURLConnection.disconnect();
            if (PresentationSystem.DUMPINFO) {
                Log.d(TAG, "download -- no exception");
            }
            if (z) {
                if (copyTempFile()) {
                    deleteTempFile();
                    z = true;
                } else {
                    z = false;
                }
            }
            downloadResult.isSucceed = z;
            if (PresentationSystem.DUMPINFO) {
                Log.d(TAG, "copy -- no exception");
            }
            return downloadResult;
        }
    }

    private void dumpHeader(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            if (PresentationSystem.DUMPINFO) {
                Log.i(TAG, "Headers: " + httpURLConnection.getRequestProperties());
            }
        } else if (PresentationSystem.DUMPINFO) {
            Log.i(TAG, "Headers: " + httpURLConnection.getHeaderFields());
        }
    }

    private File getFile(String str) {
        return new File(PresentationSystem.getInstance().getContext().getFilesDir(), str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A[SYNTHETIC, Splitter:B:23:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0047 A[SYNTHETIC, Splitter:B:29:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setLastEtag(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            java.lang.String r0 = "tp_promo.xml.etag"
            java.io.File r0 = r4.getFile(r0)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0016
            r0.createNewFile()     // Catch:{ IOException -> 0x002f }
        L_0x0016:
            r2 = 0
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0034, all -> 0x0044 }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x0034, all -> 0x0044 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0034, all -> 0x0044 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0034, all -> 0x0044 }
            r1.write(r5)     // Catch:{ IOException -> 0x0053 }
            if (r1 == 0) goto L_0x0006
            r1.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0006
        L_0x002a:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0006
        L_0x002f:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0016
        L_0x0034:
            r0 = move-exception
            r1 = r2
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0006
            r1.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0006
        L_0x003f:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0006
        L_0x0044:
            r0 = move-exception
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x004b }
        L_0x004a:
            throw r0
        L_0x004b:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x004a
        L_0x0050:
            r0 = move-exception
            r2 = r1
            goto L_0x0045
        L_0x0053:
            r0 = move-exception
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.presentation.service.config.PresentConfigDownloader.setLastEtag(java.lang.String):void");
    }

    private String getLastEtag() {
        String str = null;
        File file = getFile(PRESENT_ETAG_FILE_NAME);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    str = bufferedReader.readLine();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e2) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e5) {
            }
        }
        return str;
    }

    public static void setEtagInHeader(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.addRequestProperty(C2261Q.f9793an, str);
    }
}
