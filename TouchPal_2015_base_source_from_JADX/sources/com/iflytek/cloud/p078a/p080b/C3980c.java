package com.iflytek.cloud.p078a.p080b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.iflytek.cloud.p078a.p082d.C3993c;
import com.iflytek.cloud.p084b.C4000a;
import com.iflytek.speech.UtilityConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iflytek.cloud.a.b.c */
public class C3980c {

    /* renamed from: a */
    JSONObject f16302a = new JSONObject();

    /* renamed from: b */
    long f16303b = 0;

    /* renamed from: c */
    long f16304c = 0;

    /* renamed from: a */
    public synchronized String mo14677a() {
        return this.f16302a.toString();
    }

    /* renamed from: a */
    public void mo14678a(C4000a aVar) {
        this.f16304c = System.currentTimeMillis();
        this.f16303b = SystemClock.elapsedRealtime();
        mo14681a("app_start", C3993c.m17041a(this.f16304c), false);
        String d = aVar.mo14719d(UtilityConfig.KEY_CALLER_APPID);
        if (!TextUtils.isEmpty(d)) {
            mo14681a("app_caller_appid", d, false);
        }
    }

    /* renamed from: a */
    public synchronized void mo14679a(String str) {
        mo14680a(str, SystemClock.elapsedRealtime() - this.f16303b, false);
    }

    /* renamed from: a */
    public synchronized void mo14680a(String str, long j, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (!z) {
                try {
                    this.f16302a.put(str, j);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                JSONArray optJSONArray = this.f16302a.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    this.f16302a.put(str, optJSONArray);
                }
                if (optJSONArray != null) {
                    optJSONArray.put(j);
                }
            }
        }
        return;
    }

    /* renamed from: a */
    public synchronized void mo14681a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!z) {
                try {
                    this.f16302a.put(str, str2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                JSONArray optJSONArray = this.f16302a.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    this.f16302a.put(str, optJSONArray);
                }
                if (optJSONArray != null) {
                    optJSONArray.put(str2);
                }
            }
        }
        return;
    }
}
