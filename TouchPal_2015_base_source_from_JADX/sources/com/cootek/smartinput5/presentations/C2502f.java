package com.cootek.smartinput5.presentations;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.cootek.presentation.sdk.IActionDriver;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.sdk.utils.ActionDriverHelper;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.presentations.f */
/* compiled from: ActionDriver */
public class C2502f implements IActionDriver {

    /* renamed from: a */
    private Context f10807a;

    public C2502f(Context context) {
        this.f10807a = context;
    }

    public void download(int i, String str, String str2, String str3, boolean z) {
        C2361q.m10797b().mo8002a(str, str2, str3, z);
    }

    public boolean openUrl(String str, String str2, boolean z) {
        Intent intent = new Intent(this.f10807a, PresentationWebviewActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putExtra(C2515q.f10829b, str);
        intent.putExtra(C2515q.f10834g, str2);
        intent.putExtra(C2515q.f10832e, z);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        try {
            this.f10807a.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }

    public void autoInstall(String str) {
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        ActionDriverHelper.installApk(this.f10807a, str);
        PresentationManager.installStarted(str);
    }

    public void close(String str) {
        if (C2515q.m11248a()) {
            C2515q.m11251b().mo8317c(str);
            C2515q.m11251b().mo8323f(str);
        }
        PresentationManager.closed(str);
    }

    public void showActionConfirmDialog(String str, String str2) {
        Intent intent = new Intent(this.f10807a, ActionConfirmActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putExtra(C2515q.f10828a, str);
        intent.putExtra(C2515q.f10833f, str2);
        this.f10807a.startActivity(intent);
    }

    public String getNonWifiMessage() {
        return C1974m.m9063a(this.f10807a, (int) R.string.presentation_download_non_wifi_reminder_msg);
    }

    public String getDownloadConfirmMessage() {
        return C1974m.m9063a(this.f10807a, (int) R.string.presentation_download_confirm_msg);
    }

    public void contentUpdated() {
    }

    public boolean changeBoolSetting(String str, boolean z, boolean z2) {
        if (Settings.isInitialized()) {
            return Settings.getInstance().changeSetting(str, Boolean.valueOf(z), z2);
        }
        return false;
    }

    public boolean changeIntSetting(String str, int i, boolean z) {
        if (Settings.isInitialized()) {
            return Settings.getInstance().changeSetting(str, Integer.valueOf(i), z);
        }
        return false;
    }

    public boolean changeLongSetting(String str, long j, boolean z) {
        if (Settings.isInitialized()) {
            return Settings.getInstance().changeSetting(str, Long.valueOf(j), z);
        }
        return false;
    }

    public boolean changeStringSetting(String str, String str2, boolean z) {
        if (Settings.isInitialized()) {
            return Settings.getInstance().changeSetting(str, str2, z);
        }
        return false;
    }

    public void saveTypeUsage(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str3);
            Iterator<String> keys = jSONObject.keys();
            while (keys != null && keys.hasNext()) {
                String valueOf = String.valueOf(keys.next());
                hashMap.put(valueOf, jSONObject.get(valueOf));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C1246d.m6010a(this.f10807a).mo4592a(str, str2, (Map<String, Object>) hashMap);
    }

    public boolean launchApp(String str, String str2, String str3, String str4) {
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        return ActionDriverHelper.launchApp(this.f10807a, str, str2, str3, str4);
    }
}
