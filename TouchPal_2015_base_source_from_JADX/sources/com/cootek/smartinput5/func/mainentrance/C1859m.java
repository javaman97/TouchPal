package com.cootek.smartinput5.func.mainentrance;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.action.ActionCollectData;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1465au;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1810j;
import com.cootek.smartinput5.func.mainentrance.MainEntranceActivity;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.share.C1985g;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.settings.C3121cP;
import com.cootek.smartinput5.p066ui.settings.SkinActivity;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.mainentrance.m */
/* compiled from: SkinProvider */
public class C1859m implements C1602bh.C1603a, C1602bh.C1604b, MainEntranceActivity.C1843a {

    /* renamed from: m */
    private static final int f6211m = 2;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f6212a;

    /* renamed from: b */
    private View f6213b;

    /* renamed from: c */
    private GridView f6214c;

    /* renamed from: d */
    private BaseAdapter f6215d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C1853g[] f6216e;

    /* renamed from: f */
    private Messenger f6217f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public IPCManager f6218g;

    /* renamed from: h */
    private boolean f6219h = false;

    /* renamed from: i */
    private int f6220i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C1854h f6221j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ArrayList<String> f6222k = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public HashMap<String, Long> f6223l = new HashMap<>();

    /* renamed from: n */
    private Handler f6224n = new C1862n(this);

    /* renamed from: o */
    private View.OnClickListener f6225o = new C1863o(this);

    /* renamed from: p */
    private View.OnClickListener f6226p = new C1865q(this);

    public C1859m(Context context) {
        this.f6212a = context;
        this.f6221j = new C1854h(context, this);
        if (C1368X.m6324d()) {
            this.f6218g = C1368X.m6320c().mo5839l();
            this.f6218g.bindService();
        }
    }

    /* renamed from: m */
    private void m8575m() {
        if (this.f6218g != null && this.f6217f == null) {
            this.f6217f = new Messenger(this.f6224n);
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.replyTo = this.f6217f;
            try {
                this.f6218g.sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }

    /* renamed from: n */
    private void m8576n() {
        this.f6213b = ((LayoutInflater) this.f6212a.getSystemService("layout_inflater")).inflate(R.layout.skin_content, (ViewGroup) null);
        String stringSetting = Settings.getInstance().getStringSetting(80);
        C1368X.m6320c().mo5841n().mo6244A();
        if (C1602bh.f5115d.equalsIgnoreCase(stringSetting) && !C1368X.m6320c().mo5841n().mo6300v()) {
            m8560a(this.f6212a.getPackageName());
        }
        m8578p();
    }

    /* renamed from: a */
    private void m8560a(String str) {
        Settings.getInstance().setStringSetting(80, str);
        Settings.getInstance().writeBack();
        m8565b(str);
    }

    /* renamed from: b */
    private void m8565b(String str) {
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 2);
        bundle.putInt(IPCManager.SETTING_KEY, 80);
        bundle.putString(IPCManager.SETTING_VALUE, str);
        obtain.setData(bundle);
        try {
            this.f6218g.sendMessage(obtain);
        } catch (RemoteException e) {
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt(IPCManager.EXTRA_ACTION_TYPE, 3);
        bundle2.putString(IPCManager.SKIN_SETTINGS_NAME, str);
        Message obtain2 = Message.obtain((Handler) null, 4);
        obtain2.setData(bundle2);
        try {
            this.f6218g.sendMessage(obtain2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m8563b(int i, boolean z) {
        Settings.getInstance().setIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER, i, true);
        Settings.getInstance().writeBack();
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 1);
        bundle.putInt(IPCManager.SETTING_KEY, Settings.CUSTOM_SKIN_SET_NUMBER);
        bundle.putInt(IPCManager.SETTING_VALUE, i);
        obtain.setData(bundle);
        try {
            this.f6218g.sendMessage(obtain);
        } catch (RemoteException e) {
        }
        if (z) {
            String str = C1602bh.f5131t + i;
            Settings.getInstance().setLongSetting(Settings.CUSTOM_SKIN_CREATE_TIME, System.currentTimeMillis(), 28, str, (Config) null, true);
            Settings.getInstance().writeBack();
            Message obtain2 = Message.obtain((Handler) null, 3);
            Bundle bundle2 = new Bundle();
            bundle2.putInt(IPCManager.SETTING_TYPE, 4);
            bundle2.putInt(IPCManager.SETTING_KEY, Settings.CUSTOM_SKIN_CREATE_TIME);
            bundle2.putLong(IPCManager.SETTING_VALUE, System.currentTimeMillis());
            bundle2.putInt(IPCManager.SETTING_CATEGORY_TYPE, 28);
            bundle2.putString(IPCManager.SETTING_CATEGORY_VALUE, str);
            obtain2.setData(bundle2);
            try {
                this.f6218g.sendMessage(obtain2);
            } catch (RemoteException e2) {
            }
        }
    }

    /* renamed from: a */
    private void m8561a(String str, String str2, String str3, boolean z) {
        try {
            this.f6218g.sendMessageForParcelableAction(new ActionCollectData(str, str3, str2, 1));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m8569c(String str) {
        Message obtain = Message.obtain((Handler) null, 4);
        Bundle bundle = new Bundle();
        bundle.putString(IPCManager.SKIN_REMOVED_PACKAGE_NAME, str);
        bundle.putInt(IPCManager.EXTRA_ACTION_TYPE, 2);
        obtain.setData(bundle);
        try {
            this.f6218g.sendMessage(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        C1246d.m6010a(this.f6212a).mo4591a(C1246d.f3849cM, C1246d.f3860cX, C1246d.f3842cF);
    }

    /* renamed from: a */
    public void mo6947a(int i) {
        if (this.f6212a instanceof SkinActivity) {
            if (C1358O.m6239b() == null) {
                Toast.makeText(this.f6212a, C1974m.m9063a(this.f6212a, (int) R.string.sdcard_ejected), 1).show();
            }
            ((SkinActivity) this.f6212a).startActivityForResult(C1602bh.m7236a(this.f6212a, i), 0);
        }
    }

    /* renamed from: a */
    public void mo6949a(C1601bg bgVar) {
        m8560a(bgVar.mo6810a());
        mo6955e();
        m8577o();
        m8561a(Settings.getKeyById(80), bgVar.mo6810a(), C1246d.f3730a, false);
    }

    /* renamed from: b */
    public void mo6952b(int i) {
        m8563b(i, false);
        m8560a(C1602bh.f5115d);
        mo6955e();
        m8577o();
    }

    /* renamed from: c */
    public void mo6954c(int i) {
        C3121cP cPVar = new C3121cP(this.f6212a);
        cPVar.mo10238a(C1974m.m9063a(this.f6212a, (int) R.string.delete_skin));
        cPVar.mo10239a(C1974m.m9063a(this.f6212a, (int) R.string.delete), new C1864p(this, i));
        cPVar.mo10241b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m8571d(int i) {
        C1602bh n = C1368X.m6320c().mo5841n();
        if (n.mo6298t() && i == Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER)) {
            m8560a(this.f6212a.getPackageName());
        }
        n.mo6261b(i, this.f6212a);
        mo6956f();
        C1246d.m6010a(this.f6212a).mo4591a(C1246d.f3849cM, C1246d.f3861cY, C1246d.f3842cF);
    }

    /* renamed from: e */
    public void mo6955e() {
        m8572d(Settings.getInstance().getStringSetting(80));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m8572d(String str) {
        if (this.f6216e != null) {
            for (C1853g gVar : this.f6216e) {
                gVar.mo6931a(gVar.mo6914a(str));
            }
            if (this.f6214c != null && this.f6215d != null) {
                this.f6215d.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: o */
    private void m8577o() {
        if (this.f6212a instanceof SkinActivity) {
            ((SkinActivity) this.f6212a).mo9973c();
        }
    }

    /* renamed from: b */
    public void mo6953b(C1601bg bgVar) {
        if (!bgVar.f5932a.mo6023b()) {
            C3121cP cPVar = new C3121cP(this.f6212a);
            cPVar.mo10238a(C1974m.m9063a(this.f6212a, (int) R.string.delete_skin));
            cPVar.mo10239a(C1974m.m9063a(this.f6212a, (int) R.string.delete), new C1867s(this, bgVar));
            cPVar.mo10241b();
            return;
        }
        bgVar.f5932a.mo6025d();
    }

    /* renamed from: f */
    public void mo6956f() {
        mo6951a(true);
    }

    /* renamed from: a */
    public void mo6951a(boolean z) {
        m8566b(z);
        if (this.f6214c != null && this.f6215d != null) {
            this.f6215d.notifyDataSetChanged();
        }
    }

    /* renamed from: p */
    private void m8578p() {
        this.f6214c = (GridView) this.f6213b.findViewById(R.id.skin_grid);
        if (this.f6214c != null) {
            m8566b(false);
            this.f6215d = new C1861b();
            this.f6214c.setAdapter(this.f6215d);
        }
    }

    /* renamed from: b */
    private void m8566b(boolean z) {
        String str;
        String stringSetting = Settings.getInstance().getStringSetting(80);
        String packageName = this.f6212a.getPackageName();
        if (TextUtils.isEmpty(stringSetting)) {
            str = packageName;
        } else {
            str = stringSetting;
        }
        ArrayList<C1810j> c = m8568c(z);
        ArrayList arrayList = new ArrayList();
        Iterator<C1810j> it = c.iterator();
        boolean z2 = false;
        int i = -1;
        while (it.hasNext()) {
            C1601bg bgVar = (C1601bg) it.next();
            String a = bgVar.mo6810a();
            if (packageName.equals(a)) {
                i = arrayList.size();
            }
            if (C1602bh.f5115d.equalsIgnoreCase(bgVar.mo6810a())) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < 4; i2++) {
                    C1847b a2 = mo6946a(bgVar, i2, str.equals(a));
                    if (a2 != null) {
                        arrayList2.add(a2);
                    }
                }
                this.f6220i = arrayList2.size();
                Collections.sort(arrayList2);
                arrayList.addAll(arrayList2);
            } else {
                C1853g gVar = new C1853g(this.f6212a);
                gVar.mo6931a(str.equals(a));
                gVar.mo6933b(bgVar.f5100d);
                gVar.mo6928a(bgVar.f5932a, R.drawable.skin_preview);
                gVar.mo6927a(this.f6225o);
                gVar.mo6932b(this.f6226p);
                gVar.mo6929a(bgVar);
                gVar.mo6930a(Boolean.valueOf(m8573e(C2361q.m10797b().mo8014e(a))));
                if (a.equalsIgnoreCase(packageName) || C1602bh.m7250e(a) > -1) {
                    gVar.mo6911a(0);
                } else {
                    boolean z3 = false;
                    String[] strArr = C1602bh.f5128q;
                    int length = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        } else if (a.equalsIgnoreCase(strArr[i3])) {
                            gVar.mo6911a(0);
                            z3 = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (!z3) {
                        gVar.mo6911a(2);
                    }
                }
                arrayList.add(gVar);
            }
            z2 = (str.equals(a) && !bgVar.f5102f) | z2;
        }
        this.f6216e = new C1853g[arrayList.size()];
        arrayList.toArray(this.f6216e);
        if (z2) {
            packageName = str;
        } else if (i != -1) {
            String externalStorageState = Environment.getExternalStorageState();
            if (!externalStorageState.equals("mounted") && !externalStorageState.equals("mounted_ro") && C1132b.m5654a(this.f6212a).mo4392a(C1135d.SD_CARD_EJECT_SHOW_MESSAGE, (Boolean) true).booleanValue()) {
                Toast.makeText(this.f6212a, C1974m.m9063a(this.f6212a, (int) R.string.sdcard_ejected_skin_setdefault), 1).show();
            }
            this.f6216e[i].mo6931a(true);
        }
        C1368X.m6320c().mo5841n().mo6283k(packageName);
        Settings.getInstance().setStringSetting(80, packageName);
        Settings.getInstance().writeBack();
        if (!z2) {
            m8565b(packageName);
        }
    }

    /* renamed from: a */
    public C1847b mo6946a(C1601bg bgVar, int i, boolean z) {
        boolean z2;
        int i2 = 1;
        C1847b bVar = new C1847b(this.f6212a, i);
        Settings instance = Settings.getInstance();
        bVar.mo6911a(1);
        if (!z || instance.getIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER) != i) {
            z2 = false;
        } else {
            z2 = true;
        }
        bVar.mo6931a(z2);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f6212a.getResources().getDrawable(R.drawable.main_entrance_skin_preview_customise);
        String a = C1602bh.m7238a(i, this.f6212a);
        String i3 = C1602bh.m7251i(i);
        bVar.mo6912a(instance.getLongSetting(Settings.CUSTOM_SKIN_CREATE_TIME, 28, C1602bh.f5131t + i, (Config) null));
        if (!(a == null || i3 == null)) {
            File file = new File(i3);
            File file2 = new File(a);
            if (!file.exists()) {
                if (z2) {
                    m8560a(this.f6212a.getPackageName());
                }
                return null;
            }
            if (file2.exists()) {
                i3 = a;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(i3, options);
                int i4 = options.outHeight;
                int i5 = options.outWidth;
                int i6 = this.f6212a.getResources().getDisplayMetrics().widthPixels / 2;
                int i7 = (i6 * 4) / 5;
                if (i4 > 0 && i5 > 0) {
                    int min = Math.min(i4 / i7, i5 / i6);
                    if (min >= 1) {
                        i2 = min;
                    }
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = i2;
                    Bitmap decodeFile = BitmapFactory.decodeFile(i3, options);
                    if (decodeFile != null) {
                        bitmapDrawable = new BitmapDrawable(decodeFile);
                    }
                }
                bVar.mo6927a(this.f6225o);
            } catch (OutOfMemoryError e) {
                return null;
            }
        }
        bVar.mo6933b(C1974m.m9063a(this.f6212a, (int) R.string.customize_skin_title));
        bVar.mo6926a((Drawable) bitmapDrawable);
        bVar.mo6929a(bgVar);
        return bVar;
    }

    /* renamed from: b */
    public View mo6900b() {
        C1368X.m6320c().mo5841n().mo6253a((C1602bh.C1603a) this);
        C1368X.m6320c().mo5841n().mo6254a((C1602bh.C1604b) this);
        m8576n();
        return this.f6213b;
    }

    /* renamed from: g */
    public void mo6957g() {
        m8568c(false);
    }

    /* renamed from: c */
    private ArrayList<C1810j> m8568c(boolean z) {
        C1810j jVar;
        int i;
        ArrayList<C1810j> arrayList = new ArrayList<>();
        if (z) {
            C1368X.m6320c().mo5841n().mo6277h();
        }
        ArrayList<C1810j> d = C1368X.m6320c().mo5841n().mo6268d();
        if (d != null) {
            arrayList.addAll(d);
        }
        ArrayList<C1810j> e = C1368X.m6320c().mo5841n().mo6270e();
        if (e != null) {
            arrayList.addAll(e);
        }
        ArrayList<C1810j> g = C1368X.m6320c().mo5841n().mo6273g();
        if (g != null) {
            arrayList.removeAll(g);
        }
        this.f6219h = false;
        Collections.sort(arrayList, new C1868t(this));
        ArrayList arrayList2 = new ArrayList();
        C1810j jVar2 = null;
        int i2 = 0;
        int i3 = -1;
        while (i2 < arrayList.size()) {
            if (arrayList.get(i2) != null) {
                String a = arrayList.get(i2).mo6810a();
                int e2 = C1602bh.m7250e(a);
                if (C1602bh.f5115d.equalsIgnoreCase(a)) {
                    jVar = arrayList.get(i2);
                    this.f6219h = true;
                    i = i2;
                } else if (e2 > -1) {
                    arrayList2.add(arrayList.get(i2));
                    jVar = jVar2;
                    i = i3;
                } else {
                    for (String equalsIgnoreCase : C1602bh.f5128q) {
                        if (equalsIgnoreCase.equalsIgnoreCase(a)) {
                            arrayList2.add(arrayList.get(i2));
                        }
                    }
                }
                i2++;
                i3 = i;
                jVar2 = jVar;
            }
            jVar = jVar2;
            i = i3;
            i2++;
            i3 = i;
            jVar2 = jVar;
        }
        if (i3 >= 0) {
            arrayList2.add(jVar2);
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(0, arrayList2);
        C1601bg bgVar = new C1601bg();
        bgVar.f5932a = new C1465au(this.f6212a);
        bgVar.f5100d = C1974m.m9063a(this.f6212a, (int) R.string.default_skin_title);
        bgVar.f5101e = C1974m.m9063a(this.f6212a, (int) R.string.plugin_author);
        arrayList.add(0, bgVar);
        return arrayList;
    }

    /* renamed from: h */
    public void mo6958h() {
        if (this.f6218g != null) {
            this.f6218g.destroy();
        }
    }

    /* renamed from: com.cootek.smartinput5.func.mainentrance.m$a */
    /* compiled from: SkinProvider */
    class C1860a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1601bg f6228b;

        /* renamed from: c */
        private View f6229c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Context f6230d;

        public C1860a(C1601bg bgVar) {
            this.f6230d = C1859m.this.f6212a;
            this.f6228b = bgVar;
            this.f6229c = ((LayoutInflater) C1859m.this.f6212a.getSystemService("layout_inflater")).inflate(R.layout.incompatable_skin_item, (ViewGroup) null);
            TextView textView = (TextView) this.f6229c.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(bgVar.f5100d);
            }
            TextView textView2 = (TextView) this.f6229c.findViewById(R.id.summary);
            if (textView2 != null) {
                textView2.setText(C1974m.m9063a(C1859m.this.f6212a, (int) R.string.optpage_cell_dict_need_uninstall));
            }
            this.f6229c.setOnClickListener(new C1869u(this, C1859m.this));
        }

        /* renamed from: a */
        public View mo6963a() {
            return this.f6229c;
        }
    }

    /* renamed from: com.cootek.smartinput5.func.mainentrance.m$b */
    /* compiled from: SkinProvider */
    class C1861b extends BaseAdapter {
        C1861b() {
        }

        public int getCount() {
            return C1859m.this.f6216e.length;
        }

        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            int length = (C1859m.this.f6216e.length / 2) + (C1859m.this.f6216e.length % 2);
            if (i / 2 == 0) {
                z = false;
                z2 = true;
            } else if (i / 2 == length - 1) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (i % 2 != 0) {
                z3 = false;
            }
            return C1859m.this.f6216e[i].mo6925a(view, z2, z, z3);
        }
    }

    /* renamed from: a */
    public void mo6303a() {
        mo6956f();
    }

    /* renamed from: d */
    public void mo6043d() {
        mo6956f();
    }

    /* renamed from: c */
    public void mo6901c() {
        m8575m();
    }

    /* renamed from: i */
    public boolean mo6959i() {
        return this.f6219h;
    }

    /* renamed from: j */
    public void mo6960j() {
        if (this.f6212a instanceof SkinActivity) {
            if (C1358O.m6239b() == null) {
                Toast.makeText(this.f6212a, C1974m.m9063a(this.f6212a, (int) R.string.sdcard_ejected), 1).show();
            }
            if (this.f6220i >= 4) {
                Toast.makeText(this.f6212a, C1974m.m9063a(this.f6212a, (int) R.string.custom_skin_max_count_reached), 0).show();
            } else {
                ((SkinActivity) this.f6212a).startActivityForResult(C1602bh.m7244b(this.f6212a), 0);
            }
        }
    }

    /* renamed from: a */
    public void mo6948a(int i, boolean z) {
        m8563b(i, z);
        m8560a(C1602bh.f5115d);
        mo6955e();
    }

    /* renamed from: k */
    public void mo6961k() {
        String stringSetting = Settings.getInstance().getStringSetting(80);
        C1853g[] gVarArr = this.f6216e;
        int length = gVarArr.length;
        int i = 0;
        while (i < length) {
            C1853g gVar = gVarArr[i];
            if (gVar.mo6914a(stringSetting)) {
                Uri h = gVar.mo6938h();
                String i2 = gVar.mo6939i();
                String j = gVar.mo6940j();
                if (h != null) {
                    C1985g.m9134a(this.f6212a, (String) null, (String) null, j, h, i2, (String) null);
                }
                if (gVar.mo6909a() == 1) {
                    C1246d.m6010a(this.f6212a).mo4591a(C1246d.f3847cK, C1246d.f3857cU, C1246d.f3842cF);
                    return;
                } else {
                    C1246d.m6010a(this.f6212a).mo4591a(C1246d.f3847cK, C1246d.f3856cT, C1246d.f3842cF);
                    return;
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: l */
    public void mo6962l() {
        if (this.f6221j != null && this.f6221j.isShowing()) {
            this.f6221j.dismiss();
        }
    }

    /* renamed from: e */
    private boolean m8573e(String str) {
        if (this.f6222k == null) {
            return false;
        }
        Iterator<String> it = this.f6222k.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo6950a(ArrayList<String> arrayList) {
        if (arrayList != null) {
            this.f6222k = arrayList;
        }
    }
}
