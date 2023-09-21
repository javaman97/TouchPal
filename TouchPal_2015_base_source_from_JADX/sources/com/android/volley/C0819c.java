package com.android.volley;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.android.volley.c */
/* compiled from: Cache */
public interface C0819c {
    /* renamed from: a */
    C0820a mo3028a(String str);

    /* renamed from: a */
    void mo3029a();

    /* renamed from: a */
    void mo3030a(String str, C0820a aVar);

    /* renamed from: a */
    void mo3031a(String str, boolean z);

    /* renamed from: b */
    void mo3032b();

    /* renamed from: b */
    void mo3033b(String str);

    /* renamed from: com.android.volley.c$a */
    /* compiled from: Cache */
    public static class C0820a {

        /* renamed from: a */
        public byte[] f2151a;

        /* renamed from: b */
        public String f2152b;

        /* renamed from: c */
        public long f2153c;

        /* renamed from: d */
        public long f2154d;

        /* renamed from: e */
        public long f2155e;

        /* renamed from: f */
        public Map<String, String> f2156f = Collections.emptyMap();

        /* renamed from: a */
        public boolean mo3034a() {
            return this.f2154d < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean mo3035b() {
            return this.f2155e < System.currentTimeMillis();
        }
    }
}
