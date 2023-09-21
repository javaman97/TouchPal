package com.baidu.oauth;

import android.content.Context;

public class BaiduOAuth {
    private String[] mbPermission = {"basic", "netdisk"};

    public interface ILogoutListener {
        void onResult(boolean z);
    }

    public interface OAuthListener {
        void onCancel();

        void onComplete(BaiduOAuthResponse baiduOAuthResponse);

        void onException(String str);
    }

    public static class BaiduOAuthResponse {
        private String accessToken = null;
        private String expiresIn = null;
        private String refreshToken = null;
        private String userName = null;

        public void setAccessToken(String str) {
            this.accessToken = str;
        }

        public String getAccessToken() {
            return this.accessToken;
        }

        public void setUserName(String str) {
            this.userName = str;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setExpiresIn(String str) {
            this.expiresIn = str;
        }

        public String getExpiresIn() {
            return this.expiresIn;
        }

        public void setRefreshToken(String str) {
            this.refreshToken = str;
        }

        public String getRefreshToken() {
            return this.refreshToken;
        }
    }

    public void startOAuth(Context context, String str, OAuthListener oAuthListener) {
        startOAuth(context, str, this.mbPermission, oAuthListener);
    }

    public void startOAuth(Context context, String str, String[] strArr, OAuthListener oAuthListener) {
        new BaiduOAuthViaDialog(str).startDialogAuth(context, strArr, BaiduOAuthUtility.createDialogListener(context, str, oAuthListener));
    }

    public boolean logout(String str, ILogoutListener iLogoutListener) {
        return new BaiduOAuthUtility().logoutInBackground(str, iLogoutListener);
    }

    public boolean logout(String str) {
        return new BaiduOAuthUtility(str).logout();
    }
}
