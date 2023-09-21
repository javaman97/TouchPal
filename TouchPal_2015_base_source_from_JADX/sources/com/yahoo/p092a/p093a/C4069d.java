package com.yahoo.p092a.p093a;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.p092a.p093a.C4064a;
import java.security.MessageDigest;
import java.util.Formatter;
import java.util.UUID;

/* renamed from: com.yahoo.a.a.d */
public final class C4069d {

    /* renamed from: a */
    private static final char[] f16552a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v'};

    /* renamed from: b */
    private static C4064a.C4065a f16553b = C4064a.C4065a.ANDROIDID;

    /* renamed from: a */
    protected static String m17313a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes(Utils.UTF8), 0, str.length());
            byte[] digest = instance.digest();
            Formatter formatter = new Formatter();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                formatter.format("%02x", new Object[]{Byte.valueOf(digest[i])});
            }
            return formatter.toString();
        } catch (Exception e) {
            return "";
        }
    }

    /* renamed from: b */
    protected static boolean m17315b(String str) {
        return str == null || str.equals("");
    }

    /* renamed from: c */
    protected static boolean m17316c(String str) {
        return str != null && !str.equals("") && str.length() >= 13;
    }

    /* renamed from: a */
    private static String m17314a(String str, int i) {
        int i2 = 0;
        StringBuilder sb = new StringBuilder();
        if (m17315b(str)) {
            while (i2 < i) {
                sb.append("0");
                i2++;
            }
            return sb.toString();
        } else if (str.length() >= i) {
            return str;
        } else {
            int length = i - str.length();
            while (i2 < length) {
                sb.append("0");
                i2++;
            }
            sb.append(str);
            return sb.toString();
        }
    }

    /* renamed from: d */
    protected static String m17317d(String str) {
        if (m17315b(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String a = m17313a(str);
        try {
            String str2 = m17314a(Long.toBinaryString(Long.valueOf(Long.parseLong(a.substring(0, 8), 16)).longValue()).toString(), 33) + m17314a(Long.toBinaryString(Long.valueOf(Long.parseLong(a.substring(8, 16), 16)).longValue()).toString(), 32);
            for (int i = 1; i < 14; i++) {
                sb.append(f16552a[Integer.parseInt(str2.substring((i - 1) * 5, i * 5), 2)]);
            }
            return sb.toString();
        } catch (NumberFormatException e) {
            return "";
        } catch (IndexOutOfBoundsException e2) {
            return "";
        }
    }

    /* renamed from: a */
    protected static String m17312a(Context context) {
        f16553b = C4064a.C4065a.ANDROIDID;
        String string = Settings.Secure.getString(context.getContentResolver(), com.cootek.smartinput5.engine.Settings.ANDROID_ID);
        if (!m17315b(string)) {
            return string;
        }
        String macAddress = ((WifiManager) context.getSystemService(C1899v.f6395s)).getConnectionInfo().getMacAddress();
        f16553b = C4064a.C4065a.MACADDRESS;
        if (!m17315b(macAddress)) {
            return macAddress;
        }
        f16553b = C4064a.C4065a.UUID;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.yahoo.uda.yi13n.uuid_file", 0);
        String string2 = sharedPreferences.getString("com.yahoo.uda.yi13n.uuid_key", "");
        if (!m17315b(string2)) {
            return string2;
        }
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("com.yahoo.uda.yi13n.uuid_key", uuid);
        edit.commit();
        return uuid;
    }

    /* renamed from: a */
    protected static C4064a.C4065a m17311a() {
        return f16553b;
    }
}
