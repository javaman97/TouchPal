package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2869n;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.C */
/* compiled from: TradSimpConvertDialog */
public class C1924C extends C2869n {

    /* renamed from: a */
    private Context f6516a;

    /* renamed from: b */
    private C1925a f6517b;

    /* renamed from: com.cootek.smartinput5.func.paopaopanel.C$a */
    /* compiled from: TradSimpConvertDialog */
    public interface C1925a {
        /* renamed from: a */
        void mo4420a();
    }

    public C1924C(Context context) {
        super(context, true, true);
        this.f6516a = context;
    }

    /* renamed from: a */
    public void mo7053a() {
        mo7086a((C1925a) null);
    }

    /* renamed from: a */
    public void mo7086a(C1925a aVar) {
        if (!mo9536c_()) {
            this.f6517b = aVar;
            mo9528a((CharSequence) C1974m.m9063a(this.f6516a, (int) R.string.trad_simp_convert_dialog_title));
            mo9526a(new C1922A(this.f6516a, this, this.f6517b).mo7084b());
            mo8596d_().setVisibility(8);
            mo8595d().setOnClickListener(new C1926D(this));
            super.mo7053a();
        }
    }
}
