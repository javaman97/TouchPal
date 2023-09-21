package com.facebook.ads.internal.p077h;

import java.net.Socket;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: com.facebook.ads.internal.h.s */
public class C3453s extends SSLSocketFactory {

    /* renamed from: a */
    SSLContext f15008a = SSLContext.getInstance("TLS");

    public C3453s(KeyStore keyStore) {
        super(keyStore);
        C3454t tVar = new C3454t(this);
        this.f15008a.init((KeyManager[]) null, new TrustManager[]{tVar}, (SecureRandom) null);
    }

    public Socket createSocket() {
        return this.f15008a.getSocketFactory().createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.f15008a.getSocketFactory().createSocket(socket, str, i, z);
    }
}
