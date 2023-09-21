package p018cn.sharesdk.sina.weibo;

import android.os.Bundle;
import com.appsflyer.ServerParameters;
import com.weibo.net.C4057s;
import java.util.HashMap;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.utils.C0665d;

/* renamed from: cn.sharesdk.sina.weibo.c */
class C0689c extends Thread {

    /* renamed from: a */
    final /* synthetic */ Platform f1665a;

    /* renamed from: b */
    final /* synthetic */ String f1666b;

    /* renamed from: c */
    final /* synthetic */ C0688b f1667c;

    C0689c(C0688b bVar, Platform platform, String str) {
        this.f1667c = bVar;
        this.f1665a = platform;
        this.f1666b = str;
    }

    public void run() {
        String str;
        try {
            str = C0691e.m3893a(this.f1665a).mo2613a(this.f1665a.getContext(), this.f1666b);
        } catch (Throwable th) {
            this.f1667c.f1489c.onError(th);
            str = null;
        }
        if (str == null) {
            this.f1667c.f1489c.onError(new Throwable("Authorize token is empty"));
            return;
        }
        HashMap<String, Object> a = new C0665d().mo2496a(str);
        Bundle bundle = new Bundle();
        bundle.putString("access_token", String.valueOf(a.get("access_token")));
        bundle.putString("remind_in", String.valueOf(a.get("remind_in")));
        bundle.putString(C4057s.f16527i, String.valueOf(a.get(C4057s.f16527i)));
        bundle.putString(ServerParameters.AF_USER_ID, String.valueOf(a.get(ServerParameters.AF_USER_ID)));
        this.f1667c.f1489c.onComplete(bundle);
    }
}
