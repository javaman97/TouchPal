package android.support.p001v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p001v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Settings;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.PagerTitleStrip */
public class PagerTitleStrip extends ViewGroup implements ViewPager.C0378a {

    /* renamed from: f */
    private static final String f873f = "PagerTitleStrip";

    /* renamed from: o */
    private static final int[] f874o = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: p */
    private static final int[] f875p = {16843660};

    /* renamed from: q */
    private static final float f876q = 0.6f;

    /* renamed from: r */
    private static final int f877r = 16;

    /* renamed from: t */
    private static final C0369b f878t;

    /* renamed from: a */
    ViewPager f879a;

    /* renamed from: b */
    TextView f880b;

    /* renamed from: c */
    TextView f881c;

    /* renamed from: d */
    TextView f882d;

    /* renamed from: e */
    int f883e;

    /* renamed from: g */
    private int f884g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f885h;

    /* renamed from: i */
    private int f886i;

    /* renamed from: j */
    private int f887j;

    /* renamed from: k */
    private boolean f888k;

    /* renamed from: l */
    private boolean f889l;

    /* renamed from: m */
    private final C0368a f890m;

    /* renamed from: n */
    private WeakReference<C0510x> f891n;

    /* renamed from: s */
    private int f892s;

    /* renamed from: android.support.v4.view.PagerTitleStrip$b */
    interface C0369b {
        /* renamed from: a */
        void mo1148a(TextView textView);
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f878t = new C0371d();
        } else {
            f878t = new C0370c();
        }
    }

    /* renamed from: android.support.v4.view.PagerTitleStrip$c */
    static class C0370c implements C0369b {
        C0370c() {
        }

        /* renamed from: a */
        public void mo1148a(TextView textView) {
            textView.setSingleLine();
        }
    }

    /* renamed from: android.support.v4.view.PagerTitleStrip$d */
    static class C0371d implements C0369b {
        C0371d() {
        }

        /* renamed from: a */
        public void mo1148a(TextView textView) {
            C0320A.m1312a(textView);
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        f878t.mo1148a(textView);
    }

    public PagerTitleStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f884g = -1;
        this.f885h = -1.0f;
        this.f890m = new C0368a();
        TextView textView = new TextView(context);
        this.f880b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f881c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f882d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f874o);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f880b.setTextAppearance(context, resourceId);
            this.f881c.setTextAppearance(context, resourceId);
            this.f882d.setTextAppearance(context, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            mo1131a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f880b.setTextColor(color);
            this.f881c.setTextColor(color);
            this.f882d.setTextColor(color);
        }
        this.f887j = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f883e = this.f881c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(f876q);
        this.f880b.setEllipsize(TextUtils.TruncateAt.END);
        this.f881c.setEllipsize(TextUtils.TruncateAt.END);
        this.f882d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f875p);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f880b);
            setSingleLineAllCaps(this.f881c);
            setSingleLineAllCaps(this.f882d);
        } else {
            this.f880b.setSingleLine();
            this.f881c.setSingleLine();
            this.f882d.setSingleLine();
        }
        this.f886i = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    public void setTextSpacing(int i) {
        this.f886i = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.f886i;
    }

    public void setNonPrimaryAlpha(float f) {
        this.f892s = ((int) (255.0f * f)) & 255;
        int i = (this.f892s << 24) | (this.f883e & C0333F.f834r);
        this.f880b.setTextColor(i);
        this.f882d.setTextColor(i);
    }

    public void setTextColor(int i) {
        this.f883e = i;
        this.f881c.setTextColor(i);
        int i2 = (this.f892s << 24) | (this.f883e & C0333F.f834r);
        this.f880b.setTextColor(i2);
        this.f882d.setTextColor(i2);
    }

    /* renamed from: a */
    public void mo1131a(int i, float f) {
        this.f880b.setTextSize(i, f);
        this.f881c.setTextSize(i, f);
        this.f882d.setTextSize(i, f);
    }

    public void setGravity(int i) {
        this.f887j = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        C0510x adapter = viewPager.getAdapter();
        viewPager.mo1155a((ViewPager.C0382e) this.f890m);
        viewPager.setOnAdapterChangeListener(this.f890m);
        this.f879a = viewPager;
        mo1133a(this.f891n != null ? (C0510x) this.f891n.get() : null, adapter);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f879a != null) {
            mo1133a(this.f879a.getAdapter(), (C0510x) null);
            this.f879a.mo1155a((ViewPager.C0382e) null);
            this.f879a.setOnAdapterChangeListener((ViewPager.C0381d) null);
            this.f879a = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1132a(int i, C0510x xVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3 = null;
        int count = xVar != null ? xVar.getCount() : 0;
        this.f888k = true;
        if (i < 1 || xVar == null) {
            charSequence = null;
        } else {
            charSequence = xVar.getPageTitle(i - 1);
        }
        this.f880b.setText(charSequence);
        TextView textView = this.f881c;
        if (xVar == null || i >= count) {
            charSequence2 = null;
        } else {
            charSequence2 = xVar.getPageTitle(i);
        }
        textView.setText(charSequence2);
        if (i + 1 < count && xVar != null) {
            charSequence3 = xVar.getPageTitle(i + 1);
        }
        this.f882d.setText(charSequence3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((getHeight() - getPaddingTop()) - getPaddingBottom(), Integer.MIN_VALUE);
        this.f880b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f881c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f882d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f884g = i;
        if (!this.f889l) {
            mo1117a(i, this.f885h, false);
        }
        this.f888k = false;
    }

    public void requestLayout() {
        if (!this.f888k) {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1133a(C0510x xVar, C0510x xVar2) {
        if (xVar != null) {
            xVar.unregisterDataSetObserver(this.f890m);
            this.f891n = null;
        }
        if (xVar2 != null) {
            xVar2.registerDataSetObserver(this.f890m);
            this.f891n = new WeakReference<>(xVar2);
        }
        if (this.f879a != null) {
            this.f884g = -1;
            this.f885h = -1.0f;
            mo1132a(this.f879a.getCurrentItem(), xVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1117a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i != this.f884g) {
            mo1132a(i, this.f879a.getAdapter());
        } else if (!z && f == this.f885h) {
            return;
        }
        this.f889l = true;
        int measuredWidth = this.f880b.getMeasuredWidth();
        int measuredWidth2 = this.f881c.getMeasuredWidth();
        int measuredWidth3 = this.f882d.getMeasuredWidth();
        int i5 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = paddingRight + i5;
        int i7 = (width - (paddingLeft + i5)) - i6;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i8 = ((width - i6) - ((int) (f2 * ((float) i7)))) - (measuredWidth2 / 2);
        int i9 = i8 + measuredWidth2;
        int baseline = this.f880b.getBaseline();
        int baseline2 = this.f881c.getBaseline();
        int baseline3 = this.f882d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i10 = max - baseline;
        int i11 = max - baseline2;
        int i12 = max - baseline3;
        int max2 = Math.max(Math.max(this.f880b.getMeasuredHeight() + i10, this.f881c.getMeasuredHeight() + i11), this.f882d.getMeasuredHeight() + i12);
        switch (this.f887j & 112) {
            case 16:
                int i13 = (((height - paddingTop) - paddingBottom) - max2) / 2;
                i2 = i13 + i10;
                i3 = i11 + i13;
                i4 = i13 + i12;
                break;
            case Settings.SKIN /*80*/:
                int i14 = (height - paddingBottom) - max2;
                i2 = i14 + i10;
                i3 = i11 + i14;
                i4 = i14 + i12;
                break;
            default:
                i2 = paddingTop + i10;
                i3 = i11 + paddingTop;
                i4 = paddingTop + i12;
                break;
        }
        this.f881c.layout(i8, i3, i9, this.f881c.getMeasuredHeight() + i3);
        int min = Math.min(paddingLeft, (i8 - this.f886i) - measuredWidth);
        this.f880b.layout(min, i2, measuredWidth + min, this.f880b.getMeasuredHeight() + i2);
        int max3 = Math.max((width - paddingRight) - measuredWidth3, this.f886i + i9);
        this.f882d.layout(max3, i4, max3 + measuredWidth3, this.f882d.getMeasuredHeight() + i4);
        this.f885h = f;
        this.f889l = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int minHeight = getMinHeight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (((float) size) * 0.8f), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - paddingTop, Integer.MIN_VALUE);
        this.f880b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f881c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f882d.measure(makeMeasureSpec, makeMeasureSpec2);
        if (mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, Math.max(minHeight, this.f881c.getMeasuredHeight() + paddingTop));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        if (this.f879a != null) {
            if (this.f885h >= 0.0f) {
                f = this.f885h;
            }
            mo1117a(this.f884g, f, true);
        }
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    /* renamed from: android.support.v4.view.PagerTitleStrip$a */
    private class C0368a extends DataSetObserver implements ViewPager.C0381d, ViewPager.C0382e {

        /* renamed from: b */
        private int f894b;

        private C0368a() {
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.mo1117a(i, f, false);
        }

        public void onPageSelected(int i) {
            float f = 0.0f;
            if (this.f894b == 0) {
                PagerTitleStrip.this.mo1132a(PagerTitleStrip.this.f879a.getCurrentItem(), PagerTitleStrip.this.f879a.getAdapter());
                if (PagerTitleStrip.this.f885h >= 0.0f) {
                    f = PagerTitleStrip.this.f885h;
                }
                PagerTitleStrip.this.mo1117a(PagerTitleStrip.this.f879a.getCurrentItem(), f, true);
            }
        }

        public void onPageScrollStateChanged(int i) {
            this.f894b = i;
        }

        /* renamed from: a */
        public void mo1143a(C0510x xVar, C0510x xVar2) {
            PagerTitleStrip.this.mo1133a(xVar, xVar2);
        }

        public void onChanged() {
            float f = 0.0f;
            PagerTitleStrip.this.mo1132a(PagerTitleStrip.this.f879a.getCurrentItem(), PagerTitleStrip.this.f879a.getAdapter());
            if (PagerTitleStrip.this.f885h >= 0.0f) {
                f = PagerTitleStrip.this.f885h;
            }
            PagerTitleStrip.this.mo1117a(PagerTitleStrip.this.f879a.getCurrentItem(), f, true);
        }
    }
}
