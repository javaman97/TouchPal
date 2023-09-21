package com.cootek.smartinput5.p066ui;

import android.widget.AbsListView;

/* renamed from: com.cootek.smartinput5.ui.cD */
/* compiled from: SymGridView */
class C2780cD implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ SymGridView f12378a;

    C2780cD(SymGridView symGridView) {
        this.f12378a = symGridView;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 0) {
            int unused = this.f12378a.f11629x = this.f12378a.getFirstVisiblePosition();
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = false;
        int a = this.f12378a.getTopOffset();
        if (a != this.f12378a.f11603B) {
            boolean unused = this.f12378a.f11604C = this.f12378a.f11603B > a;
            int unused2 = this.f12378a.f11603B = a;
        }
        if (this.f12378a.f11629x != i) {
            SymGridView symGridView = this.f12378a;
            if (this.f12378a.f11629x > i) {
                z = true;
            }
            boolean unused3 = symGridView.f11604C = z;
            int unused4 = this.f12378a.f11629x = i;
            if (i <= 0) {
                this.f12378a.m11956a(1);
            } else if (i + i2 > this.f12378a.f11623r) {
                this.f12378a.m11956a(this.f12378a.f11627v);
            } else {
                this.f12378a.m11956a((((this.f12378a.f11629x + 2) + 1) / 4) + 1);
            }
        }
    }
}
