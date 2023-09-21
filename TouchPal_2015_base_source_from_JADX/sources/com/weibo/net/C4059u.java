package com.weibo.net;

import android.content.DialogInterface;
import com.weibo.net.WeiboDialog;

/* renamed from: com.weibo.net.u */
/* compiled from: WeiboDialog */
class C4059u implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ WeiboDialog.C4036a f16540a;

    C4059u(WeiboDialog.C4036a aVar) {
        this.f16540a = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        WeiboDialog.this.finish();
    }
}
