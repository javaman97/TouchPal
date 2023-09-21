package com.cootek.smartinput5.func.p051a;

import com.cootek.smartinput5.func.p051a.C1374a;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.cootek.smartinput5.func.a.c */
/* compiled from: CootekHttpClient */
class C1378c extends DefaultHttpClient {

    /* renamed from: a */
    final /* synthetic */ C1374a f4320a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1378c(C1374a aVar, ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        super(clientConnectionManager, httpParams);
        this.f4320a = aVar;
    }

    /* access modifiers changed from: protected */
    public HttpContext createHttpContext() {
        BasicHttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }

    /* access modifiers changed from: protected */
    public BasicHttpProcessor createHttpProcessor() {
        BasicHttpProcessor createHttpProcessor = C1378c.super.createHttpProcessor();
        createHttpProcessor.addRequestInterceptor(new C1374a.C1376b(this.f4320a, (C1377b) null));
        createHttpProcessor.addRequestInterceptor(C1374a.f4312c);
        return createHttpProcessor;
    }
}
