package com.facebook.ads.internal.p075f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

/* renamed from: com.facebook.ads.internal.f.e */
public class C3410e {

    /* renamed from: a */
    private Handler f14890a;

    public C3410e() {
        if (Looper.myLooper() != null) {
            this.f14890a = new C3411f(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Message mo10713a(int i, Object obj) {
        if (this.f14890a != null) {
            return this.f14890a.obtainMessage(i, obj);
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: a */
    public void mo10714a() {
    }

    /* renamed from: a */
    public void mo10715a(int i, String str) {
        mo10717a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10716a(Message message) {
        switch (message.what) {
            case 0:
                Object[] objArr = (Object[]) message.obj;
                mo10726c(((Integer) objArr[0]).intValue(), (String) objArr[1]);
                return;
            case 1:
                Object[] objArr2 = (Object[]) message.obj;
                mo10727c((Throwable) objArr2[0], (String) objArr2[1]);
                return;
            case 2:
                mo10714a();
                return;
            case 3:
                mo10721b();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo10717a(String str) {
    }

    /* renamed from: a */
    public void mo10718a(Throwable th) {
    }

    /* renamed from: a */
    public void mo10719a(Throwable th, String str) {
        mo10718a(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10720a(HttpResponse httpResponse) {
        String str = null;
        StatusLine statusLine = httpResponse.getStatusLine();
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                str = EntityUtils.toString(new BufferedHttpEntity(entity), Utils.UTF8);
            }
        } catch (IOException e) {
            mo10724b((Throwable) e, (String) null);
        }
        if (statusLine.getStatusCode() >= 300) {
            mo10724b((Throwable) new HttpResponseException(statusLine.getStatusCode(), statusLine.getReasonPhrase()), str);
        } else {
            mo10722b(statusLine.getStatusCode(), str);
        }
    }

    /* renamed from: b */
    public void mo10721b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10722b(int i, String str) {
        mo10723b(mo10713a(0, (Object) new Object[]{Integer.valueOf(i), str}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10723b(Message message) {
        if (this.f14890a != null) {
            this.f14890a.sendMessage(message);
        } else {
            mo10716a(message);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10724b(Throwable th, String str) {
        mo10723b(mo10713a(1, (Object) new Object[]{th, str}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10725c() {
        mo10723b(mo10713a(2, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10726c(int i, String str) {
        mo10715a(i, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10727c(Throwable th, String str) {
        mo10719a(th, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo10728d() {
        mo10723b(mo10713a(3, (Object) null));
    }
}
