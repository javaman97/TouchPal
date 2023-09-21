package com.cootek.smartinput5.p066ui.settings;

import android.widget.Toast;
import com.baidu.oauth.BaiduOAuth;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.p */
/* compiled from: BaiduAuthActivity */
class C3241p implements BaiduOAuth.OAuthListener {

    /* renamed from: a */
    final /* synthetic */ BaiduAuthActivity f14310a;

    C3241p(BaiduAuthActivity baiduAuthActivity) {
        this.f14310a = baiduAuthActivity;
    }

    public void onException(String str) {
        Toast.makeText(this.f14310a.getApplicationContext(), this.f14310a.mo7241b((int) R.string.baidu_pcs_login_failed), 0).show();
    }

    public void onComplete(BaiduOAuth.BaiduOAuthResponse baiduOAuthResponse) {
        if (!this.f14310a.f13388m) {
            if (baiduOAuthResponse != null) {
                Toast.makeText(this.f14310a.getApplicationContext(), this.f14310a.mo7241b((int) R.string.baidu_pcs_login_succeed), 0).show();
                this.f14310a.m13644a(baiduOAuthResponse.getUserName(), baiduOAuthResponse.getAccessToken(), baiduOAuthResponse.getExpiresIn());
                this.f14310a.m13634C();
                return;
            }
            Toast.makeText(this.f14310a.getApplicationContext(), this.f14310a.mo7241b((int) R.string.baidu_pcs_login_failed), 0).show();
        }
    }

    public void onCancel() {
        boolean unused = this.f14310a.f13388m = true;
    }
}
