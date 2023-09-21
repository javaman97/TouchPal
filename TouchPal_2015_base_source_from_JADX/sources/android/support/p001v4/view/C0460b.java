package android.support.p001v4.view;

import android.support.p001v4.view.C0399a;
import android.support.p001v4.view.C0462d;
import android.support.p001v4.view.p017a.C0418g;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.b */
/* compiled from: AccessibilityDelegateCompat */
class C0460b implements C0462d.C0463a {

    /* renamed from: a */
    final /* synthetic */ C0399a f1070a;

    /* renamed from: b */
    final /* synthetic */ C0399a.C0400a f1071b;

    C0460b(C0399a.C0400a aVar, C0399a aVar2) {
        this.f1071b = aVar;
        this.f1070a = aVar2;
    }

    /* renamed from: a */
    public boolean mo1575a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1070a.mo1301b(view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo1577b(View view, AccessibilityEvent accessibilityEvent) {
        this.f1070a.mo1223d(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1574a(View view, Object obj) {
        this.f1070a.mo1221a(view, new C0418g(obj));
    }

    /* renamed from: c */
    public void mo1578c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1070a.mo1302c(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo1576a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1070a.mo1300a(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1573a(View view, int i) {
        this.f1070a.mo1298a(view, i);
    }

    /* renamed from: d */
    public void mo1579d(View view, AccessibilityEvent accessibilityEvent) {
        this.f1070a.mo1299a(view, accessibilityEvent);
    }
}
