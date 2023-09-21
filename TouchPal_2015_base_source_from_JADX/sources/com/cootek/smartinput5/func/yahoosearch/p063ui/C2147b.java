package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.text.TextUtils;
import android.view.View;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.b */
/* compiled from: SearchBar */
class C2147b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchBar f9127a;

    C2147b(SearchBar searchBar) {
        this.f9127a = searchBar;
    }

    public void onClick(View view) {
        String obj = this.f9127a.getSearchEditText().getText().toString();
        if (!TextUtils.isEmpty(obj)) {
            this.f9127a.f9115f.submitQueryString(obj);
        }
    }
}
