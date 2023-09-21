package android.support.p001v4.p007d.p008a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.cootek.presentation.service.config.PresentConfigXmlTag;

/* renamed from: android.support.v4.d.a.b */
/* compiled from: DisplayManagerJellybeanMr1 */
final class C0229b {
    C0229b() {
    }

    /* renamed from: a */
    public static Object m924a(Context context) {
        return context.getSystemService(PresentConfigXmlTag.TOAST_ATTR_DISPLAY_TITLE);
    }

    /* renamed from: a */
    public static Display m923a(Object obj, int i) {
        return ((DisplayManager) obj).getDisplay(i);
    }

    /* renamed from: a */
    public static Display[] m925a(Object obj) {
        return ((DisplayManager) obj).getDisplays();
    }

    /* renamed from: a */
    public static Display[] m926a(Object obj, String str) {
        return ((DisplayManager) obj).getDisplays(str);
    }
}
