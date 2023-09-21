package com.cootek.smartinput5.net;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
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

/* renamed from: com.cootek.smartinput5.net.ar */
/* compiled from: WebViewProgressDownloader */
public class C2231ar extends C2197U {

    /* renamed from: u */
    private Context f9431u;

    /* renamed from: v */
    private WebView f9432v;

    /* renamed from: w */
    private C2364s.C2365a f9433w;

    /* renamed from: x */
    private boolean f9434x = false;

    public C2231ar(Context context, WebView webView) {
        super(context);
        this.f9431u = context;
        this.f9432v = webView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7646a(int i) {
        super.mo7646a(i);
        if (this.f9233j.containsKey(Integer.valueOf(i))) {
            this.f9432v.loadUrl("javascript:onDownloadStarted('" + ((String) this.f9233j.get(Integer.valueOf(i))) + "')");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7647a(int i, int i2, int i3, int i4) {
        super.mo7647a(i, i2, i3, i4);
        if (this.f9233j.containsKey(Integer.valueOf(i))) {
            this.f9432v.loadUrl("javascript:onDownloadProgress('" + ((String) this.f9233j.get(Integer.valueOf(i))) + "'," + ((i3 * 100) / i4) + ")");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7655b(int i) {
        File g;
        ArrayList<C1810j> b;
        C2183M.C2184a aVar = (C2183M.C2184a) this.f9236m.get(Integer.valueOf(i));
        int n = mo7674n();
        if (this.f9233j.containsKey(Integer.valueOf(i))) {
            this.f9432v.loadUrl("javascript:onDownloadFinished('" + ((String) this.f9233j.get(Integer.valueOf(i))) + "')");
        }
        this.f9434x = true;
        this.f9433w = null;
        super.mo7655b(i);
        this.f9434x = false;
        if (C1368X.m6324d()) {
            IPCManager l = C1368X.m6320c().mo5839l();
            if (aVar != null) {
                try {
                    l.sendMessageForParcelableAction(new ActionOnFileDownloaded(aVar.getClass().getName(), (String) this.f9233j.get(Integer.valueOf(i)), ((File) this.f9235l.get(Integer.valueOf(i))).getAbsolutePath()));
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            if (aVar == null || aVar != C1368X.m6320c().mo5841n() || this.f9433w == null) {
                Toast.makeText(this.f9431u, C1974m.m9063a(this.f9431u, (int) R.string.download_dialog_msg_finish), 0).show();
                return;
            }
            if (!(!(this.f9433w instanceof C2197U.C2201d) || n != 0 || (g = mo7666g(((C2197U.C2201d) this.f9433w).f9295h)) == null || (b = C1811k.m8322a().mo6821b(1, g.getAbsolutePath())) == null || b.size() == 0)) {
                String a = ((C1601bg) b.get(0)).mo6810a();
                if (!TextUtils.isEmpty(a)) {
                    try {
                        l.sendMessageForParcelableAction(new ActionSetSkin(a));
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            this.f9433w.mo7720e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7659c(int i) {
        super.mo7659c(i);
        if (this.f9233j.containsKey(Integer.valueOf(i))) {
            this.f9432v.loadUrl("javascript:onDownloadFailed('" + ((String) this.f9233j.get(Integer.valueOf(i))) + "')");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo7668h() {
        super.mo7668h();
        this.f9432v.loadUrl("javascript:onDownloadCanceled()");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7649a(C2364s.C2365a aVar) {
        if (this.f9434x) {
            this.f9433w = aVar;
        }
    }
}
