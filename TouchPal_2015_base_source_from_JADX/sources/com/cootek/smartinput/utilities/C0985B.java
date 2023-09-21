package com.cootek.smartinput.utilities;

import java.util.LinkedList;

/* renamed from: com.cootek.smartinput.utilities.B */
/* compiled from: Worker */
public abstract class C0985B implements Runnable {

    /* renamed from: e */
    private static final String f2550e = "worker";

    /* renamed from: a */
    boolean f2551a = false;

    /* renamed from: b */
    protected int f2552b;

    /* renamed from: c */
    protected boolean f2553c = false;

    /* renamed from: d */
    LinkedList<Object> f2554d = new LinkedList<>();

    /* renamed from: g */
    public abstract void mo4036g();

    /* renamed from: a */
    public int mo4026a() {
        return this.f2552b;
    }

    /* renamed from: b */
    public boolean mo4031b() {
        return this.f2551a;
    }

    /* renamed from: a */
    public void mo4029a(boolean z) {
        this.f2551a = z;
    }

    /* renamed from: c */
    public void mo4032c() {
        this.f2553c = true;
    }

    /* renamed from: d */
    public boolean mo4033d() {
        return this.f2553c;
    }

    public void run() {
        LinkedList<Object> linkedList = this.f2554d;
        while (true) {
            Object poll = linkedList.poll();
            if (poll != null) {
                if (!mo4033d()) {
                    mo4030b(poll);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo4027a(Object obj) {
        mo4028a(obj, false);
    }

    /* renamed from: a */
    public void mo4028a(Object obj, boolean z) {
        if (z && this.f2554d.size() > 0) {
            this.f2554d.clear();
        }
        this.f2554d.offer(obj);
    }

    /* renamed from: e */
    public Object mo4034e() {
        return this.f2554d.poll();
    }

    /* renamed from: b */
    public void mo4030b(Object obj) {
    }

    /* renamed from: f */
    public void mo4035f() {
        this.f2553c = false;
        this.f2551a = true;
    }
}
