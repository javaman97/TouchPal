package com.cootek.smartinput5.func;

import android.content.Context;
import android.os.Debug;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.aO */
/* compiled from: MemoryManager */
public class C1403aO {

    /* renamed from: a */
    private Context f4442a;

    /* renamed from: b */
    private ArrayList<C1404a> f4443b = new ArrayList<>();

    /* renamed from: c */
    private boolean f4444c = false;

    /* renamed from: com.cootek.smartinput5.func.aO$a */
    /* compiled from: MemoryManager */
    public interface C1404a {
        /* renamed from: a */
        void mo6012a();
    }

    public C1403aO(Context context) {
        this.f4442a = context;
    }

    /* renamed from: a */
    public void mo6007a(C1404a aVar) {
        this.f4443b.add(aVar);
    }

    /* renamed from: b */
    public void mo6009b(C1404a aVar) {
        this.f4443b.remove(aVar);
    }

    /* renamed from: a */
    public void mo6006a() {
        this.f4443b.clear();
    }

    /* renamed from: b */
    public void mo6008b() {
        if (this.f4444c) {
            Iterator<C1404a> it = this.f4443b.iterator();
            while (it.hasNext()) {
                it.next().mo6012a();
            }
            this.f4444c = false;
        }
    }

    /* renamed from: c */
    public void mo6010c() {
        this.f4444c = true;
    }

    /* renamed from: d */
    public int mo6011d() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return memoryInfo.otherPss + memoryInfo.dalvikPss + memoryInfo.nativePss;
    }
}
