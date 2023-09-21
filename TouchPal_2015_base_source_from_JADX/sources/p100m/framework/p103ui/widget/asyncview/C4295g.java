package p100m.framework.p103ui.widget.asyncview;

import android.graphics.Bitmap;

/* renamed from: m.framework.ui.widget.asyncview.g */
/* compiled from: SimpleOnImageGotListener */
public class C4295g implements C4294f {

    /* renamed from: a */
    public static final C4295g f17480a = new C4295g();

    private C4295g() {
    }

    /* renamed from: a */
    public Bitmap mo15987a(C4285a aVar, Bitmap bitmap, String str) {
        if (str == null || str.trim().length() <= 0 || !str.equals(aVar.getUrl())) {
            return null;
        }
        return bitmap;
    }
}
