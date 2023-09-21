package p100m.framework.p103ui.widget.slidingmenu;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: m.framework.ui.widget.slidingmenu.SlidingMenu */
public class SlidingMenu extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4317b f17533a;

    /* renamed from: b */
    private HashMap<C4328m, View> f17534b;

    /* renamed from: c */
    private View.OnClickListener f17535c;

    /* renamed from: d */
    private View.OnTouchListener f17536d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4316a f17537e;

    /* renamed from: f */
    private int f17538f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f17539g;

    /* renamed from: h */
    private int f17540h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f17541i;

    /* renamed from: j */
    private FrameLayout f17542j;

    /* renamed from: k */
    private LinearLayout f17543k;

    /* renamed from: l */
    private View f17544l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public BodyContainer f17545m;

    /* renamed from: n */
    private LinearLayout f17546n;

    /* renamed from: o */
    private View f17547o;

    public SlidingMenu(Context context) {
        super(context);
        m18049a(context);
    }

    public SlidingMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18049a(context);
    }

    public SlidingMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18049a(context);
    }

    /* renamed from: a */
    private void m18049a(Context context) {
        this.f17533a = new C4317b();
        this.f17534b = new HashMap<>();
        this.f17535c = new C4318c(this);
        this.f17536d = new C4320e(this);
        this.f17538f = context.getResources().getDisplayMetrics().widthPixels;
        this.f17539g = (int) (((float) this.f17538f) * this.f17533a.f17551c);
        this.f17540h = (this.f17538f - this.f17539g) / 2;
        setBackgroundResource(this.f17533a.f17552d);
        m18052b(context);
        m18053c(context);
        getViewTreeObserver().addOnGlobalLayoutListener(new C4321f(this));
    }

    /* renamed from: b */
    private void m18052b(Context context) {
        this.f17542j = new C4323h(this, context);
        this.f17542j.setLayoutParams(new FrameLayout.LayoutParams(this.f17539g, -1));
        addView(this.f17542j);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f17542j.addView(linearLayout);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setVerticalFadingEdgeEnabled(false);
        m18050a((View) scrollView);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        scrollView.setLayoutParams(layoutParams);
        linearLayout.addView(scrollView);
        this.f17543k = new LinearLayout(context);
        this.f17543k.setOrientation(1);
        this.f17543k.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        scrollView.addView(this.f17543k);
        this.f17544l = new View(context);
        this.f17544l.setBackgroundColor(0);
        this.f17544l.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f17542j.addView(this.f17544l);
    }

    /* renamed from: c */
    private void m18053c(Context context) {
        this.f17545m = new BodyContainer(this);
        this.f17545m.setHorizontalScrollBarEnabled(false);
        this.f17545m.setHorizontalFadingEdgeEnabled(false);
        m18050a((View) this.f17545m);
        this.f17545m.setLayoutParams(new FrameLayout.LayoutParams(this.f17538f, -1));
        addView(this.f17545m);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(this.f17538f + this.f17539g, -1));
        this.f17545m.addView(linearLayout);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(this.f17539g, -1));
        linearLayout.addView(frameLayout);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(this.f17533a.f17559k);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 5;
        imageView.setLayoutParams(layoutParams);
        frameLayout.addView(imageView);
        this.f17546n = new C4324i(this, context);
        this.f17546n.setBackgroundResource(this.f17533a.f17558j);
        this.f17546n.setLayoutParams(new LinearLayout.LayoutParams(this.f17538f, -1));
        linearLayout.addView(this.f17546n);
    }

    public void setAdapter(C4316a aVar) {
        this.f17537e = aVar;
        mo16047a();
    }

    /* renamed from: a */
    public void mo16047a() {
        if (this.f17537e != null) {
            m18056d(getContext());
            m18059f();
        }
    }

    /* renamed from: d */
    private void m18056d(Context context) {
        this.f17538f = context.getResources().getDisplayMetrics().widthPixels;
        this.f17539g = (int) (((float) this.f17538f) * this.f17533a.f17551c);
        this.f17540h = (this.f17538f - this.f17539g) / 2;
        setBackgroundResource(this.f17533a.f17552d);
        m18058e(context);
        m18060f(context);
    }

    /* renamed from: e */
    private void m18058e(Context context) {
        View a;
        ViewGroup.LayoutParams layoutParams = this.f17542j.getLayoutParams();
        layoutParams.width = this.f17539g;
        this.f17542j.setLayoutParams(layoutParams);
        this.f17543k.setPadding(this.f17533a.f17553e, this.f17533a.f17554f, this.f17533a.f17555g, this.f17533a.f17556h);
        if (this.f17537e != null && (a = this.f17537e.mo16069a()) != null) {
            ViewGroup.LayoutParams layoutParams2 = a.getLayoutParams();
            int i = -2;
            if (layoutParams2 != null) {
                i = layoutParams2.height;
            }
            a.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
            ((LinearLayout) this.f17542j.getChildAt(0)).addView(a);
        }
    }

    /* renamed from: f */
    private void m18060f(Context context) {
        ViewGroup.LayoutParams layoutParams = this.f17545m.getLayoutParams();
        layoutParams.width = this.f17538f;
        this.f17545m.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) this.f17545m.getChildAt(0);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        layoutParams2.width = this.f17538f + this.f17539g;
        linearLayout.setLayoutParams(layoutParams2);
        FrameLayout frameLayout = (FrameLayout) linearLayout.getChildAt(0);
        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        layoutParams3.width = this.f17539g;
        frameLayout.setLayoutParams(layoutParams3);
        ViewGroup.LayoutParams layoutParams4 = this.f17546n.getLayoutParams();
        layoutParams4.width = this.f17538f;
        this.f17546n.setLayoutParams(layoutParams4);
        this.f17546n.setBackgroundResource(this.f17533a.f17558j);
        ((ImageView) frameLayout.getChildAt(0)).setImageResource(this.f17533a.f17559k);
        if (!this.f17541i) {
            getViewTreeObserver().addOnGlobalLayoutListener(new C4325j(this));
        }
    }

    public void setBodyView(View view) {
        this.f17547o = view;
        this.f17546n.removeAllViews();
        if (this.f17547o != null) {
            this.f17547o.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.f17546n.addView(this.f17547o);
        }
    }

    public View getBodyView() {
        return this.f17547o;
    }

    /* renamed from: f */
    private void m18059f() {
        Context context = getContext();
        this.f17543k.removeAllViews();
        int b = this.f17537e.mo16079b();
        for (int i = 0; i < b; i++) {
            this.f17543k.addView(this.f17537e.mo16070a(i, (ViewGroup) this.f17543k));
            int a = this.f17537e.mo16072a(i).mo16092a();
            for (int i2 = 0; i2 < a; i2++) {
                C4328m a2 = this.f17537e.mo16073a(i, i2);
                View a3 = this.f17537e.mo16071a(a2, (ViewGroup) this.f17543k);
                this.f17543k.addView(a3);
                this.f17543k.addView(m18061g(context));
                this.f17534b.put(a2, a3);
                a3.setTag(a2);
                a3.setOnClickListener(this.f17535c);
                a3.setOnTouchListener(this.f17536d);
            }
            int childCount = this.f17543k.getChildCount();
            if (childCount > 0) {
                this.f17543k.removeViewAt(childCount - 1);
            }
        }
    }

    /* renamed from: g */
    private View m18061g(Context context) {
        View view = new View(context);
        view.setBackgroundResource(this.f17533a.f17560l);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 2));
        return view;
    }

    /* renamed from: b */
    public void mo16050b() {
        if (this.f17541i) {
            mo16054d();
        } else {
            mo16053c();
        }
    }

    /* renamed from: c */
    public void mo16053c() {
        this.f17541i = true;
        this.f17545m.smoothScrollTo(0, 0);
        if (this.f17537e != null) {
            this.f17537e.mo16078a(this.f17541i);
        }
    }

    /* renamed from: d */
    public void mo16054d() {
        this.f17541i = false;
        this.f17545m.smoothScrollTo(this.f17539g, 0);
        if (this.f17537e != null) {
            this.f17537e.mo16078a(this.f17541i);
        }
    }

    /* renamed from: e */
    public boolean mo16055e() {
        return this.f17541i;
    }

    /* access modifiers changed from: package-private */
    public int getMenuWidth() {
        return this.f17539g;
    }

    /* access modifiers changed from: package-private */
    public int getShowMenuWidth() {
        return this.f17540h;
    }

    /* access modifiers changed from: package-private */
    public C4317b getMenuConfig() {
        return this.f17533a;
    }

    /* access modifiers changed from: package-private */
    public View getMenuCover() {
        return this.f17544l;
    }

    /* renamed from: a */
    public void mo16048a(int i, int i2) {
        this.f17533a.f17549a = i;
        this.f17533a.f17550b = i2;
    }

    public void setMenuWeight(float f) {
        this.f17533a.f17551c = f;
    }

    public void setMenuBackground(int i) {
        this.f17533a.f17552d = i;
    }

    /* renamed from: a */
    public void mo16049a(int i, int i2, int i3, int i4) {
        this.f17533a.f17553e = i;
        this.f17533a.f17554f = i2;
        this.f17533a.f17555g = i3;
        this.f17533a.f17556h = i4;
    }

    public void setTtleHeight(int i) {
        this.f17533a.f17557i = i;
    }

    public void setShadowRes(int i) {
        this.f17533a.f17559k = i;
    }

    public void setBodyBackground(int i) {
        this.f17533a.f17558j = i;
    }

    public void setMenuDivider(int i) {
        this.f17533a.f17560l = i;
    }

    /* renamed from: a */
    private void m18050a(View view) {
        if (Build.VERSION.SDK_INT >= 9) {
            Class<View> cls = View.class;
            try {
                Method method = cls.getMethod("setOverScrollMode", new Class[]{Integer.TYPE});
                method.setAccessible(true);
                method.invoke(view, new Object[]{2});
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo16046a(C4328m mVar) {
        return this.f17534b.get(mVar);
    }

    /* renamed from: b */
    public void mo16051b(int i, int i2) {
        C4328m b;
        if (this.f17537e != null && (b = this.f17537e.mo16081b(i, i2)) != null) {
            this.f17537e.mo16082b(b);
        }
    }

    /* renamed from: b */
    public void mo16052b(C4328m mVar) {
        if (this.f17537e != null && mVar != null) {
            this.f17537e.mo16082b(mVar);
        }
    }
}
