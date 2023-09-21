package com.p023a.p024a.p032b.p033a.p034a;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.a.a.b.a.a.a */
/* compiled from: BlockingDeque */
public interface C0744a<E> extends C0745b<E>, BlockingQueue<E> {
    /* renamed from: a */
    E mo2764a() throws InterruptedException;

    /* renamed from: a */
    E mo2765a(long j, TimeUnit timeUnit) throws InterruptedException;

    /* renamed from: a */
    void mo2766a(E e);

    /* renamed from: a */
    boolean mo2767a(E e, long j, TimeUnit timeUnit) throws InterruptedException;

    boolean add(E e);

    /* renamed from: b */
    E mo2769b() throws InterruptedException;

    /* renamed from: b */
    E mo2770b(long j, TimeUnit timeUnit) throws InterruptedException;

    /* renamed from: b */
    void mo2771b(E e);

    /* renamed from: b */
    boolean mo2772b(E e, long j, TimeUnit timeUnit) throws InterruptedException;

    /* renamed from: c */
    boolean mo2773c(E e);

    boolean contains(Object obj);

    /* renamed from: d */
    boolean mo2775d(E e);

    /* renamed from: e */
    void mo2776e(E e) throws InterruptedException;

    E element();

    /* renamed from: f */
    void mo2778f(E e) throws InterruptedException;

    /* renamed from: g */
    boolean mo2779g(Object obj);

    /* renamed from: h */
    boolean mo2780h(Object obj);

    /* renamed from: i */
    void mo2781i(E e);

    Iterator<E> iterator();

    boolean offer(E e);

    boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException;

    E peek();

    E poll();

    E poll(long j, TimeUnit timeUnit) throws InterruptedException;

    void put(E e) throws InterruptedException;

    E remove();

    boolean remove(Object obj);

    int size();

    E take() throws InterruptedException;
}
