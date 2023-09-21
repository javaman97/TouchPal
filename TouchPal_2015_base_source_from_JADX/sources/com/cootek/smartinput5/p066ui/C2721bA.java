package com.cootek.smartinput5.p066ui;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.cootek.smartinput5.ui.bA */
/* compiled from: PopupDialogManager */
public class C2721bA {

    /* renamed from: a */
    private static final C2721bA f12152a = new C2721bA();

    /* renamed from: b */
    private CopyOnWriteArraySet<C2773bx> f12153b = new CopyOnWriteArraySet<>();

    private C2721bA() {
    }

    /* renamed from: a */
    public static C2721bA m12494a() {
        return f12152a;
    }

    /* renamed from: b */
    public boolean mo8991b() {
        Iterator<C2773bx> it = this.f12153b.iterator();
        while (it.hasNext()) {
            if (it.next().mo9092c_()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo8992c() {
        Iterator<C2773bx> it = this.f12153b.iterator();
        while (it.hasNext()) {
            it.next().mo9091b_();
        }
        this.f12153b.clear();
    }

    /* renamed from: a */
    public void mo8989a(C2773bx bxVar) {
        if (bxVar != null) {
            this.f12153b.add(bxVar);
        }
    }

    /* renamed from: b */
    public void mo8990b(C2773bx bxVar) {
        if (bxVar != null) {
            this.f12153b.remove(bxVar);
        }
    }
}
