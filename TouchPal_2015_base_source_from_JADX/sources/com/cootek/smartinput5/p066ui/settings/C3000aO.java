package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2225al;

/* renamed from: com.cootek.smartinput5.ui.settings.aO */
/* compiled from: InvitationDialog */
class C3000aO implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InvitationDialog f13828a;

    C3000aO(InvitationDialog invitationDialog) {
        this.f13828a = invitationDialog;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(C2225al.m10054a(this.f13828a.getBaseContext(), C1974m.m9063a(this.f13828a.getBaseContext(), C1593bR.m7162a().mo6232a(15)))));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        this.f13828a.getBaseContext().startActivity(intent);
        this.f13828a.finish();
    }
}
