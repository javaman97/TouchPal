package com.cootek.smartinput5.func;

import java.io.File;

/* renamed from: com.cootek.smartinput5.func.bj */
/* compiled from: SuperDictInfo */
public class C1607bj {

    /* renamed from: a */
    public String f5170a;

    /* renamed from: b */
    public String f5171b;

    /* renamed from: c */
    public File f5172c;

    /* renamed from: d */
    public String[] f5173d;

    public C1607bj(String str, String str2, String[] strArr, File file) {
        this.f5170a = str2;
        this.f5171b = str;
        this.f5173d = strArr;
        this.f5172c = file;
    }

    /* renamed from: a */
    public boolean mo6305a() {
        if (this.f5173d == null || this.f5172c == null) {
            return false;
        }
        File parentFile = this.f5172c.getParentFile();
        for (String file : this.f5173d) {
            if (!new File(parentFile, file).exists()) {
                return false;
            }
        }
        return this.f5172c.exists();
    }

    /* renamed from: b */
    public void mo6306b() {
        if (this.f5173d != null && this.f5172c != null) {
            File parentFile = this.f5172c.getParentFile();
            for (String file : this.f5173d) {
                File file2 = new File(parentFile, file);
                if (file2.exists()) {
                    file2.delete();
                }
            }
            this.f5172c.delete();
        }
    }
}
