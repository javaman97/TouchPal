package android.support.p001v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v4.widget.ContentLoadingProgressBar */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a */
    private static final int f1166a = 500;

    /* renamed from: b */
    private static final int f1167b = 500;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f1168c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f1169d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f1170e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f1171f;

    /* renamed from: g */
    private final Runnable f1172g;

    /* renamed from: h */
    private final Runnable f1173h;

    public ContentLoadingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1168c = -1;
        this.f1169d = false;
        this.f1170e = false;
        this.f1171f = false;
        this.f1172g = new C0553c(this);
        this.f1173h = new C0554d(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2924c();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2924c();
    }

    /* renamed from: c */
    private void m2924c() {
        removeCallbacks(this.f1172g);
        removeCallbacks(this.f1173h);
    }

    /* renamed from: a */
    public void mo1705a() {
        this.f1171f = true;
        removeCallbacks(this.f1173h);
        long currentTimeMillis = System.currentTimeMillis() - this.f1168c;
        if (currentTimeMillis >= 500 || this.f1168c == -1) {
            setVisibility(8);
        } else if (!this.f1169d) {
            postDelayed(this.f1172g, 500 - currentTimeMillis);
            this.f1169d = true;
        }
    }

    /* renamed from: b */
    public void mo1706b() {
        this.f1168c = -1;
        this.f1171f = false;
        removeCallbacks(this.f1172g);
        if (!this.f1170e) {
            postDelayed(this.f1173h, 500);
            this.f1170e = true;
        }
    }
}
