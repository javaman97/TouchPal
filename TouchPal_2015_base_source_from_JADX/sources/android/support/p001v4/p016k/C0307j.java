package android.support.p001v4.p016k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.k.j */
/* compiled from: MapCollections */
abstract class C0307j<K, V> {

    /* renamed from: b */
    C0307j<K, V>.b f773b;

    /* renamed from: c */
    C0307j<K, V>.c f774c;

    /* renamed from: d */
    C0307j<K, V>.e f775d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo866a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo867a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo868a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo869a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo870a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo871a(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo872b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo873b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo874c();

    C0307j() {
    }

    /* renamed from: android.support.v4.k.j$a */
    /* compiled from: MapCollections */
    final class C0308a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f776a;

        /* renamed from: b */
        int f777b;

        /* renamed from: c */
        int f778c;

        /* renamed from: d */
        boolean f779d = false;

        C0308a(int i) {
            this.f776a = i;
            this.f777b = C0307j.this.mo866a();
        }

        public boolean hasNext() {
            return this.f778c < this.f777b;
        }

        public T next() {
            T a = C0307j.this.mo868a(this.f778c, this.f776a);
            this.f778c++;
            this.f779d = true;
            return a;
        }

        public void remove() {
            if (!this.f779d) {
                throw new IllegalStateException();
            }
            this.f778c--;
            this.f777b--;
            this.f779d = false;
            C0307j.this.mo870a(this.f778c);
        }
    }

    /* renamed from: android.support.v4.k.j$d */
    /* compiled from: MapCollections */
    final class C0311d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f783a;

        /* renamed from: b */
        int f784b;

        /* renamed from: c */
        boolean f785c = false;

        C0311d() {
            this.f783a = C0307j.this.mo866a() - 1;
            this.f784b = -1;
        }

        public boolean hasNext() {
            return this.f784b < this.f783a;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            this.f784b++;
            this.f785c = true;
            return this;
        }

        public void remove() {
            if (!this.f785c) {
                throw new IllegalStateException();
            }
            C0307j.this.mo870a(this.f784b);
            this.f784b--;
            this.f783a--;
            this.f785c = false;
        }

        public K getKey() {
            if (this.f785c) {
                return C0307j.this.mo868a(this.f784b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f785c) {
                return C0307j.this.mo868a(this.f784b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V setValue(V v) {
            if (this.f785c) {
                return C0307j.this.mo869a(this.f784b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (!this.f785c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C0302e.m1212a(entry.getKey(), C0307j.this.mo868a(this.f784b, 0)) || !C0302e.m1212a(entry.getValue(), C0307j.this.mo868a(this.f784b, 1))) {
                    z = false;
                }
                return z;
            }
        }

        public final int hashCode() {
            int i = 0;
            if (!this.f785c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object a = C0307j.this.mo868a(this.f784b, 0);
            Object a2 = C0307j.this.mo868a(this.f784b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: android.support.v4.k.j$b */
    /* compiled from: MapCollections */
    final class C0309b implements Set<Map.Entry<K, V>> {
        C0309b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a = C0307j.this.mo866a();
            for (Map.Entry entry : collection) {
                C0307j.this.mo871a(entry.getKey(), entry.getValue());
            }
            return a != C0307j.this.mo866a();
        }

        public void clear() {
            C0307j.this.mo874c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C0307j.this.mo867a(entry.getKey());
            if (a >= 0) {
                return C0302e.m1212a(C0307j.this.mo868a(a, 1), entry.getValue());
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0307j.this.mo866a() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0311d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0307j.this.mo866a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return C0307j.m1251a(this, obj);
        }

        public int hashCode() {
            int a = C0307j.this.mo866a() - 1;
            int i = 0;
            while (a >= 0) {
                Object a2 = C0307j.this.mo868a(a, 0);
                Object a3 = C0307j.this.mo868a(a, 1);
                a--;
                i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }
    }

    /* renamed from: android.support.v4.k.j$c */
    /* compiled from: MapCollections */
    final class C0310c implements Set<K> {
        C0310c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0307j.this.mo874c();
        }

        public boolean contains(Object obj) {
            return C0307j.this.mo867a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0307j.m1250a(C0307j.this.mo873b(), collection);
        }

        public boolean isEmpty() {
            return C0307j.this.mo866a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0308a(0);
        }

        public boolean remove(Object obj) {
            int a = C0307j.this.mo867a(obj);
            if (a < 0) {
                return false;
            }
            C0307j.this.mo870a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0307j.m1252b(C0307j.this.mo873b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0307j.m1253c(C0307j.this.mo873b(), collection);
        }

        public int size() {
            return C0307j.this.mo866a();
        }

        public Object[] toArray() {
            return C0307j.this.mo929b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0307j.this.mo928a(tArr, 0);
        }

        public boolean equals(Object obj) {
            return C0307j.m1251a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = C0307j.this.mo866a() - 1; a >= 0; a--) {
                Object a2 = C0307j.this.mo868a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }
    }

    /* renamed from: android.support.v4.k.j$e */
    /* compiled from: MapCollections */
    final class C0312e implements Collection<V> {
        C0312e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0307j.this.mo874c();
        }

        public boolean contains(Object obj) {
            return C0307j.this.mo872b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0307j.this.mo866a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0308a(1);
        }

        public boolean remove(Object obj) {
            int b = C0307j.this.mo872b(obj);
            if (b < 0) {
                return false;
            }
            C0307j.this.mo870a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a = C0307j.this.mo866a();
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0307j.this.mo868a(i, 1))) {
                    C0307j.this.mo870a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            int a = C0307j.this.mo866a();
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0307j.this.mo868a(i, 1))) {
                    C0307j.this.mo870a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0307j.this.mo866a();
        }

        public Object[] toArray() {
            return C0307j.this.mo929b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0307j.this.mo928a(tArr, 1);
        }
    }

    /* renamed from: a */
    public static <K, V> boolean m1250a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m1252b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m1253c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: b */
    public Object[] mo929b(int i) {
        int a = mo866a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo868a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public <T> T[] mo928a(T[] tArr, int i) {
        T[] tArr2;
        int a = mo866a();
        if (tArr.length < a) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        } else {
            tArr2 = tArr;
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = mo868a(i2, i);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    /* renamed from: a */
    public static <T> boolean m1251a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                z = false;
            }
            return z;
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    /* renamed from: d */
    public Set<Map.Entry<K, V>> mo930d() {
        if (this.f773b == null) {
            this.f773b = new C0309b();
        }
        return this.f773b;
    }

    /* renamed from: e */
    public Set<K> mo931e() {
        if (this.f774c == null) {
            this.f774c = new C0310c();
        }
        return this.f774c;
    }

    /* renamed from: f */
    public Collection<V> mo932f() {
        if (this.f775d == null) {
            this.f775d = new C0312e();
        }
        return this.f775d;
    }
}
