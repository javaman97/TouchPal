package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

public class BaiduCloudMatch extends BaiduPCSActionBase {
    private static final int File_Mini_Length = 262144;
    private static final String Value_Method = "rapidupload";
    private static char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public /* bridge */ /* synthetic */ String getAccessToken() {
        return super.getAccessToken();
    }

    public /* bridge */ /* synthetic */ void setAccessToken(String str) {
        super.setAccessToken(str);
    }

    public BaiduPCSActionInfo.PCSFileInfoResponse cloudMatch(String str, String str2) {
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse = new BaiduPCSActionInfo.PCSFileInfoResponse();
        if (str == null || str.length() <= 0) {
            return pCSFileInfoResponse;
        }
        File file = new File(str);
        if (!file.exists() || file.length() < 262144) {
            pCSFileInfoResponse.status.message = "File does not exsit or File size less than 256K.";
            return pCSFileInfoResponse;
        }
        long length = file.length();
        if (str == null || str.length() <= 0) {
            return pCSFileInfoResponse;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        arrayList.add(new BasicNameValuePair("path", str2));
        arrayList.add(new BasicNameValuePair("content-length", new StringBuilder(String.valueOf(length)).toString()));
        String fileMD5 = getFileMD5(str);
        String fileCorrectMD5 = getFileCorrectMD5(str);
        arrayList.add(new BasicNameValuePair("content-md5", fileMD5));
        arrayList.add(new BasicNameValuePair("slice-md5", fileCorrectMD5));
        BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpPost("https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList)));
        if (sendHttpRequest == null) {
            return pCSFileInfoResponse;
        }
        pCSFileInfoResponse.status.message = sendHttpRequest.message;
        if (sendHttpRequest.response != null) {
            return parseFileInfo(sendHttpRequest.response);
        }
        return pCSFileInfoResponse;
    }

    private static String getFileMD5(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[262144];
            MessageDigest instance = MessageDigest.getInstance("MD5");
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    return toHexString(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private static String getFileCorrectMD5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[262144];
            int read = fileInputStream.read(bArr);
            fileInputStream.close();
            if (read <= 0) {
                return null;
            }
            instance.update(bArr);
            return toHexString(instance.digest());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    private static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(hexChar[(bArr[i] & 240) >>> 4]);
            sb.append(hexChar[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
