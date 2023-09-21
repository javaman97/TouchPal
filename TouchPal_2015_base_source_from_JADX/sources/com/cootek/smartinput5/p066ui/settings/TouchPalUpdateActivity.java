package com.cootek.smartinput5.p066ui.settings;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.TouchPalUpdateActivity */
public class TouchPalUpdateActivity extends C1976b {

    /* renamed from: b */
    public static final String f13759b = "updateInapp";

    /* renamed from: a */
    ProgressDialog f13760a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f13761c = false;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (getIntent().getBooleanExtra("HAS_UPDATE", false)) {
            m14132d();
        } else {
            C1584bI.m7131a((Context) this, (Runnable) new C3180dR(this), (Runnable) new C3181dS(this), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14124a() {
        if (!C2188Q.m9853a().mo7686f()) {
            finish();
            Toast.makeText(this, getResString(R.string.network_failed_prompt), 0).show();
            return;
        }
        String resString = getResString(R.string.update_title);
        String resString2 = getResString(R.string.update_checking);
        C2243D d = new C2243D();
        d.f9517c = C1368X.m6320c().mo5832R();
        d.f9518d = String.valueOf(C1368X.m6319c((Context) this));
        d.f9519e = false;
        d.f9520f = true;
        C2373x xVar = new C2373x(d);
        this.f13760a = ProgressDialog.show(this, resString, resString2, true, true);
        this.f13760a.setOnCancelListener(new C3182dT(this, xVar));
        xVar.mo8060a((C2373x.C2376b) new C3183dU(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f13761c = true;
        m14128b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m14128b() {
        if (this.f13760a != null && this.f13760a.isShowing()) {
            this.f13760a.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m14130c() {
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        aVar.setTitle(getResString(R.string.update_title));
        aVar.setMessage(getResString(R.string.update_uptodate));
        aVar.setPositiveButton(getResString(R.string.ok), new C3184dV(this));
        aVar.setCancelable(false);
        try {
            aVar.create().show();
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14125a(C2243D d) {
        try {
            if (C1368X.m6319c((Context) this) < Integer.valueOf(d.f9521g).intValue()) {
                m14132d();
                return;
            }
            d.mo7785j();
            m14130c();
        } catch (NumberFormatException e) {
        }
    }

    /* renamed from: d */
    private void m14132d() {
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        aVar.setTitle(getResString(R.string.update_title));
        aVar.setMessage(getResString(R.string.update_upgrade));
        aVar.setPositiveButton(getResString(R.string.download_now), new C3185dW(this));
        aVar.setNegativeButton(getResString(R.string.later), new C3186dX(this));
        aVar.setCancelable(false);
        try {
            aVar.create().show();
        } catch (WindowManager.BadTokenException e) {
            e.printStackTrace();
        }
    }
}
