package android.support.p001v4.p016k;

import java.util.Map;

/* renamed from: android.support.v4.k.b */
/* compiled from: ArrayMap */
class C0299b extends C0307j<K, V> {

    /* renamed from: a */
    final /* synthetic */ C0298a f748a;

    C0299b(C0298a aVar) {
        this.f748a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo866a() {
        return this.f748a.f801h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo868a(int i, int i2) {
        return this.f748a.f800g[(i << 1) + i2];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo867a(Object obj) {
        return obj == null ? this.f748a.mo992a() : this.f748a.mo994a(obj, obj.hashCode());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo872b(Object obj) {
        return this.f748a.mo993a(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Map<K, V> mo873b() {
        return this.f748a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo871a(K k, V v) {
        this.f748a.put(k, v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public V mo869a(int i, V v) {
        return this.f748a.mo995a(i, v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo870a(int i) {
        this.f748a.mo1003d(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo874c() {
        this.f748a.clear();
    }
}
