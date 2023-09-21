package com.weibo.net;

import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.weibo.net.b */
/* compiled from: AccessTokenHeader */
public class C4038b extends C4043f {
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
        xVar2.mo15037a(C2409j.f10554l, xVar.mo15042c(C2409j.f10554l));
        xVar2.mo15037a(C2409j.f10557o, xVar.mo15042c(C2409j.f10557o));
        xVar2.mo15037a(C2409j.f10551i, xVar.mo15042c(C2409j.f10551i));
        xVar2.mo15037a("source", xVar.mo15042c("source"));
        return xVar2;
    }

    /* renamed from: a */
    public String mo14981a(String str, C4053p pVar) throws C4061w {
        try {
            Mac instance = Mac.getInstance(C4043f.f16490a);
            if (pVar.mo15007f() == null) {
                pVar.mo14998a(new SecretKeySpec((m17190b(C4057s.m17253d()) + C2261Q.f9808n + m17190b(pVar.mo15005e())).getBytes(), C4043f.f16490a));
            }
            instance.init(pVar.mo15007f());
            return String.valueOf(C4054q.m17236a(instance.doFinal(str.getBytes())));
        } catch (InvalidKeyException e) {
            throw new C4061w((Exception) e);
        } catch (NoSuchAlgorithmException e2) {
            throw new C4061w((Exception) e2);
        }
    }

    /* renamed from: a */
    public void mo14982a(C4062x xVar, C4062x xVar2) {
    }
}
