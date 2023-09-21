package com.facebook.ads;

import android.content.Context;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.C3509x;

public class AdChoicesView extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f14559a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3509x f14560b;

    /* renamed from: c */
    private final DisplayMetrics f14561c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f14562d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f14563e;

    public AdChoicesView(Context context, C3509x xVar) {
        super(context);
        this.f14559a = context;
        this.f14560b = xVar;
        this.f14561c = this.f14559a.getResources().getDisplayMetrics();
        C3509x.C3510a m = this.f14560b.mo10875m();
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(((float) (m.mo10879b() + 4)) * this.f14561c.density), Math.round(((float) (m.mo10880c() + 2)) * this.f14561c.density)));
        setOnTouchListener(new C3339c(this));
        ImageView imageView = new ImageView(this.f14559a);
        addView(imageView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(((float) m.mo10879b()) * this.f14561c.density), Math.round(((float) m.mo10880c()) * this.f14561c.density));
        layoutParams.addRule(9);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(Math.round(4.0f * this.f14561c.density), Math.round(this.f14561c.density * 2.0f), Math.round(this.f14561c.density * 2.0f), Math.round(this.f14561c.density * 2.0f));
        imageView.setLayoutParams(layoutParams);
        C3509x.m15264a(m, imageView);
        this.f14563e = new TextView(this.f14559a);
        addView(this.f14563e);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(0, -2);
        layoutParams2.addRule(11, imageView.getId());
        layoutParams2.addRule(15, -1);
        this.f14563e.setLayoutParams(layoutParams2);
        this.f14563e.setSingleLine();
        this.f14563e.setText("AdChoices");
        this.f14563e.setTextSize(10.0f);
        this.f14563e.setTextColor(-4341303);
        this.f14562d = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14643a() {
        Paint paint = new Paint();
        paint.setTextSize(this.f14563e.getTextSize());
        int round = Math.round(paint.measureText("AdChoices") + (4.0f * this.f14561c.density));
        int width = getWidth();
        int i = round + width;
        this.f14562d = true;
        C3340d dVar = new C3340d(this, width, i);
        dVar.setAnimationListener(new C3341e(this, i, width));
        dVar.setDuration(300);
        dVar.setFillAfter(true);
        startAnimation(dVar);
    }
}
