package com.cootek.smartinput5.urlnavigator;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.urlnavigator.FavoritesItemEditDialog;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.urlnavigator.l */
/* compiled from: FavoritesView */
class C3272l implements FavoritesItemEditDialog.C3259a {

    /* renamed from: a */
    final /* synthetic */ int f14384a;

    /* renamed from: b */
    final /* synthetic */ C3267g f14385b;

    C3272l(C3267g gVar, int i) {
        this.f14385b = gVar;
        this.f14384a = i;
    }

    /* renamed from: a */
    public boolean mo10429a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        Toast.makeText(context, R.string.url_navigator_information_not_filled, 1).show();
        return false;
    }

    /* renamed from: b */
    public void mo10430b(Context context, String str, String str2) {
        C3262c cVar = new C3262c();
        cVar.f14354c = C3262c.m14492b(str);
        cVar.f14355d = str2;
        this.f14385b.f14374e.mo10448a(this.f14384a, cVar);
        Engine.getInstance().getWidgetManager().mo9619Y();
    }

    /* renamed from: a */
    public void mo10428a(Context context) {
        Engine.Operation operation = new Engine.Operation();
        operation.keyName = "sk_url_navigator";
        if (Engine.isInitialized()) {
            Engine.getInstance().setPreloadedOperation(operation);
        }
    }
}
