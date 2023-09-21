package com.weibo.net;

import android.text.TextUtils;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.weibo.net.y */
/* compiled from: XAuthHeader */
public class C4063y extends C4043f {
    /* renamed from: a */
    public C4062x mo14980a(C4062x xVar) {
        if (xVar == null || xVar.mo15033a() == 0) {
            return null;
        }
        C4062x xVar2 = new C4062x();
        xVar2.mo15037a(C2409j.f10546d, xVar.mo15042c(C2409j.f10546d));
        xVar2.mo15037a(C2409j.f10547e, xVar.mo15042c(C2409j.f10547e));
        xVar2.mo15037a(C2409j.f10549g, xVar.mo15042c(C2409j.f10549g));
        xVar2.mo15037a(C2409j.f10550h, xVar.mo15042c(C2409j.f10550h));
        xVar2.mo15037a(C2409j.f10551i, xVar.mo15042c(C2409j.f10551i));
        xVar2.mo15037a("source", C4057s.m17252c());
        xVar2.mo15037a("x_auth_mode", "client_auth");
        xVar2.mo15037a("x_auth_password", xVar.mo15042c("x_auth_password"));
        xVar2.mo15037a("x_auth_username", xVar.mo15042c("x_auth_username"));
        return xVar2;
    }

    /* renamed from: a */
    public String mo14981a(String str, C4053p pVar) throws C4061w {
        try {
            Mac instance = Mac.getInstance(C4043f.f16490a);
            instance.init(new SecretKeySpec((m17190b(C4057s.m17253d()) + C2261Q.f9808n).getBytes(), C4043f.f16490a));
            return String.valueOf(C4054q.m17236a(instance.doFinal(str.getBytes())));
        } catch (InvalidKeyException e) {
            throw new C4061w((Exception) e);
        } catch (NoSuchAlgorithmException e2) {
            throw new C4061w((Exception) e2);
        }
    }

    /* renamed from: a */
    public void mo14982a(C4062x xVar, C4062x xVar2) {
        if (!TextUtils.isEmpty(xVar2.mo15042c("x_auth_password")) && !TextUtils.isEmpty(xVar2.mo15042c("x_auth_username"))) {
            xVar.mo15037a("x_auth_password", xVar2.mo15042c("x_auth_password"));
            xVar.mo15037a("x_auth_username", xVar2.mo15042c("x_auth_username"));
            xVar.mo15037a("x_auth_mode", "client_auth");
        }
    }
}
