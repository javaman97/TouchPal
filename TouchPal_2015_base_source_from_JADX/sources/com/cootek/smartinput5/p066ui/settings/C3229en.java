package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.ui.settings.en */
/* compiled from: VoiceInputEngineDialogPreference */
class C3229en implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ VoiceInputEngineDialogPreference f14296a;

    C3229en(VoiceInputEngineDialogPreference voiceInputEngineDialogPreference) {
        this.f14296a = voiceInputEngineDialogPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f14296a.mVoiceEngineIndex != i) {
            if (i == 1) {
                this.f14296a.updateVoiceLanguagePref(false);
            } else if (i == 0) {
                this.f14296a.updateVoiceLanguagePref(true);
            }
        }
        int unused = this.f14296a.mVoiceEngineIndex = i;
        this.f14296a.updateVoiceInputEngine(this.f14296a.mVoiceEngineIndex);
        this.f14296a.updateSummary();
        dialogInterface.dismiss();
    }
}
