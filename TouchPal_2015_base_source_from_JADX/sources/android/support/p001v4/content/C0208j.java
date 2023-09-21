package android.support.p001v4.content;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: android.support.v4.content.j */
/* compiled from: IntentCompatHoneycomb */
class C0208j {
    C0208j() {
    }

    /* renamed from: a */
    public static Intent m854a(ComponentName componentName) {
        return Intent.makeMainActivity(componentName);
    }

    /* renamed from: b */
    public static Intent m855b(ComponentName componentName) {
        return Intent.makeRestartActivityTask(componentName);
    }
}
