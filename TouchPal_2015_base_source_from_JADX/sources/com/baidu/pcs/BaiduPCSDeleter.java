package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

class BaiduPCSDeleter extends BaiduPCSActionBase {
    private static final String Value_Method = "delete";

    BaiduPCSDeleter() {
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse deleteFile(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return deleteFiles(arrayList);
    }

    public BaiduPCSActionInfo.PCSSimplefiedResponse deleteFiles(List<String> list) {
        BaiduPCSActionInfo.PCSSimplefiedResponse pCSSimplefiedResponse = new BaiduPCSActionInfo.PCSSimplefiedResponse();
        if (list == null || list.size() <= 0) {
            return pCSSimplefiedResponse;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        List<NameValuePair> buildBodyParamsWithList = buildBodyParamsWithList(list, "param");
        HttpPost httpPost = new HttpPost("https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList));
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(buildBodyParamsWithList, this.Encoding_UTF8));
            BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(httpPost);
            if (sendHttpRequest == null) {
                return pCSSimplefiedResponse;
            }
            pCSSimplefiedResponse.message = sendHttpRequest.message;
            return sendHttpRequest.response != null ? parseSimplefiedResponse(sendHttpRequest.response) : pCSSimplefiedResponse;
        } catch (UnsupportedEncodingException e) {
            pCSSimplefiedResponse.message = e.getMessage();
            return pCSSimplefiedResponse;
        }
    }
}
