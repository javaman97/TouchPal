package android.support.p001v4.app;

import android.support.p001v4.app.C0173s;
import android.support.p001v4.p016k.C0304g;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.i */
/* compiled from: BackStackRecord */
final class C0159i extends C0036E implements C0173s.C0174a, Runnable {

    /* renamed from: a */
    static final String f384a = "FragmentManager";

    /* renamed from: c */
    static final int f385c = 0;

    /* renamed from: d */
    static final int f386d = 1;

    /* renamed from: e */
    static final int f387e = 2;

    /* renamed from: f */
    static final int f388f = 3;

    /* renamed from: g */
    static final int f389g = 4;

    /* renamed from: h */
    static final int f390h = 5;

    /* renamed from: i */
    static final int f391i = 6;

    /* renamed from: j */
    static final int f392j = 7;

    /* renamed from: A */
    int f393A;

    /* renamed from: B */
    CharSequence f394B;

    /* renamed from: b */
    final C0176t f395b;

    /* renamed from: k */
    C0160a f396k;

    /* renamed from: l */
    C0160a f397l;

    /* renamed from: m */
    int f398m;

    /* renamed from: n */
    int f399n;

    /* renamed from: o */
    int f400o;

    /* renamed from: p */
    int f401p;

    /* renamed from: q */
    int f402q;

    /* renamed from: r */
    int f403r;

    /* renamed from: s */
    int f404s;

    /* renamed from: t */
    boolean f405t;

    /* renamed from: u */
    boolean f406u = true;

    /* renamed from: v */
    String f407v;

    /* renamed from: w */
    boolean f408w;

    /* renamed from: x */
    int f409x = -1;

    /* renamed from: y */
    int f410y;

    /* renamed from: z */
    CharSequence f411z;

    /* renamed from: android.support.v4.app.i$a */
    /* compiled from: BackStackRecord */
    static final class C0160a {

        /* renamed from: a */
        C0160a f412a;

        /* renamed from: b */
        C0160a f413b;

        /* renamed from: c */
        int f414c;

        /* renamed from: d */
        Fragment f415d;

        /* renamed from: e */
        int f416e;

        /* renamed from: f */
        int f417f;

        /* renamed from: g */
        int f418g;

        /* renamed from: h */
        int f419h;

        /* renamed from: i */
        ArrayList<Fragment> f420i;

        C0160a() {
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f409x >= 0) {
            sb.append(" #");
            sb.append(this.f409x);
        }
        if (this.f407v != null) {
            sb.append(" ");
            sb.append(this.f407v);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo469a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo470a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo470a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f407v);
            printWriter.print(" mIndex=");
            printWriter.print(this.f409x);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f408w);
            if (this.f403r != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f403r));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f404s));
            }
            if (!(this.f399n == 0 && this.f400o == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f399n));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f400o));
            }
            if (!(this.f401p == 0 && this.f402q == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f401p));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f402q));
            }
            if (!(this.f410y == 0 && this.f411z == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f410y));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f411z);
            }
            if (!(this.f393A == 0 && this.f394B == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f393A));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f394B);
            }
        }
        if (this.f396k != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int i = 0;
            C0160a aVar = this.f396k;
            while (aVar != null) {
                switch (aVar.f414c) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f414c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f415d);
                if (z) {
                    if (!(aVar.f416e == 0 && aVar.f417f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f416e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f417f));
                    }
                    if (!(aVar.f418g == 0 && aVar.f419h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f418g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f419h));
                    }
                }
                if (aVar.f420i != null && aVar.f420i.size() > 0) {
                    for (int i2 = 0; i2 < aVar.f420i.size(); i2++) {
                        printWriter.print(str3);
                        if (aVar.f420i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(aVar.f420i.get(i2));
                    }
                }
                aVar = aVar.f412a;
                i++;
            }
        }
    }

    public C0159i(C0176t tVar) {
        this.f395b = tVar;
    }

    /* renamed from: a */
    public int mo466a() {
        return this.f409x;
    }

    /* renamed from: b */
    public int mo471b() {
        return this.f410y;
    }

    /* renamed from: c */
    public int mo473c() {
        return this.f393A;
    }

    /* renamed from: d */
    public CharSequence mo474d() {
        if (this.f410y != 0) {
            return this.f395b.f469u.getText(this.f410y);
        }
        return this.f411z;
    }

    /* renamed from: e */
    public CharSequence mo475e() {
        if (this.f393A != 0) {
            return this.f395b.f469u.getText(this.f393A);
        }
        return this.f394B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo468a(C0160a aVar) {
        if (this.f396k == null) {
            this.f397l = aVar;
            this.f396k = aVar;
        } else {
            aVar.f413b = this.f397l;
            this.f397l.f412a = aVar;
            this.f397l = aVar;
        }
        aVar.f416e = this.f399n;
        aVar.f417f = this.f400o;
        aVar.f418g = this.f401p;
        aVar.f419h = this.f402q;
        this.f398m++;
    }

    /* renamed from: a */
    public C0036E mo38a(Fragment fragment, String str) {
        m612a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0036E mo35a(int i, Fragment fragment) {
        m612a(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: a */
    public C0036E mo36a(int i, Fragment fragment, String str) {
        m612a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    private void m612a(int i, Fragment fragment, String str, int i2) {
        fragment.mFragmentManager = this.f395b;
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
            }
        }
        C0160a aVar = new C0160a();
        aVar.f414c = i2;
        aVar.f415d = fragment;
        mo468a(aVar);
    }

    /* renamed from: b */
    public C0036E mo42b(int i, Fragment fragment) {
        return mo43b(i, fragment, (String) null);
    }

    /* renamed from: b */
    public C0036E mo43b(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m612a(i, fragment, str, 2);
        return this;
    }

    /* renamed from: a */
    public C0036E mo37a(Fragment fragment) {
        C0160a aVar = new C0160a();
        aVar.f414c = 3;
        aVar.f415d = fragment;
        mo468a(aVar);
        return this;
    }

    /* renamed from: b */
    public C0036E mo44b(Fragment fragment) {
        C0160a aVar = new C0160a();
        aVar.f414c = 4;
        aVar.f415d = fragment;
        mo468a(aVar);
        return this;
    }

    /* renamed from: c */
    public C0036E mo47c(Fragment fragment) {
        C0160a aVar = new C0160a();
        aVar.f414c = 5;
        aVar.f415d = fragment;
        mo468a(aVar);
        return this;
    }

    /* renamed from: d */
    public C0036E mo49d(Fragment fragment) {
        C0160a aVar = new C0160a();
        aVar.f414c = 6;
        aVar.f415d = fragment;
        mo468a(aVar);
        return this;
    }

    /* renamed from: e */
    public C0036E mo50e(Fragment fragment) {
        C0160a aVar = new C0160a();
        aVar.f414c = 7;
        aVar.f415d = fragment;
        mo468a(aVar);
        return this;
    }

    /* renamed from: a */
    public C0036E mo33a(int i, int i2) {
        return mo34a(i, i2, 0, 0);
    }

    /* renamed from: a */
    public C0036E mo34a(int i, int i2, int i3, int i4) {
        this.f399n = i;
        this.f400o = i2;
        this.f401p = i3;
        this.f402q = i4;
        return this;
    }

    /* renamed from: a */
    public C0036E mo32a(int i) {
        this.f403r = i;
        return this;
    }

    /* renamed from: b */
    public C0036E mo41b(int i) {
        this.f404s = i;
        return this;
    }

    /* renamed from: a */
    public C0036E mo40a(String str) {
        if (!this.f406u) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f405t = true;
        this.f407v = str;
        return this;
    }

    /* renamed from: f */
    public boolean mo51f() {
        return this.f406u;
    }

    /* renamed from: g */
    public C0036E mo52g() {
        if (this.f405t) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f406u = false;
        return this;
    }

    /* renamed from: c */
    public C0036E mo46c(int i) {
        this.f410y = i;
        this.f411z = null;
        return this;
    }

    /* renamed from: a */
    public C0036E mo39a(CharSequence charSequence) {
        this.f410y = 0;
        this.f411z = charSequence;
        return this;
    }

    /* renamed from: d */
    public C0036E mo48d(int i) {
        this.f393A = i;
        this.f394B = null;
        return this;
    }

    /* renamed from: b */
    public C0036E mo45b(CharSequence charSequence) {
        this.f393A = 0;
        this.f394B = charSequence;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo476e(int i) {
        if (this.f405t) {
            if (C0176t.f445b) {
                Log.v(f384a, "Bump nesting in " + this + " by " + i);
            }
            for (C0160a aVar = this.f396k; aVar != null; aVar = aVar.f412a) {
                if (aVar.f415d != null) {
                    aVar.f415d.mBackStackNesting += i;
                    if (C0176t.f445b) {
                        Log.v(f384a, "Bump nesting of " + aVar.f415d + " to " + aVar.f415d.mBackStackNesting);
                    }
                }
                if (aVar.f420i != null) {
                    for (int size = aVar.f420i.size() - 1; size >= 0; size--) {
                        Fragment fragment = aVar.f420i.get(size);
                        fragment.mBackStackNesting += i;
                        if (C0176t.f445b) {
                            Log.v(f384a, "Bump nesting of " + fragment + " to " + fragment.mBackStackNesting);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public int mo53h() {
        return mo467a(false);
    }

    /* renamed from: i */
    public int mo54i() {
        return mo467a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo467a(boolean z) {
        if (this.f408w) {
            throw new IllegalStateException("commit already called");
        }
        if (C0176t.f445b) {
            Log.v(f384a, "Commit: " + this);
            mo469a("  ", (FileDescriptor) null, new PrintWriter(new C0304g(f384a)), (String[]) null);
        }
        this.f408w = true;
        if (this.f405t) {
            this.f409x = this.f395b.mo564a(this);
        } else {
            this.f409x = -1;
        }
        this.f395b.mo575a((Runnable) this, z);
        return this.f409x;
    }

    public void run() {
        Fragment fragment;
        if (C0176t.f445b) {
            Log.v(f384a, "Run: " + this);
        }
        if (!this.f405t || this.f409x >= 0) {
            mo476e(1);
            for (C0160a aVar = this.f396k; aVar != null; aVar = aVar.f412a) {
                switch (aVar.f414c) {
                    case 1:
                        Fragment fragment2 = aVar.f415d;
                        fragment2.mNextAnim = aVar.f416e;
                        this.f395b.mo573a(fragment2, false);
                        break;
                    case 2:
                        Fragment fragment3 = aVar.f415d;
                        if (this.f395b.f461m != null) {
                            fragment = fragment3;
                            for (int i = 0; i < this.f395b.f461m.size(); i++) {
                                Fragment fragment4 = this.f395b.f461m.get(i);
                                if (C0176t.f445b) {
                                    Log.v(f384a, "OP_REPLACE: adding=" + fragment + " old=" + fragment4);
                                }
                                if (fragment == null || fragment4.mContainerId == fragment.mContainerId) {
                                    if (fragment4 == fragment) {
                                        fragment = null;
                                        aVar.f415d = null;
                                    } else {
                                        if (aVar.f420i == null) {
                                            aVar.f420i = new ArrayList<>();
                                        }
                                        aVar.f420i.add(fragment4);
                                        fragment4.mNextAnim = aVar.f417f;
                                        if (this.f405t) {
                                            fragment4.mBackStackNesting++;
                                            if (C0176t.f445b) {
                                                Log.v(f384a, "Bump nesting of " + fragment4 + " to " + fragment4.mBackStackNesting);
                                            }
                                        }
                                        this.f395b.mo571a(fragment4, this.f403r, this.f404s);
                                    }
                                }
                            }
                        } else {
                            fragment = fragment3;
                        }
                        if (fragment == null) {
                            break;
                        } else {
                            fragment.mNextAnim = aVar.f416e;
                            this.f395b.mo573a(fragment, false);
                            break;
                        }
                    case 3:
                        Fragment fragment5 = aVar.f415d;
                        fragment5.mNextAnim = aVar.f417f;
                        this.f395b.mo571a(fragment5, this.f403r, this.f404s);
                        break;
                    case 4:
                        Fragment fragment6 = aVar.f415d;
                        fragment6.mNextAnim = aVar.f417f;
                        this.f395b.mo582b(fragment6, this.f403r, this.f404s);
                        break;
                    case 5:
                        Fragment fragment7 = aVar.f415d;
                        fragment7.mNextAnim = aVar.f416e;
                        this.f395b.mo588c(fragment7, this.f403r, this.f404s);
                        break;
                    case 6:
                        Fragment fragment8 = aVar.f415d;
                        fragment8.mNextAnim = aVar.f417f;
                        this.f395b.mo590d(fragment8, this.f403r, this.f404s);
                        break;
                    case 7:
                        Fragment fragment9 = aVar.f415d;
                        fragment9.mNextAnim = aVar.f416e;
                        this.f395b.mo592e(fragment9, this.f403r, this.f404s);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.f414c);
                }
            }
            this.f395b.mo566a(this.f395b.f468t, this.f403r, this.f404s, true);
            if (this.f405t) {
                this.f395b.mo583b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    /* renamed from: b */
    public void mo472b(boolean z) {
        if (C0176t.f445b) {
            Log.v(f384a, "popFromBackStack: " + this);
            mo469a("  ", (FileDescriptor) null, new PrintWriter(new C0304g(f384a)), (String[]) null);
        }
        mo476e(-1);
        for (C0160a aVar = this.f397l; aVar != null; aVar = aVar.f413b) {
            switch (aVar.f414c) {
                case 1:
                    Fragment fragment = aVar.f415d;
                    fragment.mNextAnim = aVar.f419h;
                    this.f395b.mo571a(fragment, C0176t.m692d(this.f403r), this.f404s);
                    break;
                case 2:
                    Fragment fragment2 = aVar.f415d;
                    if (fragment2 != null) {
                        fragment2.mNextAnim = aVar.f419h;
                        this.f395b.mo571a(fragment2, C0176t.m692d(this.f403r), this.f404s);
                    }
                    if (aVar.f420i == null) {
                        break;
                    } else {
                        for (int i = 0; i < aVar.f420i.size(); i++) {
                            Fragment fragment3 = aVar.f420i.get(i);
                            fragment3.mNextAnim = aVar.f418g;
                            this.f395b.mo573a(fragment3, false);
                        }
                        break;
                    }
                case 3:
                    Fragment fragment4 = aVar.f415d;
                    fragment4.mNextAnim = aVar.f418g;
                    this.f395b.mo573a(fragment4, false);
                    break;
                case 4:
                    Fragment fragment5 = aVar.f415d;
                    fragment5.mNextAnim = aVar.f418g;
                    this.f395b.mo588c(fragment5, C0176t.m692d(this.f403r), this.f404s);
                    break;
                case 5:
                    Fragment fragment6 = aVar.f415d;
                    fragment6.mNextAnim = aVar.f419h;
                    this.f395b.mo582b(fragment6, C0176t.m692d(this.f403r), this.f404s);
                    break;
                case 6:
                    Fragment fragment7 = aVar.f415d;
                    fragment7.mNextAnim = aVar.f418g;
                    this.f395b.mo592e(fragment7, C0176t.m692d(this.f403r), this.f404s);
                    break;
                case 7:
                    Fragment fragment8 = aVar.f415d;
                    fragment8.mNextAnim = aVar.f418g;
                    this.f395b.mo590d(fragment8, C0176t.m692d(this.f403r), this.f404s);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f414c);
            }
        }
        if (z) {
            this.f395b.mo566a(this.f395b.f468t, C0176t.m692d(this.f403r), this.f404s, true);
        }
        if (this.f409x >= 0) {
            this.f395b.mo586c(this.f409x);
            this.f409x = -1;
        }
    }

    /* renamed from: j */
    public String mo477j() {
        return this.f407v;
    }

    /* renamed from: k */
    public int mo478k() {
        return this.f403r;
    }

    /* renamed from: l */
    public int mo479l() {
        return this.f404s;
    }

    /* renamed from: m */
    public boolean mo55m() {
        return this.f398m == 0;
    }
}
