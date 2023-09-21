package com.cootek.smartinput5.p066ui;

import android.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.ui.y */
/* compiled from: ClipboardSimpleAdapter */
class C3257y implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f14336a;

    /* renamed from: b */
    final /* synthetic */ View f14337b;

    /* renamed from: c */
    final /* synthetic */ C2939q f14338c;

    C3257y(C2939q qVar, int i, View view) {
        this.f14338c = qVar;
        this.f14336a = i;
        this.f14337b = view;
    }

    public void onClick(View view) {
        if (this.f14336a >= 0 && this.f14336a < this.f14338c.f13350e.size()) {
            if (((Boolean) ((Map) this.f14338c.f13350e.get(this.f14336a)).get("islocked")).booleanValue()) {
                AlertDialog create = new AlertDialog.Builder(Engine.getInstance().getIms()).setTitle(this.f14338c.m13605c((int) R.string.clipboard_delete_confirm_message)).setMessage((CharSequence) null).setNegativeButton(this.f14338c.m13605c((int) R.string.clipboard_delete_confirm_no), new C2608A(this)).setPositiveButton(this.f14338c.m13605c((int) R.string.clipboard_delete_confirm_yes), new C3258z(this, view)).create();
                Window window = create.getWindow();
                window.setGravity(81);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.x = 0;
                attributes.y = this.f14338c.f13362q.getDisplayHeight() / 4;
                attributes.height = this.f14338c.f13362q.getDisplayHeight() / 2;
                attributes.type = C2261Q.f9802h;
                window.setAttributes(attributes);
                window.addFlags(131072);
                this.f14338c.mo9734a(this.f14337b);
                Engine.getInstance().getDialogManager().showDialog(create);
                C1246d.m6010a(this.f14338c.f13348c).mo4591a(C1246d.f3753aW, C1246d.f3822bm, C1246d.f3783b);
                return;
            }
            this.f14338c.mo9737b(this.f14336a);
            ((View) view.getParent().getParent()).startAnimation(this.f14338c.f13359n);
            C1246d.m6010a(this.f14338c.f13348c).mo4591a(C1246d.f3753aW, C1246d.f3824bo, C1246d.f3783b);
        }
    }
}
