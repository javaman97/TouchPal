package p018cn.sharesdk.framework.p019a;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: cn.sharesdk.framework.a.b */
public class C0611b extends C0612c {

    /* renamed from: a */
    private File f1470a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo2181a() {
        return new FileInputStream(this.f1470a);
    }

    /* renamed from: a */
    public void mo2184a(File file) {
        this.f1470a = file;
    }

    /* renamed from: a */
    public void mo2185a(String str) {
        this.f1470a = new File(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo2182b() {
        return this.f1470a.length();
    }

    public String toString() {
        return this.f1470a.toString();
    }
}
