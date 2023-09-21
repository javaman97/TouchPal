package com.cootek.smartinput5.presentations;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Toast;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput.utilities.C0994c;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

public class DownloadInStatusActivity extends Activity {

    /* renamed from: a */
    private String f10766a = null;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z = false;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (C1358O.m6239b() == null) {
            Toast.makeText(this, m11188a((int) R.string.sdcard_not_ready_message), 1).show();
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            finish();
            return;
        }
        this.f10766a = extras.getString(C2515q.f10829b);
        if (C1358O.m6239b() == null) {
            Toast.makeText(this, m11188a((int) R.string.sdcard_not_ready_message), 1).show();
            m11190a(C0994c.C0995a.NO_SDCARD);
            finish();
            return;
        }
        boolean z2 = extras.getBoolean(C2515q.f10838k);
        boolean z3 = extras.getBoolean(C2515q.f10839l);
        boolean e = C2188Q.m9853a().mo7685e();
        C2188Q.m9853a().mo7684d();
        if (z2 || (z3 && !e)) {
            z = true;
        }
        if (z) {
            String a = m11188a((int) R.string.presentation_download_confirm_msg);
            if (z3 && !e) {
                a = a + C0911j.f2473c + m11188a((int) R.string.presentation_download_non_wifi_reminder_msg);
            }
            m11193a(a, extras);
            return;
        }
        m11189a(extras);
        finish();
    }

    /* renamed from: a */
    private String m11188a(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* renamed from: a */
    private void m11193a(String str, Bundle bundle) {
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        aVar.setPositiveButton(m11188a((int) R.string.yes), new C2507i(this, bundle));
        aVar.setNegativeButton(m11188a((int) R.string.no), new C2508j(this));
        aVar.setOnCancelListener(new C2509k(this));
        aVar.setMessage(str);
        aVar.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11189a(Bundle bundle) {
        C2361q.m10797b().mo8003a(bundle.getString(C2515q.f10829b), bundle.getString(C2515q.f10830c), bundle.getString(C2515q.f10835h), bundle.getBoolean(C2515q.f10836i, true), bundle.getBoolean(C2515q.f10832e, false), bundle.getBoolean(C2515q.f10837j, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11190a(C0994c.C0995a aVar) {
        C0994c.m5165a(this.f10766a, aVar);
    }
}
