package android.support.p001v4.p016k;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.k.g */
/* compiled from: LogWriter */
public class C0304g extends Writer {

    /* renamed from: a */
    private final String f758a;

    /* renamed from: b */
    private StringBuilder f759b = new StringBuilder(128);

    public C0304g(String str) {
        this.f758a = str;
    }

    public void close() {
        m1216a();
    }

    public void flush() {
        m1216a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m1216a();
            } else {
                this.f759b.append(c);
            }
        }
    }

    /* renamed from: a */
    private void m1216a() {
        if (this.f759b.length() > 0) {
            Log.d(this.f758a, this.f759b.toString());
            this.f759b.delete(0, this.f759b.length());
        }
    }
}
