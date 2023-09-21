package com.cootek.nativejsapis;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.net.cmd.C2261Q;
import java.net.URLEncoder;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class IntentProvider {
    public static final String FACEBOOK_SHARE_URL = "https://www.facebook.com/sharer.php?";
    public static final String TWITTER_SHARE_URL = "https://twitter.com/share?";
    public static final String WEIBO_SHARE_URL = "http://service.weibo.com/share/mobile.php?";

    public static Intent getSMSIntent(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
        intent.putExtra("sms_body", str2);
        return intent;
    }

    public static Intent getShareToWeiboIntent(String str, String str2, String str3) {
        Uri shareUri = getShareUri(WEIBO_SHARE_URL, new String[][]{new String[]{"title", str2}, new String[]{"url", str3}, new String[]{"appkey", str}});
        if (shareUri != null) {
            return new Intent("android.intent.action.VIEW", shareUri);
        }
        return null;
    }

    public static Intent getShareToTwitterIntent(String str, String str2) {
        Uri shareUri = getShareUri(TWITTER_SHARE_URL, new String[][]{new String[]{"text", str}, new String[]{"url", str2}});
        if (shareUri != null) {
            return new Intent("android.intent.action.VIEW", shareUri);
        }
        return null;
    }

    public static Intent getShareToFacebookIntent(String str) {
        Uri shareUri = getShareUri(FACEBOOK_SHARE_URL, new String[][]{new String[]{C1351J.f4162g, str}});
        if (shareUri != null) {
            return new Intent("android.intent.action.VIEW", shareUri);
        }
        return null;
    }

    private static Uri getShareUri(String str, String[][] strArr) {
        if (TextUtils.isEmpty(str) || strArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        int i = 0;
        for (String[] strArr2 : strArr) {
            if (!TextUtils.isEmpty(strArr2[1])) {
                i++;
                if (i > 1) {
                    sb.append(C2261Q.f9808n);
                }
                sb.append(strArr2[0]);
                sb.append("=");
                sb.append(URLEncoder.encode(strArr2[1]));
            }
        }
        return Uri.parse(sb.toString());
    }

    public static Intent getLaunchLocalAppIntent(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intent intent;
        Intent intent2 = new Intent();
        boolean z = !TextUtils.isEmpty(str);
        boolean z2 = !TextUtils.isEmpty(str2);
        boolean z3 = !TextUtils.isEmpty(str3);
        boolean z4 = !TextUtils.isEmpty(str4);
        boolean z5 = !TextUtils.isEmpty(str6);
        boolean z6 = !TextUtils.isEmpty(str5);
        boolean z7 = !TextUtils.isEmpty(str7);
        if (!z || z3 || z4 || z2 || z7) {
            if (z) {
                intent2.setPackage(str);
            }
            if (z2) {
                intent2.setAction(str2);
            }
            if (z3) {
                intent2.setClassName(context, str3);
            }
            if (z4) {
                intent2.setData(Uri.parse(str4));
            }
            if (z7) {
                try {
                    JSONArray jSONArray = new JSONArray(str7);
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= jSONArray.length()) {
                            break;
                        }
                        Object obj = jSONArray.get(i2);
                        if (obj instanceof String) {
                            intent2.addCategory((String) obj);
                        }
                        i = i2 + 1;
                    }
                    intent = intent2;
                } catch (Exception e) {
                    intent = intent2;
                }
            } else {
                intent = intent2;
            }
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(str);
        }
        if (z6) {
            intent.setType(str5);
        }
        if (z5) {
            try {
                JSONObject jSONObject = new JSONObject(str6);
                Iterator<String> keys = jSONObject.keys();
                if (keys != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof String) {
                            intent.putExtra(next, (String) opt);
                        } else if (opt instanceof Boolean) {
                            intent.putExtra(next, ((Boolean) opt).booleanValue());
                        } else if (opt instanceof Integer) {
                            intent.putExtra(next, ((Integer) opt).intValue());
                        }
                    }
                }
            } catch (Exception e2) {
            }
        }
        return intent;
    }
}
