package com.cootek.smartinput5.func;

import com.cootek.smartinput5.func.p052b.C1549b;
import java.io.File;

/* renamed from: com.cootek.smartinput5.func.u */
/* compiled from: CellInfo */
public class C2065u extends C1810j {

    /* renamed from: d */
    public static int f8848d = 1;

    /* renamed from: e */
    public static int f8849e = 2;

    /* renamed from: f */
    public static int f8850f = 3;

    /* renamed from: g */
    public static String f8851g = "chinese";

    /* renamed from: h */
    public static String f8852h = C1549b.f4791a;

    /* renamed from: i */
    public static String f8853i = C1549b.f4838i;

    /* renamed from: j */
    public static String f8854j = C1549b.f4839j;

    /* renamed from: k */
    public static String f8855k = C1549b.f4840k;

    /* renamed from: l */
    public static String f8856l = C1549b.f4841l;

    /* renamed from: m */
    public static String f8857m = C1549b.f4842m;

    /* renamed from: n */
    public static String f8858n = C1549b.f4766B;

    /* renamed from: o */
    public static String f8859o = C1549b.f4848s;

    /* renamed from: p */
    public static String f8860p = C1549b.f4844o;

    /* renamed from: q */
    public static String f8861q = C1549b.f4846q;

    /* renamed from: r */
    public static String f8862r = C1549b.f4847r;

    /* renamed from: s */
    public static String f8863s = C1549b.f4845p;

    /* renamed from: t */
    public static String f8864t = C1549b.f4843n;

    /* renamed from: u */
    public static String f8865u = C1549b.f4767C;

    /* renamed from: A */
    public boolean f8866A;

    /* renamed from: B */
    public boolean f8867B;

    /* renamed from: C */
    public File f8868C;

    /* renamed from: D */
    public boolean f8869D;

    /* renamed from: v */
    public String f8870v;

    /* renamed from: w */
    public String f8871w;

    /* renamed from: x */
    public String f8872x;

    /* renamed from: y */
    public String f8873y;

    /* renamed from: z */
    public int f8874z;

    C2065u(String str, String str2, String str3, int i) {
        this.f8871w = str;
        this.f8870v = str2;
        this.f8872x = str3;
        this.f8873y = null;
        this.f8874z = i;
    }

    C2065u(String str, String str2, String str3, String str4, File file, boolean z, boolean z2) {
        this.f8870v = str;
        this.f8871w = str2;
        this.f8872x = str3;
        this.f8873y = str4;
        this.f8868C = file;
        this.f8866A = z;
        this.f8867B = z2;
    }

    public C2065u() {
    }

    /* renamed from: d */
    public String mo7437d() {
        return this.f8870v + C1960r.f6678a;
    }

    /* renamed from: e */
    public String mo7438e() {
        return "cootek.smartinput.android.celldict." + this.f8870v;
    }

    /* renamed from: f */
    public void mo7439f() {
        if (this.f8869D) {
            this.f5932a.mo6025d();
            return;
        }
        this.f8868C.delete();
        C1368X.m6320c().mo5845r().mo7197c();
        C2065u[] g = C1368X.m6320c().mo5845r().mo7203g();
        if (g != null) {
            int length = g.length;
            int i = 0;
            while (i < length) {
                C2065u uVar = g[i];
                if (!uVar.f8869D || !this.f8870v.equals(C1960r.m9002m(uVar.f8870v))) {
                    i++;
                } else {
                    uVar.mo7439f();
                    return;
                }
            }
        }
    }
}
