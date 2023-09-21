package p100m.framework.p101a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: m.framework.a.e */
/* compiled from: MultiPart */
public class C4271e extends C4269c {

    /* renamed from: a */
    private ArrayList<C4269c> f17430a = new ArrayList<>();

    /* renamed from: a */
    public C4271e mo15920a(C4269c cVar) throws Throwable {
        this.f17430a.add(cVar);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo15911a() throws Throwable {
        C4272f fVar = new C4272f();
        Iterator<C4269c> it = this.f17430a.iterator();
        while (it.hasNext()) {
            fVar.mo15922a(it.next().mo15911a());
        }
        return fVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C4269c> it = this.f17430a.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo15913b() throws Throwable {
        long j = 0;
        Iterator<C4269c> it = this.f17430a.iterator();
        while (true) {
            long j2 = j;
            if (!it.hasNext()) {
                return j2;
            }
            j = it.next().mo15913b() + j2;
        }
    }
}
