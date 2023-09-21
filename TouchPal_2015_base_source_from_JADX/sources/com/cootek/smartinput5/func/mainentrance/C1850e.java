package com.cootek.smartinput5.func.mainentrance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.mainentrance.C1844a;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.mainentrance.e */
/* compiled from: MainEntranceSwitchTabs */
public class C1850e implements C1844a {

    /* renamed from: a */
    public static final int f6156a = -1;

    /* renamed from: b */
    public static final int f6157b = 0;

    /* renamed from: c */
    public static final int f6158c = 1;

    /* renamed from: d */
    public static final int f6159d = 2;

    /* renamed from: e */
    public static final int f6160e = 3;

    /* renamed from: f */
    public static final int f6161f = 1;

    /* renamed from: g */
    private static final int[] f6162g = {0, 1, 2};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final int[] f6163h = {R.drawable.skin_icon_ctrl, R.drawable.hot_word_icon_ctrl, R.drawable.wonder_icon_ctrl};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final int[] f6164i = {R.string.paopao_tab_skin, R.string.download_tab_hotword, R.string.recommender_title};
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final LinearLayout.LayoutParams f6165q = new LinearLayout.LayoutParams(-1, -1);

    /* renamed from: j */
    private int f6166j = 0;

    /* renamed from: k */
    private int f6167k = 0;

    /* renamed from: l */
    private int f6168l;

    /* renamed from: m */
    private Context f6169m;

    /* renamed from: n */
    private LinearLayout f6170n;

    /* renamed from: o */
    private C1851a[] f6171o = new C1851a[3];

    /* renamed from: p */
    private C1844a.C1846b f6172p;

    public C1850e(Context context, C1844a.C1846b bVar) {
        this.f6169m = context;
        this.f6172p = bVar;
        f6165q.gravity = 17;
        f6165q.weight = 1.0f;
        for (int i = 0; i < 3; i++) {
            this.f6171o[i] = new C1851a(this.f6169m, i);
        }
    }

    /* renamed from: a */
    public View mo6902a() {
        this.f6170n = new LinearLayout(this.f6169m);
        this.f6170n.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f6170n.setOrientation(0);
        boolean z = true;
        for (int i = 0; i < 3; i++) {
            if (this.f6171o[i].mo6907a() != null && this.f6171o[i].mo6907a().getVisibility() == 0) {
                if (z) {
                    this.f6171o[i].mo6923a(8);
                    z = false;
                }
                this.f6170n.addView(this.f6171o[i].mo6907a());
            }
        }
        return this.f6170n;
    }

    /* renamed from: d */
    public void mo6920d() {
        this.f6168l = 3;
        if (C1593bR.m7162a().f5075a && this.f6171o[0].mo6907a() != null) {
            this.f6171o[0].mo6907a().setVisibility(8);
            this.f6168l--;
        }
        if (!C1132b.m5654a(this.f6169m).mo4392a(C1135d.RECOMMEND_TAB_SHOW, Boolean.valueOf(this.f6169m.getResources().getBoolean(R.bool.SHOW_RECOMMEND_TAB))).booleanValue() && this.f6171o[2].mo6907a() != null) {
            this.f6171o[2].mo6907a().setVisibility(8);
            this.f6168l--;
        }
    }

    /* renamed from: e */
    public int mo6921e() {
        for (int i = 0; i < f6162g.length; i++) {
            if (m8509d(f6162g[i])) {
                return f6162g[i];
            }
        }
        return -1;
    }

    /* renamed from: d */
    private boolean m8509d(int i) {
        return this.f6171o[i].mo6907a() != null && this.f6171o[i].mo6907a().getVisibility() == 0;
    }

    /* renamed from: a */
    public void mo6903a(int i) {
        mo6919c(i);
        View a = this.f6171o[this.f6167k].mo6907a();
        View a2 = this.f6171o[this.f6166j].mo6907a();
        if (a != null) {
            a.setSelected(false);
        }
        if (a2 != null) {
            a2.setSelected(true);
        }
        this.f6167k = this.f6166j;
        if (this.f6172p != null) {
            this.f6172p.mo6908a(i);
        }
    }

    /* renamed from: c */
    public void mo6919c(int i) {
        if (!m8509d(i)) {
            i = mo6921e();
        }
        this.f6166j = i;
    }

    /* renamed from: b */
    public View mo6905b(int i) {
        if (this.f6171o == null || i <= -1 || i >= 3 || this.f6171o[i].mo6907a() == null) {
            return null;
        }
        return this.f6171o[i].mo6907a();
    }

    /* renamed from: b */
    public int mo6904b() {
        return this.f6166j;
    }

    /* renamed from: f */
    public int mo6922f() {
        return this.f6167k;
    }

    /* renamed from: c */
    public int mo6906c() {
        return this.f6168l;
    }

    /* renamed from: com.cootek.smartinput5.func.mainentrance.e$a */
    /* compiled from: MainEntranceSwitchTabs */
    private class C1851a implements C1844a.C1845a {

        /* renamed from: b */
        private Context f6174b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f6175c;

        /* renamed from: d */
        private LinearLayout f6176d;

        public C1851a(Context context, int i) {
            this.f6174b = context;
            this.f6175c = i;
            m8523b();
        }

        /* renamed from: a */
        public View mo6907a() {
            return this.f6176d;
        }

        /* renamed from: a */
        public void mo6923a(int i) {
            ImageView imageView;
            if (this.f6176d != null && (imageView = (ImageView) this.f6176d.findViewById(R.id.switch_tab_left_split_line)) != null) {
                imageView.setVisibility(i);
            }
        }

        /* renamed from: b */
        private void m8523b() {
            this.f6176d = (LinearLayout) ((LayoutInflater) this.f6174b.getSystemService("layout_inflater")).inflate(R.layout.main_entrance_switch_tab_item, (ViewGroup) null);
            ImageView imageView = (ImageView) this.f6176d.findViewById(R.id.main_entrance_switch_tab_icon);
            if (imageView != null) {
                imageView.setImageResource(C1850e.f6163h[this.f6175c]);
            }
            TextView textView = (TextView) this.f6176d.findViewById(R.id.main_entrance_switch_tab_text);
            if (textView != null) {
                textView.setText(C1974m.m9063a(this.f6174b, C1850e.f6164i[this.f6175c]));
            }
            this.f6176d.setOnClickListener(new C1852f(this));
            this.f6176d.setSelected(false);
            this.f6176d.setLayoutParams(C1850e.f6165q);
        }
    }
}
