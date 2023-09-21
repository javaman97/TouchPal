package com.weibo.net;

import android.content.Context;
import java.io.IOException;

/* renamed from: com.weibo.net.c */
/* compiled from: AsyncWeiboRunner */
public class C4039c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4057s f16480a;

    /* renamed from: com.weibo.net.c$a */
    /* compiled from: AsyncWeiboRunner */
    public interface C4040a {
        /* renamed from: a */
        void mo8206a(C4061w wVar);

        /* renamed from: a */
        void mo8207a(IOException iOException);

        /* renamed from: a */
        void mo8208a(String str);
    }

    public C4039c(C4057s sVar) {
        this.f16480a = sVar;
    }

    /* renamed from: a */
    public void mo14983a(Context context, String str, C4062x xVar, String str2, C4040a aVar) {
        new C4041d(this, context, str, xVar, str2, aVar).start();
    }
}
