package com.cootek.smartinput5.plugin.twitter;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.plugin.twitter.i */
/* compiled from: OAuthParameters */
public class C2408i {

    /* renamed from: a */
    private Bundle f10541a = new Bundle();

    /* renamed from: b */
    private List<String> f10542b = new ArrayList();

    /* renamed from: a */
    public void mo8136a(String str, String str2) {
        if (this.f10542b.contains(str)) {
            this.f10541a.putString(str, str2);
            return;
        }
        this.f10542b.add(str);
        this.f10541a.putString(str, str2);
    }

    /* renamed from: a */
    public void mo8135a(String str) {
        this.f10542b.remove(str);
        this.f10541a.remove(str);
    }

    /* renamed from: a */
    public void mo8133a(int i) {
        String str = this.f10542b.get(i);
        this.f10541a.remove(str);
        this.f10542b.remove(str);
    }

    /* renamed from: b */
    public int mo8137b(String str) {
        if (this.f10542b.contains(str)) {
            return this.f10542b.indexOf(str);
        }
        return -1;
    }

    /* renamed from: b */
    public String mo8138b(int i) {
        if (i < 0 || i >= this.f10542b.size()) {
            return "";
        }
        return this.f10542b.get(i);
    }

    /* renamed from: c */
    public String mo8141c(String str) {
        return this.f10541a.getString(str);
    }

    /* renamed from: c */
    public String mo8140c(int i) {
        return this.f10541a.getString(this.f10542b.get(i));
    }

    /* renamed from: a */
    public int mo8132a() {
        return this.f10542b.size();
    }

    /* renamed from: a */
    public void mo8134a(C2408i iVar) {
        if (iVar != null) {
            for (int i = 0; i < iVar.mo8132a(); i++) {
                mo8136a(iVar.mo8138b(i), iVar.mo8140c(i));
            }
        }
    }

    /* renamed from: b */
    public void mo8139b() {
        this.f10542b.clear();
        this.f10541a.clear();
    }
}
