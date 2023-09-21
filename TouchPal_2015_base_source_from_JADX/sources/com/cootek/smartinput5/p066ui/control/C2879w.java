package com.cootek.smartinput5.p066ui.control;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;
import java.io.File;

/* renamed from: com.cootek.smartinput5.ui.control.w */
/* compiled from: GetImageActivity */
class C2879w implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ GetImageActivity f13095a;

    C2879w(GetImageActivity getImageActivity) {
        this.f13095a = getImageActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                File a = this.f13095a.m12937d();
                if (a == null) {
                    Toast.makeText(this.f13095a, this.f13095a.getResString(R.string.sdcard_not_ready_message), 1).show();
                    this.f13095a.finish();
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", Uri.fromFile(a));
                try {
                    this.f13095a.startActivityForResult(intent, 0);
                } catch (ActivityNotFoundException e) {
                }
                dialogInterface.dismiss();
                return;
            case 1:
                Intent intent2 = new Intent("android.intent.action.PICK");
                intent2.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                try {
                    this.f13095a.startActivityForResult(intent2, 1);
                } catch (ActivityNotFoundException e2) {
                }
                dialogInterface.dismiss();
                return;
            default:
                return;
        }
    }
}
