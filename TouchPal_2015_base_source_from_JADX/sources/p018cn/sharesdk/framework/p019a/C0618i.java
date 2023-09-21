package p018cn.sharesdk.framework.p019a;

import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: cn.sharesdk.framework.a.i */
public class C0618i extends SSLSocketFactory {

    /* renamed from: a */
    SSLContext f1479a = SSLContext.getInstance("TLS");

    public C0618i(KeyStore keyStore) {
        super(keyStore);
        C0619j jVar = new C0619j(this);
        this.f1479a.init((KeyManager[]) null, new TrustManager[]{jVar}, (SecureRandom) null);
    }

    public Socket createSocket() {
        return this.f1479a.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f1479a.getSocketFactory().createSocket(socket, str, i, z);
    }
}
