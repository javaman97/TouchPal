package android.support.p001v4.p016k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.k.a */
/* compiled from: ArrayMap */
public class C0298a<K, V> extends C0317l<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0307j<K, V> f747a;

    public C0298a() {
    }

    public C0298a(int i) {
        super(i);
    }

    public C0298a(C0317l lVar) {
        super(lVar);
    }

    /* renamed from: b */
    private C0307j<K, V> m1178b() {
        if (this.f747a == null) {
            this.f747a = new C0299b(this);
        }
        return this.f747a;
    }

    /* renamed from: a */
    public boolean mo859a(Collection<?> collection) {
        return C0307j.m1250a(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo996a(this.f801h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    /* renamed from: b */
    public boolean mo860b(Collection<?> collection) {
        return C0307j.m1252b(this, collection);
    }

    /* renamed from: c */
    public boolean mo861c(Collection<?> collection) {
        return C0307j.m1253c(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m1178b().mo930d();
    }

    public Set<K> keySet() {
        return m1178b().mo931e();
    }

    public Collection<V> values() {
        return m1178b().mo932f();
    }
}
