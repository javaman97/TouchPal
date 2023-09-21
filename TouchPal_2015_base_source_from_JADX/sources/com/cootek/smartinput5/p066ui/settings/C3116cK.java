package com.cootek.smartinput5.p066ui.settings;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.provider.MediaStore;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.cK */
/* compiled from: SkinCustomizeActivity */
class C3116cK implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SkinCustomizeActivity f14125a;

    C3116cK(SkinCustomizeActivity skinCustomizeActivity) {
        this.f14125a = skinCustomizeActivity;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        try {
            this.f14125a.startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException e) {
        }
    }
}
