package com.cootek.smartinput5.engine;

import com.cootek.smartinput.utilities.C1002j;
import com.cootek.smartinput.utilities.C1017y;

public class MoveContrail {
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_MOVE = 2;
    public static final int ACTION_UP = 1;
    private static final int MAX_LENGTH = 8192;
    private static final String TAG = "MoveContrail";
    private C1002j actionArray = new C1002j();
    private int height;
    private int maxOffset;
    private int width;
    private C1002j xArray = new C1002j();
    private C1002j yArray = new C1002j();

    public void addPoint(int i, int i2, int i3) {
        if (size() < 8192) {
            this.xArray.mo4091a(i);
            this.yArray.mo4091a(i2);
            this.actionArray.mo4091a(i3);
            int offsetSquare = getOffsetSquare(i, i2);
            if (offsetSquare > this.maxOffset) {
                this.maxOffset = offsetSquare;
            }
        }
    }

    public int getX(int i) {
        return this.xArray.mo4093b(i);
    }

    public int getY(int i) {
        return this.yArray.mo4093b(i);
    }

    public int getAction(int i) {
        return this.actionArray.mo4093b(i);
    }

    public int getMaxOffsetSquare() {
        return this.maxOffset;
    }

    public int getOffsetSquare(int i, int i2) {
        int b = this.xArray.mo4093b(0);
        int b2 = this.yArray.mo4093b(0);
        return ((i - b) * (i - b)) + ((i2 - b2) * (i2 - b2));
    }

    public void clear() {
        this.xArray.mo4090a();
        this.yArray.mo4090a();
        this.actionArray.mo4090a();
        this.maxOffset = 0;
    }

    public void printLog() {
        C1017y.m5228d(TAG, "x: " + this.xArray.toString());
        C1017y.m5228d(TAG, "y: " + this.yArray.toString());
    }

    public int size() {
        return this.xArray.mo4092b();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void setCanvasSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public int getCanvasWidth() {
        return this.width;
    }

    public int getCanvasHeight() {
        return this.height;
    }
}
