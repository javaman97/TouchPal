package com.cootek.smartinput5.p066ui.settings;

import android.view.View;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.aQ */
/* compiled from: InvitationDialog */
class C3002aQ implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InvitationDialog f13830a;

    C3002aQ(InvitationDialog invitationDialog) {
        this.f13830a = invitationDialog;
    }

    public void onClick(View view) {
        if (!this.f13830a.mo9865a()) {
            Toast.makeText(this.f13830a.getBaseContext(), this.f13830a.getResString(R.string.invitation_failed), 0).show();
            if (this.f13830a.f13464i != null) {
                this.f13830a.f13464i.setText("");
                return;
            }
            return;
        }
        Settings.getInstance().setBoolSetting(Settings.INVITE_SUCCEED, true);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        this.f13830a.finish();
    }
}
