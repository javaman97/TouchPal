package com.facebook.ads.internal.p075f;

import com.facebook.ads.internal.p075f.C3405a;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.facebook.ads.internal.f.c */
class C3408c implements HttpResponseInterceptor {

    /* renamed from: a */
    final /* synthetic */ C3405a f14884a;

    C3408c(C3405a aVar) {
        this.f14884a = aVar;
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        Header contentEncoding;
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null && (contentEncoding = entity.getContentEncoding()) != null) {
            for (HeaderElement name : contentEncoding.getElements()) {
                if (name.getName().equalsIgnoreCase("gzip")) {
                    httpResponse.setEntity(new C3405a.C3406a(httpResponse.getEntity()));
                    return;
                }
            }
        }
    }
}
