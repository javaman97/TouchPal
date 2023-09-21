package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.cZ */
/* compiled from: SoundDialogPreference */
class C3131cZ implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ int f14150a;

    /* renamed from: b */
    final /* synthetic */ SoundDialogPreference f14151b;

    C3131cZ(SoundDialogPreference soundDialogPreference, int i) {
        this.f14151b = soundDialogPreference;
        this.f14150a = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (1 != motionEvent.getAction() || this.f14151b.mCurrentProgress < this.f14150a - 2) {
            return false;
        }
        if (this.f14151b.isSmallerAction) {
            boolean unused = this.f14151b.isSmallerAction = false;
            return false;
        }
        float width = (float) (this.f14151b.mSeekBar.getWidth() / this.f14150a);
        if ((width / 3.0f) + (((float) this.f14151b.mCurrentProgress) * width) > motionEvent.getX()) {
            return false;
        }
        SoundDialogPreference.access$004(this.f14151b);
        int unused2 = this.f14151b.mCurrentProgress = this.f14151b.mCurrentProgress > this.f14150a ? this.f14150a : this.f14151b.mCurrentProgress;
        this.f14151b.mSeekBar.setProgress(this.f14151b.mCurrentProgress);
        return true;
    }
}
