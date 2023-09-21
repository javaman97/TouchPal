package com.cootek.smartinput5.p066ui.settings;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.cP */
/* compiled from: SkinDialogWidget */
public class C3121cP {

    /* renamed from: a */
    private Context f14131a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Dialog f14132b = new Dialog(this.f14131a);

    /* renamed from: c */
    private View f14133c;

    public C3121cP(Context context) {
        this.f14131a = context;
        this.f14132b.requestWindowFeature(1);
        this.f14133c = ((LayoutInflater) this.f14131a.getSystemService("layout_inflater")).inflate(R.layout.skin_alert_dialog, (ViewGroup) null);
        mo10242b((String) null, (View.OnClickListener) null);
    }

    /* renamed from: a */
    public void mo10239a(String str, View.OnClickListener onClickListener) {
        if (this.f14133c != null) {
            TextView textView = (TextView) this.f14133c.findViewById(R.id.positive);
            if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
            }
            textView.setOnClickListener(new C3122cQ(this, onClickListener));
        }
    }

    /* renamed from: a */
    public void mo10238a(String str) {
        if (this.f14133c != null) {
            ((TextView) this.f14133c.findViewById(R.id.message)).setText(str);
        }
    }

    /* renamed from: b */
    public void mo10242b(String str, View.OnClickListener onClickListener) {
        if (this.f14133c != null) {
            TextView textView = (TextView) this.f14133c.findViewById(R.id.negative);
            if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
            }
            textView.setOnClickListener(new C3123cR(this, onClickListener));
        }
    }

    /* renamed from: a */
    public boolean mo10240a() {
        if (this.f14132b == null) {
            return false;
        }
        return this.f14132b.isShowing();
    }

    /* renamed from: b */
    public void mo10241b() {
        this.f14132b.setContentView(this.f14133c);
        try {
            this.f14132b.show();
        } catch (Exception e) {
        }
    }
}
