package com.cootek.smartinput5.engine;

public class CurveInputPoint {
    private int mPointX;
    private int mPointY;

    public void setData(int i, int i2) {
        this.mPointX = i;
        this.mPointY = i2;
    }

    public int getPointX() {
        return this.mPointX;
    }

    public int getPointY() {
        return this.mPointY;
    }

    public String toString() {
        return String.format("pointX = %d, pointY = %d", new Object[]{Integer.valueOf(this.mPointX), Integer.valueOf(this.mPointY)});
    }
}
