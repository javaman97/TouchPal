package com.cootek.smartinput5;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.asset.C1446c;
import com.cootek.smartinput5.func.asset.C1452i;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.asset.DummyNotificationActionReceiver;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.C2725bE;
import com.emoji.keyboard.touchpal.R;

public class GateActivity extends C1976b {

    /* renamed from: a */
    private static final int f2708a = 1;

    /* renamed from: b */
    private boolean f2709b = false;

    /* renamed from: c */
    private Handler f2710c = new C1130b(this);

    /* renamed from: d */
    private boolean f2711d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public View f2712e;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2709b = true;
        C1460o.m6799b().mo6125a((C1452i.C1453a) new C1174c(this));
        C1460o.m6799b().mo6124a((Context) this, true);
        if (C1460o.m6799b().mo6129c()) {
            m5245c();
            DummyNotificationActionReceiver.showInitializingNotification(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5242a() {
        C1584bI.m7156i(this);
        C1460o.m6799b().mo6128c(this);
        this.f2711d = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5243b() {
        if (!isFinishing()) {
            DummyNotificationActionReceiver.showExtracFailedNotification(this);
            C1446c.m6746a(this, new C1241d(this), new C1249e(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f2709b = true;
        if (this.f2711d) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f2709b = false;
    }

    /* renamed from: c */
    private void m5245c() {
        setContentView(R.layout.guide_extract);
        Drawable drawable = getResources().getDrawable(R.drawable.extrat_progress);
        C2725bE bEVar = new C2725bE();
        bEVar.mo8998b(getResources().getColor(R.color.skin_page_title_text_color), getResources().getColor(R.color.guide_privacy_link_color));
        Drawable a = bEVar.mo8995a(drawable);
        this.f2712e = findViewById(R.id.extract_img);
        this.f2712e.setBackgroundDrawable(a);
        this.f2710c.sendEmptyMessageDelayed(1, 100);
    }

    /* renamed from: d */
    private boolean m5248d() {
        return this.f2709b;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m5249e() {
        if (m5248d()) {
            Intent intent = new Intent();
            intent.setClass(this, Guide.class);
            intent.addFlags(Engine.EXCEPTION_ERROR);
            try {
                startActivity(intent);
            } catch (ActivityNotFoundException e) {
            }
        }
        finish();
    }
}
