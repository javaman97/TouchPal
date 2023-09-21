package com.cootek.smartinput5.plugin.messagepal;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.plugin.messagepal.f */
/* compiled from: MessageUpdater */
public class C2389f {

    /* renamed from: a */
    public static final String f10474a = "LOCAL_FILE_VERSION";

    /* renamed from: b */
    public static final String f10475b = "message_templates";

    /* renamed from: c */
    private static C2389f f10476c = null;

    /* renamed from: d */
    private static final int f10477d = 8192;

    /* renamed from: e */
    private Context f10478e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SharedPreferences f10479f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C2390a> f10480g = new ArrayList();

    /* renamed from: com.cootek.smartinput5.plugin.messagepal.f$a */
    /* compiled from: MessageUpdater */
    interface C2390a {
        /* renamed from: a */
        void mo8079a();
    }

    public C2389f(Context context) {
        this.f10478e = context;
        this.f10479f = context.getSharedPreferences("message_pal", 1);
    }

    /* renamed from: a */
    public static C2389f m10925a(Context context) {
        if (f10476c == null) {
            f10476c = new C2389f(context);
        }
        return f10476c;
    }

    /* renamed from: a */
    public static C2389f m10924a() {
        return f10476c;
    }

    /* renamed from: a */
    public void mo8089a(C2390a aVar) {
        this.f10480g.add(aVar);
    }

    /* renamed from: b */
    public void mo8091b(C2390a aVar) {
        this.f10480g.remove(aVar);
    }

    /* renamed from: b */
    public String mo8090b() {
        return C1466av.m6849a(this.f10478e, f10475b).getPath();
    }

    /* renamed from: c */
    public void mo8092c() {
        m10929d();
    }

    /* renamed from: d */
    private void m10929d() {
        String string = this.f10479f.getString("LOCAL_FILE_VERSION", (String) null);
        if (string == null) {
            string = C1974m.m9063a(this.f10478e, (int) R.string.message_pal_file_version);
        }
        C2243D d = new C2243D();
        d.f9517c = C1974m.m9063a(this.f10478e, (int) R.string.app_id_messagepal);
        d.f9518d = string;
        d.f9519e = true;
        d.f9520f = true;
        new C2373x(d).mo8060a((C2373x.C2376b) new C2391g(this, string));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10927a(String str, String str2, String str3) {
        Log.d("messagepal", "####pullCacheFile:" + str2);
        new C2392h(this, str2, str, str3).execute(new Object[0]);
    }
}
