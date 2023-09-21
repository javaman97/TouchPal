package com.cootek.smartinput5.func.smileypanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class SmileyTopShadowView extends View {

    /* renamed from: a */
    private Context f6951a;

    public SmileyTopShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9259a(context);
    }

    public SmileyTopShadowView(Context context) {
        super(context);
        m9259a(context);
    }

    /* renamed from: a */
    private void m9259a(Context context) {
        this.f6951a = context;
    }

    public void setAlpha(int i) {
        getBackground().setAlpha(i);
    }
}
