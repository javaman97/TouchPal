package com.cootek.smartinput5.func.component;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Okinawa;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.C2295r;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.component.N */
/* compiled from: HotWordIndexer */
class C1653N implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1648J f5376a;

    C1653N(C1648J j) {
        this.f5376a = j;
    }

    public void run() {
        int i;
        if (!Engine.isInitialized()) {
            if (this.f5376a.f5371y != null) {
                this.f5376a.f5371y.mo6469g();
            }
        } else if (!Engine.getInstance().getIms().isInputViewShown()) {
            int size = this.f5376a.f5362p.size();
            if (size <= 0) {
                if (this.f5376a.f5371y != null) {
                    this.f5376a.f5371y.mo6469g();
                }
                if (Engine.isInitialized()) {
                    Engine.getInstance().getUsrDicChecker().mo6518a(4, true);
                    return;
                }
                return;
            }
            if (Engine.isInitialized()) {
                Engine.getInstance().getUsrDicChecker().mo6518a(4, false);
            }
            C2295r[] rVarArr = new C2295r[size];
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                ArrayList<C2295r.C2296a> p = ((C2295r) this.f5376a.f5362p.get(i4)).mo7904p();
                if (p.size() > 0) {
                    this.f5376a.f5363q.clear();
                }
                Iterator<C2295r.C2296a> it = p.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2295r.C2296a next = it.next();
                    if (this.f5376a.f5363q.size() < 3) {
                        this.f5376a.f5363q.add(next.f10083b);
                    }
                    if (!next.f10084c) {
                        arrayList.add(next);
                        next.f10084c = true;
                        C1648J.m7557f(this.f5376a);
                        i = i3 + 1;
                        if (i >= C1648J.f5351f) {
                            i3 = i;
                            break;
                        }
                    } else {
                        i = i3;
                    }
                    i3 = i;
                }
                C2295r.C2297b q = ((C2295r) this.f5376a.f5362p.get(i4)).mo7905q();
                if (!(q == null || !q.f10089e || q.f10088d == null)) {
                    C1648J.m7530a(this.f5376a, q.f10087c);
                    this.f5376a.f5363q.clear();
                    Iterator<String> it2 = q.f10088d.iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        if (this.f5376a.f5363q.size() < 3) {
                            this.f5376a.f5363q.add(next2);
                        }
                    }
                }
                if (i3 >= C1648J.f5351f) {
                    break;
                }
                rVarArr[i2] = (C2295r) this.f5376a.f5362p.get(i4);
                i2++;
            }
            if (arrayList.size() > 0 && Engine.isInitialized()) {
                Okinawa h = C1368X.m6320c().mo5835h();
                h.fireTransactionOperation(1);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C2295r.C2296a aVar = (C2295r.C2296a) it3.next();
                    h.fireAddUserwordOperation(aVar.f10082a, aVar.f10083b, 6);
                }
                h.fireTransactionOperation(2);
                h.processEvent();
                arrayList.clear();
            }
            for (int i5 = 0; i5 < i2; i5++) {
                if (rVarArr[i5].f9746O != 204) {
                    this.f5376a.m7537a(rVarArr[i5].mo7900j());
                    this.f5376a.m7550b(rVarArr[i5].mo7901m());
                    boolean unused = this.f5376a.f5360n = rVarArr[i5].mo7902n();
                    boolean unused2 = this.f5376a.f5361o = rVarArr[i5].mo7903o();
                }
                this.f5376a.f5362p.remove(rVarArr[i5]);
            }
            if (this.f5376a.f5362p.size() == 0) {
                StringBuilder sb = new StringBuilder();
                Iterator it4 = this.f5376a.f5363q.iterator();
                while (it4.hasNext()) {
                    sb.append((String) it4.next());
                    sb.append(C1974m.m9063a(C1368X.m6313b(), (int) R.string.update_hotword_comma));
                }
                if (sb.length() > 0) {
                    this.f5376a.m7545a(this.f5376a.m7532a(C1368X.m6313b(), (int) R.string.update_hotword_done, Integer.valueOf(this.f5376a.f5369w), sb.toString()), this.f5376a.f5360n, this.f5376a.f5361o);
                }
                int unused3 = this.f5376a.f5369w = 0;
                this.f5376a.f5362p.clear();
                this.f5376a.f5363q.clear();
                if (Engine.isInitialized()) {
                    Engine.getInstance().getUsrDicChecker().mo6518a(4, true);
                    return;
                }
                return;
            }
            this.f5376a.mo6460a(!this.f5376a.f5359m);
        }
    }
}
