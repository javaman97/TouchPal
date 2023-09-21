package android.support.p001v4.content;

import android.content.Context;
import android.content.Intent;
import java.io.File;

/* renamed from: android.support.v4.content.d */
/* compiled from: ContextCompatHoneycomb */
class C0196d {
    C0196d() {
    }

    /* renamed from: a */
    static void m805a(Context context, Intent[] intentArr) {
        context.startActivities(intentArr);
    }

    /* renamed from: a */
    public static File m804a(Context context) {
        return context.getObbDir();
    }
}
