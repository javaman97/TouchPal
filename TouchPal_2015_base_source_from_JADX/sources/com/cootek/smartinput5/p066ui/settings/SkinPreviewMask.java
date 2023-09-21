package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.SkinPreviewMask */
public class SkinPreviewMask extends View {

    /* renamed from: a */
    private C2976a f13725a;

    /* renamed from: com.cootek.smartinput5.ui.settings.SkinPreviewMask$a */
    public interface C2976a {
        /* renamed from: g */
        void mo9977g();

        /* renamed from: h */
        void mo9978h();

        /* renamed from: i */
        void mo9979i();
    }

    public SkinPreviewMask(Context context) {
        super(context);
    }

    public SkinPreviewMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SkinPreviewMask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (this.f13725a == null) {
                    return true;
                }
                this.f13725a.mo9978h();
                return true;
            default:
                return true;
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.f13725a != null) {
            if (i4 != 0 && i4 < i2) {
                this.f13725a.mo9977g();
            } else if (i4 != 0 && i4 > i2) {
                this.f13725a.mo9979i();
            }
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setPreviewStateListener(C2976a aVar) {
        this.f13725a = aVar;
    }
}
