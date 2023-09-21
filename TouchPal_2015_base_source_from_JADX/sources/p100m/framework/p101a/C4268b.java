package p100m.framework.p101a;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: m.framework.a.b */
/* compiled from: FilePart */
public class C4268b extends C4269c {

    /* renamed from: a */
    private File f17427a;

    /* renamed from: a */
    public void mo15915a(File file) {
        this.f17427a = file;
    }

    /* renamed from: a */
    public void mo15916a(String str) {
        this.f17427a = new File(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo15911a() throws Throwable {
        return new FileInputStream(this.f17427a);
    }

    public String toString() {
        return this.f17427a.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo15913b() throws Throwable {
        return this.f17427a.length();
    }
}
