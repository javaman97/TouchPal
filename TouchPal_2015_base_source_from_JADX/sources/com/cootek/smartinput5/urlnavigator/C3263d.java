package com.cootek.smartinput5.urlnavigator;

import android.view.View;
import android.widget.EditText;

/* renamed from: com.cootek.smartinput5.urlnavigator.d */
/* compiled from: FavoritesItemEditDialog */
class C3263d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EditText f14356a;

    /* renamed from: b */
    final /* synthetic */ EditText f14357b;

    /* renamed from: c */
    final /* synthetic */ FavoritesItemEditDialog f14358c;

    C3263d(FavoritesItemEditDialog favoritesItemEditDialog, EditText editText, EditText editText2) {
        this.f14358c = favoritesItemEditDialog;
        this.f14356a = editText;
        this.f14357b = editText2;
    }

    public void onClick(View view) {
        String obj = this.f14356a.getText().toString();
        String obj2 = this.f14357b.getText().toString();
        if ((FavoritesItemEditDialog.f14341c == null || FavoritesItemEditDialog.f14341c.mo10429a(this.f14358c, obj, obj2)) && FavoritesItemEditDialog.f14341c != null) {
            FavoritesItemEditDialog.f14341c.mo10430b(this.f14358c, this.f14356a.getText().toString(), this.f14357b.getText().toString());
            this.f14358c.m14476b();
        }
    }
}
