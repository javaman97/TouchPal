package com.p023a.p024a.p025a.p026a.p027a.p028a;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.a.a.a.a.a.a.f */
/* compiled from: StrictLineReader */
class C0721f extends ByteArrayOutputStream {

    /* renamed from: a */
    final /* synthetic */ C0720e f1797a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0721f(C0720e eVar, int i) {
        super(i);
        this.f1797a = eVar;
    }

    public String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, this.f1797a.f1793d.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
