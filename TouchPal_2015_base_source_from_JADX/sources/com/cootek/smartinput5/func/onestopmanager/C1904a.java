package com.cootek.smartinput5.func.onestopmanager;

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1367W;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1960r;
import com.cootek.smartinput5.func.C2065u;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2174G;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.onestopmanager.a */
/* compiled from: OneStopDownloadDialog */
public class C1904a extends C2869n {

    /* renamed from: a */
    private static int f6451a = 0;

    /* renamed from: b */
    private static int f6452b = 1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static int f6453c = 2;

    /* renamed from: d */
    private static int f6454d = 3;

    /* renamed from: e */
    private static int f6455e = 4;

    /* renamed from: f */
    private static int f6456f = 5;

    /* renamed from: g */
    private static int f6457g = 6;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static int f6458h = 2;

    /* renamed from: m */
    private static int[][] f6459m = {new int[]{R.string.paopao_pinyin_bigram_title}, new int[0], new int[0]};

    /* renamed from: i */
    private boolean f6460i = false;

    /* renamed from: j */
    private C1906b[] f6461j = new C1906b[f6457g];

    /* renamed from: k */
    private Button f6462k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C1367W f6463l;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f6464n;

    /* renamed from: com.cootek.smartinput5.func.onestopmanager.a$a */
    /* compiled from: OneStopDownloadDialog */
    public static abstract class C1905a {

        /* renamed from: c */
        public String f6465c;

        /* renamed from: d */
        public boolean f6466d;

        /* renamed from: e */
        public boolean f6467e = false;

        /* renamed from: a */
        public abstract void mo7054a();

        /* renamed from: b */
        public abstract int mo7055b();
    }

    public C1904a(Context context, boolean z) {
        super(context, true, true);
        this.f6460i = z;
        this.f6463l = new C1367W(context);
    }

    /* renamed from: a */
    public void mo7053a() {
        View inflate = ((LayoutInflater) mo9539i().getSystemService("layout_inflater")).inflate(R.layout.one_stop_download, (ViewGroup) null, false);
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.download_list_scroll);
        if (Settings.getInstance().getConfig().getOrientation() == 2) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) scrollView.getLayoutParams();
            layoutParams.height = mo9539i().getResources().getDimensionPixelSize(R.dimen.dialog_max_content_height_landscape);
            scrollView.setLayoutParams(layoutParams);
        }
        scrollView.setVerticalScrollBarEnabled(true);
        mo9528a((CharSequence) C1974m.m9063a(mo9539i(), C1593bR.m7162a().mo6232a(7)));
        mo9526a(inflate);
        mo9533b(false);
        m8769n();
        m8771p();
        m8773r();
        this.f6462k = mo8596d_();
        m8764g();
        this.f6462k.setOnClickListener(new C1907b(this));
        Button d = mo8595d();
        d.setText(C1974m.m9063a(mo9539i(), (int) R.string.cancel));
        d.setOnClickListener(new C1909d(this));
        super.mo7053a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m8764g() {
        String str;
        if (this.f6462k != null) {
            float l = (((float) m8767l()) / 1024.0f) / 1024.0f;
            if (l <= 0.0f) {
                str = "";
            } else if (l < 0.1f) {
                str = "(0.1M)";
            } else {
                str = String.format("(%.1fM)", new Object[]{Float.valueOf(l)});
            }
            this.f6462k.setText(C1974m.m9063a(mo9539i(), (int) R.string.download) + str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m8765h() {
        for (int i = 0; i < f6457g; i++) {
            if (this.f6461j[i] != null) {
                this.f6461j[i].mo7056a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m8766k() {
        if (m8767l() <= 0) {
            mo9534b_();
            return;
        }
        C1584bI.m7145b(C1368X.m6313b(), new C1910e(this), true);
    }

    /* renamed from: l */
    private int m8767l() {
        int i = 0;
        for (int i2 = 0; i2 < f6457g; i2++) {
            if (this.f6461j[i2] != null) {
                i += this.f6461j[i2].mo7058b();
            }
        }
        return i;
    }

    /* renamed from: m */
    private void m8768m() {
        if (!C1368X.m6320c().mo5847t().mo7077b()) {
            C1911f fVar = new C1911f(this);
            fVar.f6465c = C1974m.m9063a(mo9539i(), f6459m[f6451a][0]);
            fVar.f6467e = true;
            this.f6461j[f6456f].mo7057a((C1905a) fVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8753a(List<String> list) {
        ListView listView = (ListView) mo9540j().findViewById(R.id.category_lbs_list);
        if (listView != null) {
            if (this.f6461j[f6456f] == null) {
                this.f6461j[f6456f] = new C1906b(mo9539i());
            }
            this.f6461j[f6456f].mo7059c();
            C1960r r = C1368X.m6320c().mo5845r();
            for (String d : list) {
                C2065u d2 = r.mo7198d(d);
                if (d2 != null && !r.mo7209l(d2.f8870v)) {
                    C1905a a = m8746a(d2);
                    a.f6467e = true;
                    this.f6461j[f6456f].mo7057a(a);
                }
            }
            m8768m();
            listView.setAdapter(this.f6461j[f6456f]);
            listView.setDivider(mo9539i().getResources().getDrawable(R.drawable.paopao_divider));
            listView.setDividerHeight(mo9539i().getResources().getDimensionPixelSize(R.dimen.divider_height));
            listView.setCacheColorHint(0);
            m13272a(listView);
            mo9540j().requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8748a(TextView textView) {
        Context i = mo9539i();
        String a = C1974m.m9063a(mo9539i(), (int) R.string.onestop_current_city);
        C2894d.C2895a aVar = new C2894d.C2895a(i);
        ArrayList<String> f = C2174G.m9763a().mo7631f();
        AlertDialog create = aVar.setSingleChoiceItems(new ArrayAdapter(i, 17367058, f), m8745a(this.f6464n, f), new C1912g(this, i, textView, a)).create();
        Window window = create.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.type = C2261Q.f9802h;
        attributes.token = Engine.getInstance().getIms().getWindow().getWindow().getDecorView().getWindowToken();
        if (attributes.token != null) {
            window.setAttributes(attributes);
            window.addFlags(131072);
            create.show();
        }
    }

    /* renamed from: a */
    private int m8745a(String str, ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(it.next())) {
                return i;
            }
            i++;
        }
        return 0;
    }

    /* renamed from: n */
    private void m8769n() {
        ProgressBar progressBar = (ProgressBar) mo9540j().findViewById(R.id.category_lbs_location);
        Button button = (Button) mo9540j().findViewById(R.id.btn_location);
        ListView listView = (ListView) mo9540j().findViewById(R.id.category_lbs_list);
        if (listView != null) {
            if (this.f6460i) {
                mo9540j().findViewById(R.id.category_lbs).setVisibility(8);
                mo9540j().findViewById(R.id.category_lbs_title).setVisibility(8);
                return;
            }
            if (C1593bR.m7162a().f5075a) {
                mo9540j().findViewById(R.id.category_lbs_title).setVisibility(8);
                View findViewById = mo9540j().findViewById(R.id.category_lbs);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.bottomMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
                findViewById.setLayoutParams(layoutParams);
            }
            if (this.f6461j[f6456f] == null) {
                this.f6461j[f6456f] = new C1906b(mo9539i());
            }
            this.f6461j[f6456f].mo7059c();
            String a = C1974m.m9063a(mo9539i(), (int) R.string.LBS_BEIJING);
            String a2 = C1974m.m9063a(mo9539i(), (int) R.string.onestop_current_city);
            ArrayList arrayList = new ArrayList();
            TextView textView = (TextView) mo9540j().findViewById(R.id.category_lbs_title_text);
            String e = C2174G.m9763a().mo7630e();
            String[] g = C2174G.m9763a().mo7632g();
            int a3 = C2174G.m9763a().mo7623a(e);
            if (TextUtils.isEmpty(e) || a3 == -1) {
                this.f6464n = a;
                textView.setText(a2 + this.f6464n);
                String a4 = C1368X.m6320c().mo5845r().mo7193a(1);
                if (a4 != null) {
                    arrayList.add(a4);
                }
            } else {
                this.f6464n = C1974m.m9063a(mo9539i(), a3);
                textView.setText(a2 + this.f6464n);
                if (g != null) {
                    for (String a5 : g) {
                        int a6 = C2174G.m9763a().mo7623a(a5);
                        if (a6 >= 0) {
                            arrayList.add(C1368X.m6320c().mo5845r().mo7193a(a6));
                        }
                    }
                }
            }
            m8753a((List<String>) arrayList);
            listView.setAdapter(this.f6461j[f6456f]);
            listView.setDivider(mo9539i().getResources().getDrawable(R.drawable.paopao_divider));
            listView.setDividerHeight(mo9539i().getResources().getDimensionPixelSize(R.dimen.divider_height));
            listView.setCacheColorHint(0);
            m13272a(listView);
            button.setOnClickListener(new C1913h(this, textView));
            progressBar.setVisibility(8);
        }
    }

    /* renamed from: o */
    private void m8770o() {
        C1389aD o = C1368X.m6320c().mo5842o();
        ArrayList arrayList = new ArrayList();
        for (C1498a add : o.mo5953k()) {
            arrayList.add(add);
        }
        String[] h = o.mo5947h();
        for (String str : h) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1498a aVar = (C1498a) arrayList.get(i);
                if (str.equals(aVar.f4727f) && aVar.mo6156f() && o.mo5954l(str).mo6156f()) {
                    arrayList.remove(i);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1498a aVar2 = (C1498a) it.next();
            C1914i iVar = new C1914i(this, aVar2);
            C1498a l = o.mo5954l(aVar2.f4727f);
            String str2 = "";
            if (l != null && !l.mo6156f()) {
                str2 = "\n(" + C1974m.m9063a(mo9539i(), (int) R.string.optpage_language_need_upgrade_short) + ")";
            }
            iVar.f6465c = aVar2.mo6153c() + str2;
            this.f6461j[f6452b].mo7057a((C1905a) iVar);
        }
    }

    /* renamed from: p */
    private void m8771p() {
        ListView listView = (ListView) mo9540j().findViewById(R.id.category_language_list);
        if (listView != null) {
            if (!this.f6460i) {
                mo9540j().findViewById(R.id.category_language).setVisibility(8);
                return;
            }
            if (this.f6461j[f6452b] == null) {
                this.f6461j[f6452b] = new C1906b(mo9539i());
            }
            m8770o();
            listView.setAdapter(this.f6461j[f6452b]);
            listView.setDivider(mo9539i().getResources().getDrawable(R.drawable.paopao_divider));
            listView.setDividerHeight(mo9539i().getResources().getDimensionPixelSize(R.dimen.divider_height));
            listView.setCacheColorHint(0);
            m13272a(listView);
        }
    }

    /* renamed from: a */
    private C1905a m8746a(C2065u uVar) {
        C1915j jVar = new C1915j(this, uVar);
        jVar.f6465c = uVar.f8871w;
        return jVar;
    }

    /* renamed from: a */
    private int m8744a(int i) {
        if (i == f6454d) {
            return C2065u.f8850f;
        }
        if (i == f6455e) {
            return C2065u.f8849e;
        }
        return C2065u.f8848d;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m8772q() {
        ListView listView = (ListView) mo9540j().findViewById(R.id.category_celldict_dialect_list);
        if (listView != null) {
            if (this.f6461j[f6453c] == null) {
                this.f6461j[f6453c] = new C1906b(mo9539i());
            }
            this.f6461j[f6453c].mo7059c();
            this.f6461j[f6453c].registerDataSetObserver(new C1916k(this, listView));
            m8756b(f6453c);
            listView.setAdapter(this.f6461j[f6453c]);
            listView.setDivider(mo9539i().getResources().getDrawable(R.drawable.paopao_divider));
            listView.setDividerHeight(mo9539i().getResources().getDimensionPixelSize(R.dimen.divider_height));
            listView.setCacheColorHint(0);
            m13272a(listView);
            mo9540j().requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8756b(int i) {
        this.f6461j[i].mo7059c();
        this.f6461j[i].f6469b = false;
        C1960r r = C1368X.m6320c().mo5845r();
        int a = m8744a(i);
        C2065u[] h = r.mo7205h();
        int i2 = 0;
        for (C2065u uVar : h) {
            if (uVar.f8874z == a) {
                i2++;
            }
        }
        if (i2 > f6458h) {
            this.f6461j[i].f6469b = true;
        } else {
            this.f6461j[i].f6469b = false;
        }
        for (C2065u uVar2 : h) {
            if (uVar2.f8874z == a) {
                C1905a a2 = m8746a(uVar2);
                if (!m8754a(a2, f6456f)) {
                    this.f6461j[i].mo7057a(a2);
                    if (this.f6461j[i].f6468a) {
                        this.f6461j[i].f6469b = false;
                    } else if (0 >= f6458h) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m8754a(C1905a aVar, int i) {
        if (this.f6461j[i] == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.f6461j[i].getCount(); i2++) {
            if (aVar.f6465c.equals(((C1905a) this.f6461j[i].getItem(i2)).f6465c)) {
                return true;
            }
        }
        this.f6461j[i].getCount();
        return false;
    }

    /* renamed from: r */
    private void m8773r() {
        if (this.f6460i) {
            mo9540j().findViewById(R.id.category_celldict_dialect).setVisibility(8);
        } else {
            m8757b(R.id.category_celldict_dialect_list, f6453c);
        }
        if (this.f6460i) {
            mo9540j().findViewById(R.id.category_celldict_common).setVisibility(8);
        } else {
            m8757b(R.id.category_celldict_common_list, f6454d);
        }
    }

    /* renamed from: b */
    private void m8757b(int i, int i2) {
        ListView listView = (ListView) mo9540j().findViewById(i);
        if (listView != null) {
            if (this.f6461j[i2] == null) {
                this.f6461j[i2] = new C1906b(mo9539i());
            }
            this.f6461j[i2].registerDataSetObserver(new C1908c(this, i2, listView));
            m8756b(i2);
            listView.setAdapter(this.f6461j[i2]);
            listView.setDivider(mo9539i().getResources().getDrawable(R.drawable.paopao_divider));
            listView.setDividerHeight(mo9539i().getResources().getDimensionPixelSize(R.dimen.divider_height));
            listView.setCacheColorHint(0);
            m13272a(listView);
        }
    }

    /* renamed from: com.cootek.smartinput5.func.onestopmanager.a$b */
    /* compiled from: OneStopDownloadDialog */
    public class C1906b extends BaseAdapter {

        /* renamed from: a */
        public boolean f6468a = false;

        /* renamed from: b */
        public boolean f6469b = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public List<C1905a> f6471d = null;

        /* renamed from: e */
        private Context f6472e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean[] f6473f = null;

        public C1906b(Context context) {
            this.f6472e = context;
            if (this.f6471d == null) {
                this.f6471d = new ArrayList();
            }
            if (this.f6473f == null) {
                this.f6473f = new boolean[C1904a.f6458h];
                for (int i = 0; i < C1904a.f6458h; i++) {
                    this.f6473f[i] = false;
                }
            }
            this.f6468a = false;
        }

        /* renamed from: a */
        public void mo7056a() {
            int size = this.f6471d.size();
            for (int i = 0; i < size; i++) {
                if (this.f6471d.get(i).f6466d) {
                    this.f6471d.get(i).mo7054a();
                }
            }
        }

        /* renamed from: b */
        public int mo7058b() {
            int i;
            int size = this.f6471d.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (this.f6471d.get(i2).f6466d) {
                    i = this.f6471d.get(i2).mo7055b() + i3;
                } else {
                    i = i3;
                }
                i2++;
                i3 = i;
            }
            return i3;
        }

        /* renamed from: c */
        public void mo7059c() {
            this.f6471d.clear();
        }

        /* renamed from: a */
        public void mo7057a(C1905a aVar) {
            this.f6471d.add(aVar);
        }

        public Object getItem(int i) {
            return this.f6471d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            DownloadItemView a = DownloadItemView.m8743a(this.f6472e);
            if (!(i == this.f6471d.size())) {
                a.setText(this.f6471d.get(i).f6465c);
                a.f6448a.setOnCheckedChangeListener(new C1917l(this, i));
                a.f6448a.setChecked(i < C1904a.f6458h ? this.f6473f[i] || this.f6471d.get(i).f6467e : this.f6471d.get(i).f6467e);
                a.setOnClickListener(new C1918m(this));
            } else {
                a.setText(C1974m.m9063a(C1904a.this.mo9539i(), (int) R.string.download_list_more));
                a.f6448a.setVisibility(4);
                a.setOnClickListener(new C1919n(this));
            }
            a.setClickable(true);
            return a;
        }

        public int getCount() {
            if (!this.f6469b) {
                return this.f6471d.size();
            }
            return this.f6471d.size() + 1;
        }
    }
}
