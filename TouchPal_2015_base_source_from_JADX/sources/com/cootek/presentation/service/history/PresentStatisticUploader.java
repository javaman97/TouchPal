package com.cootek.presentation.service.history;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.PresentationSystem;
import org.json.JSONException;
import org.json.JSONObject;

public class PresentStatisticUploader {
    public static final String DISMISS_APPLAUNCHED = "APPLAUNCHED";
    public static final String DISMISS_APPLAUNCH_NOAPP = "APPLAUNCH_NOAPP";
    public static final String DISMISS_FINISHDOWNLOAD = "FINISHDOWNLOAD";
    public static final String DISMISS_FINISHINSTALLED = "FINISHINSTALLED";
    public static final String DISMISS_PAGELOADED = "PAGELOADED";
    public static final String DISMISS_PAGEOPENED = "PAGEOPENED";
    public static final String DISMISS_STARTDOWNLOAD = "STARTDOWNLOAD";
    public static final String DISMISS_TOASTCLEANED = "TOASTDCLEANED";
    public static final String DISMISS_TOASTCLICKED = "TOASTCLICKED";
    public static final String DISMISS_TOASTCLOSED = "TOASTCLOSED";
    private static final String KEY_FEATURE_ID = "feature_id";
    private static final String KEY_SUBTYPE = "sub_type";
    private static final String KEY_TIMESTAMP = "time_stamp";
    private static final String KEY_TYPE = "type";
    public static final String SUBTYPE_FINISH = "FINISH";
    public static final String SUBTYPE_HANDLED = "HANDLED";
    public static final String SUBTYPE_LAUNCHED = "LAUNCHED";
    public static final String SUBTYPE_LOADED = "LOADED";
    public static final String SUBTYPE_OPENED = "OPENED";
    public static final String SUBTYPE_START = "START";
    public static final String TYPE_CLICK = "CLICK";
    public static final String TYPE_DISMISS = "DISMISS";
    public static final String TYPE_DOWNLOAD = "DOWNLOAD";
    public static final String TYPE_INSTALL = "INSTALL";
    public static final String TYPE_LOCALAPP = "LOCALAPP";
    public static final String TYPE_PARSE = "PARSE";
    public static final String TYPE_SHOW = "SHOW";
    public static final String TYPE_WEBPAGE = "WEBPAGE";
    private static final String USAGE_FEATUER = "feature_id";
    private static final String USAGE_PATH = "path_noah_reserved2__";
    private static final String USAGE_RECORD_TYPE = "noah_push_stat2";
    private static final String USAGE_SUB_TYPE = "sub_type";
    private static final String USAGE_TIMESTAMP = "timestamp";
    private static final String USAGE_TYPE = "type";

    public class StatisticItem {
        String featureId;
        String subType;
        long timestamp;
        String type;
        boolean uploaded = false;

        public StatisticItem() {
        }

        public StatisticItem(JSONObject jSONObject) throws JSONException {
            this.type = jSONObject.getString("type");
            if (jSONObject.has("sub_type")) {
                this.subType = jSONObject.getString("sub_type");
            }
            this.featureId = jSONObject.getString("feature_id");
            if (jSONObject.has(PresentStatisticUploader.KEY_TIMESTAMP)) {
                this.timestamp = jSONObject.getLong(PresentStatisticUploader.KEY_TIMESTAMP);
            } else {
                this.timestamp = SystemFacade.currentTimeMillis();
            }
        }
    }

    public String getSubType(int i) {
        switch (i) {
            case 0:
                return DISMISS_APPLAUNCH_NOAPP;
            case 1:
                return DISMISS_FINISHINSTALLED;
            case 2:
                return DISMISS_FINISHDOWNLOAD;
            case 3:
                return DISMISS_STARTDOWNLOAD;
            case 4:
                return DISMISS_APPLAUNCHED;
            case 6:
                return DISMISS_PAGELOADED;
            case 7:
                return DISMISS_PAGEOPENED;
            case 9:
                return DISMISS_TOASTCLICKED;
            case 10:
                return DISMISS_TOASTCLOSED;
            case 11:
                return DISMISS_TOASTCLEANED;
            default:
                return null;
        }
    }

    public boolean addItem(String str, String str2, String str3) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "Statistic Add: " + str + "; " + str2 + "; " + str3);
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            return true;
        }
        StatisticItem statisticItem = new StatisticItem();
        statisticItem.featureId = str3;
        statisticItem.type = str;
        statisticItem.subType = str2;
        statisticItem.timestamp = SystemFacade.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feature_id", str3);
            jSONObject.put("type", str);
            jSONObject.put("sub_type", str2);
            jSONObject.put("timestamp", SystemFacade.currentTimeMillis());
            if (PresentationSystem.DUMPINFO) {
                Log.i("Nan", "Statistic by Usage: " + jSONObject.toString());
            }
            PresentationSystem.getInstance().getActionDriver().saveTypeUsage(USAGE_RECORD_TYPE, USAGE_PATH, jSONObject.toString());
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
