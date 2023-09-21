package p018cn.sharesdk.twitter;

import android.os.Bundle;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;

/* renamed from: cn.sharesdk.twitter.a */
class C0693a implements AuthorizeListener {

    /* renamed from: a */
    final /* synthetic */ C0697e f1682a;

    /* renamed from: b */
    final /* synthetic */ Twitter f1683b;

    C0693a(Twitter twitter, C0697e eVar) {
        this.f1683b = twitter;
        this.f1682a = eVar;
    }

    public void onCancel() {
        if (this.f1683b.listener != null) {
            this.f1683b.listener.onCancel(this.f1683b, 1);
        }
    }

    public void onComplete(Bundle bundle) {
        String string = bundle.getString(C2409j.f10554l);
        String string2 = bundle.getString(C2409j.f10553k);
        String string3 = bundle.getString("user_id");
        String string4 = bundle.getString("screen_name");
        this.f1683b.f1461db.putToken(string);
        this.f1683b.f1461db.putTokenSecret(string2);
        this.f1683b.f1461db.putUserId(string3);
        this.f1683b.f1461db.put("nickname", string4);
        this.f1682a.mo2634a(string, string2);
        this.f1683b.afterRegister(1, (Object) null);
    }

    public void onError(Throwable th) {
        if (this.f1683b.listener != null) {
            this.f1683b.listener.onError(this.f1683b, 1, th);
        }
    }
}
