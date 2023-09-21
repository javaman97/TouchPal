package com.cootek.presentation.service.history;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C2119x;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PresentHistoryManager {
    public static String ALREADY_PARSE = "already_parse";
    public static String ALREADY_PRESNET_TIMES = "apt";
    public static String CLEAR_TYPE = "clear_type";
    public static String FILE_PATH = "file_path";
    public static String FIRST_OCCUR_TIMESTAMP = "fot";
    private static final String FIRST_USED_TIME = "PRESENT_FIRST_USED_TIME";
    private static final String HISTORY_FILE_KEY = "noah_presentation_historykey";
    private static final String HISTORY_FILE_NAME = "history.json";
    private static final String HISTORY_FILE_NEW = "history_new";
    private static final String HISTORY_VERSION = "2.0.0";
    public static String IMAGE_PATH = "image_path";
    public static String IS_CLEAR = "is_clear";
    public static String IS_CLICKED = "is_clicked";
    public static String IS_SHOWN = "is_shown";
    private static final String KEY_HISTORY_BODY = "body";
    private static final String KEY_HISTORY_VERSION = "version";
    private static final String LAST_CHECK_TIME = "PRESENT_LAST_CHECK_TIME";
    public static String LAST_PRESENT_TIMESTAMP = "lpt";
    private static final String LAST_STARTUP_PRESENT_TIME = "LAST_STARTUP_PRESENT_TIME";
    private static final String LAST_STATUSBAR_PRESENT_TIME = "LAST_STATUSBAR_PRESENT_TIME";
    private static final String LAST_TOOLBAR_PRESENT_TIME = "LAST_TOOLBAR_PRESENT_TIME";
    private SharedPreferences mHistoryPref;
    private SharedPreferences mSharedPref;

    public static class Histories {
        private boolean mChanged = true;
        private Map<String, PresentHistory> mContainer = new HashMap();

        public Map<String, PresentHistory> get() {
            return this.mContainer;
        }

        public void onChanged() {
            this.mChanged = true;
        }

        public boolean isChanged() {
            return this.mChanged;
        }
    }

    public PresentHistoryManager(Context context) {
        initPref(context);
        if (getFirstUsedTime() == 0) {
            setFirstUsedTime(SystemFacade.currentTimeMillis());
        }
    }

    private void initPref(Context context) {
        if (this.mSharedPref == null) {
            this.mSharedPref = context.getSharedPreferences("present_global_params", 0);
        }
        if (this.mHistoryPref == null) {
            this.mHistoryPref = context.getSharedPreferences(HISTORY_FILE_NEW, 0);
        }
        processOldFile(context);
    }

    private void processOldFile(Context context) {
        try {
            if (new File(String.valueOf(context.getFilesDir().getParent()) + File.separator + C1466av.f4700i + File.separator + HISTORY_FILE_NAME + ".xml").exists()) {
                for (Map.Entry next : restore(context).get().entrySet()) {
                    String str = (String) next.getKey();
                    PresentHistory presentHistory = (PresentHistory) next.getValue();
                    setFeatureSetting(str, ALREADY_PRESNET_TIMES, Integer.valueOf(presentHistory.getAlreadyPresentTimes()));
                    setFeatureSetting(str, LAST_PRESENT_TIMESTAMP, Long.valueOf(presentHistory.getLastPresentTimeStamp()));
                    setFeatureSetting(str, FIRST_OCCUR_TIMESTAMP, Long.valueOf(presentHistory.getFirstOccurTimeStamp()));
                    setFeatureSetting(str, IS_SHOWN, Boolean.valueOf(presentHistory.getIsShown()));
                    setFeatureSetting(str, IS_CLICKED, Boolean.valueOf(presentHistory.getIsClicked()));
                    setFeatureSetting(str, IS_CLEAR, Boolean.valueOf(presentHistory.getIsClear()));
                    setFeatureSetting(str, CLEAR_TYPE, Integer.valueOf(presentHistory.getClearType()));
                    setFeatureSetting(str, FILE_PATH, presentHistory.getFilePath());
                    setFeatureSetting(str, IMAGE_PATH, presentHistory.getImagePath());
                }
                context.getSharedPreferences(HISTORY_FILE_NAME, 0).edit().clear().commit();
                try {
                    File file = new File(String.valueOf(context.getFilesDir().getParent()) + File.separator + C1466av.f4700i + File.separator + HISTORY_FILE_NAME + ".xml");
                    if (file.exists()) {
                        file.delete();
                    }
                    File file2 = new File(String.valueOf(context.getFilesDir().getParent()) + File.separator + C1466av.f4700i + File.separator + HISTORY_FILE_NAME + C2119x.f8995a);
                    if (file2.exists()) {
                        file2.delete();
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e2) {
        }
    }

    private String getKey(String str, String str2) {
        return String.valueOf(str) + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + str2;
    }

    public void clearFeatureSetting(String str) {
        deleteFeatureSetting(str, ALREADY_PRESNET_TIMES);
        deleteFeatureSetting(str, LAST_PRESENT_TIMESTAMP);
        deleteFeatureSetting(str, FIRST_OCCUR_TIMESTAMP);
        deleteFeatureSetting(str, IS_SHOWN);
        deleteFeatureSetting(str, IS_CLICKED);
        deleteFeatureSetting(str, IS_CLEAR);
        deleteFeatureSetting(str, CLEAR_TYPE);
        deleteFeatureSetting(str, FILE_PATH);
        deleteFeatureSetting(str, IMAGE_PATH);
        deleteFeatureSetting(str, ALREADY_PARSE);
    }

    private void deleteFeatureSetting(String str, String str2) {
        this.mHistoryPref.edit().remove(getKey(str, str2)).commit();
    }

    public boolean getFeatureSettingBoolean(String str, String str2) {
        return this.mHistoryPref.getBoolean(getKey(str, str2), false);
    }

    public int getFeatureSettingInt(String str, String str2) {
        return this.mHistoryPref.getInt(getKey(str, str2), 0);
    }

    public long getFeatureSettingLong(String str, String str2) {
        return this.mHistoryPref.getLong(getKey(str, str2), 0);
    }

    public float getFeatureSettingFloat(String str, String str2) {
        return this.mHistoryPref.getFloat(getKey(str, str2), 0.0f);
    }

    public String getFeatureSettingString(String str, String str2) {
        return this.mHistoryPref.getString(getKey(str, str2), (String) null);
    }

    public void setFeatureSetting(String str, String str2, Object obj) {
        if (PresentationSystem.DUMPINFO) {
            Log.d("Presetation/History", "fid: " + str + ", key: " + str2 + ", value: " + obj);
        }
        String key = getKey(str, str2);
        if (obj instanceof Integer) {
            this.mHistoryPref.edit().putInt(key, ((Integer) obj).intValue()).commit();
        } else if (obj instanceof Boolean) {
            this.mHistoryPref.edit().putBoolean(key, ((Boolean) obj).booleanValue()).commit();
        } else if (obj instanceof Float) {
            this.mHistoryPref.edit().putFloat(key, ((Float) obj).floatValue()).commit();
        } else if (obj instanceof Long) {
            this.mHistoryPref.edit().putLong(key, ((Long) obj).longValue()).commit();
        } else if (obj instanceof String) {
            this.mHistoryPref.edit().putString(key, (String) obj).commit();
        }
    }

    public void resetFeatureSetting(String str) {
        setFeatureSetting(str, IS_CLEAR, false);
        setFeatureSetting(str, IS_CLICKED, false);
        setFeatureSetting(str, IS_SHOWN, false);
        setFeatureSetting(str, ALREADY_PRESNET_TIMES, 0);
    }

    private Histories readHistories(String str) {
        if (PresentationSystem.DUMPINFO) {
            Log.i("Joe", "before restore: " + str);
        }
        Histories histories = new Histories();
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(KEY_HISTORY_VERSION);
            if (string != null && !string.equalsIgnoreCase(HISTORY_VERSION)) {
                return histories;
            }
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(KEY_HISTORY_BODY);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        try {
                            PresentHistory presentHistory = new PresentHistory((JSONObject) jSONArray.get(i));
                            if (presentHistory != null) {
                                histories.get().put(presentHistory.getFeatureId(), presentHistory);
                            }
                        } catch (JSONException e) {
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                if (PresentationSystem.DUMPINFO) {
                    Log.i("Joe", "after restore: " + histories.get());
                }
                return histories;
            } catch (JSONException e3) {
                e3.printStackTrace();
                return histories;
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
            return histories;
        }
    }

    public Histories restore(Context context) {
        Histories histories = new Histories();
        SharedPreferences sharedPreferences = context.getSharedPreferences(HISTORY_FILE_NAME, 0);
        if (sharedPreferences.getAll().isEmpty()) {
            return histories;
        }
        return readHistories(sharedPreferences.getString(HISTORY_FILE_KEY, ""));
    }

    public long getFirstUsedTime() {
        return this.mSharedPref.getLong(FIRST_USED_TIME, 0);
    }

    public void setFirstUsedTime(long j) {
        this.mSharedPref.edit().putLong(FIRST_USED_TIME, j).commit();
    }

    public long getLastCheckTime() {
        return this.mSharedPref.getLong(LAST_CHECK_TIME, 0);
    }

    public void setLastCheckTime(long j) {
        this.mSharedPref.edit().putLong(LAST_CHECK_TIME, j).commit();
    }

    public long getLastToolbarPresentTime() {
        return this.mSharedPref.getLong(LAST_TOOLBAR_PRESENT_TIME, 0);
    }

    public void setLastToolbarPresentTime(long j) {
        this.mSharedPref.edit().putLong(LAST_TOOLBAR_PRESENT_TIME, j).commit();
    }

    public long getLastStatusbarPresentTime() {
        return this.mSharedPref.getLong(LAST_STATUSBAR_PRESENT_TIME, 0);
    }

    public void setLastStatusbarPresentTime(long j) {
        this.mSharedPref.edit().putLong(LAST_STATUSBAR_PRESENT_TIME, j).commit();
    }

    public long getLastStartupPresentTime() {
        return this.mSharedPref.getLong(LAST_STARTUP_PRESENT_TIME, 0);
    }

    public void setLastStartupPresentTime(long j) {
        this.mSharedPref.edit().putLong(LAST_STARTUP_PRESENT_TIME, j).commit();
    }
}
