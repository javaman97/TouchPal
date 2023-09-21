package com.cootek.smartinput5.engine;

import android.os.Handler;
import android.view.animation.Animation;

public class AnimationListener implements Animation.AnimationListener {
    Runnable endTask;
    Handler handler = new Handler();
    Runnable startTask;

    public void setEndTask(Runnable runnable) {
        this.endTask = runnable;
    }

    public void setStartTask(Runnable runnable) {
        this.startTask = runnable;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.endTask != null) {
            this.handler.post(this.endTask);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        if (this.startTask != null) {
            this.handler.post(this.startTask);
        }
    }
}
