package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.HorizontalArrowPair */
public class HorizontalArrowPair extends KeyboardMaskArrowPair {

    /* renamed from: p */
    private boolean f13451p;

    public HorizontalArrowPair(Context context, boolean z) {
        super(context);
        this.f13451p = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9859a() {
        Resources resources = this.f13499o.getResources();
        this.f13493i = resources.getDrawable(R.drawable.keyboard_customize_left_arrow);
        this.f13494j = resources.getDrawable(R.drawable.keyboard_customize_right_arrow);
        this.f13495k = resources.getDrawable(R.drawable.keyboard_customize_left_arrow_white);
        this.f13496l = resources.getDrawable(R.drawable.keyboard_customize_right_arrow_white);
    }

    public int getArrowPairHeight() {
        return this.f13493i.getIntrinsicHeight();
    }

    public int getArrowPairWidth() {
        return this.f13493i.getIntrinsicWidth() * 3;
    }

    /* renamed from: b */
    public boolean mo9860b() {
        return this.f13451p;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = (this.f13498n == 1 || this.f13498n == 3) ? this.f13495k : this.f13493i;
        Drawable drawable2 = (this.f13498n == 2 || this.f13498n == 3) ? this.f13496l : this.f13494j;
        if (!(this.f13497m == 3 || this.f13497m == 1)) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
        }
        if (!(this.f13497m == 3 || this.f13497m == 2)) {
            drawable2.setBounds(drawable2.getIntrinsicWidth() * 2, 0, drawable2.getIntrinsicWidth() * 3, drawable2.getIntrinsicHeight());
            drawable2.draw(canvas);
        }
        super.onDraw(canvas);
    }
}
