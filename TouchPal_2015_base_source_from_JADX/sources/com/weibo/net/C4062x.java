package com.weibo.net;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.weibo.net.x */
/* compiled from: WeiboParameters */
public class C4062x {

    /* renamed from: a */
    private Bundle f16543a = new Bundle();

    /* renamed from: b */
    private List<String> f16544b = new ArrayList();

    /* renamed from: a */
    public void mo15037a(String str, String str2) {
        if (this.f16544b.contains(str)) {
            this.f16543a.putString(str, str2);
            return;
        }
        this.f16544b.add(str);
        this.f16543a.putString(str, str2);
    }

    /* renamed from: a */
    public void mo15036a(String str) {
        this.f16544b.remove(str);
        this.f16543a.remove(str);
    }

    /* renamed from: a */
    public void mo15034a(int i) {
        String str = this.f16544b.get(i);
        this.f16543a.remove(str);
        this.f16544b.remove(str);
    }

    /* renamed from: b */
    public int mo15038b(String str) {
        if (this.f16544b.contains(str)) {
            return this.f16544b.indexOf(str);
        }
        return -1;
    }

    /* renamed from: b */
    public String mo15039b(int i) {
        if (i < 0 || i >= this.f16544b.size()) {
            return "";
        }
        return this.f16544b.get(i);
    }

    /* renamed from: c */
    public String mo15042c(String str) {
        return this.f16543a.getString(str);
    }

    /* renamed from: c */
    public String mo15041c(int i) {
        return this.f16543a.getString(this.f16544b.get(i));
    }

    /* renamed from: a */
    public int mo15033a() {
        return this.f16544b.size();
    }

    /* renamed from: a */
    public void mo15035a(C4062x xVar) {
        for (int i = 0; i < xVar.mo15033a(); i++) {
            mo15037a(xVar.mo15039b(i), xVar.mo15041c(i));
        }
    }

    /* renamed from: b */
    public void mo15040b() {
        this.f16544b.clear();
        this.f16543a.clear();
    }
}
