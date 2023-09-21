package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.paopaopanel.TouchPalHorizontalScrollView;
import com.cootek.smartinput5.p066ui.HandWriteView;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.p068b.C2716a;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.p */
/* compiled from: PluginPanel */
public class C1947p implements TouchPalHorizontalScrollView.C1931c {

    /* renamed from: a */
    public static final int f6590a = 4;

    /* renamed from: b */
    private static final int f6591b = 2;

    /* renamed from: c */
    private static final int f6592c = 1;

    /* renamed from: d */
    private static final int f6593d = 6;

    /* renamed from: e */
    private static final float f6594e = 0.6f;

    /* renamed from: f */
    private static final float f6595f = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f6596g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f6597h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f6598i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Context f6599j;

    /* renamed from: k */
    private int f6600k;

    /* renamed from: l */
    private int f6601l = -2;

    /* renamed from: m */
    private int f6602m = -2;

    /* renamed from: n */
    private SlidePage f6603n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f6604o;

    /* renamed from: p */
    private int f6605p;

    /* renamed from: q */
    private int f6606q;

    /* renamed from: r */
    private int f6607r;

    /* renamed from: s */
    private C1953u f6608s;

    /* renamed from: t */
    private ArrayList<C2716a> f6609t;

    /* renamed from: u */
    private int f6610u = 0;

    /* renamed from: v */
    private int f6611v;

    /* renamed from: w */
    private boolean f6612w = false;

    /* renamed from: x */
    private HashMap<String, Integer> f6613x = new HashMap<>();

    /* renamed from: y */
    private ArrayList<C2716a> f6614y;

    /* renamed from: z */
    private C1937f f6615z;

    public C1947p(Context context) {
        this.f6599j = context;
        this.f6615z = Engine.getInstance().getWidgetManager().mo9617W();
        this.f6611v = 0;
    }

    /* renamed from: a */
    public View mo7150a() {
        if (this.f6603n == null) {
            this.f6603n = new SlidePage(this.f6599j);
        } else {
            this.f6603n.mo7096c();
        }
        this.f6603n.setPageListener(this);
        this.f6603n.setIdentifierLayoutId(R.drawable.drawer_slide_footer);
        if (this.f6608s == null) {
            this.f6608s = new C1953u();
        }
        this.f6608s.mo7169a(this.f6599j, true);
        this.f6614y = this.f6608s.mo7168a();
        if (this.f6614y.size() > 0) {
            m8924c(this.f6614y);
        }
        this.f6606q = this.f6604o * this.f6597h;
        this.f6607r = this.f6605p * this.f6596g;
        int c = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.drawer_plugin_panel_padding_top);
        this.f6607r = this.f6607r + m8932p() + c;
        this.f6603n.setLayoutParams(new RelativeLayout.LayoutParams(this.f6606q, this.f6607r));
        this.f6603n.setPadding(0, c, 0, 0);
        this.f6603n.setGravity(1);
        if (this.f6610u > 0) {
            this.f6603n.mo7095b(this.f6610u);
        } else {
            this.f6603n.mo7095b(this.f6611v);
        }
        return this.f6603n;
    }

    /* renamed from: a */
    private ArrayList<C2716a> m8919a(ArrayList<C2716a> arrayList) {
        this.f6609t = arrayList;
        return this.f6609t;
    }

    /* renamed from: b */
    private void m8921b(ArrayList<C2716a> arrayList) {
        m8919a(arrayList);
        this.f6613x.clear();
        this.f6610u = 0;
        int size = this.f6609t.size();
        this.f6612w = false;
        this.f6597h = 4;
        if (m8928l()) {
            this.f6598i = 6;
            this.f6596g = 1;
            this.f6597h = 6;
        } else if (m8922b(size)) {
            this.f6598i = 4;
            this.f6596g = 1;
        } else {
            this.f6612w = true;
            this.f6598i = 8;
            this.f6596g = 2;
        }
        this.f6601l = m8927k() / this.f6597h;
    }

    /* renamed from: b */
    private boolean m8922b(int i) {
        if (i <= 4 || m8929m().mo9253k() < 0.6000000238418579d) {
            return true;
        }
        HandWriteView c = Engine.getInstance().getWidgetManager().mo9641c(false);
        if (c == null || !c.isShown()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private int m8927k() {
        if (m8928l()) {
            return (int) (((float) m8931o()) * f6595f);
        }
        return (int) (((float) m8930n()) * f6595f);
    }

    /* renamed from: l */
    private boolean m8928l() {
        return this.f6599j.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: c */
    private void m8924c(ArrayList<C2716a> arrayList) {
        int i;
        m8921b(arrayList);
        Iterator<C2716a> it = this.f6609t.iterator();
        while (true) {
            if (it.hasNext()) {
                View f = m8918a(it.next()).mo8981f();
                if (f != null) {
                    f.measure(0, 0);
                    this.f6604o = f.getMeasuredWidth();
                    this.f6605p = f.getMeasuredHeight();
                    break;
                }
            } else {
                break;
            }
        }
        int size = this.f6609t.size();
        int i2 = size / this.f6598i;
        if (size % this.f6598i > 0) {
            i2++;
        }
        this.f6600k = i2;
        C1948a[] aVarArr = new C1948a[this.f6600k];
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.f6600k) {
            C1948a aVar = new C1948a();
            aVarArr[i3] = aVar;
            for (int i5 = 0; i5 < this.f6598i; i5++) {
                int i6 = (this.f6598i * i3) + i5;
                if (i6 < size) {
                    C2716a aVar2 = this.f6609t.get(i6);
                    this.f6613x.put(aVar2.mo8984i(), Integer.valueOf(i6));
                    C2716a a = m8918a(aVar2);
                    View f2 = a.mo8981f();
                    if (f2 != null) {
                        aVar.mo7161a(f2);
                        if (a.mo8987l() && !Settings.getInstance().getBoolSetting(Settings.DRAWER_GUIDE_POINT_SHOWED, 25, a.mo8984i(), (Config) null)) {
                            this.f6610u = i4;
                            Settings.getInstance().setBoolSetting(Settings.DRAWER_GUIDE_POINT_SHOWED, true, 25, a.mo8984i(), (Config) null, false);
                        }
                        a.mo8890d();
                    }
                }
            }
            View a2 = aVar.mo7160a();
            a2.setOnClickListener(new C1949q(this));
            if (a2 != null) {
                this.f6603n.mo7092a(a2);
                i = i4 + 1;
            } else {
                i = i4;
            }
            i3++;
            i4 = i;
        }
        this.f6600k = i4;
    }

    /* renamed from: a */
    private C2716a m8918a(C2716a aVar) {
        C1950r rVar = (C1950r) aVar;
        rVar.mo7163a(this.f6601l, this.f6602m, mo7151b());
        return rVar;
    }

    /* renamed from: b */
    public double mo7151b() {
        if (m8928l()) {
            return m8929m().mo9251i();
        }
        return m8929m().mo9250h();
    }

    /* renamed from: m */
    private C2826E m8929m() {
        return Engine.getInstance().getWidgetManager().mo9630ad();
    }

    /* renamed from: c */
    public void mo7152c() {
        if (this.f6609t != null && this.f6609t.size() > 0) {
            Iterator<C2716a> it = this.f6609t.iterator();
            while (it.hasNext()) {
                ((C1950r) it.next()).mo7164b();
            }
        }
    }

    /* renamed from: n */
    private int m8930n() {
        return Engine.getInstance().getWidgetManager().mo9617W().mo7127b();
    }

    /* renamed from: o */
    private int m8931o() {
        return Engine.getInstance().getWidgetManager().mo9617W().mo7128c();
    }

    /* renamed from: p */
    private int m8932p() {
        return C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.tab_more_page_identifier_height);
    }

    /* renamed from: d */
    public int mo7153d() {
        return this.f6607r;
    }

    /* renamed from: e */
    public int mo7154e() {
        return this.f6606q;
    }

    /* renamed from: f */
    public int mo7155f() {
        return this.f6600k;
    }

    /* renamed from: g */
    public int mo7156g() {
        return this.f6610u;
    }

    /* renamed from: h */
    public int mo7157h() {
        return this.f6610u;
    }

    /* renamed from: i */
    public boolean mo7158i() {
        return this.f6612w;
    }

    /* renamed from: j */
    public int mo7159j() {
        return this.f6609t.size();
    }

    /* renamed from: a */
    public int mo7149a(String str) {
        if (this.f6613x == null || this.f6613x.get(str) == null) {
            return 0;
        }
        return this.f6613x.get(str).intValue() % (this.f6597h * this.f6596g);
    }

    /* renamed from: com.cootek.smartinput5.func.paopaopanel.p$a */
    /* compiled from: PluginPanel */
    private class C1948a {

        /* renamed from: b */
        private LinearLayout f6617b;

        /* renamed from: c */
        private int f6618c = 0;

        /* renamed from: d */
        private LinearLayout[] f6619d;

        public C1948a() {
            this.f6617b = new LinearLayout(C1947p.this.f6599j);
            this.f6617b.setGravity(1);
            this.f6617b.setOrientation(1);
            this.f6619d = new LinearLayout[C1947p.this.f6596g];
        }

        /* renamed from: a */
        public void mo7161a(View view) {
            if (this.f6618c < C1947p.this.f6598i) {
                int b = m8946b();
                if (this.f6619d[b] == null) {
                    this.f6619d[b] = new LinearLayout(C1947p.this.f6599j);
                    this.f6619d[b].setOrientation(0);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 1;
                    this.f6617b.addView(this.f6619d[b], layoutParams);
                }
                m8945a(this.f6619d[b], view);
                this.f6618c++;
            }
        }

        /* renamed from: a */
        private void m8945a(LinearLayout linearLayout, View view) {
            linearLayout.addView(m8947b(view));
        }

        /* renamed from: b */
        private View m8947b(View view) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeAllViews();
            }
            return view;
        }

        /* renamed from: b */
        private int m8946b() {
            return this.f6618c / C1947p.this.f6597h;
        }

        /* renamed from: a */
        public View mo7160a() {
            this.f6617b.setLayoutParams(new RelativeLayout.LayoutParams(C1947p.this.f6604o * C1947p.this.f6597h, -2));
            return this.f6617b;
        }
    }

    /* renamed from: a */
    public void mo4155a(int i) {
        if (Engine.isInitialized()) {
            if (this.f6603n != null) {
                this.f6603n.mo4155a(i);
            }
            this.f6611v = i;
            Engine.getInstance().getWidgetManager().mo9617W().mo7138m();
        }
    }
}
