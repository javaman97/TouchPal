package com.yahoo.mobile.client.share.search.p098c;

import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.suggest.IRanking;

/* renamed from: com.yahoo.mobile.client.share.search.c.a */
public final class C4093a implements IRanking {

    /* renamed from: a */
    long f16578a = -1;

    /* renamed from: b */
    String f16579b;

    /* renamed from: c */
    String f16580c;

    /* renamed from: d */
    long f16581d = 1;

    /* renamed from: e */
    long f16582e;

    /* renamed from: f */
    C4093a f16583f;

    public final /* synthetic */ int compareTo(Object obj) {
        IRanking iRanking = (IRanking) obj;
        if (iRanking == null) {
            return 1;
        }
        C4093a aVar = (C4093a) iRanking;
        int d = m17337d();
        int d2 = aVar.m17337d();
        if (d != d2) {
            return d2 - d;
        }
        long c = m17336c() - aVar.m17336c();
        return c == 0 ? (int) (m17335b() - aVar.m17335b()) : (int) c;
    }

    public C4093a(String str, String str2) {
        this.f16579b = str;
        this.f16580c = str2;
        this.f16582e = System.currentTimeMillis();
    }

    public C4093a(long j, String str, String str2, long j2, long j3) {
        this.f16578a = j;
        this.f16579b = str;
        this.f16580c = str2;
        this.f16581d = j2;
        this.f16582e = j3;
    }

    /* renamed from: a */
    public static long m17334a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - j;
        if (j2 < 259200000) {
            return currentTimeMillis - 259200000;
        }
        if (j2 < Utils.WEEK_MILLIS) {
            return currentTimeMillis - Utils.WEEK_MILLIS;
        }
        if (j2 < 1209600000) {
            return currentTimeMillis - 1209600000;
        }
        if (j2 < 2592000000L) {
            return currentTimeMillis - 2592000000L;
        }
        return 0;
    }

    public final String getItemId() {
        return this.f16579b;
    }

    /* renamed from: a */
    public final void mo15064a() {
        this.f16582e = System.currentTimeMillis();
        this.f16581d++;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4093a)) {
            return false;
        }
        C4093a aVar = (C4093a) obj;
        if (this.f16581d != aVar.f16581d) {
            return false;
        }
        if (this.f16578a != aVar.f16578a) {
            return false;
        }
        if (this.f16582e != aVar.f16582e) {
            return false;
        }
        if (!this.f16579b.equals(aVar.f16579b)) {
            return false;
        }
        if (this.f16580c != null) {
            if (this.f16580c.equals(aVar.f16580c)) {
                return true;
            }
        } else if (aVar.f16580c == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f16580c != null ? this.f16580c.hashCode() : 0) + (((((int) (this.f16578a ^ (this.f16578a >>> 32))) * 31) + this.f16579b.hashCode()) * 31)) * 31) + ((int) (this.f16581d ^ (this.f16581d >>> 32)))) * 31) + ((int) (this.f16582e ^ (this.f16582e >>> 32)));
    }

    /* renamed from: b */
    private long m17335b() {
        long j = this.f16582e;
        if (this.f16583f != null) {
            return Math.max(j, this.f16583f.f16582e);
        }
        return j;
    }

    /* renamed from: c */
    private long m17336c() {
        return this.f16583f == null ? this.f16581d : this.f16581d + this.f16583f.f16581d;
    }

    /* renamed from: d */
    private int m17337d() {
        long currentTimeMillis = System.currentTimeMillis() - m17335b();
        if (currentTimeMillis < 259200000) {
            return 0;
        }
        if (currentTimeMillis < Utils.WEEK_MILLIS) {
            return 1;
        }
        if (currentTimeMillis < 1209600000) {
            return 2;
        }
        if (currentTimeMillis < 2592000000L) {
            return 3;
        }
        return 4;
    }

    public final String getType() {
        return this.f16580c;
    }

    /* renamed from: a */
    public final void mo15065a(C4093a aVar) {
        this.f16583f = aVar;
    }
}
