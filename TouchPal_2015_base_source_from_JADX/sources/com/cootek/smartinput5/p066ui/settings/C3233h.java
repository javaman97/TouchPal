package com.cootek.smartinput5.p066ui.settings;

import android.widget.Toast;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.p066ui.settings.BaiduAuthActivity;
import com.emoji.keyboard.touchpal.R;
import java.io.File;

/* renamed from: com.cootek.smartinput5.ui.settings.h */
/* compiled from: BaiduAuthActivity */
class C3233h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3232g f14300a;

    C3233h(C3232g gVar) {
        this.f14300a = gVar;
    }

    public void run() {
        boolean z = true;
        try {
            this.f14300a.f14299a.f13391p.clear();
            for (String str : this.f14300a.f14299a.f13384i) {
                if (Thread.interrupted()) {
                    this.f14300a.f14299a.m13704u();
                    return;
                }
                if (new File(C1466av.m6848a(this.f14300a.f14299a.getApplicationContext()), str).exists()) {
                    boolean unused = this.f14300a.f14299a.m13658c(str + ".tmp");
                    boolean a = this.f14300a.f14299a.m13653b(C1466av.m6848a(this.f14300a.f14299a.getApplicationContext()).getAbsolutePath(), str);
                    if (a) {
                        this.f14300a.f14299a.f13391p.add(str);
                    }
                    z &= a;
                    if (Thread.interrupted()) {
                        this.f14300a.f14299a.m13704u();
                        return;
                    }
                }
            }
            if (z) {
                this.f14300a.f14299a.m13706v();
            } else {
                this.f14300a.f14299a.m13704u();
            }
            this.f14300a.f14299a.f13389n.post(new C3234i(this, z));
        } catch (BaiduAuthActivity.C2949a e) {
            Toast.makeText(this.f14300a.f14299a.getApplicationContext(), this.f14300a.f14299a.mo7241b((int) R.string.baidu_pcs_need_relogin), 0).show();
            this.f14300a.f14299a.f13389n.post(new C3235j(this));
            this.f14300a.f14299a.m13644a("", "", "");
            this.f14300a.f14299a.m13633B();
        }
    }
}
