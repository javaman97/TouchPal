package com.baidu.pcs;

import com.baidu.pcs.BaiduPCSActionBase;
import com.baidu.pcs.BaiduPCSActionInfo;
import com.cootek.smartinput5.net.cmd.C2250J;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

class BaiduPCSQuotaInfo extends BaiduPCSActionBase {
    private static final String Key_Total = "quota";
    private static final String Key_Used = "used";
    private static final String Value_Method = "info";
    private static final String mbCommand = "quota";

    BaiduPCSQuotaInfo() {
    }

    /* access modifiers changed from: package-private */
    public BaiduPCSActionInfo.PCSQuotaResponse quotaInfo() {
        return quotaInfo((String) null);
    }

    /* access modifiers changed from: package-private */
    public BaiduPCSActionInfo.PCSQuotaResponse quotaInfo(String str) {
        BaiduPCSActionInfo.PCSQuotaResponse pCSQuotaResponse = new BaiduPCSActionInfo.PCSQuotaResponse();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("method", Value_Method));
        arrayList.add(new BasicNameValuePair("access_token", getAccessToken()));
        if (str != null && str.length() > 0) {
            arrayList.add(new BasicNameValuePair("path", str));
        }
        String str2 = "https://pcs.baidu.com/rest/2.0/pcs/quota?" + buildParams(arrayList);
        if (str2 == null || str2.length() <= 0) {
            pCSQuotaResponse.status.message = "Invalid Url";
        } else {
            BaiduPCSActionBase.PCSRawHTTPResponse sendHttpRequest = sendHttpRequest(new HttpGet(str2));
            if (sendHttpRequest != null) {
                pCSQuotaResponse.status.message = sendHttpRequest.message;
                if (sendHttpRequest.response != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(EntityUtils.toString(sendHttpRequest.response.getEntity()));
                        if (jSONObject != null) {
                            if (jSONObject.has(C2250J.f9627c)) {
                                pCSQuotaResponse.status.errorCode = jSONObject.getInt(C2250J.f9627c);
                                if (jSONObject.has("error_msg")) {
                                    pCSQuotaResponse.status.message = jSONObject.getString("error_msg");
                                }
                            } else if (jSONObject.has("quota")) {
                                pCSQuotaResponse.total = jSONObject.getLong("quota");
                                pCSQuotaResponse.used = jSONObject.getLong(Key_Used);
                                pCSQuotaResponse.status.errorCode = 0;
                            }
                        }
                    } catch (ParseException e) {
                        pCSQuotaResponse.status.message = e.getMessage();
                    } catch (IOException e2) {
                        pCSQuotaResponse.status.message = e2.getMessage();
                    } catch (JSONException e3) {
                        pCSQuotaResponse.status.message = e3.getMessage();
                    }
                }
            }
        }
        return pCSQuotaResponse;
    }
}
