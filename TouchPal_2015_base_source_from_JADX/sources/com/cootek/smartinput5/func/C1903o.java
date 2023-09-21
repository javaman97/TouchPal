package com.cootek.smartinput5.func;

import java.io.File;

/* renamed from: com.cootek.smartinput5.func.o */
/* compiled from: BigramInfo */
public class C1903o {

    /* renamed from: a */
    public String f6443a;

    /* renamed from: b */
    public String f6444b;

    /* renamed from: c */
    public String f6445c;

    /* renamed from: d */
    public boolean f6446d;

    /* renamed from: e */
    private File f6447e;

    C1903o(String str, String str2, File file, boolean z) {
        this.f6443a = str + C1920p.f6497a;
        this.f6445c = str2;
        this.f6447e = file;
        this.f6446d = z;
    }

    /* renamed from: a */
    public void mo7050a() {
        this.f6447e.delete();
    }
}
