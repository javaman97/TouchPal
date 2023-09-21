package com.cootek.smartinput5.func.component;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.component.C1648J;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.component.O */
/* compiled from: HotWordUpdater */
public class C1654O implements C1648J.C1649a {

    /* renamed from: a */
    private ProgressDialog f5377a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Activity f5378b;

    /* renamed from: c */
    private Context f5379c = this.f5378b.getBaseContext();

    public C1654O(Activity activity) {
        this.f5378b = activity;
    }

    /* renamed from: a */
    public void mo6473a() {
        C1584bI.m7145b(this.f5378b, new C1655P(this), false);
    }

    /* renamed from: b */
    public void mo6474b() {
        if (!C2188Q.m9853a().mo7686f()) {
            m7586a(C1974m.m9063a(this.f5379c, (int) R.string.download_apk_nonetwork), false);
            return;
        }
        String a = C1974m.m9063a(this.f5379c, (int) R.string.update_hotword_title);
        String a2 = C1974m.m9063a(this.f5379c, (int) R.string.update_hotword_message);
        C1648J.m7531a().mo6459a((C1648J.C1649a) this, false);
        C1648J.m7531a().mo6464e();
        this.f5377a = ProgressDialog.show(this.f5378b, a, a2, true, true);
        this.f5377a.setOnDismissListener(new C1656Q(this));
    }

    /* renamed from: a */
    private void m7586a(String str, boolean z) {
        Context context = this.f5379c;
        String a = C1974m.m9063a(context, (int) R.string.update_hotword_title);
        if (this.f5377a != null) {
            this.f5377a.dismiss();
        }
        new C2894d.C2895a(this.f5378b).setTitle(a).setMessage(str).setPositiveButton(C1974m.m9063a(context, 17039370), new C1657R(this, z, context)).show();
    }

    /* renamed from: d */
    public void mo6467d() {
    }

    /* renamed from: e */
    public void mo6468e() {
        m7586a(C1974m.m9063a(this.f5379c, (int) R.string.update_hotword_error), false);
        C1648J.m7531a().mo6459a((C1648J.C1649a) null, false);
    }

    /* renamed from: a */
    public void mo6466a(String str, boolean z, boolean z2) {
        m7586a(str, true);
        C1648J.m7531a().mo6459a((C1648J.C1649a) null, false);
    }

    /* renamed from: g_ */
    public void mo6470g_() {
        if (this.f5377a != null) {
            this.f5377a.dismiss();
        }
    }

    /* renamed from: g */
    public void mo6469g() {
        m7586a(C1974m.m9063a(this.f5379c, (int) R.string.update_hotword_no_content), true);
        C1648J.m7531a().mo6459a((C1648J.C1649a) null, false);
    }
}
