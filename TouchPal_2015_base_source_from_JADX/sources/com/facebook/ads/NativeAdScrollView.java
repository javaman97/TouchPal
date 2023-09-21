package com.facebook.ads;

import android.content.Context;
import android.support.p001v4.view.C0510x;
import android.support.p001v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.ads.C3327D;
import java.util.ArrayList;
import java.util.List;

public class NativeAdScrollView extends LinearLayout {

    /* renamed from: a */
    public static final int f14610a = 5;

    /* renamed from: b */
    public static final int f14611b = 20;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f14612c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3330F f14613d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3334a f14614e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3327D.C3328a f14615f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f14616g;

    /* renamed from: h */
    private final C3335b f14617h;

    /* renamed from: i */
    private final C3336c f14618i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C3329E f14619j;

    /* renamed from: com.facebook.ads.NativeAdScrollView$a */
    public interface C3334a {
        /* renamed from: a */
        View mo10554a(C3509x xVar, int i);

        /* renamed from: a */
        void mo10555a(C3509x xVar, View view);
    }

    /* renamed from: com.facebook.ads.NativeAdScrollView$b */
    private class C3335b extends C0510x {

        /* renamed from: b */
        private List<C3509x> f14621b = new ArrayList();

        public C3335b() {
        }

        /* renamed from: a */
        public void mo10556a() {
            this.f14621b.clear();
            int min = Math.min(NativeAdScrollView.this.f14616g, NativeAdScrollView.this.f14613d.mo10546b());
            for (int i = 0; i < min; i++) {
                this.f14621b.add(NativeAdScrollView.this.f14613d.mo10547c());
            }
            notifyDataSetChanged();
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (i < this.f14621b.size()) {
                if (NativeAdScrollView.this.f14615f != null) {
                    this.f14621b.get(i).mo10877o();
                } else {
                    NativeAdScrollView.this.f14614e.mo10555a(this.f14621b.get(i), (View) obj);
                }
            }
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return this.f14621b.size();
        }

        public int getItemPosition(Object obj) {
            int indexOf = this.f14621b.indexOf(obj);
            if (indexOf >= 0) {
                return indexOf;
            }
            return -2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View a = NativeAdScrollView.this.f14615f != null ? C3327D.m14671a(NativeAdScrollView.this.f14612c, this.f14621b.get(i), NativeAdScrollView.this.f14615f, NativeAdScrollView.this.f14619j) : NativeAdScrollView.this.f14614e.mo10554a(this.f14621b.get(i), i);
            viewGroup.addView(a);
            return a;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: com.facebook.ads.NativeAdScrollView$c */
    private class C3336c extends ViewPager {
        public C3336c(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
    }

    public NativeAdScrollView(Context context, C3330F f, C3327D.C3328a aVar) {
        this(context, f, (C3334a) null, aVar, new C3329E(), 5);
    }

    public NativeAdScrollView(Context context, C3330F f, C3327D.C3328a aVar, C3329E e) {
        this(context, f, (C3334a) null, aVar, e, 5);
    }

    public NativeAdScrollView(Context context, C3330F f, C3327D.C3328a aVar, C3329E e, int i) {
        this(context, f, (C3334a) null, aVar, e, i);
    }

    public NativeAdScrollView(Context context, C3330F f, C3334a aVar) {
        this(context, f, aVar, (C3327D.C3328a) null, (C3329E) null, 5);
    }

    public NativeAdScrollView(Context context, C3330F f, C3334a aVar, int i) {
        this(context, f, aVar, (C3327D.C3328a) null, (C3329E) null, i);
    }

    private NativeAdScrollView(Context context, C3330F f, C3334a aVar, C3327D.C3328a aVar2, C3329E e, int i) {
        super(context);
        if (!f.mo10548d()) {
            throw new IllegalStateException("NativeAdsManager not loaded");
        } else if (aVar2 == null && aVar == null) {
            throw new IllegalArgumentException("Must provide one of AdLayoutProperties or a CustomAdView");
        } else {
            this.f14612c = context;
            this.f14613d = f;
            this.f14619j = e;
            this.f14614e = aVar;
            this.f14615f = aVar2;
            this.f14616g = i;
            this.f14617h = new C3335b();
            this.f14618i = new C3336c(context);
            this.f14618i.setAdapter(this.f14617h);
            setInset(20);
            this.f14617h.mo10556a();
            addView(this.f14618i);
        }
    }

    public void setInset(int i) {
        if (i > 0) {
            DisplayMetrics displayMetrics = this.f14612c.getResources().getDisplayMetrics();
            int round = Math.round(((float) i) * displayMetrics.density);
            this.f14618i.setPadding(round, 0, round, 0);
            this.f14618i.setPageMargin(Math.round(displayMetrics.density * ((float) (i / 2))));
            this.f14618i.setClipToPadding(false);
        }
    }
}
