package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import com.cootek.smartinput5.net.cmd.C2261Q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicNameValuePair;

class BaiduPCSDownloader extends BaiduPCSActionBase {
    private static final String AccessReadWrite = "rw";
    private static final String ContentLength = "Content-Length";
    private static final String Key_Type = "type";
    private static final String Key_ZIPContent = "zipcontent";
    private static final String Key_ZIPName = "zipname";
    private static final int MaxPieceSize = 51200;
    private static final String Split_File = "/";
    private static final String Value_Method = "download";
    private static final String Value_Method_BatchDownload = "batchdownload";
    private static final String Value_Method_Streaming = "streaming";
    private static final String mfCommand = "file";
    private static final String msCommand = "stream";

    BaiduPCSDownloader() {
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse downloadFile(String str, String str2, BaiduPCSStatusListener baiduPCSStatusListener) {
        return downloadFileFromServer(str, str2, mfCommand, (String) null, baiduPCSStatusListener);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse downloadFileFromStream(String str, String str2, BaiduPCSStatusListener baiduPCSStatusListener) {
        return downloadFileFromServer(str, str2, msCommand, (String) null, baiduPCSStatusListener);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse downloadFileWithSpecificCodecType(String str, String str2, String str3, BaiduPCSStatusListener baiduPCSStatusListener) {
        return downloadFileFromServer(str, str2, mfCommand, str3, baiduPCSStatusListener);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.baidu.pcs.BaiduPCSActionInfo.PCSSimplefiedResponse batchDownloadFiles(java.util.List<java.lang.String> r7, java.lang.String r8, com.baidu.pcs.BaiduPCSStatusListener r9) {
        /*
            r6 = this;
            r1 = 0
            if (r7 == 0) goto L_0x0082
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x0082
            if (r8 == 0) goto L_0x0082
            int r0 = r8.length()
            if (r0 <= 0) goto L_0x0082
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.http.message.BasicNameValuePair r2 = new org.apache.http.message.BasicNameValuePair
            java.lang.String r3 = "access_token"
            java.lang.String r4 = r6.getAccessToken()
            r2.<init>(r3, r4)
            r0.add(r2)
            org.apache.http.message.BasicNameValuePair r2 = new org.apache.http.message.BasicNameValuePair
            java.lang.String r3 = "method"
            java.lang.String r4 = "batchdownload"
            r2.<init>(r3, r4)
            r0.add(r2)
            java.lang.String r2 = "zipcontent"
            java.util.List r2 = r6.buildBodyParamsWithList(r7, r2)
            java.lang.String r3 = "/"
            int r3 = r8.lastIndexOf(r3)
            int r4 = r8.length()
            int r4 = r4 + -1
            java.lang.String r3 = r8.substring(r3, r4)
            org.apache.http.message.BasicNameValuePair r4 = new org.apache.http.message.BasicNameValuePair
            java.lang.String r5 = "zipname"
            r4.<init>(r5, r3)
            r2.add(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "https://pcs.baidu.com/rest/2.0/pcs/file?"
            r3.<init>(r4)
            java.lang.String r0 = r6.buildParams(r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            org.apache.http.client.methods.HttpPost r3 = new org.apache.http.client.methods.HttpPost
            r3.<init>(r0)
            org.apache.http.client.entity.UrlEncodedFormEntity r0 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ UnsupportedEncodingException -> 0x007e }
            java.lang.String r4 = r6.Encoding_UTF8     // Catch:{ UnsupportedEncodingException -> 0x007e }
            r0.<init>(r2, r4)     // Catch:{ UnsupportedEncodingException -> 0x007e }
            r3.setEntity(r0)     // Catch:{ UnsupportedEncodingException -> 0x007e }
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r0 = r6.startDownloading(r3, r8, r9)     // Catch:{ UnsupportedEncodingException -> 0x007e }
        L_0x0076:
            if (r0 != 0) goto L_0x007d
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r0 = new com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse
            r0.<init>()
        L_0x007d:
            return r0
        L_0x007e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0082:
            r0 = r1
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.pcs.BaiduPCSDownloader.batchDownloadFiles(java.util.List, java.lang.String, com.baidu.pcs.BaiduPCSStatusListener):com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse");
    }

    private BaiduPCSActionInfo.PCSSimplefiedResponse downloadFileFromServer(String str, String str2, String str3, String str4, BaiduPCSStatusListener baiduPCSStatusListener) {
        BaiduPCSActionInfo.PCSSimplefiedResponse pCSSimplefiedResponse = null;
        if (str != null && str2 != null && str.length() > 0 && str2.length() > 0) {
            ArrayList arrayList = new ArrayList();
            String str5 = "download";
            if (str4 != null && str4.length() > 0) {
                str5 = Value_Method_Streaming;
                arrayList.add(new BasicNameValuePair("type", str4));
            }
            arrayList.add(new BasicNameValuePair("method", str5));
            arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
            arrayList.add(new BasicNameValuePair("path", str));
            pCSSimplefiedResponse = startDownloading(new HttpGet("https://pcs.baidu.com/rest/2.0/pcs/" + str3 + C2261Q.f9807m + buildParams(arrayList)), str2, baiduPCSStatusListener);
        }
        if (pCSSimplefiedResponse == null) {
            return new BaiduPCSActionInfo.PCSSimplefiedResponse();
        }
        return pCSSimplefiedResponse;
    }

    private BaiduPCSActionInfo.PCSSimplefiedResponse startDownloading(HttpRequestBase httpRequestBase, String str, BaiduPCSStatusListener baiduPCSStatusListener) {
        File file;
        long j;
        BaiduPCSActionInfo.PCSSimplefiedResponse pCSSimplefiedResponse = new BaiduPCSActionInfo.PCSSimplefiedResponse();
        try {
            BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(httpRequestBase);
            if (sendHttpRequest != null) {
                pCSSimplefiedResponse.message = sendHttpRequest.message;
                if (sendHttpRequest.response != null) {
                    Header[] headers = sendHttpRequest.response.getHeaders(ContentLength);
                    if (headers.length > 0) {
                        j = Long.valueOf(headers[0].getValue()).longValue();
                    } else {
                        j = 0;
                    }
                    if (200 == sendHttpRequest.response.getStatusLine().getStatusCode()) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(str, AccessReadWrite);
                        InputStream content = sendHttpRequest.response.getEntity().getContent();
                        if (!(randomAccessFile == null || content == null)) {
                            boolean z = true;
                            long j2 = 0;
                            byte[] bArr = new byte[MaxPieceSize];
                            while (true) {
                                int read = content.read(bArr, 0, bArr.length);
                                if (read <= 0) {
                                    break;
                                }
                                randomAccessFile.write(bArr, 0, read);
                                j2 += (long) read;
                                if (baiduPCSStatusListener != null) {
                                    if (j <= 0 || j2 < j) {
                                        if (System.currentTimeMillis() - 0 > baiduPCSStatusListener.progressInterval()) {
                                            baiduPCSStatusListener.onProgress(j2, j);
                                        }
                                        if (!baiduPCSStatusListener.toContinue()) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        baiduPCSStatusListener.onProgress(j2, j);
                                    }
                                }
                            }
                            if (z) {
                                randomAccessFile.getFD().sync();
                                pCSSimplefiedResponse.errorCode = 0;
                            } else {
                                pCSSimplefiedResponse.errorCode = -1;
                                pCSSimplefiedResponse.message = "User stops downloading";
                            }
                            randomAccessFile.close();
                        }
                    } else {
                        pCSSimplefiedResponse = super.parseSimplefiedResponse(sendHttpRequest.response);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            pCSSimplefiedResponse.message = e.getMessage();
        } catch (IOException e2) {
            pCSSimplefiedResponse.message = e2.getMessage();
        }
        if (!(pCSSimplefiedResponse.errorCode == 0 || (file = new File(str)) == null || !file.exists())) {
            file.delete();
        }
        return pCSSimplefiedResponse;
    }
}
