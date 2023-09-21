package com.cootek.presentation.service.history;

import org.json.JSONException;
import org.json.JSONObject;

class PresentHistory {
    private static String ALREADY_PRESNET_TIMES = "apt";
    private static String CLEAR_TYPE = "clear_type";
    private static String FEATURE_ID = "fid";
    private static String FILE_PATH = "file_path";
    private static String FIRST_OCCUR_TIMESTAMP = "fot";
    private static String IMAGE_PATH = "image_path";
    private static String IS_CLEAR = "is_clear";
    private static String IS_READ = "is_read";
    private static String IS_SHOWN = "is_shown";
    private static String LAST_PRESENT_TIMESTAMP = "lpt";
    private int alreadyPresentTimes = 0;
    private int clearType;
    private final String featureId;
    private String filePath = null;
    private long firstOccurTimeStamp = 0;
    private String imagePath = null;
    private boolean isClear = false;
    private boolean isClicked = false;
    private boolean isShown = false;
    private long lastPresentTimeStamp = 0;

    public String getFeatureId() {
        return this.featureId;
    }

    public int getAlreadyPresentTimes() {
        return this.alreadyPresentTimes;
    }

    public long getLastPresentTimeStamp() {
        return this.lastPresentTimeStamp;
    }

    public long getFirstOccurTimeStamp() {
        return this.firstOccurTimeStamp;
    }

    public boolean getIsShown() {
        return this.isShown;
    }

    public boolean getIsClicked() {
        return this.isClicked;
    }

    public boolean getIsClear() {
        return this.isClear;
    }

    public int getClearType() {
        return this.clearType;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public PresentHistory(JSONObject jSONObject) throws JSONException {
        this.featureId = jSONObject.getString(FEATURE_ID);
        this.alreadyPresentTimes = jSONObject.getInt(ALREADY_PRESNET_TIMES);
        this.lastPresentTimeStamp = jSONObject.getLong(LAST_PRESENT_TIMESTAMP);
        this.firstOccurTimeStamp = jSONObject.getLong(FIRST_OCCUR_TIMESTAMP);
        this.isShown = jSONObject.getBoolean(IS_SHOWN);
        this.isClicked = jSONObject.getBoolean(IS_READ);
        this.isClear = jSONObject.getBoolean(IS_CLEAR);
        this.clearType = jSONObject.getInt(CLEAR_TYPE);
        if (jSONObject.has(FILE_PATH)) {
            this.filePath = jSONObject.getString(FILE_PATH);
        }
        if (jSONObject.has(IMAGE_PATH)) {
            this.imagePath = jSONObject.getString(IMAGE_PATH);
        }
    }

    public PresentHistory(String str) {
        this.featureId = str;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FEATURE_ID, this.featureId);
        jSONObject.put(ALREADY_PRESNET_TIMES, this.alreadyPresentTimes);
        jSONObject.put(LAST_PRESENT_TIMESTAMP, this.lastPresentTimeStamp);
        jSONObject.put(FIRST_OCCUR_TIMESTAMP, this.firstOccurTimeStamp);
        jSONObject.put(IS_SHOWN, this.isShown);
        jSONObject.put(IS_READ, this.isClicked);
        jSONObject.put(IS_CLEAR, this.isClear);
        jSONObject.put(CLEAR_TYPE, this.clearType);
        jSONObject.put(FILE_PATH, this.filePath);
        jSONObject.put(IMAGE_PATH, this.imagePath);
        return jSONObject;
    }

    public void reset() {
        this.alreadyPresentTimes = 0;
        this.isShown = false;
        this.isClicked = false;
        this.isClear = false;
    }
}
