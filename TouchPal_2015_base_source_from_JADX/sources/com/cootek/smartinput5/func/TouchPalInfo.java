package com.cootek.smartinput5.func;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import org.json.JSONException;
import org.json.JSONObject;

public class TouchPalInfo {
    private Context mContext;

    public TouchPalInfo(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getLocaleString() {
        return this.mContext.getResources().getConfiguration().locale.toString();
    }

    public PackageInfo getPackageInfo(String str) {
        return C1584bI.m7123a(this.mContext, str);
    }

    public String getVersionName() {
        return C1584bI.m7123a(this.mContext, this.mContext.getPackageName()).versionName;
    }

    public int getVersionCode() {
        return C1584bI.m7123a(this.mContext, this.mContext.getPackageName()).versionCode;
    }

    public boolean isSystemApp(String str) {
        return C1584bI.m7147b(this.mContext, str);
    }

    public int getAppVersion() {
        return 0;
    }

    public String getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("DENSITY_LOW", 120);
            jSONObject.put("DENSITY_MEDIUM", Settings.KEY_SPEED_TOTAL_KEY_TIMES);
            jSONObject.put("DENSITY_HIGH", Settings.NEW_LOG_LAST_CHECK_TIMESTAMP);
            jSONObject.put("DENSITY_XHIGH", Settings.CLIPBOARD_NOTIFICATION_SHOWN);
            jSONObject.put("DENSITY_DEFAULT", Settings.KEY_SPEED_TOTAL_KEY_TIMES);
            jSONObject.put("widthPixels", displayMetrics.widthPixels);
            jSONObject.put("heightPixels", displayMetrics.heightPixels);
            jSONObject.put("density", (double) displayMetrics.density);
            jSONObject.put("densityDpi", displayMetrics.densityDpi);
            jSONObject.put("scaledDensity", (double) displayMetrics.scaledDensity);
            jSONObject.put("xdpi", (double) displayMetrics.xdpi);
            jSONObject.put("ydpi", (double) displayMetrics.ydpi);
            jSONObject.put("scaledDensity", (double) displayMetrics.scaledDensity);
            jSONObject.put("scaledDensity", (double) displayMetrics.scaledDensity);
        } catch (JSONException e) {
        }
        return jSONObject.toString();
    }

    public String getDeviceInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ID", Build.ID);
            jSONObject.put("DISPLAY", Build.DISPLAY);
            jSONObject.put("PRODUCT", Build.PRODUCT);
            jSONObject.put("DEVICE", Build.DEVICE);
            jSONObject.put("BOARD", Build.BOARD);
            jSONObject.put("CPU_ABI", Build.CPU_ABI);
            jSONObject.put("MANUFACTURER", Build.MANUFACTURER);
            jSONObject.put("BRAND", Build.BRAND);
            jSONObject.put("MODEL", Build.MODEL);
            addInfo8_(jSONObject);
            addInfo9_(jSONObject);
            jSONObject.put("TYPE", Build.TYPE);
            jSONObject.put("USER", Build.USER);
            jSONObject.put("HOST", Build.HOST);
            jSONObject.put(C1246d.f3952x, Build.TIME);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("SDK_INT", Build.VERSION.SDK_INT);
            jSONObject2.put("INCREMENTAL", Build.VERSION.INCREMENTAL);
            jSONObject2.put("RELEASE", Build.VERSION.RELEASE);
            jSONObject2.put("CODENAME", Build.VERSION.CODENAME);
            jSONObject.put("VERSION", jSONObject2);
        } catch (JSONException e) {
        }
        return jSONObject.toString();
    }

    @TargetApi(8)
    private void addInfo8_(JSONObject jSONObject) throws JSONException {
        if (Build.VERSION.SDK_INT >= 8) {
            jSONObject.put("CPU_ABI2", Build.CPU_ABI2);
            jSONObject.put("BOOTLOADER", Build.BOOTLOADER);
            jSONObject.put("RADIO", Build.RADIO);
            jSONObject.put("HARDWARE", Build.HARDWARE);
        }
    }

    @TargetApi(9)
    private void addInfo9_(JSONObject jSONObject) throws JSONException {
        if (Build.VERSION.SDK_INT >= 9) {
            jSONObject.put("SERIAL", Build.SERIAL);
        }
    }

    public String getNativeString(String str) {
        return C1368X.m6320c().mo5838k().mo6241b("@string/" + str);
    }

    public boolean isInteVersion() {
        return C1593bR.m7162a().f5075a;
    }

    public boolean isIntePackage() {
        return C1593bR.m7162a().f5077c;
    }

    public String getToken() {
        return C2188Q.m9853a().mo7683c();
    }

    public String getRecommendUserID() {
        return C2209a.m9962c(this.mContext);
    }

    public String getImeVersionOld() {
        return C2225al.m10063c(this.mContext);
    }

    public String getIdentifier() {
        return C2225al.m10078l(this.mContext);
    }

    public String getAppId(Context context) {
        return C2225al.m10065d(this.mContext);
    }

    public String getChannelCode() {
        return C1132b.m5654a(this.mContext).mo4414h();
    }

    public String getMncNetwork() {
        return C2225al.m10069f(this.mContext);
    }

    public String getMncSim() {
        return C2225al.m10071g(this.mContext);
    }

    public int getPhoneType() {
        return C2225al.m10075i(this.mContext);
    }

    public String getIMEI() {
        return C2225al.m10076j(this.mContext);
    }

    public String getMacAddress() {
        return C2225al.m10077k(this.mContext);
    }

    public String getISOCountryCode() {
        return C2225al.m10073h(this.mContext);
    }

    public boolean isWifi() {
        return C2188Q.m9853a().mo7685e();
    }

    public boolean hasNetwork() {
        return C2188Q.m9853a().mo7686f();
    }

    public String getNetworkType() {
        return C2188Q.m9853a().mo7688h();
    }

    public String getSkinPackTargetVersion() {
        return this.mContext.getString(R.string.SKIN_PACK_EXPECTED_VERSION);
    }
}
