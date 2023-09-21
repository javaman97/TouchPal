package p018cn.sharesdk.facebook;

import android.os.Bundle;
import android.text.TextUtils;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import com.weibo.net.C4057s;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.facebook.a */
class C0604a implements AuthorizeListener {

    /* renamed from: a */
    final /* synthetic */ C0607d f1446a;

    /* renamed from: b */
    final /* synthetic */ Facebook f1447b;

    C0604a(Facebook facebook, C0607d dVar) {
        this.f1447b = facebook;
        this.f1446a = dVar;
    }

    public void onCancel() {
        if (this.f1447b.listener != null) {
            this.f1447b.listener.onCancel(this.f1447b, 1);
        }
    }

    public void onComplete(Bundle bundle) {
        String string = bundle.getString(C2409j.f10554l);
        int i = bundle.getInt("oauth_token_expires");
        if (i == 0) {
            try {
                i = Integer.parseInt(String.valueOf(bundle.get(C4057s.f16527i)));
            } catch (Throwable th) {
                C0666e.m3838b(th);
                i = 0;
            }
        }
        if (TextUtils.isEmpty(string)) {
            string = bundle.getString("access_token");
        }
        this.f1447b.f1461db.putToken(string);
        this.f1447b.f1461db.putExpiresIn((long) i);
        this.f1446a.mo2059a(string, String.valueOf(i));
        this.f1447b.afterRegister(1, (Object) null);
    }

    public void onError(Throwable th) {
        if (this.f1447b.listener != null) {
            this.f1447b.listener.onError(this.f1447b, 1, th);
        }
    }
}
