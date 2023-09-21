package com.cootek.smartinput5.func.smileypanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.smileypanel.SmileyScrollView;
import com.emoji.keyboard.touchpal.R;

public class SmileyScrollFrame extends RelativeLayout implements SmileyScrollView.C2001b {

    /* renamed from: a */
    private static final int f6907a = 0;

    /* renamed from: b */
    private static final int f6908b = 255;

    /* renamed from: c */
    private Context f6909c;

    /* renamed from: d */
    private SmileyScrollView f6910d;

    /* renamed from: e */
    private View f6911e;

    /* renamed from: f */
    private SmileyTopShadowView f6912f;

    /* renamed from: g */
    private int f6913g = 0;

    /* renamed from: h */
    private int f6914h = 0;

    public SmileyScrollFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9234a(context);
    }

    public SmileyScrollFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9234a(context);
    }

    public SmileyScrollFrame(Context context) {
        super(context);
        m9234a(context);
    }

    /* renamed from: a */
    private void m9234a(Context context) {
        this.f6909c = context;
    }

    /* renamed from: a */
    public void mo7326a() {
        this.f6910d = (SmileyScrollView) findViewById(R.id.scroll_view);
        if (this.f6910d != null) {
            this.f6910d.setOnScrollPositionChangedListener(this);
        }
        this.f6912f = (SmileyTopShadowView) findViewById(R.id.top_shadow_content);
        if (this.f6912f != null) {
            this.f6912f.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.smiley_scroll_top_shadow));
            this.f6912f.setAlpha(0);
        }
        this.f6911e = findViewById(R.id.top_shadow);
    }

    private int getTopShadowHeight() {
        if (this.f6913g == 0 && this.f6911e != null) {
            this.f6913g = this.f6911e.getHeight();
        }
        return this.f6913g;
    }

    private int getTopLimit() {
        if ((this.f6914h == 0 || this.f6913g == 0) && this.f6910d != null) {
            this.f6914h = this.f6910d.getScrollHeight() - getTopShadowHeight();
        }
        return this.f6914h;
    }

    /* renamed from: a */
    public void mo7328a(int i, boolean z) {
        if (this.f6910d != null) {
            this.f6910d.mo7332a(i, z);
        }
    }

    public void setOnScrollFinishedListener(SmileyScrollView.C2000a aVar) {
        if (this.f6910d != null) {
            this.f6910d.setOnScrollFinishedListener(aVar);
        }
    }

    public int getScrollHeight() {
        if (this.f6910d != null) {
            return this.f6910d.getScrollHeight();
        }
        return 0;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f6910d != null) {
            return this.f6910d.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: b */
    private void m9235b(int i) {
        int i2;
        if (this.f6911e != null) {
            if (i > getTopLimit()) {
                i2 = i - getTopLimit();
            } else {
                i2 = 0;
            }
            this.f6911e.scrollTo(0, i2);
        }
    }

    /* renamed from: c */
    private void m9236c(int i) {
        if (this.f6912f != null) {
            this.f6912f.setAlpha((int) (((((float) i) / ((float) this.f6910d.getScrollHeight())) * 255.0f) + 0.0f));
        }
    }

    /* renamed from: d */
    private void m9237d(int i) {
        m9235b(i);
        m9236c(i);
    }

    /* renamed from: a */
    public void mo7327a(int i) {
        m9237d(i);
    }
}
