package p018cn.sharesdk.framework;

import android.content.Context;
import android.content.SharedPreferences;
import com.cootek.smartinput5.engine.Storage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p018cn.sharesdk.framework.utils.C0665d;

/* renamed from: cn.sharesdk.framework.PlatformDb */
public class PlatformDb {
    private static final String DB_NAME = "cn_sharesdk_weibodb";

    /* renamed from: db */
    private SharedPreferences f1462db;
    private String platformNname;
    private int platformVersion;

    public PlatformDb(Context context, String str, int i) {
        this.f1462db = context.getSharedPreferences("cn_sharesdk_weibodb_" + str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + i, 0);
        this.platformNname = str;
        this.platformVersion = i;
    }

    public String exportData() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.f1462db.getAll());
            return new C0665d().mo2495a((HashMap<String, Object>) hashMap);
        } catch (Throwable th) {
            return null;
        }
    }

    public String get(String str) {
        return this.f1462db.getString(str, "");
    }

    public long getExpiresIn() {
        try {
            return this.f1462db.getLong("expiresIn", 0);
        } catch (Throwable th) {
            return 0;
        }
    }

    public long getExpiresTime() {
        return this.f1462db.getLong("expiresTime", 0) + (getExpiresIn() * 1000);
    }

    public String getPlatformNname() {
        return this.platformNname;
    }

    public int getPlatformVersion() {
        return this.platformVersion;
    }

    public String getToken() {
        return this.f1462db.getString("token", "");
    }

    public String getTokenSecret() {
        return this.f1462db.getString("secret", "");
    }

    public String getUserGender() {
        String string = this.f1462db.getString("gender", "2");
        if ("0".equals(string)) {
            return "m";
        }
        if ("1".equals(string)) {
            return "f";
        }
        return null;
    }

    public String getUserIcon() {
        return this.f1462db.getString("icon", "");
    }

    public String getUserId() {
        return this.f1462db.getString("weibo", "");
    }

    public String getUserName() {
        return this.f1462db.getString("nickname", "");
    }

    public void importData(String str) {
        try {
            HashMap<String, Object> a = new C0665d().mo2496a(str);
            if (a != null) {
                SharedPreferences.Editor edit = this.f1462db.edit();
                for (Map.Entry next : a.entrySet()) {
                    Object value = next.getValue();
                    if (value instanceof Boolean) {
                        edit.putBoolean((String) next.getKey(), ((Boolean) value).booleanValue());
                    } else if (value instanceof Float) {
                        edit.putFloat((String) next.getKey(), ((Float) value).floatValue());
                    } else if (value instanceof Integer) {
                        edit.putInt((String) next.getKey(), ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        edit.putLong((String) next.getKey(), ((Long) value).longValue());
                    } else {
                        edit.putString((String) next.getKey(), String.valueOf(value));
                    }
                }
                edit.commit();
            }
        } catch (Throwable th) {
        }
    }

    public boolean isValid() {
        String token = getToken();
        if (token == null || token.length() <= 0) {
            return false;
        }
        return getExpiresIn() == 0 || getExpiresTime() > System.currentTimeMillis();
    }

    public void put(String str, String str2) {
        SharedPreferences.Editor edit = this.f1462db.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void putExpiresIn(long j) {
        SharedPreferences.Editor edit = this.f1462db.edit();
        edit.putLong("expiresIn", j);
        edit.putLong("expiresTime", System.currentTimeMillis());
        edit.commit();
    }

    public void putToken(String str) {
        SharedPreferences.Editor edit = this.f1462db.edit();
        edit.putString("token", str);
        edit.commit();
    }

    public void putTokenSecret(String str) {
        SharedPreferences.Editor edit = this.f1462db.edit();
        edit.putString("secret", str);
        edit.commit();
    }

    public void putUserId(String str) {
        SharedPreferences.Editor edit = this.f1462db.edit();
        edit.putString("weibo", str);
        edit.commit();
    }

    public void removeAccount() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> key : this.f1462db.getAll().entrySet()) {
            arrayList.add(key.getKey());
        }
        SharedPreferences.Editor edit = this.f1462db.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.commit();
    }
}
