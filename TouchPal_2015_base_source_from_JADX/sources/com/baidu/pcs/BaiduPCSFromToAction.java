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

class BaiduPCSFromToAction extends BaiduPCSActionBase {
    private String mbAction = null;

    BaiduPCSFromToAction(String str) {
        this.mbAction = str;
    }

    /* access modifiers changed from: protected */
    public final BaiduPCSActionInfo.PCSFileFromToResponse execute(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        BaiduPCSActionInfo.PCSFileFromToInfo pCSFileFromToInfo = new BaiduPCSActionInfo.PCSFileFromToInfo();
        pCSFileFromToInfo.from = str;
        pCSFileFromToInfo.f2340to = str2;
        arrayList.add(pCSFileFromToInfo);
        return execute(arrayList);
    }

    /* access modifiers changed from: protected */
    public final BaiduPCSActionInfo.PCSFileFromToResponse execute(List<BaiduPCSActionInfo.PCSFileFromToInfo> list) {
        BaiduPCSActionInfo.PCSFileFromToResponse pCSFileFromToResponse = new BaiduPCSActionInfo.PCSFileFromToResponse();
        if (list == null || list.size() <= 0) {
            return pCSFileFromToResponse;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", this.mbAction));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        List<NameValuePair> buildBodyParamsWithFromTo = buildBodyParamsWithFromTo(list);
        HttpPost httpPost = new HttpPost("https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList));
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(buildBodyParamsWithFromTo, "utf-8"));
            BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(httpPost);
            if (sendHttpRequest == null) {
                return pCSFileFromToResponse;
            }
            pCSFileFromToResponse.status.message = sendHttpRequest.message;
            return sendHttpRequest.response != null ? parseFileFromToExtraInfo(sendHttpRequest.response) : pCSFileFromToResponse;
        } catch (UnsupportedEncodingException e) {
            pCSFileFromToResponse.status.message = e.getMessage();
            return pCSFileFromToResponse;
        }
    }
}
