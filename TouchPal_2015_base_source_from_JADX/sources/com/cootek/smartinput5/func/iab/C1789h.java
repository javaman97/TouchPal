package com.cootek.smartinput5.func.iab;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;

/* renamed from: com.cootek.smartinput5.func.iab.h */
/* compiled from: IabDialogManager */
public class C1789h {

    /* renamed from: a */
    private static C1789h f5890a = null;

    /* renamed from: e */
    private static Handler f5891e;

    /* renamed from: b */
    private ProgressDialog f5892b;

    /* renamed from: c */
    private AlertDialog f5893c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Object f5894d;

    /* renamed from: com.cootek.smartinput5.func.iab.h$a */
    /* compiled from: IabDialogManager */
    public interface C1790a {
        /* renamed from: a */
        String mo6656a();

        /* renamed from: b */
        String mo6657b();

        /* renamed from: c */
        String mo6658c();

        /* renamed from: d */
        String mo6659d();

        /* renamed from: e */
        DialogInterface.OnDismissListener mo6660e();

        /* renamed from: f */
        DialogInterface.OnClickListener mo6661f();

        /* renamed from: g */
        DialogInterface.OnClickListener mo6662g();
    }

    /* renamed from: com.cootek.smartinput5.func.iab.h$b */
    /* compiled from: IabDialogManager */
    public interface C1791b {
        /* renamed from: a */
        String mo6692a();

        /* renamed from: b */
        String mo6693b();

        /* renamed from: c */
        boolean mo6694c();

        /* renamed from: d */
        DialogInterface.OnCancelListener mo6695d();
    }

    private C1789h() {
        f5891e = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static C1789h m8227a() {
        if (f5890a == null) {
            f5890a = new C1789h();
        }
        return f5890a;
    }

    /* renamed from: a */
    public synchronized void mo6794a(Context context, C1790a aVar) {
        m8230a(context, (Object) aVar);
    }

    /* renamed from: a */
    public synchronized void mo6795a(Context context, C1791b bVar) {
        m8230a(context, (Object) bVar);
    }

    /* renamed from: a */
    private void m8230a(Context context, Object obj) {
        if (obj != null) {
            f5891e.post(new C1792i(this, obj, context));
        }
    }

    /* renamed from: b */
    public synchronized void mo6796b() {
        m8235e();
    }

    /* renamed from: c */
    public void mo6797c() {
        m8234d();
        m8235e();
    }

    /* renamed from: d */
    private void m8234d() {
        if (this.f5893c != null && this.f5893c.isShowing()) {
            this.f5893c.dismiss();
        }
    }

    /* renamed from: e */
    private void m8235e() {
        if (this.f5892b != null && this.f5892b.isShowing()) {
            this.f5892b.dismiss();
        }
    }

    /* renamed from: a */
    private void m8229a(Context context) {
        m8234d();
        C1791b bVar = (C1791b) this.f5894d;
        if (this.f5892b == null || !this.f5892b.isShowing()) {
            this.f5892b = new ProgressDialog(context);
        }
        this.f5892b.setTitle(bVar.mo6692a());
        this.f5892b.setMessage(bVar.mo6693b());
        this.f5892b.setCancelable(bVar.mo6694c());
        this.f5892b.setCanceledOnTouchOutside(false);
        this.f5892b.setOnCancelListener(bVar.mo6695d());
        if (!this.f5892b.isShowing()) {
            try {
                this.f5892b.show();
            } catch (WindowManager.BadTokenException e) {
            }
        }
    }

    /* renamed from: b */
    private void m8232b(Context context) {
        mo6797c();
        C1790a aVar = (C1790a) this.f5894d;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(aVar.mo6656a());
        builder.setMessage(aVar.mo6657b());
        if (aVar.mo6658c() != null) {
            builder.setPositiveButton(aVar.mo6658c(), aVar.mo6661f());
        }
        if (aVar.mo6659d() != null) {
            builder.setNegativeButton(aVar.mo6659d(), aVar.mo6662g());
        }
        this.f5893c = builder.create();
        this.f5893c.setCanceledOnTouchOutside(false);
        this.f5893c.setOnDismissListener(new C1793j(this, aVar));
        try {
            this.f5893c.show();
        } catch (WindowManager.BadTokenException e) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m8233c(Context context) {
        if (this.f5894d != null) {
            if (this.f5894d instanceof C1791b) {
                m8229a(context);
            } else if (this.f5894d instanceof C1790a) {
                m8232b(context);
            }
        }
    }
}
