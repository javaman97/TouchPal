package com.cootek.smartinput5.p066ui.settings;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;
import java.io.File;

/* renamed from: com.cootek.smartinput5.ui.settings.cJ */
/* compiled from: SkinCustomizeActivity */
class C3115cJ implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SkinCustomizeActivity f14124a;

    C3115cJ(SkinCustomizeActivity skinCustomizeActivity) {
        this.f14124a = skinCustomizeActivity;
    }

    public void onClick(View view) {
        File g = this.f14124a.m14027g();
        if (g == null) {
            Toast.makeText(this.f14124a, this.f14124a.getResString(R.string.sdcard_not_ready_message), 1).show();
            this.f14124a.finish();
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", Uri.fromFile(g));
        try {
            this.f14124a.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e) {
        }
    }
}
