package com.cootek.smartinput5.p066ui.settings;

import android.widget.Toast;
import com.cootek.smartinput5.p066ui.settings.BaiduAuthActivity;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.y */
/* compiled from: BaiduAuthActivity */
class C3250y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3249x f14322a;

    C3250y(C3249x xVar) {
        this.f14322a = xVar;
    }

    public void run() {
        try {
            this.f14322a.f14321a.f13390o.clear();
            boolean z = true;
            for (String str : this.f14322a.f14321a.f13384i) {
                if (Thread.interrupted()) {
                    this.f14322a.f14321a.m13696q();
                    return;
                }
                z &= this.f14322a.f14321a.m13652b(str);
                if (Thread.interrupted()) {
                    this.f14322a.f14321a.m13696q();
                    return;
                }
            }
            if (!z) {
                this.f14322a.f14321a.m13696q();
            } else if (!this.f14322a.f14321a.f13390o.isEmpty()) {
                this.f14322a.f14321a.m13698r();
            } else {
                this.f14322a.f14321a.f13389n.post(new C3251z(this));
                this.f14322a.f14321a.f13386k.dismiss();
                return;
            }
            this.f14322a.f14321a.f13389n.post(new C2947A(this, z));
        } catch (BaiduAuthActivity.C2949a e) {
            Toast.makeText(this.f14322a.f14321a.getApplicationContext(), this.f14322a.f14321a.mo7241b((int) R.string.baidu_pcs_need_relogin), 0).show();
            this.f14322a.f14321a.f13389n.post(new C2948B(this));
            this.f14322a.f14321a.m13644a("", "", "");
            this.f14322a.f14321a.m13633B();
        }
    }
}
