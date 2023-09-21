package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.view.C0333F;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.cootek.smartinput5.ui.e */
/* compiled from: AnimTextPopup */
public class C2919e {

    /* renamed from: j */
    private static final int f13206j = 0;

    /* renamed from: k */
    private static final int f13207k = 1;

    /* renamed from: a */
    private int f13208a;

    /* renamed from: b */
    private final int f13209b;

    /* renamed from: c */
    private int f13210c;

    /* renamed from: d */
    private int f13211d = C0333F.f834r;

    /* renamed from: e */
    private float f13212e;

    /* renamed from: f */
    private Context f13213f;

    /* renamed from: g */
    private View f13214g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayList<C2921g> f13215h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public LinkedList<C2921g> f13216i;

    /* renamed from: l */
    private Handler f13217l = new C2920f(this);

    public C2919e(Context context, View view, int i, int i2) {
        this.f13213f = context;
        this.f13214g = view;
        this.f13210c = i;
        this.f13209b = i2;
        this.f13215h = new ArrayList<>();
        this.f13216i = new LinkedList<>();
    }

    /* renamed from: a */
    public void mo9671a(int i, float f) {
        this.f13211d = i;
        this.f13212e = f;
    }

    /* renamed from: a */
    public void mo9674a(String str, int i, int i2) {
        mo9675a(str, i, i2, -1, -1);
    }

    /* renamed from: a */
    public void mo9672a(Drawable drawable, int i, int i2, int i3, int i4) {
        mo9673a(drawable, "", i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo9675a(String str, int i, int i2, int i3, int i4) {
        mo9673a((Drawable) null, str, i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo9673a(Drawable drawable, String str, int i, int i2, int i3, int i4) {
        C2921g d = m13483d();
        d.mo9679a().setText(str);
        d.mo9679a().setBackgroundDrawable(drawable);
        if (i3 > 0) {
            d.mo9679a().setWidth(i3);
            d.setWidth(i3);
        }
        if (i4 > 0) {
            d.mo9679a().setHeight(i4);
            d.setHeight(i4);
        }
        d.mo9681a(i, i2, this.f13214g);
        this.f13215h.add(d);
        Message obtainMessage = this.f13217l.obtainMessage(0);
        obtainMessage.arg1 = d.f13219a;
        this.f13217l.sendMessageDelayed(obtainMessage, (long) this.f13209b);
    }

    /* renamed from: c */
    private int m13482c() {
        int i = this.f13208a + 1;
        this.f13208a = i;
        return i;
    }

    /* renamed from: d */
    private C2921g m13483d() {
        if (this.f13216i.size() > 0) {
            C2921g poll = this.f13216i.poll();
            poll.mo9680a(m13482c());
            return poll;
        }
        C2921g gVar = new C2921g(this.f13213f, this.f13210c, m13482c());
        gVar.mo9679a().setTextSize(0, this.f13212e);
        gVar.mo9679a().setTextColor(this.f13211d);
        return gVar;
    }

    /* renamed from: e */
    private void m13484e() {
        Message obtainMessage = this.f13217l.obtainMessage(1);
        obtainMessage.arg1 = m13482c();
        this.f13217l.sendMessageDelayed(obtainMessage, (long) this.f13209b);
    }

    /* renamed from: b */
    public boolean mo9677b(String str, int i, int i2) {
        Iterator<C2921g> it = this.f13215h.iterator();
        while (it.hasNext()) {
            if (it.next().mo9682a(str, i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo9670a() {
        m13484e();
    }

    /* renamed from: b */
    public void mo9676b() {
        this.f13208a = 0;
        Iterator<C2921g> it = this.f13215h.iterator();
        while (it.hasNext()) {
            it.next().dismiss();
        }
        this.f13216i.clear();
        this.f13215h.clear();
    }
}
