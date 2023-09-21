package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicNameValuePair;

class BaiduPCSList extends BaiduPCSActionBase {
    private static final String Key_By = "by";
    private static final String Key_Order = "order";
    private static final String Value_Method = "list";

    BaiduPCSList() {
    }

    public BaiduPCSActionInfo.PCSListInfoResponse list(String str, String str2, String str3) {
        BaiduPCSActionInfo.PCSListInfoResponse pCSListInfoResponse = new BaiduPCSActionInfo.PCSListInfoResponse();
        if (str == null || str.length() <= 0) {
            return pCSListInfoResponse;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        arrayList.add(new BasicNameValuePair("path", str));
        if (str2 != null && str2.length() > 0) {
            arrayList.add(new BasicNameValuePair(Key_By, str2));
        }
        if (str3 != null && str3.length() > 0) {
            arrayList.add(new BasicNameValuePair(Key_Order, str3));
        }
        BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpGet("https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList)));
        if (sendHttpRequest == null) {
            return pCSListInfoResponse;
        }
        pCSListInfoResponse.status.message = sendHttpRequest.message;
        if (sendHttpRequest.response != null) {
            return parseListResponse(sendHttpRequest.response);
        }
        return pCSListInfoResponse;
    }
}
