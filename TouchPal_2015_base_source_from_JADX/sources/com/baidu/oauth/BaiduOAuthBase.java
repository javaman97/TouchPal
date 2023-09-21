package com.baidu.oauth;

import com.cootek.smartinput5.net.cmd.C2261Q;
import java.util.List;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

abstract class BaiduOAuthBase {
    public static String AUTH_URL = "https://openapi.baidu.com/oauth/2.0/authorize?response_type=token&redirect_uri=oob&display=mobile";
    public static String EXPLICIT_AUTH_URL = "https://openapi.baidu.com/xcloud/1.0/authorize?response_type=token&redirect_uri=oob&display=mobile";
    public static final int OAUTH_ERR_GENERAL = -1;
    public static final String REGISTERSUCCESS_URL = "http://wap.baidu.com/?";
    public static final String SUCCESS_URL = "/login_success";
    static final String TAG_Key_Method = "method";
    static final String TAG_URL_EXPIRES = "expires_in";
    static final String TAG_URL_SESSION_KEY = "session_key";
    static final String TAG_URL_SESSION_SECRET = "session_secret";
    static final String TAG_URL_THIRD_ACCESS_TOKEN = "third_access_token";
    static final String TAG_URL_TOKEN = "access_token";
    private String mAccessToken = null;
    private String mConsumerKey;
    private long mExpiresDate;
    private String mSessionKey;
    private String mSessionSecret;

    public BaiduOAuthBase(String str) {
        this.mConsumerKey = str;
    }

    public BaiduOAuthBase(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("'cientid' must be non-null");
        }
        this.mConsumerKey = str;
        setAccessToken(str2);
    }

    public boolean IsSessionValid() {
        return getAccessToken() != null && (getAccessExpires() == 0 || System.currentTimeMillis() < getAccessExpires());
    }

    public void signInHeader(HttpRequest httpRequest) {
        httpRequest.addHeader(C2261Q.f9792am, "BDUSS=9BUU5tcS1PWXBaZHNhUmFCeDNhVmk2aHRRNWJ-Q0NPNEUzRm9MNHhmOUJNZTlPQUFBQUFBJCQAAAAAAAAAAAouSSCTkHMeeWlkaXNrX3Rlc3QwMQAAAAAAAAAAAAAAAAAAAAAAAACAYIArMAAAAOAahn4AAAAAuWZCAAAAAAAxMC42NS4yMkGkx05BpMdOZk");
    }

    public void signInUri(List<NameValuePair> list) {
        synchronized (this) {
            list.add(new BasicNameValuePair("access_token", getAccessToken()));
        }
    }

    public void addCommonParameter(List<NameValuePair> list) {
        list.add(new BasicNameValuePair("clienttype", "1"));
        list.add(new BasicNameValuePair("channel", ""));
        list.add(new BasicNameValuePair("version", "1"));
    }

    private long getAccessExpires() {
        long j;
        synchronized (this) {
            j = this.mExpiresDate;
        }
        return j;
    }

    public boolean isLinked() {
        boolean z;
        synchronized (this) {
            z = this.mAccessToken != null;
        }
        return z;
    }

    public void unlink() {
        setAccessToken((String) null);
    }

    /* access modifiers changed from: protected */
    public void setAccessExpiresIn(String str) {
        if (str != null && !str.equals("0")) {
            setAccessExpires(System.currentTimeMillis() + (Long.parseLong(str) * 1000));
        }
    }

    public void setAccessExpires(long j) {
        synchronized (this) {
            this.mExpiresDate = j;
        }
    }

    public long getExpireExpires() {
        long j;
        synchronized (this) {
            j = this.mExpiresDate;
        }
        return j;
    }

    public void setConsumerKey(String str) {
        synchronized (this) {
            this.mConsumerKey = str;
        }
    }

    public String getConsumerKey() {
        String str;
        synchronized (this) {
            str = this.mConsumerKey;
        }
        return str;
    }

    public String getAccessToken() {
        String str;
        synchronized (this) {
            str = this.mAccessToken;
        }
        return str;
    }

    public void setAccessToken(String str) {
        synchronized (this) {
            this.mAccessToken = str;
        }
    }

    /* access modifiers changed from: protected */
    public void setmSessionKey(String str) {
        synchronized (this) {
            this.mSessionKey = str;
        }
    }

    /* access modifiers changed from: protected */
    public void setmSessionSecret(String str) {
        synchronized (this) {
            this.mSessionSecret = str;
        }
    }

    /* access modifiers changed from: protected */
    public void setmExpiresDate(long j) {
        synchronized (this) {
            this.mExpiresDate = j;
        }
    }
}
