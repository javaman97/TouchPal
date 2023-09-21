package com.yahoo.mobile.client.share.search.p099ui.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.interfaces.ISearchController;
import com.yahoo.mobile.client.share.search.interfaces.ISearchViewHolder;
import com.yahoo.mobile.client.share.search.util.C4247l;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.SearchViewHolder */
public class SearchViewHolder extends LinearLayout implements ISearchViewHolder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ISearchController f17270a;

    /* renamed from: b */
    private EditText f17271b;

    /* renamed from: c */
    private View f17272c;

    /* renamed from: d */
    private View f17273d;

    /* renamed from: e */
    private View f17274e;

    public SearchViewHolder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchViewHolder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f17271b = (EditText) findViewById(C4073a.C4081h.clearable_edit);
        this.f17272c = findViewById(C4073a.C4081h.closeButton);
        this.f17273d = findViewById(C4073a.C4081h.voice_search_clickable);
        this.f17274e = findViewById(C4073a.C4081h.clear_button_clickable);
        TextView textView = (TextView) findViewById(C4073a.C4081h.voice_search);
        TextView textView2 = (TextView) findViewById(C4073a.C4081h.clear_button);
        Typeface a = C4247l.m17792a(getContext());
        textView.setTypeface(a);
        textView.setText(getResources().getString(C4073a.C4086m.yssdk_mic_icon));
        textView2.setTypeface(a);
        textView2.setText(getResources().getString(C4073a.C4086m.yssdk_clear_indicator));
        this.f17272c.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (SearchViewHolder.this.f17270a != null) {
                    SearchViewHolder.this.f17270a.goBack();
                }
            }
        });
    }

    public void setSearchController(ISearchController iSearchController) {
        this.f17270a = iSearchController;
        this.f17271b.setHint(getResources().getString(this.f17270a.isVoiceSearchAvailable() ? C4073a.C4086m.yssdk_search_or_speak : C4073a.C4086m.yssdk_search));
    }

    public EditText getSearchEditText() {
        return this.f17271b;
    }

    public View getVoiceSearchButton() {
        return this.f17273d;
    }

    public View getClearTextButton() {
        return this.f17274e;
    }

    public int getSearchViewHeightOffset() {
        return getResources().getDimensionPixelOffset(C4073a.C4079f.yssdk_searchview_holder_height_offset);
    }

    public void onVoiceSearchAvailabilityChanged(boolean z) {
        this.f17271b.setHint(getResources().getString(z ? C4073a.C4086m.yssdk_search_or_speak : C4073a.C4086m.yssdk_search));
    }

    public void onFocusChanged(EditText editText, boolean z) {
    }
}
