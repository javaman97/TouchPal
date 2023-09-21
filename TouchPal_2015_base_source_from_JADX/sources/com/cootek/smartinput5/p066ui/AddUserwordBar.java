package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.C2934m;
import com.cootek.smartinput5.p066ui.TopScrollView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.AddUserwordBar */
public class AddUserwordBar extends TopScrollView implements CandidateManager.ICandidateListener, C2934m.C2935a {

    /* renamed from: a */
    private static final String f11148a = "AddUserwordBar";

    /* renamed from: x */
    private static final int f11149x = 2;

    /* renamed from: b */
    private CandidateManager.ICandidateProvider f11150b;

    /* renamed from: c */
    private boolean f11151c;

    /* renamed from: y */
    private Drawable f11152y = null;

    /* renamed from: z */
    private int f11153z = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.touch_to_save_icon_margin);

    public AddUserwordBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11815q = new C2655a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8473a(int i) {
        if (Engine.isInitialized()) {
            Engine.getInstance().fireSelectUserwordOperation(i);
            Engine.getInstance().processEvent();
            if (!Settings.getInstance().getBoolSetting(Settings.TOUCH_TO_SAVE_TIP_OCCURED) && !Settings.getInstance().getBoolSetting(47)) {
                m11561p();
                Settings.getInstance().setBoolSetting(Settings.TOUCH_TO_SAVE_TIP_OCCURED, true);
            }
        }
    }

    /* renamed from: p */
    private void m11561p() {
        C2618H h = new C2618H(C1368X.m6313b());
        h.mo8568a((int) R.string.auto_save_title);
        h.mo8583c((int) R.string.auto_save_tip_msg);
        h.mo8585d((int) R.string.auto_save_reselection_tips);
        h.mo8569a((int) R.string.yes, (View.OnClickListener) new C2715b(this));
        h.mo8578b((int) R.string.no, (View.OnClickListener) new C2776c(this));
        h.mo8582b(true);
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        this.f11151c = z2;
        if (z2) {
            this.f11150b = iCandidateProvider2;
            mo8490a(true);
        }
    }

    /* renamed from: b */
    public C2727bG mo8477b(int i) {
        if (this.f11150b == null) {
            return null;
        }
        CandidateItem candidateItem = this.f11150b.get(i);
        if (candidateItem == null) {
            return candidateItem;
        }
        candidateItem.isAddUserword = true;
        return candidateItem;
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return this.f11151c;
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo8479c(int i) {
        return mo8819h(i) * 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8474a(Canvas canvas, TopScrollView.C2646f[] fVarArr, int i, int i2) {
        int i3;
        if (canvas != null && fVarArr != null && fVarArr.length != 0) {
            if (this.f11152y == null) {
                this.f11152y = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.key_fun_ca_touch_to_save_ctrl_icon, C2726bF.CANDIDATE_ITEM_ADD_ICON);
            }
            new Paint().setTextSize((float) fVarArr[0].f11853h);
            int min = Math.min(i, 2);
            for (int i4 = 0; i4 < min; i4++) {
                int h = mo8819h(fVarArr[i4].f11856k);
                int h2 = mo8819h(fVarArr[i4].f11856k) - (this.f11153z * 2);
                if (!fVarArr[i4].mo8864d() || fVarArr[i4].mo8865e() == 0.0f) {
                    i3 = ((fVarArr[i4].f11857l - (fVarArr[i4].f11855j / 2)) - h2) - h;
                } else {
                    i3 = (int) (((((float) fVarArr[i4].f11857l) - ((((float) fVarArr[i4].f11855j) * fVarArr[i4].mo8865e()) / 2.0f)) - ((float) h2)) - ((float) h));
                }
                this.f11152y.setBounds(0, 0, h2, getHeight());
                canvas.translate((float) i3, 0.0f);
                this.f11152y.draw(canvas);
                canvas.translate((float) (-i3), 0.0f);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m_ */
    public boolean mo8482m_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8476a(boolean z, C2727bG bGVar) {
        return !mo8480e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public boolean mo8483n_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8480e() {
        return CandidateManager.useSimpleCandidateStyle();
    }

    /* access modifiers changed from: protected */
    public int getLeftPaddingWidth() {
        if (!Engine.isInitialized()) {
            return 0;
        }
        C2934m i = Engine.getInstance().getWidgetManager().mo9651i();
        return i.mo9727m() + i.mo9725k();
    }
}
