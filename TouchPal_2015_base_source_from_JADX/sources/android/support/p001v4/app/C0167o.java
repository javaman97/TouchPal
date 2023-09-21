package android.support.p001v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.p001v4.p016k.C0317l;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.o */
/* compiled from: FragmentActivity */
public class C0167o extends Activity {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    private static final int HONEYCOMB = 11;
    static final int MSG_REALLY_STOPPED = 1;
    static final int MSG_RESUME_PENDING = 2;
    private static final String TAG = "FragmentActivity";
    C0317l<String, C0050K> mAllLoaderManagers;
    boolean mCheckedForLoaderManager;
    final C0172r mContainer = new C0171q(this);
    boolean mCreated;
    final C0176t mFragments = new C0176t();
    final Handler mHandler = new C0170p(this);
    C0050K mLoaderManager;
    boolean mLoadersStarted;
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;

    /* renamed from: android.support.v4.app.o$b */
    /* compiled from: FragmentActivity */
    static final class C0169b {

        /* renamed from: a */
        Object f426a;

        /* renamed from: b */
        Object f427b;

        /* renamed from: c */
        C0317l<String, Object> f428c;

        /* renamed from: d */
        ArrayList<Fragment> f429d;

        /* renamed from: e */
        C0317l<String, C0050K> f430e;

        C0169b() {
        }
    }

    /* renamed from: android.support.v4.app.o$a */
    /* compiled from: FragmentActivity */
    static class C0168a {

        /* renamed from: a */
        public static final int[] f422a = {16842755, 16842960, 16842961};

        /* renamed from: b */
        public static final int f423b = 1;

        /* renamed from: c */
        public static final int f424c = 0;

        /* renamed from: d */
        public static final int f425d = 2;

        C0168a() {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo600n();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            if (this.mFragments.f460l == null || i4 < 0 || i4 >= this.mFragments.f460l.size()) {
                Log.w(TAG, "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
                return;
            }
            Fragment fragment = this.mFragments.f460l.get(i4);
            if (fragment == null) {
                Log.w(TAG, "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
            } else {
                fragment.onActivityResult(65535 & i, i2, intent);
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        if (!this.mFragments.mo559e()) {
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo569a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ArrayList<Fragment> arrayList;
        this.mFragments.mo574a(this, this.mContainer, (Fragment) null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        C0169b bVar = (C0169b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.mAllLoaderManagers = bVar.f430e;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable(FRAGMENTS_TAG);
            C0176t tVar = this.mFragments;
            if (bVar != null) {
                arrayList = bVar.f429d;
            } else {
                arrayList = null;
            }
            tVar.mo570a(parcelable, arrayList);
        }
        this.mFragments.mo601o();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu) | this.mFragments.mo578a(menu, getMenuInflater());
        if (Build.VERSION.SDK_INT >= 11) {
            return onCreatePanelMenu;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.support.v4.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: android.support.v4.app.Fragment} */
    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.support.v4.app.Fragment, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(java.lang.String r10, @android.support.p000a.C0016q android.content.Context r11, @android.support.p000a.C0016q android.util.AttributeSet r12) {
        /*
            r9 = this;
            r3 = 0
            r1 = 0
            r8 = 1
            r6 = -1
            java.lang.String r0 = "fragment"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0011
            android.view.View r0 = super.onCreateView(r10, r11, r12)
        L_0x0010:
            return r0
        L_0x0011:
            java.lang.String r0 = "class"
            java.lang.String r0 = r12.getAttributeValue(r1, r0)
            int[] r2 = android.support.p001v4.app.C0167o.C0168a.f422a
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r12, r2)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = r4.getString(r3)
        L_0x0023:
            int r2 = r4.getResourceId(r8, r6)
            r5 = 2
            java.lang.String r5 = r4.getString(r5)
            r4.recycle()
            boolean r4 = android.support.p001v4.app.Fragment.isSupportFragmentClass(r9, r0)
            if (r4 != 0) goto L_0x003a
            android.view.View r0 = super.onCreateView(r10, r11, r12)
            goto L_0x0010
        L_0x003a:
            if (r1 == 0) goto L_0x0040
            int r3 = r1.getId()
        L_0x0040:
            if (r3 != r6) goto L_0x0067
            if (r2 != r6) goto L_0x0067
            if (r5 != 0) goto L_0x0067
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.getPositionDescription()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0067:
            if (r2 == r6) goto L_0x006f
            android.support.v4.app.t r1 = r9.mFragments
            android.support.v4.app.Fragment r1 = r1.mo544a((int) r2)
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            if (r5 == 0) goto L_0x0079
            android.support.v4.app.t r1 = r9.mFragments
            android.support.v4.app.Fragment r1 = r1.mo546a((java.lang.String) r5)
        L_0x0079:
            if (r1 != 0) goto L_0x0083
            if (r3 == r6) goto L_0x0083
            android.support.v4.app.t r1 = r9.mFragments
            android.support.v4.app.Fragment r1 = r1.mo544a((int) r3)
        L_0x0083:
            boolean r4 = android.support.p001v4.app.C0176t.f445b
            if (r4 == 0) goto L_0x00b7
            java.lang.String r4 = "FragmentActivity"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onCreateView: id=0x"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = " fname="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = " existing="
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r4, r6)
        L_0x00b7:
            if (r1 != 0) goto L_0x00fe
            android.support.v4.app.Fragment r4 = android.support.p001v4.app.Fragment.instantiate(r9, r0)
            r4.mFromLayout = r8
            if (r2 == 0) goto L_0x00fc
            r1 = r2
        L_0x00c2:
            r4.mFragmentId = r1
            r4.mContainerId = r3
            r4.mTag = r5
            r4.mInLayout = r8
            android.support.v4.app.t r1 = r9.mFragments
            r4.mFragmentManager = r1
            android.os.Bundle r1 = r4.mSavedFragmentState
            r4.onInflate(r9, r12, r1)
            android.support.v4.app.t r1 = r9.mFragments
            r1.mo573a((android.support.p001v4.app.Fragment) r4, (boolean) r8)
            r1 = r4
        L_0x00d9:
            android.view.View r3 = r1.mView
            if (r3 != 0) goto L_0x015a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " did not create a view."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00fc:
            r1 = r3
            goto L_0x00c2
        L_0x00fe:
            boolean r4 = r1.mInLayout
            if (r4 == 0) goto L_0x0149
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r12.getPositionDescription()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r6 = ": Duplicate id 0x"
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ", tag "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r4 = ", or parent id 0x"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " with another fragment for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0149:
            r1.mInLayout = r8
            boolean r3 = r1.mRetaining
            if (r3 != 0) goto L_0x0154
            android.os.Bundle r3 = r1.mSavedFragmentState
            r1.onInflate(r9, r12, r3)
        L_0x0154:
            android.support.v4.app.t r3 = r9.mFragments
            r3.mo587c((android.support.p001v4.app.Fragment) r1)
            goto L_0x00d9
        L_0x015a:
            if (r2 == 0) goto L_0x0161
            android.view.View r0 = r1.mView
            r0.setId(r2)
        L_0x0161:
            android.view.View r0 = r1.mView
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L_0x016e
            android.view.View r0 = r1.mView
            r0.setTag(r5)
        L_0x016e:
            android.view.View r0 = r1.mView
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.app.C0167o.onCreateView(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        doReallyStop(false);
        this.mFragments.mo610w();
        if (this.mLoaderManager != null) {
            this.mLoaderManager.mo205h();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.mo611x();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.mFragments.mo579a(menuItem);
            case 6:
                return this.mFragments.mo585b(menuItem);
            default:
                return false;
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.mFragments.mo584b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        if (this.mHandler.hasMessages(2)) {
            this.mHandler.removeMessages(2);
            onResumeFragments();
        }
        this.mFragments.mo605s();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo600n();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.mo596j();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.mo596j();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragments.mo604r();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.mOptionsMenuInvalidated) {
            this.mOptionsMenuInvalidated = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return onPrepareOptionsPanel(view, menu) | this.mFragments.mo577a(menu);
    }

    /* access modifiers changed from: protected */
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        boolean z;
        if (this.mStopped) {
            doReallyStop(true);
        }
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ArrayList<Fragment> l = this.mFragments.mo598l();
        if (this.mAllLoaderManagers != null) {
            int size = this.mAllLoaderManagers.size();
            C0050K[] kArr = new C0050K[size];
            for (int i = size - 1; i >= 0; i--) {
                kArr[i] = this.mAllLoaderManagers.mo999c(i);
            }
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C0050K k = kArr[i2];
                if (k.f91h) {
                    z = true;
                } else {
                    k.mo205h();
                    this.mAllLoaderManagers.remove(k.f88e);
                }
            }
        } else {
            z = false;
        }
        if (l == null && !z && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0169b bVar = new C0169b();
        bVar.f426a = null;
        bVar.f427b = onRetainCustomNonConfigurationInstance;
        bVar.f428c = null;
        bVar.f429d = l;
        bVar.f430e = this.mAllLoaderManagers;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable m = this.mFragments.mo599m();
        if (m != null) {
            bundle.putParcelable(FRAGMENTS_TAG, m);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.mStopped = false;
        this.mReallyStopped = false;
        this.mHandler.removeMessages(1);
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.mo602p();
        }
        this.mFragments.mo600n();
        this.mFragments.mo596j();
        if (!this.mLoadersStarted) {
            this.mLoadersStarted = true;
            if (this.mLoaderManager != null) {
                this.mLoaderManager.mo199b();
            } else if (!this.mCheckedForLoaderManager) {
                this.mLoaderManager = getLoaderManager("(root)", this.mLoadersStarted, false);
                if (this.mLoaderManager != null && !this.mLoaderManager.f90g) {
                    this.mLoaderManager.mo199b();
                }
            }
            this.mCheckedForLoaderManager = true;
        }
        this.mFragments.mo603q();
        if (this.mAllLoaderManagers != null) {
            int size = this.mAllLoaderManagers.size();
            C0050K[] kArr = new C0050K[size];
            for (int i = size - 1; i >= 0; i--) {
                kArr[i] = this.mAllLoaderManagers.mo999c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0050K k = kArr[i2];
                k.mo202e();
                k.mo204g();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        this.mHandler.sendEmptyMessage(1);
        this.mFragments.mo606t();
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0169b bVar = (C0169b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f427b;
        }
        return null;
    }

    public void supportInvalidateOptionsMenu() {
        if (Build.VERSION.SDK_INT >= 11) {
            C0154e.m595a(this);
        } else {
            this.mOptionsMenuInvalidated = true;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 11) {
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print("mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.mReallyStopped);
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.mLoadersStarted);
        if (this.mLoaderManager != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.mLoaderManager)));
            printWriter.println(":");
            this.mLoaderManager.mo190a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        this.mFragments.mo551a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        dumpViewHierarchy(str + "  ", printWriter, getWindow().getDecorView());
    }

    private static String viewToString(View view) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        String str;
        char c8 = 'F';
        char c9 = '.';
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        switch (view.getVisibility()) {
            case 0:
                sb.append('V');
                break;
            case 4:
                sb.append('I');
                break;
            case 8:
                sb.append('G');
                break;
            default:
                sb.append('.');
                break;
        }
        if (view.isFocusable()) {
            c = 'F';
        } else {
            c = '.';
        }
        sb.append(c);
        if (view.isEnabled()) {
            c2 = 'E';
        } else {
            c2 = '.';
        }
        sb.append(c2);
        sb.append(view.willNotDraw() ? '.' : 'D');
        if (view.isHorizontalScrollBarEnabled()) {
            c3 = 'H';
        } else {
            c3 = '.';
        }
        sb.append(c3);
        if (view.isVerticalScrollBarEnabled()) {
            c4 = 'V';
        } else {
            c4 = '.';
        }
        sb.append(c4);
        if (view.isClickable()) {
            c5 = 'C';
        } else {
            c5 = '.';
        }
        sb.append(c5);
        if (view.isLongClickable()) {
            c6 = 'L';
        } else {
            c6 = '.';
        }
        sb.append(c6);
        sb.append(' ');
        if (!view.isFocused()) {
            c8 = '.';
        }
        sb.append(c8);
        if (view.isSelected()) {
            c7 = 'S';
        } else {
            c7 = '.';
        }
        sb.append(c7);
        if (view.isPressed()) {
            c9 = 'P';
        }
        sb.append(c9);
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = PresentConfigXmlTag.FEATURE_ATTR_SENSITIVE_APPS;
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (Resources.NotFoundException e) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                sb.append(" ");
                sb.append(str);
                sb.append(":");
                sb.append(resourceTypeName);
                sb.append("/");
                sb.append(resourceEntryName);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private void dumpViewHierarchy(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(viewToString(view));
        if ((view instanceof ViewGroup) && (childCount = viewGroup.getChildCount()) > 0) {
            String str2 = str + "  ";
            for (int i = 0; i < childCount; i++) {
                dumpViewHierarchy(str2, printWriter, (viewGroup = (ViewGroup) view).getChildAt(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void doReallyStop(boolean z) {
        if (!this.mReallyStopped) {
            this.mReallyStopped = true;
            this.mRetaining = z;
            this.mHandler.removeMessages(1);
            onReallyStop();
        }
    }

    /* access modifiers changed from: package-private */
    public void onReallyStop() {
        if (this.mLoadersStarted) {
            this.mLoadersStarted = false;
            if (this.mLoaderManager != null) {
                if (!this.mRetaining) {
                    this.mLoaderManager.mo200c();
                } else {
                    this.mLoaderManager.mo201d();
                }
            }
        }
        this.mFragments.mo608u();
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public C0173s getSupportFragmentManager() {
        return this.mFragments;
    }

    public void startActivityForResult(Intent intent, int i) {
        if (i == -1 || (-65536 & i) == 0) {
            super.startActivityForResult(intent, i);
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        if (i == -1) {
            super.startActivityForResult(intent, -1);
        } else if ((-65536 & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else {
            super.startActivityForResult(intent, ((fragment.mIndex + 1) << 16) + (65535 & i));
        }
    }

    /* access modifiers changed from: package-private */
    public void invalidateSupportFragment(String str) {
        C0050K k;
        if (this.mAllLoaderManagers != null && (k = this.mAllLoaderManagers.get(str)) != null && !k.f91h) {
            k.mo205h();
            this.mAllLoaderManagers.remove(str);
        }
    }

    public C0048J getSupportLoaderManager() {
        if (this.mLoaderManager != null) {
            return this.mLoaderManager;
        }
        this.mCheckedForLoaderManager = true;
        this.mLoaderManager = getLoaderManager("(root)", this.mLoadersStarted, true);
        return this.mLoaderManager;
    }

    /* access modifiers changed from: package-private */
    public C0050K getLoaderManager(String str, boolean z, boolean z2) {
        if (this.mAllLoaderManagers == null) {
            this.mAllLoaderManagers = new C0317l<>();
        }
        C0050K k = this.mAllLoaderManagers.get(str);
        if (k != null) {
            k.mo198a(this);
            return k;
        } else if (!z2) {
            return k;
        } else {
            C0050K k2 = new C0050K(str, this, z);
            this.mAllLoaderManagers.put(str, k2);
            return k2;
        }
    }
}
