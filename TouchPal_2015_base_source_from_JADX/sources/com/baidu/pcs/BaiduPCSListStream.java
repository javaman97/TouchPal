package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicNameValuePair;

class BaiduPCSListStream extends BaiduPCSActionBase {
    private static final String Value_Limit = "limit";
    private static final String Value_Method = "list";
    private static final String Value_Start = "start";
    private static final String Value_Type = "type";

    BaiduPCSListStream() {
    }

    public BaiduPCSActionInfo.PCSListInfoResponse listStream(String str, int i, int i2) {
        BaiduPCSActionInfo.PCSListInfoResponse pCSListInfoResponse = new BaiduPCSActionInfo.PCSListInfoResponse();
        if (str == null || str.length() <= 0) {
            return pCSListInfoResponse;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        arrayList.add(new BasicNameValuePair("type", str));
        if (i > 0) {
            arrayList.add(new BasicNameValuePair(Value_Start, new StringBuilder(String.valueOf(i)).toString()));
        }
        if (i2 >= 0) {
            arrayList.add(new BasicNameValuePair(Value_Limit, new StringBuilder(String.valueOf(i2)).toString()));
        }
        BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpGet("https://pcs.baidu.com/rest/2.0/pcs/stream?" + buildParams(arrayList)));
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
