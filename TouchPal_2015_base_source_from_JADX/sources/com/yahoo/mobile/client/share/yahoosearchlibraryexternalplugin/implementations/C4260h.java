package com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations;

import android.content.Context;
import com.android.volley.C0817a;
import com.android.volley.C0823f;
import com.android.volley.C0830l;
import com.android.volley.C0833o;
import com.android.volley.C0837q;
import com.android.volley.C0840s;
import com.android.volley.C0880u;
import com.android.volley.toolbox.C0844A;
import com.android.volley.toolbox.C0857i;
import com.yahoo.mobile.client.share.search.interfaces.INetworkAsync;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.h */
public class C4260h implements INetworkAsync {

    /* renamed from: a */
    private Context f17415a;

    /* renamed from: b */
    private Map<String, C0837q> f17416b = new HashMap();

    /* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.h$b */
    private static class C4262b {

        /* renamed from: a */
        public String f17421a;

        private C4262b() {
        }

        /* synthetic */ C4262b(byte b) {
            this();
        }
    }

    /* renamed from: com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.h$a */
    public static class C4261a<T> extends C0833o<T> {

        /* renamed from: a */
        private final C0840s.C0842b<T> f17417a;

        /* renamed from: b */
        private final INetworkAsync.Parser<T> f17418b;

        /* renamed from: c */
        private Map<String, String> f17419c = Collections.emptyMap();

        /* renamed from: d */
        private byte[] f17420d;

        public C4261a(int i, String str, C0840s.C0842b<T> bVar, C0840s.C0841a aVar, INetworkAsync.Parser<T> parser) {
            super(i, str, aVar);
            this.f17417a = bVar;
            this.f17418b = parser;
        }

        /* renamed from: a */
        public void mo15909a(Map<String, String> map) {
            this.f17419c = map;
        }

        /* renamed from: a */
        public void mo15910a(byte[] bArr) {
            this.f17420d = bArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C0840s<T> mo3059a(C0830l lVar) {
            T t = null;
            if (this.f17418b != null) {
                t = this.f17418b.parse(lVar.f2185b, lVar.f2186c);
            }
            return C0840s.m4729a(t, C0857i.m4795a(lVar));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo3064b(T t) {
            this.f17417a.mo3103a(t);
        }

        /* renamed from: k */
        public Map<String, String> mo3075k() throws C0817a {
            return this.f17419c;
        }

        /* renamed from: r */
        public String mo3082r() {
            if (this.f17419c.containsKey("Content-Type")) {
                return this.f17419c.get("Content-Type");
            }
            return super.mo3082r();
        }

        /* renamed from: s */
        public byte[] mo3083s() throws C0817a {
            return this.f17420d;
        }
    }

    public C4260h(Context context) {
        this.f17415a = context.getApplicationContext();
    }

    public <T> Object requestAsync(String str, int i, Map<String, String> map, byte[] bArr, INetworkAsync.Listener<T> listener, INetworkAsync.Parser<T> parser, int i2, String str2) {
        C0837q qVar = this.f17416b.get(str2);
        if (qVar == null) {
            qVar = C0844A.m4736a(this.f17415a);
            qVar.mo3093a();
            this.f17416b.put(str2, qVar);
        }
        C0837q qVar2 = qVar;
        int i3 = i;
        String str3 = str;
        C4261a aVar = new C4261a(i3, str3, new C4264j(this, listener), new C4263i(this, listener), parser);
        if (map != null) {
            aVar.mo15909a(map);
        }
        if (bArr != null) {
            aVar.mo15910a(bArr);
        }
        C4262b bVar = new C4262b((byte) 0);
        bVar.f17421a = str2;
        aVar.mo3057a((Object) bVar);
        aVar.mo3056a((C0880u) new C0823f(i2, 1, 1.0f));
        qVar2.mo3092a(aVar);
        return bVar;
    }

    public void cancelRequest(Object obj) {
        if (obj instanceof C4262b) {
            C4262b bVar = (C4262b) obj;
            this.f17416b.get(bVar.f17421a).mo3095a((Object) bVar);
        }
    }
}
