package com.cootek.smartinput5.func.p051a;

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.cootek.smartinput5.func.a.b */
/* compiled from: CootekHttpClient */
final class C1377b implements HttpRequestInterceptor {
    C1377b() {
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        if (C1374a.f4313d.get() != null && ((Boolean) C1374a.f4313d.get()).booleanValue()) {
            throw new RuntimeException("CooTek: Forbids HTTP requests");
        }
    }
}
