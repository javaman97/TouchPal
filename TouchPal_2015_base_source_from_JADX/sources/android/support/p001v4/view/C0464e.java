package android.support.p001v4.view;

import android.support.p001v4.view.C0462d;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v4.view.e */
/* compiled from: AccessibilityDelegateCompatIcs */
final class C0464e extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C0462d.C0463a f1074a;

    C0464e(C0462d.C0463a aVar) {
        this.f1074a = aVar;
    }

    /* renamed from: a */
    public boolean mo1591a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1074a.mo1575a(view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo1593b(View view, AccessibilityEvent accessibilityEvent) {
        this.f1074a.mo1577b(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1590a(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1074a.mo1574a(view, (Object) accessibilityNodeInfo);
    }

    /* renamed from: c */
    public void mo1594c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1074a.mo1578c(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo1592a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1074a.mo1576a(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1589a(View view, int i) {
        this.f1074a.mo1573a(view, i);
    }

    /* renamed from: d */
    public void mo1595d(View view, AccessibilityEvent accessibilityEvent) {
        this.f1074a.mo1579d(view, accessibilityEvent);
    }
}
