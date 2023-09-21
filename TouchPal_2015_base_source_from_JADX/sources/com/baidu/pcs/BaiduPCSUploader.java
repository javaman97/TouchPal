package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

class BaiduPCSUploader extends BaiduPCSActionBase {
    private static final String Key_BlockList = "block_list";
    private static final String Key_Type = "type";
    private static final int MaxPieceSize = 102400;
    private static final int Max_Pieces = 1024;
    private static final String TmpFileName = "upload.tmp";
    private static final String Value_Method_CreateSuperFile = "createsuperfile";
    private static final String Value_Method_Upload = "upload";
    private static final String Value_TmpFile = "tmpfile";

    BaiduPCSUploader() {
    }

    public BaiduPCSActionInfo.PCSFileInfoResponse uploadFile(String str, String str2, BaiduPCSStatusListener baiduPCSStatusListener) {
        UploadTask uploadTask = new UploadTask(this, (UploadTask) null);
        uploadTask.source = str;
        uploadTask.target = str2;
        uploadTask.listener = baiduPCSStatusListener;
        return startUploadingByTask(uploadTask);
    }

    private BaiduPCSActionInfo.PCSFileInfoResponse startUploadingByTask(UploadTask uploadTask) {
        File file;
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse = new BaiduPCSActionInfo.PCSFileInfoResponse();
        if (uploadTask.source != null && uploadTask.target != null && uploadTask.source.length() > 0 && uploadTask.target.length() > 0 && (file = new File(uploadTask.source)) != null && file.length() > 0) {
            long length = file.length();
            if (102400 > length) {
                pCSFileInfoResponse = uploadFileInSinglePiece(file, uploadTask.target);
            } else {
                pCSFileInfoResponse = uploadFileInMutiplePieces(file, uploadTask);
            }
            if (pCSFileInfoResponse.status.errorCode == 0 && uploadTask.listener != null) {
                uploadTask.listener.onProgress(length, length);
            }
        }
        return pCSFileInfoResponse;
    }

    private BaiduPCSActionInfo.PCSFileInfoResponse uploadFileInSinglePiece(File file, String str) {
        IOException e;
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse;
        FileNotFoundException e2;
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse2 = new BaiduPCSActionInfo.PCSFileInfoResponse();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            byte[] bArr = new byte[((int) file.length())];
            randomAccessFile.readFully(bArr);
            pCSFileInfoResponse = uploadPiece(bArr, str, str.substring(str.lastIndexOf("/") + 1, str.length()));
            try {
                randomAccessFile.close();
            } catch (FileNotFoundException e3) {
                e2 = e3;
                pCSFileInfoResponse.status.message = e2.getMessage();
                return pCSFileInfoResponse;
            } catch (IOException e4) {
                e = e4;
                pCSFileInfoResponse.status.message = e.getMessage();
                return pCSFileInfoResponse;
            }
        } catch (FileNotFoundException e5) {
            FileNotFoundException fileNotFoundException = e5;
            pCSFileInfoResponse = pCSFileInfoResponse2;
            e2 = fileNotFoundException;
        } catch (IOException e6) {
            IOException iOException = e6;
            pCSFileInfoResponse = pCSFileInfoResponse2;
            e = iOException;
            pCSFileInfoResponse.status.message = e.getMessage();
            return pCSFileInfoResponse;
        }
        return pCSFileInfoResponse;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.status.errorCode = r6.status.errorCode;
        r4.status.message = r6.status.message;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00db, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.baidu.pcs.BaiduPCSActionInfo.PCSFileInfoResponse uploadFileInMutiplePieces(java.io.File r23, com.baidu.pcs.BaiduPCSUploader.UploadTask r24) {
        /*
            r22 = this;
            com.baidu.pcs.BaiduPCSActionInfo$PCSFileInfoResponse r4 = new com.baidu.pcs.BaiduPCSActionInfo$PCSFileInfoResponse
            r4.<init>()
            if (r23 == 0) goto L_0x00ed
            if (r24 == 0) goto L_0x00ed
            long r14 = r23.length()
            r5 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.io.RandomAccessFile r16 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            java.lang.String r2 = "r"
            r0 = r16
            r1 = r23
            r0.<init>(r1, r2)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r8 = 0
            r2 = 0
            r0 = r24
            com.baidu.pcs.BaiduPCSStatusListener r6 = r0.listener     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            if (r6 == 0) goto L_0x0031
            r0 = r24
            com.baidu.pcs.BaiduPCSStatusListener r6 = r0.listener     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r12 = 0
            r6.onProgress(r12, r14)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
        L_0x0031:
            r10 = 102400(0x19000, float:1.43493E-40)
            r6 = 1
        L_0x0035:
            long r12 = (long) r10     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r18 = 1024(0x400, double:5.06E-321)
            long r12 = r12 * r18
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 < 0) goto L_0x0056
            byte[] r6 = new byte[r10]     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r12 = r8
        L_0x0041:
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 < 0) goto L_0x005b
            r2 = r5
        L_0x0046:
            r16.close()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            if (r2 != 0) goto L_0x00ed
            r0 = r24
            java.lang.String r2 = r0.target     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r0 = r22
            com.baidu.pcs.BaiduPCSActionInfo$PCSFileInfoResponse r2 = r0.createSuperFile(r11, r2)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
        L_0x0055:
            return r2
        L_0x0056:
            int r6 = r6 + 1
            int r10 = r6 * 1024
            goto L_0x0035
        L_0x005b:
            long r8 = (long) r10     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            long r8 = r8 + r12
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f3
            long r8 = r14 - r12
            int r7 = (int) r8     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r9 = r7
        L_0x0065:
            if (r9 >= r10) goto L_0x00f0
            byte[] r6 = new byte[r9]     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r8 = r6
        L_0x006a:
            r0 = r16
            r0.seek(r12)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r0 = r16
            r0.read(r8)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r6 = 0
            java.lang.String r7 = "upload.tmp"
            r0 = r22
            com.baidu.pcs.BaiduPCSActionInfo$PCSFileInfoResponse r6 = r0.uploadPiece(r8, r6, r7)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            if (r6 == 0) goto L_0x00cb
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r7 = r6.status     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            int r7 = r7.errorCode     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            if (r7 != 0) goto L_0x00cb
            com.baidu.pcs.BaiduPCSActionInfo$PCSCommonFileInfo r6 = r6.commonFileInfo     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            java.lang.String r6 = r6.blockList     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r11.add(r6)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r0 = r24
            com.baidu.pcs.BaiduPCSStatusListener r6 = r0.listener     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            if (r6 == 0) goto L_0x00de
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            long r18 = r6 - r2
            r0 = r24
            com.baidu.pcs.BaiduPCSStatusListener r0 = r0.listener     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r17 = r0
            long r20 = r17.progressInterval()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            int r17 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r17 < 0) goto L_0x00ae
            r0 = r24
            com.baidu.pcs.BaiduPCSStatusListener r2 = r0.listener     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r2.onProgress(r12, r14)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r2 = r6
        L_0x00ae:
            r0 = r24
            com.baidu.pcs.BaiduPCSStatusListener r6 = r0.listener     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            boolean r6 = r6.toContinue()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            if (r6 != 0) goto L_0x00de
            r2 = 1
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r3 = r4.status     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            java.lang.String r5 = "User stopped uploading"
            r3.message = r5     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            goto L_0x0046
        L_0x00c0:
            r2 = move-exception
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r3 = r4.status
            java.lang.String r2 = r2.getMessage()
            r3.message = r2
            r2 = r4
            goto L_0x0055
        L_0x00cb:
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r2 = r4.status     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r3 = r6.status     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            int r3 = r3.errorCode     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r2.errorCode = r3     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r2 = r4.status     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r3 = r6.status     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            java.lang.String r3 = r3.message     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r2.message = r3     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00e4 }
            r2 = 1
            goto L_0x0046
        L_0x00de:
            long r6 = (long) r9
            long r6 = r6 + r12
            r12 = r6
            r6 = r8
            goto L_0x0041
        L_0x00e4:
            r2 = move-exception
            com.baidu.pcs.BaiduPCSActionInfo$PCSSimplefiedResponse r3 = r4.status
            java.lang.String r2 = r2.getMessage()
            r3.message = r2
        L_0x00ed:
            r2 = r4
            goto L_0x0055
        L_0x00f0:
            r8 = r6
            goto L_0x006a
        L_0x00f3:
            r9 = r10
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.pcs.BaiduPCSUploader.uploadFileInMutiplePieces(java.io.File, com.baidu.pcs.BaiduPCSUploader$UploadTask):com.baidu.pcs.BaiduPCSActionInfo$PCSFileInfoResponse");
    }

    private BaiduPCSActionInfo.PCSFileInfoResponse uploadPiece(byte[] bArr, String str, String str2) {
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse = new BaiduPCSActionInfo.PCSFileInfoResponse();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method_Upload));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        if (str == null || str.length() <= 0) {
            arrayList.add(new BasicNameValuePair("type", Value_TmpFile));
        } else {
            arrayList.add(new BasicNameValuePair("path", str));
        }
        String str3 = "https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList);
        if (str3 == null || str3.length() <= 0) {
            return pCSFileInfoResponse;
        }
        HttpPost httpPost = new HttpPost(str3);
        MultipartEntity multipartEntity = new MultipartEntity();
        multipartEntity.addPart("uploadedfile", new ByteArrayBody(bArr, str2));
        httpPost.setEntity(multipartEntity);
        BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(httpPost);
        if (sendHttpRequest == null) {
            return pCSFileInfoResponse;
        }
        pCSFileInfoResponse.status.message = sendHttpRequest.message;
        if (sendHttpRequest.response != null) {
            return parseFileInfo(sendHttpRequest.response);
        }
        return pCSFileInfoResponse;
    }

    private BaiduPCSActionInfo.PCSFileInfoResponse createSuperFile(List<String> list, String str) {
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse = new BaiduPCSActionInfo.PCSFileInfoResponse();
        if (list != null && list.size() > 0 && str != null && str.length() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("method", Value_Method_CreateSuperFile));
            arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
            arrayList.add(new BasicNameValuePair("path", str));
            String str2 = "https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList);
            ArrayList arrayList2 = new ArrayList();
            if (list != null) {
                JSONArray jSONArray = new JSONArray(list);
                HashMap hashMap = new HashMap();
                hashMap.put(Key_BlockList, jSONArray);
                arrayList2.add(new BasicNameValuePair("param", new JSONObject(hashMap).toString()));
            }
            HttpPost httpPost = new HttpPost(str2);
            try {
                httpPost.setEntity(new UrlEncodedFormEntity(arrayList2, "utf-8"));
                for (int i = 0; i < 6; i++) {
                    BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(httpPost);
                    if (sendHttpRequest != null) {
                        pCSFileInfoResponse.status.message = sendHttpRequest.message;
                        pCSFileInfoResponse = parseFileInfo(sendHttpRequest.response);
                        if (pCSFileInfoResponse != null && pCSFileInfoResponse.status.errorCode == 0) {
                            break;
                        }
                        try {
                            Thread.sleep((long) ((i + 1) * 1000));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (UnsupportedEncodingException e2) {
                pCSFileInfoResponse.status.message = e2.getMessage();
            }
        }
        return pCSFileInfoResponse;
    }

    private class UploadTask {
        public BaiduPCSStatusListener listener;
        public String source;
        public String target;

        private UploadTask() {
            this.source = null;
            this.target = null;
            this.listener = null;
        }

        /* synthetic */ UploadTask(BaiduPCSUploader baiduPCSUploader, UploadTask uploadTask) {
            this();
        }
    }
}
