package android.support.p001v4.app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.app.C0127ag;
import android.util.Log;

/* renamed from: android.support.v4.app.ad */
/* compiled from: RemoteInput */
public class C0119ad extends C0127ag.C0128a {

    /* renamed from: a */
    public static final String f331a = "android.remoteinput.results";

    /* renamed from: b */
    public static final String f332b = "android.remoteinput.resultsData";

    /* renamed from: c */
    public static final C0127ag.C0128a.C0129a f333c = new C0125ae();

    /* renamed from: d */
    private static final String f334d = "RemoteInput";

    /* renamed from: j */
    private static final C0121b f335j;

    /* renamed from: e */
    private final String f336e;

    /* renamed from: f */
    private final CharSequence f337f;

    /* renamed from: g */
    private final CharSequence[] f338g;

    /* renamed from: h */
    private final boolean f339h;

    /* renamed from: i */
    private final Bundle f340i;

    /* renamed from: android.support.v4.app.ad$b */
    /* compiled from: RemoteInput */
    interface C0121b {
        /* renamed from: a */
        Bundle mo398a(Intent intent);

        /* renamed from: a */
        void mo399a(C0119ad[] adVarArr, Intent intent, Bundle bundle);
    }

    C0119ad(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle) {
        this.f336e = str;
        this.f337f = charSequence;
        this.f338g = charSequenceArr;
        this.f339h = z;
        this.f340i = bundle;
    }

    /* renamed from: a */
    public String mo387a() {
        return this.f336e;
    }

    /* renamed from: b */
    public CharSequence mo388b() {
        return this.f337f;
    }

    /* renamed from: c */
    public CharSequence[] mo389c() {
        return this.f338g;
    }

    /* renamed from: d */
    public boolean mo390d() {
        return this.f339h;
    }

    /* renamed from: e */
    public Bundle mo391e() {
        return this.f340i;
    }

    /* renamed from: android.support.v4.app.ad$a */
    /* compiled from: RemoteInput */
    public static final class C0120a {

        /* renamed from: a */
        private final String f341a;

        /* renamed from: b */
        private CharSequence f342b;

        /* renamed from: c */
        private CharSequence[] f343c;

        /* renamed from: d */
        private boolean f344d = true;

        /* renamed from: e */
        private Bundle f345e = new Bundle();

        public C0120a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f341a = str;
        }

        /* renamed from: a */
        public C0120a mo394a(CharSequence charSequence) {
            this.f342b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0120a mo396a(CharSequence[] charSequenceArr) {
            this.f343c = charSequenceArr;
            return this;
        }

        /* renamed from: a */
        public C0120a mo395a(boolean z) {
            this.f344d = z;
            return this;
        }

        /* renamed from: a */
        public C0120a mo393a(Bundle bundle) {
            if (bundle != null) {
                this.f345e.putAll(bundle);
            }
            return this;
        }

        /* renamed from: a */
        public Bundle mo392a() {
            return this.f345e;
        }

        /* renamed from: b */
        public C0119ad mo397b() {
            return new C0119ad(this.f341a, this.f342b, this.f343c, this.f344d, this.f345e);
        }
    }

    /* renamed from: a */
    public static Bundle m462a(Intent intent) {
        return f335j.mo398a(intent);
    }

    /* renamed from: a */
    public static void m463a(C0119ad[] adVarArr, Intent intent, Bundle bundle) {
        f335j.mo399a(adVarArr, intent, bundle);
    }

    /* renamed from: android.support.v4.app.ad$d */
    /* compiled from: RemoteInput */
    static class C0123d implements C0121b {
        C0123d() {
        }

        /* renamed from: a */
        public Bundle mo398a(Intent intent) {
            Log.w(C0119ad.f334d, "RemoteInput is only supported from API Level 16");
            return null;
        }

        /* renamed from: a */
        public void mo399a(C0119ad[] adVarArr, Intent intent, Bundle bundle) {
            Log.w(C0119ad.f334d, "RemoteInput is only supported from API Level 16");
        }
    }

    /* renamed from: android.support.v4.app.ad$e */
    /* compiled from: RemoteInput */
    static class C0124e implements C0121b {
        C0124e() {
        }

        /* renamed from: a */
        public Bundle mo398a(Intent intent) {
            return C0130ah.m498a(intent);
        }

        /* renamed from: a */
        public void mo399a(C0119ad[] adVarArr, Intent intent, Bundle bundle) {
            C0130ah.m501a(adVarArr, intent, bundle);
        }
    }

    /* renamed from: android.support.v4.app.ad$c */
    /* compiled from: RemoteInput */
    static class C0122c implements C0121b {
        C0122c() {
        }

        /* renamed from: a */
        public Bundle mo398a(Intent intent) {
            return C0126af.m487a(intent);
        }

        /* renamed from: a */
        public void mo399a(C0119ad[] adVarArr, Intent intent, Bundle bundle) {
            C0126af.m488a(adVarArr, intent, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 20) {
            f335j = new C0122c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f335j = new C0124e();
        } else {
            f335j = new C0123d();
        }
    }
}
