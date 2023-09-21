package android.support.p001v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.p001v4.content.C0203i;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.iflytek.speech.VoiceWakeuperAidl;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.aj */
/* compiled from: ShareCompat */
public class C0132aj {

    /* renamed from: a */
    public static final String f354a = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b */
    public static final String f355b = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C0135c f356c;

    /* renamed from: android.support.v4.app.aj$c */
    /* compiled from: ShareCompat */
    interface C0135c {
        /* renamed from: a */
        String mo443a(CharSequence charSequence);

        /* renamed from: a */
        void mo444a(MenuItem menuItem, C0133a aVar);
    }

    /* renamed from: android.support.v4.app.aj$d */
    /* compiled from: ShareCompat */
    static class C0136d implements C0135c {
        C0136d() {
        }

        /* renamed from: a */
        public void mo444a(MenuItem menuItem, C0133a aVar) {
            menuItem.setIntent(aVar.mo415c());
        }

        /* renamed from: a */
        public String mo443a(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            m554a(sb, charSequence, 0, charSequence.length());
            return sb.toString();
        }

        /* renamed from: a */
        private static void m554a(StringBuilder sb, CharSequence charSequence, int i, int i2) {
            int i3 = i;
            while (i3 < i2) {
                char charAt = charSequence.charAt(i3);
                if (charAt == '<') {
                    sb.append("&lt;");
                } else if (charAt == '>') {
                    sb.append("&gt;");
                } else if (charAt == '&') {
                    sb.append("&amp;");
                } else if (charAt > '~' || charAt < ' ') {
                    sb.append("&#" + charAt + VoiceWakeuperAidl.PARAMS_SEPARATE);
                } else if (charAt == ' ') {
                    while (i3 + 1 < i2 && charSequence.charAt(i3 + 1) == ' ') {
                        sb.append("&nbsp;");
                        i3++;
                    }
                    sb.append(' ');
                } else {
                    sb.append(charAt);
                }
                i3++;
            }
        }
    }

    /* renamed from: android.support.v4.app.aj$e */
    /* compiled from: ShareCompat */
    static class C0137e extends C0136d {
        C0137e() {
        }

        /* renamed from: a */
        public void mo444a(MenuItem menuItem, C0133a aVar) {
            C0139ak.m561a(menuItem, aVar.mo410b(), aVar.mo404a());
            if (mo445a(menuItem)) {
                menuItem.setIntent(aVar.mo415c());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo445a(MenuItem menuItem) {
            return !menuItem.hasSubMenu();
        }
    }

    /* renamed from: android.support.v4.app.aj$f */
    /* compiled from: ShareCompat */
    static class C0138f extends C0137e {
        C0138f() {
        }

        /* renamed from: a */
        public String mo443a(CharSequence charSequence) {
            return C0140al.m562a(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo445a(MenuItem menuItem) {
            return false;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f356c = new C0138f();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f356c = new C0137e();
        } else {
            f356c = new C0136d();
        }
    }

    /* renamed from: a */
    public static String m505a(Activity activity) {
        String callingPackage = activity.getCallingPackage();
        if (callingPackage == null) {
            return activity.getIntent().getStringExtra(f354a);
        }
        return callingPackage;
    }

    /* renamed from: b */
    public static ComponentName m508b(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return (ComponentName) activity.getIntent().getParcelableExtra(f355b);
        }
        return callingActivity;
    }

    /* renamed from: a */
    public static void m507a(MenuItem menuItem, C0133a aVar) {
        f356c.mo444a(menuItem, aVar);
    }

    /* renamed from: a */
    public static void m506a(Menu menu, int i, C0133a aVar) {
        MenuItem findItem = menu.findItem(i);
        if (findItem == null) {
            throw new IllegalArgumentException("Could not find menu item with id " + i + " in the supplied menu");
        }
        m507a(findItem, aVar);
    }

    /* renamed from: android.support.v4.app.aj$a */
    /* compiled from: ShareCompat */
    public static class C0133a {

        /* renamed from: a */
        private Activity f357a;

        /* renamed from: b */
        private Intent f358b = new Intent().setAction("android.intent.action.SEND");

        /* renamed from: c */
        private CharSequence f359c;

        /* renamed from: d */
        private ArrayList<String> f360d;

        /* renamed from: e */
        private ArrayList<String> f361e;

        /* renamed from: f */
        private ArrayList<String> f362f;

        /* renamed from: g */
        private ArrayList<Uri> f363g;

        /* renamed from: a */
        public static C0133a m509a(Activity activity) {
            return new C0133a(activity);
        }

        private C0133a(Activity activity) {
            this.f357a = activity;
            this.f358b.putExtra(C0132aj.f354a, activity.getPackageName());
            this.f358b.putExtra(C0132aj.f355b, activity.getComponentName());
            this.f358b.addFlags(524288);
        }

        /* renamed from: a */
        public Intent mo404a() {
            if (this.f360d != null) {
                m510a("android.intent.extra.EMAIL", this.f360d);
                this.f360d = null;
            }
            if (this.f361e != null) {
                m510a("android.intent.extra.CC", this.f361e);
                this.f361e = null;
            }
            if (this.f362f != null) {
                m510a("android.intent.extra.BCC", this.f362f);
                this.f362f = null;
            }
            boolean z = this.f363g != null && this.f363g.size() > 1;
            boolean equals = this.f358b.getAction().equals("android.intent.action.SEND_MULTIPLE");
            if (!z && equals) {
                this.f358b.setAction("android.intent.action.SEND");
                if (this.f363g == null || this.f363g.isEmpty()) {
                    this.f358b.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f358b.putExtra("android.intent.extra.STREAM", this.f363g.get(0));
                }
                this.f363g = null;
            }
            if (z && !equals) {
                this.f358b.setAction("android.intent.action.SEND_MULTIPLE");
                if (this.f363g == null || this.f363g.isEmpty()) {
                    this.f358b.removeExtra("android.intent.extra.STREAM");
                } else {
                    this.f358b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f363g);
                }
            }
            return this.f358b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Activity mo410b() {
            return this.f357a;
        }

        /* renamed from: a */
        private void m510a(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f358b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[(arrayList.size() + length)];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f358b.putExtra(str, strArr);
        }

        /* renamed from: a */
        private void m511a(String str, String[] strArr) {
            Intent a = mo404a();
            String[] stringArrayExtra = a.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[(strArr.length + length)];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            a.putExtra(str, strArr2);
        }

        /* renamed from: c */
        public Intent mo415c() {
            return Intent.createChooser(mo404a(), this.f359c);
        }

        /* renamed from: d */
        public void mo420d() {
            this.f357a.startActivity(mo415c());
        }

        /* renamed from: a */
        public C0133a mo407a(CharSequence charSequence) {
            this.f359c = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0133a mo405a(int i) {
            return mo407a(this.f357a.getText(i));
        }

        /* renamed from: a */
        public C0133a mo408a(String str) {
            this.f358b.setType(str);
            return this;
        }

        /* renamed from: b */
        public C0133a mo412b(CharSequence charSequence) {
            this.f358b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        /* renamed from: b */
        public C0133a mo413b(String str) {
            this.f358b.putExtra(C0203i.f527e, str);
            if (!this.f358b.hasExtra("android.intent.extra.TEXT")) {
                mo412b((CharSequence) Html.fromHtml(str));
            }
            return this;
        }

        /* renamed from: a */
        public C0133a mo406a(Uri uri) {
            if (!this.f358b.getAction().equals("android.intent.action.SEND")) {
                this.f358b.setAction("android.intent.action.SEND");
            }
            this.f363g = null;
            this.f358b.putExtra("android.intent.extra.STREAM", uri);
            return this;
        }

        /* renamed from: b */
        public C0133a mo411b(Uri uri) {
            Uri uri2 = (Uri) this.f358b.getParcelableExtra("android.intent.extra.STREAM");
            if (uri2 == null) {
                return mo406a(uri);
            }
            if (this.f363g == null) {
                this.f363g = new ArrayList<>();
            }
            if (uri2 != null) {
                this.f358b.removeExtra("android.intent.extra.STREAM");
                this.f363g.add(uri2);
            }
            this.f363g.add(uri);
            return this;
        }

        /* renamed from: a */
        public C0133a mo409a(String[] strArr) {
            if (this.f360d != null) {
                this.f360d = null;
            }
            this.f358b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        /* renamed from: c */
        public C0133a mo416c(String str) {
            if (this.f360d == null) {
                this.f360d = new ArrayList<>();
            }
            this.f360d.add(str);
            return this;
        }

        /* renamed from: b */
        public C0133a mo414b(String[] strArr) {
            m511a("android.intent.extra.EMAIL", strArr);
            return this;
        }

        /* renamed from: c */
        public C0133a mo417c(String[] strArr) {
            this.f358b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        /* renamed from: d */
        public C0133a mo418d(String str) {
            if (this.f361e == null) {
                this.f361e = new ArrayList<>();
            }
            this.f361e.add(str);
            return this;
        }

        /* renamed from: d */
        public C0133a mo419d(String[] strArr) {
            m511a("android.intent.extra.CC", strArr);
            return this;
        }

        /* renamed from: e */
        public C0133a mo422e(String[] strArr) {
            this.f358b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        /* renamed from: e */
        public C0133a mo421e(String str) {
            if (this.f362f == null) {
                this.f362f = new ArrayList<>();
            }
            this.f362f.add(str);
            return this;
        }

        /* renamed from: f */
        public C0133a mo424f(String[] strArr) {
            m511a("android.intent.extra.BCC", strArr);
            return this;
        }

        /* renamed from: f */
        public C0133a mo423f(String str) {
            this.f358b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }
    }

    /* renamed from: android.support.v4.app.aj$b */
    /* compiled from: ShareCompat */
    public static class C0134b {

        /* renamed from: a */
        private static final String f364a = "IntentReader";

        /* renamed from: b */
        private Activity f365b;

        /* renamed from: c */
        private Intent f366c;

        /* renamed from: d */
        private String f367d;

        /* renamed from: e */
        private ComponentName f368e;

        /* renamed from: f */
        private ArrayList<Uri> f369f;

        /* renamed from: a */
        public static C0134b m533a(Activity activity) {
            return new C0134b(activity);
        }

        private C0134b(Activity activity) {
            this.f365b = activity;
            this.f366c = activity.getIntent();
            this.f367d = C0132aj.m505a(activity);
            this.f368e = C0132aj.m508b(activity);
        }

        /* renamed from: a */
        public boolean mo426a() {
            String action = this.f366c.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        /* renamed from: b */
        public boolean mo427b() {
            return "android.intent.action.SEND".equals(this.f366c.getAction());
        }

        /* renamed from: c */
        public boolean mo428c() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f366c.getAction());
        }

        /* renamed from: d */
        public String mo429d() {
            return this.f366c.getType();
        }

        /* renamed from: e */
        public CharSequence mo430e() {
            return this.f366c.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        /* renamed from: f */
        public String mo431f() {
            String stringExtra = this.f366c.getStringExtra(C0203i.f527e);
            if (stringExtra == null) {
                CharSequence e = mo430e();
                if (e instanceof Spanned) {
                    return Html.toHtml((Spanned) e);
                }
                if (e != null) {
                    return C0132aj.f356c.mo443a(e);
                }
            }
            return stringExtra;
        }

        /* renamed from: g */
        public Uri mo432g() {
            return (Uri) this.f366c.getParcelableExtra("android.intent.extra.STREAM");
        }

        /* renamed from: a */
        public Uri mo425a(int i) {
            if (this.f369f == null && mo428c()) {
                this.f369f = this.f366c.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            if (this.f369f != null) {
                return this.f369f.get(i);
            }
            if (i == 0) {
                return (Uri) this.f366c.getParcelableExtra("android.intent.extra.STREAM");
            }
            throw new IndexOutOfBoundsException("Stream items available: " + mo433h() + " index requested: " + i);
        }

        /* renamed from: h */
        public int mo433h() {
            if (this.f369f == null && mo428c()) {
                this.f369f = this.f366c.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            if (this.f369f != null) {
                return this.f369f.size();
            }
            return this.f366c.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        /* renamed from: i */
        public String[] mo434i() {
            return this.f366c.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        /* renamed from: j */
        public String[] mo435j() {
            return this.f366c.getStringArrayExtra("android.intent.extra.CC");
        }

        /* renamed from: k */
        public String[] mo436k() {
            return this.f366c.getStringArrayExtra("android.intent.extra.BCC");
        }

        /* renamed from: l */
        public String mo437l() {
            return this.f366c.getStringExtra("android.intent.extra.SUBJECT");
        }

        /* renamed from: m */
        public String mo438m() {
            return this.f367d;
        }

        /* renamed from: n */
        public ComponentName mo439n() {
            return this.f368e;
        }

        /* renamed from: o */
        public Drawable mo440o() {
            if (this.f368e == null) {
                return null;
            }
            try {
                return this.f365b.getPackageManager().getActivityIcon(this.f368e);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f364a, "Could not retrieve icon for calling activity", e);
                return null;
            }
        }

        /* renamed from: p */
        public Drawable mo441p() {
            if (this.f367d == null) {
                return null;
            }
            try {
                return this.f365b.getPackageManager().getApplicationIcon(this.f367d);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f364a, "Could not retrieve icon for calling application", e);
                return null;
            }
        }

        /* renamed from: q */
        public CharSequence mo442q() {
            if (this.f367d == null) {
                return null;
            }
            PackageManager packageManager = this.f365b.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f367d, 0));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(f364a, "Could not retrieve label for calling application", e);
                return null;
            }
        }
    }
}
