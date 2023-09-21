package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.plugin.twitter.AuthorizeActivity;
import com.cootek.smartinput5.plugin.twitter.ShareActivity;

/* renamed from: com.cootek.smartinput5.ui.settings.aM */
/* compiled from: InvitationDialog */
class C2998aM implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InvitationDialog f13826a;

    C2998aM(InvitationDialog invitationDialog) {
        this.f13826a = invitationDialog;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f13826a.f13462g, AuthorizeActivity.class);
        intent.addCategory("com.cootek.smartinput.intent.category.MINIMODE");
        intent.putExtra(ShareActivity.f10507a, this.f13826a.f13469n);
        intent.putExtra(ShareActivity.f10508b, true);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 3);
        bundle.putInt(IPCManager.SETTING_KEY, Settings.INVITE_SUCCEED);
        bundle.putBoolean(IPCManager.SETTING_VALUE, true);
        intent.putExtra(ShareActivity.f10509c, bundle);
        this.f13826a.f13462g.startActivity(intent);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        this.f13826a.finish();
    }
}
