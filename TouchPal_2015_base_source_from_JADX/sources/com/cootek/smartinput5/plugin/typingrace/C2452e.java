package com.cootek.smartinput5.plugin.typingrace;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.e */
/* compiled from: Guide */
class C2452e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Guide f10708a;

    C2452e(Guide guide) {
        this.f10708a = guide;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C1974m.m9063a((Context) this.f10708a, (int) R.string.url_home_page)));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f10708a.startActivity(intent);
    }
}
