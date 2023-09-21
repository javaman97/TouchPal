package com.weibo.net;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.weibo.net.g */
/* compiled from: Oauth2AccessToken */
public class C4044g extends C4053p {
    public C4044g(String str) {
        if (str != null && str.indexOf("{") >= 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                mo15002c(jSONObject.optString("access_token"));
                mo14996a((long) jSONObject.optInt(C4057s.f16527i));
                mo14997a(jSONObject.optString("refresh_token"));
            } catch (JSONException e) {
            }
        }
    }

    public C4044g(String str, String str2) {
        super(str, str2);
    }
}
