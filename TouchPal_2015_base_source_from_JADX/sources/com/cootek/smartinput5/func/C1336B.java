package com.cootek.smartinput5.func;

import java.io.File;

/* renamed from: com.cootek.smartinput5.func.B */
/* compiled from: CurveInfo */
public class C1336B {

    /* renamed from: a */
    public String f4079a;

    /* renamed from: b */
    public String f4080b;

    /* renamed from: c */
    public String f4081c;

    /* renamed from: d */
    public int f4082d;

    /* renamed from: e */
    public File f4083e;

    /* renamed from: f */
    public String[] f4084f;

    /* renamed from: g */
    public boolean f4085g;

    public C1336B(String str, String str2, int i, File file, String[] strArr, boolean z) {
        this.f4080b = str;
        this.f4081c = str2;
        this.f4082d = i;
        this.f4083e = file;
        this.f4084f = strArr;
        this.f4085g = z;
        this.f4079a = C1337C.m6136a(str, i);
    }

    /* renamed from: a */
    public boolean mo5561a() {
        if (this.f4085g) {
            return true;
        }
        if (this.f4084f != null) {
            File parentFile = this.f4083e.getParentFile();
            for (String file : this.f4084f) {
                if (!new File(parentFile, file).exists()) {
                    return false;
                }
            }
        }
        return this.f4083e.exists();
    }

    /* renamed from: b */
    public void mo5562b() {
        if (!this.f4085g) {
            if (this.f4084f != null) {
                File parentFile = this.f4083e.getParentFile();
                for (String file : this.f4084f) {
                    File file2 = new File(parentFile, file);
                    if (file2.exists()) {
                        file2.delete();
                    }
                }
            }
            this.f4083e.delete();
        }
    }
}
