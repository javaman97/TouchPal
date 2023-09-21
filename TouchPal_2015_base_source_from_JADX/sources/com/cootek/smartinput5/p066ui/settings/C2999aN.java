package com.cootek.smartinput5.p066ui.settings;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.engine.Engine;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.aN */
/* compiled from: InvitationDialog */
class C2999aN implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ InvitationDialog f13827a;

    C2999aN(InvitationDialog invitationDialog) {
        this.f13827a = invitationDialog;
    }

    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------");
        sb.append("\nManufacturer: ");
        sb.append(Build.MANUFACTURER);
        sb.append("\nModel: ");
        sb.append(Build.MODEL);
        sb.append("\nRelease: ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(C0911j.f2473c);
        sb.append("--------------------------------\n");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + "beta@cootek.com"));
        intent.putExtra("android.intent.extra.SUBJECT", this.f13827a.getResString(R.string.invitation_apply_email_title) + "(" + this.f13827a.getResString(R.string.optpage_version_summary) + ")");
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        intent.addFlags(Engine.EXCEPTION_ERROR);
        try {
            this.f13827a.f13462g.startActivity(intent);
            this.f13827a.finish();
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.f13827a.f13462g, this.f13827a.getResString(R.string.mailclient_not_found), 0).show();
        }
    }
}
