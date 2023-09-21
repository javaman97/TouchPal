package p018cn.sharesdk.framework.p019a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: cn.sharesdk.framework.a.e */
public class C0614e extends C0612c {

    /* renamed from: a */
    private ArrayList<C0612c> f1473a = new ArrayList<>();

    /* renamed from: a */
    public C0614e mo2189a(C0612c cVar) {
        this.f1473a.add(cVar);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo2181a() {
        C0615f fVar = new C0615f();
        Iterator<C0612c> it = this.f1473a.iterator();
        while (it.hasNext()) {
            fVar.mo2191a(it.next().mo2181a());
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo2182b() {
        long j = 0;
        Iterator<C0612c> it = this.f1473a.iterator();
        while (true) {
            long j2 = j;
            if (!it.hasNext()) {
                return j2;
            }
            j = it.next().mo2182b() + j2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C0612c> it = this.f1473a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        return sb.toString();
    }
}
