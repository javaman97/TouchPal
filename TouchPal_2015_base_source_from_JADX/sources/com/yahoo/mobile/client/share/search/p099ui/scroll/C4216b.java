package com.yahoo.mobile.client.share.search.p099ui.scroll;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.View;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;

/* renamed from: com.yahoo.mobile.client.share.search.ui.scroll.b */
public final class C4216b implements IScrollable.OnScrollListener {

    /* renamed from: a */
    private View f17248a;

    /* renamed from: b */
    private View f17249b;

    /* renamed from: c */
    private int f17250c;

    /* renamed from: d */
    private IScrollable f17251d;

    /* renamed from: e */
    private boolean f17252e;

    public final void onScrollBegin(IScrollable iScrollable, int i, int i2) {
        if (this.f17252e) {
            this.f17250c = i2;
        }
    }

    public final void onScroll(IScrollable iScrollable, int i, int i2) {
        if (this.f17252e) {
            int i3 = i2 - this.f17250c;
            this.f17250c = i2;
            float height = (float) this.f17249b.getHeight();
            float height2 = (float) this.f17248a.getHeight();
            float f = (height + height2) / 2.0f;
            m17703a(this.f17249b, (height / f) * ((float) i3), true);
            m17703a(this.f17248a, ((float) (-i3)) * (height2 / f), false);
        }
    }

    public final void onScrollEnd(IScrollable iScrollable, int i, int i2, float f) {
        if (this.f17252e) {
            m17704c(this.f17249b);
            m17704c(this.f17248a);
        }
    }

    /* renamed from: a */
    public final View mo15807a() {
        return this.f17248a;
    }

    /* renamed from: a */
    public final void mo15808a(View view) {
        this.f17248a = view;
    }

    /* renamed from: b */
    public final void mo15812b(View view) {
        this.f17249b = view;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private static void m17703a(View view, float f, boolean z) {
        float max;
        if (f != 0.0f) {
            float translationY = view.getTranslationY();
            float f2 = translationY + f;
            if (z) {
                max = Math.min(Math.max(0.0f, f2), (float) view.getHeight());
            } else {
                max = Math.max(Math.min(0.0f, f2), (float) (-view.getHeight()));
            }
            if (max != translationY) {
                view.setTranslationY(max);
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private void m17704c(View view) {
        float round = (float) (Math.round(view.getTranslationY() / ((float) view.getHeight())) * view.getHeight());
        if (this.f17250c == 0) {
            round = 0.0f;
        }
        m17702a(view, round);
    }

    @TargetApi(11)
    /* renamed from: a */
    private static void m17702a(View view, float f) {
        float translationY = view.getTranslationY();
        if (translationY != f) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{translationY, f});
            ofFloat.setDuration((long) ((500.0f * Math.abs(translationY - f)) / ((float) view.getHeight())));
            ofFloat.start();
        }
    }

    public final void onScrollEnableChanged(IScrollable iScrollable, boolean z) {
        if (iScrollable == this.f17251d && !z) {
            mo15811b();
        }
    }

    /* renamed from: a */
    public final void mo15809a(IScrollable iScrollable) {
        this.f17251d = iScrollable;
        if (!iScrollable.isScrollEnabled() || iScrollable.getScrollY() == 0) {
            mo15811b();
        }
    }

    /* renamed from: b */
    public final void mo15811b() {
        m17702a(this.f17249b, 0.0f);
        m17702a(this.f17248a, 0.0f);
    }

    /* renamed from: a */
    public final void mo15810a(boolean z) {
        this.f17252e = z;
    }
}
