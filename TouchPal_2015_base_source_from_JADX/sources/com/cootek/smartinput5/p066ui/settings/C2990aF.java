package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.aF */
/* compiled from: HandWriteWidthDialogPreference */
class C2990aF implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ int f13815a;

    /* renamed from: b */
    final /* synthetic */ HandWriteWidthDialogPreference f13816b;

    C2990aF(HandWriteWidthDialogPreference handWriteWidthDialogPreference, int i) {
        this.f13816b = handWriteWidthDialogPreference;
        this.f13815a = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (1 != motionEvent.getAction() || this.f13816b.mCurrentProgress < this.f13815a - 2) {
            return false;
        }
        if (this.f13816b.isSmallerAction) {
            boolean unused = this.f13816b.isSmallerAction = false;
            return false;
        }
        float width = (float) (this.f13816b.mSeekBar.getWidth() / this.f13815a);
        if ((width / 3.0f) + (((float) this.f13816b.mCurrentProgress) * width) > motionEvent.getX()) {
            return false;
        }
        HandWriteWidthDialogPreference.access$004(this.f13816b);
        int unused2 = this.f13816b.mCurrentProgress = this.f13816b.mCurrentProgress > this.f13815a ? this.f13815a : this.f13816b.mCurrentProgress;
        this.f13816b.mSeekBar.setProgress(this.f13816b.mCurrentProgress);
        return true;
    }
}
