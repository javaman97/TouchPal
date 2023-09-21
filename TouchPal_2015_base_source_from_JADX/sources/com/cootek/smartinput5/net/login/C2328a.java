package com.cootek.smartinput5.net.login;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* renamed from: com.cootek.smartinput5.net.login.a */
/* compiled from: AuthGoogleTask */
public class C2328a extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    public static final int f10276a = 256;

    /* renamed from: b */
    public static final int f10277b = 1;

    /* renamed from: c */
    public static final int f10278c = 2;

    /* renamed from: d */
    public static final int f10279d = 0;

    /* renamed from: e */
    public static final int f10280e = 1;

    /* renamed from: f */
    public static final int f10281f = 2;

    /* renamed from: g */
    public static final int f10282g = 3;

    /* renamed from: h */
    public static final String f10283h = "intent";

    /* renamed from: i */
    private static final String f10284i = "AuthGoogleTask";

    /* renamed from: j */
    private static final String f10285j = "oauth2:https://www.googleapis.com/auth/userinfo.profile https://www.googleapis.com/auth/userinfo.email";

    /* renamed from: k */
    private String f10286k;

    /* renamed from: l */
    private Handler f10287l;

    /* renamed from: m */
    private Context f10288m;

    /* renamed from: n */
    private Runnable f10289n;

    public C2328a(Context context, Handler handler, String str) {
        this.f10288m = context;
        this.f10287l = handler;
        this.f10286k = str;
    }

    /* renamed from: a */
    public void mo7946a(Runnable runnable) {
        this.f10289n = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Void... voidArr) {
        Intent intent;
        if (this.f10287l == null || TextUtils.isEmpty(this.f10286k)) {
            m10702a(0);
            return null;
        }
        try {
            return GoogleAuthUtil.getToken(this.f10288m, this.f10286k, m10701a());
        } catch (NullPointerException e) {
            e.printStackTrace();
            m10702a(0);
            return null;
        } catch (GooglePlayServicesAvailabilityException e2) {
            e2.printStackTrace();
            m10702a(3);
            return null;
        } catch (UserRecoverableAuthException e3) {
            e3.printStackTrace();
            try {
                intent = e3.getIntent();
            } catch (NullPointerException e4) {
                intent = null;
            }
            m10703a(1, intent);
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            m10702a(0);
            return null;
        } catch (GoogleAuthException e6) {
            e6.printStackTrace();
            m10702a(0);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        if (!TextUtils.isEmpty(str)) {
            Message obtainMessage = this.f10287l.obtainMessage(1);
            obtainMessage.obj = str;
            this.f10287l.sendMessage(obtainMessage);
        }
        if (this.f10289n != null) {
            this.f10289n.run();
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        if (this.f10289n != null) {
            this.f10289n.run();
        }
        m10702a(2);
    }

    /* renamed from: a */
    private String m10701a() {
        return f10285j;
    }

    /* renamed from: a */
    private void m10702a(int i) {
        m10703a(i, (Intent) null);
    }

    /* renamed from: a */
    private void m10703a(int i, Intent intent) {
        Message obtainMessage = this.f10287l.obtainMessage(2);
        obtainMessage.arg1 = i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent", intent);
        obtainMessage.setData(bundle);
        this.f10287l.sendMessage(obtainMessage);
    }
}
