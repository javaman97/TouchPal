package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.p001v4.p009e.p010a.C0230a;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

public class PaoPaoNewsTab extends RelativeLayout {

    /* renamed from: a */
    private Context f6519a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public float f6520b;

    /* renamed from: c */
    private C1927a f6521c;

    /* renamed from: d */
    private ImageView f6522d;

    public PaoPaoNewsTab(Context context) {
        super(context);
        m8816a(context);
    }

    public PaoPaoNewsTab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8816a(context);
    }

    /* renamed from: a */
    private void m8816a(Context context) {
        this.f6519a = context;
        this.f6520b = context.getResources().getDisplayMetrics().density;
        this.f6522d = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f6522d, layoutParams);
        this.f6521c = new C1927a(context);
        addView(this.f6521c, layoutParams);
    }

    /* renamed from: a */
    public void mo7088a(int i, Drawable drawable) {
        if (this.f6521c != null) {
            if (i > 0) {
                this.f6521c.setVisibility(0);
                this.f6521c.mo7089a(i, drawable);
            } else {
                this.f6521c.setVisibility(8);
            }
        }
        if (this.f6522d != null) {
            this.f6522d.setImageDrawable(drawable);
        }
    }

    /* renamed from: com.cootek.smartinput5.func.paopaopanel.PaoPaoNewsTab$a */
    private class C1927a extends ImageView {

        /* renamed from: b */
        private Bitmap f6524b = null;

        public C1927a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public void mo7089a(int i, Drawable drawable) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            this.f6524b = (Bitmap) new WeakReference(Bitmap.createBitmap(intrinsicWidth, drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)).get();
            float a = 7.0f * PaoPaoNewsTab.this.f6520b;
            float f = ((float) intrinsicWidth) - a;
            Canvas canvas = new Canvas(this.f6524b);
            Paint paint = new Paint();
            paint.setColor(C0230a.f588c);
            paint.setAntiAlias(true);
            canvas.drawCircle(f, a, a, paint);
            Paint paint2 = new Paint(1);
            paint2.setColor(-1);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setTextSize(2.0f + a);
            Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
            canvas.drawText(String.valueOf(i), f, a + ((fontMetrics.bottom - fontMetrics.top) / 4.0f), paint2);
            setImageBitmap(this.f6524b);
        }
    }
}
