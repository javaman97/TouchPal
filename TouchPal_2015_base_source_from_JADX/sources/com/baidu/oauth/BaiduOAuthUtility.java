package com.baidu.oauth;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import com.baidu.oauth.BaiduOAuth;
import com.baidu.oauth.BaiduOAuthViaDialog;
import com.baidu.pcs.BaiduPCSClient;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.net.cmd.C2270d;
import com.weibo.net.C4057s;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

class BaiduOAuthUtility {
    static final String Key_AccessToken = "access_token";
    static final String Key_Method = "method";
    /* access modifiers changed from: private */
    public String Key_ENC = "enc";
    private String Key_Format = "format";
    private String Key_Logout_Result = C2270d.f9912d;
    /* access modifiers changed from: private */
    public String Key_Model = "model";
    /* access modifiers changed from: private */
    public String Key_SN = "sn";
    /* access modifiers changed from: private */
    public String Key_Type = "type";
    public String Key_UserName = BaiduPCSClient.Key_UserName;
    /* access modifiers changed from: private */
    public int Max_Tries = 8;
    /* access modifiers changed from: private */
    public int Sleep_Interval = 1000;
    private String Url_ExpireToken = "https://openapi.baidu.com/rest/2.0/passport/auth/expireSession";
    /* access modifiers changed from: private */
    public String Url_Register = "https://pcs.baidu.com/rest/2.0/pcs/coupon";
    private String Url_UserInfo = "https://openapi.baidu.com/rest/2.0/passport/users/getinfo";
    private String Value_Format = "json";
    /* access modifiers changed from: private */
    public String Value_Register = "register";
    /* access modifiers changed from: private */
    public String Value_Type_IMEI = Settings.IMEI;
    /* access modifiers changed from: private */
    public String mAccessToken = null;

    public BaiduOAuthUtility(String str) {
        this.mAccessToken = str;
    }

    public BaiduOAuthUtility() {
    }

    public String getUserName() {
        String str = this.mAccessToken;
        if (str == null || str.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("access_token", str));
        HttpResponse sendHttpRequest = sendHttpRequest(new HttpGet(String.valueOf(this.Url_UserInfo) + C2261Q.f9807m + buildParams(arrayList)));
        if (sendHttpRequest == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(EntityUtils.toString(sendHttpRequest.getEntity()));
            if (jSONObject.has(this.Key_UserName)) {
                return jSONObject.getString(this.Key_UserName);
            }
            return C1351J.f4161f;
        } catch (IOException | ParseException | JSONException e) {
            return null;
        }
    }

    public boolean logout() {
        boolean z = true;
        String str = this.mAccessToken;
        if (str == null || str.length() <= 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("access_token", str));
        arrayList.add(new BasicNameValuePair(this.Key_Format, this.Value_Format));
        HttpResponse sendHttpRequest = sendHttpRequest(new HttpGet(String.valueOf(this.Url_ExpireToken) + C2261Q.f9807m + buildParams(arrayList)));
        if (sendHttpRequest == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(EntityUtils.toString(sendHttpRequest.getEntity()));
            if (!jSONObject.has(this.Key_Logout_Result)) {
                return false;
            }
            if (1 != jSONObject.getInt(this.Key_Logout_Result)) {
                z = false;
            }
            return z;
        } catch (IOException | ParseException | JSONException e) {
            return false;
        }
    }

    public void register(final String str, final String str2) {
        new Thread(new Runnable() {
            public void run() {
                boolean z = false;
                if (str2 != null && str != null && BaiduOAuthUtility.this.mAccessToken != null) {
                    try {
                        MessageDigest instance = MessageDigest.getInstance("MD5");
                        if (instance != null) {
                            String str = Build.MODEL;
                            instance.update((String.valueOf(str) + str2 + str).getBytes());
                            String lowerCase = BaiduOAuthUtility.toHexString(instance.digest(), "").toLowerCase();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new BasicNameValuePair("access_token", BaiduOAuthUtility.this.mAccessToken));
                            arrayList.add(new BasicNameValuePair(BaiduOAuthUtility.Key_Method, BaiduOAuthUtility.this.Value_Register));
                            arrayList.add(new BasicNameValuePair(BaiduOAuthUtility.this.Key_Type, BaiduOAuthUtility.this.Value_Type_IMEI));
                            arrayList.add(new BasicNameValuePair(BaiduOAuthUtility.this.Key_SN, str2));
                            arrayList.add(new BasicNameValuePair(BaiduOAuthUtility.this.Key_Model, str));
                            arrayList.add(new BasicNameValuePair(BaiduOAuthUtility.this.Key_ENC, lowerCase));
                            HttpGet httpGet = new HttpGet(String.valueOf(BaiduOAuthUtility.this.Url_Register) + C2261Q.f9807m + BaiduOAuthUtility.this.buildParams(arrayList));
                            int i = 0;
                            while (!z && i < BaiduOAuthUtility.this.Max_Tries) {
                                HttpResponse sendHttpRequest = BaiduOAuthUtility.this.sendHttpRequest(httpGet);
                                if (sendHttpRequest == null || sendHttpRequest == null) {
                                    Thread.sleep((long) ((i + 1) * BaiduOAuthUtility.this.Sleep_Interval));
                                } else {
                                    z = true;
                                }
                                i++;
                            }
                        }
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }).start();
    }

    /* access modifiers changed from: private */
    public static String toHexString(byte[] bArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString).append(str);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String buildParams(List<NameValuePair> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        try {
            return EntityUtils.toString(new UrlEncodedFormEntity(list, "utf8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public boolean logoutInBackground(String str, BaiduOAuth.ILogoutListener iLogoutListener) {
        new LogoutTask(iLogoutListener).execute(new String[]{str});
        return true;
    }

    private class LogoutTask extends AsyncTask<String, Void, Boolean> {
        private BaiduOAuth.ILogoutListener mlogoutListener = null;

        public LogoutTask(BaiduOAuth.ILogoutListener iLogoutListener) {
            this.mlogoutListener = iLogoutListener;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Boolean bool) {
            this.mlogoutListener.onResult(bool.booleanValue());
        }

        /* access modifiers changed from: protected */
        public Boolean doInBackground(String... strArr) {
            boolean z = false;
            if (strArr != null && strArr.length > 0) {
                z = new BaiduOAuthUtility(strArr[0]).logout();
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: protected */
    public HttpResponse sendHttpRequest(HttpRequestBase httpRequestBase) {
        HttpResponse httpResponse;
        HttpResponse httpResponse2 = null;
        if (httpRequestBase != null) {
            HttpClient makeHttpClient = HttpClientFactory.makeHttpClient();
            HttpClientParams.setCookiePolicy(makeHttpClient.getParams(), "compatibility");
            if (makeHttpClient != null) {
                int i = 0;
                while (httpResponse2 == null && i < 6) {
                    try {
                        httpResponse = makeHttpClient.execute(httpRequestBase);
                    } catch (NullPointerException e) {
                        httpResponse = httpResponse2;
                    } catch (ClientProtocolException e2) {
                        httpResponse = httpResponse2;
                    } catch (IOException e3) {
                        httpResponse = httpResponse2;
                    }
                    if (httpResponse == null) {
                        try {
                            Thread.sleep((long) ((i + 1) * 1000));
                        } catch (InterruptedException e4) {
                        }
                    }
                    i++;
                    httpResponse2 = httpResponse;
                }
            }
        }
        return httpResponse2;
    }

    static BaiduOAuthViaDialog.DialogListener createDialogListener(final Context context, final String str, final BaiduOAuth.OAuthListener oAuthListener) {
        return new BaiduOAuthViaDialog.DialogListener() {
            public void onException(String str) {
                if (BaiduOAuth.OAuthListener.this != null) {
                    BaiduOAuth.OAuthListener.this.onException(str);
                }
            }

            public void onComplete(Bundle bundle) {
                if (BaiduOAuth.OAuthListener.this != null) {
                    final Handler handler = new Handler();
                    final Context context = context;
                    final String str = str;
                    final BaiduOAuth.OAuthListener oAuthListener = BaiduOAuth.OAuthListener.this;
                    final Bundle bundle2 = bundle;
                    new Thread(new Runnable() {
                        public void run() {
                            final String string = bundle2.getString("access_token");
                            final String string2 = bundle2.getString(C4057s.f16527i);
                            if (string != null && string.length() > 0) {
                                BaiduOAuthUtility baiduOAuthUtility = new BaiduOAuthUtility(string);
                                final String userName = baiduOAuthUtility.getUserName();
                                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                if (telephonyManager != null) {
                                    baiduOAuthUtility.register(str, telephonyManager.getSimSerialNumber());
                                }
                                Handler handler = handler;
                                final BaiduOAuth.OAuthListener oAuthListener = oAuthListener;
                                handler.post(new Runnable() {
                                    public void run() {
                                        BaiduOAuth.BaiduOAuthResponse baiduOAuthResponse = new BaiduOAuth.BaiduOAuthResponse();
                                        baiduOAuthResponse.setAccessToken(string);
                                        baiduOAuthResponse.setUserName(userName);
                                        baiduOAuthResponse.setExpiresIn(string2);
                                        oAuthListener.onComplete(baiduOAuthResponse);
                                    }
                                });
                            }
                        }
                    }).start();
                }
            }

            public void onCancel() {
                if (BaiduOAuth.OAuthListener.this != null) {
                    BaiduOAuth.OAuthListener.this.onCancel();
                }
            }
        };
    }
}
