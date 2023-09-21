package com.cootek.smartinput5.func.nativeads;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.nativeads.y */
/* compiled from: NativeAdsStrategy */
public class C1902y {

    /* renamed from: a */
    public static final String f6428a = "_default";

    /* renamed from: i */
    private static final String f6429i = "source";

    /* renamed from: j */
    private static final String f6430j = "show";

    /* renamed from: k */
    private static final String f6431k = "ads_count";

    /* renamed from: l */
    private static final String f6432l = "display_index";

    /* renamed from: m */
    private static final String f6433m = "guidepoint_id";

    /* renamed from: n */
    private static final String f6434n = "interval";

    /* renamed from: o */
    private static final String f6435o = "default_interval";

    /* renamed from: b */
    public String f6436b;

    /* renamed from: c */
    public boolean f6437c = false;

    /* renamed from: d */
    public int f6438d = 1;

    /* renamed from: e */
    public int f6439e = -1;

    /* renamed from: f */
    public String f6440f;

    /* renamed from: g */
    public int f6441g = 12;

    /* renamed from: h */
    public int f6442h = 12;

    public C1902y(JSONObject jSONObject) throws JSONException {
        this.f6436b = jSONObject.getString(f6429i);
        if (jSONObject.has("show")) {
            this.f6437c = jSONObject.getBoolean("show");
        }
        if (jSONObject.has(f6431k)) {
            this.f6438d = jSONObject.getInt(f6431k);
        }
        if (jSONObject.has(f6432l)) {
            this.f6439e = jSONObject.getInt(f6432l);
        }
        if (jSONObject.has(f6433m)) {
            this.f6440f = jSONObject.getString(f6433m);
        }
        if (jSONObject.has(f6434n)) {
            this.f6441g = jSONObject.getInt(f6434n);
        }
        if (jSONObject.has(f6435o)) {
            this.f6442h = jSONObject.getInt(f6435o);
        }
    }

    /* renamed from: a */
    public boolean mo7047a() {
        if (!this.f6437c || TextUtils.isEmpty(this.f6436b)) {
            return false;
        }
        long longSetting = Settings.getInstance().getLongSetting(Settings.ADVERTISE_UPDATE_TIME, 33, this.f6436b, (Config) null);
        long j = ((long) (this.f6441g * 3600000)) + longSetting;
        if (longSetting <= 0 || j <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo7048b() {
        if (!this.f6437c || TextUtils.isEmpty(this.f6436b)) {
            return false;
        }
        long longSetting = Settings.getInstance().getLongSetting(Settings.ADVERTISE_UPDATE_TIME, 33, this.f6436b + f6428a, (Config) null);
        long j = (((long) this.f6442h) * 3600000) + longSetting;
        if (longSetting <= 0 || j <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo7049c() {
        if (!TextUtils.isEmpty(this.f6436b) && C1901x.m8736b(this.f6436b)) {
            return true;
        }
        return false;
    }
}
