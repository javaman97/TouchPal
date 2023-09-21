package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.android.volley.C0817a;

/* renamed from: com.android.volley.toolbox.a */
/* compiled from: AndroidAuthenticator */
public class C0845a implements C0846b {

    /* renamed from: a */
    private final Context f2244a;

    /* renamed from: b */
    private final Account f2245b;

    /* renamed from: c */
    private final String f2246c;

    /* renamed from: d */
    private final boolean f2247d;

    public C0845a(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    public C0845a(Context context, Account account, String str, boolean z) {
        this.f2244a = context;
        this.f2245b = account;
        this.f2246c = str;
        this.f2247d = z;
    }

    /* renamed from: a */
    public Account mo3111a() {
        return this.f2245b;
    }

    /* renamed from: b */
    public String mo3113b() throws C0817a {
        String str = null;
        AccountManagerFuture<Bundle> authToken = AccountManager.get(this.f2244a).getAuthToken(this.f2245b, this.f2246c, this.f2247d, (AccountManagerCallback) null, (Handler) null);
        try {
            Bundle result = authToken.getResult();
            if (authToken.isDone() && !authToken.isCancelled()) {
                if (result.containsKey("intent")) {
                    throw new C0817a((Intent) result.getParcelable("intent"));
                }
                str = result.getString("authtoken");
            }
            if (str != null) {
                return str;
            }
            throw new C0817a("Got null auth token for type: " + this.f2246c);
        } catch (Exception e) {
            throw new C0817a("Error while retrieving auth token", e);
        }
    }

    /* renamed from: a */
    public void mo3112a(String str) {
        AccountManager.get(this.f2244a).invalidateAuthToken(this.f2245b.type, str);
    }
}
