package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.view.View;
import com.cootek.presentation.service.toast.ExtensionStaticToast;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.nativeads.C1875a;
import com.cootek.smartinput5.func.nativeads.C1896t;
import com.cootek.smartinput5.func.nativeads.C1901x;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p047c.C1199d;
import com.cootek.smartinput5.p066ui.C2726bF;
import com.cootek.smartinput5.p066ui.p067a.C2657b;
import com.cootek.smartinput5.p066ui.p067a.C2658c;
import com.cootek.smartinput5.p066ui.p067a.C2659d;
import com.cootek.smartinput5.p066ui.p067a.C2660e;
import com.cootek.smartinput5.p066ui.p068b.C2716a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.u */
/* compiled from: PluginTab */
public class C1953u implements C2660e {

    /* renamed from: a */
    private ArrayList<C2716a> f6643a = new ArrayList<>();

    /* renamed from: b */
    private HashMap<String, C1950r> f6644b = new HashMap<>();

    /* renamed from: c */
    private HashMap<String, Integer> f6645c = new HashMap<>();

    /* renamed from: d */
    private boolean f6646d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f6647e = new Handler();

    /* renamed from: a */
    public void mo7169a(Context context, boolean z) {
        if (z || !this.f6646d) {
            this.f6643a.clear();
            m8968a(context);
        }
    }

    /* renamed from: a */
    private void m8968a(Context context) {
        C1950r rVar;
        ArrayList<C1199d> a = C1368X.m6320c().mo5837j().mo6047h().mo4466a();
        C1602bh n = C1368X.m6320c().mo5841n();
        this.f6645c.clear();
        Iterator<C1199d> it = a.iterator();
        while (it.hasNext()) {
            C1199d next = it.next();
            if (this.f6644b.containsKey(next.mo4454b())) {
                rVar = this.f6644b.get(next.mo4454b());
                rVar.f6625e = n.mo6250a(next.mo4457e().mo4467a(C1411aV.f4491r), C2726bF.PLUGIN_PANEL);
                rVar.f6624d = C1974m.m9063a(context, next.mo4457e().mo4468d());
            } else {
                rVar = new C1950r(context, next.mo4454b());
                rVar.f6623c = next.mo4454b();
                rVar.f6624d = C1974m.m9063a(context, next.mo4457e().mo4468d());
                rVar.f6625e = n.mo6250a(next.mo4457e().mo4467a(C1411aV.f4491r), C2726bF.PLUGIN_PANEL);
                String str = rVar.f6623c;
                rVar.f6627g = m8967a(next, context);
                this.f6644b.put(str, rVar);
            }
            m8969a(rVar);
        }
        C2657b.m12328a(context, this);
        m8970b(context);
        this.f6646d = true;
    }

    /* renamed from: a */
    private void m8969a(C1950r rVar) {
        this.f6645c.put(rVar.mo8984i(), Integer.valueOf(this.f6643a.size()));
        this.f6643a.add(rVar);
    }

    /* renamed from: a */
    public ArrayList<C2716a> mo7168a() {
        return this.f6643a;
    }

    /* renamed from: a */
    public void mo7170a(Collection<C2659d> collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, new C1954v(this));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1950r rVar = (C1950r) ((C2659d) it.next());
            Integer num = this.f6645c.get(rVar.mo8984i());
            if (num != null) {
                this.f6643a.remove(num);
                this.f6643a.remove(num.intValue());
                this.f6643a.add(num.intValue(), rVar);
            } else if (rVar.f6626f < 0 || rVar.f6626f >= this.f6643a.size()) {
                m8969a(rVar);
            } else if (((C1950r) this.f6643a.get(rVar.f6626f)).f6626f != rVar.f6626f) {
                for (String next : this.f6645c.keySet()) {
                    int intValue = this.f6645c.get(next).intValue();
                    if (intValue >= rVar.f6626f) {
                        this.f6645c.put(next, Integer.valueOf(intValue + 1));
                    }
                }
                this.f6645c.put(rVar.mo8984i(), Integer.valueOf(rVar.f6626f));
                this.f6643a.add(rVar.f6626f, rVar);
            }
        }
    }

    /* renamed from: b */
    private void m8970b(Context context) {
        C1932a a;
        ArrayList arrayList = new ArrayList();
        C1875a b = C1896t.m8712a().mo7036b(C1901x.f6423a.mo7045a());
        if (b != null && (a = b.mo6995a(context)) != null) {
            arrayList.add(a);
            mo7170a((Collection<C2659d>) arrayList);
        }
    }

    /* renamed from: b */
    public void mo7171b() {
    }

    /* renamed from: c */
    public C2658c mo7172c() {
        return C2658c.MORE_PANEL;
    }

    /* renamed from: a */
    public C2659d mo7167a(Context context, ExtensionStaticToast extensionStaticToast) {
        if (extensionStaticToast == null) {
            return null;
        }
        String imagePath = extensionStaticToast.getImagePath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = m8971d();
        options.inJustDecodeBounds = false;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeFile(imagePath, options));
        if (bitmapDrawable == null) {
            return null;
        }
        C1950r rVar = new C1950r(context, extensionStaticToast.getGuidePointId(), extensionStaticToast.getId());
        rVar.f6624d = extensionStaticToast.getDisplay();
        rVar.f6625e = bitmapDrawable;
        rVar.f6627g = new C1955w(this, extensionStaticToast);
        return rVar;
    }

    /* renamed from: d */
    private int m8971d() {
        if (!C1368X.m6324d()) {
            return 1;
        }
        int i = (int) ((1.5f / C1368X.m6313b().getResources().getDisplayMetrics().density) + 0.5f);
        if (i == 0) {
            i = 1;
        }
        if (i == 1 || i % 2 == 0) {
            return i;
        }
        return i + 1;
    }

    /* renamed from: a */
    private View.OnClickListener m8967a(C1199d dVar, Context context) {
        return new C1956x(this, dVar, context);
    }
}
