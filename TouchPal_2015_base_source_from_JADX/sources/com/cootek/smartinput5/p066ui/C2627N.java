package com.cootek.smartinput5.p066ui;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1372a;
import com.cootek.smartinput5.p066ui.C2806cb;

/* renamed from: com.cootek.smartinput5.ui.N */
/* compiled from: EditKey */
class C2627N implements C2806cb.C2807a {

    /* renamed from: a */
    final /* synthetic */ EditKey f11476a;

    C2627N(EditKey editKey) {
        this.f11476a = editKey;
    }

    /* renamed from: a */
    public void mo8670a(int i) {
        if (this.f11476a.keyActionId > 0) {
            C1372a q = C1368X.m6320c().mo5844q();
            if (q.mo5864c()) {
                if (TextUtils.isEmpty(this.f11476a.mSoftKeyInfo.mainTitle)) {
                    q.mo5861a("@string/accessibility_edit_" + this.f11476a.keyName.substring(3));
                } else {
                    q.mo5861a(this.f11476a.mSoftKeyInfo.mainTitle);
                }
            }
            Engine.getInstance().commitKeyEvent(this.f11476a.keyActionId);
        }
    }
}
