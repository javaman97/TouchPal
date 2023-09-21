package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.a */
/* compiled from: AdsPanelItem */
public class C1932a extends C1950r {
    public C1932a(Context context, String str) {
        super(context, str);
    }

    public C1932a(Context context, String str, String str2) {
        super(context, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7113a(Context context) {
        View a = super.mo7113a(context);
        if (a != null) {
            RelativeLayout relativeLayout = (RelativeLayout) a.findViewById(R.id.icon_panel);
            relativeLayout.measure(0, 0);
            if (relativeLayout.getMeasuredWidth() > 0 && relativeLayout.getMeasuredHeight() > 0) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                ImageView imageView = new ImageView(context);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                imageView.setImageResource(R.drawable.ads_tag);
                relativeLayout.addView(imageView, layoutParams);
            }
        }
        return a;
    }

    /* renamed from: a */
    public ImageView mo7114a() {
        return this.f6630j;
    }
}
