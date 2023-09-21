package com.cootek.smartinput5.func.p053c;

import android.content.Context;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.c.a */
/* compiled from: LocalPaopaoGenerator */
public class C1630a {

    /* renamed from: a */
    public static final int f5253a = 1073741824;

    /* renamed from: b */
    public static final int f5254b = 1073741825;

    /* renamed from: c */
    public static final int f5255c = 1073741826;

    /* renamed from: d */
    public static final int f5256d = 1073741827;

    /* renamed from: e */
    public static final int f5257e = 1073741828;

    /* renamed from: f */
    public static final int f5258f = 1073741829;

    /* renamed from: g */
    public static final int f5259g = 1073741830;

    /* renamed from: h */
    public static final int f5260h = 1073741831;

    /* renamed from: i */
    public static final int f5261i = 1073741832;

    /* renamed from: j */
    public static final int f5262j = 1073741833;

    /* renamed from: k */
    public static final int f5263k = 1073741840;

    /* renamed from: l */
    public static final int f5264l = 1073741841;

    /* renamed from: m */
    public static final int f5265m = 1073741856;

    /* renamed from: n */
    public static final String f5266n = "com.cootek.smartinput.intent.action.more_cells";

    /* renamed from: o */
    public static final String f5267o = "com.cootek.smartinput.intent.action.privacy_policy";

    /* renamed from: p */
    public static final String f5268p = "com.cootek.smartinput5.ui.settings.MainEntranceActivity.action.START";

    /* renamed from: q */
    public static final String f5269q = "com.cootek.smartinput5.ui.settings.MainEntranceActivity.action.HOTWORD";

    /* renamed from: r */
    public static final String f5270r = "com.cootek.smartinput.intent.action.FOLLOW_WEIBO";

    /* renamed from: s */
    private Context f5271s;

    public C1630a(Context context) {
        this.f5271s = context;
    }

    @Deprecated
    /* renamed from: a */
    public C1631b mo6403a() {
        C1631b bVar = new C1631b();
        bVar.f5285b = 1073741824;
        bVar.f5295s = true;
        bVar.f5286j = 1;
        bVar.f5287k = C1974m.m9063a(this.f5271s, (int) R.string.paopao_about_title);
        bVar.f5288l = C1974m.m9064a(this.f5271s, (int) R.string.paopao_about_summary, C1974m.m9063a(this.f5271s, (int) R.string.optpage_version_summary));
        return bVar;
    }

    /* renamed from: b */
    public C1631b mo6406b() {
        C1631b bVar = new C1631b();
        bVar.f5285b = f5254b;
        bVar.f5286j = 5;
        bVar.f5287k = C1974m.m9063a(this.f5271s, (int) R.string.task_apkupdater_update_norify_title);
        bVar.f5296x = 1;
        bVar.f5292p = C1368X.m6320c().mo5832R();
        return bVar;
    }

    /* renamed from: c */
    public C1631b mo6407c() {
        C1631b bVar = new C1631b();
        bVar.f5285b = f5255c;
        bVar.f5286j = 5;
        bVar.f5287k = C1974m.m9063a(this.f5271s, (int) R.string.smartdialer_promotion_title);
        bVar.f5288l = C1974m.m9063a(this.f5271s, (int) R.string.smartdialer_promotion_summary);
        bVar.f5296x = 1;
        bVar.f5292p = C1974m.m9063a(this.f5271s, (int) R.string.app_id_dialer);
        bVar.f5290n = C1974m.m9063a(this.f5271s, (int) R.string.smartdialer_package_name);
        return bVar;
    }

    /* renamed from: a */
    public C1631b mo6405a(String str) {
        C1631b bVar = new C1631b();
        bVar.f5285b = f5256d;
        bVar.f5286j = 0;
        bVar.f5287k = C1974m.m9063a(this.f5271s, (int) R.string.update_hotword_title);
        bVar.f5288l = str;
        bVar.f5296x = 4;
        return bVar;
    }

    /* renamed from: d */
    public C1631b mo6408d() {
        C1631b bVar = new C1631b();
        bVar.f5285b = f5262j;
        bVar.f5286j = 0;
        bVar.f5287k = C1974m.m9063a(this.f5271s, (int) R.string.paopao_rate_us_title);
        bVar.f5288l = C1974m.m9063a(this.f5271s, (int) R.string.paopao_rate_us_summary);
        bVar.f5296x = 4;
        return bVar;
    }

    /* renamed from: e */
    public C1631b mo6409e() {
        C1631b bVar = new C1631b();
        bVar.f5285b = f5257e;
        bVar.f5286j = 2;
        bVar.f5289m = this.f5271s.getString(R.string.privacy_policy_url);
        bVar.f5287k = C1974m.m9063a(this.f5271s, (int) R.string.paopao_privacy_policy_title);
        bVar.f5291o = f5267o;
        bVar.f5296x = 4;
        return bVar;
    }

    /* renamed from: f */
    public C1631b mo6410f() {
        C1631b bVar = new C1631b();
        bVar.f5285b = f5258f;
        bVar.f5286j = 3;
        int a = C1593bR.m7162a().mo6232a(5);
        int a2 = C1593bR.m7162a().mo6232a(6);
        bVar.f5287k = C1974m.m9063a(this.f5271s, a);
        bVar.f5288l = C1974m.m9063a(this.f5271s, a2);
        bVar.f5291o = f5266n;
        bVar.f5296x = 1;
        return bVar;
    }

    /* renamed from: a */
    public C1631b mo6404a(int i) {
        C1631b bVar = new C1631b();
        bVar.f5285b = m7455b(i);
        bVar.f5286j = 6;
        bVar.f5287k = C1974m.m9070b(this.f5271s, R.array.paopao_teaching_titles)[i];
        bVar.f5288l = C1974m.m9070b(this.f5271s, R.array.paopao_teaching_summaries)[i];
        bVar.f5294r = i;
        bVar.f5296x = 1;
        return bVar;
    }

    /* renamed from: b */
    public static int m7455b(int i) {
        return f5264l + i;
    }

    /* renamed from: g */
    public C1631b mo6411g() {
        C1631b bVar = new C1631b();
        bVar.f5285b = f5259g;
        bVar.f5286j = 3;
        bVar.f5287k = C1974m.m9063a(this.f5271s, (int) R.string.download_tab_hotword);
        bVar.f5291o = f5269q;
        bVar.f5296x = 0;
        return bVar;
    }

    /* renamed from: h */
    public C1631b mo6412h() {
        C1631b bVar = new C1631b();
        bVar.f5285b = f5260h;
        bVar.f5286j = 3;
        bVar.f5287k = C1974m.m9063a(this.f5271s, C1593bR.m7162a().mo6232a(8));
        bVar.f5291o = f5270r;
        bVar.f5296x = 1;
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1631b[] mo6413i() {
        C1631b bVar = new C1631b();
        bVar.f5285b = 1073841825;
        bVar.f5287k = "Test text";
        bVar.f5286j = 1;
        bVar.f5296x = 4;
        C1631b bVar2 = new C1631b();
        bVar2.f5285b = 1073841826;
        bVar2.f5287k = "Test web";
        bVar2.f5286j = 2;
        bVar2.f5289m = "http://3g.sina.com.cn";
        bVar2.f5296x = 1;
        return new C1631b[]{bVar, bVar2};
    }
}
