package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.C2934m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.DialectBar */
public class DialectBar extends TopScrollView implements CandidateManager.ICandidateListener, C2934m.C2935a {

    /* renamed from: a */
    private static final String f11203a = "DialectBar";

    /* renamed from: b */
    private CandidateManager.ICandidateProvider f11204b;

    /* renamed from: c */
    private boolean f11205c;

    /* renamed from: x */
    private boolean f11206x = false;

    public DialectBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11816r = new C2623J(this);
        this.f11815q = new C2624K(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8473a(int i) {
        if (Engine.isInitialized()) {
            Engine.getInstance().fireSelectDialectOperation(i);
            Engine.getInstance().processEvent();
        }
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        this.f11205c = z3;
        if (z3) {
            this.f11204b = iCandidateProvider3;
            mo8490a(true);
        }
    }

    /* renamed from: b */
    public C2727bG mo8477b(int i) {
        if (this.f11204b == null) {
            return null;
        }
        CandidateItem candidateItem = this.f11204b.get(i);
        if (candidateItem == null) {
            return candidateItem;
        }
        candidateItem.isDialect = true;
        return candidateItem;
    }

    /* renamed from: d */
    public float mo8493d(int i) {
        return 2.0f;
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return this.f11205c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f11206x) {
            this.f11811k = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.candidate_shanghainese);
            this.f11206x = true;
        }
        super.onDraw(canvas);
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return true;
    }
}
