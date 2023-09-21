package com.cootek.smartinput5.engine;

import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CurveInputContext extends InputContext {
    private static final String TAG = "CurveInputContext";
    private ArrayList<CurveInputPoint> mCurveInputPoints;

    public void setData(int i, int i2, CurveInputPoint[] curveInputPointArr) {
        super.setData(i);
        this.mCurveInputPoints = new ArrayList<>(Arrays.asList(curveInputPointArr));
    }

    public int getCurveInputPointsSize() {
        return this.mCurveInputPoints.size();
    }

    public CurveInputPoint getCurveInputPoints(int i) {
        if (i < 0 || i >= this.mCurveInputPoints.size()) {
            return null;
        }
        return this.mCurveInputPoints.get(i);
    }

    public JSONObject toJSONObject() {
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.mCurveInputPoints.size(); i++) {
                CurveInputPoint curveInputPoint = this.mCurveInputPoints.get(i);
                if (curveInputPoint != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(curveInputPoint.getPointX()).append(Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR).append(curveInputPoint.getPointY());
                    jSONArray.put(sb.toString());
                }
            }
            JSONObject jSONObject = new JSONObject();
            if (this.mCurveInputPoints.size() <= 0) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pt", jSONArray);
            jSONObject.put("cvip", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(10);
        for (int i = 0; i < this.mCurveInputPoints.size(); i++) {
            CurveInputPoint curveInputPoint = this.mCurveInputPoints.get(i);
            if (curveInputPoint != null) {
                sb.append(String.format("curveInputPoint[%d] = %s", new Object[]{Integer.valueOf(i), curveInputPoint.toString()})).append(10);
            }
        }
        return sb.toString();
    }
}
