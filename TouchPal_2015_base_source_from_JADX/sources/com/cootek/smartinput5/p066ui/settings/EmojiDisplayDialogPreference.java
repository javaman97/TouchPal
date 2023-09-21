package com.cootek.smartinput5.p066ui.settings;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.smileypanel.C2003a;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.EmojiDisplayDialogPreference */
public class EmojiDisplayDialogPreference extends CustomizableDialogPreference {
    private static final int CLASSIC_INDEX = 0;
    private static final int SYSTEM_INDEX = 1;
    private AlertDialog.Builder mDialogBuilder;
    /* access modifiers changed from: private */
    public int mEmojiDiplayIndex;

    public EmojiDisplayDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        this.mEmojiDiplayIndex = getDefaultIndex();
        this.mDialogBuilder = new AlertDialog.Builder(getContext());
        this.mDialogBuilder.setTitle(getResString(R.string.emoji_display_title)).setNegativeButton(getResString(R.string.cancel), (DialogInterface.OnClickListener) null).setSingleChoiceItems(getDisplayTitles(), this.mEmojiDiplayIndex, new C3033as(this));
        this.mDialogBuilder.show();
    }

    /* access modifiers changed from: private */
    public boolean needDownloadDialog() {
        return !C2003a.m9262c().mo7354i();
    }

    /* access modifiers changed from: private */
    public void showDownloadDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(getResString(R.string.emoji_download_title)).setMessage(getResString(R.string.emoji_download_msg)).setPositiveButton(getResString(17039370), new C3034at(this)).setNegativeButton(getResString(17039360), (DialogInterface.OnClickListener) null);
        builder.show();
    }

    /* access modifiers changed from: private */
    public void download() {
        Settings.getInstance().setBoolSetting(Settings.DISPLAY_EMOJI_BY_SYSTEM, false);
        if (C1584bI.m7154g(getContext())) {
            goToPlay();
        } else {
            C1368X.m6320c().mo5825K().launchShop(4, OnlineShopActivity.f13573t);
        }
    }

    private void goToPlay() {
        try {
            C1584bI.m7134a(getContext(), C1351J.f4164i, true, C1351J.f4163h);
        } catch (ActivityNotFoundException e) {
        }
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        updateSummary();
    }

    /* access modifiers changed from: private */
    public void updateSetting() {
        Settings.getInstance().setBoolSetting(Settings.DISPLAY_EMOJI_BY_SYSTEM, this.mEmojiDiplayIndex != 0, false);
    }

    private int getDefaultIndex() {
        if (!C2003a.m9262c().mo7354i() || Settings.getInstance().getBoolSetting(Settings.DISPLAY_EMOJI_BY_SYSTEM)) {
            return 1;
        }
        return 0;
    }

    private String[] getDisplayTitles() {
        return C1974m.m9070b(getContext(), R.array.emoji_display_candidate_titles);
    }

    public void updateSummary() {
        setSummary(getDisplayTitles()[getDefaultIndex()]);
    }
}
