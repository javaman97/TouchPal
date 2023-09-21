package com.p023a.p024a.p025a.p026a.p027a;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p026a.p029b.C0726a;
import com.p023a.p024a.p032b.C0741a;
import com.p023a.p024a.p041c.C0811c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.a.a.a.a.a.b */
/* compiled from: LimitedAgeDiscCache */
public class C0723b extends C0711a {

    /* renamed from: j */
    private final long f1800j;

    /* renamed from: k */
    private final Map<File, Long> f1801k;

    public C0723b(File file, long j) {
        this(file, (File) null, C0741a.m4215b(), j);
    }

    public C0723b(File file, File file2, long j) {
        this(file, file2, C0741a.m4215b(), j);
    }

    public C0723b(File file, File file2, C0726a aVar, long j) {
        super(file, file2, aVar);
        this.f1801k = Collections.synchronizedMap(new HashMap());
        this.f1800j = 1000 * j;
    }

    /* renamed from: a */
    public File mo2679a(String str) {
        boolean z;
        File a = super.mo2679a(str);
        if (a != null && a.exists()) {
            Long l = this.f1801k.get(a);
            if (l == null) {
                z = false;
                l = Long.valueOf(a.lastModified());
            } else {
                z = true;
            }
            if (System.currentTimeMillis() - l.longValue() > this.f1800j) {
                a.delete();
                this.f1801k.remove(a);
            } else if (!z) {
                this.f1801k.put(a, l);
            }
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo2681a(String str, InputStream inputStream, C0811c.C0812a aVar) throws IOException {
        boolean a = super.mo2681a(str, inputStream, aVar);
        m4113d(str);
        return a;
    }

    /* renamed from: a */
    public boolean mo2680a(String str, Bitmap bitmap) throws IOException {
        boolean a = super.mo2680a(str, bitmap);
        m4113d(str);
        return a;
    }

    /* renamed from: b */
    public boolean mo2683b(String str) {
        this.f1801k.remove(mo2688c(str));
        return super.mo2683b(str);
    }

    /* renamed from: c */
    public void mo2684c() {
        super.mo2684c();
        this.f1801k.clear();
    }

    /* renamed from: d */
    private void m4113d(String str) {
        File c = mo2688c(str);
        long currentTimeMillis = System.currentTimeMillis();
        c.setLastModified(currentTimeMillis);
        this.f1801k.put(c, Long.valueOf(currentTimeMillis));
    }
}
