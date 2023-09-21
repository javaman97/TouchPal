package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.CustomSkinBtn */
public class CustomSkinBtn extends LinearLayout {

    /* renamed from: a */
    private static float f13408a = 1.0f;

    public CustomSkinBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, context.getResources().getDimensionPixelSize(R.dimen.custom_skin_btn_height), f13408a);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.custom_skin_btn_margin);
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.weight = f13408a;
        setLayoutParams(layoutParams);
    }

    public void setText(int i) {
        ((TextView) findViewById(R.id.custom_skin_btn_text)).setText(C1974m.m9063a(getContext(), i));
    }

    public void setIcon(int i) {
        ((ImageView) findViewById(R.id.custom_skin_btn_image)).setImageResource(i);
    }
}
