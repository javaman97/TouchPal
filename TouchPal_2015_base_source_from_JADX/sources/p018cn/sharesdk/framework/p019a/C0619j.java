package p018cn.sharesdk.framework.p019a;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: cn.sharesdk.framework.a.j */
class C0619j implements X509TrustManager {

    /* renamed from: a */
    final /* synthetic */ C0618i f1480a;

    C0619j(C0618i iVar) {
        this.f1480a = iVar;
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
