package com.cootek.smartinput5.p066ui.control;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.control.CancelDownloadActivity */
public class CancelDownloadActivity extends C1976b {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        int i = extras.getInt("TYPE");
        String string = extras.getString("FILENAME");
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        aVar.setNegativeButton(getResString(R.string.no), new C2859d(this));
        aVar.setOnCancelListener(new C2860e(this));
        aVar.setPositiveButton(getResString(R.string.yes), new C2861f(this, i));
        aVar.setMessage(String.format(getResString(R.string.download_apk_cancel), new Object[]{string}));
        aVar.setTitle(getResString(C1593bR.m7162a().mo6232a(16)));
        aVar.create().show();
    }
}
