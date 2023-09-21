package com.cootek.smartinput5.func.p052b;

import android.content.Context;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1511aM;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p046b.C1132b;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.func.b.c */
/* compiled from: Language */
public enum C1550c implements C1511aM.C1512a {
    english(C1549b.f4791a, R.string.LANGUAGE_ENGLISH, R.string.app_id_language_english, R.string.v4_package_name_english, R.string.target_version_language_english),
    englishgb(C1549b.f4773I, R.string.LANGUAGE_ENGLISHGB, R.string.app_id_language_englishgb, R.string.v4_package_name_englishgb, R.string.target_version_language_englishgb),
    pinyin(C1549b.f4831b, R.string.LANGUAGE_CHS_PINYIN, R.string.app_id_language_pinyin, R.string.v4_package_name_pinyin, R.string.target_version_language_pinyin),
    stroke(C1549b.f4832c, R.string.LANGUAGE_CHS_BIHUA, R.string.app_id_language_bihua, R.string.v4_package_name_bihua, R.string.target_version_language_bihua),
    handwrite(C1549b.f4835f, R.string.LANGUAGE_CHS_HANDWRITING, R.string.app_id_language_handwrite, R.string.v4_package_name_handwrite, R.string.target_version_language_handwrite),
    wubi(C1549b.f4833d, R.string.LANGUAGE_CHS_WUBI, R.string.app_id_language_wubi, R.string.v4_package_name_wubi, R.string.target_version_language_wubi),
    zhuyin(C1549b.f4834e, R.string.LANGUAGE_CHT_ZHUYIN, R.string.app_id_language_zhuyin, R.string.v4_package_name_zhuyin, R.string.target_version_language_zhuyin),
    cangjie(C1549b.f4837h, R.string.LANGUAGE_CHT_CANGJIE, R.string.app_id_language_cangjie, R.string.v4_package_name_cangjie, R.string.target_version_language_cangjie),
    simplecangjie(C1549b.f4813ai, R.string.LANGUAGE_SIMPLECANGJIE, R.string.app_id_language_simplecangjie, R.string.v4_package_name_simplecangjie, R.string.target_version_language_simplecangjie),
    hindi(C1549b.f4788X, R.string.LANGUAGE_HINDI, R.string.app_id_language_hindi, R.string.v4_package_name_hindi, R.string.target_version_language_hindi),
    russian(C1549b.f4845p, R.string.LANGUAGE_RUSSIAN, R.string.app_id_language_russian, R.string.v4_package_name_russian, R.string.target_version_language_russian),
    ukrainian(C1549b.f4771G, R.string.LANGUAGE_UKRAINIAN, R.string.app_id_language_ukrainian, R.string.v4_package_name_ukrainian, R.string.target_version_language_ukrainian),
    swedish(C1549b.f4846q, R.string.LANGUAGE_SWEDISH, R.string.app_id_language_swedish, R.string.v4_package_name_swedish, R.string.target_version_language_swedish),
    danish(C1549b.f4766B, R.string.LANGUAGE_DANISH, R.string.app_id_language_danish, R.string.v4_package_name_danish, R.string.target_version_language_danish),
    finnish(C1549b.f4767C, R.string.LANGUAGE_FINNISH, R.string.app_id_language_finnish, R.string.v4_package_name_finnish, R.string.target_version_language_finnish),
    german(C1549b.f4839j, R.string.LANGUAGE_GERMAN, R.string.app_id_language_german, R.string.v4_package_name_german, R.string.target_version_language_german),
    french(C1549b.f4838i, R.string.LANGUAGE_FRENCH, R.string.app_id_language_french, R.string.v4_package_name_french, R.string.target_version_language_french),
    portuguese(C1549b.f4841l, R.string.LANGUAGE_PORTUGUESE, R.string.app_id_language_portuguese_pt, R.string.v4_package_name_portuguese_pt, R.string.target_version_language_portuguese_pt),
    portuguese_br(C1549b.f4842m, R.string.LANGUAGE_PORTUGUESE_BR, R.string.app_id_language_portuguese_br, R.string.v4_package_name_portuguese_br, R.string.target_version_language_portuguese_br),
    italian(C1549b.f4843n, R.string.LANGUAGE_ITALIAN, R.string.app_id_language_italian, R.string.v4_package_name_italian, R.string.target_version_language_italian),
    dutch(C1549b.f4844o, R.string.LANGUAGE_DUTCH, R.string.app_id_language_dutch, R.string.v4_package_name_dutch, R.string.target_version_language_dutch),
    polish(C1549b.f4847r, R.string.LANGUAGE_POLISH, R.string.app_id_language_polish, R.string.v4_package_name_polish, R.string.target_version_language_polish),
    turkish(C1549b.f4848s, R.string.LANGUAGE_TURKISH, R.string.app_id_language_turkish, R.string.v4_package_name_turkish, R.string.target_version_language_turkish),
    catalan(C1549b.f4778N, R.string.LANGUAGE_CATALAN, R.string.app_id_language_catalan, R.string.v4_package_name_catalan, R.string.target_version_language_catalan),
    bulgarian(C1549b.f4769E, R.string.LANGUAGE_BULGARIAN, R.string.app_id_language_bulgarian, R.string.v4_package_name_bulgarian, R.string.target_version_language_bulgarian),
    croatian(C1549b.f4850u, R.string.LANGUAGE_CROATIAN, R.string.app_id_language_croatian, R.string.v4_package_name_croatian, R.string.target_version_language_croatian),
    czech(C1549b.f4851v, R.string.LANGUAGE_CZECH, R.string.app_id_language_czech, R.string.v4_package_name_czech, R.string.target_version_language_czech),
    romanian(C1549b.f4765A, R.string.LANGUAGE_ROMANIAN, R.string.app_id_language_romanian, R.string.v4_package_name_romanian, R.string.target_version_language_romanian),
    slovak(C1549b.f4852w, R.string.LANGUAGE_SLOVAK, R.string.app_id_language_slovak, R.string.v4_package_name_slovak, R.string.target_version_language_slovak),
    slovenian(C1549b.f4853x, R.string.LANGUAGE_SLOVENIAN, R.string.app_id_language_slovenian, R.string.v4_package_name_slovenian, R.string.target_version_language_slovenian),
    spanish(C1549b.f4840k, R.string.LANGUAGE_SPANISH, R.string.app_id_language_spanish, R.string.v4_package_name_spanish, R.string.target_version_language_spanish),
    arabic(C1549b.f4772H, R.string.LANGUAGE_ARABIC, R.string.app_id_language_arabic, R.string.v4_package_name_arabic, R.string.target_version_language_arabic),
    greek(C1549b.f4770F, R.string.LANGUAGE_GREEK, R.string.app_id_language_greek, R.string.v4_package_name_greek, R.string.target_version_language_greek),
    hungarian(C1549b.f4854y, R.string.LANGUAGE_HUNGARIAN, R.string.app_id_language_hungarian, R.string.v4_package_name_hungarian, R.string.target_version_language_hungarian),
    indonesian(C1549b.f4849t, R.string.LANGUAGE_INDONESIAN, R.string.app_id_language_indonesian, R.string.v4_package_name_indonesian, R.string.target_version_language_indonesian),
    malayan(C1549b.f4855z, R.string.LANGUAGE_MALAYAN, R.string.app_id_language_malayan, R.string.v4_package_name_malayan, R.string.target_version_language_malayan),
    norwegian(C1549b.f4768D, R.string.LANGUAGE_NORWEGIAN, R.string.app_id_language_norwegian, R.string.v4_package_name_norwegian, R.string.target_version_language_norwegian),
    thai(C1549b.f4775K, R.string.LANGUAGE_THAI, R.string.app_id_language_thai, R.string.v4_package_name_thai, R.string.target_version_language_thai),
    vietnam(C1549b.f4776L, R.string.LANGUAGE_VIETNAM, R.string.app_id_language_vietnam, R.string.v4_package_name_vietnam, R.string.target_version_language_vietnam),
    albanian(C1549b.f4777M, R.string.LANGUAGE_ALBANIAN, R.string.app_id_language_albanian, R.string.v4_package_name_albanian, R.string.target_version_language_albanian),
    estonian(C1549b.f4779O, R.string.LANGUAGE_ESTONIAN, R.string.app_id_language_estonian, R.string.v4_package_name_estonian, R.string.target_version_language_estonian),
    icelandic(C1549b.f4780P, R.string.LANGUAGE_ICELANDIC, R.string.app_id_language_icelandic, R.string.v4_package_name_icelandic, R.string.target_version_language_icelandic),
    kazakh(C1549b.f4781Q, R.string.LANGUAGE_KAZAKH, R.string.app_id_language_kazakh, R.string.v4_package_name_kazakh, R.string.target_version_language_kazakh),
    latvian(C1549b.f4782R, R.string.LANGUAGE_LATVIAN, R.string.app_id_language_latvian, R.string.v4_package_name_latvian, R.string.target_version_language_latvian),
    lithuanian(C1549b.f4783S, R.string.LANGUAGE_LITHUANIAN, R.string.app_id_language_lithuanian, R.string.v4_package_name_lithuanian, R.string.target_version_language_lithuanian),
    macedonian(C1549b.f4784T, R.string.LANGUAGE_MACEDONIAN, R.string.app_id_language_macedonian, R.string.v4_package_name_macedonian, R.string.target_version_language_macedonian),
    serbian(C1549b.f4785U, R.string.LANGUAGE_SERBIAN, R.string.app_id_language_serbian, R.string.v4_package_name_serbian, R.string.target_version_language_serbian),
    serbianlatin(C1549b.f4786V, R.string.LANGUAGE_SERBIANLATIN, R.string.app_id_language_serbianlatin, R.string.v4_package_name_serbianlatin, R.string.target_version_language_serbianlatin),
    tagalog(C1549b.f4787W, R.string.LANGUAGE_TAGALOG, R.string.app_id_language_tagalog, R.string.v4_package_name_tagalog, R.string.target_version_language_tagalog),
    basque(C1549b.f4789Y, R.string.LANGUAGE_BASQUE, R.string.app_id_language_basque, R.string.v4_package_name_basque, R.string.target_version_language_basque),
    galician(C1549b.f4790Z, R.string.LANGUAGE_GALICIAN, R.string.app_id_language_galician, R.string.v4_package_name_galician, R.string.target_version_language_galician),
    malagasy(C1549b.f4805aa, R.string.LANGUAGE_MALAGASY, R.string.app_id_language_malagasy, R.string.v4_package_name_malagasy, R.string.target_version_language_malagasy),
    hebrew(C1549b.f4806ab, R.string.LANGUAGE_HEBREW, R.string.app_id_language_hebrew, R.string.v4_package_name_hebrew, R.string.target_version_language_hebrew),
    bengali(C1549b.f4807ac, R.string.LANGUAGE_BENGALI, R.string.app_id_language_bengali, R.string.v4_package_name_bengali, R.string.target_version_language_bengali),
    persian(C1549b.f4808ad, R.string.LANGUAGE_PERSIAN, R.string.app_id_language_persian, R.string.v4_package_name_persian, R.string.target_version_language_persian),
    urdu(C1549b.f4809ae, R.string.LANGUAGE_URDU, R.string.app_id_language_urdu, R.string.v4_package_name_urdu, R.string.target_version_language_urdu),
    uyghur(C1549b.f4810af, R.string.LANGUAGE_UYGHUR, R.string.app_id_language_uyghur, R.string.v4_package_name_uyghur, R.string.target_version_language_uyghur),
    laotian(C1549b.f4811ag, R.string.LANGUAGE_LAOTIAN, R.string.app_id_language_laotian, R.string.v4_package_name_laotian, R.string.target_version_language_laotian),
    burmese(C1549b.f4812ah, R.string.LANGUAGE_BURMESE, R.string.app_id_language_burmese, R.string.v4_package_name_burmese, R.string.target_version_language_burmese),
    khmer(C1549b.f4814aj, R.string.LANGUAGE_KHMER, R.string.app_id_language_khmer, R.string.v4_package_name_khmer, R.string.target_version_language_khmer),
    bosnian(C1549b.f4815ak, R.string.LANGUAGE_BOSNIAN, R.string.app_id_language_bosnian, R.string.v4_package_name_bosnian, R.string.target_version_language_bosnian),
    bosnianlatin(C1549b.f4816al, R.string.LANGUAGE_BOSNIANLATIN, R.string.app_id_language_bosnianlatin, R.string.v4_package_name_bosnianlatin, R.string.target_version_language_bosnianlatin),
    tamil(C1549b.f4817am, R.string.LANGUAGE_TAMIL, R.string.app_id_language_tamil, R.string.v4_package_name_tamil, R.string.target_version_language_tamil),
    telugu(C1549b.f4818an, R.string.LANGUAGE_TELUGU, R.string.app_id_language_telugu, R.string.v4_package_name_telugu, R.string.target_version_language_telugu),
    korean(C1549b.f4819ao, R.string.LANGUAGE_KOREAN, R.string.app_id_language_korean, R.string.v4_package_name_korean, R.string.target_version_language_korean),
    tibetan(C1549b.f4820ap, R.string.LANGUAGE_TIBETAN, R.string.app_id_language_tibetan, R.string.v4_package_name_tibetan, R.string.target_version_language_tibetan),
    spanishlatin(C1549b.f4821aq, R.string.LANGUAGE_SPANISHLATIN, R.string.app_id_language_spanishlatin, R.string.v4_package_name_spanishlatin, R.string.target_version_language_spanishlatin),
    spanishus(C1549b.f4822ar, R.string.LANGUAGE_SPANISHUS, R.string.app_id_language_spanishus, R.string.v4_package_name_spanishus, R.string.target_version_language_spanishus),
    marathi(C1549b.f4823as, R.string.LANGUAGE_MARATHI, R.string.app_id_language_marathi, R.string.v4_package_name_marathi, R.string.target_version_language_marathi),
    hinglish(C1549b.f4824at, R.string.LANGUAGE_HINGLISH, R.string.app_id_language_hinglish, R.string.v4_package_name_hinglish, R.string.target_version_language_hinglish),
    zulu(C1549b.f4825au, R.string.LANGUAGE_ZULU, R.string.app_id_language_zulu, R.string.v4_package_name_zulu, R.string.target_version_language_zulu),
    irish(C1549b.f4826av, R.string.LANGUAGE_IRISH, R.string.app_id_language_irish, R.string.v4_package_name_irish, R.string.target_version_language_irish),
    punjabi(C1549b.f4827aw, R.string.LANGUAGE_PUNJABI, R.string.app_id_language_punjabi, R.string.v4_package_name_punjabi, R.string.target_version_language_punjabi),
    kannada(C1549b.f4828ax, R.string.LANGUAGE_KANNADA, R.string.app_id_language_kannada, R.string.v4_package_name_kannada, R.string.target_version_language_kannada),
    malayalam(C1549b.f4829ay, R.string.LANGUAGE_MALAYALAM, R.string.app_id_language_malayalam, R.string.v4_package_name_malayalam, R.string.target_version_language_malayalam),
    gujarati(C1549b.f4830az, R.string.LANGUAGE_GUJARATI, R.string.app_id_language_gujarati, R.string.v4_package_name_gujarati, R.string.target_version_language_gujarati),
    assamese(C1549b.f4792aA, R.string.LANGUAGE_ASSAMESE, R.string.app_id_language_assamese, R.string.v4_package_name_assamese, R.string.target_version_language_assamese),
    afrikaans(C1549b.f4793aB, R.string.LANGUAGE_AFRIKAANS, R.string.app_id_language_afrikaans, R.string.v4_package_name_afrikaans, R.string.target_version_language_afrikaans),
    amharic(C1549b.f4794aC, R.string.LANGUAGE_AMHARIC, R.string.app_id_language_amharic, R.string.v4_package_name_amharic, R.string.target_version_language_amharic),
    azerbaijani(C1549b.f4795aD, R.string.LANGUAGE_AZERBAIJANI, R.string.app_id_language_azerbaijani, R.string.v4_package_name_azerbaijani, R.string.target_version_language_azerbaijani),
    zawgyi(C1549b.f4796aE, R.string.LANGUAGE_ZAWGYI, R.string.app_id_language_zawgyi, R.string.v4_package_name_zawgyi, R.string.target_version_language_zawgyi),
    swahili(C1549b.f4797aF, R.string.LANGUAGE_SWAHILI, R.string.app_id_language_swahili, R.string.v4_package_name_swahili, R.string.target_version_language_swahili),
    hausa(C1549b.f4798aG, R.string.LANGUAGE_HAUSA, R.string.app_id_language_hausa, R.string.v4_package_name_hausa, R.string.target_version_language_hausa),
    belarusian(C1549b.f4799aH, R.string.LANGUAGE_BELARUSIAN, R.string.app_id_language_belarusian, R.string.v4_package_name_belarusian, R.string.target_version_language_belarusian),
    nepali(C1549b.f4800aI, R.string.LANGUAGE_NEPALI, R.string.app_id_language_nepali, R.string.v4_package_name_nepali, R.string.target_version_language_nepali),
    nepalitrad(C1549b.f4801aJ, R.string.LANGUAGE_NEPALITRAD, R.string.app_id_language_nepalitrad, R.string.v4_package_name_nepalitrad, R.string.target_version_language_nepalitrad),
    sinhala(C1549b.f4802aK, R.string.LANGUAGE_SINHALA, R.string.app_id_language_sinhala, R.string.v4_package_name_sinhala, R.string.target_version_language_sinhala),
    uzbek(C1549b.f4803aL, R.string.LANGUAGE_UZBEK, R.string.app_id_language_uzbek, R.string.v4_package_name_uzbek, R.string.target_version_language_uzbek),
    oriya(C1549b.f4804aM, R.string.LANGUAGE_ORIYA, R.string.app_id_language_oriya, R.string.v4_package_name_oriya, R.string.target_version_language_oriya);
    

    /* renamed from: aL */
    private static HashMap<String, C1550c> f4894aL;

    /* renamed from: aM */
    private final String f4947aM;

    /* renamed from: aN */
    private final int f4948aN;

    /* renamed from: aO */
    private final int f4949aO;

    /* renamed from: aP */
    private final int f4950aP;

    /* renamed from: aQ */
    private final int f4951aQ;

    /* renamed from: aR */
    private int f4952aR;

    static {
        int i;
        f4894aL = new HashMap<>();
        for (C1550c cVar : values()) {
            f4894aL.put(cVar.mo6190a(), cVar);
            C1511aM.m6924b(cVar);
        }
    }

    private C1550c(String str, int i, int i2, int i3, int i4) {
        this.f4952aR = 0;
        this.f4947aM = str;
        this.f4948aN = i;
        this.f4949aO = i2;
        this.f4950aP = i3;
        this.f4951aQ = i4;
    }

    /* renamed from: a */
    public String mo6190a() {
        return this.f4947aM;
    }

    /* renamed from: a */
    public String mo6191a(Context context) {
        return C1974m.m9063a(context, this.f4948aN);
    }

    /* renamed from: b */
    public String mo6192b(Context context) {
        return C1974m.m9063a(context, this.f4949aO);
    }

    /* renamed from: c */
    public String mo6193c(Context context) {
        return C1974m.m9063a(context, this.f4950aP);
    }

    /* renamed from: d */
    public String mo6194d(Context context) {
        return C1974m.m9063a(context, this.f4951aQ);
    }

    /* renamed from: b */
    public int mo6146b() {
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo6147c() {
        return true;
    }

    /* renamed from: a */
    public static C1550c m6998a(String str) {
        if (str == null) {
            return null;
        }
        return f4894aL.get(str);
    }

    /* renamed from: d */
    public C1521aV mo6148d() {
        return C1521aV.others;
    }

    /* renamed from: e */
    public static C1550c[] m7002e(Context context) {
        boolean z = context.getResources().getBoolean(R.bool.language_enabled_default);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1550c cVar : values()) {
            if (m6999a(context, z, cVar)) {
                if (cVar.mo6147c()) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        int size = arrayList2.size();
        int size2 = arrayList.size();
        C1550c[] cVarArr = (C1550c[]) arrayList2.toArray(new C1550c[size]);
        if (C1593bR.m7162a().f5075a) {
            Arrays.sort(cVarArr, new C1509aK());
        }
        C1550c[] cVarArr2 = new C1550c[(size + size2)];
        for (int i = 0; i < size2; i++) {
            cVarArr2[i] = (C1550c) arrayList.get(i);
        }
        for (int i2 = 0; i2 < size; i2++) {
            cVarArr2[size2 + i2] = cVarArr[i2];
        }
        return cVarArr2;
    }

    /* renamed from: a */
    public static boolean m7000a(Context context, boolean z, String str) {
        return m6999a(context, z, f4894aL.get(str));
    }

    /* renamed from: a */
    private static boolean m6999a(Context context, boolean z, C1550c cVar) {
        if (cVar == null || !m7001b(cVar.mo6146b()) || !C1132b.m5654a(context).mo4395a(cVar.mo6190a(), Boolean.valueOf(z)).booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m7001b(int i) {
        if (C1593bR.m7162a().f5075a) {
            if ((i & 2) != 0) {
                return true;
            }
            return false;
        } else if ((i & 1) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo6144e() {
        return true;
    }

    /* renamed from: f */
    public boolean mo6171f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo6172g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo6164h() {
        return true;
    }

    /* renamed from: i */
    public boolean mo6145i() {
        return false;
    }

    /* renamed from: j */
    public boolean mo6173j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo6143k() {
        return false;
    }

    /* renamed from: a */
    public void mo6170a(int i) {
        this.f4952aR = i;
    }

    /* renamed from: l */
    public int mo6174l() {
        return this.f4952aR;
    }
}
