package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.BackSpaceKey */
public class BackSpaceKey extends C2806cb implements CandidateManager.ICandidateListener {
    private Drawable mClearIcon;
    private Drawable mOriginalIcon = this.icon;

    public BackSpaceKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    public void onMotionEvent(MotionEvent motionEvent, boolean z) {
        if (motionEvent.getAction() == 0) {
            C1060e.m5598b().mo4272a(C1060e.f3027r);
        }
        super.onMotionEvent(motionEvent, z);
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        boolean z5 = true;
        if (!C1593bR.m7162a().f5076b || !C1368X.m6320c().mo5842o().mo5955l() || !z || z2 || z3 || iCandidateProvider.get(0) == null || iCandidateProvider.get(0).getSource() != 6) {
            if (this.icon != this.mOriginalIcon) {
                this.icon = this.mOriginalIcon;
            }
            z5 = false;
        } else {
            if (this.mClearIcon == null) {
                this.mClearIcon = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.key_fun_backspace_clear);
            }
            if (this.icon != this.mClearIcon) {
                this.icon = this.mClearIcon;
            }
            z5 = false;
        }
        if (z5) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }
}
