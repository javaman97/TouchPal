package com.cootek.presentation.sdk.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Engine;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ActionDriverHelper {
    private static final String EXTRA_KEY = "key";
    private static final String EXTRA_TYPE = "type";
    private static final String EXTRA_TYPE_BOOL = "bool";
    private static final String EXTRA_TYPE_INT = "int";
    private static final String EXTRA_TYPE_LONG = "long";
    private static final String EXTRA_TYPE_STRING = "string";
    private static final String EXTRA_VALUE = "value";

    public static boolean launchApp(Context context, String str, String str2, String str3, String str4) {
        boolean z;
        boolean z2;
        Intent intent;
        Intent intent2 = new Intent();
        boolean z3 = !TextUtils.isEmpty(str);
        if (TextUtils.isEmpty(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (TextUtils.isEmpty(str3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z3 || z || z2) {
            intent2.setFlags(Engine.EXCEPTION_ERROR);
            if (z3) {
                intent2.setPackage(str);
            }
            if (z) {
                intent2.setAction(str2);
            }
            if (z2) {
                intent2.setData(Uri.parse(str3));
            }
            intent = intent2;
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(str);
        }
        if (!TextUtils.isEmpty(str4)) {
            try {
                JSONArray jSONArray = new JSONArray(str4);
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj;
                        String string = jSONObject.getString("key");
                        String string2 = jSONObject.getString("type");
                        if ("string".equals(string2)) {
                            intent.putExtra(string, jSONObject.getString("value"));
                        } else if ("int".equals(string2)) {
                            intent.putExtra(string, jSONObject.getInt("value"));
                        } else if ("long".equals(string2)) {
                            intent.putExtra(string, jSONObject.getLong("value"));
                        } else if ("bool".equals(string2)) {
                            intent.putExtra(string, jSONObject.getBoolean("value"));
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e2) {
            return false;
        }
    }

    public static boolean sendBroadcast(Context context, String str, String str2, String str3, String str4) {
        boolean z;
        boolean z2;
        Intent intent = new Intent();
        boolean z3 = !TextUtils.isEmpty(str);
        if (TextUtils.isEmpty(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (TextUtils.isEmpty(str3)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z3) {
            intent.setPackage(str);
        }
        if (z) {
            intent.setAction(str2);
        }
        if (z2) {
            intent.setData(Uri.parse(str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            try {
                JSONArray jSONArray = new JSONArray(str4);
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) obj;
                        String string = jSONObject.getString("key");
                        String string2 = jSONObject.getString("type");
                        if ("string".equals(string2)) {
                            intent.putExtra(string, jSONObject.getString("value"));
                        } else if ("int".equals(string2)) {
                            intent.putExtra(string, jSONObject.getInt("value"));
                        } else if ("long".equals(string2)) {
                            intent.putExtra(string, jSONObject.getLong("value"));
                        } else if ("bool".equals(string2)) {
                            intent.putExtra(string, jSONObject.getBoolean("value"));
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            context.sendBroadcast(intent);
            return true;
        } catch (ActivityNotFoundException e2) {
            return false;
        }
    }

    public static void installApk(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(Engine.EXCEPTION_ERROR);
        intent.setDataAndType(Uri.parse("file://" + str), "application/vnd.android.package-archive");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
        }
    }

    public static boolean hasDesktopShortcut(Context context, String str) {
        boolean z;
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.android.launcher2.settings/favorites?notify=true"), (String[]) null, "title=?", new String[]{str}, (String) null);
        if (query == null) {
            return false;
        }
        if (query.getCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        query.close();
        return z;
    }

    public static Intent getIntentShortcut(String str, String str2, Map<String, String> map) {
        Intent intent = new Intent();
        intent.setAction(str2);
        intent.setPackage(str);
        intent.setFlags(1073741824);
        intent.addFlags(8388608);
        intent.addFlags(Engine.CHANGE_LOCAL_CLOUD_SEARCH);
        intent.addFlags(65536);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                intent.putExtra((String) next.getKey(), (String) next.getValue());
            }
        }
        return intent;
    }

    public static void createDesktopShortcut(Context context, String str, String str2, String str3, Map<String, String> map) {
        Intent intent = new Intent();
        if (str3 != null) {
            intent.putExtra("android.intent.extra.shortcut.ICON", BitmapFactory.decodeFile(str3));
        }
        intent.putExtra("android.intent.extra.shortcut.INTENT", getIntentShortcut(context.getPackageName(), str2, map));
        intent.putExtra("android.intent.extra.shortcut.NAME", str);
        intent.putExtra("duplicate", false);
        intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
        context.getApplicationContext().sendBroadcast(intent);
    }

    public static void deleteDesktopShortcut(Context context, String str, String str2, Map<String, String> map) {
        Intent intent = new Intent();
        intent.putExtra("android.intent.extra.shortcut.NAME", str);
        intent.putExtra("android.intent.extra.shortcut.INTENT", getIntentShortcut(context.getPackageName(), str2, map));
        intent.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        context.getApplicationContext().sendBroadcast(intent);
    }
}
