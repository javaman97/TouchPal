package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1810j;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.resource.p055ui.TTextView;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.aR */
/* compiled from: InstallIncompatibleLanguageSkinDialog */
public class C2678aR extends C2681aU {

    /* renamed from: a */
    private Context f12010a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1498a[] f12011b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f12012c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C1601bg f12013d;

    public C2678aR(Context context) {
        super(context, true, true);
        this.f12010a = context;
    }

    /* renamed from: a */
    public boolean mo8913a(C1498a[] aVarArr, String str) {
        if (mo8921c()) {
            return true;
        }
        this.f12011b = aVarArr;
        this.f12012c = str;
        if ((this.f12011b == null || this.f12011b.length == 0) && TextUtils.isEmpty(this.f12012c)) {
            return false;
        }
        ArrayList<C1810j> e = C1368X.m6320c().mo5841n().mo6270e();
        if (e == null) {
            return false;
        }
        Iterator<C1810j> it = e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1810j next = it.next();
            if (next.mo6810a().equals(this.f12012c)) {
                this.f12013d = (C1601bg) next;
                break;
            }
        }
        if (!C2188Q.m9853a().mo7686f()) {
            m12374f();
            return true;
        }
        mo8919a(mo8916a((int) R.string.update_title));
        View inflate = ((LayoutInflater) mo8920b().getSystemService("layout_inflater")).inflate(R.layout.install_incompatible_language_skin, (ViewGroup) null, false);
        m12371c(inflate);
        m12372d(inflate);
        m12369b(inflate);
        mo8918a(inflate);
        return true;
    }

    /* renamed from: b */
    private void m12369b(View view) {
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.langauge_scroll_frame);
        if (scrollView != null) {
            scrollView.setVerticalScrollBarEnabled(true);
            scrollView.setVerticalFadingEdgeEnabled(true);
            scrollView.setFadingEdgeLength(20);
        }
    }

    /* renamed from: c */
    private void m12371c(View view) {
        TTextView tTextView = (TTextView) view.findViewById(R.id.language_list);
        StringBuilder sb = new StringBuilder();
        sb.append(mo8916a((int) R.string.updates_available)).append(C0911j.f2473c);
        if (this.f12011b != null) {
            for (C1498a c : this.f12011b) {
                sb.append(C0911j.f2473c).append(mo8916a((int) R.string.more_language)).append(" - ").append(c.mo6153c());
            }
        }
        if (!TextUtils.isEmpty(this.f12012c) && this.f12013d != null && this.f12013d.f5102f) {
            sb.append(C0911j.f2473c).append(mo8916a((int) R.string.main_entrance_skin)).append(" - ").append(this.f12013d.f5100d);
        }
        tTextView.setText(sb.toString());
    }

    /* renamed from: d */
    private void m12372d(View view) {
        m12373e(view);
    }

    /* renamed from: e */
    private void m12373e(View view) {
        Button e = mo8923e();
        if (e != null) {
            e.setText(mo8916a((int) R.string.install_incompatible_languages_later));
            e.setOnClickListener(new C2679aS(this));
        }
        Button d = mo8922d();
        if (d != null) {
            d.setText(mo8916a((int) R.string.install_incompatible_languages_ok));
            d.setOnClickListener(new C2680aT(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12366a(ArrayList<C1498a> arrayList) {
        if (C1368X.m6324d()) {
            Iterator<C1498a> it = arrayList.iterator();
            while (it.hasNext()) {
                C1498a next = it.next();
                if (!C1368X.m6320c().mo5842o().mo5942e(next.mo6154d())) {
                    C1368X.m6320c().mo5842o().mo5943f(next.mo6154d());
                    C2361q.m10797b().mo8009c(next.mo6154d(), next.mo6153c(), next.mo6159i());
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo8912a() {
        super.mo8912a();
    }

    /* renamed from: f */
    private void m12374f() {
        C2618H h = new C2618H(this.f12010a);
        h.mo8572a(mo8916a((int) R.string.install_incompatible_languages_title));
        h.mo8580b(mo8916a((int) R.string.install_incompatible_languages_no_network_warning));
        h.mo8574a(mo8916a((int) R.string.ok), (View.OnClickListener) null);
        h.mo8567a();
    }
}
