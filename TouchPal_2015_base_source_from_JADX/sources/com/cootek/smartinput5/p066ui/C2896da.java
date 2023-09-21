package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.cootek.smartinput.p044a.C0978q;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.cootek.smartinput5.p066ui.settings.C2991aG;
import com.cootek.smartinput5.p066ui.settings.C2993aH;
import com.cootek.smartinput5.p066ui.settings.C3227el;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.da */
/* compiled from: VoiceChooserDialog */
public class C2896da extends C2869n {

    /* renamed from: a */
    private C2991aG f13124a;

    /* renamed from: b */
    private Context f13125b;

    /* renamed from: c */
    private C2897a f13126c;

    /* renamed from: com.cootek.smartinput5.ui.da$a */
    /* compiled from: VoiceChooserDialog */
    public interface C2897a {
        /* renamed from: a */
        void mo9569a(String str);
    }

    public C2896da(Context context, boolean z, boolean z2) {
        super(context, z, z2);
        this.f13125b = context;
        C2898db dbVar = new C2898db(this);
        if (C0978q.m5067c()) {
            this.f13124a = new C2993aH(context, dbVar);
        } else {
            this.f13124a = new C3227el(context, dbVar);
        }
    }

    /* renamed from: a */
    public void mo9568a(C2897a aVar) {
        this.f13126c = aVar;
    }

    /* renamed from: a */
    public void mo7053a() {
        LayoutInflater layoutInflater = (LayoutInflater) this.f13125b.getSystemService("layout_inflater");
        ScrollView scrollView = (ScrollView) layoutInflater.inflate(R.layout.voice_choose_dialog_content, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) scrollView.findViewById(R.id.voice_choose_content_view);
        linearLayout.setOrientation(1);
        this.f13124a.mo10068a(-1);
        for (int i = 0; i < this.f13124a.getCount(); i++) {
            LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.voice_choose_dialog_item, (ViewGroup) null);
            View a = this.f13124a.mo10066a(i, (View) null, linearLayout2);
            a.setVisibility(0);
            ((LinearLayout) linearLayout2.findViewById(R.id.item_content)).addView(a);
            if (i == this.f13124a.getCount() - 1) {
                linearLayout2.findViewById(R.id.item_divider).setVisibility(8);
            }
            linearLayout.addView(linearLayout2, i);
        }
        mo9526a((View) scrollView);
        mo8596d_().setVisibility(8);
        mo8595d().setOnClickListener(new C2899dc(this));
        super.mo7053a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e_ */
    public boolean mo8598e_() {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m13349g() {
        if (this.f13126c != null) {
            this.f13126c.mo9569a(this.f13124a.mo10067a());
        }
    }
}
