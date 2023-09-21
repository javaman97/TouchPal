package com.cootek.smartinput5.net.cmd;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CmdCheckCallLog extends C2259P {

    /* renamed from: a */
    public static final String f9488a = "CmdCheckCallLog";

    /* renamed from: d */
    private static final String f9489d = "res";

    /* renamed from: e */
    private static final String f9490e = "phone";

    /* renamed from: f */
    private static final String f9491f = "classify_type";

    /* renamed from: g */
    private static final String f9492g = "shop_name";

    /* renamed from: h */
    private static final String f9493h = "house agent";

    /* renamed from: i */
    private static final String f9494i = "insurance";

    /* renamed from: j */
    private static final String f9495j = "financial products";

    /* renamed from: k */
    private static final String f9496k = "headhunting";

    /* renamed from: l */
    private static final String f9497l = "promote sales";

    /* renamed from: m */
    private static final String f9498m = "repair";

    /* renamed from: n */
    private static final String f9499n = "book hotel/airline";

    /* renamed from: o */
    private static final String f9500o = "public services";

    /* renamed from: p */
    private static final String f9501p = "fraud";

    /* renamed from: q */
    private static final String f9502q = "crank";

    /* renamed from: r */
    private static final String f9503r = "express";

    /* renamed from: b */
    private ArrayList<String> f9504b = new ArrayList<>();

    /* renamed from: c */
    private ArrayList<CheckResult> f9505c;

    /* renamed from: a */
    public void mo7778a(String str) {
        this.f9504b.add(str);
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.CHECK_CALL_LOG.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9740L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("survey", "false");
        jSONObject.put(f9490e, m10177m());
        return super.mo7764a(jSONObject);
    }

    /* renamed from: m */
    private JSONArray m10177m() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.f9504b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        String str;
        String str2;
        String str3;
        if (jSONObject != null && jSONObject.has(f9489d) && (jSONArray = jSONObject.getJSONArray(f9489d)) != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has(f9490e)) {
                    str = jSONObject2.getString(f9490e);
                } else {
                    str = null;
                }
                if (jSONObject2.has(f9491f)) {
                    str2 = m10176b(jSONObject2.getString(f9491f));
                } else {
                    str2 = null;
                }
                if (jSONObject2.has(f9492g)) {
                    str3 = jSONObject2.getString(f9492g);
                } else {
                    str3 = null;
                }
                if (!TextUtils.isEmpty(str) && (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3))) {
                    if (this.f9505c == null) {
                        this.f9505c = new ArrayList<>();
                    }
                    CheckResult checkResult = new CheckResult();
                    checkResult.f9506a = str;
                    checkResult.f9507b = str2;
                    checkResult.f9508c = str3;
                    this.f9505c.add(checkResult);
                }
            }
        }
    }

    /* renamed from: b */
    private String m10176b(String str) {
        int i;
        if (f9493h.equals(str)) {
            i = R.string.callerinfo_type_house_agent;
        } else if (f9494i.equals(str)) {
            i = R.string.callerinfo_type_insurance;
        } else if (f9495j.equals(str)) {
            i = R.string.callerinfo_type_financial_products;
        } else if (f9496k.equals(str)) {
            i = R.string.callerinfo_type_headhunting;
        } else if (f9497l.equals(str)) {
            i = R.string.callerinfo_type_promote_sales;
        } else if (f9498m.equals(str)) {
            i = R.string.callerinfo_type_repair;
        } else if (f9499n.equals(str)) {
            i = R.string.callerinfo_type_book_hotel_airline;
        } else if (f9500o.equals(str)) {
            i = R.string.callerinfo_type_public_services;
        } else if (f9501p.equals(str)) {
            i = R.string.callerinfo_type_fraud;
        } else if (f9502q.equals(str)) {
            i = R.string.callerinfo_type_crank;
        } else if (f9503r.equals(str)) {
            i = R.string.callerinfo_type_express;
        } else {
            i = -1;
        }
        if (i != -1) {
            return C1974m.m9063a(C1368X.m6313b(), i);
        }
        return null;
    }

    /* renamed from: j */
    public ArrayList<CheckResult> mo7779j() {
        return this.f9505c;
    }

    /* renamed from: l */
    public String mo7780l() {
        return "CmdCheckCL";
    }

    public static class CheckResult implements Parcelable {
        public static final Parcelable.Creator<CheckResult> CREATOR = new C2288k();

        /* renamed from: a */
        public String f9506a;

        /* renamed from: b */
        public String f9507b;

        /* renamed from: c */
        public String f9508c;

        public CheckResult() {
            this.f9506a = "";
            this.f9507b = "";
            this.f9508c = "";
        }

        private CheckResult(Parcel parcel) {
            mo7781a(parcel);
        }

        public String toString() {
            return "phone number: " + this.f9506a + " classifyType: " + this.f9507b + " shopName: " + this.f9508c;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: a */
        public void mo7781a(Parcel parcel) {
            this.f9506a = parcel.readString();
            this.f9507b = parcel.readString();
            this.f9508c = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f9506a);
            parcel.writeString(this.f9507b);
            parcel.writeString(this.f9508c);
        }
    }
}
