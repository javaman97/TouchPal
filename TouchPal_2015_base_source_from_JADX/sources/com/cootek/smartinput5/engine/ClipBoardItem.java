package com.cootek.smartinput5.engine;

import com.cootek.smartinput5.p045a.C1063f;
import org.json.JSONException;
import org.json.JSONObject;

public class ClipBoardItem {
    private static String LOCKED = "locked";
    private static String TEXT = "text";
    private static String TIMESTAMP = C1063f.f3049a;
    private static String UPDATED = "updated";
    public boolean locked;
    public final String text;
    public long timestamp;
    public boolean updated;

    public ClipBoardItem(JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new NullPointerException();
        }
        this.text = jSONObject.optString(TEXT);
        this.timestamp = jSONObject.optLong(TIMESTAMP);
        this.locked = jSONObject.optBoolean(LOCKED);
        this.updated = jSONObject.optBoolean(UPDATED);
    }

    public ClipBoardItem(CharSequence charSequence, long j) {
        this.text = charSequence.toString();
        this.timestamp = j;
        this.locked = false;
        this.updated = false;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TEXT, this.text);
        jSONObject.put(TIMESTAMP, this.timestamp);
        jSONObject.put(LOCKED, this.locked);
        jSONObject.put(UPDATED, this.updated);
        return jSONObject;
    }
}
