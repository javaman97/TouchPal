package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.CustomSkinItem */
public class CustomSkinItem extends LinearLayout {

    /* renamed from: a */
    private LinearLayout f13409a;

    public CustomSkinItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.custom_skin_setting_item_margin);
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.bottomMargin = dimensionPixelSize;
        layoutParams.topMargin = dimensionPixelSize;
        setLayoutParams(layoutParams);
    }

    public void setTitleText(int i) {
        ((TextView) findViewById(R.id.custom_skin_setting_item)).setText(C1974m.m9063a(getContext(), i));
    }

    public void setContentCount(int i) {
        this.f13409a = (LinearLayout) findViewById(R.id.custom_skin_setting_content);
        this.f13409a.setWeightSum((float) i);
    }

    /* renamed from: a */
    public void mo9792a(View view) {
        this.f13409a = (LinearLayout) findViewById(R.id.custom_skin_setting_content);
        this.f13409a.addView(view);
    }
}
