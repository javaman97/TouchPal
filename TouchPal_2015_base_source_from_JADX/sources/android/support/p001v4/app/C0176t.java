package android.support.p001v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p001v4.app.C0173s;
import android.support.p001v4.app.Fragment;
import android.support.p001v4.p016k.C0303f;
import android.support.p001v4.p016k.C0304g;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: android.support.v4.app.t */
/* compiled from: FragmentManager */
final class C0176t extends C0173s {

    /* renamed from: F */
    static final Interpolator f434F = new DecelerateInterpolator(2.5f);

    /* renamed from: G */
    static final Interpolator f435G = new DecelerateInterpolator(1.5f);

    /* renamed from: H */
    static final Interpolator f436H = new AccelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f437I = new AccelerateInterpolator(1.5f);

    /* renamed from: J */
    static final int f438J = 220;

    /* renamed from: K */
    public static final int f439K = 1;

    /* renamed from: L */
    public static final int f440L = 2;

    /* renamed from: M */
    public static final int f441M = 3;

    /* renamed from: N */
    public static final int f442N = 4;

    /* renamed from: O */
    public static final int f443O = 5;

    /* renamed from: P */
    public static final int f444P = 6;

    /* renamed from: b */
    static boolean f445b = false;

    /* renamed from: c */
    static final String f446c = "FragmentManager";

    /* renamed from: d */
    static final boolean f447d;

    /* renamed from: e */
    static final String f448e = "android:target_req_state";

    /* renamed from: f */
    static final String f449f = "android:target_state";

    /* renamed from: g */
    static final String f450g = "android:view_state";

    /* renamed from: h */
    static final String f451h = "android:user_visible_hint";

    /* renamed from: A */
    String f452A;

    /* renamed from: B */
    boolean f453B;

    /* renamed from: C */
    Bundle f454C = null;

    /* renamed from: D */
    SparseArray<Parcelable> f455D = null;

    /* renamed from: E */
    Runnable f456E = new C0177u(this);

    /* renamed from: i */
    ArrayList<Runnable> f457i;

    /* renamed from: j */
    Runnable[] f458j;

    /* renamed from: k */
    boolean f459k;

    /* renamed from: l */
    ArrayList<Fragment> f460l;

    /* renamed from: m */
    ArrayList<Fragment> f461m;

    /* renamed from: n */
    ArrayList<Integer> f462n;

    /* renamed from: o */
    ArrayList<C0159i> f463o;

    /* renamed from: p */
    ArrayList<Fragment> f464p;

    /* renamed from: q */
    ArrayList<C0159i> f465q;

    /* renamed from: r */
    ArrayList<Integer> f466r;

    /* renamed from: s */
    ArrayList<C0173s.C0175b> f467s;

    /* renamed from: t */
    int f468t = 0;

    /* renamed from: u */
    C0167o f469u;

    /* renamed from: v */
    C0172r f470v;

    /* renamed from: w */
    Fragment f471w;

    /* renamed from: x */
    boolean f472x;

    /* renamed from: y */
    boolean f473y;

    /* renamed from: z */
    boolean f474z;

    C0176t() {
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 11) {
            z = true;
        }
        f447d = z;
    }

    /* renamed from: a */
    private void m690a(RuntimeException runtimeException) {
        Log.e(f446c, runtimeException.getMessage());
        Log.e(f446c, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0304g(f446c));
        if (this.f469u != null) {
            try {
                this.f469u.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(f446c, "Failed dumping state", e);
            }
        } else {
            try {
                mo551a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(f446c, "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: a */
    public C0036E mo542a() {
        return new C0159i(this);
    }

    /* renamed from: c */
    public boolean mo557c() {
        return mo596j();
    }

    /* renamed from: d */
    public void mo558d() {
        mo575a((Runnable) new C0178v(this), false);
    }

    /* renamed from: e */
    public boolean mo559e() {
        m693y();
        mo557c();
        return mo576a(this.f469u.mHandler, (String) null, -1, 0);
    }

    /* renamed from: a */
    public void mo550a(String str, int i) {
        mo575a((Runnable) new C0179w(this, str, i), false);
    }

    /* renamed from: b */
    public boolean mo556b(String str, int i) {
        m693y();
        mo557c();
        return mo576a(this.f469u.mHandler, str, -1, i);
    }

    /* renamed from: a */
    public void mo547a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        mo575a((Runnable) new C0180x(this, i, i2), false);
    }

    /* renamed from: b */
    public boolean mo555b(int i, int i2) {
        m693y();
        mo557c();
        if (i >= 0) {
            return mo576a(this.f469u.mHandler, (String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* renamed from: f */
    public int mo560f() {
        if (this.f463o != null) {
            return this.f463o.size();
        }
        return 0;
    }

    /* renamed from: b */
    public C0173s.C0174a mo553b(int i) {
        return this.f463o.get(i);
    }

    /* renamed from: a */
    public void mo549a(C0173s.C0175b bVar) {
        if (this.f467s == null) {
            this.f467s = new ArrayList<>();
        }
        this.f467s.add(bVar);
    }

    /* renamed from: b */
    public void mo554b(C0173s.C0175b bVar) {
        if (this.f467s != null) {
            this.f467s.remove(bVar);
        }
    }

    /* renamed from: a */
    public void mo548a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            m690a((RuntimeException) new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    /* renamed from: a */
    public Fragment mo545a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f460l.size()) {
            m690a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        Fragment fragment = this.f460l.get(i);
        if (fragment != null) {
            return fragment;
        }
        m690a((RuntimeException) new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return fragment;
    }

    /* renamed from: g */
    public List<Fragment> mo561g() {
        return this.f460l;
    }

    /* renamed from: a */
    public Fragment.SavedState mo543a(Fragment fragment) {
        Bundle g;
        if (fragment.mIndex < 0) {
            m690a((RuntimeException) new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.mState <= 0 || (g = mo594g(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(g);
    }

    /* renamed from: h */
    public boolean mo562h() {
        return this.f474z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.f471w != null) {
            C0303f.m1215a(this.f471w, sb);
        } else {
            C0303f.m1215a(this.f469u, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo551a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        String str2 = str + "    ";
        if (this.f460l != null && (size6 = this.f460l.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i = 0; i < size6; i++) {
                Fragment fragment = this.f460l.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        if (this.f461m != null && (size5 = this.f461m.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size5; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f461m.get(i2).toString());
            }
        }
        if (this.f464p != null && (size4 = this.f464p.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f464p.get(i3).toString());
            }
        }
        if (this.f463o != null && (size3 = this.f463o.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size3; i4++) {
                C0159i iVar = this.f463o.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(iVar.toString());
                iVar.mo469a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.f465q != null && (size2 = this.f465q.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.f465q.get(i5));
                }
            }
            if (this.f466r != null && this.f466r.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f466r.toArray()));
            }
        }
        if (this.f457i != null && (size = this.f457i.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(this.f457i.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.f469u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f470v);
        if (this.f471w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f471w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f468t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f473y);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f474z);
        if (this.f472x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f472x);
        }
        if (this.f452A != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f452A);
        }
        if (this.f462n != null && this.f462n.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.f462n.toArray()));
        }
    }

    /* renamed from: a */
    static Animation m689a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f434F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f435G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    /* renamed from: a */
    static Animation m688a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f435G);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Animation mo565a(Fragment fragment, int i, boolean z, int i2) {
        Animation loadAnimation;
        Animation onCreateAnimation = fragment.onCreateAnimation(i, z, fragment.mNextAnim);
        if (onCreateAnimation != null) {
            return onCreateAnimation;
        }
        if (fragment.mNextAnim != 0 && (loadAnimation = AnimationUtils.loadAnimation(this.f469u, fragment.mNextAnim)) != null) {
            return loadAnimation;
        }
        if (i == 0) {
            return null;
        }
        int b = m691b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return m689a((Context) this.f469u, 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m689a((Context) this.f469u, 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m689a((Context) this.f469u, 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m689a((Context) this.f469u, 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m688a((Context) this.f469u, 0.0f, 1.0f);
            case 6:
                return m688a((Context) this.f469u, 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f469u.getWindow() != null) {
                    i2 = this.f469u.getWindow().getAttributes().windowAnimations;
                }
                if (i2 == 0) {
                    return null;
                }
                return null;
        }
    }

    /* renamed from: b */
    public void mo581b(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.f459k) {
            this.f453B = true;
            return;
        }
        fragment.mDeferStart = false;
        mo572a(fragment, this.f468t, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0214, code lost:
        if (f445b == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0216, code lost:
        android.util.Log.v(f446c, "moveto RESUMED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x022e, code lost:
        r10.mResumed = true;
        r10.performResume();
        r10.mSavedFragmentState = null;
        r10.mSavedViewState = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x023d, code lost:
        r10.mInnerView = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x024b, code lost:
        if (r11 >= 1) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x024f, code lost:
        if (r9.f474z == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0253, code lost:
        if (r10.mAnimatingAway == null) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0255, code lost:
        r0 = r10.mAnimatingAway;
        r10.mAnimatingAway = null;
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x025e, code lost:
        if (r10.mAnimatingAway == null) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0260, code lost:
        r10.mStateAfterAnimating = r11;
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0289, code lost:
        if (r11 >= 4) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x028d, code lost:
        if (f445b == false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028f, code lost:
        android.util.Log.v(f446c, "movefrom STARTED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02a7, code lost:
        r10.performStop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02aa, code lost:
        if (r11 >= 3) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ae, code lost:
        if (f445b == false) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02b0, code lost:
        android.util.Log.v(f446c, "movefrom STOPPED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c8, code lost:
        r10.performReallyStop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02cc, code lost:
        if (r11 >= 2) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02d0, code lost:
        if (f445b == false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d2, code lost:
        android.util.Log.v(f446c, "movefrom ACTIVITY_CREATED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ec, code lost:
        if (r10.mView == null) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f4, code lost:
        if (r9.f469u.isFinishing() != false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02f8, code lost:
        if (r10.mSavedViewState != null) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02fa, code lost:
        mo593f(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02fd, code lost:
        r10.performDestroyView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0302, code lost:
        if (r10.mView == null) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0306, code lost:
        if (r10.mContainer == null) goto L_0x0330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x030a, code lost:
        if (r9.f468t <= 0) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x030e, code lost:
        if (r9.f474z != false) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0310, code lost:
        r0 = mo565a(r10, r12, false, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0314, code lost:
        if (r0 == null) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0316, code lost:
        r10.mAnimatingAway = r10.mView;
        r10.mStateAfterAnimating = r11;
        r0.setAnimationListener(new android.support.p001v4.app.C0181y(r9, r10));
        r10.mView.startAnimation(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0329, code lost:
        r10.mContainer.removeView(r10.mView);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0330, code lost:
        r10.mContainer = null;
        r10.mView = null;
        r10.mInnerView = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x033a, code lost:
        if (f445b == false) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033c, code lost:
        android.util.Log.v(f446c, "movefrom CREATED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0356, code lost:
        if (r10.mRetaining != false) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0358, code lost:
        r10.performDestroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x035b, code lost:
        r10.mCalled = false;
        r10.onDetach();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0362, code lost:
        if (r10.mCalled != false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0382, code lost:
        throw new android.support.p001v4.app.C0141am("Fragment " + r10 + " did not call through to super.onDetach()");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0383, code lost:
        if (r14 != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0387, code lost:
        if (r10.mRetaining != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0389, code lost:
        mo591e(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x038e, code lost:
        r10.mActivity = null;
        r10.mParentFragment = null;
        r10.mFragmentManager = null;
        r10.mChildFragmentManager = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0398, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x039b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0126, code lost:
        if (r11 <= 1) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012a, code lost:
        if (f445b == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012c, code lost:
        android.util.Log.v(f446c, "moveto ACTIVITY_CREATED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0146, code lost:
        if (r10.mFromLayout != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014a, code lost:
        if (r10.mContainerId == 0) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014c, code lost:
        r0 = (android.view.ViewGroup) r9.f470v.mo501a(r10.mContainerId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0156, code lost:
        if (r0 != null) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015a, code lost:
        if (r10.mRestored != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015c, code lost:
        m690a((java.lang.RuntimeException) new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(r10.mContainerId) + " (" + r10.getResources().getResourceName(r10.mContainerId) + ") for fragment " + r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019b, code lost:
        r10.mContainer = r0;
        r10.mView = r10.performCreateView(r10.getLayoutInflater(r10.mSavedFragmentState), r0, r10.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ad, code lost:
        if (r10.mView == null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01af, code lost:
        r10.mInnerView = r10.mView;
        r10.mView = android.support.p001v4.app.C0057N.m163a(r10.mView);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01bb, code lost:
        if (r0 == null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01bd, code lost:
        r1 = mo565a(r10, r12, true, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c1, code lost:
        if (r1 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c3, code lost:
        r10.mView.startAnimation(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c8, code lost:
        r0.addView(r10.mView);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cf, code lost:
        if (r10.mHidden == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d1, code lost:
        r10.mView.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d8, code lost:
        r10.onViewCreated(r10.mView, r10.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01df, code lost:
        r10.performActivityCreated(r10.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e6, code lost:
        if (r10.mView == null) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e8, code lost:
        r10.restoreViewState(r10.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ed, code lost:
        r10.mSavedFragmentState = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ef, code lost:
        if (r11 <= 3) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f3, code lost:
        if (f445b == false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f5, code lost:
        android.util.Log.v(f446c, "moveto STARTED: " + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x020d, code lost:
        r10.performStart();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0210, code lost:
        if (r11 <= 4) goto L_0x0045;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo572a(android.support.p001v4.app.Fragment r10, int r11, int r12, int r13, boolean r14) {
        /*
            r9 = this;
            r8 = 4
            r6 = 3
            r3 = 0
            r5 = 1
            r7 = 0
            boolean r0 = r10.mAdded
            if (r0 == 0) goto L_0x000d
            boolean r0 = r10.mDetached
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            if (r11 <= r5) goto L_0x0010
            r11 = r5
        L_0x0010:
            boolean r0 = r10.mRemoving
            if (r0 == 0) goto L_0x001a
            int r0 = r10.mState
            if (r11 <= r0) goto L_0x001a
            int r11 = r10.mState
        L_0x001a:
            boolean r0 = r10.mDeferStart
            if (r0 == 0) goto L_0x0025
            int r0 = r10.mState
            if (r0 >= r8) goto L_0x0025
            if (r11 <= r6) goto L_0x0025
            r11 = r6
        L_0x0025:
            int r0 = r10.mState
            if (r0 >= r11) goto L_0x0240
            boolean r0 = r10.mFromLayout
            if (r0 == 0) goto L_0x0032
            boolean r0 = r10.mInLayout
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            return
        L_0x0032:
            android.view.View r0 = r10.mAnimatingAway
            if (r0 == 0) goto L_0x0040
            r10.mAnimatingAway = r7
            int r2 = r10.mStateAfterAnimating
            r0 = r9
            r1 = r10
            r4 = r3
            r0.mo572a((android.support.p001v4.app.Fragment) r1, (int) r2, (int) r3, (int) r4, (boolean) r5)
        L_0x0040:
            int r0 = r10.mState
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0126;
                case 2: goto L_0x01ef;
                case 3: goto L_0x01ef;
                case 4: goto L_0x0210;
                default: goto L_0x0045;
            }
        L_0x0045:
            r10.mState = r11
            goto L_0x0031
        L_0x0048:
            boolean r0 = f445b
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0064:
            android.os.Bundle r0 = r10.mSavedFragmentState
            if (r0 == 0) goto L_0x009d
            android.os.Bundle r0 = r10.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r10.mSavedViewState = r0
            android.os.Bundle r0 = r10.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.Fragment r0 = r9.mo545a((android.os.Bundle) r0, (java.lang.String) r1)
            r10.mTarget = r0
            android.support.v4.app.Fragment r0 = r10.mTarget
            if (r0 == 0) goto L_0x008a
            android.os.Bundle r0 = r10.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r3)
            r10.mTargetRequestCode = r0
        L_0x008a:
            android.os.Bundle r0 = r10.mSavedFragmentState
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r5)
            r10.mUserVisibleHint = r0
            boolean r0 = r10.mUserVisibleHint
            if (r0 != 0) goto L_0x009d
            r10.mDeferStart = r5
            if (r11 <= r6) goto L_0x009d
            r11 = r6
        L_0x009d:
            android.support.v4.app.o r0 = r9.f469u
            r10.mActivity = r0
            android.support.v4.app.Fragment r0 = r9.f471w
            r10.mParentFragment = r0
            android.support.v4.app.Fragment r0 = r9.f471w
            if (r0 == 0) goto L_0x00d9
            android.support.v4.app.Fragment r0 = r9.f471w
            android.support.v4.app.t r0 = r0.mChildFragmentManager
        L_0x00ad:
            r10.mFragmentManager = r0
            r10.mCalled = r3
            android.support.v4.app.o r0 = r9.f469u
            r10.onAttach(r0)
            boolean r0 = r10.mCalled
            if (r0 != 0) goto L_0x00de
            android.support.v4.app.am r0 = new android.support.v4.app.am
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d9:
            android.support.v4.app.o r0 = r9.f469u
            android.support.v4.app.t r0 = r0.mFragments
            goto L_0x00ad
        L_0x00de:
            android.support.v4.app.Fragment r0 = r10.mParentFragment
            if (r0 != 0) goto L_0x00e7
            android.support.v4.app.o r0 = r9.f469u
            r0.onAttachFragment(r10)
        L_0x00e7:
            boolean r0 = r10.mRetaining
            if (r0 != 0) goto L_0x00f0
            android.os.Bundle r0 = r10.mSavedFragmentState
            r10.performCreate(r0)
        L_0x00f0:
            r10.mRetaining = r3
            boolean r0 = r10.mFromLayout
            if (r0 == 0) goto L_0x0126
            android.os.Bundle r0 = r10.mSavedFragmentState
            android.view.LayoutInflater r0 = r10.getLayoutInflater(r0)
            android.os.Bundle r1 = r10.mSavedFragmentState
            android.view.View r0 = r10.performCreateView(r0, r7, r1)
            r10.mView = r0
            android.view.View r0 = r10.mView
            if (r0 == 0) goto L_0x0239
            android.view.View r0 = r10.mView
            r10.mInnerView = r0
            android.view.View r0 = r10.mView
            android.view.ViewGroup r0 = android.support.p001v4.app.C0057N.m163a(r0)
            r10.mView = r0
            boolean r0 = r10.mHidden
            if (r0 == 0) goto L_0x011f
            android.view.View r0 = r10.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x011f:
            android.view.View r0 = r10.mView
            android.os.Bundle r1 = r10.mSavedFragmentState
            r10.onViewCreated(r0, r1)
        L_0x0126:
            if (r11 <= r5) goto L_0x01ef
            boolean r0 = f445b
            if (r0 == 0) goto L_0x0144
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0144:
            boolean r0 = r10.mFromLayout
            if (r0 != 0) goto L_0x01df
            int r0 = r10.mContainerId
            if (r0 == 0) goto L_0x039b
            android.support.v4.app.r r0 = r9.f470v
            int r1 = r10.mContainerId
            android.view.View r0 = r0.mo501a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x019b
            boolean r1 = r10.mRestored
            if (r1 != 0) goto L_0x019b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No view found for id 0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r10.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " ("
            java.lang.StringBuilder r2 = r2.append(r3)
            android.content.res.Resources r3 = r10.getResources()
            int r4 = r10.mContainerId
            java.lang.String r3 = r3.getResourceName(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ") for fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r9.m690a((java.lang.RuntimeException) r1)
        L_0x019b:
            r10.mContainer = r0
            android.os.Bundle r1 = r10.mSavedFragmentState
            android.view.LayoutInflater r1 = r10.getLayoutInflater(r1)
            android.os.Bundle r2 = r10.mSavedFragmentState
            android.view.View r1 = r10.performCreateView(r1, r0, r2)
            r10.mView = r1
            android.view.View r1 = r10.mView
            if (r1 == 0) goto L_0x023d
            android.view.View r1 = r10.mView
            r10.mInnerView = r1
            android.view.View r1 = r10.mView
            android.view.ViewGroup r1 = android.support.p001v4.app.C0057N.m163a(r1)
            r10.mView = r1
            if (r0 == 0) goto L_0x01cd
            android.view.animation.Animation r1 = r9.mo565a((android.support.p001v4.app.Fragment) r10, (int) r12, (boolean) r5, (int) r13)
            if (r1 == 0) goto L_0x01c8
            android.view.View r2 = r10.mView
            r2.startAnimation(r1)
        L_0x01c8:
            android.view.View r1 = r10.mView
            r0.addView(r1)
        L_0x01cd:
            boolean r0 = r10.mHidden
            if (r0 == 0) goto L_0x01d8
            android.view.View r0 = r10.mView
            r1 = 8
            r0.setVisibility(r1)
        L_0x01d8:
            android.view.View r0 = r10.mView
            android.os.Bundle r1 = r10.mSavedFragmentState
            r10.onViewCreated(r0, r1)
        L_0x01df:
            android.os.Bundle r0 = r10.mSavedFragmentState
            r10.performActivityCreated(r0)
            android.view.View r0 = r10.mView
            if (r0 == 0) goto L_0x01ed
            android.os.Bundle r0 = r10.mSavedFragmentState
            r10.restoreViewState(r0)
        L_0x01ed:
            r10.mSavedFragmentState = r7
        L_0x01ef:
            if (r11 <= r6) goto L_0x0210
            boolean r0 = f445b
            if (r0 == 0) goto L_0x020d
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto STARTED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x020d:
            r10.performStart()
        L_0x0210:
            if (r11 <= r8) goto L_0x0045
            boolean r0 = f445b
            if (r0 == 0) goto L_0x022e
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x022e:
            r10.mResumed = r5
            r10.performResume()
            r10.mSavedFragmentState = r7
            r10.mSavedViewState = r7
            goto L_0x0045
        L_0x0239:
            r10.mInnerView = r7
            goto L_0x0126
        L_0x023d:
            r10.mInnerView = r7
            goto L_0x01df
        L_0x0240:
            int r0 = r10.mState
            if (r0 <= r11) goto L_0x0045
            int r0 = r10.mState
            switch(r0) {
                case 1: goto L_0x024b;
                case 2: goto L_0x02cb;
                case 3: goto L_0x02aa;
                case 4: goto L_0x0289;
                case 5: goto L_0x0265;
                default: goto L_0x0249;
            }
        L_0x0249:
            goto L_0x0045
        L_0x024b:
            if (r11 >= r5) goto L_0x0045
            boolean r0 = r9.f474z
            if (r0 == 0) goto L_0x025c
            android.view.View r0 = r10.mAnimatingAway
            if (r0 == 0) goto L_0x025c
            android.view.View r0 = r10.mAnimatingAway
            r10.mAnimatingAway = r7
            r0.clearAnimation()
        L_0x025c:
            android.view.View r0 = r10.mAnimatingAway
            if (r0 == 0) goto L_0x0338
            r10.mStateAfterAnimating = r11
            r11 = r5
            goto L_0x0045
        L_0x0265:
            r0 = 5
            if (r11 >= r0) goto L_0x0289
            boolean r0 = f445b
            if (r0 == 0) goto L_0x0284
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom RESUMED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0284:
            r10.performPause()
            r10.mResumed = r3
        L_0x0289:
            if (r11 >= r8) goto L_0x02aa
            boolean r0 = f445b
            if (r0 == 0) goto L_0x02a7
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STARTED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02a7:
            r10.performStop()
        L_0x02aa:
            if (r11 >= r6) goto L_0x02cb
            boolean r0 = f445b
            if (r0 == 0) goto L_0x02c8
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STOPPED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02c8:
            r10.performReallyStop()
        L_0x02cb:
            r0 = 2
            if (r11 >= r0) goto L_0x024b
            boolean r0 = f445b
            if (r0 == 0) goto L_0x02ea
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02ea:
            android.view.View r0 = r10.mView
            if (r0 == 0) goto L_0x02fd
            android.support.v4.app.o r0 = r9.f469u
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x02fd
            android.util.SparseArray<android.os.Parcelable> r0 = r10.mSavedViewState
            if (r0 != 0) goto L_0x02fd
            r9.mo593f(r10)
        L_0x02fd:
            r10.performDestroyView()
            android.view.View r0 = r10.mView
            if (r0 == 0) goto L_0x0330
            android.view.ViewGroup r0 = r10.mContainer
            if (r0 == 0) goto L_0x0330
            int r0 = r9.f468t
            if (r0 <= 0) goto L_0x0398
            boolean r0 = r9.f474z
            if (r0 != 0) goto L_0x0398
            android.view.animation.Animation r0 = r9.mo565a((android.support.p001v4.app.Fragment) r10, (int) r12, (boolean) r3, (int) r13)
        L_0x0314:
            if (r0 == 0) goto L_0x0329
            android.view.View r1 = r10.mView
            r10.mAnimatingAway = r1
            r10.mStateAfterAnimating = r11
            android.support.v4.app.y r1 = new android.support.v4.app.y
            r1.<init>(r9, r10)
            r0.setAnimationListener(r1)
            android.view.View r1 = r10.mView
            r1.startAnimation(r0)
        L_0x0329:
            android.view.ViewGroup r0 = r10.mContainer
            android.view.View r1 = r10.mView
            r0.removeView(r1)
        L_0x0330:
            r10.mContainer = r7
            r10.mView = r7
            r10.mInnerView = r7
            goto L_0x024b
        L_0x0338:
            boolean r0 = f445b
            if (r0 == 0) goto L_0x0354
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom CREATED: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0354:
            boolean r0 = r10.mRetaining
            if (r0 != 0) goto L_0x035b
            r10.performDestroy()
        L_0x035b:
            r10.mCalled = r3
            r10.onDetach()
            boolean r0 = r10.mCalled
            if (r0 != 0) goto L_0x0383
            android.support.v4.app.am r0 = new android.support.v4.app.am
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = " did not call through to super.onDetach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0383:
            if (r14 != 0) goto L_0x0045
            boolean r0 = r10.mRetaining
            if (r0 != 0) goto L_0x038e
            r9.mo591e(r10)
            goto L_0x0045
        L_0x038e:
            r10.mActivity = r7
            r10.mParentFragment = r7
            r10.mFragmentManager = r7
            r10.mChildFragmentManager = r7
            goto L_0x0045
        L_0x0398:
            r0 = r7
            goto L_0x0314
        L_0x039b:
            r0 = r7
            goto L_0x019b
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.app.C0176t.mo572a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo587c(Fragment fragment) {
        mo572a(fragment, this.f468t, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo568a(int i, boolean z) {
        mo566a(i, 0, 0, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo566a(int i, int i2, int i3, boolean z) {
        if (this.f469u == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || this.f468t != i) {
            this.f468t = i;
            if (this.f460l != null) {
                int i4 = 0;
                boolean z2 = false;
                while (i4 < this.f460l.size()) {
                    Fragment fragment = this.f460l.get(i4);
                    if (fragment != null) {
                        mo572a(fragment, i, i2, i3, false);
                        if (fragment.mLoaderManager != null) {
                            z2 |= fragment.mLoaderManager.mo191a();
                        }
                    }
                    i4++;
                    z2 = z2;
                }
                if (!z2) {
                    mo595i();
                }
                if (this.f472x && this.f469u != null && this.f468t == 5) {
                    this.f469u.supportInvalidateOptionsMenu();
                    this.f472x = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo595i() {
        if (this.f460l != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f460l.size()) {
                    Fragment fragment = this.f460l.get(i2);
                    if (fragment != null) {
                        mo581b(fragment);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo589d(Fragment fragment) {
        if (fragment.mIndex < 0) {
            if (this.f462n == null || this.f462n.size() <= 0) {
                if (this.f460l == null) {
                    this.f460l = new ArrayList<>();
                }
                fragment.setIndex(this.f460l.size(), this.f471w);
                this.f460l.add(fragment);
            } else {
                fragment.setIndex(this.f462n.remove(this.f462n.size() - 1).intValue(), this.f471w);
                this.f460l.set(fragment.mIndex, fragment);
            }
            if (f445b) {
                Log.v(f446c, "Allocated fragment index " + fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo591e(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            if (f445b) {
                Log.v(f446c, "Freeing fragment index " + fragment);
            }
            this.f460l.set(fragment.mIndex, (Object) null);
            if (this.f462n == null) {
                this.f462n = new ArrayList<>();
            }
            this.f462n.add(Integer.valueOf(fragment.mIndex));
            this.f469u.invalidateSupportFragment(fragment.mWho);
            fragment.initState();
        }
    }

    /* renamed from: a */
    public void mo573a(Fragment fragment, boolean z) {
        if (this.f461m == null) {
            this.f461m = new ArrayList<>();
        }
        if (f445b) {
            Log.v(f446c, "add: " + fragment);
        }
        mo589d(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (this.f461m.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        this.f461m.add(fragment);
        fragment.mAdded = true;
        fragment.mRemoving = false;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            this.f472x = true;
        }
        if (z) {
            mo587c(fragment);
        }
    }

    /* renamed from: a */
    public void mo571a(Fragment fragment, int i, int i2) {
        int i3;
        if (f445b) {
            Log.v(f446c, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            if (this.f461m != null) {
                this.f461m.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.f472x = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
            if (z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            mo572a(fragment, i3, i, i2, false);
        }
    }

    /* renamed from: b */
    public void mo582b(Fragment fragment, int i, int i2) {
        if (f445b) {
            Log.v(f446c, "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            if (fragment.mView != null) {
                Animation a = mo565a(fragment, i, false, i2);
                if (a != null) {
                    fragment.mView.startAnimation(a);
                }
                fragment.mView.setVisibility(8);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
                this.f472x = true;
            }
            fragment.onHiddenChanged(true);
        }
    }

    /* renamed from: c */
    public void mo588c(Fragment fragment, int i, int i2) {
        if (f445b) {
            Log.v(f446c, "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            if (fragment.mView != null) {
                Animation a = mo565a(fragment, i, true, i2);
                if (a != null) {
                    fragment.mView.startAnimation(a);
                }
                fragment.mView.setVisibility(0);
            }
            if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
                this.f472x = true;
            }
            fragment.onHiddenChanged(false);
        }
    }

    /* renamed from: d */
    public void mo590d(Fragment fragment, int i, int i2) {
        if (f445b) {
            Log.v(f446c, "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (this.f461m != null) {
                    if (f445b) {
                        Log.v(f446c, "remove from detach: " + fragment);
                    }
                    this.f461m.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f472x = true;
                }
                fragment.mAdded = false;
                mo572a(fragment, 1, i, i2, false);
            }
        }
    }

    /* renamed from: e */
    public void mo592e(Fragment fragment, int i, int i2) {
        if (f445b) {
            Log.v(f446c, "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                if (this.f461m == null) {
                    this.f461m = new ArrayList<>();
                }
                if (this.f461m.contains(fragment)) {
                    throw new IllegalStateException("Fragment already added: " + fragment);
                }
                if (f445b) {
                    Log.v(f446c, "add from attach: " + fragment);
                }
                this.f461m.add(fragment);
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.f472x = true;
                }
                mo572a(fragment, this.f468t, i, i2, false);
            }
        }
    }

    /* renamed from: a */
    public Fragment mo544a(int i) {
        if (this.f461m != null) {
            for (int size = this.f461m.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f461m.get(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            }
        }
        if (this.f460l != null) {
            for (int size2 = this.f460l.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = this.f460l.get(size2);
                if (fragment2 != null && fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public Fragment mo546a(String str) {
        if (!(this.f461m == null || str == null)) {
            for (int size = this.f461m.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f461m.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (!(this.f460l == null || str == null)) {
            for (int size2 = this.f460l.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = this.f460l.get(size2);
                if (fragment2 != null && str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public Fragment mo580b(String str) {
        Fragment findFragmentByWho;
        if (!(this.f460l == null || str == null)) {
            for (int size = this.f460l.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f460l.get(size);
                if (fragment != null && (findFragmentByWho = fragment.findFragmentByWho(str)) != null) {
                    return findFragmentByWho;
                }
            }
        }
        return null;
    }

    /* renamed from: y */
    private void m693y() {
        if (this.f473y) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f452A != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f452A);
        }
    }

    /* renamed from: a */
    public void mo575a(Runnable runnable, boolean z) {
        if (!z) {
            m693y();
        }
        synchronized (this) {
            if (this.f474z || this.f469u == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.f457i == null) {
                this.f457i = new ArrayList<>();
            }
            this.f457i.add(runnable);
            if (this.f457i.size() == 1) {
                this.f469u.mHandler.removeCallbacks(this.f456E);
                this.f469u.mHandler.post(this.f456E);
            }
        }
    }

    /* renamed from: a */
    public int mo564a(C0159i iVar) {
        int i;
        synchronized (this) {
            if (this.f466r == null || this.f466r.size() <= 0) {
                if (this.f465q == null) {
                    this.f465q = new ArrayList<>();
                }
                i = this.f465q.size();
                if (f445b) {
                    Log.v(f446c, "Setting back stack index " + i + " to " + iVar);
                }
                this.f465q.add(iVar);
            } else {
                i = this.f466r.remove(this.f466r.size() - 1).intValue();
                if (f445b) {
                    Log.v(f446c, "Adding back stack index " + i + " with " + iVar);
                }
                this.f465q.set(i, iVar);
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo567a(int i, C0159i iVar) {
        synchronized (this) {
            if (this.f465q == null) {
                this.f465q = new ArrayList<>();
            }
            int size = this.f465q.size();
            if (i < size) {
                if (f445b) {
                    Log.v(f446c, "Setting back stack index " + i + " to " + iVar);
                }
                this.f465q.set(i, iVar);
            } else {
                while (size < i) {
                    this.f465q.add((Object) null);
                    if (this.f466r == null) {
                        this.f466r = new ArrayList<>();
                    }
                    if (f445b) {
                        Log.v(f446c, "Adding available back stack index " + size);
                    }
                    this.f466r.add(Integer.valueOf(size));
                    size++;
                }
                if (f445b) {
                    Log.v(f446c, "Adding back stack index " + i + " with " + iVar);
                }
                this.f465q.add(iVar);
            }
        }
    }

    /* renamed from: c */
    public void mo586c(int i) {
        synchronized (this) {
            this.f465q.set(i, (Object) null);
            if (this.f466r == null) {
                this.f466r = new ArrayList<>();
            }
            if (f445b) {
                Log.v(f446c, "Freeing back stack index " + i);
            }
            this.f466r.add(Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        r6.f459k = true;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r1 >= r3) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        r6.f458j[r1].run();
        r6.f458j[r1] = null;
        r1 = r1 + 1;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo596j() {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            boolean r1 = r6.f459k
            if (r1 == 0) goto L_0x000e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Recursive entry to executePendingTransactions"
            r0.<init>(r1)
            throw r0
        L_0x000e:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.support.v4.app.o r3 = r6.f469u
            android.os.Handler r3 = r3.mHandler
            android.os.Looper r3 = r3.getLooper()
            if (r1 == r3) goto L_0x0024
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from main thread of process"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            r1 = r2
        L_0x0025:
            monitor-enter(r6)
            java.util.ArrayList<java.lang.Runnable> r3 = r6.f457i     // Catch:{ all -> 0x0097 }
            if (r3 == 0) goto L_0x0032
            java.util.ArrayList<java.lang.Runnable> r3 = r6.f457i     // Catch:{ all -> 0x0097 }
            int r3 = r3.size()     // Catch:{ all -> 0x0097 }
            if (r3 != 0) goto L_0x005a
        L_0x0032:
            monitor-exit(r6)     // Catch:{ all -> 0x0097 }
            boolean r0 = r6.f453B
            if (r0 == 0) goto L_0x00a5
            r3 = r2
            r4 = r2
        L_0x0039:
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r6.f460l
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x009e
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r6.f460l
            java.lang.Object r0 = r0.get(r3)
            android.support.v4.app.Fragment r0 = (android.support.p001v4.app.Fragment) r0
            if (r0 == 0) goto L_0x0056
            android.support.v4.app.K r5 = r0.mLoaderManager
            if (r5 == 0) goto L_0x0056
            android.support.v4.app.K r0 = r0.mLoaderManager
            boolean r0 = r0.mo191a()
            r4 = r4 | r0
        L_0x0056:
            int r0 = r3 + 1
            r3 = r0
            goto L_0x0039
        L_0x005a:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.f457i     // Catch:{ all -> 0x0097 }
            int r3 = r1.size()     // Catch:{ all -> 0x0097 }
            java.lang.Runnable[] r1 = r6.f458j     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x0069
            java.lang.Runnable[] r1 = r6.f458j     // Catch:{ all -> 0x0097 }
            int r1 = r1.length     // Catch:{ all -> 0x0097 }
            if (r1 >= r3) goto L_0x006d
        L_0x0069:
            java.lang.Runnable[] r1 = new java.lang.Runnable[r3]     // Catch:{ all -> 0x0097 }
            r6.f458j = r1     // Catch:{ all -> 0x0097 }
        L_0x006d:
            java.util.ArrayList<java.lang.Runnable> r1 = r6.f457i     // Catch:{ all -> 0x0097 }
            java.lang.Runnable[] r4 = r6.f458j     // Catch:{ all -> 0x0097 }
            r1.toArray(r4)     // Catch:{ all -> 0x0097 }
            java.util.ArrayList<java.lang.Runnable> r1 = r6.f457i     // Catch:{ all -> 0x0097 }
            r1.clear()     // Catch:{ all -> 0x0097 }
            android.support.v4.app.o r1 = r6.f469u     // Catch:{ all -> 0x0097 }
            android.os.Handler r1 = r1.mHandler     // Catch:{ all -> 0x0097 }
            java.lang.Runnable r4 = r6.f456E     // Catch:{ all -> 0x0097 }
            r1.removeCallbacks(r4)     // Catch:{ all -> 0x0097 }
            monitor-exit(r6)     // Catch:{ all -> 0x0097 }
            r6.f459k = r0
            r1 = r2
        L_0x0086:
            if (r1 >= r3) goto L_0x009a
            java.lang.Runnable[] r4 = r6.f458j
            r4 = r4[r1]
            r4.run()
            java.lang.Runnable[] r4 = r6.f458j
            r5 = 0
            r4[r1] = r5
            int r1 = r1 + 1
            goto L_0x0086
        L_0x0097:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0097 }
            throw r0
        L_0x009a:
            r6.f459k = r2
            r1 = r0
            goto L_0x0025
        L_0x009e:
            if (r4 != 0) goto L_0x00a5
            r6.f453B = r2
            r6.mo595i()
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.app.C0176t.mo596j():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo597k() {
        if (this.f467s != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f467s.size()) {
                    this.f467s.get(i2).mo563a();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo583b(C0159i iVar) {
        if (this.f463o == null) {
            this.f463o = new ArrayList<>();
        }
        this.f463o.add(iVar);
        mo597k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo576a(Handler handler, String str, int i, int i2) {
        boolean z;
        int i3;
        if (this.f463o == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f463o.size() - 1;
            if (size < 0) {
                return false;
            }
            this.f463o.remove(size).mo472b(true);
            mo597k();
        } else {
            int i4 = -1;
            if (str != null || i >= 0) {
                int size2 = this.f463o.size() - 1;
                while (i3 >= 0) {
                    C0159i iVar = this.f463o.get(i3);
                    if ((str != null && str.equals(iVar.mo477j())) || (i >= 0 && i == iVar.f409x)) {
                        break;
                    }
                    size2 = i3 - 1;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    i3--;
                    while (i3 >= 0) {
                        C0159i iVar2 = this.f463o.get(i3);
                        if ((str == null || !str.equals(iVar2.mo477j())) && (i < 0 || i != iVar2.f409x)) {
                            break;
                        }
                        i3--;
                    }
                }
                i4 = i3;
            }
            if (i4 == this.f463o.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int size3 = this.f463o.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f463o.remove(size3));
            }
            int size4 = arrayList.size() - 1;
            for (int i5 = 0; i5 <= size4; i5++) {
                if (f445b) {
                    Log.v(f446c, "Popping back stack state: " + arrayList.get(i5));
                }
                C0159i iVar3 = (C0159i) arrayList.get(i5);
                if (i5 == size4) {
                    z = true;
                } else {
                    z = false;
                }
                iVar3.mo472b(z);
            }
            mo597k();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ArrayList<Fragment> mo598l() {
        ArrayList<Fragment> arrayList = null;
        if (this.f460l != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f460l.size()) {
                    break;
                }
                Fragment fragment = this.f460l.get(i2);
                if (fragment != null && fragment.mRetainInstance) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    fragment.mRetaining = true;
                    fragment.mTargetIndex = fragment.mTarget != null ? fragment.mTarget.mIndex : -1;
                    if (f445b) {
                        Log.v(f446c, "retainNonConfig: keeping retained " + fragment);
                    }
                }
                i = i2 + 1;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo593f(Fragment fragment) {
        if (fragment.mInnerView != null) {
            if (this.f455D == null) {
                this.f455D = new SparseArray<>();
            } else {
                this.f455D.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.f455D);
            if (this.f455D.size() > 0) {
                fragment.mSavedViewState = this.f455D;
                this.f455D = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Bundle mo594g(Fragment fragment) {
        Bundle bundle;
        if (this.f454C == null) {
            this.f454C = new Bundle();
        }
        fragment.performSaveInstanceState(this.f454C);
        if (!this.f454C.isEmpty()) {
            bundle = this.f454C;
            this.f454C = null;
        } else {
            bundle = null;
        }
        if (fragment.mView != null) {
            mo593f(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f450g, fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f451h, fragment.mUserVisibleHint);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Parcelable mo599m() {
        int[] iArr;
        int size;
        int size2;
        boolean z;
        BackStackState[] backStackStateArr = null;
        mo596j();
        if (f447d) {
            this.f473y = true;
        }
        if (this.f460l == null || this.f460l.size() <= 0) {
            return null;
        }
        int size3 = this.f460l.size();
        FragmentState[] fragmentStateArr = new FragmentState[size3];
        int i = 0;
        boolean z2 = false;
        while (i < size3) {
            Fragment fragment = this.f460l.get(i);
            if (fragment != null) {
                if (fragment.mIndex < 0) {
                    m690a((RuntimeException) new IllegalStateException("Failure saving state: active " + fragment + " has cleared index: " + fragment.mIndex));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.mState <= 0 || fragmentState.f52j != null) {
                    fragmentState.f52j = fragment.mSavedFragmentState;
                } else {
                    fragmentState.f52j = mo594g(fragment);
                    if (fragment.mTarget != null) {
                        if (fragment.mTarget.mIndex < 0) {
                            m690a((RuntimeException) new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.mTarget));
                        }
                        if (fragmentState.f52j == null) {
                            fragmentState.f52j = new Bundle();
                        }
                        mo548a(fragmentState.f52j, f449f, fragment.mTarget);
                        if (fragment.mTargetRequestCode != 0) {
                            fragmentState.f52j.putInt(f448e, fragment.mTargetRequestCode);
                        }
                    }
                }
                if (f445b) {
                    Log.v(f446c, "Saved state of " + fragment + ": " + fragmentState.f52j);
                }
                z = true;
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        if (z2) {
            if (this.f461m == null || (size2 = this.f461m.size()) <= 0) {
                iArr = null;
            } else {
                iArr = new int[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    iArr[i2] = this.f461m.get(i2).mIndex;
                    if (iArr[i2] < 0) {
                        m690a((RuntimeException) new IllegalStateException("Failure saving state: active " + this.f461m.get(i2) + " has cleared index: " + iArr[i2]));
                    }
                    if (f445b) {
                        Log.v(f446c, "saveAllState: adding fragment #" + i2 + ": " + this.f461m.get(i2));
                    }
                }
            }
            if (this.f463o != null && (size = this.f463o.size()) > 0) {
                backStackStateArr = new BackStackState[size];
                for (int i3 = 0; i3 < size; i3++) {
                    backStackStateArr[i3] = new BackStackState(this, this.f463o.get(i3));
                    if (f445b) {
                        Log.v(f446c, "saveAllState: adding back stack #" + i3 + ": " + this.f463o.get(i3));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f40a = fragmentStateArr;
            fragmentManagerState.f41b = iArr;
            fragmentManagerState.f42c = backStackStateArr;
            return fragmentManagerState;
        } else if (!f445b) {
            return null;
        } else {
            Log.v(f446c, "saveAllState: no fragments!");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo570a(Parcelable parcelable, ArrayList<Fragment> arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f40a != null) {
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        Fragment fragment = arrayList.get(i);
                        if (f445b) {
                            Log.v(f446c, "restoreAllState: re-attaching retained " + fragment);
                        }
                        FragmentState fragmentState = fragmentManagerState.f40a[fragment.mIndex];
                        fragmentState.f53k = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        fragment.mTarget = null;
                        if (fragmentState.f52j != null) {
                            fragmentState.f52j.setClassLoader(this.f469u.getClassLoader());
                            fragment.mSavedViewState = fragmentState.f52j.getSparseParcelableArray(f450g);
                        }
                    }
                }
                this.f460l = new ArrayList<>(fragmentManagerState.f40a.length);
                if (this.f462n != null) {
                    this.f462n.clear();
                }
                for (int i2 = 0; i2 < fragmentManagerState.f40a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.f40a[i2];
                    if (fragmentState2 != null) {
                        Fragment a = fragmentState2.mo160a(this.f469u, this.f471w);
                        if (f445b) {
                            Log.v(f446c, "restoreAllState: active #" + i2 + ": " + a);
                        }
                        this.f460l.add(a);
                        fragmentState2.f53k = null;
                    } else {
                        this.f460l.add((Object) null);
                        if (this.f462n == null) {
                            this.f462n = new ArrayList<>();
                        }
                        if (f445b) {
                            Log.v(f446c, "restoreAllState: avail #" + i2);
                        }
                        this.f462n.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        Fragment fragment2 = arrayList.get(i3);
                        if (fragment2.mTargetIndex >= 0) {
                            if (fragment2.mTargetIndex < this.f460l.size()) {
                                fragment2.mTarget = this.f460l.get(fragment2.mTargetIndex);
                            } else {
                                Log.w(f446c, "Re-attaching retained fragment " + fragment2 + " target no longer exists: " + fragment2.mTargetIndex);
                                fragment2.mTarget = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.f41b != null) {
                    this.f461m = new ArrayList<>(fragmentManagerState.f41b.length);
                    for (int i4 = 0; i4 < fragmentManagerState.f41b.length; i4++) {
                        Fragment fragment3 = this.f460l.get(fragmentManagerState.f41b[i4]);
                        if (fragment3 == null) {
                            m690a((RuntimeException) new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f41b[i4]));
                        }
                        fragment3.mAdded = true;
                        if (f445b) {
                            Log.v(f446c, "restoreAllState: added #" + i4 + ": " + fragment3);
                        }
                        if (this.f461m.contains(fragment3)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f461m.add(fragment3);
                    }
                } else {
                    this.f461m = null;
                }
                if (fragmentManagerState.f42c != null) {
                    this.f463o = new ArrayList<>(fragmentManagerState.f42c.length);
                    for (int i5 = 0; i5 < fragmentManagerState.f42c.length; i5++) {
                        C0159i a2 = fragmentManagerState.f42c[i5].mo24a(this);
                        if (f445b) {
                            Log.v(f446c, "restoreAllState: back stack #" + i5 + " (index " + a2.f409x + "): " + a2);
                            a2.mo470a("  ", new PrintWriter(new C0304g(f446c)), false);
                        }
                        this.f463o.add(a2);
                        if (a2.f409x >= 0) {
                            mo567a(a2.f409x, a2);
                        }
                    }
                    return;
                }
                this.f463o = null;
            }
        }
    }

    /* renamed from: a */
    public void mo574a(C0167o oVar, C0172r rVar, Fragment fragment) {
        if (this.f469u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f469u = oVar;
        this.f470v = rVar;
        this.f471w = fragment;
    }

    /* renamed from: n */
    public void mo600n() {
        this.f473y = false;
    }

    /* renamed from: o */
    public void mo601o() {
        this.f473y = false;
        mo568a(1, false);
    }

    /* renamed from: p */
    public void mo602p() {
        this.f473y = false;
        mo568a(2, false);
    }

    /* renamed from: q */
    public void mo603q() {
        this.f473y = false;
        mo568a(4, false);
    }

    /* renamed from: r */
    public void mo604r() {
        this.f473y = false;
        mo568a(5, false);
    }

    /* renamed from: s */
    public void mo605s() {
        mo568a(4, false);
    }

    /* renamed from: t */
    public void mo606t() {
        this.f473y = true;
        mo568a(3, false);
    }

    /* renamed from: u */
    public void mo608u() {
        mo568a(2, false);
    }

    /* renamed from: v */
    public void mo609v() {
        mo568a(1, false);
    }

    /* renamed from: w */
    public void mo610w() {
        this.f474z = true;
        mo596j();
        mo568a(0, false);
        this.f469u = null;
        this.f470v = null;
        this.f471w = null;
    }

    /* renamed from: a */
    public void mo569a(Configuration configuration) {
        if (this.f461m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f461m.size()) {
                    Fragment fragment = this.f461m.get(i2);
                    if (fragment != null) {
                        fragment.performConfigurationChanged(configuration);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: x */
    public void mo611x() {
        if (this.f461m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f461m.size()) {
                    Fragment fragment = this.f461m.get(i2);
                    if (fragment != null) {
                        fragment.performLowMemory();
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo578a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        ArrayList<Fragment> arrayList = null;
        if (this.f461m != null) {
            int i = 0;
            z = false;
            while (i < this.f461m.size()) {
                Fragment fragment = this.f461m.get(i);
                if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                }
                i++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.f464p != null) {
            for (int i2 = 0; i2 < this.f464p.size(); i2++) {
                Fragment fragment2 = this.f464p.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f464p = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo577a(Menu menu) {
        if (this.f461m == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f461m.size(); i++) {
            Fragment fragment = this.f461m.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo579a(MenuItem menuItem) {
        if (this.f461m == null) {
            return false;
        }
        for (int i = 0; i < this.f461m.size(); i++) {
            Fragment fragment = this.f461m.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo585b(MenuItem menuItem) {
        if (this.f461m == null) {
            return false;
        }
        for (int i = 0; i < this.f461m.size(); i++) {
            Fragment fragment = this.f461m.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo584b(Menu menu) {
        if (this.f461m != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f461m.size()) {
                    Fragment fragment = this.f461m.get(i2);
                    if (fragment != null) {
                        fragment.performOptionsMenuClosed(menu);
                    }
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public static int m692d(int i) {
        switch (i) {
            case C0036E.f31G:
                return C0036E.f32H;
            case C0036E.f33I:
                return C0036E.f33I;
            case C0036E.f32H:
                return C0036E.f31G;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static int m691b(int i, boolean z) {
        switch (i) {
            case C0036E.f31G:
                return z ? 1 : 2;
            case C0036E.f33I:
                return z ? 5 : 6;
            case C0036E.f32H:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }
}
