package com.cootek.smartinput5.func.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.share.d */
/* compiled from: ShareDialogActivity */
class C1982d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Context f6761a;

    /* renamed from: b */
    final /* synthetic */ String f6762b;

    /* renamed from: c */
    final /* synthetic */ boolean f6763c;

    /* renamed from: d */
    final /* synthetic */ String f6764d;

    /* renamed from: e */
    final /* synthetic */ Intent f6765e;

    /* renamed from: f */
    final /* synthetic */ String f6766f;

    /* renamed from: g */
    final /* synthetic */ String f6767g;

    /* renamed from: h */
    final /* synthetic */ String f6768h;

    /* renamed from: i */
    final /* synthetic */ ShareDialogActivity f6769i;

    C1982d(ShareDialogActivity shareDialogActivity, Context context, String str, boolean z, String str2, Intent intent, String str3, String str4, String str5) {
        this.f6769i = shareDialogActivity;
        this.f6761a = context;
        this.f6762b = str;
        this.f6763c = z;
        this.f6764d = str2;
        this.f6765e = intent;
        this.f6766f = str3;
        this.f6767g = str4;
        this.f6768h = str5;
    }

    public void onClick(View view) {
        C1246d.m6010a(this.f6761a).mo4591a(C1246d.f3837cA, this.f6762b, "/UI/SHARE/");
        if (!this.f6763c) {
            if (!TextUtils.isEmpty(this.f6764d)) {
                this.f6765e.setPackage(this.f6764d);
            }
            if (!TextUtils.isEmpty(this.f6766f) || !TextUtils.isEmpty(this.f6767g)) {
                this.f6765e.putExtra("android.intent.extra.TEXT", this.f6769i.mo7264a(this.f6766f, this.f6767g));
            }
            ShareDialogActivity.m9100a(this.f6761a, this.f6765e);
        } else if (!TextUtils.isEmpty(this.f6768h)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f6768h));
            intent.setFlags(Engine.EXCEPTION_ERROR);
            C1584bI.m7130a(this.f6761a, intent, 0);
        }
        this.f6769i.finish();
    }
}
