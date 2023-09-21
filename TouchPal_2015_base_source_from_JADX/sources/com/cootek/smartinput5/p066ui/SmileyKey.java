package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.smileypanel.C2051e;
import com.cootek.smartinput5.func.smileypanel.p057b.p058a.C2020i;
import com.cootek.smartinput5.func.smileypanel.p062e.C2052a;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.SmileyKey */
public class SmileyKey extends C2806cb {
    private boolean mShowSmileyDrawable;
    private C2051e mSmileyKey;

    public SmileyKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    public SmileyKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar, C2051e eVar) {
        super(resources, cqVar, i, i2, bVar);
        this.mSmileyKey = eVar;
    }

    public SmileyKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar, C2051e eVar, boolean z) {
        super(resources, cqVar, i, i2, bVar);
        this.mSmileyKey = eVar;
        this.mShowSmileyDrawable = z;
        initSmileyKey();
    }

    private void initSmileyKey() {
        if (this.mSmileyKey != null && this.mShowSmileyDrawable) {
            this.icon = null;
            if (!this.mSmileyKey.mo7374e()) {
                return;
            }
            if (!C1351J.m6188a().mo5650i() || TextUtils.isEmpty(this.mSmileyKey.mo7372c())) {
                this.mSoftKeyInfo.printTitle = 0;
                this.mSoftKeyInfo.mainTitle = null;
                this.mSoftKeyInfo.altTitle = null;
                this.icon = (Drawable) C1351J.m6188a().mo5642b(this.mSmileyKey.mo7373d());
                return;
            }
            this.mSoftKeyInfo.printTitle = 1;
            this.mSoftKeyInfo.mainTitle = this.mSmileyKey.mo7372c();
            this.mSoftKeyInfo.altTitle = null;
        }
    }

    public void setSmileyKey(C2051e eVar) {
        this.mSmileyKey = eVar;
        initSmileyKey();
    }

    public C2051e getSmileyKey() {
        return this.mSmileyKey;
    }

    public boolean isShowSmiley() {
        return this.mShowSmileyDrawable;
    }

    public void setShowSmiley(boolean z) {
        this.mShowSmileyDrawable = z;
    }

    public SmileyKey(C2811cf cfVar) {
        super(cfVar);
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2740bS(this);
    }

    /* access modifiers changed from: protected */
    public void doKeyAction(int i) {
        String b;
        String b2;
        if (this.mSmileyKey == null || !this.mShowSmileyDrawable) {
            super.doKeyAction(i);
            return;
        }
        if (this.mSmileyKey.mo7374e()) {
            if (C1351J.m6188a().mo5641b() == 2) {
                b2 = C2052a.m9410a(this.mSmileyKey.mo7373d()).mo7412a();
            } else {
                b2 = this.mSmileyKey.mo7371b();
            }
            b = b2;
        } else {
            b = this.mSmileyKey.mo7371b();
        }
        Engine.getInstance().fireLuaCallOperation(Engine.LUA_CALL_COMMIT_INPUT);
        Engine.getInstance().processEvent();
        ((TouchPalIME) Engine.getInstance().getIms()).commitText(b);
        if (this.mSmileyKey.mo7374e()) {
            C1351J.m6188a().mo5652l();
        }
        C2020i.m9332a().mo7376a(this.mSmileyKey);
    }

    /* access modifiers changed from: protected */
    public String getPreviewText(int i) {
        if (this.mSmileyKey == null || !this.mShowSmileyDrawable) {
            return super.getPreviewText(i);
        }
        return this.mSoftKeyInfo.mainTitle;
    }

    /* access modifiers changed from: protected */
    public int getPreviewWidth() {
        if (this.icon == null || !this.mShowSmileyDrawable) {
            return 0;
        }
        int intrinsicWidth = this.icon.getIntrinsicWidth();
        int i = this.width;
        return (intrinsicWidth <= i || i <= 0) ? intrinsicWidth : i;
    }

    /* access modifiers changed from: protected */
    public int getPreviewHeight() {
        if (this.icon == null || !this.mShowSmileyDrawable) {
            return 0;
        }
        int intrinsicHeight = this.icon.getIntrinsicHeight();
        int i = this.height;
        return (intrinsicHeight <= i || i <= 0) ? intrinsicHeight : i;
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        super.updateKeyInfo();
        initSmileyKey();
        this.mSoftKeyInfo.needUpdate = true;
        if (this.mKeyboard.f12546S != null) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }
}
