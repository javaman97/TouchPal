package p018cn.sharesdk.framework.authorize;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.authorize.c */
class C0623c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ RegisterView f1490a;

    C0623c(RegisterView registerView) {
        this.f1490a = registerView;
    }

    public void onClick(View view) {
        try {
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(view.getResources().getString(C0661R.getStringRes(view.getContext(), "website")))));
        } catch (Throwable th) {
            C0666e.m3838b(th);
        }
    }
}
