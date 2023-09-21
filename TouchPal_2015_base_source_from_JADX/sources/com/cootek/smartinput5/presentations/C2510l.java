package com.cootek.smartinput5.presentations;

import com.cootek.smartinput5.p066ui.p067a.C2658c;
import com.cootek.smartinput5.presentations.C2503g;
import com.cootek.smartinput5.presentations.p064a.C2490b;

/* renamed from: com.cootek.smartinput5.presentations.l */
/* compiled from: ExtensionJudgeFactory */
public class C2510l implements C2503g.C2505b {

    /* renamed from: a */
    private C2490b f10818a = new C2490b();

    /* renamed from: a */
    public C2503g.C2504a mo8303a(String str) {
        C2658c cVar;
        try {
            cVar = (C2658c) Enum.valueOf(C2658c.class, str);
        } catch (NullPointerException e) {
            e.printStackTrace();
            cVar = null;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            cVar = null;
        }
        if (cVar != null) {
            return cVar.mo8892a();
        }
        return this.f10818a;
    }
}
