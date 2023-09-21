package p100m.framework.p101a;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: m.framework.a.j */
/* compiled from: SSLSocketFactoryEx */
class C4276j implements X509TrustManager {

    /* renamed from: a */
    final /* synthetic */ C4275i f17436a;

    C4276j(C4275i iVar) {
        this.f17436a = iVar;
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
    }
}
