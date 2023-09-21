package p100m.framework.p103ui.widget.slidingmenu;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m.framework.ui.widget.slidingmenu.a */
/* compiled from: MenuAdapter */
public abstract class C4316a {

    /* renamed from: a */
    private ArrayList<C4327l> f17548a = new ArrayList<>();

    /* renamed from: a */
    public abstract View mo16070a(int i, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract View mo16071a(C4328m mVar, ViewGroup viewGroup);

    public C4316a(SlidingMenu slidingMenu) {
    }

    /* renamed from: c */
    private C4327l m18072c(int i) {
        if (this.f17548a == null) {
            return null;
        }
        Iterator<C4327l> it = this.f17548a.iterator();
        while (it.hasNext()) {
            C4327l next = it.next();
            if (next != null && next.f17570a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo16074a(int i, String str) {
        C4327l c = m18072c(i);
        if (c == null) {
            c = new C4327l();
            c.f17570a = i;
            this.f17548a.add(c);
        }
        c.f17571b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16076a(C4327l lVar) {
        if (lVar != null) {
            C4327l c = m18072c(lVar.f17570a);
            if (c == null) {
                this.f17548a.add(lVar);
                return;
            }
            int indexOf = this.f17548a.indexOf(c);
            this.f17548a.remove(indexOf);
            this.f17548a.add(indexOf, lVar);
        }
    }

    /* renamed from: a */
    public void mo16075a(int i, C4328m mVar) {
        C4327l c;
        if (mVar != null && (c = m18072c(i)) != null) {
            c.mo16094a(mVar);
        }
    }

    /* renamed from: a */
    public View mo16069a() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo16079b() {
        if (this.f17548a == null) {
            return 0;
        }
        return this.f17548a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4327l mo16072a(int i) {
        return this.f17548a.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo16080b(int i) {
        return this.f17548a.get(i).f17571b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4328m mo16073a(int i, int i2) {
        return this.f17548a.get(i).mo16095b(i2);
    }

    /* renamed from: a */
    public void mo16077a(C4328m mVar) {
    }

    /* renamed from: b */
    public boolean mo16082b(C4328m mVar) {
        return false;
    }

    /* renamed from: a */
    public void mo16078a(boolean z) {
    }

    /* renamed from: b */
    public C4328m mo16081b(int i, int i2) {
        C4327l c = m18072c(i);
        if (c == null) {
            return null;
        }
        return c.mo16093a(i2);
    }
}
