package android.support.p001v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.FragmentTabHost */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C0044b> f54a = new ArrayList<>();

    /* renamed from: b */
    private FrameLayout f55b;

    /* renamed from: c */
    private Context f56c;

    /* renamed from: d */
    private C0173s f57d;

    /* renamed from: e */
    private int f58e;

    /* renamed from: f */
    private TabHost.OnTabChangeListener f59f;

    /* renamed from: g */
    private C0044b f60g;

    /* renamed from: h */
    private boolean f61h;

    /* renamed from: android.support.v4.app.FragmentTabHost$b */
    static final class C0044b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f64a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Class<?> f65b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Bundle f66c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Fragment f67d;

        C0044b(String str, Class<?> cls, Bundle bundle) {
            this.f64a = str;
            this.f65b = cls;
            this.f66c = bundle;
        }
    }

    /* renamed from: android.support.v4.app.FragmentTabHost$a */
    static class C0043a implements TabHost.TabContentFactory {

        /* renamed from: a */
        private final Context f63a;

        public C0043a(Context context) {
            this.f63a = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.f63a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: android.support.v4.app.FragmentTabHost$SavedState */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0035D();

        /* renamed from: a */
        String f62a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f62a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f62a);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f62a + "}";
        }
    }

    public FragmentTabHost(Context context) {
        super(context, (AttributeSet) null);
        m81a(context, (AttributeSet) null);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m81a(context, attributeSet);
    }

    /* renamed from: a */
    private void m81a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f58e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* renamed from: a */
    private void m80a(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f55b = frameLayout2;
            this.f55b.setId(this.f58e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    /* renamed from: a */
    public void mo163a(Context context, C0173s sVar) {
        m80a(context);
        super.setup();
        this.f56c = context;
        this.f57d = sVar;
        m79a();
    }

    /* renamed from: a */
    public void mo164a(Context context, C0173s sVar, int i) {
        m80a(context);
        super.setup();
        this.f56c = context;
        this.f57d = sVar;
        this.f58e = i;
        m79a();
        this.f55b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    /* renamed from: a */
    private void m79a() {
        if (this.f55b == null) {
            this.f55b = (FrameLayout) findViewById(this.f58e);
            if (this.f55b == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f58e);
            }
        }
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f59f = onTabChangeListener;
    }

    /* renamed from: a */
    public void mo165a(TabHost.TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new C0043a(this.f56c));
        String tag = tabSpec.getTag();
        C0044b bVar = new C0044b(tag, cls, bundle);
        if (this.f61h) {
            Fragment unused = bVar.f67d = this.f57d.mo546a(tag);
            if (bVar.f67d != null && !bVar.f67d.isDetached()) {
                C0036E a = this.f57d.mo542a();
                a.mo49d(bVar.f67d);
                a.mo53h();
            }
        }
        this.f54a.add(bVar);
        addTab(tabSpec);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        C0036E e = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f54a.size()) {
                break;
            }
            C0044b bVar = this.f54a.get(i2);
            Fragment unused = bVar.f67d = this.f57d.mo546a(bVar.f64a);
            if (bVar.f67d != null && !bVar.f67d.isDetached()) {
                if (bVar.f64a.equals(currentTabTag)) {
                    this.f60g = bVar;
                } else {
                    if (e == null) {
                        e = this.f57d.mo542a();
                    }
                    e.mo49d(bVar.f67d);
                }
            }
            i = i2 + 1;
        }
        this.f61h = true;
        C0036E a = m78a(currentTabTag, e);
        if (a != null) {
            a.mo53h();
            this.f57d.mo557c();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f61h = false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f62a = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f62a);
    }

    public void onTabChanged(String str) {
        C0036E a;
        if (this.f61h && (a = m78a(str, (C0036E) null)) != null) {
            a.mo53h();
        }
        if (this.f59f != null) {
            this.f59f.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private C0036E m78a(String str, C0036E e) {
        C0044b bVar = null;
        int i = 0;
        while (i < this.f54a.size()) {
            C0044b bVar2 = this.f54a.get(i);
            if (!bVar2.f64a.equals(str)) {
                bVar2 = bVar;
            }
            i++;
            bVar = bVar2;
        }
        if (bVar == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f60g != bVar) {
            if (e == null) {
                e = this.f57d.mo542a();
            }
            if (!(this.f60g == null || this.f60g.f67d == null)) {
                e.mo49d(this.f60g.f67d);
            }
            if (bVar != null) {
                if (bVar.f67d == null) {
                    Fragment unused = bVar.f67d = Fragment.instantiate(this.f56c, bVar.f65b.getName(), bVar.f66c);
                    e.mo36a(this.f58e, bVar.f67d, bVar.f64a);
                } else {
                    e.mo50e(bVar.f67d);
                }
            }
            this.f60g = bVar;
        }
        return e;
    }
}
