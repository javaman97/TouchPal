package com.cootek.smartinput5.p050f;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.f.c */
/* compiled from: WizardPopupWindow */
class C1322c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Button f4042a;

    /* renamed from: b */
    final /* synthetic */ Button f4043b;

    /* renamed from: c */
    final /* synthetic */ ImageView f4044c;

    /* renamed from: d */
    final /* synthetic */ TextView f4045d;

    /* renamed from: e */
    final /* synthetic */ C1319a f4046e;

    C1322c(C1319a aVar, Button button, Button button2, ImageView imageView, TextView textView) {
        this.f4046e = aVar;
        this.f4042a = button;
        this.f4043b = button2;
        this.f4044c = imageView;
        this.f4045d = textView;
    }

    public void onClick(View view) {
        this.f4042a.setVisibility(8);
        this.f4043b.setVisibility(8);
        this.f4044c.setVisibility(0);
        this.f4045d.setText(this.f4046e.m6099b((int) R.string.import_dic_waiting_msg));
        Handler handler = new Handler();
        handler.postDelayed(new C1323d(this, handler), 100);
    }
}
