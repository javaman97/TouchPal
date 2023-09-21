package com.p023a.p024a.p032b.p033a.p034a;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.a.a.b.a.a.d */
/* compiled from: LinkedBlockingDeque */
public class C0747d<E> extends AbstractQueue<E> implements C0744a<E>, Serializable {

    /* renamed from: d */
    private static final long f1832d = -387911632671998426L;

    /* renamed from: a */
    transient C0752d<E> f1833a;

    /* renamed from: b */
    transient C0752d<E> f1834b;

    /* renamed from: c */
    final ReentrantLock f1835c;

    /* renamed from: e */
    private transient int f1836e;

    /* renamed from: f */
    private final int f1837f;

    /* renamed from: g */
    private final Condition f1838g;

    /* renamed from: h */
    private final Condition f1839h;

    /* renamed from: com.a.a.b.a.a.d$d */
    /* compiled from: LinkedBlockingDeque */
    static final class C0752d<E> {

        /* renamed from: a */
        E f1846a;

        /* renamed from: b */
        C0752d<E> f1847b;

        /* renamed from: c */
        C0752d<E> f1848c;

        C0752d(E e) {
            this.f1846a = e;
        }
    }

    public C0747d() {
        this(Integer.MAX_VALUE);
    }

    public C0747d(int i) {
        this.f1835c = new ReentrantLock();
        this.f1838g = this.f1835c.newCondition();
        this.f1839h = this.f1835c.newCondition();
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.f1837f = i;
    }

    public C0747d(Collection<? extends E> collection) {
        this(Integer.MAX_VALUE);
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            for (Object next : collection) {
                if (next == null) {
                    throw new NullPointerException();
                } else if (!m4253c(new C0752d(next))) {
                    throw new IllegalStateException("Deque full");
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    private boolean m4252b(C0752d<E> dVar) {
        if (this.f1836e >= this.f1837f) {
            return false;
        }
        C0752d<E> dVar2 = this.f1833a;
        dVar.f1848c = dVar2;
        this.f1833a = dVar;
        if (this.f1834b == null) {
            this.f1834b = dVar;
        } else {
            dVar2.f1847b = dVar;
        }
        this.f1836e++;
        this.f1838g.signal();
        return true;
    }

    /* renamed from: c */
    private boolean m4253c(C0752d<E> dVar) {
        if (this.f1836e >= this.f1837f) {
            return false;
        }
        C0752d<E> dVar2 = this.f1834b;
        dVar.f1847b = dVar2;
        this.f1834b = dVar;
        if (this.f1833a == null) {
            this.f1833a = dVar;
        } else {
            dVar2.f1848c = dVar;
        }
        this.f1836e++;
        this.f1838g.signal();
        return true;
    }

    /* renamed from: m */
    private E m4254m() {
        C0752d<E> dVar = this.f1833a;
        if (dVar == null) {
            return null;
        }
        C0752d<E> dVar2 = dVar.f1848c;
        E e = dVar.f1846a;
        dVar.f1846a = null;
        dVar.f1848c = dVar;
        this.f1833a = dVar2;
        if (dVar2 == null) {
            this.f1834b = null;
        } else {
            dVar2.f1847b = null;
        }
        this.f1836e--;
        this.f1839h.signal();
        return e;
    }

    /* renamed from: n */
    private E m4255n() {
        C0752d<E> dVar = this.f1834b;
        if (dVar == null) {
            return null;
        }
        C0752d<E> dVar2 = dVar.f1847b;
        E e = dVar.f1846a;
        dVar.f1846a = null;
        dVar.f1847b = dVar;
        this.f1834b = dVar2;
        if (dVar2 == null) {
            this.f1833a = null;
        } else {
            dVar2.f1848c = null;
        }
        this.f1836e--;
        this.f1839h.signal();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2803a(C0752d<E> dVar) {
        C0752d<E> dVar2 = dVar.f1847b;
        C0752d<E> dVar3 = dVar.f1848c;
        if (dVar2 == null) {
            m4254m();
        } else if (dVar3 == null) {
            m4255n();
        } else {
            dVar2.f1848c = dVar3;
            dVar3.f1847b = dVar2;
            dVar.f1846a = null;
            this.f1836e--;
            this.f1839h.signal();
        }
    }

    /* renamed from: a */
    public void mo2766a(E e) {
        if (!mo2773c(e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    /* renamed from: b */
    public void mo2771b(E e) {
        if (!mo2775d(e)) {
            throw new IllegalStateException("Deque full");
        }
    }

    /* renamed from: c */
    public boolean mo2773c(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        C0752d dVar = new C0752d(e);
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            return m4252b(dVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d */
    public boolean mo2775d(E e) {
        if (e == null) {
            throw new NullPointerException();
        }
        C0752d dVar = new C0752d(e);
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            return m4253c(dVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: e */
    public void mo2776e(E e) throws InterruptedException {
        if (e == null) {
            throw new NullPointerException();
        }
        C0752d dVar = new C0752d(e);
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        while (!m4252b(dVar)) {
            try {
                this.f1839h.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: f */
    public void mo2778f(E e) throws InterruptedException {
        if (e == null) {
            throw new NullPointerException();
        }
        C0752d dVar = new C0752d(e);
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        while (!m4253c(dVar)) {
            try {
                this.f1839h.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public boolean mo2767a(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        if (e == null) {
            throw new NullPointerException();
        }
        C0752d dVar = new C0752d(e);
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lockInterruptibly();
        while (!m4252b(dVar)) {
            try {
                if (nanos <= 0) {
                    return false;
                }
                nanos = this.f1839h.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        reentrantLock.unlock();
        return true;
    }

    /* renamed from: b */
    public boolean mo2772b(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        if (e == null) {
            throw new NullPointerException();
        }
        C0752d dVar = new C0752d(e);
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lockInterruptibly();
        while (!m4253c(dVar)) {
            try {
                if (nanos <= 0) {
                    return false;
                }
                nanos = this.f1839h.awaitNanos(nanos);
            } finally {
                reentrantLock.unlock();
            }
        }
        reentrantLock.unlock();
        return true;
    }

    /* renamed from: c */
    public E mo2793c() {
        E e = mo2795e();
        if (e != null) {
            return e;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public E mo2794d() {
        E f = mo2796f();
        if (f != null) {
            return f;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public E mo2795e() {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            return m4254m();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: f */
    public E mo2796f() {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            return m4255n();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public E mo2764a() throws InterruptedException {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        while (true) {
            try {
                E m = m4254m();
                if (m != null) {
                    return m;
                }
                this.f1838g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: b */
    public E mo2769b() throws InterruptedException {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        while (true) {
            try {
                E n = m4255n();
                if (n != null) {
                    return n;
                }
                this.f1838g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: a */
    public E mo2765a(long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                long j2 = nanos;
                E m = m4254m();
                if (m != null) {
                    reentrantLock.unlock();
                    return m;
                } else if (j2 <= 0) {
                    return null;
                } else {
                    nanos = this.f1838g.awaitNanos(j2);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: b */
    public E mo2770b(long j, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j);
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                long j2 = nanos;
                E n = m4255n();
                if (n != null) {
                    reentrantLock.unlock();
                    return n;
                } else if (j2 <= 0) {
                    return null;
                } else {
                    nanos = this.f1838g.awaitNanos(j2);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: g */
    public E mo2797g() {
        E i = mo2799i();
        if (i != null) {
            return i;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: h */
    public E mo2798h() {
        E j = mo2800j();
        if (j != null) {
            return j;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: i */
    public E mo2799i() {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            return this.f1833a == null ? null : this.f1833a.f1846a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: j */
    public E mo2800j() {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            return this.f1834b == null ? null : this.f1834b.f1846a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g */
    public boolean mo2779g(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            for (C0752d<E> dVar = this.f1833a; dVar != null; dVar = dVar.f1848c) {
                if (obj.equals(dVar.f1846a)) {
                    mo2803a(dVar);
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: h */
    public boolean mo2780h(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            for (C0752d<E> dVar = this.f1834b; dVar != null; dVar = dVar.f1847b) {
                if (obj.equals(dVar.f1846a)) {
                    mo2803a(dVar);
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean add(E e) {
        mo2771b(e);
        return true;
    }

    public boolean offer(E e) {
        return mo2775d(e);
    }

    public void put(E e) throws InterruptedException {
        mo2778f(e);
    }

    public boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo2772b(e, j, timeUnit);
    }

    public E remove() {
        return mo2793c();
    }

    public E poll() {
        return mo2795e();
    }

    public E take() throws InterruptedException {
        return mo2764a();
    }

    public E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo2765a(j, timeUnit);
    }

    public E element() {
        return mo2797g();
    }

    public E peek() {
        return mo2799i();
    }

    public int remainingCapacity() {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            return this.f1837f - this.f1836e;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        return drainTo(collection, Integer.MAX_VALUE);
    }

    public int drainTo(Collection<? super E> collection, int i) {
        if (collection == null) {
            throw new NullPointerException();
        } else if (collection == this) {
            throw new IllegalArgumentException();
        } else {
            ReentrantLock reentrantLock = this.f1835c;
            reentrantLock.lock();
            try {
                int min = Math.min(i, this.f1836e);
                for (int i2 = 0; i2 < min; i2++) {
                    collection.add(this.f1833a.f1846a);
                    m4254m();
                }
                return min;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: i */
    public void mo2781i(E e) {
        mo2766a(e);
    }

    /* renamed from: k */
    public E mo2801k() {
        return mo2793c();
    }

    public boolean remove(Object obj) {
        return mo2779g(obj);
    }

    public int size() {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            return this.f1836e;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            for (C0752d<E> dVar = this.f1833a; dVar != null; dVar = dVar.f1848c) {
                if (obj.equals(dVar.f1846a)) {
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public Object[] toArray() {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            Object[] objArr = new Object[this.f1836e];
            int i = 0;
            C0752d<E> dVar = this.f1833a;
            while (dVar != null) {
                int i2 = i + 1;
                objArr[i] = dVar.f1846a;
                dVar = dVar.f1848c;
                i = i2;
            }
            return objArr;
        } finally {
            reentrantLock.unlock();
        }
    }

    public <T> T[] toArray(T[] tArr) {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            int length = tArr.length;
            T[] tArr2 = tArr;
            if (length < this.f1836e) {
                tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1836e);
            }
            int i = 0;
            C0752d<E> dVar = this.f1833a;
            while (dVar != null) {
                tArr2[i] = dVar.f1846a;
                dVar = dVar.f1848c;
                i++;
            }
            if (tArr2.length > i) {
                tArr2[i] = null;
            }
            return tArr2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public String toString() {
        String sb;
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            C0752d<E> dVar = this.f1833a;
            if (dVar == null) {
                sb = "[]";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                while (true) {
                    C0752d<E> dVar2 = dVar;
                    E e = dVar2.f1846a;
                    if (e == this) {
                        e = "(this Collection)";
                    }
                    sb2.append(e);
                    dVar = dVar2.f1848c;
                    if (dVar == null) {
                        break;
                    }
                    sb2.append(',').append(' ');
                }
                sb = sb2.append(']').toString();
                reentrantLock.unlock();
            }
            return sb;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void clear() {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            C0752d<E> dVar = this.f1833a;
            while (dVar != null) {
                dVar.f1846a = null;
                C0752d<E> dVar2 = dVar.f1848c;
                dVar.f1847b = null;
                dVar.f1848c = null;
                dVar = dVar2;
            }
            this.f1834b = null;
            this.f1833a = null;
            this.f1836e = 0;
            this.f1839h.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public Iterator<E> iterator() {
        return new C0751c();
    }

    /* renamed from: l */
    public Iterator<E> mo2802l() {
        return new C0750b();
    }

    /* renamed from: com.a.a.b.a.a.d$a */
    /* compiled from: LinkedBlockingDeque */
    private abstract class C0749a implements Iterator<E> {

        /* renamed from: a */
        C0752d<E> f1840a;

        /* renamed from: b */
        E f1841b;

        /* renamed from: d */
        private C0752d<E> f1843d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0752d<E> mo2811a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0752d<E> mo2812a(C0752d<E> dVar);

        C0749a() {
            ReentrantLock reentrantLock = C0747d.this.f1835c;
            reentrantLock.lock();
            try {
                this.f1840a = mo2811a();
                this.f1841b = this.f1840a == null ? null : this.f1840a.f1846a;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: b */
        private C0752d<E> m4282b(C0752d<E> dVar) {
            while (true) {
                C0752d<E> a = mo2812a(dVar);
                if (a == null) {
                    return null;
                }
                if (a.f1846a != null) {
                    return a;
                }
                if (a == dVar) {
                    return mo2811a();
                }
                dVar = a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2813b() {
            ReentrantLock reentrantLock = C0747d.this.f1835c;
            reentrantLock.lock();
            try {
                this.f1840a = m4282b(this.f1840a);
                this.f1841b = this.f1840a == null ? null : this.f1840a.f1846a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public boolean hasNext() {
            return this.f1840a != null;
        }

        public E next() {
            if (this.f1840a == null) {
                throw new NoSuchElementException();
            }
            this.f1843d = this.f1840a;
            E e = this.f1841b;
            mo2813b();
            return e;
        }

        public void remove() {
            C0752d<E> dVar = this.f1843d;
            if (dVar == null) {
                throw new IllegalStateException();
            }
            this.f1843d = null;
            ReentrantLock reentrantLock = C0747d.this.f1835c;
            reentrantLock.lock();
            try {
                if (dVar.f1846a != null) {
                    C0747d.this.mo2803a(dVar);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: com.a.a.b.a.a.d$c */
    /* compiled from: LinkedBlockingDeque */
    private class C0751c extends C0749a {
        private C0751c() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0752d<E> mo2811a() {
            return C0747d.this.f1833a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0752d<E> mo2812a(C0752d<E> dVar) {
            return dVar.f1848c;
        }
    }

    /* renamed from: com.a.a.b.a.a.d$b */
    /* compiled from: LinkedBlockingDeque */
    private class C0750b extends C0749a {
        private C0750b() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0752d<E> mo2811a() {
            return C0747d.this.f1834b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0752d<E> mo2812a(C0752d<E> dVar) {
            return dVar.f1847b;
        }
    }

    /* renamed from: a */
    private void m4251a(ObjectOutputStream objectOutputStream) throws IOException {
        ReentrantLock reentrantLock = this.f1835c;
        reentrantLock.lock();
        try {
            objectOutputStream.defaultWriteObject();
            for (C0752d<E> dVar = this.f1833a; dVar != null; dVar = dVar.f1848c) {
                objectOutputStream.writeObject(dVar.f1846a);
            }
            objectOutputStream.writeObject((Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    private void m4250a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f1836e = 0;
        this.f1833a = null;
        this.f1834b = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                add(readObject);
            } else {
                return;
            }
        }
    }
}
