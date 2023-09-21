package com.cootek.smartinput5.urlnavigator;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.urlnavigator.f */
/* compiled from: FavoritesManager */
public class C3265f {

    /* renamed from: a */
    public static final String f14360a = "url_navigator";

    /* renamed from: b */
    public static final int f14361b = 16;

    /* renamed from: c */
    public static final String f14362c = "favicon";

    /* renamed from: d */
    public static final String f14363d = "url";

    /* renamed from: e */
    public static final String f14364e = "description";

    /* renamed from: f */
    private Context f14365f;

    /* renamed from: g */
    private SharedPreferences f14366g;

    /* renamed from: h */
    private ArrayList<C3266a> f14367h;

    /* renamed from: i */
    private String[] f14368i = null;

    /* renamed from: j */
    private String[] f14369j = null;

    /* renamed from: com.cootek.smartinput5.urlnavigator.f$a */
    /* compiled from: FavoritesManager */
    interface C3266a {
        /* renamed from: a */
        void mo10455a();
    }

    public C3265f(Context context) {
        this.f14365f = context;
        this.f14366g = context.getSharedPreferences("url_navigator_favorites", 1);
        this.f14367h = new ArrayList<>();
        mo10446a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10446a() {
        this.f14368i = C1974m.m9070b(this.f14365f, R.array.favorite_url_list_url);
        this.f14369j = C1974m.m9070b(this.f14365f, R.array.favorite_url_list_description);
    }

    /* renamed from: a */
    public void mo10447a(C3266a aVar) {
        Iterator<C3266a> it = this.f14367h.iterator();
        while (it.hasNext()) {
            if (it.next() == aVar) {
                return;
            }
        }
        this.f14367h.add(aVar);
    }

    /* renamed from: b */
    public void mo10450b(C3266a aVar) {
        this.f14367h.remove(aVar);
    }

    /* renamed from: b */
    public void mo10449b() {
        Iterator<C3266a> it = this.f14367h.iterator();
        while (it.hasNext()) {
            C3266a next = it.next();
            if (next != null) {
                next.mo10455a();
            }
        }
    }

    /* renamed from: c */
    public File mo10453c() {
        File a = C1466av.m6849a(this.f14365f, f14360a);
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    /* renamed from: a */
    private C3262c m14497a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C3262c cVar = new C3262c();
            cVar.f14354c = jSONObject.optString("url");
            cVar.f14355d = jSONObject.optString("description");
            if (cVar.mo10439a()) {
                return cVar;
            }
            return null;
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: a */
    private String m14498a(C3262c cVar) {
        if (!cVar.mo10439a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", cVar.f14354c);
            jSONObject.put("description", cVar.f14355d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: d */
    public ArrayList<C3262c> mo10454d() {
        ArrayList<C3262c> arrayList = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            arrayList.add(mo10445a(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C3262c mo10445a(int i) {
        int length = this.f14368i.length;
        int length2 = this.f14369j.length;
        String string = this.f14366g.getString(String.valueOf(i), (String) null);
        if (!TextUtils.isEmpty(string)) {
            C3262c a = m14497a(string);
            if (a == null || !a.mo10439a()) {
                return null;
            }
            return a;
        } else if (i >= length) {
            return null;
        } else {
            C3262c cVar = new C3262c();
            cVar.f14354c = this.f14368i[i];
            if (i >= length2) {
                return cVar;
            }
            cVar.f14355d = this.f14369j[i];
            return cVar;
        }
    }

    /* renamed from: a */
    public boolean mo10448a(int i, C3262c cVar) {
        if (i >= 16 || !cVar.mo10439a()) {
            return false;
        }
        boolean commit = this.f14366g.edit().putString(String.valueOf(i), m14498a(cVar)).commit();
        mo10449b();
        return commit;
    }

    /* renamed from: b */
    public boolean mo10451b(int i) {
        boolean commit;
        if (i < this.f14368i.length) {
            commit = this.f14366g.edit().putString(String.valueOf(i), "empty").commit();
        } else {
            commit = this.f14366g.edit().remove(String.valueOf(i)).commit();
        }
        mo10449b();
        return commit;
    }

    /* renamed from: c */
    public int mo10452c(int i) {
        ArrayList<C3262c> d = mo10454d();
        while (i < d.size()) {
            C3262c cVar = d.get(i);
            if (cVar != null && cVar.mo10439a() && !cVar.mo10440a(this)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
