package com.cootek.smartinput5.func;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.cootek.nativejsapis.JavascriptHandler;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.share.C1985g;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.plugin.twitter.AuthorizeActivity;
import com.cootek.smartinput5.plugin.twitter.ShareActivity;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.aI */
/* compiled from: LimitationManager */
public class C1396aI {

    /* renamed from: a */
    public static final int f4410a = 0;

    /* renamed from: b */
    public static final int f4411b = 1;

    /* renamed from: c */
    public static final int f4412c = 2;

    /* renamed from: d */
    public static final int f4413d = 3;

    /* renamed from: e */
    public static final int f4414e = -1;

    /* renamed from: f */
    public static final int f4415f = 0;

    /* renamed from: g */
    public static final int f4416g = 1;

    /* renamed from: h */
    public static final int f4417h = 2;

    /* renamed from: i */
    private static final String f4418i = "LimitationManager";

    /* renamed from: j */
    private static final String f4419j = "/";

    /* renamed from: k */
    private static final int f4420k = 0;

    /* renamed from: l */
    private static final int f4421l = 1;

    /* renamed from: m */
    private static final int f4422m = 2;

    /* renamed from: n */
    private static final String[] f4423n = {"DOWNLOAD_LANGUAGE", "DOWNLOAD_SKIN"};

    /* renamed from: o */
    private Context f4424o;

    /* renamed from: p */
    private final boolean f4425p;

    /* renamed from: q */
    private final int[] f4426q;

    /* renamed from: r */
    private ArrayList<C1397a> f4427r;

    /* renamed from: s */
    private int f4428s = 0;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f4429t = false;

    /* renamed from: com.cootek.smartinput5.func.aI$a */
    /* compiled from: LimitationManager */
    public interface C1397a {
        /* renamed from: a */
        void mo4239a(int i);

        /* renamed from: g */
        int mo4250g();

        /* renamed from: h */
        void mo4251h();
    }

    public C1396aI(Context context) {
        this.f4424o = context;
        this.f4427r = new ArrayList<>();
        this.f4425p = m6559b();
        this.f4426q = this.f4424o.getResources().getIntArray(R.array.download_limitations);
    }

    /* renamed from: a */
    public void mo5990a(C1397a aVar) {
        if (!this.f4427r.contains(aVar)) {
            this.f4427r.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo5994b(C1397a aVar) {
        if (this.f4427r.contains(aVar)) {
            this.f4427r.remove(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo5992a() {
        if (this.f4425p || !Settings.isInitialized()) {
            return false;
        }
        return Settings.getInstance().getBoolSetting(Settings.HAS_DOWNLOAD_LIMITATION);
    }

    /* renamed from: a */
    public int mo5986a(int i) {
        return this.f4426q[i] - m6566f(i);
    }

    /* renamed from: b */
    private boolean m6559b() {
        return C1132b.m5654a(this.f4424o).mo4411e();
    }

    /* renamed from: a */
    public void mo5991a(boolean z) {
        this.f4429t = z;
    }

    /* renamed from: f */
    private int m6566f(int i) {
        return Settings.getInstance().getIntSetting(Settings.DOWNLOADED_PKG_COUNT, 20, m6568g(i), (Config) null);
    }

    /* renamed from: b */
    public boolean mo5995b(int i) {
        if (mo5992a() && mo5986a(i) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo5996c(int i) {
        int a;
        if (mo5992a() && mo5986a(i) - 1 >= 0) {
            m6551a(i, a);
        }
    }

    /* renamed from: a */
    private void m6551a(int i, int i2) {
        m6556b(i, this.f4426q[i] - i2);
        Iterator<C1397a> it = this.f4427r.iterator();
        while (it.hasNext()) {
            C1397a next = it.next();
            if (next.mo4250g() == i) {
                next.mo4239a(i2);
            }
        }
    }

    /* renamed from: b */
    private void m6556b(int i, int i2) {
        Settings.getInstance().setIntSetting(Settings.DOWNLOADED_PKG_COUNT, i2, 20, m6568g(i), (Config) null, false);
        m6561c(i, i2);
    }

    /* renamed from: c */
    private void m6561c(int i, int i2) {
        if (C1368X.m6324d()) {
            Message obtain = Message.obtain((Handler) null, 3);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.SETTING_TYPE, 1);
            bundle.putInt(IPCManager.SETTING_KEY, Settings.DOWNLOADED_PKG_COUNT);
            bundle.putInt(IPCManager.SETTING_CATEGORY_TYPE, 20);
            bundle.putString(IPCManager.SETTING_CATEGORY_VALUE, m6568g(i));
            bundle.putBoolean(IPCManager.SETTING_FIRE_CHANGED, false);
            obtain.setData(bundle);
            try {
                C1368X.m6320c().mo5839l().sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: g */
    private String m6568g(int i) {
        return f4423n[i];
    }

    /* renamed from: d */
    public void mo5998d(int i) {
        if (mo5992a()) {
            if (i - this.f4428s == 1) {
                this.f4428s = i;
            } else {
                this.f4428s = 0;
            }
            if (this.f4428s == 2) {
                Settings.getInstance().setBoolSetting(Settings.HAS_DOWNLOAD_LIMITATION, false);
                m6560c();
                Iterator<C1397a> it = this.f4427r.iterator();
                while (it.hasNext()) {
                    it.next().mo4251h();
                }
            }
        } else if (this.f4428s == 2) {
            this.f4428s = 0;
        }
    }

    /* renamed from: c */
    private void m6560c() {
        Message obtain = Message.obtain();
        obtain.what = 3;
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 3);
        bundle.putInt(IPCManager.SETTING_KEY, Settings.HAS_DOWNLOAD_LIMITATION);
        bundle.putBoolean(IPCManager.SETTING_VALUE, false);
        obtain.setData(bundle);
        try {
            C1368X.m6320c().mo5839l().sendMessage(obtain);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public void mo5987a(int i, ArrayList<String> arrayList) {
        mo5988a(i, arrayList, false);
    }

    /* renamed from: a */
    public void mo5988a(int i, ArrayList<String> arrayList, boolean z) {
        String a = m6549a(arrayList);
        String g = m6568g(i);
        Settings.getInstance().setStringSetting(Settings.ALREADY_OWN_PKGS, a, 20, g, (Config) null, false);
        if (z) {
            m6554a(a, g);
        }
    }

    /* renamed from: a */
    private void m6554a(String str, String str2) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 2);
        bundle.putInt(IPCManager.SETTING_KEY, Settings.ALREADY_OWN_PKGS);
        bundle.putInt(IPCManager.SETTING_CATEGORY_TYPE, 20);
        bundle.putString(IPCManager.SETTING_CATEGORY_VALUE, str2);
        bundle.putString(IPCManager.SETTING_VALUE, str);
        obtain.setData(bundle);
        try {
            C1368X.m6320c().mo5839l().sendMessage(obtain);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: e */
    public ArrayList<String> mo5999e(int i) {
        return m6550a(Settings.getInstance().getStringSetting(Settings.ALREADY_OWN_PKGS, 20, m6568g(i), (Config) null));
    }

    /* renamed from: a */
    private String m6549a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                sb.append(next);
                sb.append(f4419j);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private ArrayList<String> m6550a(String str) {
        String[] split;
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str) && (split = str.split(f4419j)) != null) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2) && !arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo5989a(Context context) {
        if (C1593bR.m7162a().f5075a) {
            mo6000e(context);
        } else {
            m6565d(m6564d(context), context);
        }
    }

    /* renamed from: b */
    public void mo5993b(Context context) {
        if (this.f4429t) {
            C2894d.C2895a aVar = new C2894d.C2895a(context);
            aVar.setTitle(C1974m.m9063a(context, (int) R.string.support_us_title));
            aVar.setMessage(C1974m.m9063a(context, (int) R.string.support_us_message));
            AlertDialog create = aVar.create();
            create.setCanceledOnTouchOutside(false);
            create.setButton(-1, C1974m.m9063a(context, (int) R.string.support_us_share), new C1398aJ(this, context));
            create.setButton(-2, C1974m.m9063a(context, (int) R.string.support_us_later), new C1399aK(this));
            create.setOnDismissListener(new C1400aL(this));
            create.show();
        }
    }

    /* renamed from: c */
    public void mo5997c(Context context) {
        String d = m6564d(context);
        C2894d.C2895a aVar = new C2894d.C2895a(context);
        aVar.setTitle(C1974m.m9063a(context, (int) R.string.share_limit_dialog_title)).setItems(C1974m.m9070b(context, R.array.optpage_share_types), new C1401aM(this, d, context));
        aVar.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6553a(String str, Context context) {
        boolean z;
        mo5998d(1);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ResolveInfo next = it.next();
            if (next.activityInfo.name.contains(JavascriptHandler.SHARE_TYPE_FACEBOOK)) {
                ActivityInfo activityInfo = next.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setFlags(270532608);
                intent.setComponent(componentName);
                try {
                    context.startActivity(intent);
                    z = true;
                    break;
                } catch (ActivityNotFoundException e) {
                    z = false;
                }
            }
        }
        if (!z) {
            m6558b(m6567f(context), context);
        }
    }

    /* renamed from: f */
    private String m6567f(Context context) {
        return "http://www.facebook.com/sharer.php?" + "u=" + Uri.encode(C1974m.m9063a(context, (int) R.string.short_link_in_google_play));
    }

    /* renamed from: b */
    private void m6558b(String str, Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }

    /* renamed from: d */
    public static String m6564d(Context context) {
        String a = C1974m.m9063a(context, (int) R.string.widget_share_content_title);
        return a + " " + C1974m.m9063a(context, C1593bR.m7162a().mo6232a(20));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6563c(String str, Context context) {
        Intent intent = new Intent(context, AuthorizeActivity.class);
        intent.addCategory("com.cootek.smartinput.intent.category.MINIMODE");
        intent.putExtra(ShareActivity.f10507a, str);
        intent.putExtra(ShareActivity.f10510d, true);
        intent.putExtra(ShareActivity.f10508b, true);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 3);
        bundle.putInt(IPCManager.SETTING_KEY, Settings.HAS_DOWNLOAD_LIMITATION);
        bundle.putBoolean(IPCManager.SETTING_VALUE, false);
        intent.putExtra(ShareActivity.f10509c, bundle);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
    }

    /* renamed from: e */
    public void mo6000e(Context context) {
        C1985g.m9130a(context, m6564d(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m6565d(String str, Context context) {
        Intent b = TouchPalOption.m5436b(this.f4424o, str);
        context.getPackageManager().queryIntentActivities(b, 65536).size();
        try {
            context.startActivity(b);
            C1368X.m6320c().mo5827M().mo5998d(1);
        } catch (Exception e) {
        }
    }
}
