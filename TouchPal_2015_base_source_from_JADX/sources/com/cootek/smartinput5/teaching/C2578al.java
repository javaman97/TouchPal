package com.cootek.smartinput5.teaching;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.teaching.al */
/* compiled from: TutorialWelcomeDialog */
public class C2578al {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f11064a;

    /* renamed from: b */
    private ViewGroup f11065b;

    /* renamed from: c */
    private Button f11066c;

    /* renamed from: d */
    private Button f11067d;

    /* renamed from: e */
    private AlertDialog.Builder f11068e;

    /* renamed from: f */
    private AlertDialog f11069f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f11070g;

    public C2578al(Context context) {
        this.f11064a = context;
        m11490c();
    }

    /* renamed from: c */
    private void m11490c() {
        this.f11070g = false;
        this.f11065b = (ViewGroup) ((LayoutInflater) this.f11064a.getSystemService("layout_inflater")).inflate(R.layout.tutorial_guide_dlg, (ViewGroup) null);
        this.f11065b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f11066c = (Button) this.f11065b.findViewById(R.id.yes);
        if (this.f11066c != null) {
            this.f11066c.setOnClickListener(new C2579am(this));
        }
        this.f11067d = (Button) this.f11065b.findViewById(R.id.no);
        if (this.f11067d != null) {
            this.f11067d.setOnClickListener(new C2580an(this));
        }
        this.f11068e = new C2894d.C2895a(C1368X.m6313b());
        this.f11068e.setView(this.f11065b);
        this.f11069f = this.f11068e.create();
        this.f11069f.setCanceledOnTouchOutside(false);
        this.f11069f.setOnDismissListener(new C2581ao(this));
        WindowManager.LayoutParams attributes = this.f11069f.getWindow().getAttributes();
        attributes.alpha = 0.9f;
        attributes.token = Engine.getInstance().getWidgetManager().mo9637b().getWindowToken();
        attributes.type = 1000;
    }

    /* renamed from: a */
    public void mo8437a() {
        this.f11069f.show();
    }

    /* renamed from: b */
    public void mo8438b() {
        if (this.f11069f != null && this.f11069f.isShowing()) {
            this.f11069f.dismiss();
        }
    }
}
