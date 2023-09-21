package p018cn.sharesdk.framework.authorize;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: cn.sharesdk.framework.authorize.ResizeLayout */
public class ResizeLayout extends LinearLayout {

    /* renamed from: a */
    private OnResizeListener f1485a;

    /* renamed from: cn.sharesdk.framework.authorize.ResizeLayout$OnResizeListener */
    public interface OnResizeListener {
        void OnResize(int i, int i2, int i3, int i4);
    }

    public ResizeLayout(Context context) {
        super(context);
    }

    public ResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo2251a(OnResizeListener onResizeListener) {
        this.f1485a = onResizeListener;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f1485a != null) {
            this.f1485a.OnResize(i, i2, i3, i4);
        }
    }
}
