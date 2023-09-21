package com.cootek.smartinput5.engine;

import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TouchInputContext extends InputContext {
    private static final String TAG = "TouchInputContext";
    private ArrayList<TouchInputCode> mTouchInputCodes;

    public void setData(int i, int i2, TouchInputCode[] touchInputCodeArr) {
        super.setData(i);
        this.mTouchInputCodes = new ArrayList<>(Arrays.asList(touchInputCodeArr));
    }

    public int getTouchInputCodesSize() {
        return this.mTouchInputCodes.size();
    }

    public TouchInputCode getTouchInputCodes(int i) {
        if (i < 0 || i >= this.mTouchInputCodes.size()) {
            return null;
        }
        return this.mTouchInputCodes.get(i);
    }

    public JSONObject toJSONObject() {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.mTouchInputCodes.size(); i++) {
                TouchInputCode touchInputCode = this.mTouchInputCodes.get(i);
                if (touchInputCode != null) {
                    jSONArray.put(touchInputCode.getPreciseString());
                    StringBuilder sb = new StringBuilder();
                    sb.append(touchInputCode.getRelativeX()).append(Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR).append(touchInputCode.getRelativeY());
                    jSONArray2.put(sb.toString());
                    arrayList.add(Long.valueOf(touchInputCode.getTimeStamp()));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                jSONArray3.put(((Long) arrayList.get(i2)).longValue() - ((Long) arrayList.get(0)).longValue());
            }
            JSONObject jSONObject = new JSONObject();
            if (this.mTouchInputCodes.size() <= 0) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pc", jSONArray);
            jSONObject2.put("rp", jSONArray2);
            jSONObject2.put("ts", jSONArray3);
            jSONObject.put("tpip", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(10);
        for (int i = 0; i < this.mTouchInputCodes.size(); i++) {
            TouchInputCode touchInputCode = this.mTouchInputCodes.get(i);
            if (touchInputCode != null) {
                sb.append(String.format("touchInputCode[%d] = %s", new Object[]{Integer.valueOf(i), touchInputCode.toString()})).append(10);
            }
        }
        return sb.toString();
    }
}
