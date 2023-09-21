package com.google.android.gms.internal;

import android.os.Parcel;
import com.baidu.pcs.BaiduPCSClient;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.engine.Settings;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3590ae;
import com.google.android.gms.plus.PlusShare;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.bx */
public final class C3723bx extends C3590ae implements SafeParcelable, ItemScope {
    public static final C3724by CREATOR = new C3724by();

    /* renamed from: iC */
    private static final HashMap<String, C3590ae.C3591a<?, ?>> f15641iC = new HashMap<>();

    /* renamed from: ab */
    private final int f15642ab;

    /* renamed from: di */
    private String f15643di;

    /* renamed from: fy */
    private double f15644fy;

    /* renamed from: fz */
    private double f15645fz;

    /* renamed from: iD */
    private final Set<Integer> f15646iD;

    /* renamed from: iE */
    private C3723bx f15647iE;

    /* renamed from: iF */
    private List<String> f15648iF;

    /* renamed from: iG */
    private C3723bx f15649iG;

    /* renamed from: iH */
    private String f15650iH;

    /* renamed from: iI */
    private String f15651iI;

    /* renamed from: iJ */
    private String f15652iJ;

    /* renamed from: iK */
    private List<C3723bx> f15653iK;

    /* renamed from: iL */
    private int f15654iL;

    /* renamed from: iM */
    private List<C3723bx> f15655iM;

    /* renamed from: iN */
    private C3723bx f15656iN;

    /* renamed from: iO */
    private List<C3723bx> f15657iO;

    /* renamed from: iP */
    private String f15658iP;

    /* renamed from: iQ */
    private String f15659iQ;

    /* renamed from: iR */
    private C3723bx f15660iR;

    /* renamed from: iS */
    private String f15661iS;

    /* renamed from: iT */
    private String f15662iT;

    /* renamed from: iU */
    private String f15663iU;

    /* renamed from: iV */
    private List<C3723bx> f15664iV;

    /* renamed from: iW */
    private String f15665iW;

    /* renamed from: iX */
    private String f15666iX;

    /* renamed from: iY */
    private String f15667iY;

    /* renamed from: iZ */
    private String f15668iZ;

    /* renamed from: ie */
    private String f15669ie;

    /* renamed from: jA */
    private String f15670jA;

    /* renamed from: ja */
    private String f15671ja;

    /* renamed from: jb */
    private String f15672jb;

    /* renamed from: jc */
    private String f15673jc;

    /* renamed from: jd */
    private String f15674jd;

    /* renamed from: je */
    private C3723bx f15675je;

    /* renamed from: jf */
    private String f15676jf;

    /* renamed from: jg */
    private String f15677jg;

    /* renamed from: jh */
    private String f15678jh;

    /* renamed from: ji */
    private String f15679ji;

    /* renamed from: jj */
    private C3723bx f15680jj;

    /* renamed from: jk */
    private C3723bx f15681jk;

    /* renamed from: jl */
    private C3723bx f15682jl;

    /* renamed from: jm */
    private List<C3723bx> f15683jm;

    /* renamed from: jn */
    private String f15684jn;

    /* renamed from: jo */
    private String f15685jo;

    /* renamed from: jp */
    private String f15686jp;

    /* renamed from: jq */
    private String f15687jq;

    /* renamed from: jr */
    private C3723bx f15688jr;

    /* renamed from: js */
    private String f15689js;

    /* renamed from: jt */
    private String f15690jt;

    /* renamed from: ju */
    private String f15691ju;

    /* renamed from: jv */
    private C3723bx f15692jv;

    /* renamed from: jw */
    private String f15693jw;

    /* renamed from: jx */
    private String f15694jx;

    /* renamed from: jy */
    private String f15695jy;

    /* renamed from: jz */
    private String f15696jz;
    private String mName;

    static {
        f15641iC.put("about", C3590ae.C3591a.m15614a("about", 2, C3723bx.class));
        f15641iC.put("additionalName", C3590ae.C3591a.m15621g("additionalName", 3));
        f15641iC.put("address", C3590ae.C3591a.m15614a("address", 4, C3723bx.class));
        f15641iC.put("addressCountry", C3590ae.C3591a.m15620f("addressCountry", 5));
        f15641iC.put("addressLocality", C3590ae.C3591a.m15620f("addressLocality", 6));
        f15641iC.put("addressRegion", C3590ae.C3591a.m15620f("addressRegion", 7));
        f15641iC.put("associated_media", C3590ae.C3591a.m15615b("associated_media", 8, C3723bx.class));
        f15641iC.put("attendeeCount", C3590ae.C3591a.m15616c("attendeeCount", 9));
        f15641iC.put("attendees", C3590ae.C3591a.m15615b("attendees", 10, C3723bx.class));
        f15641iC.put(BaiduPCSClient.Type_Stream_Audio, C3590ae.C3591a.m15614a(BaiduPCSClient.Type_Stream_Audio, 11, C3723bx.class));
        f15641iC.put("author", C3590ae.C3591a.m15615b("author", 12, C3723bx.class));
        f15641iC.put("bestRating", C3590ae.C3591a.m15620f("bestRating", 13));
        f15641iC.put("birthDate", C3590ae.C3591a.m15620f("birthDate", 14));
        f15641iC.put("byArtist", C3590ae.C3591a.m15614a("byArtist", 15, C3723bx.class));
        f15641iC.put("caption", C3590ae.C3591a.m15620f("caption", 16));
        f15641iC.put("contentSize", C3590ae.C3591a.m15620f("contentSize", 17));
        f15641iC.put("contentUrl", C3590ae.C3591a.m15620f("contentUrl", 18));
        f15641iC.put("contributor", C3590ae.C3591a.m15615b("contributor", 19, C3723bx.class));
        f15641iC.put("dateCreated", C3590ae.C3591a.m15620f("dateCreated", 20));
        f15641iC.put("dateModified", C3590ae.C3591a.m15620f("dateModified", 21));
        f15641iC.put("datePublished", C3590ae.C3591a.m15620f("datePublished", 22));
        f15641iC.put("description", C3590ae.C3591a.m15620f("description", 23));
        f15641iC.put(PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION, C3590ae.C3591a.m15620f(PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION, 24));
        f15641iC.put("embedUrl", C3590ae.C3591a.m15620f("embedUrl", 25));
        f15641iC.put("endDate", C3590ae.C3591a.m15620f("endDate", 26));
        f15641iC.put("familyName", C3590ae.C3591a.m15620f("familyName", 27));
        f15641iC.put("gender", C3590ae.C3591a.m15620f("gender", 28));
        f15641iC.put("geo", C3590ae.C3591a.m15614a("geo", 29, C3723bx.class));
        f15641iC.put("givenName", C3590ae.C3591a.m15620f("givenName", 30));
        f15641iC.put("height", C3590ae.C3591a.m15620f("height", 31));
        f15641iC.put("id", C3590ae.C3591a.m15620f("id", 32));
        f15641iC.put("image", C3590ae.C3591a.m15620f("image", 33));
        f15641iC.put("inAlbum", C3590ae.C3591a.m15614a("inAlbum", 34, C3723bx.class));
        f15641iC.put("latitude", C3590ae.C3591a.m15618d("latitude", 36));
        f15641iC.put("location", C3590ae.C3591a.m15614a("location", 37, C3723bx.class));
        f15641iC.put("longitude", C3590ae.C3591a.m15618d("longitude", 38));
        f15641iC.put("name", C3590ae.C3591a.m15620f("name", 39));
        f15641iC.put("partOfTVSeries", C3590ae.C3591a.m15614a("partOfTVSeries", 40, C3723bx.class));
        f15641iC.put("performers", C3590ae.C3591a.m15615b("performers", 41, C3723bx.class));
        f15641iC.put("playerType", C3590ae.C3591a.m15620f("playerType", 42));
        f15641iC.put("postOfficeBoxNumber", C3590ae.C3591a.m15620f("postOfficeBoxNumber", 43));
        f15641iC.put("postalCode", C3590ae.C3591a.m15620f("postalCode", 44));
        f15641iC.put("ratingValue", C3590ae.C3591a.m15620f("ratingValue", 45));
        f15641iC.put("reviewRating", C3590ae.C3591a.m15614a("reviewRating", 46, C3723bx.class));
        f15641iC.put(PresentConfigXmlTag.FEATURE_ATTR_START_DATE, C3590ae.C3591a.m15620f(PresentConfigXmlTag.FEATURE_ATTR_START_DATE, 47));
        f15641iC.put("streetAddress", C3590ae.C3591a.m15620f("streetAddress", 48));
        f15641iC.put("text", C3590ae.C3591a.m15620f("text", 49));
        f15641iC.put("thumbnail", C3590ae.C3591a.m15614a("thumbnail", 50, C3723bx.class));
        f15641iC.put(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL, C3590ae.C3591a.m15620f(PlusShare.KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL, 51));
        f15641iC.put("tickerSymbol", C3590ae.C3591a.m15620f("tickerSymbol", 52));
        f15641iC.put("type", C3590ae.C3591a.m15620f("type", 53));
        f15641iC.put("url", C3590ae.C3591a.m15620f("url", 54));
        f15641iC.put("width", C3590ae.C3591a.m15620f("width", 55));
        f15641iC.put("worstRating", C3590ae.C3591a.m15620f("worstRating", 56));
    }

    public C3723bx() {
        this.f15642ab = 1;
        this.f15646iD = new HashSet();
    }

    C3723bx(Set<Integer> set, int i, C3723bx bxVar, List<String> list, C3723bx bxVar2, String str, String str2, String str3, List<C3723bx> list2, int i2, List<C3723bx> list3, C3723bx bxVar3, List<C3723bx> list4, String str4, String str5, C3723bx bxVar4, String str6, String str7, String str8, List<C3723bx> list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, C3723bx bxVar5, String str18, String str19, String str20, String str21, C3723bx bxVar6, double d, C3723bx bxVar7, double d2, String str22, C3723bx bxVar8, List<C3723bx> list6, String str23, String str24, String str25, String str26, C3723bx bxVar9, String str27, String str28, String str29, C3723bx bxVar10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.f15646iD = set;
        this.f15642ab = i;
        this.f15647iE = bxVar;
        this.f15648iF = list;
        this.f15649iG = bxVar2;
        this.f15650iH = str;
        this.f15651iI = str2;
        this.f15652iJ = str3;
        this.f15653iK = list2;
        this.f15654iL = i2;
        this.f15655iM = list3;
        this.f15656iN = bxVar3;
        this.f15657iO = list4;
        this.f15658iP = str4;
        this.f15659iQ = str5;
        this.f15660iR = bxVar4;
        this.f15661iS = str6;
        this.f15662iT = str7;
        this.f15663iU = str8;
        this.f15664iV = list5;
        this.f15665iW = str9;
        this.f15666iX = str10;
        this.f15667iY = str11;
        this.f15643di = str12;
        this.f15668iZ = str13;
        this.f15671ja = str14;
        this.f15672jb = str15;
        this.f15673jc = str16;
        this.f15674jd = str17;
        this.f15675je = bxVar5;
        this.f15676jf = str18;
        this.f15677jg = str19;
        this.f15678jh = str20;
        this.f15679ji = str21;
        this.f15680jj = bxVar6;
        this.f15644fy = d;
        this.f15681jk = bxVar7;
        this.f15645fz = d2;
        this.mName = str22;
        this.f15682jl = bxVar8;
        this.f15683jm = list6;
        this.f15684jn = str23;
        this.f15685jo = str24;
        this.f15686jp = str25;
        this.f15687jq = str26;
        this.f15688jr = bxVar9;
        this.f15689js = str27;
        this.f15690jt = str28;
        this.f15691ju = str29;
        this.f15692jv = bxVar10;
        this.f15693jw = str30;
        this.f15694jx = str31;
        this.f15695jy = str32;
        this.f15669ie = str33;
        this.f15696jz = str34;
        this.f15670jA = str35;
    }

    public C3723bx(Set<Integer> set, C3723bx bxVar, List<String> list, C3723bx bxVar2, String str, String str2, String str3, List<C3723bx> list2, int i, List<C3723bx> list3, C3723bx bxVar3, List<C3723bx> list4, String str4, String str5, C3723bx bxVar4, String str6, String str7, String str8, List<C3723bx> list5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, C3723bx bxVar5, String str18, String str19, String str20, String str21, C3723bx bxVar6, double d, C3723bx bxVar7, double d2, String str22, C3723bx bxVar8, List<C3723bx> list6, String str23, String str24, String str25, String str26, C3723bx bxVar9, String str27, String str28, String str29, C3723bx bxVar10, String str30, String str31, String str32, String str33, String str34, String str35) {
        this.f15646iD = set;
        this.f15642ab = 1;
        this.f15647iE = bxVar;
        this.f15648iF = list;
        this.f15649iG = bxVar2;
        this.f15650iH = str;
        this.f15651iI = str2;
        this.f15652iJ = str3;
        this.f15653iK = list2;
        this.f15654iL = i;
        this.f15655iM = list3;
        this.f15656iN = bxVar3;
        this.f15657iO = list4;
        this.f15658iP = str4;
        this.f15659iQ = str5;
        this.f15660iR = bxVar4;
        this.f15661iS = str6;
        this.f15662iT = str7;
        this.f15663iU = str8;
        this.f15664iV = list5;
        this.f15665iW = str9;
        this.f15666iX = str10;
        this.f15667iY = str11;
        this.f15643di = str12;
        this.f15668iZ = str13;
        this.f15671ja = str14;
        this.f15672jb = str15;
        this.f15673jc = str16;
        this.f15674jd = str17;
        this.f15675je = bxVar5;
        this.f15676jf = str18;
        this.f15677jg = str19;
        this.f15678jh = str20;
        this.f15679ji = str21;
        this.f15680jj = bxVar6;
        this.f15644fy = d;
        this.f15681jk = bxVar7;
        this.f15645fz = d2;
        this.mName = str22;
        this.f15682jl = bxVar8;
        this.f15683jm = list6;
        this.f15684jn = str23;
        this.f15685jo = str24;
        this.f15686jp = str25;
        this.f15687jq = str26;
        this.f15688jr = bxVar9;
        this.f15689js = str27;
        this.f15690jt = str28;
        this.f15691ju = str29;
        this.f15692jv = bxVar10;
        this.f15693jw = str30;
        this.f15694jx = str31;
        this.f15695jy = str32;
        this.f15669ie = str33;
        this.f15696jz = str34;
        this.f15670jA = str35;
    }

    /* renamed from: T */
    public HashMap<String, C3590ae.C3591a<?, ?>> mo11402T() {
        return f15641iC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11406a(C3590ae.C3591a aVar) {
        return this.f15646iD.contains(Integer.valueOf(aVar.mo11420aa()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo11407b(C3590ae.C3591a aVar) {
        switch (aVar.mo11420aa()) {
            case 2:
                return this.f15647iE;
            case 3:
                return this.f15648iF;
            case 4:
                return this.f15649iG;
            case 5:
                return this.f15650iH;
            case 6:
                return this.f15651iI;
            case 7:
                return this.f15652iJ;
            case 8:
                return this.f15653iK;
            case 9:
                return Integer.valueOf(this.f15654iL);
            case 10:
                return this.f15655iM;
            case 11:
                return this.f15656iN;
            case 12:
                return this.f15657iO;
            case 13:
                return this.f15658iP;
            case 14:
                return this.f15659iQ;
            case 15:
                return this.f15660iR;
            case 16:
                return this.f15661iS;
            case 17:
                return this.f15662iT;
            case 18:
                return this.f15663iU;
            case 19:
                return this.f15664iV;
            case 20:
                return this.f15665iW;
            case 21:
                return this.f15666iX;
            case 22:
                return this.f15667iY;
            case 23:
                return this.f15643di;
            case 24:
                return this.f15668iZ;
            case 25:
                return this.f15671ja;
            case 26:
                return this.f15672jb;
            case 27:
                return this.f15673jc;
            case 28:
                return this.f15674jd;
            case 29:
                return this.f15675je;
            case 30:
                return this.f15676jf;
            case 31:
                return this.f15677jg;
            case 32:
                return this.f15678jh;
            case 33:
                return this.f15679ji;
            case Settings.STATISTIC_ENABLED:
                return this.f15680jj;
            case Settings.SPACE_GET_NEXTWORD:
                return Double.valueOf(this.f15644fy);
            case Settings.AUTOSPACE_ENABLE:
                return this.f15681jk;
            case Settings.SYMBOL_LOCK:
                return Double.valueOf(this.f15645fz);
            case Settings.TOUCH_CORRECT:
                return this.mName;
            case Settings.ENV_WORD:
                return this.f15682jl;
            case Settings.WUBI_COMMITWHENUNIQUE:
                return this.f15683jm;
            case Settings.WUBI_DISPLAYCODE:
                return this.f15684jn;
            case Settings.WUBI_BIGCHARSET:
                return this.f15685jo;
            case Settings.MAX_CACHEINPUTSIZE:
                return this.f15686jp;
            case Settings.EMOJI_ENABLED:
                return this.f15687jq;
            case Settings.CLOUD_ENABLED:
                return this.f15688jr;
            case Settings.AUTO_SAVE_USERWORD:
                return this.f15689js;
            case 48:
                return this.f15690jt;
            case Settings.MIX_LANGUAGE:
                return this.f15691ju;
            case Settings.WESTERN_SENTENCE_ENABLED:
                return this.f15692jv;
            case Settings.SHUANGPIN_CONFIG:
                return this.f15693jw;
            case Settings.AUTO_ADJUST_WORD_PRIORITY:
                return this.f15694jx;
            case Settings.WAVE_ENABLE:
                return this.f15695jy;
            case 54:
                return this.f15669ie;
            case Settings.FORWARD_PREDICTION:
                return this.f15696jz;
            case Settings.SMART_AUTOSPACE:
                return this.f15670jA;
            default:
                throw new IllegalStateException("Unknown safe parcelable id=" + aVar.mo11420aa());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bH */
    public Set<Integer> mo11870bH() {
        return this.f15646iD;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bI */
    public C3723bx mo11871bI() {
        return this.f15647iE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bJ */
    public C3723bx mo11872bJ() {
        return this.f15649iG;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bK */
    public List<C3723bx> mo11873bK() {
        return this.f15653iK;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bL */
    public List<C3723bx> mo11874bL() {
        return this.f15655iM;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bM */
    public C3723bx mo11875bM() {
        return this.f15656iN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bN */
    public List<C3723bx> mo11876bN() {
        return this.f15657iO;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bO */
    public C3723bx mo11877bO() {
        return this.f15660iR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bP */
    public List<C3723bx> mo11878bP() {
        return this.f15664iV;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bQ */
    public C3723bx mo11879bQ() {
        return this.f15675je;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bR */
    public C3723bx mo11880bR() {
        return this.f15680jj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bS */
    public C3723bx mo11881bS() {
        return this.f15681jk;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bT */
    public C3723bx mo11882bT() {
        return this.f15682jl;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bU */
    public List<C3723bx> mo11883bU() {
        return this.f15683jm;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bV */
    public C3723bx mo11884bV() {
        return this.f15688jr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bW */
    public C3723bx mo11885bW() {
        return this.f15692jv;
    }

    /* renamed from: bX */
    public C3723bx freeze() {
        return this;
    }

    public int describeContents() {
        C3724by byVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3723bx)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C3723bx bxVar = (C3723bx) obj;
        for (C3590ae.C3591a next : f15641iC.values()) {
            if (mo11406a(next)) {
                if (!bxVar.mo11406a(next)) {
                    return false;
                }
                if (!mo11407b(next).equals(bxVar.mo11407b(next))) {
                    return false;
                }
            } else if (bxVar.mo11406a(next)) {
                return false;
            }
        }
        return true;
    }

    public ItemScope getAbout() {
        return this.f15647iE;
    }

    public List<String> getAdditionalName() {
        return this.f15648iF;
    }

    public ItemScope getAddress() {
        return this.f15649iG;
    }

    public String getAddressCountry() {
        return this.f15650iH;
    }

    public String getAddressLocality() {
        return this.f15651iI;
    }

    public String getAddressRegion() {
        return this.f15652iJ;
    }

    public List<ItemScope> getAssociated_media() {
        return (ArrayList) this.f15653iK;
    }

    public int getAttendeeCount() {
        return this.f15654iL;
    }

    public List<ItemScope> getAttendees() {
        return (ArrayList) this.f15655iM;
    }

    public ItemScope getAudio() {
        return this.f15656iN;
    }

    public List<ItemScope> getAuthor() {
        return (ArrayList) this.f15657iO;
    }

    public String getBestRating() {
        return this.f15658iP;
    }

    public String getBirthDate() {
        return this.f15659iQ;
    }

    public ItemScope getByArtist() {
        return this.f15660iR;
    }

    public String getCaption() {
        return this.f15661iS;
    }

    public String getContentSize() {
        return this.f15662iT;
    }

    public String getContentUrl() {
        return this.f15663iU;
    }

    public List<ItemScope> getContributor() {
        return (ArrayList) this.f15664iV;
    }

    public String getDateCreated() {
        return this.f15665iW;
    }

    public String getDateModified() {
        return this.f15666iX;
    }

    public String getDatePublished() {
        return this.f15667iY;
    }

    public String getDescription() {
        return this.f15643di;
    }

    public String getDuration() {
        return this.f15668iZ;
    }

    public String getEmbedUrl() {
        return this.f15671ja;
    }

    public String getEndDate() {
        return this.f15672jb;
    }

    public String getFamilyName() {
        return this.f15673jc;
    }

    public String getGender() {
        return this.f15674jd;
    }

    public ItemScope getGeo() {
        return this.f15675je;
    }

    public String getGivenName() {
        return this.f15676jf;
    }

    public String getHeight() {
        return this.f15677jg;
    }

    public String getId() {
        return this.f15678jh;
    }

    public String getImage() {
        return this.f15679ji;
    }

    public ItemScope getInAlbum() {
        return this.f15680jj;
    }

    public double getLatitude() {
        return this.f15644fy;
    }

    public ItemScope getLocation() {
        return this.f15681jk;
    }

    public double getLongitude() {
        return this.f15645fz;
    }

    public String getName() {
        return this.mName;
    }

    public ItemScope getPartOfTVSeries() {
        return this.f15682jl;
    }

    public List<ItemScope> getPerformers() {
        return (ArrayList) this.f15683jm;
    }

    public String getPlayerType() {
        return this.f15684jn;
    }

    public String getPostOfficeBoxNumber() {
        return this.f15685jo;
    }

    public String getPostalCode() {
        return this.f15686jp;
    }

    public String getRatingValue() {
        return this.f15687jq;
    }

    public ItemScope getReviewRating() {
        return this.f15688jr;
    }

    public String getStartDate() {
        return this.f15689js;
    }

    public String getStreetAddress() {
        return this.f15690jt;
    }

    public String getText() {
        return this.f15691ju;
    }

    public ItemScope getThumbnail() {
        return this.f15692jv;
    }

    public String getThumbnailUrl() {
        return this.f15693jw;
    }

    public String getTickerSymbol() {
        return this.f15694jx;
    }

    public String getType() {
        return this.f15695jy;
    }

    public String getUrl() {
        return this.f15669ie;
    }

    public String getWidth() {
        return this.f15696jz;
    }

    public String getWorstRating() {
        return this.f15670jA;
    }

    public boolean hasAbout() {
        return this.f15646iD.contains(2);
    }

    public boolean hasAdditionalName() {
        return this.f15646iD.contains(3);
    }

    public boolean hasAddress() {
        return this.f15646iD.contains(4);
    }

    public boolean hasAddressCountry() {
        return this.f15646iD.contains(5);
    }

    public boolean hasAddressLocality() {
        return this.f15646iD.contains(6);
    }

    public boolean hasAddressRegion() {
        return this.f15646iD.contains(7);
    }

    public boolean hasAssociated_media() {
        return this.f15646iD.contains(8);
    }

    public boolean hasAttendeeCount() {
        return this.f15646iD.contains(9);
    }

    public boolean hasAttendees() {
        return this.f15646iD.contains(10);
    }

    public boolean hasAudio() {
        return this.f15646iD.contains(11);
    }

    public boolean hasAuthor() {
        return this.f15646iD.contains(12);
    }

    public boolean hasBestRating() {
        return this.f15646iD.contains(13);
    }

    public boolean hasBirthDate() {
        return this.f15646iD.contains(14);
    }

    public boolean hasByArtist() {
        return this.f15646iD.contains(15);
    }

    public boolean hasCaption() {
        return this.f15646iD.contains(16);
    }

    public boolean hasContentSize() {
        return this.f15646iD.contains(17);
    }

    public boolean hasContentUrl() {
        return this.f15646iD.contains(18);
    }

    public boolean hasContributor() {
        return this.f15646iD.contains(19);
    }

    public boolean hasDateCreated() {
        return this.f15646iD.contains(20);
    }

    public boolean hasDateModified() {
        return this.f15646iD.contains(21);
    }

    public boolean hasDatePublished() {
        return this.f15646iD.contains(22);
    }

    public boolean hasDescription() {
        return this.f15646iD.contains(23);
    }

    public boolean hasDuration() {
        return this.f15646iD.contains(24);
    }

    public boolean hasEmbedUrl() {
        return this.f15646iD.contains(25);
    }

    public boolean hasEndDate() {
        return this.f15646iD.contains(26);
    }

    public boolean hasFamilyName() {
        return this.f15646iD.contains(27);
    }

    public boolean hasGender() {
        return this.f15646iD.contains(28);
    }

    public boolean hasGeo() {
        return this.f15646iD.contains(29);
    }

    public boolean hasGivenName() {
        return this.f15646iD.contains(30);
    }

    public boolean hasHeight() {
        return this.f15646iD.contains(31);
    }

    public boolean hasId() {
        return this.f15646iD.contains(32);
    }

    public boolean hasImage() {
        return this.f15646iD.contains(33);
    }

    public boolean hasInAlbum() {
        return this.f15646iD.contains(34);
    }

    public boolean hasLatitude() {
        return this.f15646iD.contains(36);
    }

    public boolean hasLocation() {
        return this.f15646iD.contains(37);
    }

    public boolean hasLongitude() {
        return this.f15646iD.contains(38);
    }

    public boolean hasName() {
        return this.f15646iD.contains(39);
    }

    public boolean hasPartOfTVSeries() {
        return this.f15646iD.contains(40);
    }

    public boolean hasPerformers() {
        return this.f15646iD.contains(41);
    }

    public boolean hasPlayerType() {
        return this.f15646iD.contains(42);
    }

    public boolean hasPostOfficeBoxNumber() {
        return this.f15646iD.contains(43);
    }

    public boolean hasPostalCode() {
        return this.f15646iD.contains(44);
    }

    public boolean hasRatingValue() {
        return this.f15646iD.contains(45);
    }

    public boolean hasReviewRating() {
        return this.f15646iD.contains(46);
    }

    public boolean hasStartDate() {
        return this.f15646iD.contains(47);
    }

    public boolean hasStreetAddress() {
        return this.f15646iD.contains(48);
    }

    public boolean hasText() {
        return this.f15646iD.contains(49);
    }

    public boolean hasThumbnail() {
        return this.f15646iD.contains(50);
    }

    public boolean hasThumbnailUrl() {
        return this.f15646iD.contains(51);
    }

    public boolean hasTickerSymbol() {
        return this.f15646iD.contains(52);
    }

    public boolean hasType() {
        return this.f15646iD.contains(53);
    }

    public boolean hasUrl() {
        return this.f15646iD.contains(54);
    }

    public boolean hasWidth() {
        return this.f15646iD.contains(55);
    }

    public boolean hasWorstRating() {
        return this.f15646iD.contains(56);
    }

    public int hashCode() {
        int i = 0;
        Iterator<C3590ae.C3591a<?, ?>> it = f15641iC.values().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            C3590ae.C3591a next = it.next();
            if (mo11406a(next)) {
                i = mo11407b(next).hashCode() + i2 + next.mo11420aa();
            } else {
                i = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo11998i() {
        return this.f15642ab;
    }

    public boolean isDataValid() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Object mo11408m(String str) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo11409n(String str) {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3724by byVar = CREATOR;
        C3724by.m16352a(this, parcel, i);
    }
}
