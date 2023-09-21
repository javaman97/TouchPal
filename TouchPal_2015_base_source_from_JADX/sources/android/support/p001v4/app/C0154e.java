package android.support.p001v4.app;

import android.app.Activity;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.e */
/* compiled from: ActivityCompatHoneycomb */
class C0154e {
    C0154e() {
    }

    /* renamed from: a */
    static void m595a(Activity activity) {
        activity.invalidateOptionsMenu();
    }

    /* renamed from: a */
    static void m596a(Activity activity, String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        activity.dump(str, fileDescriptor, printWriter, strArr);
    }
}
