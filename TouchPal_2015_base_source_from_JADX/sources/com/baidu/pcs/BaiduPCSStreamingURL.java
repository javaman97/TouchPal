package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionInfo;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

public class BaiduPCSStreamingURL extends BaiduPCSActionBase {
    private static final String Display_Type = "display";
    private static final String Key_Type = "type";
    private static final String Value_Method_Streaming = "streaming";

    public /* bridge */ /* synthetic */ String getAccessToken() {
        return super.getAccessToken();
    }

    public /* bridge */ /* synthetic */ void setAccessToken(String str) {
        super.setAccessToken(str);
    }

    public BaiduPCSActionInfo.PCSStreamingURLResponse getStreamingURL(String str, String str2) {
        BaiduPCSActionInfo.PCSStreamingURLResponse pCSStreamingURLResponse = null;
        if (str != null && str.length() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("method", Value_Method_Streaming));
            arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
            arrayList.add(new BasicNameValuePair("path", str));
            arrayList.add(new BasicNameValuePair("type", str2));
            arrayList.add(new BasicNameValuePair("display", "1"));
            String str3 = "https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList);
            pCSStreamingURLResponse = new BaiduPCSActionInfo.PCSStreamingURLResponse();
            pCSStreamingURLResponse.status.errorCode = 0;
            pCSStreamingURLResponse.url = str3;
        }
        if (pCSStreamingURLResponse == null) {
            return new BaiduPCSActionInfo.PCSStreamingURLResponse();
        }
        return pCSStreamingURLResponse;
    }
}
