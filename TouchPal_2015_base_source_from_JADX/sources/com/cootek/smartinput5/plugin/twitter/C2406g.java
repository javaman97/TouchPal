package com.cootek.smartinput5.plugin.twitter;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.cootek.smartinput5.plugin.twitter.g */
/* compiled from: FakeSSLSocketFactory */
class C2406g implements X509TrustManager {

    /* renamed from: a */
    final /* synthetic */ C2405f f10539a;

    C2406g(C2405f fVar) {
        this.f10539a = fVar;
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }
}
