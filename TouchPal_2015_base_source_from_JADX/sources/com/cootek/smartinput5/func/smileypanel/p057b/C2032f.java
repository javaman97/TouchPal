package com.cootek.smartinput5.func.smileypanel.p057b;

import android.content.Intent;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p066ui.settings.TouchPalFAQActivity;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.f */
/* compiled from: EmojiDisplayAdapter */
class C2032f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2030d f7061a;

    C2032f(C2030d dVar) {
        this.f7061a = dVar;
    }

    public void onClick(View view) {
        C1056a.m5588a().mo4264a(C1056a.f2956Q, this.f7061a.f7057a);
        this.f7061a.m9357f();
        this.f7061a.m9356e();
        Intent intent = new Intent();
        intent.setClass(this.f7061a.f7057a, TouchPalFAQActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f7061a.f7057a.startActivity(intent);
    }
}
