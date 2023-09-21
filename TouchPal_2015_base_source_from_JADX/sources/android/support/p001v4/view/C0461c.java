package android.support.p001v4.view;

import android.os.Bundle;
import android.support.p001v4.view.C0399a;
import android.support.p001v4.view.C0465f;
import android.support.p001v4.view.p017a.C0418g;
import android.support.p001v4.view.p017a.C0429l;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.c */
/* compiled from: AccessibilityDelegateCompat */
class C0461c implements C0465f.C0466a {

    /* renamed from: a */
    final /* synthetic */ C0399a f1072a;

    /* renamed from: b */
    final /* synthetic */ C0399a.C0402c f1073b;

    C0461c(C0399a.C0402c cVar, C0399a aVar) {
        this.f1073b = cVar;
        this.f1072a = aVar;
    }

    /* renamed from: a */
    public boolean mo1584a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1072a.mo1301b(view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo1586b(View view, AccessibilityEvent accessibilityEvent) {
        this.f1072a.mo1223d(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1582a(View view, Object obj) {
        this.f1072a.mo1221a(view, new C0418g(obj));
    }

    /* renamed from: c */
    public void mo1587c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1072a.mo1302c(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo1585a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1072a.mo1300a(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1581a(View view, int i) {
        this.f1072a.mo1298a(view, i);
    }

    /* renamed from: d */
    public void mo1588d(View view, AccessibilityEvent accessibilityEvent) {
        this.f1072a.mo1299a(view, accessibilityEvent);
    }

    /* renamed from: a */
    public Object mo1580a(View view) {
        C0429l a = this.f1072a.mo1296a(view);
        if (a != null) {
            return a.mo1455a();
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo1583a(View view, int i, Bundle bundle) {
        return this.f1072a.mo1222a(view, i, bundle);
    }
}
