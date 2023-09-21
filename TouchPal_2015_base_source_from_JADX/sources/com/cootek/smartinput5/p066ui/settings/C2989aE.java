package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.aE */
/* compiled from: HandWriteIntervalDialogPreference */
class C2989aE implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ int f13813a;

    /* renamed from: b */
    final /* synthetic */ HandWriteIntervalDialogPreference f13814b;

    C2989aE(HandWriteIntervalDialogPreference handWriteIntervalDialogPreference, int i) {
        this.f13814b = handWriteIntervalDialogPreference;
        this.f13813a = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (1 != motionEvent.getAction() || this.f13814b.mCurrentProgress < this.f13813a - 2) {
            return false;
        }
        if (this.f13814b.isSmallerAction) {
            boolean unused = this.f13814b.isSmallerAction = false;
            return false;
        }
        float width = (float) (this.f13814b.mSeekBar.getWidth() / this.f13813a);
        if ((width / 3.0f) + (((float) this.f13814b.mCurrentProgress) * width) > motionEvent.getX()) {
            return false;
        }
        HandWriteIntervalDialogPreference.access$004(this.f13814b);
        int unused2 = this.f13814b.mCurrentProgress = this.f13814b.mCurrentProgress > this.f13813a ? this.f13813a : this.f13814b.mCurrentProgress;
        this.f13814b.mSeekBar.setProgress(this.f13814b.mCurrentProgress);
        return true;
    }
}
