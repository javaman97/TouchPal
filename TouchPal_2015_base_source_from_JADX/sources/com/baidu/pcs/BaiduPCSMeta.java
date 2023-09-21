package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

class BaiduPCSMeta extends BaiduPCSActionBase {
    private static final String Value_Method = "meta";

    BaiduPCSMeta() {
    }

    public BaiduPCSActionInfo.PCSMetaResponse meta(String str) {
        BaiduPCSActionInfo.PCSMetaResponse pCSMetaResponse = new BaiduPCSActionInfo.PCSMetaResponse();
        if (str == null || str.length() <= 0) {
            return pCSMetaResponse;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        arrayList.add(new BasicNameValuePair("path", str));
        BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpGet("https://pcs.baidu.com/rest/2.0/pcs/file?" + buildParams(arrayList)));
        if (sendHttpRequest == null) {
            return pCSMetaResponse;
        }
        pCSMetaResponse.status.message = sendHttpRequest.message;
        if (sendHttpRequest.response == null) {
            return pCSMetaResponse;
        }
        try {
            return parseMetaResponse(new JSONObject(EntityUtils.toString(sendHttpRequest.response.getEntity())));
        } catch (ParseException e) {
            pCSMetaResponse.status.message = e.getMessage();
            return pCSMetaResponse;
        } catch (IOException e2) {
            pCSMetaResponse.status.message = e2.getMessage();
            return pCSMetaResponse;
        } catch (JSONException e3) {
            pCSMetaResponse.status.message = e3.getMessage();
            return pCSMetaResponse;
        }
    }
}
