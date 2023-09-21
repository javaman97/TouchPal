package p100m.framework.p103ui.widget.slidingmenu;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m.framework.ui.widget.slidingmenu.l */
/* compiled from: SlidingMenuGroup */
final class C4327l {

    /* renamed from: a */
    int f17570a;

    /* renamed from: b */
    String f17571b;

    /* renamed from: c */
    private ArrayList<C4328m> f17572c = new ArrayList<>();

    C4327l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16094a(C4328m mVar) {
        if (mVar != null) {
            C4328m a = mo16093a(mVar.f17574b);
            mVar.f17573a = this.f17570a;
            if (a == null) {
                this.f17572c.add(mVar);
                return;
            }
            int indexOf = this.f17572c.indexOf(a);
            this.f17572c.remove(indexOf);
            this.f17572c.add(indexOf, mVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4328m mo16093a(int i) {
        if (this.f17572c == null) {
            return null;
        }
        Iterator<C4328m> it = this.f17572c.iterator();
        while (it.hasNext()) {
            C4328m next = it.next();
            if (next != null && next.f17574b == i) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16092a() {
        if (this.f17572c == null) {
            return 0;
        }
        return this.f17572c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4328m mo16095b(int i) {
        return this.f17572c.get(i);
    }
}
