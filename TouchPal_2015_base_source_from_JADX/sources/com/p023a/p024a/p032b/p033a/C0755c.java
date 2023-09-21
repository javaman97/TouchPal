package com.p023a.p024a.p032b.p033a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.a.a.b.a.c */
/* compiled from: FlushedInputStream */
public class C0755c extends FilterInputStream {
    public C0755c(InputStream inputStream) {
        super(inputStream);
    }

    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j) {
            long skip = this.in.skip(j - j2);
            if (skip == 0) {
                if (read() < 0) {
                    break;
                }
                skip = 1;
            }
            j2 = skip + j2;
        }
        return j2;
    }
}
