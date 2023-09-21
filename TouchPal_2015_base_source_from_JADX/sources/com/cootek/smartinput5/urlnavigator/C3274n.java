package com.cootek.smartinput5.urlnavigator;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.urlnavigator.n */
/* compiled from: RecommendedUpdater */
public class C3274n {

    /* renamed from: a */
    public static final String f14388a = "LOCAL_FILE_VERSION";

    /* renamed from: b */
    private static C3274n f14389b = null;

    /* renamed from: c */
    private static final int f14390c = 8192;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f14391d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SharedPreferences f14392e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<C3275a> f14393f = new ArrayList();

    /* renamed from: com.cootek.smartinput5.urlnavigator.n$a */
    /* compiled from: RecommendedUpdater */
    interface C3275a {
        /* renamed from: a */
        void mo10469a();
    }

    public C3274n(Context context) {
        this.f14391d = context;
        this.f14392e = context.getSharedPreferences("url_navigator_recommended", 1);
    }

    /* renamed from: a */
    public static C3274n m14529a(Context context) {
        if (f14389b == null) {
            f14389b = new C3274n(context);
        }
        return f14389b;
    }

    /* renamed from: a */
    public static C3274n m14528a() {
        return f14389b;
    }

    /* renamed from: a */
    public void mo10466a(C3275a aVar) {
        this.f14393f.add(aVar);
    }

    /* renamed from: b */
    public void mo10468b(C3275a aVar) {
        this.f14393f.remove(aVar);
    }

    /* renamed from: b */
    public void mo10467b() {
        m14534c();
    }

    /* renamed from: c */
    private void m14534c() {
        String string = this.f14392e.getString("LOCAL_FILE_VERSION", (String) null);
        C2243D d = new C2243D();
        d.f9517c = C1974m.m9063a(this.f14391d, (int) R.string.app_id_urlnavigator_file);
        d.f9518d = string;
        d.f9519e = true;
        d.f9520f = true;
        new C2373x(d).mo8060a((C2373x.C2376b) new C3276o(this, string));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14531a(String str, String str2, String str3) {
        Log.d("urlnavigator", "####pullCacheFile:" + str2);
        new C3277p(this, str2, str, str3).execute(new Object[0]);
    }
}
