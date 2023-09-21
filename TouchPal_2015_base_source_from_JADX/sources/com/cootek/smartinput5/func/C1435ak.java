package com.cootek.smartinput5.func;

import java.io.File;

/* renamed from: com.cootek.smartinput5.func.ak */
/* compiled from: HandWriteInfo */
public class C1435ak {

    /* renamed from: a */
    public String f4620a;

    /* renamed from: b */
    public String f4621b;

    /* renamed from: c */
    public int f4622c;

    /* renamed from: d */
    public boolean f4623d;

    /* renamed from: e */
    public boolean f4624e;

    /* renamed from: f */
    private String[] f4625f;

    /* renamed from: g */
    private File f4626g;

    public C1435ak(String str, String str2, int i, boolean z, boolean z2, String[] strArr, File file) {
        this.f4620a = str;
        this.f4621b = str2;
        this.f4622c = i;
        this.f4623d = z;
        this.f4624e = z2;
        this.f4625f = strArr;
        this.f4626g = file;
    }

    /* renamed from: a */
    public void mo6076a() {
        boolean z;
        File parentFile = this.f4626g.getParentFile();
        File a = C1466av.m6848a(C1368X.m6313b());
        if (!parentFile.getAbsolutePath().equals(a == null ? null : a.getAbsolutePath())) {
            z = true;
        } else {
            z = false;
        }
        for (String str : this.f4625f) {
            if (z && str.endsWith(".so")) {
                new File(C1466av.m6848a(C1368X.m6313b()), str).delete();
            }
            File file = new File(parentFile, str);
            if (file.exists()) {
                file.delete();
            }
        }
        this.f4626g.delete();
    }

    /* renamed from: b */
    public String[] mo6077b() {
        return this.f4625f;
    }

    /* renamed from: c */
    public boolean mo6078c() {
        File parentFile = this.f4626g.getParentFile();
        if (!parentFile.getAbsolutePath().equals(C1466av.m6848a(C1368X.m6313b()))) {
        }
        for (String str : this.f4625f) {
            if (!str.endsWith(".so") && !new File(parentFile, str).exists()) {
                return false;
            }
        }
        return true;
    }
}
