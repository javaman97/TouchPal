package com.p023a.p024a.p032b.p039f;

import android.widget.AbsListView;
import com.p023a.p024a.p032b.C0778d;

/* renamed from: com.a.a.b.f.c */
/* compiled from: PauseOnScrollListener */
public class C0797c implements AbsListView.OnScrollListener {

    /* renamed from: a */
    private C0778d f2065a;

    /* renamed from: b */
    private final boolean f2066b;

    /* renamed from: c */
    private final boolean f2067c;

    /* renamed from: d */
    private final AbsListView.OnScrollListener f2068d;

    public C0797c(C0778d dVar, boolean z, boolean z2) {
        this(dVar, z, z2, (AbsListView.OnScrollListener) null);
    }

    public C0797c(C0778d dVar, boolean z, boolean z2, AbsListView.OnScrollListener onScrollListener) {
        this.f2065a = dVar;
        this.f2066b = z;
        this.f2067c = z2;
        this.f2068d = onScrollListener;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        switch (i) {
            case 0:
                this.f2065a.mo2932j();
                break;
            case 1:
                if (this.f2066b) {
                    this.f2065a.mo2931i();
                    break;
                }
                break;
            case 2:
                if (this.f2067c) {
                    this.f2065a.mo2931i();
                    break;
                }
                break;
        }
        if (this.f2068d != null) {
            this.f2068d.onScrollStateChanged(absListView, i);
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.f2068d != null) {
            this.f2068d.onScroll(absListView, i, i2, i3);
        }
    }
}
