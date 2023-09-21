package com.cootek.smartinput5.func.iab;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.cmd.C2268c;

/* renamed from: com.cootek.smartinput5.func.iab.a */
/* compiled from: ActivateTask */
public class C1759a extends AsyncTask<String, Integer, String> {

    /* renamed from: a */
    private Context f5732a;

    /* renamed from: b */
    private C1760a f5733b;

    /* renamed from: com.cootek.smartinput5.func.iab.a$a */
    /* compiled from: ActivateTask */
    public interface C1760a {
        /* renamed from: a */
        void mo6745a(String str);
    }

    public C1759a(Context context, C1760a aVar) {
        this.f5732a = context;
        this.f5733b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(String... strArr) {
        C2209a.m9956a().mo7727a(this.f5732a, C2209a.C2210a.DIRECTLY, false, C2268c.C2269a.AT);
        return C2188Q.m9853a().mo7683c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        if (!TextUtils.isEmpty(str)) {
            m8098b(str);
            m8097a();
        }
        if (this.f5733b != null) {
            this.f5733b.mo6745a(str);
        }
    }

    /* renamed from: b */
    private void m8098b(String str) {
        if (C1368X.m6324d()) {
            Message obtain = Message.obtain((Handler) null, 3);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.SETTING_TYPE, 2);
            bundle.putInt(IPCManager.SETTING_KEY, 88);
            bundle.putString(IPCManager.SETTING_VALUE, str);
            obtain.setData(bundle);
            try {
                C1368X.m6320c().mo5839l().sendMessage(obtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m8097a() {
        if (C1368X.m6324d()) {
            Message obtain = Message.obtain((Handler) null, 3);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.SETTING_TYPE, 1);
            bundle.putInt(IPCManager.SETTING_KEY, 200);
            bundle.putInt(IPCManager.SETTING_VALUE, Settings.getInstance().getIntSetting(200));
            obtain.setData(bundle);
            try {
                C1368X.m6320c().mo5839l().sendMessage(obtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
