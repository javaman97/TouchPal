package com.cootek.smartinput5.func.mainentrance;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.TButton;
import com.cootek.smartinput5.func.resource.p055ui.TTextView;
import com.cootek.smartinput5.func.share.C1985g;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.mainentrance.h */
/* compiled from: SkinPreviewDialog */
public class C1854h extends Dialog {

    /* renamed from: a */
    private int f6202a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f6203b;

    /* renamed from: c */
    private C1853g f6204c;

    /* renamed from: d */
    private C1859m f6205d;

    /* renamed from: e */
    private View f6206e;

    public C1854h(Context context, C1859m mVar) {
        super(context);
        this.f6203b = context;
        this.f6205d = mVar;
        requestWindowFeature(1);
    }

    /* renamed from: a */
    public void mo6941a(C1853g gVar) {
        Drawable.ConstantState constantState;
        this.f6206e = ((LayoutInflater) this.f6203b.getSystemService("layout_inflater")).inflate(R.layout.skin_preview_popup, (ViewGroup) null);
        this.f6204c = gVar;
        this.f6202a = gVar.mo6909a();
        ((TTextView) this.f6206e.findViewById(R.id.preview_title)).setText(gVar.mo6936f());
        ImageView imageView = (ImageView) this.f6206e.findViewById(R.id.preview_image);
        if (imageView != null) {
            Drawable g = this.f6204c.mo6937g();
            if (!(g == null || (constantState = g.getConstantState()) == null)) {
                imageView.setBackgroundDrawable(constantState.newDrawable());
            }
            if (this.f6202a == 1) {
                imageView.setImageResource(R.drawable.skin_page_custom_mark_icon);
            }
            int i = (int) (((double) this.f6203b.getResources().getDisplayMetrics().widthPixels) * 0.7d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, (i * 4) / 5);
            int dimensionPixelSize = this.f6203b.getResources().getDimensionPixelSize(R.dimen.skin_page_preview_padding);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            imageView.setLayoutParams(layoutParams);
        }
        View findViewById = this.f6206e.findViewById(R.id.skin_preview_btn_frame);
        ImageButton imageButton = (ImageButton) this.f6206e.findViewById(R.id.preview_btn_edit);
        View findViewById2 = this.f6206e.findViewById(R.id.preview_btn_edit_divider);
        ImageButton imageButton2 = (ImageButton) this.f6206e.findViewById(R.id.preview_btn_delete);
        View findViewById3 = this.f6206e.findViewById(R.id.preview_btn_delete_divider);
        TButton tButton = (TButton) this.f6206e.findViewById(R.id.preview_btn_enable);
        imageButton.setOnClickListener(new C1855i(this));
        imageButton2.setOnClickListener(new C1856j(this));
        ((ImageButton) this.f6206e.findViewById(R.id.preview_btn_share)).setOnClickListener(new C1857k(this));
        if (this.f6204c.mo6914a(Settings.getInstance().getStringSetting(80))) {
            tButton.setVisibility(8);
        } else {
            tButton.setVisibility(0);
        }
        tButton.setText(C1974m.m9063a(this.f6203b, (int) R.string.radio_btn_unselected));
        tButton.setOnClickListener(new C1858l(this));
        switch (this.f6202a) {
            case 0:
                findViewById.setVisibility(8);
                break;
            case 1:
                findViewById.setVisibility(0);
                imageButton.setVisibility(0);
                imageButton2.setVisibility(0);
                findViewById2.setVisibility(0);
                findViewById3.setVisibility(0);
                break;
            case 2:
                findViewById.setVisibility(0);
                imageButton.setVisibility(8);
                imageButton2.setVisibility(0);
                findViewById2.setVisibility(8);
                findViewById3.setVisibility(0);
                break;
        }
        setContentView(this.f6206e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8546a() {
        dismiss();
        switch (this.f6202a) {
            case 1:
                this.f6205d.mo6952b(((C1847b) this.f6204c).mo6915b());
                return;
            default:
                this.f6205d.mo6949a(this.f6204c.mo6935e());
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8548b() {
        dismiss();
        if (this.f6204c instanceof C1847b) {
            this.f6205d.mo6947a(((C1847b) this.f6204c).mo6915b());
            C1246d.m6010a(this.f6203b).mo4594a(C1246d.f3848cL, true, C1246d.f3842cF);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m8550c() {
        dismiss();
        if (this.f6204c instanceof C1847b) {
            this.f6205d.mo6954c(((C1847b) this.f6204c).mo6915b());
        } else {
            this.f6205d.mo6953b(this.f6204c.mo6935e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m8552d() {
        String str;
        Uri h = this.f6204c.mo6938h();
        String i = this.f6204c.mo6939i();
        String j = this.f6204c.mo6940j();
        if (h != null) {
            C1985g.m9134a(this.f6203b, (String) null, (String) null, j, h, i, (String) null);
        }
        String stringSetting = Settings.getInstance().getStringSetting(80);
        if (this.f6202a == 1) {
            if (this.f6204c.mo6914a(stringSetting)) {
                str = C1246d.f3857cU;
            } else {
                str = C1246d.f3859cW;
            }
        } else if (this.f6204c.mo6914a(stringSetting)) {
            str = C1246d.f3856cT;
        } else {
            str = C1246d.f3858cV;
        }
        C1246d.m6010a(this.f6203b).mo4591a(C1246d.f3846cJ, str, C1246d.f3842cF);
    }
}
