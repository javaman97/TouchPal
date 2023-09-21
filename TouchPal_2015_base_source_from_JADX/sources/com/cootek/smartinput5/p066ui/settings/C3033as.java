package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.settings.as */
/* compiled from: EmojiDisplayDialogPreference */
class C3033as implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EmojiDisplayDialogPreference f13948a;

    C3033as(EmojiDisplayDialogPreference emojiDisplayDialogPreference) {
        this.f13948a = emojiDisplayDialogPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        int unused = this.f13948a.mEmojiDiplayIndex = i;
        this.f13948a.updateSetting();
        this.f13948a.updateSummary();
        if (i == 0 && this.f13948a.needDownloadDialog()) {
            this.f13948a.showDownloadDialog();
        }
        dialogInterface.dismiss();
    }
}
