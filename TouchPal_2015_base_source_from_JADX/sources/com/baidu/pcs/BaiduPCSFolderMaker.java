package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

class BaiduPCSFolderMaker extends BaiduPCSActionBase {
    private static final String Value_Method = "mkdir";

    BaiduPCSFolderMaker() {
    }

    public BaiduPCSActionInfo.PCSFileInfoResponse makeDir(String str) {
        BaiduPCSActionInfo.PCSFileInfoResponse pCSFileInfoResponse = new BaiduPCSActionInfo.PCSFileInfoResponse();
        if (str != null && str.length() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("method", Value_Method));
            arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
            arrayList.add(new BasicNameValuePair("path", str));
            BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpPost("https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList)));
            if (sendHttpRequest != null) {
                pCSFileInfoResponse.status.message = sendHttpRequest.message;
                if (!(sendHttpRequest.response == null || (pCSFileInfoResponse = parseFileInfo(sendHttpRequest.response)) == null)) {
                    pCSFileInfoResponse.commonFileInfo.isDir = true;
                    pCSFileInfoResponse.commonFileInfo.size = 0;
                }
            }
        }
        return pCSFileInfoResponse;
    }
}
