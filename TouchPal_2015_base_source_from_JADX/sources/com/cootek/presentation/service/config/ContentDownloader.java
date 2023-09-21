package com.cootek.presentation.service.config;

import android.os.Environment;
import android.util.Log;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.sdk.utils.FileUtil;
import com.cootek.presentation.sdk.utils.NetworkUtil;
import com.cootek.presentation.sdk.utils.ZipCompressor;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.history.PresentHistoryManager;
import com.cootek.presentation.service.toast.PresentToast;
import com.cootek.smartinput5.func.C1389aD;
import java.io.File;
import java.io.IOException;

class ContentDownloader {
    private static final int RESULT_OK = 2000;

    ContentDownloader() {
    }

    static void prepareContent(PresentToast presentToast) {
        if (!NetworkUtil.getNetworkStatus().wifiConnected) {
            if (PresentationSystem.DUMPINFO) {
                Log.d("ContentDownloader", "wifi not connected");
            }
        } else if (presentToast.isReady()) {
            if (PresentationSystem.DUMPINFO) {
                Log.d("ContentDownloader", "pt not ready");
            }
        } else if (presentToast.downloadPeriodMeetCondition(SystemFacade.currentTimeMillis())) {
            if (PresentationSystem.DUMPINFO) {
                Log.d("ContentDownloader", "prepare pt");
            }
            prepareImage(presentToast);
            prepareDownload(presentToast);
        } else if (PresentationSystem.DUMPINFO) {
            Log.d("ContentDownloader", "pt not time download");
        }
    }

    private static void prepareImage(PresentToast presentToast) {
        String download;
        if (!presentToast.isImageReady() && (download = download(presentToast.getImageUrl(), presentToast.getDownloadType(), presentToast.getId())) != null) {
            PresentationSystem.getInstance().getHistoryManager().setFeatureSetting(presentToast.getId(), PresentHistoryManager.IMAGE_PATH, download);
        }
    }

    private static void prepareDownload(PresentToast presentToast) {
        String download;
        if (!presentToast.isDownloadReady() && (download = download(presentToast.getAutoDownloadUrl(), presentToast.getDownloadType(), presentToast.getId())) != null) {
            PresentationSystem.getInstance().getHistoryManager().setFeatureSetting(presentToast.getId(), PresentHistoryManager.FILE_PATH, download);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x020d A[SYNTHETIC, Splitter:B:111:0x020d] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0141 A[SYNTHETIC, Splitter:B:35:0x0141] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x019f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:63:0x0192=Splitter:B:63:0x0192, B:57:0x0186=Splitter:B:57:0x0186, B:51:0x017a=Splitter:B:51:0x017a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String download(java.lang.String r10, int r11, java.lang.String r12) {
        /*
            r7 = 200(0xc8, float:2.8E-43)
            r2 = 0
            boolean r0 = com.cootek.presentation.service.PresentationSystem.DUMPINFO
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "ContentDownloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "targetUrl: "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.String r0 = "ContentDownloader"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "type: "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L_0x002f:
            r0 = 1
            if (r11 != r0) goto L_0x0260
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.String r3 = "&token="
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            com.cootek.presentation.service.PresentationSystem r3 = com.cootek.presentation.service.PresentationSystem.getInstance()     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            com.cootek.presentation.sdk.INativeAppInfoRemote r3 = r3.getNativeAppInfo()     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.String r3 = r3.getAuthToken()     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            boolean r1 = com.cootek.presentation.service.PresentationSystem.DUMPINFO     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = "ContentDownloader"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.String r4 = "ret: "
            r3.<init>(r4)     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            com.cootek.presentation.service.PresentationSystem r4 = com.cootek.presentation.service.PresentationSystem.getInstance()     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            com.cootek.presentation.sdk.INativeAppInfoRemote r4 = r4.getNativeAppInfo()     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.String r4 = r4.getAuthToken()     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            android.util.Log.d(r1, r3)     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
        L_0x007e:
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0256, JSONException -> 0x0184, RemoteException -> 0x0190, all -> 0x019c }
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            r1 = 15000(0x3a98, float:2.102E-41)
            r0.setConnectTimeout(r1)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            r0.connect()     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            boolean r3 = com.cootek.presentation.service.PresentationSystem.DUMPINFO     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            if (r3 == 0) goto L_0x00b2
            java.lang.String r3 = "ContentDownloader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r5 = "ret: "
            r4.<init>(r5)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            android.util.Log.d(r3, r4)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
        L_0x00b2:
            if (r1 == r7) goto L_0x00ba
            if (r0 == 0) goto L_0x00b9
            r0.disconnect()
        L_0x00b9:
            return r2
        L_0x00ba:
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            r3.<init>()     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
        L_0x00c7:
            int r5 = r1.read(r4)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            if (r5 > 0) goto L_0x0170
            r3.flush()     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r4 = "utf-8"
            java.lang.String r3 = r3.toString(r4)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            boolean r3 = com.cootek.presentation.service.PresentationSystem.DUMPINFO     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            if (r3 == 0) goto L_0x00f7
            java.lang.String r3 = "ContentDownloader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r5 = "json: "
            r4.<init>(r5)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r5 = r1.toString()     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            android.util.Log.d(r3, r4)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
        L_0x00f7:
            java.lang.String r3 = "result_code"
            int r3 = r1.getInt(r3)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            r4 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r4) goto L_0x025d
            java.lang.String r3 = "result"
            org.json.JSONObject r1 = r1.getJSONObject(r3)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r3 = "url"
            java.lang.String r10 = r1.getString(r3)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r3 = "md5"
            java.lang.String r1 = r1.getString(r3)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            boolean r3 = com.cootek.presentation.service.PresentationSystem.DUMPINFO     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            if (r3 == 0) goto L_0x0135
            java.lang.String r3 = "ContentDownloader"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r5 = "targetUrl: "
            r4.<init>(r5)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.StringBuilder r4 = r4.append(r10)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r5 = ", md5: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.StringBuilder r4 = r4.append(r1)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            android.util.Log.d(r3, r4)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
        L_0x0135:
            if (r0 == 0) goto L_0x013a
            r0.disconnect()
        L_0x013a:
            r3 = 0
            java.io.File r4 = prepareFile(r12, r10)
            if (r4 == 0) goto L_0x00b9
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0238, all -> 0x0209 }
            r0.<init>(r10)     // Catch:{ IOException -> 0x0238, all -> 0x0209 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x0238, all -> 0x0209 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x0238, all -> 0x0209 }
            r5 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r5)     // Catch:{ IOException -> 0x023c, all -> 0x022c }
            r5 = 15000(0x3a98, float:2.102E-41)
            r0.setConnectTimeout(r5)     // Catch:{ IOException -> 0x023c, all -> 0x022c }
            java.lang.String r5 = "GET"
            r0.setRequestMethod(r5)     // Catch:{ IOException -> 0x023c, all -> 0x022c }
            r0.connect()     // Catch:{ IOException -> 0x023c, all -> 0x022c }
            int r5 = r0.getResponseCode()     // Catch:{ IOException -> 0x023c, all -> 0x022c }
            if (r5 == r7) goto L_0x01a8
            if (r2 == 0) goto L_0x0169
            r3.close()     // Catch:{ IOException -> 0x01a3 }
        L_0x0169:
            if (r0 == 0) goto L_0x00b9
            r0.disconnect()
            goto L_0x00b9
        L_0x0170:
            r6 = 0
            r3.write(r4, r6, r5)     // Catch:{ IOException -> 0x0176, JSONException -> 0x0250, RemoteException -> 0x024a, all -> 0x0241 }
            goto L_0x00c7
        L_0x0176:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x017a:
            r0.printStackTrace()     // Catch:{ all -> 0x0246 }
            if (r1 == 0) goto L_0x00b9
            r1.disconnect()
            goto L_0x00b9
        L_0x0184:
            r0 = move-exception
            r1 = r2
        L_0x0186:
            r0.printStackTrace()     // Catch:{ all -> 0x0246 }
            if (r1 == 0) goto L_0x00b9
            r1.disconnect()
            goto L_0x00b9
        L_0x0190:
            r0 = move-exception
            r1 = r2
        L_0x0192:
            r0.printStackTrace()     // Catch:{ all -> 0x0246 }
            if (r1 == 0) goto L_0x00b9
            r1.disconnect()
            goto L_0x00b9
        L_0x019c:
            r0 = move-exception
        L_0x019d:
            if (r2 == 0) goto L_0x01a2
            r2.disconnect()
        L_0x01a2:
            throw r0
        L_0x01a3:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0169
        L_0x01a8:
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ IOException -> 0x023c, all -> 0x022c }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x023c, all -> 0x022c }
            r3.<init>(r4)     // Catch:{ IOException -> 0x023c, all -> 0x022c }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x01eb, all -> 0x0230 }
        L_0x01b5:
            int r7 = r5.read(r6)     // Catch:{ IOException -> 0x01eb, all -> 0x0230 }
            if (r7 > 0) goto L_0x01e6
            r3.flush()     // Catch:{ IOException -> 0x01eb, all -> 0x0230 }
            boolean r1 = checkMD5(r4, r1)     // Catch:{ IOException -> 0x01eb, all -> 0x0230 }
            if (r1 == 0) goto L_0x021b
            java.lang.String r1 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x01eb, all -> 0x0230 }
            java.lang.String r5 = ".zip"
            boolean r1 = r1.endsWith(r5)     // Catch:{ IOException -> 0x01eb, all -> 0x0230 }
            if (r1 == 0) goto L_0x025a
            java.io.File r1 = processZip(r12, r4)     // Catch:{ IOException -> 0x01eb, all -> 0x0230 }
        L_0x01d4:
            if (r1 == 0) goto L_0x021b
            java.lang.String r2 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x01eb, all -> 0x0230 }
            if (r3 == 0) goto L_0x01df
            r3.close()     // Catch:{ IOException -> 0x01ff }
        L_0x01df:
            if (r0 == 0) goto L_0x00b9
            r0.disconnect()
            goto L_0x00b9
        L_0x01e6:
            r8 = 0
            r3.write(r6, r8, r7)     // Catch:{ IOException -> 0x01eb, all -> 0x0230 }
            goto L_0x01b5
        L_0x01eb:
            r1 = move-exception
            r9 = r1
            r1 = r3
            r3 = r0
            r0 = r9
        L_0x01f0:
            r0.printStackTrace()     // Catch:{ all -> 0x0235 }
            if (r1 == 0) goto L_0x01f8
            r1.close()     // Catch:{ IOException -> 0x0204 }
        L_0x01f8:
            if (r3 == 0) goto L_0x00b9
            r3.disconnect()
            goto L_0x00b9
        L_0x01ff:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x01df
        L_0x0204:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x01f8
        L_0x0209:
            r0 = move-exception
            r3 = r2
        L_0x020b:
            if (r2 == 0) goto L_0x0210
            r2.close()     // Catch:{ IOException -> 0x0216 }
        L_0x0210:
            if (r3 == 0) goto L_0x0215
            r3.disconnect()
        L_0x0215:
            throw r0
        L_0x0216:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0210
        L_0x021b:
            if (r3 == 0) goto L_0x0220
            r3.close()     // Catch:{ IOException -> 0x0227 }
        L_0x0220:
            if (r0 == 0) goto L_0x00b9
            r0.disconnect()
            goto L_0x00b9
        L_0x0227:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0220
        L_0x022c:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L_0x020b
        L_0x0230:
            r1 = move-exception
            r2 = r3
            r3 = r0
            r0 = r1
            goto L_0x020b
        L_0x0235:
            r0 = move-exception
            r2 = r1
            goto L_0x020b
        L_0x0238:
            r0 = move-exception
            r1 = r2
            r3 = r2
            goto L_0x01f0
        L_0x023c:
            r1 = move-exception
            r3 = r0
            r0 = r1
            r1 = r2
            goto L_0x01f0
        L_0x0241:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x019d
        L_0x0246:
            r0 = move-exception
            r2 = r1
            goto L_0x019d
        L_0x024a:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0192
        L_0x0250:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto L_0x0186
        L_0x0256:
            r0 = move-exception
            r1 = r2
            goto L_0x017a
        L_0x025a:
            r1 = r4
            goto L_0x01d4
        L_0x025d:
            r1 = r2
            goto L_0x0135
        L_0x0260:
            r1 = r2
            goto L_0x013a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.presentation.service.config.ContentDownloader.download(java.lang.String, int, java.lang.String):java.lang.String");
    }

    private static boolean checkMD5(File file, String str) {
        if (str == null) {
            return true;
        }
        return str.equalsIgnoreCase(FileUtil.getMD5(file));
    }

    private static boolean isExternalStorageWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static File prepareDir() {
        if (!isExternalStorageWritable()) {
            return null;
        }
        File file = new File(Environment.getExternalStorageDirectory(), "ndownloads");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, ".nomedia");
        if (file2.exists() && file2.isFile()) {
            return file;
        }
        try {
            if (!file2.isFile()) {
                FileUtil.delete(file2);
            }
            file2.createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return file;
        }
    }

    private static String getDownloadFileName(String str, String str2) {
        return String.valueOf(str) + str2.substring(str2.lastIndexOf(C1389aD.f4374j), str2.length());
    }

    private static File prepareFile(String str, String str2) {
        if (prepareDir() == null) {
            return null;
        }
        return new File(prepareDir(), getDownloadFileName(str, str2));
    }

    private static File processZip(String str, File file) {
        File file2 = new File(prepareDir(), String.valueOf(str) + "_tmp");
        File file3 = new File(prepareDir(), str);
        boolean extract = ZipCompressor.extract(file, file2, file3);
        file.delete();
        if (extract) {
            return file3;
        }
        return null;
    }
}
