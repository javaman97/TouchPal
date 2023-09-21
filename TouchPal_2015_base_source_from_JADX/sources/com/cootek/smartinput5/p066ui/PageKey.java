package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.PageKey */
public class PageKey extends C2806cb {
    public PageKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2766bq(this);
    }

    public void setPageHint(String str) {
        this.mSoftKeyInfo.mainTitle = str;
        this.mKeyboard.f12546S.mo8732a((C2806cb) this);
    }
}
