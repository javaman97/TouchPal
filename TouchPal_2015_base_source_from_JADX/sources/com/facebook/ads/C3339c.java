package com.facebook.ads;

import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.c */
class C3339c implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ AdChoicesView f14623a;

    C3339c(AdChoicesView adChoicesView) {
        this.f14623a = adChoicesView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (this.f14623a.f14562d) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(this.f14623a.f14560b.mo10876n()));
            this.f14623a.f14559a.startActivity(intent);
        } else {
            this.f14623a.m14643a();
        }
        return true;
    }
}
