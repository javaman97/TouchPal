package com.cootek.smartinput5.p066ui.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ListView;
import com.cootek.smartinput.p044a.C0978q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.VoiceInputLanguageDialogPreference */
public class VoiceInputLanguageDialogPreference extends CustomizableDialogPreference {
    private C2991aG mAdapter;

    public VoiceInputLanguageDialogPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3230eo eoVar = new C3230eo(this);
        if (C0978q.m5067c()) {
            this.mAdapter = new C2993aH(context, eoVar);
        } else {
            this.mAdapter = new C3227el(context, eoVar);
        }
        updateSummary();
    }

    private void updateSummary() {
        setSummary(this.mAdapter.mo10069b());
    }

    /* access modifiers changed from: protected */
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    /* access modifiers changed from: protected */
    public void showDialog(Bundle bundle) {
        if (C0978q.m5067c()) {
            ((C2993aH) this.mAdapter).mo10307g();
        } else {
            ((C3227el) this.mAdapter).mo10307g();
        }
        super.showDialog(bundle);
        ListView listView = (ListView) getDialog().findViewById(R.id.font_list);
        if (listView != null) {
            updateList(listView);
        }
    }

    /* access modifiers changed from: protected */
    public void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        updateSummary();
    }

    private void updateList(ListView listView) {
        if (C0978q.m5067c()) {
            listView.setAdapter((C2993aH) this.mAdapter);
        } else {
            listView.setAdapter((C3227el) this.mAdapter);
        }
        listView.setChoiceMode(1);
    }
}
