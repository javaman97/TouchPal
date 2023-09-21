package com.cootek.nativejsapis;

import android.content.Context;
import android.graphics.Point;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.cootek.smartinput5.func.nativeads.C1899v;

public class DeviceInfo {
    private static ScreenSize mScreenSize;
    private Context mContext;
    private String mIMEI;
    private String mMac;

    public static class ScreenSize {
        public final int heightPixels;
        public final double size;
        public final int widthPixels;

        private ScreenSize(double d, int i, int i2) {
            this.size = d;
            this.widthPixels = i;
            this.heightPixels = i2;
        }

        /* synthetic */ ScreenSize(double d, int i, int i2, ScreenSize screenSize) {
            this(d, i, i2);
        }
    }

    public DeviceInfo(Context context) {
        this.mContext = context;
    }

    public static ScreenSize getScreenSize(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        Exception e;
        if (mScreenSize != null) {
            return mScreenSize;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i5 = displayMetrics.widthPixels;
        int i6 = displayMetrics.heightPixels;
        if (Build.VERSION.SDK_INT < 14 || Build.VERSION.SDK_INT >= 17) {
            i = i6;
            i2 = i5;
        } else {
            try {
                i5 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = i5;
            } catch (Exception e2) {
                Exception exc = e2;
                exc.printStackTrace();
                int i7 = i6;
                i2 = i5;
                i = i7;
            }
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", new Class[]{Point.class}).invoke(defaultDisplay, new Object[]{point});
                i4 = point.x;
                try {
                    i3 = point.y;
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    i3 = i;
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    double d = ((double) i3) / ((double) displayMetrics2.densityDpi);
                    double d2 = ((double) i4) / ((double) displayMetrics2.densityDpi);
                    mScreenSize = new ScreenSize(Math.sqrt((d2 * d2) + (d * d)), i4, i3, (ScreenSize) null);
                    return mScreenSize;
                }
            } catch (Exception e4) {
                i4 = i2;
                e = e4;
                e.printStackTrace();
                i3 = i;
                DisplayMetrics displayMetrics22 = context.getResources().getDisplayMetrics();
                double d3 = ((double) i3) / ((double) displayMetrics22.densityDpi);
                double d22 = ((double) i4) / ((double) displayMetrics22.densityDpi);
                mScreenSize = new ScreenSize(Math.sqrt((d22 * d22) + (d3 * d3)), i4, i3, (ScreenSize) null);
                return mScreenSize;
            }
        } else {
            i3 = i;
            i4 = i2;
        }
        DisplayMetrics displayMetrics222 = context.getResources().getDisplayMetrics();
        double d32 = ((double) i3) / ((double) displayMetrics222.densityDpi);
        double d222 = ((double) i4) / ((double) displayMetrics222.densityDpi);
        mScreenSize = new ScreenSize(Math.sqrt((d222 * d222) + (d32 * d32)), i4, i3, (ScreenSize) null);
        return mScreenSize;
    }

    public int getScreenWidth() {
        if (this.mContext != null) {
            return getScreenSize(this.mContext).widthPixels;
        }
        return 0;
    }

    public int getScreenHeight() {
        if (this.mContext != null) {
            return getScreenSize(this.mContext).heightPixels;
        }
        return 0;
    }

    public String getMnc(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (SecurityException e) {
            return "";
        }
    }

    public String getModel() {
        return Build.MODEL;
    }

    public String getIMEI() {
        if (!TextUtils.isEmpty(this.mIMEI)) {
            return this.mIMEI;
        }
        if (this.mContext != null) {
            try {
                this.mIMEI = ((TelephonyManager) this.mContext.getSystemService("phone")).getDeviceId();
            } catch (SecurityException e) {
            }
        }
        return this.mIMEI;
    }

    public String getMacAddress() {
        WifiInfo connectionInfo;
        if (!TextUtils.isEmpty(this.mMac)) {
            return this.mMac;
        }
        if (!(this.mContext == null || (connectionInfo = ((WifiManager) this.mContext.getSystemService(C1899v.f6395s)).getConnectionInfo()) == null)) {
            this.mMac = connectionInfo.getMacAddress();
        }
        return this.mMac;
    }

    public String getAndroidID() {
        if (this.mContext == null) {
            return "";
        }
        try {
            return Settings.Secure.getString(this.mContext.getContentResolver(), com.cootek.smartinput5.engine.Settings.ANDROID_ID);
        } catch (Exception e) {
            return "";
        }
    }
}
