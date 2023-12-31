package com.google.android.gms.auth;

import android.accounts.AccountManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.R;
import com.google.android.gms.common.C3521a;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.C3582a;
import java.io.IOException;
import java.net.URISyntaxException;

public final class GoogleAuthUtil {
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_ANDROID_PACKAGE_NAME = (Build.VERSION.SDK_INT >= 14 ? "androidPackageName" : "androidPackageName");
    public static final String KEY_CALLER_UID = (Build.VERSION.SDK_INT >= 11 ? "callerUid" : "callerUid");
    public static final String KEY_REQUEST_ACTIONS = "request_visible_actions";
    @Deprecated
    public static final String KEY_REQUEST_VISIBLE_ACTIVITIES = "request_visible_actions";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";

    /* renamed from: u */
    private static final ComponentName f15230u = new ComponentName(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, "com.google.android.gms.auth.GetToken");

    /* renamed from: v */
    private static final ComponentName f15231v = new ComponentName(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, "com.google.android.gms.recovery.RecoveryService");

    /* renamed from: w */
    private static final Intent f15232w = new Intent().setComponent(f15230u);

    /* renamed from: x */
    private static final Intent f15233x = new Intent().setComponent(f15231v);

    private GoogleAuthUtil() {
    }

    /* renamed from: a */
    private static String m15323a(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        int i;
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            return getToken(context, str, str2, bundle);
        } catch (GooglePlayServicesAvailabilityException e) {
            PendingIntent errorPendingIntent = GooglePlayServicesUtil.getErrorPendingIntent(e.getConnectionStatusCode(), context, 0);
            Resources resources = context.getResources();
            Notification notification = new Notification(17301642, resources.getString(R.string.auth_client_play_services_err_notification_msg), System.currentTimeMillis());
            notification.flags |= 16;
            String str3 = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str3)) {
                str3 = context.getPackageName();
            }
            String string = resources.getString(R.string.auth_client_requested_by_msg, new Object[]{str3});
            switch (e.getConnectionStatusCode()) {
                case 1:
                    i = R.string.auth_client_needs_installation_title;
                    break;
                case 2:
                    i = R.string.auth_client_needs_update_title;
                    break;
                case 3:
                    i = R.string.auth_client_needs_enabling_title;
                    break;
                default:
                    i = R.string.auth_client_using_bad_version_title;
                    break;
            }
            notification.setLatestEventInfo(context, resources.getString(i), string, errorPendingIntent);
            ((NotificationManager) context.getSystemService("notification")).notify(39789, notification);
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        } catch (UserRecoverableAuthException e2) {
            throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
        }
    }

    /* renamed from: a */
    private static void m15324a(Context context) throws GooglePlayServicesAvailabilityException, GoogleAuthException {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable != 0) {
            Intent a = GooglePlayServicesUtil.m15333a(context, isGooglePlayServicesAvailable, -1);
            String str = "GooglePlayServices not available due to error " + isGooglePlayServicesAvailable;
            Log.e("GoogleAuthUtil", str);
            if (a == null) {
                throw new GoogleAuthException(str);
            }
            throw new GooglePlayServicesAvailabilityException(isGooglePlayServicesAvailable, "GooglePlayServicesNotAvailable", a);
        }
    }

    /* renamed from: a */
    private static void m15325a(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Callack cannot be null.");
        }
        try {
            Intent.parseUri(intent.toUri(1), 1);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
        }
    }

    /* renamed from: a */
    private static boolean m15326a(String str) {
        return "NetworkError".equals(str) || "ServiceUnavailable".equals(str) || "Timeout".equals(str);
    }

    /* renamed from: b */
    private static void m15327b(Context context) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && myLooper == context.getMainLooper()) {
            IllegalStateException illegalStateException = new IllegalStateException("calling this from your main thread can lead to deadlock");
            Log.e("GoogleAuthUtil", "Calling this from your main thread can lead to deadlock and/or ANRs", illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: b */
    private static boolean m15328b(String str) {
        return "BadAuthentication".equals(str) || "CaptchaRequired".equals(str) || "DeviceManagementRequiredOrSyncDisabled".equals(str) || "NeedPermission".equals(str) || "NeedsBrowser".equals(str) || "UserCancel".equals(str) || "AppDownloadRequired".equals(str);
    }

    public static String getToken(Context context, String str, String str2) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        return getToken(context, str, str2, new Bundle());
    }

    public static String getToken(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableAuthException, GoogleAuthException {
        Context applicationContext = context.getApplicationContext();
        m15327b(applicationContext);
        m15324a(applicationContext);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        if (!bundle2.containsKey(KEY_ANDROID_PACKAGE_NAME)) {
            bundle2.putString(KEY_ANDROID_PACKAGE_NAME, context.getPackageName());
        }
        C3521a aVar = new C3521a();
        if (context.bindService(f15232w, aVar, 1)) {
            try {
                Bundle a = C3582a.C3583a.m15582a(aVar.mo10953e()).mo11376a(str, str2, bundle2);
                String string = a.getString("authtoken");
                if (!TextUtils.isEmpty(string)) {
                    context.unbindService(aVar);
                    return string;
                }
                String string2 = a.getString("Error");
                Intent intent = (Intent) a.getParcelable("userRecoveryIntent");
                if (m15328b(string2)) {
                    throw new UserRecoverableAuthException(string2, intent);
                } else if (m15326a(string2)) {
                    throw new IOException(string2);
                } else {
                    throw new GoogleAuthException(string2);
                }
            } catch (RemoteException e) {
                Log.i("GoogleAuthUtil", "GMS remote exception ", e);
                throw new IOException("remote exception");
            } catch (InterruptedException e2) {
                throw new GoogleAuthException("Interrupted");
            } catch (Throwable th) {
                context.unbindService(aVar);
                throw th;
            }
        } else {
            throw new UserRecoverableAuthException("AppDownloadRequired", (Intent) null);
        }
    }

    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("handle_notification", true);
        return m15323a(context, str, str2, bundle);
    }

    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle, Intent intent) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        m15325a(intent);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("callback_intent", intent);
        bundle.putBoolean("handle_notification", true);
        return m15323a(context, str, str2, bundle);
    }

    public static String getTokenWithNotification(Context context, String str, String str2, Bundle bundle, String str3, Bundle bundle2) throws IOException, UserRecoverableNotifiedException, GoogleAuthException {
        if (TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Authority cannot be empty or null.");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        ContentResolver.validateSyncExtrasBundle(bundle2);
        bundle.putString("authority", str3);
        bundle.putBundle("sync_extras", bundle2);
        bundle.putBoolean("handle_notification", true);
        return m15323a(context, str, str2, bundle);
    }

    public static void invalidateToken(Context context, String str) {
        AccountManager.get(context).invalidateAuthToken(GOOGLE_ACCOUNT_TYPE, str);
    }
}
