package com.cootek.smartinput5.net;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.Toast;
import com.cootek.smartinput5.action.ActionOnFileDownloaded;
import com.cootek.smartinput5.action.ActionSetSkin;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1810j;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.net.C2197U;
import com.cootek.smartinput5.net.C2364s;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.net.Y */
/* compiled from: ProgressDialogDownloader */
public class C2207Y extends C2197U {

    /* renamed from: u */
    private static final int f9309u = 1;

    /* renamed from: v */
    private ProgressDialog f9310v;

    /* renamed from: w */
    private C2364s.C2365a f9311w;

    /* renamed from: x */
    private boolean f9312x = false;

    public C2207Y(Context context) {
        super(context);
        this.f9310v = new ProgressDialog(context);
        this.f9310v.setCancelable(false);
        this.f9310v.setProgressStyle(1);
        this.f9310v.setButton(-1, C1974m.m9063a(context, (int) R.string.download_dialog_button_cancel), new C2208Z(this));
        this.f9310v.setOnKeyListener(new C2211aa(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7646a(int i) {
        super.mo7646a(i);
        m9945t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7647a(int i, int i2, int i3, int i4) {
        super.mo7647a(i, i2, i3, i4);
        if (this.f9310v.getMax() == 1) {
            this.f9310v.setMax(i4 / 1024);
        }
        this.f9310v.setProgress(i3 / 1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7655b(int i) {
        File g;
        ArrayList<C1810j> b;
        C2183M.C2184a aVar = (C2183M.C2184a) this.f9236m.get(Integer.valueOf(i));
        int n = mo7674n();
        this.f9312x = true;
        this.f9311w = null;
        super.mo7655b(i);
        this.f9312x = false;
        if (mo7673m()) {
            m9946u();
        } else {
            m9944s();
        }
        if (C1368X.m6324d()) {
            IPCManager l = C1368X.m6320c().mo5839l();
            if (aVar != null) {
                try {
                    l.sendMessageForParcelableAction(new ActionOnFileDownloaded(aVar.getClass().getName(), (String) this.f9233j.get(Integer.valueOf(i)), ((File) this.f9235l.get(Integer.valueOf(i))).getAbsolutePath()));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            if (aVar == null || aVar != C1368X.m6320c().mo5841n() || this.f9311w == null) {
                Toast.makeText(this.f9237n, C1974m.m9063a(this.f9237n, (int) R.string.download_dialog_msg_finish), 0).show();
                return;
            }
            if (!(!(this.f9311w instanceof C2197U.C2201d) || n != 0 || (g = mo7666g(((C2197U.C2201d) this.f9311w).f9295h)) == null || (b = C1811k.m8322a().mo6821b(1, g.getAbsolutePath())) == null || b.size() == 0)) {
                String a = ((C1601bg) b.get(0)).mo6810a();
                if (!TextUtils.isEmpty(a)) {
                    try {
                        l.sendMessageForParcelableAction(new ActionSetSkin(a));
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            this.f9311w.mo7720e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7659c(int i) {
        super.mo7659c(i);
        m9946u();
        if (this.f9231h[2] != null) {
            this.f9231h[2].mo7719d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo7668h() {
        super.mo7668h();
        m9946u();
    }

    /* renamed from: g */
    public void mo7667g() {
        super.mo7667g();
        m9945t();
    }

    @TargetApi(11)
    /* renamed from: s */
    private void m9944s() {
        String str = "%1$d/%2$d";
        int n = mo7674n();
        int o = mo7675o();
        if (n > 1) {
            str = String.format("%1$d/%2$d", new Object[]{Integer.valueOf(o + 1), Integer.valueOf(n)});
        }
        try {
            this.f9310v.setProgressNumberFormat(str);
        } catch (Exception e) {
        }
    }

    /* renamed from: t */
    private void m9945t() {
        this.f9310v.setMax(1);
        this.f9310v.setProgress(0);
        m9944s();
        try {
            this.f9310v.show();
        } catch (Exception e) {
        }
    }

    /* renamed from: u */
    private void m9946u() {
        this.f9310v.setProgress(0);
        try {
            this.f9310v.dismiss();
        } catch (Exception e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7649a(C2364s.C2365a aVar) {
        if (this.f9312x) {
            this.f9311w = aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7656b(C2364s.C2365a aVar) {
    }
}
