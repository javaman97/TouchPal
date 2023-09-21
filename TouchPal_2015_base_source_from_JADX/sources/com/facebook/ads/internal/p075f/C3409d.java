package com.facebook.ads.internal.p075f;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HttpContext;

/* renamed from: com.facebook.ads.internal.f.d */
class C3409d implements Runnable {

    /* renamed from: a */
    private final AbstractHttpClient f14885a;

    /* renamed from: b */
    private final HttpContext f14886b;

    /* renamed from: c */
    private final HttpUriRequest f14887c;

    /* renamed from: d */
    private final C3410e f14888d;

    /* renamed from: e */
    private int f14889e;

    public C3409d(AbstractHttpClient abstractHttpClient, HttpContext httpContext, HttpUriRequest httpUriRequest, C3410e eVar) {
        this.f14885a = abstractHttpClient;
        this.f14886b = httpContext;
        this.f14887c = httpUriRequest;
        this.f14888d = eVar;
    }

    /* renamed from: a */
    private void m14981a() {
        if (!Thread.currentThread().isInterrupted()) {
            HttpResponse execute = this.f14885a.execute(this.f14887c, this.f14886b);
            if (!Thread.currentThread().isInterrupted() && this.f14888d != null) {
                this.f14888d.mo10720a(execute);
            }
        }
    }

    /* renamed from: b */
    private void m14982b() {
        boolean z = true;
        IOException e = null;
        HttpRequestRetryHandler httpRequestRetryHandler = this.f14885a.getHttpRequestRetryHandler();
        while (z) {
            try {
                m14981a();
                return;
            } catch (UnknownHostException e2) {
                if (this.f14888d != null) {
                    this.f14888d.mo10724b((Throwable) e2, "can't resolve host");
                    return;
                }
                return;
            } catch (SocketException e3) {
                if (this.f14888d != null) {
                    this.f14888d.mo10724b((Throwable) e3, "can't resolve host");
                    return;
                }
                return;
            } catch (SocketTimeoutException e4) {
                if (this.f14888d != null) {
                    this.f14888d.mo10724b((Throwable) e4, "socket time out");
                    return;
                }
                return;
            } catch (IOException e5) {
                e = e5;
                int i = this.f14889e + 1;
                this.f14889e = i;
                z = httpRequestRetryHandler.retryRequest(e, i, this.f14886b);
            } catch (NullPointerException e6) {
                e = new IOException("NPE in HttpClient" + e6.getMessage());
                int i2 = this.f14889e + 1;
                this.f14889e = i2;
                z = httpRequestRetryHandler.retryRequest(e, i2, this.f14886b);
            }
        }
        ConnectException connectException = new ConnectException();
        connectException.initCause(e);
        throw connectException;
    }

    public void run() {
        try {
            if (this.f14888d != null) {
                this.f14888d.mo10725c();
            }
            m14982b();
            if (this.f14888d != null) {
                this.f14888d.mo10728d();
            }
        } catch (IOException e) {
            IOException iOException = e;
            if (this.f14888d != null) {
                this.f14888d.mo10728d();
                this.f14888d.mo10724b((Throwable) iOException, (String) null);
            }
        }
    }
}
