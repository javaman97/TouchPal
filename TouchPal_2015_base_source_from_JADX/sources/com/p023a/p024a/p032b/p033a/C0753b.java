package com.p023a.p024a.p032b.p033a;

/* renamed from: com.a.a.b.a.b */
/* compiled from: FailReason */
public class C0753b {

    /* renamed from: a */
    private final C0754a f1849a;

    /* renamed from: b */
    private final Throwable f1850b;

    /* renamed from: com.a.a.b.a.b$a */
    /* compiled from: FailReason */
    public enum C0754a {
        IO_ERROR,
        DECODING_ERROR,
        NETWORK_DENIED,
        OUT_OF_MEMORY,
        UNKNOWN
    }

    public C0753b(C0754a aVar, Throwable th) {
        this.f1849a = aVar;
        this.f1850b = th;
    }

    /* renamed from: a */
    public C0754a mo2817a() {
        return this.f1849a;
    }

    /* renamed from: b */
    public Throwable mo2818b() {
        return this.f1850b;
    }
}
