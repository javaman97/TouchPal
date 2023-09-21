package com.cootek.smartinput5.plugin.typingrace;

import android.app.ProgressDialog;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.J */
/* compiled from: RankList */
class C2434J implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RankList f10627a;

    C2434J(RankList rankList) {
        this.f10627a = rankList;
    }

    public void run() {
        ProgressDialog progressDialog = new ProgressDialog(this.f10627a);
        progressDialog.setMessage(this.f10627a.getString(R.string.race_waiting));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(true);
        progressDialog.setButton(-2, this.f10627a.getResString(R.string.race_cancel), new C2435K(this));
        progressDialog.setOnDismissListener(new C2436L(this));
        if (!progressDialog.isShowing()) {
            progressDialog.show();
        }
        ProgressDialog unused = this.f10627a.f10702r = progressDialog;
    }
}
