package com.cootek.smartinput5.func.yahoosearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.yahoosearch.p063ui.C2153h;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.interfaces.IImageViewer;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;
import com.yahoo.mobile.client.share.search.settings.SearchSDKSettings;
import com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.Factory;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.q */
/* compiled from: YahooSearch */
public class C2137q {

    /* renamed from: a */
    private static String f9087a = "NyGY7j3e";

    /* renamed from: b */
    private static C2137q f9088b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f9089c;

    /* renamed from: d */
    private boolean f9090d = false;

    /* renamed from: e */
    private String f9091e = "";

    /* renamed from: f */
    private Handler f9092f = new Handler();

    /* renamed from: g */
    private ArrayList<Activity> f9093g = new ArrayList<>();

    /* renamed from: a */
    public static C2137q m9700a(Context context) {
        if (f9088b == null) {
            f9088b = new C2137q(context);
        }
        return f9088b;
    }

    public C2137q(Context context) {
        this.f9089c = context;
    }

    /* renamed from: a */
    public void mo7536a() {
        if (!this.f9090d) {
            this.f9090d = true;
            SearchSDKSettings.initializeSearchSDKSettings(new SearchSDKSettings.Builder(f9087a).setDeveloperMode(false));
            Factory factory = (Factory) SearchSDKSettings.getFactory();
            factory.mo15901b(new C2133m());
            factory.mo15900a((IImageViewer) new C2134n());
        }
    }

    /* renamed from: a */
    public void mo7538a(String str) {
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
            String editorPackageName = Engine.getInstance().getEditor().getEditorPackageName();
            if (!this.f9089c.getPackageName().equalsIgnoreCase(editorPackageName)) {
                this.f9091e = editorPackageName;
            }
        }
        SearchToLinkActivity.IntentBuilder intentBuilder = new SearchToLinkActivity.IntentBuilder();
        intentBuilder.addWebVertical();
        intentBuilder.addImageVertical();
        intentBuilder.addVideoVertical();
        intentBuilder.addVertical(C2153h.class.getName(), new Bundle());
        intentBuilder.setCustomHeader(R.layout.search_result_top_bar);
        intentBuilder.setCustomFooter(R.layout.search_result_bottom_bar);
        if (!TextUtils.isEmpty(str)) {
            intentBuilder.setQueryString(str);
        }
        Intent buildIntent = intentBuilder.buildIntent(this.f9089c);
        buildIntent.setClass(this.f9089c, YahooSearchActivity.class);
        buildIntent.putExtra(SearchActivity.QUERY_STRING, str);
        buildIntent.addFlags(Engine.EXCEPTION_ERROR);
        this.f9089c.startActivity(buildIntent);
        C1246d.m6010a(this.f9089c).mo4594a(C1246d.f3924dr, true, C1246d.f3923dq);
    }

    /* renamed from: b */
    public void mo7540b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Settings.getInstance().setStringSetting(Settings.SAVED_SEARCH_RESULT, str);
            Settings.getInstance().writeBack();
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.SETTING_KEY, Settings.SAVED_SEARCH_RESULT);
            bundle.putInt(IPCManager.SETTING_TYPE, 2);
            bundle.putString(IPCManager.SETTING_VALUE, str);
            bundle.putBoolean(IPCManager.SETTING_FIRE_CHANGED, true);
            Message obtain = Message.obtain((Handler) null, 3);
            if (C1368X.m6324d()) {
                obtain.setData(bundle);
                try {
                    C1368X.m6320c().mo5839l().sendMessage(obtain);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            this.f9092f.postDelayed(new C2138r(this), 500);
        }
    }

    /* renamed from: b */
    public String mo7539b() {
        String editorPackageName;
        if (Engine.isInitialized() && m9701d() && (editorPackageName = Engine.getInstance().getEditor().getEditorPackageName()) != null && editorPackageName.equalsIgnoreCase(this.f9091e)) {
            return Settings.getInstance().getStringSetting(Settings.SAVED_SEARCH_RESULT);
        }
        return null;
    }

    /* renamed from: a */
    public void mo7537a(Activity activity) {
        if (!this.f9093g.contains(activity)) {
            this.f9093g.add(activity);
        }
    }

    /* renamed from: c */
    public void mo7541c() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f9093g.size()) {
                if (this.f9093g.get(i2) != null && !this.f9093g.get(i2).isFinishing()) {
                    this.f9093g.get(i2).finish();
                }
                i = i2 + 1;
            } else {
                this.f9093g.clear();
                return;
            }
        }
    }

    /* renamed from: d */
    public static boolean m9701d() {
        String country;
        if (Build.VERSION.SDK_INT >= 15 && Settings.getInstance().getBoolSetting(Settings.SHOW_YAHOO_SEARCH) && !C1368X.m6320c().mo5842o().mo5955l() && (country = Locale.getDefault().getCountry()) != null && country.equalsIgnoreCase("US")) {
            return true;
        }
        return false;
    }
}
