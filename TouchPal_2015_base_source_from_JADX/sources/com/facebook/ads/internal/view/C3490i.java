package com.facebook.ads.internal.view;

import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;

/* renamed from: com.facebook.ads.internal.view.i */
public class C3490i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f15107a = 200;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f15108b = SearchStatusData.RESPONSE_STATUS_SERVER_ERROR;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f15109c = 4000;

    /* renamed from: d */
    private final C3491a f15110d;

    /* renamed from: e */
    private final C3491a f15111e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f15112f;

    /* renamed from: com.facebook.ads.internal.view.i$a */
    private class C3491a implements Animation.AnimationListener {

        /* renamed from: b */
        private final View f15114b;

        /* renamed from: c */
        private boolean f15115c = false;

        /* renamed from: d */
        private Animation f15116d;

        /* renamed from: e */
        private Animation f15117e;

        public C3491a(View view) {
            this.f15114b = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15210a(Animation animation) {
            if (animation == this.f15116d) {
                this.f15114b.startAnimation(this.f15117e);
            } else if (animation == this.f15117e) {
                this.f15114b.startAnimation(this.f15116d);
            }
        }

        /* renamed from: a */
        public C3491a mo10833a(boolean z) {
            this.f15115c = z;
            return this;
        }

        /* renamed from: a */
        public void mo10834a() {
            this.f15116d = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, 0.0f, 0, (float) (0 - C3490i.this.f15107a));
            this.f15116d.setDuration((long) C3490i.this.f15108b);
            this.f15116d.setStartOffset((long) C3490i.this.f15109c);
            this.f15116d.setFillAfter(true);
            this.f15116d.setAnimationListener(this);
            this.f15117e = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, (float) C3490i.this.f15107a, 0, 0.0f);
            this.f15117e.setDuration((long) C3490i.this.f15108b);
            this.f15117e.setStartOffset((long) C3490i.this.f15109c);
            this.f15117e.setFillAfter(true);
            this.f15117e.setAnimationListener(this);
            this.f15114b.startAnimation(this.f15115c ? this.f15117e : this.f15116d);
        }

        public void onAnimationEnd(Animation animation) {
            if (!C3490i.this.f15112f) {
                m15210a(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            if (C3490i.this.f15112f) {
                new Handler().postDelayed(new C3492j(this, animation), (long) C3490i.this.f15109c);
            }
        }
    }

    public C3490i(View view, View view2) {
        this.f15110d = new C3491a(view);
        this.f15111e = new C3491a(view2).mo10833a(true);
        this.f15112f = "4.1.2".equals(Build.VERSION.RELEASE);
    }

    /* renamed from: a */
    public C3490i mo10831a() {
        this.f15110d.mo10834a();
        this.f15111e.mo10834a();
        return this;
    }

    /* renamed from: a */
    public C3490i mo10832a(int i) {
        this.f15107a = i * 2;
        return this;
    }
}
