package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.internal.C3723bx;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface ItemScope extends Freezable<ItemScope> {

    public static class Builder {

        /* renamed from: di */
        private String f16148di;

        /* renamed from: fy */
        private double f16149fy;

        /* renamed from: fz */
        private double f16150fz;

        /* renamed from: iD */
        private final Set<Integer> f16151iD = new HashSet();

        /* renamed from: iE */
        private C3723bx f16152iE;

        /* renamed from: iF */
        private List<String> f16153iF;

        /* renamed from: iG */
        private C3723bx f16154iG;

        /* renamed from: iH */
        private String f16155iH;

        /* renamed from: iI */
        private String f16156iI;

        /* renamed from: iJ */
        private String f16157iJ;

        /* renamed from: iK */
        private List<C3723bx> f16158iK;

        /* renamed from: iL */
        private int f16159iL;

        /* renamed from: iM */
        private List<C3723bx> f16160iM;

        /* renamed from: iN */
        private C3723bx f16161iN;

        /* renamed from: iO */
        private List<C3723bx> f16162iO;

        /* renamed from: iP */
        private String f16163iP;

        /* renamed from: iQ */
        private String f16164iQ;

        /* renamed from: iR */
        private C3723bx f16165iR;

        /* renamed from: iS */
        private String f16166iS;

        /* renamed from: iT */
        private String f16167iT;

        /* renamed from: iU */
        private String f16168iU;

        /* renamed from: iV */
        private List<C3723bx> f16169iV;

        /* renamed from: iW */
        private String f16170iW;

        /* renamed from: iX */
        private String f16171iX;

        /* renamed from: iY */
        private String f16172iY;

        /* renamed from: iZ */
        private String f16173iZ;

        /* renamed from: ie */
        private String f16174ie;

        /* renamed from: jA */
        private String f16175jA;

        /* renamed from: ja */
        private String f16176ja;

        /* renamed from: jb */
        private String f16177jb;

        /* renamed from: jc */
        private String f16178jc;

        /* renamed from: jd */
        private String f16179jd;

        /* renamed from: je */
        private C3723bx f16180je;

        /* renamed from: jf */
        private String f16181jf;

        /* renamed from: jg */
        private String f16182jg;

        /* renamed from: jh */
        private String f16183jh;

        /* renamed from: ji */
        private String f16184ji;

        /* renamed from: jj */
        private C3723bx f16185jj;

        /* renamed from: jk */
        private C3723bx f16186jk;

        /* renamed from: jl */
        private C3723bx f16187jl;

        /* renamed from: jm */
        private List<C3723bx> f16188jm;

        /* renamed from: jn */
        private String f16189jn;

        /* renamed from: jo */
        private String f16190jo;

        /* renamed from: jp */
        private String f16191jp;

        /* renamed from: jq */
        private String f16192jq;

        /* renamed from: jr */
        private C3723bx f16193jr;

        /* renamed from: js */
        private String f16194js;

        /* renamed from: jt */
        private String f16195jt;

        /* renamed from: ju */
        private String f16196ju;

        /* renamed from: jv */
        private C3723bx f16197jv;

        /* renamed from: jw */
        private String f16198jw;

        /* renamed from: jx */
        private String f16199jx;

        /* renamed from: jy */
        private String f16200jy;

        /* renamed from: jz */
        private String f16201jz;
        private String mName;

        public ItemScope build() {
            return new C3723bx(this.f16151iD, this.f16152iE, this.f16153iF, this.f16154iG, this.f16155iH, this.f16156iI, this.f16157iJ, this.f16158iK, this.f16159iL, this.f16160iM, this.f16161iN, this.f16162iO, this.f16163iP, this.f16164iQ, this.f16165iR, this.f16166iS, this.f16167iT, this.f16168iU, this.f16169iV, this.f16170iW, this.f16171iX, this.f16172iY, this.f16148di, this.f16173iZ, this.f16176ja, this.f16177jb, this.f16178jc, this.f16179jd, this.f16180je, this.f16181jf, this.f16182jg, this.f16183jh, this.f16184ji, this.f16185jj, this.f16149fy, this.f16186jk, this.f16150fz, this.mName, this.f16187jl, this.f16188jm, this.f16189jn, this.f16190jo, this.f16191jp, this.f16192jq, this.f16193jr, this.f16194js, this.f16195jt, this.f16196ju, this.f16197jv, this.f16198jw, this.f16199jx, this.f16200jy, this.f16174ie, this.f16201jz, this.f16175jA);
        }

        public Builder setAbout(ItemScope itemScope) {
            this.f16152iE = (C3723bx) itemScope;
            this.f16151iD.add(2);
            return this;
        }

        public Builder setAdditionalName(List<String> list) {
            this.f16153iF = list;
            this.f16151iD.add(3);
            return this;
        }

        public Builder setAddress(ItemScope itemScope) {
            this.f16154iG = (C3723bx) itemScope;
            this.f16151iD.add(4);
            return this;
        }

        public Builder setAddressCountry(String str) {
            this.f16155iH = str;
            this.f16151iD.add(5);
            return this;
        }

        public Builder setAddressLocality(String str) {
            this.f16156iI = str;
            this.f16151iD.add(6);
            return this;
        }

        public Builder setAddressRegion(String str) {
            this.f16157iJ = str;
            this.f16151iD.add(7);
            return this;
        }

        public Builder setAssociated_media(List<ItemScope> list) {
            this.f16158iK = list;
            this.f16151iD.add(8);
            return this;
        }

        public Builder setAttendeeCount(int i) {
            this.f16159iL = i;
            this.f16151iD.add(9);
            return this;
        }

        public Builder setAttendees(List<ItemScope> list) {
            this.f16160iM = list;
            this.f16151iD.add(10);
            return this;
        }

        public Builder setAudio(ItemScope itemScope) {
            this.f16161iN = (C3723bx) itemScope;
            this.f16151iD.add(11);
            return this;
        }

        public Builder setAuthor(List<ItemScope> list) {
            this.f16162iO = list;
            this.f16151iD.add(12);
            return this;
        }

        public Builder setBestRating(String str) {
            this.f16163iP = str;
            this.f16151iD.add(13);
            return this;
        }

        public Builder setBirthDate(String str) {
            this.f16164iQ = str;
            this.f16151iD.add(14);
            return this;
        }

        public Builder setByArtist(ItemScope itemScope) {
            this.f16165iR = (C3723bx) itemScope;
            this.f16151iD.add(15);
            return this;
        }

        public Builder setCaption(String str) {
            this.f16166iS = str;
            this.f16151iD.add(16);
            return this;
        }

        public Builder setContentSize(String str) {
            this.f16167iT = str;
            this.f16151iD.add(17);
            return this;
        }

        public Builder setContentUrl(String str) {
            this.f16168iU = str;
            this.f16151iD.add(18);
            return this;
        }

        public Builder setContributor(List<ItemScope> list) {
            this.f16169iV = list;
            this.f16151iD.add(19);
            return this;
        }

        public Builder setDateCreated(String str) {
            this.f16170iW = str;
            this.f16151iD.add(20);
            return this;
        }

        public Builder setDateModified(String str) {
            this.f16171iX = str;
            this.f16151iD.add(21);
            return this;
        }

        public Builder setDatePublished(String str) {
            this.f16172iY = str;
            this.f16151iD.add(22);
            return this;
        }

        public Builder setDescription(String str) {
            this.f16148di = str;
            this.f16151iD.add(23);
            return this;
        }

        public Builder setDuration(String str) {
            this.f16173iZ = str;
            this.f16151iD.add(24);
            return this;
        }

        public Builder setEmbedUrl(String str) {
            this.f16176ja = str;
            this.f16151iD.add(25);
            return this;
        }

        public Builder setEndDate(String str) {
            this.f16177jb = str;
            this.f16151iD.add(26);
            return this;
        }

        public Builder setFamilyName(String str) {
            this.f16178jc = str;
            this.f16151iD.add(27);
            return this;
        }

        public Builder setGender(String str) {
            this.f16179jd = str;
            this.f16151iD.add(28);
            return this;
        }

        public Builder setGeo(ItemScope itemScope) {
            this.f16180je = (C3723bx) itemScope;
            this.f16151iD.add(29);
            return this;
        }

        public Builder setGivenName(String str) {
            this.f16181jf = str;
            this.f16151iD.add(30);
            return this;
        }

        public Builder setHeight(String str) {
            this.f16182jg = str;
            this.f16151iD.add(31);
            return this;
        }

        public Builder setId(String str) {
            this.f16183jh = str;
            this.f16151iD.add(32);
            return this;
        }

        public Builder setImage(String str) {
            this.f16184ji = str;
            this.f16151iD.add(33);
            return this;
        }

        public Builder setInAlbum(ItemScope itemScope) {
            this.f16185jj = (C3723bx) itemScope;
            this.f16151iD.add(34);
            return this;
        }

        public Builder setLatitude(double d) {
            this.f16149fy = d;
            this.f16151iD.add(36);
            return this;
        }

        public Builder setLocation(ItemScope itemScope) {
            this.f16186jk = (C3723bx) itemScope;
            this.f16151iD.add(37);
            return this;
        }

        public Builder setLongitude(double d) {
            this.f16150fz = d;
            this.f16151iD.add(38);
            return this;
        }

        public Builder setName(String str) {
            this.mName = str;
            this.f16151iD.add(39);
            return this;
        }

        public Builder setPartOfTVSeries(ItemScope itemScope) {
            this.f16187jl = (C3723bx) itemScope;
            this.f16151iD.add(40);
            return this;
        }

        public Builder setPerformers(List<ItemScope> list) {
            this.f16188jm = list;
            this.f16151iD.add(41);
            return this;
        }

        public Builder setPlayerType(String str) {
            this.f16189jn = str;
            this.f16151iD.add(42);
            return this;
        }

        public Builder setPostOfficeBoxNumber(String str) {
            this.f16190jo = str;
            this.f16151iD.add(43);
            return this;
        }

        public Builder setPostalCode(String str) {
            this.f16191jp = str;
            this.f16151iD.add(44);
            return this;
        }

        public Builder setRatingValue(String str) {
            this.f16192jq = str;
            this.f16151iD.add(45);
            return this;
        }

        public Builder setReviewRating(ItemScope itemScope) {
            this.f16193jr = (C3723bx) itemScope;
            this.f16151iD.add(46);
            return this;
        }

        public Builder setStartDate(String str) {
            this.f16194js = str;
            this.f16151iD.add(47);
            return this;
        }

        public Builder setStreetAddress(String str) {
            this.f16195jt = str;
            this.f16151iD.add(48);
            return this;
        }

        public Builder setText(String str) {
            this.f16196ju = str;
            this.f16151iD.add(49);
            return this;
        }

        public Builder setThumbnail(ItemScope itemScope) {
            this.f16197jv = (C3723bx) itemScope;
            this.f16151iD.add(50);
            return this;
        }

        public Builder setThumbnailUrl(String str) {
            this.f16198jw = str;
            this.f16151iD.add(51);
            return this;
        }

        public Builder setTickerSymbol(String str) {
            this.f16199jx = str;
            this.f16151iD.add(52);
            return this;
        }

        public Builder setType(String str) {
            this.f16200jy = str;
            this.f16151iD.add(53);
            return this;
        }

        public Builder setUrl(String str) {
            this.f16174ie = str;
            this.f16151iD.add(54);
            return this;
        }

        public Builder setWidth(String str) {
            this.f16201jz = str;
            this.f16151iD.add(55);
            return this;
        }

        public Builder setWorstRating(String str) {
            this.f16175jA = str;
            this.f16151iD.add(56);
            return this;
        }
    }

    ItemScope getAbout();

    List<String> getAdditionalName();

    ItemScope getAddress();

    String getAddressCountry();

    String getAddressLocality();

    String getAddressRegion();

    List<ItemScope> getAssociated_media();

    int getAttendeeCount();

    List<ItemScope> getAttendees();

    ItemScope getAudio();

    List<ItemScope> getAuthor();

    String getBestRating();

    String getBirthDate();

    ItemScope getByArtist();

    String getCaption();

    String getContentSize();

    String getContentUrl();

    List<ItemScope> getContributor();

    String getDateCreated();

    String getDateModified();

    String getDatePublished();

    String getDescription();

    String getDuration();

    String getEmbedUrl();

    String getEndDate();

    String getFamilyName();

    String getGender();

    ItemScope getGeo();

    String getGivenName();

    String getHeight();

    String getId();

    String getImage();

    ItemScope getInAlbum();

    double getLatitude();

    ItemScope getLocation();

    double getLongitude();

    String getName();

    ItemScope getPartOfTVSeries();

    List<ItemScope> getPerformers();

    String getPlayerType();

    String getPostOfficeBoxNumber();

    String getPostalCode();

    String getRatingValue();

    ItemScope getReviewRating();

    String getStartDate();

    String getStreetAddress();

    String getText();

    ItemScope getThumbnail();

    String getThumbnailUrl();

    String getTickerSymbol();

    String getType();

    String getUrl();

    String getWidth();

    String getWorstRating();

    boolean hasAbout();

    boolean hasAdditionalName();

    boolean hasAddress();

    boolean hasAddressCountry();

    boolean hasAddressLocality();

    boolean hasAddressRegion();

    boolean hasAssociated_media();

    boolean hasAttendeeCount();

    boolean hasAttendees();

    boolean hasAudio();

    boolean hasAuthor();

    boolean hasBestRating();

    boolean hasBirthDate();

    boolean hasByArtist();

    boolean hasCaption();

    boolean hasContentSize();

    boolean hasContentUrl();

    boolean hasContributor();

    boolean hasDateCreated();

    boolean hasDateModified();

    boolean hasDatePublished();

    boolean hasDescription();

    boolean hasDuration();

    boolean hasEmbedUrl();

    boolean hasEndDate();

    boolean hasFamilyName();

    boolean hasGender();

    boolean hasGeo();

    boolean hasGivenName();

    boolean hasHeight();

    boolean hasId();

    boolean hasImage();

    boolean hasInAlbum();

    boolean hasLatitude();

    boolean hasLocation();

    boolean hasLongitude();

    boolean hasName();

    boolean hasPartOfTVSeries();

    boolean hasPerformers();

    boolean hasPlayerType();

    boolean hasPostOfficeBoxNumber();

    boolean hasPostalCode();

    boolean hasRatingValue();

    boolean hasReviewRating();

    boolean hasStartDate();

    boolean hasStreetAddress();

    boolean hasText();

    boolean hasThumbnail();

    boolean hasThumbnailUrl();

    boolean hasTickerSymbol();

    boolean hasType();

    boolean hasUrl();

    boolean hasWidth();

    boolean hasWorstRating();
}
