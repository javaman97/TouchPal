package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.interfaces.ISearchController;
import com.yahoo.mobile.client.share.search.interfaces.ISearchViewHolder;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.SearchBar */
public class SearchBar extends RelativeLayout implements ISearchViewHolder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f9110a;

    /* renamed from: b */
    private View f9111b;

    /* renamed from: c */
    private View f9112c;

    /* renamed from: d */
    private ImageView f9113d;

    /* renamed from: e */
    private EditText f9114e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ISearchController f9115f;

    public SearchBar(Context context) {
        super(context);
        m9714a(context);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9714a(context);
    }

    /* renamed from: a */
    private void m9714a(Context context) {
        this.f9110a = context;
    }

    public View getClearTextButton() {
        return null;
    }

    public EditText getSearchEditText() {
        if (this.f9114e == null) {
            this.f9114e = (EditText) findViewById(R.id.search_text);
        }
        return this.f9114e;
    }

    public int getSearchViewHeightOffset() {
        return 0;
    }

    public View getVoiceSearchButton() {
        return null;
    }

    public void onFocusChanged(EditText editText, boolean z) {
    }

    public void onVoiceSearchAvailabilityChanged(boolean z) {
    }

    public void setSearchController(ISearchController iSearchController) {
        this.f9115f = iSearchController;
        if (this.f9113d == null) {
            this.f9113d = (ImageView) findViewById(R.id.search_bar_search);
        }
        this.f9113d.setOnClickListener(new C2147b(this));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f9112c == null) {
            this.f9111b = findViewById(R.id.close);
            this.f9111b.setOnClickListener(new C2148c(this));
        }
    }
}
