package com.cootek.common.utils;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.cootek.smartinput5.func.iab.C1778f;

public class ToastWidget {
    private static final int DELAY_DURATION = 1000;
    private static final int SHORT_DURATION = 2000;
    private static final ToastWidget sToast = new ToastWidget();
    private Runnable mFractionDelayRunnable;
    /* access modifiers changed from: private */
    public Handler mHandler = new Handler();
    private Runnable mShortDelayRunnable;
    /* access modifiers changed from: private */
    public String mText;
    /* access modifiers changed from: private */
    public int mTimeCount;
    /* access modifiers changed from: private */
    public Toast mToast = null;
    private Thread mUiThread = Thread.currentThread();

    private ToastWidget() {
    }

    public static ToastWidget getInstance() {
        return sToast;
    }

    public void showText(Context context, String str) {
        cancelPrevDisplay();
        showText(context, str, true);
    }

    public void showText(Context context, String str, boolean z) {
        cancelPrevDisplay();
        show(context, str, z);
    }

    public void showText(Context context, String str, int i) {
        cancelPrevDisplay();
        if (i > 0) {
            if (i < 1000) {
                showTextWithFractionDuration(context, str, i);
                return;
            }
            this.mTimeCount = i;
            setupShortDelayRunnable(context);
            show(context, str, true);
            this.mHandler.postDelayed(this.mShortDelayRunnable, 1000);
        }
    }

    private void cancelPrevDisplay() {
        this.mHandler.removeCallbacks(this.mShortDelayRunnable);
        this.mHandler.removeCallbacks(this.mFractionDelayRunnable);
    }

    /* access modifiers changed from: private */
    public void show(final Context context, final String str, final boolean z) {
        if (Thread.currentThread() == this.mUiThread) {
            doShow(context, str, z);
        } else {
            this.mHandler.post(new Runnable() {
                public void run() {
                    ToastWidget.this.doShow(context, str, z);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void doShow(Context context, String str, boolean z) {
        int i = 0;
        this.mText = str;
        if (this.mToast == null) {
            this.mToast = Toast.makeText(context, str, 0);
        }
        this.mToast.setText(str);
        Toast toast = this.mToast;
        if (!z) {
            i = 1;
        }
        toast.setDuration(i);
        this.mToast.show();
    }

    /* access modifiers changed from: private */
    public void showTextWithFractionDuration(Context context, String str, int i) {
        this.mText = str;
        setupFractionDelayRunnable();
        show(context, str, true);
        this.mHandler.postDelayed(this.mFractionDelayRunnable, (long) i);
    }

    private void setupShortDelayRunnable(final Context context) {
        if (this.mShortDelayRunnable == null) {
            this.mShortDelayRunnable = new Runnable() {
                public void run() {
                    ToastWidget toastWidget = ToastWidget.this;
                    toastWidget.mTimeCount = toastWidget.mTimeCount + C1778f.f5834l;
                    if (ToastWidget.this.mTimeCount >= 2000) {
                        ToastWidget.this.show(context, ToastWidget.this.mText, true);
                        ToastWidget.this.mHandler.postDelayed(this, 1000);
                    } else if (ToastWidget.this.mTimeCount > 1000) {
                        ToastWidget.this.showTextWithFractionDuration(context, ToastWidget.this.mText, ToastWidget.this.mTimeCount);
                    }
                }
            };
        }
    }

    private void setupFractionDelayRunnable() {
        if (this.mFractionDelayRunnable == null) {
            this.mFractionDelayRunnable = new Runnable() {
                public void run() {
                    ToastWidget.this.mToast.cancel();
                }
            };
        }
    }
}
