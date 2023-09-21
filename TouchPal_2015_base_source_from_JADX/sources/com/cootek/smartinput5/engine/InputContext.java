package com.cootek.smartinput5.engine;

import org.json.JSONObject;

public class InputContext {
    private static final String TAG = "InputContext";
    private int mInputType;

    public void setData(int i) {
        this.mInputType = i;
    }

    public int getInputType() {
        return this.mInputType;
    }

    public JSONObject toJSONObject() {
        return null;
    }

    public String toString() {
        return String.format("inputType = %s", new Object[]{Integer.valueOf(this.mInputType)});
    }
}
