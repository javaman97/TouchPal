package com.cootek.smartinput5.presentations;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.contactscanner.ContactScannerActivity;
import com.cootek.smartinput5.func.mainentrance.MainEntranceActivity;
import com.cootek.smartinput5.func.p053c.C1630a;
import com.cootek.smartinput5.p066ui.settings.CloudBackupGuide;
import com.cootek.smartinput5.p066ui.settings.OnlineShopActivity;
import com.cootek.smartinput5.p066ui.settings.TouchPalCloudActivity;

public class PresentationLaunchLocalPageActivity extends Activity {

    /* renamed from: a */
    public static final String f10767a = "com.cootek.smartinputv5.HOTWORD";

    /* renamed from: b */
    public static final String f10768b = "com.cootek.smartinputv5.BACKUP";

    /* renamed from: c */
    public static final String f10769c = "com.cootek.smartinputv5.IMPORT_CONTACTS";

    /* renamed from: d */
    public static final String f10770d = "com.cootek.smartinputv5.CLOUD_BACKUP";

    /* renamed from: e */
    public static final String f10771e = "com.cootek.smartinputv5.CHECK_ANONYMOUS_CALL_LOG";

    /* renamed from: f */
    public static final String f10772f = "com.cootek.smartinputv5.LEARN_TEXT";

    /* renamed from: g */
    public static final String f10773g = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.LOCAL_PAGE_TOUCHPAL_CLOUD";

    /* renamed from: h */
    public static final String f10774h = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.LOCAL_PAGE_PURCHASE_VIP";

    /* renamed from: i */
    public static final String f10775i = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.LOCAL_PAGE_SHOP";

    /* renamed from: j */
    public static final String f10776j = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.LOCAL_PAGE_SHOP_SKIN";

    /* renamed from: k */
    public static final String f10777k = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.LOCAL_PAGE_SHOP_LANGUAGE";

    /* renamed from: l */
    public static final String f10778l = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.LOCAL_PAGE_SHOP_CELL";

    /* renamed from: m */
    public static final String f10779m = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.LOCAL_PAGE_SHOP_MORE";

    /* renamed from: n */
    public static final String f10780n = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.LOCAL_PAGE_TRENDS_RECOMMENDER";

    /* renamed from: o */
    public static final String f10781o = "package_name";

    /* renamed from: p */
    public static final String f10782p = "tag";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        String action = getIntent().getAction();
        if (f10767a.equalsIgnoreCase(action)) {
            Intent intent = new Intent(this, MainEntranceActivity.class);
            intent.setAction(C1630a.f5269q);
            startActivity(intent);
        } else if (f10768b.equalsIgnoreCase(action) || f10769c.equalsIgnoreCase(action) || f10772f.equalsIgnoreCase(action) || f10773g.equalsIgnoreCase(action)) {
            startActivity(new Intent(this, TouchPalCloudActivity.class));
        } else if (f10770d.equalsIgnoreCase(action)) {
            startActivity(new Intent(this, CloudBackupGuide.class));
        } else if (f10771e.equalsIgnoreCase(action)) {
            startActivity(new Intent(this, ContactScannerActivity.class));
        } else if (f10774h.equalsIgnoreCase(action)) {
            C1617br.m7367a().mo6327a((Context) this);
        } else if (f10775i.equalsIgnoreCase(action)) {
            Settings.getInstance().writeBack();
            m11194a(1, OnlineShopActivity.f13567n);
        } else if (f10776j.equalsIgnoreCase(action)) {
            m11194a(1, OnlineShopActivity.f13568o);
        } else if (f10777k.equalsIgnoreCase(action)) {
            m11194a(2, OnlineShopActivity.f13569p);
        } else if (f10778l.equalsIgnoreCase(action)) {
            m11194a(3, OnlineShopActivity.f13570q);
        } else if (f10779m.equalsIgnoreCase(action)) {
            m11194a(4, OnlineShopActivity.f13571r);
        } else if (f10780n.equalsIgnoreCase(action)) {
            Intent intent2 = new Intent(this, MainEntranceActivity.class);
            intent2.putExtra("tabNumber", 2);
            intent2.setFlags(Engine.EXCEPTION_ERROR);
            startActivity(intent2);
        }
        finish();
    }

    /* renamed from: a */
    private void m11194a(int i, String str) {
        String str2;
        String str3 = null;
        if (C1368X.m6324d()) {
            Uri data = getIntent().getData();
            if (data != null) {
                str2 = data.getQueryParameter(f10781o);
                str3 = data.getQueryParameter("tag");
            } else {
                str2 = null;
            }
            C1368X.m6320c().mo5825K().launchShop(i, str, str2, str3);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }
}
