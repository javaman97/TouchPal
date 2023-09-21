package com.cootek.smartinput5.p066ui;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.TouchEvent5_ */
public class TouchEvent5_ extends TouchEvent {
    private static final String TAG = "TouchEvent5_";
    private static boolean hasCanceled = false;
    private ArrayList<Integer> mMultiTouchIds = new ArrayList<>();
    private int mThresholdSquareBase;
    private int mThresholdSquareDouble;
    private int mThresholdSquareOneHalf;

    /* access modifiers changed from: package-private */
    public boolean doEvent(MotionEvent motionEvent, SoftKeyboardView softKeyboardView) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int action = motionEvent.getAction();
        int i5 = action & 255;
        int pointerCount = motionEvent.getPointerCount();
        long eventTime = motionEvent.getEventTime();
        if (i5 == 5 || i5 == 6) {
            int pointerId = motionEvent.getPointerId((65280 & action) >> 8);
            if (i5 == 5) {
                i3 = 1;
                z = true;
                i2 = 0;
                i = pointerId;
            } else if (i5 == 6) {
                i3 = 2;
                z = false;
                i2 = 1;
                i = pointerId;
            } else {
                z = false;
                i3 = i5;
                i2 = i5;
                i = pointerId;
            }
        } else {
            z = false;
            i3 = i5;
            i2 = i5;
            i = -1;
        }
        hasCanceled = false;
        if (i5 == 0) {
            softKeyboardView.setCurrentPointerId(0);
        } else if (i5 == 5) {
            softKeyboardView.setCurrentPointerId(i);
            Engine.getInstance().isMultitouch = true;
            if (Settings.getInstance().getBoolSetting(Settings.DYNAMIC_SPELL_CHECK_ENABLE) && Settings.getInstance().getBoolSetting(1)) {
                if (!Engine.getInstance().isInDynamicSpellCheck()) {
                    Engine.getInstance().recordOldSpellCheckSetting(Settings.getInstance().getIntSetting(33));
                }
                if (Engine.getInstance().getOldSpellCheckSetting() != 3) {
                    Settings.getInstance().setIntSetting(33, 3);
                }
            }
        } else if (i5 == 3) {
            hasCanceled = true;
        }
        if (pointerCount == 1 && i5 == 2 && check(motionEvent, softKeyboardView)) {
            return true;
        }
        int i6 = -1;
        int i7 = 0;
        while (i7 < pointerCount) {
            int pointerId2 = motionEvent.getPointerId(i7);
            if (pointerId2 == i) {
                i4 = i7;
            } else {
                MotionEvent obtain = MotionEvent.obtain(eventTime, eventTime, i3, motionEvent.getX(i7), motionEvent.getY(i7), motionEvent.getMetaState());
                softKeyboardView.mo8731a(obtain, pointerId2, z);
                obtain.recycle();
                i4 = i6;
            }
            i7++;
            i6 = i4;
        }
        if (i6 != -1 && !hasCanceled) {
            MotionEvent obtain2 = MotionEvent.obtain(eventTime, eventTime, i2, motionEvent.getX(i6), motionEvent.getY(i6), motionEvent.getMetaState());
            softKeyboardView.mo8731a(obtain2, motionEvent.getPointerId(i6), z);
            obtain2.recycle();
        }
        C2806cb cbVar = null;
        int a = softKeyboardView.mo8724a((int) motionEvent.getX(), (int) motionEvent.getY());
        if (a >= 0) {
            cbVar = softKeyboardView.f11572a[a];
        }
        if (i5 == 1 || (cbVar != null && cbVar.isEdgeFuncKey() && Engine.getInstance().isMultitouch)) {
            if (Engine.getInstance().isMultitouch) {
                Engine.getInstance().isMultitouch = false;
            }
            if (Engine.getInstance().isClickTransMode()) {
                Engine.getInstance().setClickTransMode(false);
                Engine.getInstance().fireTransactionOperation(2);
                softKeyboardView.getKeyboard().mo9203y();
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void setDisplayMetrics(DisplayMetrics displayMetrics) {
        int i = displayMetrics.widthPixels;
        this.mThresholdSquareBase = (i * i) / 16;
        this.mThresholdSquareDouble = this.mThresholdSquareBase * 4;
        this.mThresholdSquareOneHalf = (this.mThresholdSquareBase * 9) / 4;
    }

    private boolean check(MotionEvent motionEvent, SoftKeyboardView softKeyboardView) {
        int i;
        int pointerId = motionEvent.getPointerId(0);
        if (pointerId >= 11 || (i = softKeyboardView.f11576c[pointerId]) < 0) {
            return false;
        }
        C2806cb cbVar = softKeyboardView.f11572a[i];
        int size = cbVar.mMoveContrail.size();
        if (size < 1) {
            return false;
        }
        int x = cbVar.mMoveContrail.getX(0);
        int y = cbVar.mMoveContrail.getY(0);
        int x2 = cbVar.mMoveContrail.getX(size - 1);
        int y2 = cbVar.mMoveContrail.getY(size - 1);
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int i2 = x3 - x2;
        int i3 = y3 - y2;
        int i4 = this.mThresholdSquareBase;
        if (cbVar.isSlide(x3 - x, y3 - y) && cbVar.getSlideDirection(x3 - x, y3 - y) != 0) {
            i4 = this.mThresholdSquareDouble;
        } else if (cbVar.mKeyboard.f12547T.mo9208a(3)) {
            i4 = this.mThresholdSquareDouble;
        } else if (cbVar.mKeyboard.f12547T.mo9208a(2)) {
            i4 = this.mThresholdSquareOneHalf;
        } else if (cbVar.mKeyboard.f12547T.mo9208a(0) || cbVar.mKeyboard.f12547T.mo9208a(1)) {
            i4 = this.mThresholdSquareBase;
        }
        if ((i2 * i2) + (i3 * i3) < i4) {
            return false;
        }
        long eventTime = motionEvent.getEventTime();
        MotionEvent obtain = MotionEvent.obtain(eventTime, eventTime, 1, (float) x2, (float) y2, motionEvent.getMetaState());
        softKeyboardView.mo8731a(obtain, pointerId, true);
        obtain.recycle();
        if (hasCanceled) {
            return false;
        }
        MotionEvent obtain2 = MotionEvent.obtain(eventTime, eventTime, 0, (float) x3, (float) y3, motionEvent.getMetaState());
        softKeyboardView.mo8731a(obtain2, pointerId, false);
        obtain2.recycle();
        return true;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    public boolean degenerateMultiTouch(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT >= 8) {
            if (Engine.getInstance().isMutiTouchPaused()) {
                int actionMasked = motionEvent.getActionMasked();
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (actionMasked == 5) {
                    this.mMultiTouchIds.add(Integer.valueOf(pointerId));
                    return true;
                } else if (actionMasked == 6) {
                    if (this.mMultiTouchIds.contains(Integer.valueOf(pointerId))) {
                        this.mMultiTouchIds.remove(Integer.valueOf(pointerId));
                        return true;
                    }
                } else if (!this.mMultiTouchIds.contains(Integer.valueOf(pointerId))) {
                    return false;
                } else {
                    return true;
                }
            } else {
                this.mMultiTouchIds.clear();
            }
        }
        return false;
    }
}
