package p018cn.sharesdk.sina.weibo;

import android.os.Bundle;
import com.appsflyer.ServerParameters;
import com.weibo.net.C4057s;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;

/* renamed from: cn.sharesdk.sina.weibo.a */
class C0687a implements AuthorizeListener {

    /* renamed from: a */
    final /* synthetic */ C0691e f1662a;

    /* renamed from: b */
    final /* synthetic */ SinaWeibo f1663b;

    C0687a(SinaWeibo sinaWeibo, C0691e eVar) {
        this.f1663b = sinaWeibo;
        this.f1662a = eVar;
    }

    public void onCancel() {
        if (this.f1663b.listener != null) {
            this.f1663b.listener.onCancel(this.f1663b, 1);
        }
    }

    public void onComplete(Bundle bundle) {
        long j;
        String string = bundle.getString(ServerParameters.AF_USER_ID);
        String string2 = bundle.getString("access_token");
        String string3 = bundle.getString(C4057s.f16527i);
        this.f1663b.f1461db.put("nickname", bundle.getString("userName"));
        this.f1663b.f1461db.put("remind_in", bundle.getString("remind_in"));
        this.f1663b.f1461db.putToken(string2);
        try {
            j = Long.parseLong(string3);
        } catch (Throwable th) {
            j = 0;
        }
        this.f1663b.f1461db.putExpiresIn(j);
        this.f1663b.f1461db.putUserId(string);
        this.f1662a.mo2624b(string2);
        this.f1663b.afterRegister(1, (Object) null);
    }

    public void onError(Throwable th) {
        if (this.f1663b.listener != null) {
            this.f1663b.listener.onError(this.f1663b, 1, th);
        }
    }
}
