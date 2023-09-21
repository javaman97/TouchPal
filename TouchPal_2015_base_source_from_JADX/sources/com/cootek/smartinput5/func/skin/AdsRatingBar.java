package com.cootek.smartinput5.func.skin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.emoji.keyboard.touchpal.R;

public class AdsRatingBar extends RelativeLayout {

    /* renamed from: a */
    private static final int f6792a = 5;

    /* renamed from: b */
    private Context f6793b;

    /* renamed from: c */
    private Drawable f6794c;

    /* renamed from: d */
    private float f6795d;

    /* renamed from: e */
    private float f6796e;

    public AdsRatingBar(Context context) {
        super(context);
        m9135a(context);
    }

    public AdsRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9135a(context);
    }

    /* renamed from: a */
    private void m9135a(Context context) {
        this.f6793b = context;
        this.f6794c = this.f6793b.getResources().getDrawable(R.drawable.rating_star);
        this.f6795d = this.f6793b.getResources().getDimension(R.dimen.sponsor_rating_star_space);
        this.f6796e = (this.f6793b.getResources().getDimension(R.dimen.sponsor_ads_frame_height) - (this.f6793b.getResources().getDimension(R.dimen.sponsor_rating_padding) * 2.0f)) / 2.0f;
    }

    public void setRating(double d) {
        if (d <= 0.0d || d > 5.0d) {
            super.setVisibility(8);
            return;
        }
        super.removeAllViews();
        View view = new View(this.f6793b);
        view.setLayoutParams(new RelativeLayout.LayoutParams((int) ((((double) this.f6796e) * d) + (Math.ceil(d) * ((double) this.f6795d))), (int) this.f6796e));
        view.setBackgroundResource(R.color.sponsor_ads_star_color);
        super.addView(view);
        LinearLayout linearLayout = new LinearLayout(this.f6793b);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        for (int i = 0; i < 5; i++) {
            View view2 = new View(this.f6793b);
            view2.setLayoutParams(new LinearLayout.LayoutParams((int) this.f6795d, (int) this.f6796e));
            view2.setBackgroundColor(-1);
            View view3 = new View(this.f6793b);
            view3.setBackgroundDrawable(this.f6794c);
            view3.setLayoutParams(new LinearLayout.LayoutParams((int) this.f6796e, (int) this.f6796e));
            linearLayout.addView(view2);
            linearLayout.addView(view3);
        }
        super.addView(linearLayout);
    }
}
