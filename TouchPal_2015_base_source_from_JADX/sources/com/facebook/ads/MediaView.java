package com.facebook.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.p077h.C3445l;
import com.facebook.ads.internal.view.C3485d;

public class MediaView extends RelativeLayout {

    /* renamed from: a */
    private final C3485d f14608a;

    /* renamed from: b */
    private boolean f14609b;

    public MediaView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14609b = false;
        this.f14608a = new C3485d(context);
        this.f14608a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.f14608a);
    }

    public void setNativeAd(C3509x xVar) {
        if (this.f14609b) {
            this.f14608a.mo10818a((Bitmap) null, (Bitmap) null);
            this.f14609b = false;
        }
        if (xVar != null && xVar.mo10867e() != null) {
            this.f14609b = true;
            new C3445l(this.f14608a).execute(new String[]{xVar.mo10867e().mo10878a()});
        }
    }
}
