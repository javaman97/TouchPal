package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.VerticalArrowPair */
public class VerticalArrowPair extends KeyboardMaskArrowPair {
    public VerticalArrowPair(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9859a() {
        Resources resources = this.f13499o.getResources();
        this.f13493i = resources.getDrawable(R.drawable.keyboard_customize_up_arrow);
        this.f13494j = resources.getDrawable(R.drawable.keyboard_customize_down_arrow);
        this.f13495k = resources.getDrawable(R.drawable.keyboard_customize_up_arrow_white);
        this.f13496l = resources.getDrawable(R.drawable.keyboard_customize_down_arrow_white);
    }

    public int getArrowPairHeight() {
        return this.f13493i.getIntrinsicHeight() * 3;
    }

    public int getArrowPairWidth() {
        return this.f13493i.getIntrinsicWidth();
    }

    /* renamed from: c */
    public boolean mo9876c() {
        return true;
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
            drawable2.setBounds(0, drawable2.getIntrinsicHeight() * 2, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight() * 3);
            drawable2.draw(canvas);
        }
        super.onDraw(canvas);
    }
}
