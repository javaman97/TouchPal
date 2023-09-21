package com.cootek.smartinput5.func.nativeads;

import android.text.TextUtils;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.nativeads.C1876b;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.cootek.smartinput5.net.cmd.C2294q;
import com.cootek.smartinput5.p048d.C1246d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.cootek.smartinput5.func.nativeads.r */
/* compiled from: NativeAdsLoader */
public class C1894r extends C1876b {

    /* renamed from: b */
    protected CopyOnWriteArrayList<C1875a> f6340b = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1876b.C1877a f6341c;

    public C1894r(C1902y yVar) {
        super(yVar);
    }

    /* renamed from: a */
    public void mo7002a() {
        this.f6340b.clear();
        mo7032a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7032a(boolean z) {
        C2294q qVar = new C2294q();
        qVar.f10055a = this.f6259a.f6436b;
        qVar.f10056b = this.f6259a.f6438d;
        if (z) {
            qVar.f10057c = "default";
        }
        new C2373x(qVar).mo8060a((C2373x.C2376b) new C1895s(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7014a(C2259P p) {
        C1900w j = ((C2294q) p).mo7898j();
        if (j != null) {
            this.f6340b.clear();
            this.f6340b.addAll(j.mo7044c());
            if (this.f6341c != null) {
                this.f6341c.mo7008a();
            }
            mo7033f();
        } else if (this.f6341c != null) {
            this.f6341c.mo7009b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7015d() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1875a> it = this.f6340b.iterator();
        while (it.hasNext()) {
            C1875a next = it.next();
            if (mo7006b(next.f6258f)) {
                arrayList.add(next);
            }
        }
        this.f6340b.removeAll(arrayList);
    }

    /* renamed from: b */
    public C1875a mo7005b() {
        if (this.f6340b.size() == 0) {
            return null;
        }
        C1875a remove = this.f6340b.remove(0);
        remove.f6257e = this.f6259a;
        if (remove == null) {
            return remove;
        }
        this.f6340b.add(remove);
        return remove;
    }

    /* renamed from: a */
    public void mo7003a(C1876b.C1877a aVar) {
        this.f6341c = aVar;
    }

    /* renamed from: c */
    public void mo7007c() {
        this.f6340b.clear();
    }

    /* renamed from: a */
    public void mo7004a(String str) {
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            Iterator<C1875a> it = this.f6340b.iterator();
            while (it.hasNext()) {
                C1875a next = it.next();
                if (str.equalsIgnoreCase(next.f6258f)) {
                    next.mo6998b();
                    arrayList.add(next);
                    C1246d.m6010a(C1368X.m6313b()).mo4591a(C1246d.f3912df, next.f6255c, C1246d.f3908db);
                }
            }
            this.f6340b.removeAll(arrayList);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo7033f() {
        String[] list;
        ArrayList arrayList = new ArrayList();
        Iterator<C1875a> it = this.f6340b.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1888m) it.next()).mo7023d());
        }
        File a = C1358O.m6234a(C1358O.f4201l);
        if (a != null && (list = a.list()) != null) {
            for (String str : list) {
                if (str.startsWith(mo7016e())) {
                    File file = new File(a, str);
                    String absolutePath = file.getAbsolutePath();
                    if (file.isFile() && file.exists() && !arrayList.contains(absolutePath)) {
                        file.delete();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7016e() {
        return C1888m.f6301g + this.f6259a.f6436b;
    }
}
