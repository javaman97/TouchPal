package android.support.p001v4.view;

import android.os.Bundle;
import android.support.p001v4.view.C0465f;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.g */
/* compiled from: AccessibilityDelegateCompatJellyBean */
final class C0467g extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ C0465f.C0466a f1075a;

    C0467g(C0465f.C0466a aVar) {
        this.f1075a = aVar;
    }

    /* renamed from: a */
    public boolean mo1600a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1075a.mo1584a(view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo1602b(View view, AccessibilityEvent accessibilityEvent) {
        this.f1075a.mo1586b(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1598a(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1075a.mo1582a(view, (Object) accessibilityNodeInfo);
    }

    /* renamed from: c */
    public void mo1603c(View view, AccessibilityEvent accessibilityEvent) {
        this.f1075a.mo1587c(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo1601a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1075a.mo1585a(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo1597a(View view, int i) {
        this.f1075a.mo1581a(view, i);
    }

    /* renamed from: d */
    public void mo1604d(View view, AccessibilityEvent accessibilityEvent) {
        this.f1075a.mo1588d(view, accessibilityEvent);
    }

    /* renamed from: a */
    public AccessibilityNodeProvider mo1596a(View view) {
        return (AccessibilityNodeProvider) this.f1075a.mo1580a(view);
    }

    /* renamed from: a */
    public boolean mo1599a(View view, int i, Bundle bundle) {
        return this.f1075a.mo1583a(view, i, bundle);
    }
}
