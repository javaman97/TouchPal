package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.func.TypingSpeedData;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.net.cmd.C2258O;
import com.iflytek.cloud.SpeechConstant;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.ui.settings.TypingSpeedHandler */
public class TypingSpeedHandler {
    private final String DATE = "date";

    /* renamed from: ID */
    private final String f13776ID = "id";
    private final String NAME = "name";
    private final String SPEED = SpeechConstant.SPEED;
    private final String TAG = "TypingSpeedHandler";
    private Context mContext;
    private TWebView mWebView;

    public TypingSpeedHandler(Context context, TWebView tWebView) {
        this.mContext = context;
        this.mWebView = tWebView;
    }

    public void feelTheSpeed(String str) {
        this.mContext.startActivity(TouchPalOption.m5436b(this.mContext, str));
    }

    public String getAverageSpeed(String str, String str2, int i) {
        try {
            int a = TypingSpeedData.m6256a(str2);
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 1; i2 <= 31; i2++) {
                TypingSpeedData.Meta a2 = ((TypingSpeedActivity) this.mContext).f13766d.mo5798a(str, a, i, i2);
                JSONObject jSONObject = new JSONObject();
                String str3 = "" + (i + 1) + "/" + i2;
                if (a2 != null) {
                    jSONObject.put("date", str3);
                    jSONObject.put(SpeechConstant.SPEED, TypingSpeedData.m6255a(a2.f4233a, a2.f4235c));
                } else {
                    jSONObject.put("date", str3);
                    jSONObject.put(SpeechConstant.SPEED, 0);
                }
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            C1017y.m5213a("TypingSpeedHandler", e.toString());
            return "";
        }
    }

    public String getLangs() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str : ((TypingSpeedActivity) this.mContext).f13767e) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("name", str);
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            C1017y.m5213a("TypingSpeedHandler", e.toString());
            return "";
        }
    }

    public void onProgressBegin() {
        this.mWebView.mo7699c();
    }

    public void onProgressEnd() {
        this.mWebView.mo7700d();
    }

    public String getServerAddress() {
        return C2225al.m10053a(this.mContext, C2258O.UPLOAD_TYPINGSPEED);
    }
}
