package com.cootek.smartinput5.presentations;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.p001v4.app.C0062Q;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.CloudInputToast;
import com.cootek.presentation.service.toast.DummyToast;
import com.cootek.presentation.service.toast.NextWordToast;
import com.cootek.presentation.service.toast.StartupToast;
import com.cootek.presentation.service.toast.StatusbarToast;
import com.cootek.presentation.service.toast.ToolbarToast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.nativeads.C1896t;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.cmd.C2258O;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.cootek.smartinput5.presentations.q */
/* compiled from: PresentationClient */
public class C2515q {

    /* renamed from: a */
    public static final String f10828a = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_TOAST_ID";

    /* renamed from: b */
    public static final String f10829b = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_URL";

    /* renamed from: c */
    public static final String f10830c = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_PKGNAME";

    /* renamed from: d */
    public static final String f10831d = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_ACTION_TYPE";

    /* renamed from: e */
    public static final String f10832e = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_REQUEST_TOKEN";

    /* renamed from: f */
    public static final String f10833f = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_ACTION_CONFIRM_TEXT";

    /* renamed from: g */
    public static final String f10834g = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_TITLE";

    /* renamed from: h */
    public static final String f10835h = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_APP_NAME";

    /* renamed from: i */
    public static final String f10836i = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_NEED_INSTALL";

    /* renamed from: j */
    public static final String f10837j = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.EXTRA_AUTO_INSTALL";

    /* renamed from: k */
    public static final String f10838k = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.DOWNLOAD_CONFIRM";

    /* renamed from: l */
    public static final String f10839l = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.NON_WIFI_REMINDER";

    /* renamed from: m */
    public static final String f10840m = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.ACTION_DELETE_NOTIFICATION";

    /* renamed from: n */
    public static final String f10841n = "com.emoji.keyboard.touchpal.INTERNAL_ACTION.PresentationClient.ACTION_CLICK_NOTIFICATION";

    /* renamed from: o */
    public static final int f10842o = 1;

    /* renamed from: p */
    public static final int f10843p = 2;

    /* renamed from: q */
    public static final String f10844q = "show_when_deactivated";

    /* renamed from: r */
    public static final int f10845r = 14;

    /* renamed from: t */
    private static final String f10846t = "PresentationClient";

    /* renamed from: y */
    private static C2515q f10847y;

    /* renamed from: A */
    private CopyOnWriteArrayList<C2516a> f10848A = new CopyOnWriteArrayList<>();

    /* renamed from: B */
    private String f10849B = null;

    /* renamed from: s */
    public final boolean f10850s;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Context f10851u;

    /* renamed from: v */
    private ArrayList<String> f10852v;

    /* renamed from: w */
    private NotificationManager f10853w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f10854x = false;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C2514p f10855z = new C2514p();

    /* renamed from: com.cootek.smartinput5.presentations.q$a */
    /* compiled from: PresentationClient */
    public interface C2516a {
        /* renamed from: d */
        void mo7129d();
    }

    private C2515q(Context context) {
        this.f10851u = context;
        this.f10852v = new ArrayList<>();
        C1132b a = C1132b.m5654a(context);
        this.f10850s = a.mo4392a(C1135d.PRESENTATION_ENABLED, (Boolean) true).booleanValue();
        if (a.mo4392a(C1135d.ENABLE_NOAH_TEST_MODE, (Boolean) false).booleanValue()) {
            PresentationManager.enableDebugMode();
        }
        int o = C2225al.m10081o(context);
        PresentationManager.setServer(C2225al.m10064c(context, o) + C2258O.PROMOTION_FILE.mo7826b(o));
        PresentationManager.initialize(context);
    }

    /* renamed from: a */
    public static void m11247a(Context context) {
        f10847y = new C2515q(context);
    }

    /* renamed from: a */
    public static boolean m11248a() {
        return f10847y != null;
    }

    /* renamed from: b */
    public static C2515q m11251b() {
        return f10847y;
    }

    /* renamed from: c */
    public void mo8316c() {
        if (!this.f10854x) {
            new Thread(new C2517r(this)).start();
            this.f10854x = true;
        }
    }

    /* renamed from: d */
    public ToolbarToast mo8318d() {
        if (this.f10850s) {
            return PresentationManager.getToolbarToast();
        }
        return null;
    }

    /* renamed from: e */
    public StatusbarToast mo8320e() {
        if (this.f10850s) {
            return PresentationManager.getStatusbarToast();
        }
        return null;
    }

    /* renamed from: a */
    public NextWordToast mo8310a(String str) {
        if (this.f10850s) {
            return PresentationManager.getNextwordToast(str);
        }
        return null;
    }

    /* renamed from: b */
    public CloudInputToast mo8314b(String str) {
        if (this.f10850s) {
            return PresentationManager.getCloudInputToast(str);
        }
        return null;
    }

    /* renamed from: f */
    public StartupToast mo8322f() {
        if (this.f10850s) {
            return PresentationManager.getStartupToast();
        }
        return null;
    }

    /* renamed from: g */
    public DummyToast mo8324g() {
        if (this.f10850s) {
            return PresentationManager.getDummyToast();
        }
        return null;
    }

    /* renamed from: k */
    private NotificationManager m11252k() {
        if (this.f10853w == null) {
            this.f10853w = (NotificationManager) this.f10851u.getSystemService("notification");
        }
        return this.f10853w;
    }

    /* renamed from: h */
    public void mo8325h() {
        m11253l();
        boolean z = C1584bI.m7149c(this.f10851u) && C1584bI.m7153f(this.f10851u);
        Settings.getInstance().setBoolSetting(Settings.IS_SMARTINPUT_ACTIVATED, z);
        int a = m11244a(z);
        StatusbarToast e = mo8320e();
        if (e != null) {
            String id = e.getId();
            String tag = e.getTag();
            if (!z) {
                if (!f10844q.equalsIgnoreCase(tag) || a <= 14) {
                    return;
                }
            } else if (f10844q.equalsIgnoreCase(tag)) {
                return;
            }
            Intent intent = new Intent(f10841n);
            intent.putExtra(f10828a, id);
            PendingIntent broadcast = PendingIntent.getBroadcast(this.f10851u, id.hashCode(), intent, 0);
            C0062Q.C0070d dVar = new C0062Q.C0070d(this.f10851u);
            if (e.showLogo) {
                dVar.mo254a((int) R.drawable.icon_small);
            } else {
                dVar.mo254a((int) R.drawable.empty_icon);
            }
            String imagePath = e.getImagePath();
            if (!TextUtils.isEmpty(imagePath)) {
                dVar.mo262a(BitmapFactory.decodeFile(imagePath));
            }
            if (e.canShowClose()) {
                dVar.mo288d(true);
            } else {
                dVar.mo288d(false);
            }
            dVar.mo270a((CharSequence) e.getDisplay());
            dVar.mo279b((CharSequence) e.getDescription());
            dVar.mo289e((CharSequence) e.getDisplay());
            dVar.mo260a(broadcast);
            Intent intent2 = new Intent(f10840m);
            intent2.putExtra(f10828a, id);
            dVar.mo277b(PendingIntent.getBroadcast(this.f10851u, id.hashCode(), intent2, 0));
            this.f10852v.add(id);
            try {
                m11252k().notify(id.hashCode(), dVar.mo282c());
                PresentationManager.shown(id);
                if (!z) {
                    C1056a.m5588a().mo4264a(C1056a.f2951L, this.f10851u);
                    C1056a.m5588a().mo4266b();
                    C1060e.m5598b().mo4276c();
                    this.f10849B = id;
                    return;
                }
                this.f10849B = null;
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a */
    private int m11244a(boolean z) {
        if (z) {
            Settings.getInstance().setLongSetting(Settings.LAST_ACTIVATED_TIME_IN_MILLIS, System.currentTimeMillis());
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long longSetting = Settings.getInstance().getLongSetting(Settings.LAST_ACTIVATED_TIME_IN_MILLIS);
        if (longSetting == 0) {
            Settings.getInstance().setLongSetting(Settings.LAST_ACTIVATED_TIME_IN_MILLIS, currentTimeMillis);
            return 0;
        }
        long j = currentTimeMillis - longSetting;
        if (j <= 0 || longSetting <= 0) {
            return 0;
        }
        int i = (int) (j / 86400000);
        if (j > ((long) i) * 86400000) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: l */
    private void m11253l() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f10852v.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!PresentationManager.isToastExists(next)) {
                arrayList.add(next);
                m11252k().cancel(next.hashCode());
            }
        }
        this.f10852v.removeAll(arrayList);
    }

    /* renamed from: c */
    public void mo8317c(String str) {
        m11252k().cancel(str.hashCode());
        this.f10852v.remove(str);
    }

    /* renamed from: d */
    public void mo8319d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f10852v.remove(str);
            PresentationManager.cleaned(str);
        }
    }

    /* renamed from: e */
    public void mo8321e(String str) {
        if (!TextUtils.isEmpty(str)) {
            PresentationManager.clicked(str);
            if (str.equals(this.f10849B)) {
                C1056a.m5588a().mo4264a(C1056a.f2952M, this.f10851u);
            }
        }
    }

    /* renamed from: f */
    public void mo8323f(String str) {
        FunctionBar h;
        if (Engine.isInitialized() && (h = Engine.getInstance().getWidgetManager().mo9650h()) != null) {
            h.mo8534a(str);
        }
    }

    /* renamed from: a */
    public static Intent m11245a(Context context, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(context, DownloadInStatusActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putExtra(f10829b, str);
        intent.putExtra(f10835h, str2);
        intent.putExtra(f10830c, str3);
        intent.putExtra(f10832e, z);
        intent.putExtra(f10838k, z2);
        intent.putExtra(f10839l, z3);
        intent.putExtra(f10837j, z4);
        return intent;
    }

    /* renamed from: a */
    public void mo8312a(StartupToast startupToast) {
        C2894d.C2895a aVar = new C2894d.C2895a(this.f10851u);
        aVar.setTitle(startupToast.getDisplay());
        aVar.setMessage(startupToast.getDescription());
        aVar.setPositiveButton(C1974m.m9063a(this.f10851u, 17039379), new C2518s(this, startupToast));
        if (startupToast.canShowClose()) {
            aVar.setNegativeButton(C1974m.m9063a(this.f10851u, 17039369), new C2519t(this, startupToast));
        }
        try {
            AlertDialog create = aVar.create();
            create.setCanceledOnTouchOutside(false);
            create.setOnCancelListener(new C2520u(this, startupToast));
            C1584bI.m7129a((Dialog) create);
            PresentationManager.shown(startupToast.getId());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public void mo8326i() {
        DummyToast g = mo8324g();
        if (g != null) {
            String id = g.getId();
            PresentationManager.shown(id);
            PresentationManager.clicked(id);
            C1896t.m8712a().mo7038c();
        }
    }

    /* renamed from: a */
    public void mo8313a(C2516a aVar) {
        if (aVar != null && !this.f10848A.contains(aVar)) {
            this.f10848A.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo8315b(C2516a aVar) {
        this.f10848A.remove(aVar);
    }

    /* renamed from: j */
    public void mo8327j() {
        Iterator<C2516a> it = this.f10848A.iterator();
        while (it.hasNext()) {
            it.next().mo7129d();
        }
    }

    /* renamed from: a */
    public void mo8311a(EditorInfo editorInfo) {
        this.f10855z.mo8309a(editorInfo);
    }
}
