package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.SymTypesScroll */
public class SymTypesScroll extends LeftScrollView {

    /* renamed from: c */
    private C2811cf f11640c;

    /* renamed from: d */
    private SoftKeyboardView f11641d;

    /* renamed from: e */
    private String f11642e;

    /* renamed from: f */
    private boolean f11643f = true;

    /* renamed from: g */
    private boolean f11644g = Engine.getInstance().getWidgetManager().mo9630ad().mo9260r();

    public SymTypesScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.bg_sym_types, C2726bF.EMO_KB_BG));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.key_padding_inner_bottom);
        setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
    }

    /* renamed from: a */
    public void mo8526a() {
        this.f11641d = (SoftKeyboardView) findViewById(R.id.emotion_scroll);
        if (this.f11643f || this.f11640c == null) {
            this.f11640c = new C2782cF(this, this.f11642e);
            this.f11643f = false;
        }
        this.f11641d.setKeyboard(this.f11640c);
        this.f11641d.setMinimumHeight((int) (((double) this.f11641d.getKeyboard().mo9193o()) * Engine.getInstance().getWidgetManager().mo9630ad().mo9251i()));
        this.f11641d.setMinimumWidth((int) (((double) this.f11641d.getKeyboard().mo9194p()) * Engine.getInstance().getWidgetManager().mo9630ad().mo9250h()));
        requestLayout();
        scrollTo(0, 0);
    }

    public void setXmlLayout(String str) {
        if (!TextUtils.equals(str, this.f11642e)) {
            this.f11642e = str;
            this.f11643f = true;
            return;
        }
        this.f11643f = false;
    }

    public boolean getZoomingStateRecord() {
        return this.f11644g;
    }

    public void setZoomingStateRecord(boolean z) {
        this.f11644g = z;
    }

    public void setScroll(SymTypeKey symTypeKey) {
        int measuredHeight = getMeasuredHeight();
        if (symTypeKey.f12454y + symTypeKey.height <= measuredHeight) {
            scrollTo(0, 0);
        } else {
            scrollTo(0, (symTypeKey.f12454y + symTypeKey.height) - measuredHeight);
        }
    }
}
