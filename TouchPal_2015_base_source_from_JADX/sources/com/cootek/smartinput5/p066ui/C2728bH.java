package com.cootek.smartinput5.p066ui;

import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.bH */
/* compiled from: SelectItemList */
public class C2728bH {

    /* renamed from: a */
    C2729a f12214a;

    /* renamed from: b */
    private ArrayList<C2727bG> f12215b = new ArrayList<>();

    /* renamed from: com.cootek.smartinput5.ui.bH$a */
    /* compiled from: SelectItemList */
    interface C2729a {
        /* renamed from: a */
        C2727bG mo8496a(int i);
    }

    public C2728bH(C2729a aVar) {
        this.f12214a = aVar;
    }

    /* renamed from: a */
    public C2727bG mo9003a(int i) {
        int size = this.f12215b.size();
        if (i >= size) {
            while (size <= i) {
                C2727bG a = this.f12214a.mo8496a(size);
                if (a == null) {
                    break;
                }
                this.f12215b.add(size, a);
                size++;
            }
        }
        if (i < this.f12215b.size()) {
            return this.f12215b.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public int mo9002a() {
        return this.f12215b.size();
    }

    /* renamed from: b */
    public void mo9004b() {
        this.f12215b.clear();
    }
}
