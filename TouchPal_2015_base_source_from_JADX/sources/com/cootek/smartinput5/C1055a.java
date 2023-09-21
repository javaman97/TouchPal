package com.cootek.smartinput5;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.a */
/* compiled from: FakeKeyboard */
public class C1055a {

    /* renamed from: a */
    private Context f2935a;

    /* renamed from: b */
    private View f2936b = null;

    /* renamed from: c */
    private Animation f2937c = null;

    /* renamed from: d */
    private View f2938d;

    /* renamed from: e */
    private View f2939e;

    public C1055a(Context context) {
        this.f2935a = context;
    }

    /* renamed from: a */
    public View mo4261a() {
        View view = this.f2938d;
        if (view != null) {
            return view;
        }
        LinearLayout linearLayout = new LinearLayout(this.f2935a);
        View d = m5584d();
        linearLayout.addView(d);
        this.f2936b = d;
        this.f2938d = linearLayout;
        return linearLayout;
    }

    /* renamed from: d */
    private View m5584d() {
        View inflate = ((LayoutInflater) this.f2935a.getSystemService("layout_inflater")).inflate(R.layout.guide_extract, (ViewGroup) null);
        this.f2939e = inflate.findViewById(R.id.extract_img);
        inflate.setBackgroundResource(R.color.create_keyboard_view_background);
        Resources resources = this.f2935a.getResources();
        int i = resources.getDisplayMetrics().widthPixels;
        int i2 = resources.getDisplayMetrics().heightPixels;
        inflate.setLayoutParams(new LinearLayout.LayoutParams(i, resources.getDimensionPixelSize(R.dimen.fast_candidate_height) + ((int) resources.getFraction(R.fraction.keyboard_height, i2, i2))));
        return inflate;
    }

    /* renamed from: b */
    public void mo4262b() {
        if (this.f2939e != null) {
            this.f2939e.startAnimation(AnimationUtils.loadAnimation(this.f2935a, R.anim.extract_progress));
        }
    }

    /* renamed from: c */
    public void mo4263c() {
        if (this.f2937c != null) {
            this.f2937c = null;
        }
        if (this.f2936b != null) {
            this.f2936b = null;
        }
    }
}
