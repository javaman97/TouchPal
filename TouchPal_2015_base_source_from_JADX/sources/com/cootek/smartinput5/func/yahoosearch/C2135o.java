package com.cootek.smartinput5.func.yahoosearch;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.func.yahoosearch.p063ui.SearchTabView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.o */
/* compiled from: SearchResultActivity */
public class C2135o extends C1976b {

    /* renamed from: d */
    protected static final int f9077d = 4;

    /* renamed from: e */
    protected static final String f9078e = "back";

    /* renamed from: f */
    protected static final String f9079f = "home";

    /* renamed from: g */
    protected static final String f9080g = "share";

    /* renamed from: h */
    protected static final String f9081h = "save";

    /* renamed from: i */
    protected static final int[] f9082i = {R.drawable.search_back, R.drawable.search_home, R.drawable.search_share, R.drawable.search_save};

    /* renamed from: j */
    protected static final Integer[] f9083j = {Integer.valueOf(R.string.search_back), Integer.valueOf(R.string.search_home), Integer.valueOf(R.string.search_share), Integer.valueOf(R.string.search_save)};

    /* renamed from: k */
    protected static final String[] f9084k = {f9078e, "home", f9080g, f9081h};

    /* renamed from: l */
    protected static final boolean[] f9085l = {true, true, true, false};

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7502a() {
        findViewById(R.id.close).setOnClickListener(new C2136p(this));
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.browser_button_bar);
        if (linearLayout != null) {
            for (int i = 0; i < 4; i++) {
                SearchTabView searchTabView = (SearchTabView) layoutInflater.inflate(R.layout.footer_tab, (ViewGroup) null);
                Drawable drawable = getResources().getDrawable(f9082i[i]);
                if (f9083j[i] != null) {
                    searchTabView.setTitle(C1974m.m9063a((Context) this, f9083j[i].intValue()));
                } else {
                    searchTabView.setTitle((String) null);
                }
                searchTabView.setIcon(drawable);
                searchTabView.setTag(f9084k[i]);
                searchTabView.mo7571a(f9085l[i]);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.search_tab_padding);
                layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                searchTabView.setLayoutParams(layoutParams);
                linearLayout.addView(searchTabView);
            }
        }
    }
}
