package com.cootek.p042a.p043a;

import com.cootek.p042a.p043a.C0905h;
import com.cootek.smartinput5.func.nativeads.C1899v;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.a.a.d */
/* compiled from: PerfData */
class C0900d {

    /* renamed from: a */
    private C0905h f2415a;

    /* renamed from: b */
    private StringBuilder f2416b;

    /* renamed from: c */
    private TreeMap<Long, JSONArray> f2417c;

    public C0900d(C0905h.C0907b bVar) {
        this.f2415a = new C0905h(bVar, this);
        mo3391a();
    }

    /* renamed from: a */
    public void mo3391a() {
        this.f2416b = new StringBuilder();
        this.f2417c = new TreeMap<>(new C0901e(this));
    }

    /* renamed from: b */
    public boolean mo3394b() {
        return this.f2415a.mo3425b();
    }

    /* renamed from: c */
    public JSONObject mo3395c() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0905h mo3396d() {
        return this.f2415a;
    }

    /* renamed from: a */
    public String mo3390a(C0898b[] bVarArr) {
        long j;
        String format;
        String format2;
        String format3;
        if (bVarArr == null || bVarArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%20s\t", new Object[]{""}));
        sb.append(String.format("%6s\t", new Object[]{"%"}));
        sb.append(String.format("%6s\t", new Object[]{"total"}));
        sb.append(String.format("%6s\t", new Object[]{"avg"}));
        sb.append(String.format("%6s\t", new Object[]{"avg c"}));
        int[] iArr = this.f2415a.f2437b.f2452e;
        Hashtable<C0898b, C0905h.C0908c> hashtable = this.f2415a.f2438c;
        for (int i = 0; i < iArr.length; i++) {
            sb.append(String.format("%6d\t", new Object[]{Integer.valueOf(iArr[i])}));
        }
        sb.append(C0911j.f2473c);
        sb.append(C0911j.f2473c);
        long j2 = (long) hashtable.get(C0898b.INNER).f2460d;
        long j3 = hashtable.get(C0898b.INNER).f2461e;
        long j4 = hashtable.get(C0898b.ROOT).f2461e;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < bVarArr.length) {
                if (i3 <= C0898b.INNER.ordinal()) {
                    j = j4;
                } else {
                    j = j3;
                }
                C0898b bVar = bVarArr[i3];
                C0905h.C0908c cVar = hashtable.get(bVar);
                sb.append(String.format("%20s\t", new Object[]{bVar.name()}));
                Object[] objArr = new Object[1];
                if (cVar.f2461e == 0) {
                    format = "";
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = Double.valueOf(j == 0 ? 0.0d : (((double) cVar.f2461e) * 100.0d) / ((double) j));
                    format = String.format("%5.1f%%", objArr2);
                }
                objArr[0] = format;
                sb.append(String.format("%6s\t", objArr));
                Object[] objArr3 = new Object[1];
                objArr3[0] = cVar.f2460d == 0 ? "" : String.format("%6d", new Object[]{Integer.valueOf(cVar.f2460d)});
                sb.append(String.format("%6s\t", objArr3));
                Object[] objArr4 = new Object[1];
                if (cVar.f2461e == 0) {
                    format2 = "";
                } else {
                    Object[] objArr5 = new Object[1];
                    objArr5[0] = Float.valueOf(cVar.f2460d == 0 ? 0.0f : ((float) ((cVar.f2461e / ((long) cVar.f2460d)) / 100000)) / 10.0f);
                    format2 = String.format("%6.1f", objArr5);
                }
                objArr4[0] = format2;
                sb.append(String.format("%6s\t", objArr4));
                Object[] objArr6 = new Object[1];
                if (cVar.f2460d == 0) {
                    format3 = "";
                } else {
                    Object[] objArr7 = new Object[1];
                    objArr7[0] = Double.valueOf(j2 == 0 ? 0.0d : ((double) cVar.f2460d) / ((double) j2));
                    format3 = String.format("%6.1f", objArr7);
                }
                objArr6[0] = format3;
                sb.append(String.format("%6s\t", objArr6));
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    int i5 = cVar.f2459c[i4];
                    Object[] objArr8 = new Object[1];
                    objArr8[0] = i5 == 0 ? "" : Integer.toString(i5);
                    sb.append(String.format("%6s\t", objArr8));
                }
                sb.append(C0911j.f2473c);
                if (i3 == C0898b.INNER.ordinal()) {
                    sb.append(C0911j.f2473c);
                }
                i2 = i3 + 1;
            } else {
                sb.append(C0911j.f2473c);
                sb.append(C0911j.f2473c);
                return sb.toString();
            }
        }
    }

    /* renamed from: e */
    public String mo3397e() {
        if (this.f2415a.f2438c == null) {
            return null;
        }
        if (this.f2415a.f2438c.get(C0898b.INNER).f2460d == 0) {
            return "";
        }
        this.f2415a.mo3431f();
        StringBuilder sb = new StringBuilder();
        sb.append(C0911j.f2473c);
        C0905h.C0907b bVar = this.f2415a.f2437b;
        sb.append(bVar.f2448a);
        sb.append(C0911j.f2473c);
        C0898b[] bVarArr = new C0898b[(bVar.f2453f.length + 2)];
        bVarArr[0] = C0898b.ROOT;
        bVarArr[1] = C0898b.INNER;
        System.arraycopy(bVar.f2453f, 0, bVarArr, 2, bVarArr.length - 2);
        sb.append(mo3390a(bVarArr));
        sb.append(mo3390a(bVar.f2454g));
        long nanoTime = System.nanoTime();
        sb.append(mo3399g());
        long nanoTime2 = System.nanoTime() - nanoTime;
        sb.append(C0911j.f2473c);
        sb.append(String.format(" cost=[%5.1f]", new Object[]{Float.valueOf(((float) (nanoTime2 / 100000)) / 10.0f)}));
        sb.append(C0911j.f2473c);
        sb.append(this.f2416b);
        return sb.toString();
    }

    /* renamed from: f */
    public JSONArray mo3398f() {
        JSONArray jSONArray = new JSONArray();
        Hashtable<C0898b, C0905h.C0908c> hashtable = this.f2415a.f2438c;
        int i = 0;
        while (i < C0898b.values().length && i <= C0898b.PROCESS_EVENT.ordinal()) {
            JSONArray jSONArray2 = new JSONArray();
            C0905h.C0908c cVar = hashtable.get(C0898b.values()[i]);
            jSONArray2.put(cVar.f2460d);
            jSONArray2.put(cVar.f2460d == 0 ? 0 : C0911j.m4978d(cVar.f2461e / ((long) cVar.f2460d)));
            int length = cVar.f2459c.length - 1;
            while (true) {
                if (length <= 0) {
                    length = -1;
                    break;
                } else if (cVar.f2459c[length] != 0) {
                    break;
                } else {
                    length--;
                }
            }
            int i2 = 0;
            while (i2 < cVar.f2459c.length && i2 <= length) {
                jSONArray2.put(cVar.f2459c[i2]);
                i2++;
            }
            jSONArray.put(jSONArray2);
            i++;
        }
        return jSONArray;
    }

    /* renamed from: g */
    public JSONObject mo3399g() {
        if (this.f2415a.f2438c.get(C0898b.INNER).f2460d == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("group", mo3398f());
            jSONObject.put(C1899v.f6362a, this.f2415a.f2438c.get(C0898b.INNER).f2460d);
            if (mo3400h() > 0) {
                JSONArray jSONArray = new JSONArray();
                int i = 0;
                for (JSONArray put : this.f2417c.values()) {
                    int i2 = i + 1;
                    if (i >= 10) {
                        break;
                    }
                    jSONArray.put(put);
                    i = i2;
                }
                jSONObject.put("lags", jSONArray);
                jSONObject.put("lags_count", mo3400h());
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    /* renamed from: h */
    public int mo3400h() {
        return this.f2417c.size();
    }

    /* renamed from: a */
    public void mo3392a(long j) {
        int i;
        int i2;
        int i3 = 0;
        new StringBuilder();
        C0905h.C0909d[] dVarArr = new C0905h.C0909d[this.f2415a.f2439d.length];
        System.arraycopy(this.f2415a.f2439d, 0, dVarArr, 0, this.f2415a.f2439d.length);
        try {
            Arrays.sort(dVarArr);
        } catch (IllegalArgumentException e) {
        }
        C0905h.C0907b bVar = this.f2415a.f2437b;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(C0911j.m4978d(j));
        JSONArray jSONArray2 = new JSONArray();
        int length = dVarArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            C0905h.C0909d dVar = dVarArr[i4];
            if (this.f2415a.mo3427c(dVar.f2462a)) {
                i2 = i5 + 1;
                if (i5 < bVar.f2450c) {
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(dVar.f2462a.ordinal());
                    jSONArray3.put(C0911j.m4978d(dVar.f2463b));
                    jSONArray3.put(dVar.f2464c);
                    jSONArray2.put(jSONArray3);
                }
            } else {
                i2 = i5;
            }
            i4++;
            i5 = i2;
        }
        jSONArray.put(jSONArray2);
        JSONArray jSONArray4 = new JSONArray();
        int length2 = dVarArr.length;
        int i6 = 0;
        while (i3 < length2) {
            C0905h.C0909d dVar2 = dVarArr[i3];
            if (this.f2415a.mo3429d(dVar2.f2462a)) {
                i = i6 + 1;
                if (i6 < bVar.f2451d) {
                    JSONArray jSONArray5 = new JSONArray();
                    jSONArray5.put(dVar2.f2462a.ordinal());
                    jSONArray5.put(C0911j.m4978d(dVar2.f2463b));
                    jSONArray5.put(dVar2.f2464c);
                    jSONArray4.put(jSONArray5);
                }
            } else {
                i = i6;
            }
            i3++;
            i6 = i;
        }
        if (jSONArray4.length() > 0) {
            jSONArray.put(jSONArray4);
        }
        this.f2417c.put(Long.valueOf(j), jSONArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3393a(String str) {
        this.f2416b.append(str);
        this.f2416b.append(C0911j.f2473c);
    }
}
