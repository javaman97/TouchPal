package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.util.ArrayList;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicNameValuePair;

class BaiduPCSDiffer extends BaiduPCSActionBase {
    private static final String Key_Cursor = "cursor";
    private static final String Value_Method = "diff";
    private static final int maxRecord = 2000;

    BaiduPCSDiffer() {
    }

    public BaiduPCSActionInfo.PCSDiffResponse diff(String str) {
        BaiduPCSActionInfo.PCSDiffResponse pCSDiffResponse = new BaiduPCSActionInfo.PCSDiffResponse();
        boolean z = false;
        do {
            BaiduPCSActionInfo.PCSDiffResponse update = getUpdate(str);
            if (update == null || update.status.errorCode != 0) {
                break;
            }
            z = true;
            pCSDiffResponse.status = update.status;
            pCSDiffResponse.hasMore = update.hasMore;
            pCSDiffResponse.isReseted = update.isReseted;
            pCSDiffResponse.cursor = update.cursor;
            str = update.cursor;
            if (pCSDiffResponse.entries == null) {
                pCSDiffResponse.entries = new ArrayList();
            }
            pCSDiffResponse.entries.addAll(update.entries);
            if (!update.hasMore) {
                break;
            }
        } while (pCSDiffResponse.entries.size() > 2000);
        if (z) {
            pCSDiffResponse.status.errorCode = 0;
            pCSDiffResponse.status.message = null;
        }
        return pCSDiffResponse;
    }

    public BaiduPCSActionInfo.PCSDiffResponse getUpdate(String str) {
        BaiduPCSActionInfo.PCSDiffResponse pCSDiffResponse = new BaiduPCSActionInfo.PCSDiffResponse();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        if (str == null) {
            str = "null";
        }
        arrayList.add(new BasicNameValuePair(Key_Cursor, str));
        BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpGet("https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList)));
        if (sendHttpRequest == null) {
            return pCSDiffResponse;
        }
        pCSDiffResponse.status.message = sendHttpRequest.message;
        if (sendHttpRequest.response != null) {
            return parseDiffResponse(sendHttpRequest.response);
        }
        return pCSDiffResponse;
    }
}
