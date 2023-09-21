package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.ui.be */
/* compiled from: LanguageSelectorPopup */
public class C2752be extends PopupWindow {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f12261a = 4;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<String, Integer> f12262b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f12263c;

    /* renamed from: d */
    private LinearLayout f12264d;

    /* renamed from: e */
    private boolean f12265e;

    /* renamed from: f */
    private int f12266f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f12267g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f12268h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f12269i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public LayoutInflater f12270j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C2753a[] f12271k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f12272l;

    /* renamed from: m */
    private C2826E f12273m = Engine.getInstance().getWidgetManager().mo9630ad();

    /* renamed from: n */
    private LinearLayout f12274n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public HorizontalScrollView f12275o;

    /* renamed from: p */
    private C2756bh f12276p;

    public C2752be(Context context) {
        super(context);
        this.f12263c = context;
        this.f12262b.put(C1549b.f4831b, Integer.valueOf(R.drawable.lang_icon_pinyin));
        this.f12262b.put(C1549b.f4835f, Integer.valueOf(R.drawable.lang_icon_handwrite));
        this.f12262b.put(C1549b.f4833d, Integer.valueOf(R.drawable.lang_icon_wubi));
        this.f12262b.put(C1549b.f4832c, Integer.valueOf(R.drawable.lang_icon_bihua));
        this.f12262b.put(C1549b.f4837h, Integer.valueOf(R.drawable.lang_icon_cangjie));
        this.f12262b.put(C1549b.f4834e, Integer.valueOf(R.drawable.lang_icon_zhuyin));
        this.f12262b.put(C1549b.f4813ai, Integer.valueOf(R.drawable.lang_icon_simplecangjie));
        m12550b();
    }

    /* renamed from: b */
    private void m12550b() {
        this.f12270j = (LayoutInflater) this.f12263c.getSystemService("layout_inflater");
        this.f12264d = new LinearLayout(this.f12263c);
        this.f12264d.setOrientation(0);
        this.f12264d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f12274n = new LinearLayout(this.f12263c);
        this.f12274n.setOrientation(1);
        this.f12275o = new HorizontalScrollView(this.f12263c);
        this.f12275o.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f12275o.addView(this.f12264d);
        this.f12275o.setHorizontalScrollBarEnabled(false);
        this.f12274n.removeAllViews();
        this.f12274n.addView(this.f12275o);
        this.f12276p = new C2756bh(this.f12263c);
        this.f12274n.addView(this.f12276p.mo9033a());
        setContentView(this.f12274n);
        setBackgroundDrawable(new ColorDrawable(this.f12263c.getResources().getColor(R.color.language_selector_background_color)));
        SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
        this.f12266f = g.getHeight();
        this.f12267g = g.getWidth();
        this.f12268h = (int) (((float) this.f12266f) * C2699ak.f12081a);
        this.f12269i = this.f12267g / this.f12261a;
    }

    /* renamed from: a */
    public void mo9026a() {
        m12550b();
        this.f12265e = true;
        this.f12264d.removeAllViews();
        this.f12271k = m12548a(m12554d());
        m12552c();
        for (C2753a aVar : this.f12271k) {
            if (aVar != null) {
                this.f12264d.addView(aVar.mo9029a());
            }
        }
        setWidth(this.f12267g);
        setHeight(this.f12266f);
    }

    /* renamed from: c */
    private void m12552c() {
        this.f12272l = this.f12271k.length;
        this.f12269i = this.f12267g / this.f12261a;
    }

    /* renamed from: a */
    public void mo9027a(SoftKeyboardView softKeyboardView, int i) {
        int i2;
        if (!this.f12265e) {
            mo9026a();
        }
        this.f12265e = false;
        int height = softKeyboardView.getHeight() - this.f12266f;
        int l = this.f12273m.mo9254l();
        if ((i & 80) != 0) {
            i2 = C2835M.m13017a(softKeyboardView);
        } else {
            i2 = 0;
        }
        try {
            showAtLocation(softKeyboardView, i, l, i2 + height);
        } catch (RuntimeException e) {
        }
        for (int i3 = 0; i3 < this.f12271k.length; i3++) {
            if (this.f12271k[i3].f12278b != null && this.f12271k[i3].f12278b.f4727f.equals(Engine.getInstance().getCurrentLanguageId())) {
                this.f12271k[i3].mo9030a(true);
                this.f12275o.post(new C2754bf(this, i3));
            }
        }
    }

    /* renamed from: a */
    private C2753a[] m12548a(C1498a[] aVarArr) {
        C2753a[] aVarArr2 = new C2753a[aVarArr.length];
        for (int i = 0; i < aVarArr2.length; i++) {
            if (aVarArr[i] != null) {
                aVarArr2[i] = new C2753a(aVarArr[i]);
            }
        }
        return aVarArr2;
    }

    /* renamed from: d */
    private C1498a[] m12554d() {
        String[] p;
        C1389aD o = C1368X.m6320c().mo5842o();
        if (C1389aD.m6470y(Engine.getInstance().getCurrentLanguageId())) {
            p = o.mo5961o();
        } else {
            p = o.mo5963p();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < p.length; i2++) {
            if (!TextUtils.isEmpty(p[i2])) {
                C1498a l = o.mo5954l(p[i2]);
                if (l.mo6156f()) {
                    arrayList.add(l);
                    i++;
                }
            }
        }
        C1498a[] aVarArr = new C1498a[i];
        for (int i3 = 0; i3 < i; i3++) {
            aVarArr[i3] = (C1498a) arrayList.get(i3);
        }
        return aVarArr;
    }

    /* renamed from: a */
    private static String m12547a(Context context, int i) {
        return C1974m.m9063a(context, i);
    }

    /* renamed from: com.cootek.smartinput5.ui.be$a */
    /* compiled from: LanguageSelectorPopup */
    private class C2753a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C1498a f12278b;

        /* renamed from: c */
        private String f12279c = this.f12278b.f4728g;

        /* renamed from: d */
        private int f12280d;

        /* renamed from: e */
        private TextView f12281e;

        /* renamed from: f */
        private ImageView f12282f;

        /* renamed from: g */
        private int f12283g;

        /* renamed from: h */
        private int f12284h;

        /* renamed from: i */
        private int f12285i;

        /* renamed from: j */
        private int f12286j;

        /* renamed from: k */
        private ImageView f12287k;

        /* renamed from: l */
        private View f12288l;

        /* renamed from: m */
        private View.OnClickListener f12289m;

        public C2753a(C1498a aVar) {
            m12564b();
            this.f12278b = aVar;
            this.f12289m = new C2755bg(this, C2752be.this);
            this.f12280d = ((Integer) C2752be.this.f12262b.get(this.f12278b.f4727f)).intValue();
        }

        /* renamed from: b */
        private void m12564b() {
            this.f12288l = C2752be.this.f12270j.inflate(R.layout.language_selector_item, (ViewGroup) null);
            this.f12288l.setBackgroundColor(0);
            this.f12281e = (TextView) this.f12288l.findViewById(R.id.title);
            this.f12282f = (ImageView) this.f12288l.findViewById(R.id.image);
            this.f12287k = (ImageView) this.f12288l.findViewById(R.id.arrow);
        }

        /* renamed from: c */
        private Drawable m12565c() {
            Path path = new Path();
            path.moveTo(50.0f, 50.0f);
            path.lineTo(100.0f, 0.0f);
            path.lineTo(150.0f, 50.0f);
            path.close();
            ShapeDrawable shapeDrawable = new ShapeDrawable(new PathShape(path, 200.0f, 50.0f));
            shapeDrawable.getPaint().setColor(C2752be.this.f12263c.getResources().getColor(R.color.layout_selector_background_color));
            return shapeDrawable;
        }

        /* renamed from: a */
        public void mo9030a(boolean z) {
            boolean z2 = false;
            this.f12288l.setSelected(z);
            if (this.f12282f != null) {
                this.f12282f.setSelected(z);
                this.f12282f.setPressed(z);
                this.f12287k.setBackgroundDrawable(m12565c());
                if (z) {
                    this.f12287k.setVisibility(0);
                } else {
                    this.f12287k.setVisibility(4);
                }
            }
            View view = this.f12288l;
            if (!z) {
                z2 = true;
            }
            view.setEnabled(z2);
        }

        /* renamed from: a */
        public View mo9029a() {
            int i;
            int i2;
            this.f12288l.setOnClickListener(this.f12289m);
            int i3 = (int) (((float) C2752be.this.f12268h) * C2699ak.f12084d);
            int j = (int) (((float) C2752be.this.f12269i) * C2699ak.f12086f);
            int j2 = (int) (((float) C2752be.this.f12269i) * C2699ak.f12086f);
            int a = C2752be.this.f12272l;
            if (a > C2752be.this.f12261a) {
                a = C2752be.this.f12261a;
            }
            int c = (C2752be.this.f12267g - (C2752be.this.f12269i * a)) / (a * 2);
            this.f12283g = (int) (((float) C2752be.this.f12268h) * C2699ak.f12083c);
            this.f12284h = (C2752be.this.f12269i - j) - j2;
            this.f12285i = (int) (((float) C2752be.this.f12268h) * C2699ak.f12082b);
            this.f12286j = (C2752be.this.f12269i - j) - j2;
            if (this.f12281e != null) {
                ViewGroup.LayoutParams layoutParams = this.f12281e.getLayoutParams();
                layoutParams.height = this.f12283g;
                layoutParams.width = this.f12284h;
                this.f12281e.setLayoutParams(layoutParams);
                this.f12281e.setText(this.f12279c);
            }
            if (this.f12282f != null) {
                ViewGroup.LayoutParams layoutParams2 = this.f12282f.getLayoutParams();
                layoutParams2.height = this.f12285i;
                this.f12282f.setLayoutParams(layoutParams2);
                this.f12282f.setImageResource(this.f12280d);
            }
            if (this.f12287k != null) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
                layoutParams3.width = (C2752be.this.f12269i - j) - j2;
                int i4 = ((C2752be.this.f12268h - this.f12285i) - this.f12283g) - i3;
                if (i4 > layoutParams3.width / 4) {
                    i = layoutParams3.width / 4;
                    i2 = i4 - i;
                } else {
                    i = i4;
                    i2 = 0;
                }
                layoutParams3.height = i;
                layoutParams3.topMargin = i2;
                this.f12287k.setLayoutParams(layoutParams3);
                this.f12287k.setVisibility(4);
            }
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams4.height = C2752be.this.f12268h;
            layoutParams4.width = C2752be.this.f12269i;
            layoutParams4.leftMargin = c;
            layoutParams4.rightMargin = c;
            this.f12288l.setLayoutParams(layoutParams4);
            this.f12288l.setPadding(j, i3, j2, 0);
            this.f12281e.setTextSize(0, (float) C1584bI.m7122a(this.f12284h, this.f12283g, this.f12279c, this.f12281e, R.dimen.language_selector_text_size));
            return this.f12288l;
        }
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
        }
    }
}
