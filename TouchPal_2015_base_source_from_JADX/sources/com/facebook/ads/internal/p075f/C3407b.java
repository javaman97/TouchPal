package com.facebook.ads.internal.p075f;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.facebook.ads.internal.f.b */
class C3407b implements HttpRequestInterceptor {

    /* renamed from: a */
    final /* synthetic */ C3405a f14883a;

    C3407b(C3405a aVar) {
        this.f14883a = aVar;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        if (!httpRequest.containsHeader("Accept-Encoding")) {
            httpRequest.addHeader("Accept-Encoding", "gzip");
        }
        for (String str : this.f14883a.f14881e.keySet()) {
            httpRequest.addHeader(str, (String) this.f14883a.f14881e.get(str));
        }
    }
}
