package com.cootek.smartinput5.net;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.p051a.C1382g;
import com.cootek.smartinput5.net.cmd.C2258O;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.net.cmd.C2268c;
import com.weibo.net.C4054q;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.FileEntity;
import org.apache.http.entity.StringEntity;

/* renamed from: com.cootek.smartinput5.net.w */
/* compiled from: HttpRequester */
public class C2372w {

    /* renamed from: c */
    private static C2372w f10441c;

    /* renamed from: a */
    private C1382g f10442a = new C1382g("TouchPalv5", false);

    /* renamed from: b */
    private HttpRequestBase f10443b;

    private C2372w() {
    }

    /* renamed from: a */
    public static synchronized C2372w m10879a() {
        C2372w wVar;
        synchronized (C2372w.class) {
            if (f10441c == null) {
                synchronized (C2372w.class) {
                    if (f10441c == null) {
                        f10441c = new C2372w();
                    }
                }
            }
            wVar = f10441c;
        }
        return wVar;
    }

    /* renamed from: a */
    private HttpRequestBase m10880a(String str, Object obj, String str2, Map<String, String> map, boolean z) {
        HttpEntityEnclosingRequestBase httpGet;
        if (C4054q.f16509e.equals(str)) {
            httpGet = new HttpPost(str2);
        } else if ("PUT".equals(str)) {
            httpGet = new HttpPut(str2);
        } else {
            httpGet = new HttpGet(str2);
        }
        String c = C2188Q.m9853a().mo7683c();
        if (TextUtils.isEmpty(c) && z && Settings.isInitialized()) {
            c = Settings.getInstance().getStringSetting(Settings.OLD_TOKEN_FORM_UNINSTALL);
        }
        if (!TextUtils.isEmpty(c)) {
            httpGet.addHeader(C2261Q.f9792am, "auth_token=" + c);
        }
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str3 = (String) next.getKey();
                String str4 = (String) next.getValue();
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                    httpGet.addHeader(str3, str4);
                }
            }
        }
        boolean equals = C4054q.f16509e.equals(str);
        boolean equals2 = "PUT".equals(str);
        if (equals || equals2) {
            try {
                HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase = httpGet;
                if (obj instanceof byte[]) {
                    ByteArrayEntity byteArrayEntity = new ByteArrayEntity((byte[]) obj);
                    byteArrayEntity.setContentEncoding("gzip");
                    httpEntityEnclosingRequestBase.setEntity(byteArrayEntity);
                } else if (obj instanceof File) {
                    httpEntityEnclosingRequestBase.setEntity(new FileEntity((File) obj, "application/octet-stream"));
                } else {
                    httpEntityEnclosingRequestBase.setEntity(new StringEntity(obj.toString(), Utils.UTF8));
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return httpGet;
    }

    /* renamed from: a */
    public Object mo8057a(String str, Object obj, String str2, String str3, String str4, Map<String, String> map, boolean z) throws SSLPeerUnverifiedException {
        HttpResponse httpResponse;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3);
            if (!TextUtils.isEmpty(str4)) {
                sb.append(str4);
            }
            this.f10443b = m10880a(str, obj, sb.toString(), map, z);
            if (this.f10443b == null || this.f10443b.isAborted()) {
                httpResponse = null;
            } else {
                httpResponse = this.f10442a.execute(this.f10443b);
            }
            return httpResponse;
        } catch (SSLPeerUnverifiedException e) {
            throw e;
        } catch (Exception e2) {
            m10881a(e2, str3);
            return null;
        } catch (Error e3) {
            m10881a(e3, str3);
            return null;
        }
    }

    /* renamed from: a */
    private void m10881a(Object obj, String str) {
        if (!TextUtils.isEmpty(str) && str.contains(C2258O.ACTIVATE.mo7824a())) {
            C2268c.m10358a(obj.getClass().getSimpleName());
        }
    }

    /* renamed from: b */
    public void mo8058b() {
        if (this.f10443b != null) {
            this.f10443b.abort();
            this.f10443b = null;
        }
    }
}
