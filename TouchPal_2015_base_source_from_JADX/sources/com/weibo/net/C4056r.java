package com.weibo.net;

import com.weibo.net.C4054q;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.weibo.net.r */
/* compiled from: Utility */
class C4056r implements X509TrustManager {

    /* renamed from: a */
    final /* synthetic */ C4054q.C4055a f16518a;

    C4056r(C4054q.C4055a aVar) {
        this.f16518a = aVar;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
