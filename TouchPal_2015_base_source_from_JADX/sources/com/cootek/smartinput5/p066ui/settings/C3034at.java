package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.settings.at */
/* compiled from: EmojiDisplayDialogPreference */
class C3034at implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EmojiDisplayDialogPreference f13949a;

    C3034at(EmojiDisplayDialogPreference emojiDisplayDialogPreference) {
        this.f13949a = emojiDisplayDialogPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f13949a.download();
    }
}
