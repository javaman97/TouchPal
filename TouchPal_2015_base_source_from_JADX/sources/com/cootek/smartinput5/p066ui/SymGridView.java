package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2878v;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.cootek.smartinput5.ui.SymGridView */
public class SymGridView extends ListView {

    /* renamed from: g */
    private static final String f11597g = "SymGridView";

    /* renamed from: l */
    private static final int f11598l = 4;

    /* renamed from: m */
    private static final int f11599m = 4;

    /* renamed from: n */
    private static final int f11600n = 40;

    /* renamed from: o */
    private static final int f11601o = 300;

    /* renamed from: A */
    private C2637b f11602A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f11603B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f11604C;

    /* renamed from: D */
    private PageKey f11605D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public Drawable f11606E;

    /* renamed from: F */
    private Method f11607F;

    /* renamed from: G */
    private C2826E f11608G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public View.OnClickListener f11609H = new C2779cC(this);

    /* renamed from: I */
    private AbsListView.OnScrollListener f11610I = new C2780cD(this);

    /* renamed from: a */
    protected final int f11611a;

    /* renamed from: b */
    protected final int f11612b;

    /* renamed from: c */
    protected final float f11613c;

    /* renamed from: d */
    protected final float f11614d;

    /* renamed from: e */
    protected final int f11615e;

    /* renamed from: f */
    protected int f11616f;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Context f11617h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f11618i;

    /* renamed from: j */
    private int f11619j;

    /* renamed from: k */
    private int f11620k;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2636a[][] f11621p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int[] f11622q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f11623r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f11624s;

    /* renamed from: t */
    private int f11625t;

    /* renamed from: u */
    private int f11626u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f11627v;

    /* renamed from: w */
    private int f11628w = 1;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f11629x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f11630y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f11631z;

    /* access modifiers changed from: private */
    public int getTopOffset() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return (getFirstVisiblePosition() * childAt.getHeight()) - childAt.getTop();
    }

    public SymGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11617h = context;
        m11969f();
        this.f11608G = Engine.getInstance().getWidgetManager().mo9630ad();
        int i = this.f11617h.getResources().getDisplayMetrics().widthPixels;
        int o = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9193o();
        TypedArray obtainStyledAttributes = this.f11617h.obtainStyledAttributes(attributeSet, C3305b.C3322q.SoftKeyboard);
        this.f11611a = C2878v.m13321a(obtainStyledAttributes, 4, i, 0);
        this.f11613c = ((float) this.f11611a) / ((float) i);
        this.f11612b = C2878v.m13321a(obtainStyledAttributes, 3, o, 0);
        this.f11614d = ((float) this.f11612b) / ((float) o);
        this.f11615e = C2878v.m13321a(obtainStyledAttributes, 7, i, 0);
        obtainStyledAttributes.recycle();
        C1602bh n = C1368X.m6320c().mo5841n();
        setBackgroundDrawable(n.mo6250a((int) R.drawable.bg_sym_grid, C2726bF.SYM_GRID_LIST_BG));
        setVerticalScrollBarEnabled(true);
        setVerticalFadingEdgeEnabled(true);
        setCacheColorHint(0);
        setSoundEffectsEnabled(false);
        setDivider(n.mo6250a((int) R.drawable.sym_grid_divider, C2726bF.SYM_GRID_DIVIDER));
        this.f11630y = n.mo6248a((int) R.color.key_main_text_color, C2787cK.KEY_TEXT);
        this.f11631z = n.mo6265c((int) R.dimen.keyboard_main_only_text_size);
        this.f11624s = this.f11626u;
        this.f11606E = n.mo6250a((int) R.drawable.sym_grid_side_divider, C2726bF.SYM_GRID_DIVIDER);
        this.f11602A = new C2637b(this, (C2779cC) null);
        setAdapter(this.f11602A);
        setOnScrollListener(this.f11610I);
        m11977j();
    }

    /* renamed from: d */
    private void m11965d() {
        this.f11618i = (int) (((double) this.f11611a) * this.f11608G.mo9250h());
        this.f11619j = (int) (((float) Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9193o()) * this.f11614d);
        this.f11616f = (int) (((float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.key_padding_outer_bottom)) * this.f11614d);
        setMinimumHeight(this.f11619j);
        setMinimumWidth(this.f11618i);
        this.f11625t = (getDisplayHeight() - (C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.sym_grid_divider).getIntrinsicHeight() * 3)) / 4;
        this.f11626u = getDisplayHeight() / 4;
        this.f11606E.setBounds(0, 0, this.f11606E.getIntrinsicWidth(), this.f11626u);
    }

    public void setNextPageKey(PageKey pageKey) {
        this.f11605D = pageKey;
        m11967e();
    }

    private void setCurrentPage(int i) {
        this.f11628w = i;
        m11967e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11956a(int i) {
        if (this.f11628w != i) {
            setCurrentPage(i);
        }
    }

    /* renamed from: e */
    private void m11967e() {
        if (this.f11605D != null) {
            this.f11605D.setPageHint(String.format("%d/%d", new Object[]{Integer.valueOf(this.f11628w), Integer.valueOf(this.f11627v)}));
        }
    }

    public int getDisplayHeight() {
        return this.f11619j - (this.f11616f * 2);
    }

    public int getDisplayWidth() {
        return this.f11618i - (this.f11616f * 2);
    }

    public int getHorizontalGap() {
        return this.f11620k;
    }

    public int getLeftMargin() {
        return 0;
    }

    public int getRightMargin() {
        return this.f11616f;
    }

    public int getTopMargin() {
        return this.f11616f;
    }

    public int getBottomMargin() {
        return 0;
    }

    /* renamed from: f */
    private void m11969f() {
        Class<ListView> cls = ListView.class;
        try {
            this.f11607F = cls.getMethod("smoothScrollBy", new Class[]{Integer.TYPE, Integer.TYPE});
        } catch (NoSuchMethodException e) {
            this.f11607F = null;
        }
    }

    /* renamed from: a */
    public void mo8753a() {
        if (this.f11628w < this.f11627v) {
            m11970g();
        } else {
            m11960b(this.f11623r - 4);
        }
    }

    /* renamed from: b */
    public void mo8754b() {
        if (this.f11628w > 1) {
            m11960b((this.f11628w - 2) * 4);
        } else {
            m11960b(0);
        }
    }

    /* renamed from: g */
    private void m11970g() {
        boolean z = false;
        if (m11972h() || this.f11607F == null) {
            z = true;
        } else {
            try {
                this.f11607F.invoke(this, new Object[]{Integer.valueOf(getScrollToNextPageDistance()), 300});
            } catch (InvocationTargetException e) {
                z = true;
            } catch (IllegalArgumentException e2) {
                z = true;
            } catch (IllegalAccessException e3) {
                z = true;
            }
        }
        if (z) {
            setSelection(this.f11628w * 4);
        }
    }

    private int getScrollToNextPageDistance() {
        int i;
        int i2 = this.f11628w * 4;
        if (this.f11629x + 4 < i2) {
            i = i2 - (this.f11629x + 4);
        } else {
            i = i2 - this.f11629x;
        }
        int topOffset = getTopOffset();
        int intrinsicHeight = (i * C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.sym_grid_divider).getIntrinsicHeight()) + (this.f11624s * i);
        if (topOffset % this.f11624s != 0) {
            return intrinsicHeight - (topOffset % this.f11624s);
        }
        return intrinsicHeight;
    }

    /* renamed from: b */
    private void m11960b(int i) {
        boolean z = false;
        if (m11972h() || this.f11607F == null) {
            z = true;
        } else {
            try {
                int c = m11961c(i);
                if (c == -1) {
                    setSelection(i);
                } else {
                    this.f11607F.invoke(this, new Object[]{Integer.valueOf(c), 300});
                }
            } catch (InvocationTargetException e) {
                z = true;
            } catch (IllegalArgumentException e2) {
                z = true;
            } catch (IllegalAccessException e3) {
                z = true;
            }
        }
        if (z) {
            setSelection(i);
        }
    }

    /* renamed from: c */
    private int m11961c(int i) {
        if (this.f11629x == i) {
            return -1;
        }
        int i2 = i - this.f11629x;
        int intrinsicHeight = (i2 * C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.sym_grid_divider).getIntrinsicHeight()) + (this.f11624s * i2);
        int topOffset = getTopOffset();
        if (topOffset % this.f11624s == 0) {
            return intrinsicHeight;
        }
        if (!this.f11604C) {
            return intrinsicHeight - (topOffset % this.f11624s);
        }
        return intrinsicHeight + (this.f11624s - (topOffset % this.f11624s));
    }

    /* renamed from: h */
    private boolean m11972h() {
        if ("LG-P503".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo8755c() {
        m11977j();
        m11975i();
        setSelection(0);
        setCurrentPage(1);
    }

    /* renamed from: i */
    private void m11975i() {
        if (this.f11623r <= 4) {
            this.f11624s = this.f11625t;
        } else {
            this.f11624s = this.f11626u;
        }
    }

    /* renamed from: j */
    private void m11977j() {
        int i = 0;
        m11965d();
        this.f11621p = (C2636a[][]) Array.newInstance(C2636a.class, new int[]{40, 4});
        this.f11622q = new int[40];
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < 40; i2++) {
            this.f11623r = i2 + 1;
            int i3 = 0;
            while (true) {
                if (i3 >= 4) {
                    break;
                }
                this.f11621p[i2][i3] = new C2636a("sk_" + (i2 + 1) + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + (i3 + 1));
                this.f11622q[i2] = i3 + 1;
                if (this.f11621p[i2][i3].mo8765b().mainTitle == null) {
                    this.f11622q[i2] = i3;
                    if (this.f11621p[i2][i3].f11634c || i3 == 0) {
                        this.f11623r = i2;
                        z2 = true;
                    } else {
                        z = true;
                    }
                } else {
                    i3++;
                }
            }
            if (z) {
                z = false;
            } else if (z2) {
                break;
            }
        }
        int i4 = this.f11623r / 4;
        if (this.f11623r % 4 != 0) {
            i = 1;
        }
        this.f11627v = i4 + i;
        this.f11602A.notifyDataSetChanged();
    }

    /* renamed from: com.cootek.smartinput5.ui.SymGridView$b */
    private class C2637b extends BaseAdapter {
        private C2637b() {
        }

        /* synthetic */ C2637b(SymGridView symGridView, C2779cC cCVar) {
            this();
        }

        public int getCount() {
            return SymGridView.this.f11623r;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C2638c cVar;
            if (view == null || !(view instanceof C2638c)) {
                cVar = new C2638c(SymGridView.this.f11617h);
            } else {
                cVar = view;
            }
            cVar.mo8770a(SymGridView.this.f11621p[i], SymGridView.this.f11622q[i]);
            return cVar;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.SymGridView$c */
    private class C2638c extends LinearLayout {

        /* renamed from: a */
        TextView[] f11638a = new TextView[4];

        public C2638c(Context context) {
            super(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
            for (int i = 0; i < this.f11638a.length; i++) {
                this.f11638a[i] = new TextView(context);
                this.f11638a[i].setSingleLine(true);
                this.f11638a[i].setLayoutParams(layoutParams);
                this.f11638a[i].setGravity(17);
                this.f11638a[i].setTextColor(SymGridView.this.f11630y);
                this.f11638a[i].setTypeface(C1624bv.m7418a());
                this.f11638a[i].setTextSize(0, (float) SymGridView.this.f11631z);
                this.f11638a[i].setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.sym_grid_key_bg_ctrl));
                this.f11638a[i].setSoundEffectsEnabled(false);
            }
        }

        /* renamed from: a */
        public void mo8770a(C2636a[] aVarArr, int i) {
            removeAllViews();
            setLayoutParams(new AbsListView.LayoutParams(-1, SymGridView.this.f11624s));
            for (int i2 = 0; i2 < i; i2++) {
                String str = aVarArr[i2].mo8765b().mainTitle;
                this.f11638a[i2].setText(str);
                this.f11638a[i2].setTextSize(0, (float) SymGridView.this.f11631z);
                int l = (SymGridView.this.f11618i / i) - 4;
                float textSize = this.f11638a[i2].getTextSize();
                TextPaint paint = this.f11638a[i2].getPaint();
                while (((float) l) < paint.measureText(str)) {
                    textSize -= 2.0f;
                    this.f11638a[i2].setTextSize(0, textSize);
                    paint.setTextSize(textSize);
                }
                this.f11638a[i2].setTag(Integer.valueOf(aVarArr[i2].f11633b));
                this.f11638a[i2].setOnClickListener(SymGridView.this.f11609H);
                if (i2 != i - 1) {
                    this.f11638a[i2].setCompoundDrawables((Drawable) null, (Drawable) null, SymGridView.this.f11606E, (Drawable) null);
                }
                addView(this.f11638a[i2]);
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.SymGridView$a */
    private class C2636a {

        /* renamed from: a */
        String f11632a;

        /* renamed from: b */
        int f11633b;

        /* renamed from: c */
        boolean f11634c = false;

        /* renamed from: e */
        private SoftKeyInfo f11636e;

        public C2636a(String str) {
            this.f11632a = str;
            this.f11636e = new SoftKeyInfo();
            mo8764a();
        }

        /* renamed from: a */
        public void mo8764a() {
            if (!TextUtils.isEmpty(this.f11632a)) {
                this.f11633b = Engine.getInstance().getKeyId(this.f11632a);
                if (this.f11633b != -1) {
                    Engine.getInstance().updateKey(this.f11633b, this.f11636e);
                } else {
                    this.f11634c = true;
                }
            }
        }

        /* renamed from: b */
        public SoftKeyInfo mo8765b() {
            return this.f11636e;
        }
    }
}
