package android.support.p001v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: android.support.v4.app.G */
/* compiled from: ListFragment */
public class C0045G extends Fragment {

    /* renamed from: a */
    static final int f68a = 16711681;

    /* renamed from: b */
    static final int f69b = 16711682;

    /* renamed from: c */
    static final int f70c = 16711683;

    /* renamed from: d */
    ListAdapter f71d;

    /* renamed from: e */
    ListView f72e;

    /* renamed from: f */
    View f73f;

    /* renamed from: g */
    TextView f74g;

    /* renamed from: h */
    View f75h;

    /* renamed from: i */
    View f76i;

    /* renamed from: j */
    CharSequence f77j;

    /* renamed from: k */
    boolean f78k;

    /* renamed from: l */
    private final Handler f79l = new Handler();

    /* renamed from: m */
    private final Runnable f80m = new C0046H(this);

    /* renamed from: n */
    private final AdapterView.OnItemClickListener f81n = new C0047I(this);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0167o activity = getActivity();
        FrameLayout frameLayout = new FrameLayout(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setId(f69b);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(activity, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setId(f70c);
        TextView textView = new TextView(getActivity());
        textView.setId(f68a);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(getActivity());
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m91e();
    }

    public void onDestroyView() {
        this.f79l.removeCallbacks(this.f80m);
        this.f72e = null;
        this.f78k = false;
        this.f76i = null;
        this.f75h = null;
        this.f73f = null;
        this.f74g = null;
        super.onDestroyView();
    }

    /* renamed from: a */
    public void mo179a(ListView listView, View view, int i, long j) {
    }

    /* renamed from: a */
    public void mo178a(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f71d != null;
        this.f71d = listAdapter;
        if (this.f72e != null) {
            this.f72e.setAdapter(listAdapter);
            if (!this.f78k && !z2) {
                if (getView().getWindowToken() != null) {
                    z = true;
                }
                m90a(true, z);
            }
        }
    }

    /* renamed from: a */
    public void mo177a(int i) {
        m91e();
        this.f72e.setSelection(i);
    }

    /* renamed from: a */
    public int mo176a() {
        m91e();
        return this.f72e.getSelectedItemPosition();
    }

    /* renamed from: b */
    public long mo182b() {
        m91e();
        return this.f72e.getSelectedItemId();
    }

    /* renamed from: c */
    public ListView mo184c() {
        m91e();
        return this.f72e;
    }

    /* renamed from: a */
    public void mo180a(CharSequence charSequence) {
        m91e();
        if (this.f74g == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        this.f74g.setText(charSequence);
        if (this.f77j == null) {
            this.f72e.setEmptyView(this.f74g);
        }
        this.f77j = charSequence;
    }

    /* renamed from: a */
    public void mo181a(boolean z) {
        m90a(z, true);
    }

    /* renamed from: b */
    public void mo183b(boolean z) {
        m90a(z, false);
    }

    /* renamed from: a */
    private void m90a(boolean z, boolean z2) {
        m91e();
        if (this.f75h == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f78k != z) {
            this.f78k = z;
            if (z) {
                if (z2) {
                    this.f75h.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432577));
                    this.f76i.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432576));
                } else {
                    this.f75h.clearAnimation();
                    this.f76i.clearAnimation();
                }
                this.f75h.setVisibility(8);
                this.f76i.setVisibility(0);
                return;
            }
            if (z2) {
                this.f75h.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432576));
                this.f76i.startAnimation(AnimationUtils.loadAnimation(getActivity(), 17432577));
            } else {
                this.f75h.clearAnimation();
                this.f76i.clearAnimation();
            }
            this.f75h.setVisibility(0);
            this.f76i.setVisibility(8);
        }
    }

    /* renamed from: d */
    public ListAdapter mo185d() {
        return this.f71d;
    }

    /* renamed from: e */
    private void m91e() {
        if (this.f72e == null) {
            View view = getView();
            if (view == null) {
                throw new IllegalStateException("Content view not yet created");
            }
            if (view instanceof ListView) {
                this.f72e = (ListView) view;
            } else {
                this.f74g = (TextView) view.findViewById(f68a);
                if (this.f74g == null) {
                    this.f73f = view.findViewById(16908292);
                } else {
                    this.f74g.setVisibility(8);
                }
                this.f75h = view.findViewById(f69b);
                this.f76i = view.findViewById(f70c);
                View findViewById = view.findViewById(16908298);
                if (findViewById instanceof ListView) {
                    this.f72e = (ListView) findViewById;
                    if (this.f73f != null) {
                        this.f72e.setEmptyView(this.f73f);
                    } else if (this.f77j != null) {
                        this.f74g.setText(this.f77j);
                        this.f72e.setEmptyView(this.f74g);
                    }
                } else if (findViewById == null) {
                    throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                } else {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
            }
            this.f78k = true;
            this.f72e.setOnItemClickListener(this.f81n);
            if (this.f71d != null) {
                ListAdapter listAdapter = this.f71d;
                this.f71d = null;
                mo178a(listAdapter);
            } else if (this.f75h != null) {
                m90a(false, false);
            }
            this.f79l.post(this.f80m);
        }
    }
}
