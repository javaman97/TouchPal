package com.cootek.smartinput5.p066ui.control;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.control.RetryDownloadActivity */
public class RetryDownloadActivity extends C1976b {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        m13041a();
    }

    /* renamed from: a */
    private void m13041a() {
        new C2894d.C2895a(this).setMessage(getResString(R.string.download_failed)).setPositiveButton(getResString(R.string.yes), new C2838P(this)).setNegativeButton(getResString(R.string.no), new C2837O(this)).setOnCancelListener(new C2836N(this)).show();
    }
}
