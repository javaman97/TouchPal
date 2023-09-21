package com.cootek.smartinput5.p066ui.settings;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.settings.ak */
/* compiled from: CustomCheckBoxPreference */
class C3025ak implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ CustomCheckBoxPreference f13938a;

    C3025ak(CustomCheckBoxPreference customCheckBoxPreference) {
        this.f13938a = customCheckBoxPreference;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        if (this.f13938a.mWidgetFrame != null && x > this.f13938a.mCheckBox.getRight() + this.f13938a.mWidgetFrame.getLeft() && this.f13938a.mCustomView != null) {
            this.f13938a.mCustomView.onTouchEvent(motionEvent);
            return true;
        } else if (this.f13938a.mWidgetFrame == null || x >= this.f13938a.mCustomButton.getRight() + this.f13938a.mWidgetFrame.getLeft() || x < this.f13938a.mCustomButton.getLeft() + this.f13938a.mWidgetFrame.getLeft() || this.f13938a.mCustomButton == null) {
            return false;
        } else {
            this.f13938a.mCustomButton.onTouchEvent(motionEvent);
            return true;
        }
    }
}
