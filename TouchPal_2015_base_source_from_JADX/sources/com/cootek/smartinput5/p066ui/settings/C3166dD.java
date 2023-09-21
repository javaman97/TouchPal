package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.Toast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.component.C1684q;
import com.cootek.smartinput5.p045a.C1056a;
import com.emoji.keyboard.touchpal.R;
import java.io.File;

/* renamed from: com.cootek.smartinput5.ui.settings.dD */
/* compiled from: TouchPalCloudActivity */
class C3166dD implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CheckBox f14220a;

    /* renamed from: b */
    final /* synthetic */ TouchPalCloudActivity f14221b;

    C3166dD(TouchPalCloudActivity touchPalCloudActivity, CheckBox checkBox) {
        this.f14221b = touchPalCloudActivity;
        this.f14220a = checkBox;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        File[] listFiles;
        if (C1368X.m6324d()) {
            if (!Engine.isInitialized()) {
                Toast.makeText(this.f14221b.f13734a, this.f14221b.mo7241b((int) R.string.usr_dict_busy), 1).show();
            } else {
                C1368X.m6320c().mo5835h().release();
                File a = C1466av.m6848a(this.f14221b);
                if (!(a == null || (listFiles = a.listFiles(new C3167dE(this))) == null)) {
                    for (File file : listFiles) {
                        if (file != null && file.exists()) {
                            file.delete();
                        }
                    }
                }
                C1368X.m6320c().mo5835h().init();
                C1684q.m7769a().mo6553b(this.f14221b.f13734a, 1).mo6513c();
                if (this.f14220a.isChecked()) {
                    C1684q.m7769a().mo6551a(this.f14221b.f13734a, (Integer) 1);
                    C1684q.m7769a().mo6556d(this.f14221b.f13734a, 1, false);
                }
                Toast.makeText(this.f14221b.f13734a, this.f14221b.mo7241b((int) R.string.clear_userdata_success), 0).show();
            }
        }
        C1056a.m5588a().mo4264a(C1056a.f2947H, this.f14221b.f13734a);
    }
}
