package p100m.framework.p101a;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: m.framework.a.i */
/* compiled from: SSLSocketFactoryEx */
public class C4275i extends SSLSocketFactory {

    /* renamed from: a */
    SSLContext f17435a = SSLContext.getInstance("TLS");

    public C4275i(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
        C4276j jVar = new C4276j(this);
        this.f17435a.init((KeyManager[]) null, new TrustManager[]{jVar}, (SecureRandom) null);
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        return this.f17435a.getSocketFactory().createSocket(socket, str, i, z);
    }

    public Socket createSocket() throws IOException {
        return this.f17435a.getSocketFactory().createSocket();
    }
}
