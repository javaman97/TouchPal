package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.dynamic.a */
public abstract class C3541a<T extends LifecycleDelegate> {
    /* access modifiers changed from: private */

    /* renamed from: cP */
    public T f15313cP;
    /* access modifiers changed from: private */

    /* renamed from: cQ */
    public Bundle f15314cQ;
    /* access modifiers changed from: private */

    /* renamed from: cR */
    public LinkedList<C3548a> f15315cR;

    /* renamed from: cS */
    private final C3553d<T> f15316cS = new C3553d<T>() {
        /* renamed from: a */
        public void mo11052a(T t) {
            LifecycleDelegate unused = C3541a.this.f15313cP = t;
            Iterator it = C3541a.this.f15315cR.iterator();
            while (it.hasNext()) {
                ((C3548a) it.next()).mo11053b(C3541a.this.f15313cP);
            }
            C3541a.this.f15315cR.clear();
            Bundle unused2 = C3541a.this.f15314cQ = null;
        }
    };

    /* renamed from: com.google.android.gms.dynamic.a$a */
    private interface C3548a {
        /* renamed from: b */
        void mo11053b(LifecycleDelegate lifecycleDelegate);

        int getState();
    }

    /* renamed from: a */
    private void m15476a(Bundle bundle, C3548a aVar) {
        if (this.f15313cP != null) {
            aVar.mo11053b(this.f15313cP);
            return;
        }
        if (this.f15315cR == null) {
            this.f15315cR = new LinkedList<>();
        }
        this.f15315cR.add(aVar);
        if (bundle != null) {
            if (this.f15314cQ == null) {
                this.f15314cQ = (Bundle) bundle.clone();
            } else {
                this.f15314cQ.putAll(bundle);
            }
        }
        mo11041a(this.f15316cS);
    }

    /* renamed from: y */
    private void m15478y(int i) {
        while (!this.f15315cR.isEmpty() && this.f15315cR.getLast().getState() >= i) {
            this.f15315cR.removeLast();
        }
    }

    /* renamed from: a */
    public void mo11040a(FrameLayout frameLayout) {
        final Context context = frameLayout.getContext();
        final int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String b = GooglePlayServicesUtil.m15338b(context, isGooglePlayServicesAvailable, -1);
        String a = GooglePlayServicesUtil.m15334a(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        if (a != null) {
            Button button = new Button(context);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(a);
            linearLayout.addView(button);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    context.startActivity(GooglePlayServicesUtil.m15333a(context, isGooglePlayServicesAvailable, -1));
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11041a(C3553d<T> dVar);

    /* renamed from: at */
    public T mo11042at() {
        return this.f15313cP;
    }

    public void onCreate(final Bundle bundle) {
        m15476a(bundle, (C3548a) new C3548a() {
            /* renamed from: b */
            public void mo11053b(LifecycleDelegate lifecycleDelegate) {
                C3541a.this.f15313cP.onCreate(bundle);
            }

            public int getState() {
                return 1;
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        final LayoutInflater layoutInflater2 = layoutInflater;
        final ViewGroup viewGroup2 = viewGroup;
        final Bundle bundle2 = bundle;
        m15476a(bundle, (C3548a) new C3548a() {
            /* renamed from: b */
            public void mo11053b(LifecycleDelegate lifecycleDelegate) {
                frameLayout.removeAllViews();
                frameLayout.addView(C3541a.this.f15313cP.onCreateView(layoutInflater2, viewGroup2, bundle2));
            }

            public int getState() {
                return 2;
            }
        });
        if (this.f15313cP == null) {
            mo11040a(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        if (this.f15313cP != null) {
            this.f15313cP.onDestroy();
        } else {
            m15478y(1);
        }
    }

    public void onDestroyView() {
        if (this.f15313cP != null) {
            this.f15313cP.onDestroyView();
        } else {
            m15478y(2);
        }
    }

    public void onInflate(final Activity activity, final Bundle bundle, final Bundle bundle2) {
        m15476a(bundle2, (C3548a) new C3548a() {
            /* renamed from: b */
            public void mo11053b(LifecycleDelegate lifecycleDelegate) {
                C3541a.this.f15313cP.onInflate(activity, bundle, bundle2);
            }

            public int getState() {
                return 0;
            }
        });
    }

    public void onLowMemory() {
        if (this.f15313cP != null) {
            this.f15313cP.onLowMemory();
        }
    }

    public void onPause() {
        if (this.f15313cP != null) {
            this.f15313cP.onPause();
        } else {
            m15478y(3);
        }
    }

    public void onResume() {
        m15476a((Bundle) null, (C3548a) new C3548a() {
            /* renamed from: b */
            public void mo11053b(LifecycleDelegate lifecycleDelegate) {
                C3541a.this.f15313cP.onResume();
            }

            public int getState() {
                return 3;
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.f15313cP != null) {
            this.f15313cP.onSaveInstanceState(bundle);
        } else if (this.f15314cQ != null) {
            bundle.putAll(this.f15314cQ);
        }
    }
}
