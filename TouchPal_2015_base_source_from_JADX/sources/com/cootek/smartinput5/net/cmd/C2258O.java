package com.cootek.smartinput5.net.cmd;

import com.cootek.smartinput5.func.C1593bR;

/* renamed from: com.cootek.smartinput5.net.cmd.O */
/* compiled from: HttpCmd */
public enum C2258O {
    QUERY_NEW_VERSION(C2261Q.f9812r, ""),
    HOT_WORDS(C2261Q.f9813s, C2261Q.f9809o),
    QUERY_HOT_WORDS_DICTS(C2261Q.f9814t, C2261Q.f9809o),
    BUBBLE_LATEST(C2261Q.f9815u, C2261Q.f9809o),
    BUBBLE_QUERY(C2261Q.f9816v, C2261Q.f9809o),
    UPLOAD_TYPINGSPEED(C2261Q.f9817w, C2261Q.f9810p),
    UPLOAD_SPEED_INFO(C2261Q.f9818x, C2261Q.f9810p),
    QUERY_SPEED_INFO(C2261Q.f9819y, C2261Q.f9810p),
    STATISTIC_ACTIVE(C2261Q.f9820z, C2261Q.f9811q),
    STATISTIC_USAGE(C2261Q.f9753A, C2261Q.f9811q),
    STATISTIC_PROMOTION(C2261Q.f9754B, C2261Q.f9811q),
    PROMOTION_FILE(C2261Q.f9755C, C2261Q.f9811q),
    UPLOAD_LOG(C2261Q.f9756D, C2261Q.f9811q),
    UPLOAD_INFO(C2261Q.f9757E, C2261Q.f9811q),
    UPLOAD_HISTORY(C2261Q.f9758F, C2261Q.f9811q),
    LOCATION(C2261Q.f9759G, C2261Q.f9811q),
    QUERY_CONFIG(C2261Q.f9760H, C2261Q.f9811q),
    CHECK_CALL_LOG(C2261Q.f9761I, C2261Q.f9811q),
    UPLOAD_USER_INPUT_DATA(C2261Q.f9762J, C2261Q.f9811q),
    QUERY_STORE_INFO("/store/get", C2261Q.f9811q),
    QUERY_GOODS_INFO(C2261Q.f9764L, C2261Q.f9811q),
    CREATE_PURCHASE_ORDER(C2261Q.f9765M, C2261Q.f9811q),
    PURCHASE_UPDATE(C2261Q.f9766N, C2261Q.f9811q),
    CANCEL_PURCHASE(C2261Q.f9767O, C2261Q.f9811q),
    LOAD_PURCHASE_CHANNEL(C2261Q.f9768P, C2261Q.f9811q),
    PURCHASE_CHANNEL_ERROR(C2261Q.f9769Q, C2261Q.f9811q),
    ACTIVATE(C2261Q.f9770R, C2261Q.f9811q),
    LOGIN(C2261Q.f9771S, C2261Q.f9811q),
    LOGOUT(C2261Q.f9772T, C2261Q.f9811q),
    REGISTER(C2261Q.f9773U, C2261Q.f9811q),
    AUTH_INFO(C2261Q.f9774V, C2261Q.f9811q),
    FIND_PWD(C2261Q.f9775W, C2261Q.f9811q),
    BK_SYNC_LIST(C2261Q.f9776X, C2261Q.f9811q),
    BK_INFO(C2261Q.f9777Y, C2261Q.f9811q),
    BK_CONFIRM(C2261Q.f9778Z, C2261Q.f9811q),
    BK_RESTORE(C2261Q.f9780aa, C2261Q.f9811q),
    BK_CLEAR(C2261Q.f9781ab, C2261Q.f9811q),
    SMART_SEARCH(C2261Q.f9782ac, C2261Q.f9811q),
    GET_NATIVE_ADS(C2261Q.f9783ad, C2261Q.f9811q),
    BATCH_GET_NATIVE_ADS(C2261Q.f9784ae, C2261Q.f9811q),
    LOOKUP_DOMAIN(C2261Q.f9785af, C2261Q.f9811q),
    UNINSITALL_SURVEY(C2261Q.f9786ag, C2261Q.f9811q),
    GET_SPONSOR_THEME("/store/get", C2261Q.f9811q),
    GET_RECOMMENDED(C2261Q.f9788ai, "");
    

    /* renamed from: S */
    private final String f9736S;

    /* renamed from: T */
    private final String f9737T;

    private C2258O(String str, String str2) {
        this.f9737T = str;
        this.f9736S = str2;
    }

    /* renamed from: a */
    public String mo7825a(int i) {
        return mo7826b(i) + mo7824a();
    }

    /* renamed from: a */
    public String mo7824a() {
        return this.f9737T;
    }

    /* renamed from: b */
    public String mo7826b(int i) {
        if (m10307c(i)) {
            return this.f9736S;
        }
        return "";
    }

    /* renamed from: c */
    private boolean m10307c(int i) {
        if (i != 2 || !C1593bR.m7162a().f5076b) {
            return false;
        }
        return true;
    }
}
