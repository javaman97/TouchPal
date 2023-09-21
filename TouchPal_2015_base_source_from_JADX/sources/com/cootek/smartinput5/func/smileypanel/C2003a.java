package com.cootek.smartinput5.func.smileypanel;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1422ad;
import com.cootek.smartinput5.func.C1441aq;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1599be;
import com.cootek.smartinput5.func.C1810j;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.smileypanel.a */
/* compiled from: EmojiPluginManager */
public class C2003a implements C1441aq, C2035c, C2183M.C2184a {

    /* renamed from: a */
    public static final String f6952a = ".tpep";

    /* renamed from: b */
    private static final String f6953b = "@drawable/";

    /* renamed from: c */
    private static final String f6954c = "u1f604/u1f603/u1f600/u1f60a/u263a_fe0f/u1f609/u1f60d/u1f618/u1f61a/u1f617/u1f619/u1f61c/u1f61d/u1f61b/u1f633/u1f601/u1f614/u1f60c/u1f612/u1f61e/u1f623/u1f622/u1f602/u1f62d/u1f62a/u1f625/u1f630/u1f605/u1f613/u1f629/u1f62b/u1f628/u1f631/u1f620/u1f621/u1f624/u1f616/u1f606/u1f60b/u1f637/u1f60e/u1f634/u1f635/u1f632/u1f61f/u1f626/u1f627/u1f608/u1f47f/u1f62e/u1f62c/u1f610/u1f615/u1f62f/u1f636/u1f607/u1f60f/u1f611/u1f472/u1f473/u1f46e/u1f477/u1f482/u1f476/u1f466/u1f467/u1f468/u1f469/u1f474/u1f475/u1f471/u1f47c/u1f478/u1f63a/u1f638/u1f63b/u1f63d/u1f63c/u1f640/u1f63f/u1f639/u1f63e/u1f479/u1f47a/u1f648/u1f649/u1f64a/u1f480/u1f47d/u1f4a9/u1f525/u2728/u1f31f/u1f4ab/u1f4a5/u1f4a2/u1f4a6/u1f4a7/u1f4a4/u1f4a8/u1f442/u1f440/u1f443/u1f445/u1f444/u1f44d/u1f44e/u1f44c/u1f44a/u270a/u270c_fe0f/u1f44b/u270b/u1f450/u1f446/u1f447/u1f449/u1f448/u1f64c/u1f64f/u261d_fe0f/u1f44f/u1f4aa/u1f6b6/u1f3c3/u1f483/u1f46b/u1f46a/u1f46c/u1f46d/u1f48f/u1f491/u1f46f/u1f646/u1f645/u1f481/u1f64b/u1f486/u1f487/u1f485/u1f470/u1f64e/u1f64d/u1f647/u1f3a9/u1f451/u1f452/u1f45f/u1f45e/u1f461/u1f460/u1f462/u1f455/u1f454/u1f45a/u1f457/u1f3bd/u1f456/u1f458/u1f459/u1f4bc/u1f45c/u1f45d/u1f45b/u1f453/u1f380/u1f302/u1f484/u1f49b/u1f499/u1f49c/u1f49a/u2764_fe0f/u1f494/u1f497/u1f493/u1f495/u1f496/u1f49e/u1f498/u1f48c/u1f48b/u1f48d/u1f48e/u1f464/u1f465/u1f4ac/u1f463/u1f4ad/u1f436/u1f43a/u1f431/u1f42d/u1f439/u1f430/u1f438/u1f42f/u1f428/u1f43b/u1f437/u1f43d/u1f42e/u1f417/u1f435/u1f412/u1f434/u1f411/u1f418/u1f43c/u1f427/u1f426/u1f424/u1f425/u1f423/u1f414/u1f40d/u1f422/u1f41b/u1f41d/u1f41c/u1f41e/u1f40c/u1f419/u1f41a/u1f420/u1f41f/u1f42c/u1f433/u1f40b/u1f404/u1f40f/u1f400/u1f403/u1f405/u1f407/u1f409/u1f40e/u1f410/u1f413/u1f415/u1f416/u1f401/u1f402/u1f432/u1f421/u1f40a/u1f42b/u1f42a/u1f406/u1f408/u1f429/u1f43e/u1f490/u1f338/u1f337/u1f340/u1f339/u1f33b/u1f33a/u1f341/u1f343/u1f342/u1f33f/u1f33e/u1f344/u1f335/u1f334/u1f332/u1f333/u1f330/u1f331/u1f33c/u1f310/u1f31e/u1f31d/u1f31a/u1f311/u1f312/u1f313/u1f314/u1f315/u1f316/u1f317/u1f318/u1f31c/u1f31b/u1f319/u1f30d/u1f30e/u1f30f/u1f30b/u1f30c/u1f320/u2b50_fe0f/u2600_fe0f/u26c5_fe0f/u2601_fe0f/u26a1_fe0f/u2614_fe0f/u2744_fe0f/u26c4_fe0f/u1f300/u1f301/u1f308/u1f30a/u1f38d/u1f49d/u1f38e/u1f392/u1f393/u1f38f/u1f386/u1f387/u1f390/u1f391/u1f383/u1f47b/u1f385/u1f384/u1f381/u1f38b/u1f389/u1f38a/u1f388/u1f38c/u1f52e/u1f3a5/u1f4f7/u1f4f9/u1f4fc/u1f4bf/u1f4c0/u1f4bd/u1f4be/u1f4bb/u1f4f1/u260e_fe0f/u1f4de/u1f4df/u1f4e0/u1f4e1/u1f4fa/u1f4fb/u1f50a/u1f509/u1f508/u1f507/u1f514/u1f515/u1f4e2/u1f4e3/u23f3/u231b_fe0f/u23f0/u231a_fe0f/u1f513/u1f512/u1f50f/u1f510/u1f511/u1f50e/u1f4a1/u1f526/u1f506/u1f505/u1f50c/u1f50b/u1f50d/u1f6c1/u1f6c0/u1f6bf/u1f6bd/u1f527/u1f529/u1f528/u1f6aa/u1f6ac/u1f4a3/u1f52b/u1f52a/u1f48a/u1f489/u1f4b0/u1f4b4/u1f4b5/u1f4b7/u1f4b6/u1f4b3/u1f4b8/u1f4f2/u1f4e7/u1f4e5/u1f4e4/u2709_fe0f/u1f4e9/u1f4e8/u1f4ef/u1f4eb/u1f4ea/u1f4ec/u1f4ed/u1f4ee/u1f4e6/u1f4dd/u1f4c4/u1f4c3/u1f4d1/u1f4ca/u1f4c8/u1f4c9/u1f4dc/u1f4cb/u1f4c5/u1f4c6/u1f4c7/u1f4c1/u1f4c2/u2702_fe0f/u1f4cc/u1f4ce/u2712_fe0f/u270f_fe0f/u1f4cf/u1f4d0/u1f4d5/u1f4d7/u1f4d8/u1f4d9/u1f4d3/u1f4d4/u1f4d2/u1f4da/u1f4d6/u1f516/u1f4db/u1f52c/u1f52d/u1f4f0/u1f3a8/u1f3ac/u1f3a4/u1f3a7/u1f3bc/u1f3b5/u1f3b6/u1f3b9/u1f3bb/u1f3ba/u1f3b7/u1f3b8/u1f47e/u1f3ae/u1f0cf/u1f3b4/u1f004_fe0f/u1f3b2/u1f3af/u1f3c8/u1f3c0/u26bd_fe0f/u26be_fe0f/u1f3be/u1f3b1/u1f3c9/u1f3b3/u26f3_fe0f/u1f6b5/u1f6b4/u1f3c1/u1f3c7/u1f3c6/u1f3bf/u1f3c2/u1f3ca/u1f3c4/u1f3a3/u2615_fe0f/u1f375/u1f376/u1f37c/u1f37a/u1f37b/u1f378/u1f379/u1f377/u1f374/u1f355/u1f354/u1f35f/u1f357/u1f356/u1f35d/u1f35b/u1f364/u1f371/u1f363/u1f365/u1f359/u1f358/u1f35a/u1f35c/u1f372/u1f362/u1f361/u1f373/u1f35e/u1f369/u1f36e/u1f366/u1f368/u1f367/u1f382/u1f370/u1f36a/u1f36b/u1f36c/u1f36d/u1f36f/u1f34e/u1f34f/u1f34a/u1f34b/u1f352/u1f347/u1f349/u1f353/u1f351/u1f348/u1f34c/u1f350/u1f34d/u1f360/u1f346/u1f345/u1f33d/u1f3e0/u1f3e1/u1f3eb/u1f3e2/u1f3e3/u1f3e5/u1f3e6/u1f3ea/u1f3e9/u1f3e8/u1f492/u26ea_fe0f/u1f3ec/u1f3e4/u1f307/u1f306/u1f3ef/u1f3f0/u26fa_fe0f/u1f3ed/u1f5fc/u1f5fe/u1f5fb/u1f304/u1f305/u1f303/u1f5fd/u1f309/u1f3a0/u1f3a1/u26f2_fe0f/u1f3a2/u1f6a2/u26f5_fe0f/u1f6a4/u1f6a3/u2693_fe0f/u1f680/u2708_fe0f/u1f4ba/u1f681/u1f682/u1f68a/u1f689/u1f69e/u1f686/u1f684/u1f685/u1f688/u1f687/u1f69d/u1f68b/u1f683/u1f68e/u1f68c/u1f68d/u1f699/u1f698/u1f697/u1f695/u1f696/u1f69b/u1f69a/u1f6a8/u1f693/u1f694/u1f692/u1f691/u1f690/u1f6b2/u1f6a1/u1f69f/u1f6a0/u1f69c/u1f488/u1f68f/u1f3ab/u1f6a6/u1f6a5/u26a0_fe0f/u1f6a7/u1f530/u26fd_fe0f/u1f3ee/u1f3b0/u2668_fe0f/u1f5ff/u1f3aa/u1f3ad/u1f4cd/u1f6a9/u1f1ef_1f1f5/u1f1f0_1f1f7/u1f1e9_1f1ea/u1f1e8_1f1f3/u1f1fa_1f1f8/u1f1eb_1f1f7/u1f1ea_1f1f8/u1f1ee_1f1f9/u1f1f7_1f1fa/u1f1ec_1f1e7/u0031_fe0f_20e3/u0032_fe0f_20e3/u0033_fe0f_20e3/u0034_fe0f_20e3/u0035_fe0f_20e3/u0036_fe0f_20e3/u0037_fe0f_20e3/u0038_fe0f_20e3/u0039_fe0f_20e3/u0030_fe0f_20e3/u1f51f/u1f522/u0023_fe0f_20e3/u1f523/u2b06_fe0f/u2b07_fe0f/u2b05_fe0f/u27a1_fe0f/u1f520/u1f521/u1f524/u2197_fe0f/u2196_fe0f/u2198_fe0f/u2199_fe0f/u2194_fe0f/u2195_fe0f/u1f504/u25c0_fe0f/u25b6_fe0f/u1f53c/u1f53d/u21a9_fe0f/u21aa_fe0f/u2139_fe0f/u23ea/u23e9/u23eb/u23ec/u2935_fe0f/u2934_fe0f/u1f197/u1f500/u1f501/u1f502/u1f195/u1f199/u1f192/u1f193/u1f196/u1f4f6/u1f3a6/u1f201/u1f22f_fe0f/u1f233/u1f235/u1f234/u1f232/u1f250/u1f239/u1f23a/u1f236/u1f21a_fe0f/u1f6bb/u1f6b9/u1f6ba/u1f6bc/u1f6be/u1f6b0/u1f6ae/u1f17f_fe0f/u267f_fe0f/u1f6ad/u1f237/u1f238/u1f202/u24c2_fe0f/u1f6c2/u1f6c4/u1f6c5/u1f6c3/u1f251/u3299_fe0f/u3297_fe0f/u1f191/u1f198/u1f194/u1f6ab/u1f51e/u1f4f5/u1f6af/u1f6b1/u1f6b3/u1f6b7/u1f6b8/u26d4_fe0f/u2733_fe0f/u2747_fe0f/u274e/u2705/u2734_fe0f/u1f49f/u1f19a/u1f4f3/u1f4f4/u1f170/u1f171/u1f18e/u1f17e/u1f4a0/u27bf/u267b_fe0f/u2648_fe0f/u2649_fe0f/u264a_fe0f/u264b_fe0f/u264c_fe0f/u264d_fe0f/u264e_fe0f/u264f_fe0f/u2650_fe0f/u2651_fe0f/u2652_fe0f/u2653_fe0f/u26ce/u1f52f/u1f3e7/u1f4b9/u1f4b2/u1f4b1/u00a9/u00ae/u2122/u274c/u203c_fe0f/u2049_fe0f/u2757_fe0f/u2753/u2755/u2754/u2b55_fe0f/u1f51d/u1f51a/u1f519/u1f51b/u1f51c/u1f503/u1f55b/u1f567/u1f550/u1f55c/u1f551/u1f55d/u1f552/u1f55e/u1f553/u1f55f/u1f554/u1f560/u1f555/u1f556/u1f557/u1f558/u1f559/u1f55a/u1f561/u1f562/u1f563/u1f564/u1f565/u1f566/u2716_fe0f/u2795/u2796/u2797/u2660_fe0f/u2665_fe0f/u2663_fe0f/u2666_fe0f/u1f4ae/u1f4af/u2714_fe0f/u2611_fe0f/u1f518/u1f517/u27b0/u3030/u303d_fe0f/u1f531/u25fc_fe0f/u25fb_fe0f/u25fe_fe0f/u25fd_fe0f/u25ab_fe0f/u1f53a/u1f532/u1f533/u26ab_fe0f/u26aa_fe0f/u1f534/u1f535/u1f53b/u2b1c_fe0f/u2b1b_fe0f/u1f536/u1f537/u1f538/u1f539/";

    /* renamed from: d */
    private static final Object[][] f6955d = {new Object[]{"com.cootek.smartinputv5.emoji.emojifull", 4}, new Object[]{"com.cootek.smartinputv5.emoji.touchpal.emojikeyboard", 4}, new Object[]{"com.cootek.smartinputv5.emoji.second", 4}};

    /* renamed from: h */
    private static C2003a f6956h;

    /* renamed from: e */
    private boolean f6957e = m9269q();

    /* renamed from: f */
    private HashSet<String> f6958f;

    /* renamed from: g */
    private ArrayList<C2004a> f6959g = new ArrayList<>();

    /* renamed from: i */
    private C2004a f6960i;

    /* renamed from: com.cootek.smartinput5.func.smileypanel.a$b */
    /* compiled from: EmojiPluginManager */
    public static class C2005b extends C1810j {

        /* renamed from: d */
        public String f6967d;

        /* renamed from: e */
        public int f6968e;
    }

    /* renamed from: com.cootek.smartinput5.func.smileypanel.a$a */
    /* compiled from: EmojiPluginManager */
    private class C2004a {

        /* renamed from: a */
        C1443as f6961a;

        /* renamed from: c */
        private final String f6963c;

        /* renamed from: d */
        private final int f6964d;

        /* renamed from: e */
        private final String f6965e;

        /* renamed from: f */
        private final String f6966f;

        public C2004a(String str, int i, String str2, String str3) {
            this.f6963c = str;
            this.f6964d = i;
            this.f6965e = str2;
            this.f6966f = str3;
        }

        /* renamed from: a */
        public boolean mo7356a() {
            return TextUtils.equals(this.f6966f, this.f6965e);
        }

        /* renamed from: b */
        public C1443as mo7357b() {
            return this.f6961a;
        }
    }

    /* renamed from: c */
    public static C2003a m9262c() {
        if (f6956h == null) {
            f6956h = new C2003a();
        }
        return f6956h;
    }

    private C2003a() {
        m9263k();
        C1811k.m8322a().mo6817a((C1441aq) this);
        m9264l();
    }

    /* renamed from: k */
    private void m9263k() {
        this.f6958f = new HashSet<>();
        for (String str : f6954c.split("/")) {
            if (!TextUtils.isEmpty(str)) {
                this.f6958f.add(str);
            }
        }
    }

    /* renamed from: l */
    private void m9264l() {
        this.f6959g.clear();
        ArrayList<C1810j> r = m9270r();
        if (r != null) {
            Iterator<C1810j> it = r.iterator();
            while (it.hasNext()) {
                C1810j next = it.next();
                if (next != null) {
                    C2005b bVar = (C2005b) next;
                    String str = null;
                    if (C1368X.m6324d()) {
                        str = C1974m.m9063a(C1368X.m6313b(), (int) R.string.EMOJI_PLUGIN_TARGET_VERSION);
                    }
                    C2004a aVar = new C2004a(bVar.f6967d, bVar.f6968e, bVar.f5933b, str);
                    aVar.f6961a = bVar.f5932a;
                    this.f6959g.add(aVar);
                }
            }
        }
    }

    /* renamed from: m */
    private boolean m9265m() {
        File a = C1358O.m6235a(C1358O.f4207r, false);
        if (a == null || !a.exists() || m9266n() == a.lastModified()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private long m9266n() {
        return Settings.getInstance().getLongSetting(Settings.RECORD_TIMESTAMP, 19, Settings.RECORDED_TIMESTAMP_TAG.emoji_plugin_packs_timestamp.toString(), (Config) null);
    }

    /* renamed from: o */
    private boolean m9267o() {
        boolean q = m9269q();
        boolean z = this.f6957e ^ q;
        if (!z) {
            if (q) {
                z = m9265m();
            } else {
                z = this.f6957e;
            }
        }
        this.f6957e = q;
        return z;
    }

    /* renamed from: d */
    public void mo7349d() {
        if (m9267o()) {
            m9264l();
            m9268p();
        }
        this.f6960i = m9271s();
    }

    /* renamed from: p */
    private void m9268p() {
        File a = C1358O.m6235a(C1358O.f4207r, true);
        long j = 0;
        if (a != null && a.exists()) {
            j = a.lastModified();
        }
        m9260a(j);
    }

    /* renamed from: q */
    private boolean m9269q() {
        return C1358O.m6235a(C1358O.f4207r, false) != null;
    }

    /* renamed from: a */
    private void m9260a(long j) {
        Settings.getInstance().setLongSetting(Settings.RECORD_TIMESTAMP, j, 19, Settings.RECORDED_TIMESTAMP_TAG.emoji_plugin_packs_timestamp.toString(), (Config) null, false);
    }

    /* renamed from: r */
    private ArrayList<C1810j> m9270r() {
        ArrayList<C1810j> a = C1811k.m8322a().mo6813a(6, (String) null);
        Collections.sort(a, new C2010b(this));
        return a;
    }

    /* renamed from: i */
    public void mo5948i(String str) {
        m9264l();
    }

    /* renamed from: j */
    public void mo5951j(String str) {
        m9264l();
    }

    /* renamed from: a */
    public void mo5928a() {
        m9264l();
    }

    /* renamed from: a */
    public void mo5933a(boolean z) {
    }

    /* renamed from: b */
    public int mo5935b() {
        return 6;
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        PackageInfo packageArchiveInfo;
        if (C1368X.m6324d() && (packageArchiveInfo = C1368X.m6313b().getPackageManager().getPackageArchiveInfo(file.getPath(), 0)) != null) {
            C1811k.m8322a().mo6818a(packageArchiveInfo.packageName);
        }
    }

    /* renamed from: a */
    public boolean mo5568a(String str) {
        return false;
    }

    /* renamed from: b */
    public void mo5571b(String str) {
    }

    /* renamed from: f */
    public void mo5577f() {
    }

    /* renamed from: c */
    public void mo5573c(String str) {
    }

    /* renamed from: e */
    public void mo7350e() {
    }

    /* renamed from: g */
    public boolean mo7352g() {
        return true;
    }

    /* renamed from: h */
    public void mo7353h() {
        mo7347b(false);
    }

    /* renamed from: b */
    public void mo7347b(boolean z) {
        mo7349d();
    }

    /* renamed from: d */
    public Object mo7348d(String str) {
        C2004a aVar = this.f6960i;
        if (aVar == null) {
            return null;
        }
        C1443as b = aVar.mo7357b();
        return C1599be.m7220c(b.getResources(), b.getPackageName(), f6953b + str);
    }

    /* renamed from: i */
    public boolean mo7354i() {
        m9264l();
        return m9271s() != null;
    }

    /* renamed from: j */
    public boolean mo7355j() {
        return this.f6960i != null;
    }

    /* renamed from: s */
    private C2004a m9271s() {
        boolean b = C1368X.m6320c().mo5840m().mo6066b();
        Iterator<C2004a> it = this.f6959g.iterator();
        while (it.hasNext()) {
            C2004a next = it.next();
            if (next.mo7357b() != null && !m9261a(next.mo7357b())) {
                boolean a = next.mo7356a();
                if (a && b) {
                    a = a && C1368X.m6320c().mo5840m().mo6064a(next.f6961a.getPackageName(), C1422ad.C1426c.TYPE_EMOJI, 2);
                }
                if (a) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m9261a(C1443as asVar) {
        boolean z;
        Object[][] objArr = f6955d;
        int length = objArr.length;
        int i = 0;
        boolean z2 = false;
        while (i < length) {
            Object[] objArr2 = objArr[i];
            if (((String) objArr2[0]).equals(asVar.getPackageName())) {
                z = asVar.mo6026e() < ((Integer) objArr2[1]).intValue();
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        return z2;
    }

    /* renamed from: e */
    public boolean mo7351e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f6958f.contains(str);
        }
        return false;
    }
}
