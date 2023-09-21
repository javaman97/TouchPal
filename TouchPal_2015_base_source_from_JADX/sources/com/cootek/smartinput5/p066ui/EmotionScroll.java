package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.EmotionScroll */
public class EmotionScroll extends LeftScrollView {

    /* renamed from: c */
    private C2811cf f11208c;

    /* renamed from: d */
    private SoftKeyboardView f11209d;

    public EmotionScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.bg_emo_scroll_ctrl, C2726bF.EMO_KB_BG));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.key_padding_inner_bottom);
        setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
    }

    /* renamed from: a */
    public void mo8526a() {
        if (this.f11209d == null) {
            this.f11209d = (SoftKeyboardView) findViewById(R.id.emotion_scroll);
        }
        if (this.f11208c == null) {
            this.f11208c = new C2811cf("emotions");
            this.f11209d.setKeyboard(this.f11208c);
        } else {
            this.f11208c.mo9020e();
            this.f11209d.mo8734c();
        }
        this.f11209d.setMinimumHeight((int) (((double) this.f11209d.getKeyboard().mo9193o()) * Engine.getInstance().getWidgetManager().mo9630ad().mo9251i()));
        this.f11209d.setMinimumWidth((int) (((double) this.f11209d.getKeyboard().mo9194p()) * Engine.getInstance().getWidgetManager().mo9630ad().mo9250h()));
        requestLayout();
    }

    /* renamed from: b */
    public void mo8527b() {
        this.f11209d = null;
        this.f11208c = null;
    }
}
