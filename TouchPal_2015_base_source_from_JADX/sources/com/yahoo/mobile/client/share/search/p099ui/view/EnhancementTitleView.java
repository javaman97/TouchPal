package com.yahoo.mobile.client.share.search.p099ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.yahoo.mobile.client.p094a.p095a.C4073a;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.EnhancementTitleView */
public class EnhancementTitleView extends LinearLayout {

    /* renamed from: a */
    private LinearLayout f17267a;

    /* renamed from: b */
    private LinearLayout f17268b;

    public EnhancementTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EnhancementTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f17267a = (LinearLayout) findViewById(C4073a.C4081h.is_powered_by_google);
        this.f17268b = (LinearLayout) findViewById(C4073a.C4081h.is_powered_by_flickr);
    }

    /* renamed from: a */
    public final void mo15826a(String str) {
        if (!str.equals("")) {
            setVisibility(0);
            if (str.equals("Google")) {
                this.f17267a.setVisibility(0);
                this.f17268b.setVisibility(8);
            } else if (str.equals("Flickr")) {
                this.f17268b.setVisibility(0);
                this.f17267a.setVisibility(8);
            }
        }
    }
}
