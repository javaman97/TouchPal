package com.cootek.smartinput5.func;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.f */
/* compiled from: AnimationHeartBeatManager */
public class C1716f {

    /* renamed from: a */
    public static final int f5616a = 0;

    /* renamed from: h */
    private static final int f5617h = 50;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f5618b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1718a f5619c = new C1718a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C1719b> f5620d = new ArrayList<>();

    /* renamed from: e */
    private C1720c f5621e;

    /* renamed from: f */
    private int f5622f = 0;

    /* renamed from: g */
    private boolean f5623g = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f5624i;

    /* renamed from: com.cootek.smartinput5.func.f$c */
    /* compiled from: AnimationHeartBeatManager */
    public interface C1720c {
        /* renamed from: a */
        void mo6642a();

        /* renamed from: a */
        void mo6643a(int i);

        /* renamed from: b */
        void mo6644b(int i);
    }

    /* renamed from: e */
    static /* synthetic */ int m7910e(C1716f fVar) {
        int i = fVar.f5624i;
        fVar.f5624i = i + 1;
        return i;
    }

    /* renamed from: com.cootek.smartinput5.func.f$b */
    /* compiled from: AnimationHeartBeatManager */
    public static class C1719b {

        /* renamed from: a */
        public boolean f5626a = false;

        /* renamed from: a */
        public void mo6641a() {
        }
    }

    /* renamed from: a */
    public void mo6632a(int i) {
        if (this.f5621e != null) {
            this.f5621e.mo6644b(i);
        }
    }

    /* renamed from: a */
    public void mo6634a(C1719b bVar, boolean z) {
        this.f5623g = z;
        if (!this.f5620d.contains(bVar) && !bVar.f5626a) {
            this.f5622f++;
            this.f5620d.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo6633a(C1719b bVar) {
        if (bVar != null && this.f5620d.contains(bVar)) {
            this.f5620d.remove(bVar);
            this.f5622f--;
            if (this.f5620d.isEmpty() && this.f5621e != null) {
                if (this.f5623g) {
                    this.f5621e.mo6642a();
                }
                mo6639d();
            }
        }
    }

    /* renamed from: a */
    public void mo6631a() {
        this.f5620d.clear();
    }

    /* renamed from: a */
    public void mo6635a(C1720c cVar) {
        this.f5621e = cVar;
    }

    /* renamed from: b */
    public void mo6637b() {
        this.f5621e = null;
    }

    /* renamed from: c */
    public void mo6638c() {
        mo6636a(false, -1);
    }

    /* renamed from: a */
    public void mo6636a(boolean z, int i) {
        mo6639d();
        this.f5618b = true;
        new C1721d().start();
    }

    /* renamed from: d */
    public void mo6639d() {
        this.f5618b = false;
        this.f5624i = 0;
    }

    /* renamed from: com.cootek.smartinput5.func.f$a */
    /* compiled from: AnimationHeartBeatManager */
    private class C1718a extends Handler {
        private C1718a() {
        }

        public void handleMessage(Message message) {
            if (C1716f.this.f5618b) {
                Iterator it = C1716f.this.f5620d.iterator();
                while (it.hasNext()) {
                    C1719b bVar = (C1719b) it.next();
                    if (((C1722g) bVar).f5628b == message.what && !bVar.f5626a) {
                        bVar.mo6641a();
                        bVar.f5626a = true;
                    }
                }
            }
        }
    }

    /* renamed from: com.cootek.smartinput5.func.f$d */
    /* compiled from: AnimationHeartBeatManager */
    private class C1721d extends Thread {
        private C1721d() {
        }

        public void run() {
            while (C1716f.this.f5618b) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
                if (C1716f.this.f5619c != null) {
                    C1716f.this.f5619c.sendEmptyMessage(C1716f.this.f5624i * 50);
                }
                C1716f.m7910e(C1716f.this);
            }
        }
    }
}
