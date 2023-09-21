package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicNameValuePair;

class BaiduPCSSearch extends BaiduPCSActionBase {
    private static final String Key_KeyWord = "wd";
    private static final String Key_Recursive = "re";
    private static final String Value_Method = "search";

    BaiduPCSSearch() {
    }

    /* access modifiers changed from: protected */
    public BaiduPCSActionInfo.PCSListInfoResponse search(String str, String str2, boolean z) {
        BaiduPCSActionInfo.PCSListInfoResponse pCSListInfoResponse = new BaiduPCSActionInfo.PCSListInfoResponse();
        if (str != null && str.length() > 0 && str2 != null && str2.length() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("method", "search"));
            arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
            arrayList.add(new BasicNameValuePair(Key_KeyWord, str2));
            arrayList.add(new BasicNameValuePair(Key_Recursive, z ? "1" : "0"));
            BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpGet("https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList)));
            if (sendHttpRequest != null) {
                pCSListInfoResponse.status.message = sendHttpRequest.message;
                if (sendHttpRequest.response != null) {
                    return parseListResponse(sendHttpRequest.response);
                }
            }
        }
        return pCSListInfoResponse;
    }
}
