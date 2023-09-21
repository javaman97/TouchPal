package android.support.p001v4.p011f;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.support.p001v4.view.C0481l;
import android.view.KeyEvent;
import android.view.View;
import com.baidu.pcs.BaiduPCSClient;
import com.cootek.smartinput5.engine.Settings;
import java.util.ArrayList;

/* renamed from: android.support.v4.f.b */
/* compiled from: TransportMediator */
public class C0234b extends C0233a {

    /* renamed from: i */
    public static final int f595i = 126;

    /* renamed from: j */
    public static final int f596j = 127;

    /* renamed from: k */
    public static final int f597k = 130;

    /* renamed from: l */
    public static final int f598l = 1;

    /* renamed from: m */
    public static final int f599m = 2;

    /* renamed from: n */
    public static final int f600n = 4;

    /* renamed from: o */
    public static final int f601o = 8;

    /* renamed from: p */
    public static final int f602p = 16;

    /* renamed from: q */
    public static final int f603q = 32;

    /* renamed from: r */
    public static final int f604r = 64;

    /* renamed from: s */
    public static final int f605s = 128;

    /* renamed from: a */
    final Context f606a;

    /* renamed from: b */
    final C0243k f607b;

    /* renamed from: c */
    final AudioManager f608c;

    /* renamed from: d */
    final View f609d;

    /* renamed from: e */
    final Object f610e;

    /* renamed from: f */
    final C0238f f611f;

    /* renamed from: g */
    final ArrayList<C0244l> f612g;

    /* renamed from: h */
    final C0237e f613h;

    /* renamed from: t */
    final KeyEvent.Callback f614t;

    /* renamed from: a */
    static boolean m945a(int i) {
        switch (i) {
            case Settings.FUNCTIONBAR_SETTINGS /*79*/:
            case Settings.INPUT_TOP_SPEED_CHINESE /*85*/:
            case Settings.INPUT_TOP_SPEED_OTHER /*86*/:
            case Settings.ANIMATION_EFFECT /*87*/:
            case Settings.SERVER_USER_TOKEN /*88*/:
            case Settings.LAST_PAOPAO_NEWS_ID /*89*/:
            case Settings.NEXT_QUERY_PAOPAO_NEWS_TIME /*90*/:
            case Settings.NEXT_QUERY_UPDATE_TIME /*91*/:
            case 126:
            case 127:
            case 130:
                return true;
            default:
                return false;
        }
    }

    public C0234b(Activity activity, C0243k kVar) {
        this(activity, (View) null, kVar);
    }

    public C0234b(View view, C0243k kVar) {
        this((Activity) null, view, kVar);
    }

    private C0234b(Activity activity, View view, C0243k kVar) {
        this.f612g = new ArrayList<>();
        this.f613h = new C0235c(this);
        this.f614t = new C0236d(this);
        this.f606a = activity != null ? activity : view.getContext();
        this.f607b = kVar;
        this.f608c = (AudioManager) this.f606a.getSystemService(BaiduPCSClient.Type_Stream_Audio);
        this.f609d = activity != null ? activity.getWindow().getDecorView() : view;
        this.f610e = C0481l.m2735a(this.f609d);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f611f = new C0238f(this.f606a, this.f608c, this.f609d, this.f613h);
        } else {
            this.f611f = null;
        }
    }

    /* renamed from: i */
    public Object mo741i() {
        if (this.f611f != null) {
            return this.f611f.mo752a();
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo740a(KeyEvent keyEvent) {
        return C0481l.m2739a(keyEvent, this.f614t, this.f610e, this);
    }

    /* renamed from: a */
    public void mo731a(C0244l lVar) {
        this.f612g.add(lVar);
    }

    /* renamed from: b */
    public void mo733b(C0244l lVar) {
        this.f612g.remove(lVar);
    }

    /* renamed from: l */
    private C0244l[] m946l() {
        if (this.f612g.size() <= 0) {
            return null;
        }
        C0244l[] lVarArr = new C0244l[this.f612g.size()];
        this.f612g.toArray(lVarArr);
        return lVarArr;
    }

    /* renamed from: m */
    private void m947m() {
        C0244l[] l = m946l();
        if (l != null) {
            for (C0244l a : l) {
                a.mo783a(this);
            }
        }
    }

    /* renamed from: n */
    private void m948n() {
        C0244l[] l = m946l();
        if (l != null) {
            for (C0244l b : l) {
                b.mo784b(this);
            }
        }
    }

    /* renamed from: o */
    private void m949o() {
        if (this.f611f != null) {
            this.f611f.mo754a(this.f607b.mo780f(), this.f607b.mo779e(), this.f607b.mo782h());
        }
    }

    /* renamed from: j */
    public void mo742j() {
        m949o();
        m947m();
        m948n();
    }

    /* renamed from: a */
    public void mo729a() {
        if (this.f611f != null) {
            this.f611f.mo759f();
        }
        this.f607b.mo771a();
        m949o();
        m947m();
    }

    /* renamed from: b */
    public void mo732b() {
        if (this.f611f != null) {
            this.f611f.mo761h();
        }
        this.f607b.mo775b();
        m949o();
        m947m();
    }

    /* renamed from: c */
    public void mo734c() {
        if (this.f611f != null) {
            this.f611f.mo762i();
        }
        this.f607b.mo777c();
        m949o();
        m947m();
    }

    /* renamed from: d */
    public long mo735d() {
        return this.f607b.mo778d();
    }

    /* renamed from: e */
    public long mo736e() {
        return this.f607b.mo779e();
    }

    /* renamed from: a */
    public void mo730a(long j) {
        this.f607b.mo773a(j);
    }

    /* renamed from: f */
    public boolean mo737f() {
        return this.f607b.mo780f();
    }

    /* renamed from: g */
    public int mo738g() {
        return this.f607b.mo781g();
    }

    /* renamed from: h */
    public int mo739h() {
        return this.f607b.mo782h();
    }

    /* renamed from: k */
    public void mo743k() {
        this.f611f.mo755b();
    }
}
