package com.cootek.smartinput5.func.p054d;

import com.cootek.smartinput5.engine.InputContext;
import com.cootek.smartinput5.engine.SibCandidateItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.d.a */
/* compiled from: CommitAction */
public class C1705a implements C1708d {

    /* renamed from: a */
    protected InputContext f5554a;

    /* renamed from: b */
    protected InputContext f5555b;

    /* renamed from: c */
    protected String f5556c;

    /* renamed from: d */
    protected String f5557d;

    /* renamed from: e */
    protected ArrayList<String> f5558e = new ArrayList<>();

    /* renamed from: f */
    protected int f5559f;

    /* renamed from: g */
    protected int f5560g;

    /* renamed from: h */
    protected String f5561h;

    /* renamed from: i */
    protected String f5562i;

    /* renamed from: j */
    protected int f5563j;

    /* renamed from: k */
    protected ArrayList<SibCandidateItem> f5564k = new ArrayList<>();

    /* renamed from: l */
    protected boolean f5565l;

    public C1705a(InputContext inputContext, InputContext inputContext2, String str, String str2, ArrayList<String> arrayList, int i, int i2, String str3, String str4, int i3, ArrayList<SibCandidateItem> arrayList2, boolean z) {
        this.f5554a = inputContext;
        this.f5555b = inputContext2;
        this.f5556c = str;
        this.f5557d = str2;
        this.f5558e = new ArrayList<>(arrayList);
        this.f5559f = i;
        this.f5560g = i2;
        this.f5561h = str3;
        this.f5562i = str4;
        this.f5563j = i3;
        this.f5564k = new ArrayList<>(arrayList2);
        this.f5565l = z;
    }

    public C1705a() {
    }

    /* renamed from: a */
    public void mo6600a(InputContext inputContext) {
        this.f5554a = inputContext;
    }

    /* renamed from: b */
    public void mo6606b(InputContext inputContext) {
        this.f5555b = inputContext;
    }

    /* renamed from: a */
    public void mo6601a(String str) {
        this.f5556c = str;
    }

    /* renamed from: b */
    public void mo6607b(String str) {
        this.f5557d = str;
    }

    /* renamed from: a */
    public void mo6602a(ArrayList<String> arrayList) {
        this.f5558e = new ArrayList<>(arrayList);
    }

    /* renamed from: a */
    public void mo6599a(int i) {
        this.f5559f = i;
    }

    /* renamed from: b */
    public void mo6605b(int i) {
        this.f5560g = i;
    }

    /* renamed from: c */
    public void mo6611c(String str) {
        this.f5561h = str;
    }

    /* renamed from: d */
    public void mo6613d(String str) {
        this.f5562i = str;
    }

    /* renamed from: c */
    public void mo6610c(int i) {
        this.f5563j = i;
    }

    /* renamed from: b */
    public void mo6608b(ArrayList<SibCandidateItem> arrayList) {
        this.f5564k = new ArrayList<>(arrayList);
    }

    /* renamed from: a */
    public void mo6603a(boolean z) {
        this.f5565l = z;
    }

    /* renamed from: a */
    public InputContext mo6598a() {
        return this.f5554a;
    }

    /* renamed from: b */
    public InputContext mo6604b() {
        return this.f5555b;
    }

    /* renamed from: c */
    public String mo6609c() {
        return this.f5556c;
    }

    /* renamed from: d */
    public String mo6612d() {
        return this.f5557d;
    }

    /* renamed from: e */
    public ArrayList<String> mo6614e() {
        return this.f5558e;
    }

    /* renamed from: f */
    public int mo6615f() {
        return this.f5559f;
    }

    /* renamed from: g */
    public int mo6616g() {
        return this.f5560g;
    }

    /* renamed from: h */
    public String mo6617h() {
        return this.f5561h;
    }

    /* renamed from: i */
    public String mo6618i() {
        return this.f5562i;
    }

    /* renamed from: j */
    public int mo6619j() {
        return this.f5563j;
    }

    /* renamed from: k */
    public ArrayList<SibCandidateItem> mo6620k() {
        return this.f5564k;
    }

    /* renamed from: l */
    public boolean mo6621l() {
        return this.f5565l;
    }

    /* renamed from: m */
    public int mo6622m() {
        return 1;
    }

    /* renamed from: n */
    public JSONObject mo6623n() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("efip", this.f5554a.toJSONObject());
            jSONObject2.put("lwip", this.f5555b.toJSONObject());
            jSONObject2.put("op", this.f5556c);
            jSONObject2.put("ev", this.f5557d);
            if (!this.f5558e.isEmpty()) {
                jSONObject2.put("hs", new JSONArray(this.f5558e));
            }
            jSONObject2.put("tag", this.f5559f);
            jSONObject2.put("corr", this.f5560g);
            jSONObject2.put("lang", this.f5561h);
            jSONObject2.put("df", this.f5562i);
            jSONObject2.put("wrtm", this.f5563j);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f5564k.size(); i++) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("text", this.f5564k.get(i).getText());
                jSONObject3.put("tag", this.f5564k.get(i).getTag());
                jSONArray.put(jSONObject3);
            }
            if (jSONArray.length() > 0) {
                jSONObject2.put("sib", jSONArray);
            }
            jSONObject2.put("act", this.f5565l);
            jSONObject.put("cm", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }
}
