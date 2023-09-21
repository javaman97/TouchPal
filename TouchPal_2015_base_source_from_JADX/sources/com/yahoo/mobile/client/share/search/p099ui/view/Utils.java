package com.yahoo.mobile.client.share.search.p099ui.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.Utils */
public class Utils {
    public static final long DAY_MILLIS = 86400000;
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final int[] EMPTY_INTEGER_ARRAY = new int[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    public static final String EMPTY_STRING = "";
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final long HOUR_MILLIS = 3600000;
    public static final int MAXIMUM_ZOOMLEVEL = 22;
    public static final int MINIMUM_ZOOMLEVEL = 0;
    public static final long MINUTE_MILLIS = 60000;
    public static final String UTF8 = "UTF-8";
    public static final long WEEK_MILLIS = 604800000;
    public static final long YEAR_MILLIS = 31558464000L;

    /* renamed from: a */
    private static int f17279a = 0;

    /* renamed from: b */
    private static int f17280b = 0;

    /* renamed from: c */
    private static DisplayMetrics f17281c = null;

    /* renamed from: d */
    private static HashMap<String, String> f17282d = new HashMap<>();

    /* renamed from: com.yahoo.mobile.client.share.search.ui.view.Utils$Side */
    public enum Side {
        TOP,
        LEFT,
        BOTTOM,
        RIGHT,
        FRONT,
        BACK,
        CENTER
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.size() == 0;
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.size() == 0;
    }

    public static boolean isEmpty(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static <T> T defaultIfNull(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static <T> T first(T[] tArr, T t) {
        return (tArr == null || tArr.length == 0) ? t : tArr[0];
    }

    public static <T> T first(List<T> list, T t) {
        return (list == null || list.isEmpty()) ? t : list.get(0);
    }

    public static String blankIfNull(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    public static String defaultIfEmpty(String str, String str2) {
        return (str == null || str.length() == 0) ? str2 : str;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean equalsNotNull(Object obj, Object obj2) {
        return obj == obj2 ? obj != null : obj != null && obj.equals(obj2);
    }

    public static boolean equalsIgnoreCase(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static int between(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    public static float between(float f, float f2, float f3) {
        return Math.min(Math.max(f, f3), f2);
    }

    public static double between(double d, double d2, double d3) {
        return Math.min(Math.max(d, d3), d2);
    }

    public static long between(long j, long j2, long j3) {
        return Math.min(Math.max(j, j3), j2);
    }

    public static int parseInt(String str, int i) {
        if (str == null || "".equals(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            new StringBuilder("Cannot parse to Int: ").append(str);
            return i;
        }
    }

    public static long parseLong(String str, long j) {
        if (str == null || "".equals(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            new StringBuilder("Cannot parse to Long: ").append(str);
            return j;
        }
    }

    public static double parseDouble(String str, double d) {
        if (str == null || "".equals(str)) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            new StringBuilder("Cannot parse to Double: ").append(str);
            return d;
        }
    }

    public static float parseFloat(String str, float f) {
        if (str == null || "".equals(str)) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            new StringBuilder("Cannot parse to Float: ").append(str);
            return f;
        }
    }

    public static String urlEncode(String str) {
        if (str == null || "".equals(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, UTF8);
        } catch (UnsupportedEncodingException e) {
            new StringBuilder("URL encode failed for: ").append(str);
            return str;
        }
    }

    public static String toString(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    public static boolean isAlphaNumeric(String str) {
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && (c < '0' || c > '9'))) {
                return false;
            }
        }
        return true;
    }

    public static void unbindDrawables(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback((Drawable.Callback) null);
        }
        if ((view instanceof ImageView) && ((ImageView) view).getDrawable() != null) {
            ((ImageView) view).getDrawable().setCallback((Drawable.Callback) null);
            ((ImageView) view).setImageDrawable((Drawable) null);
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < ((ViewGroup) view).getChildCount()) {
                    unbindDrawables(((ViewGroup) view).getChildAt(i2));
                    i = i2 + 1;
                } else {
                    try {
                        ((ViewGroup) view).removeAllViews();
                        return;
                    } catch (UnsupportedOperationException e) {
                        e.getLocalizedMessage();
                        return;
                    }
                }
            }
        }
    }

    public static View getStubView(Context context, int i, int i2) {
        View findViewById = ((Activity) context).findViewById(i2);
        if (findViewById == null) {
            return ((ViewStub) ((Activity) context).findViewById(i)).inflate();
        }
        return findViewById;
    }

    public static int getScreenHeight(Context context) {
        if (f17279a == 0) {
            f17281c = getDisplayMetrics(context);
            int i = 0;
            if (context instanceof Activity) {
                Rect rect = new Rect();
                ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                i = rect.top;
            } else {
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i = context.getResources().getDimensionPixelSize(identifier);
                }
            }
            f17279a = f17281c.heightPixels - i;
        }
        return f17279a;
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        f17281c = displayMetrics;
        return displayMetrics.widthPixels;
    }

    public static synchronized DisplayMetrics getDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics;
        synchronized (Utils.class) {
            if (f17281c == null) {
                f17281c = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(f17281c);
            }
            displayMetrics = f17281c;
        }
        return displayMetrics;
    }

    public static float convertDpToPixel(float f, Context context) {
        return (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f) * f;
    }

    public static float convertPixelsToDp(float f, Context context) {
        return f / (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static int getScreenHeightByPercentage(Context context, float f) {
        return (int) (((float) getScreenHeight(context)) * f);
    }

    public static int getScreenWidthByPercentage(Context context, float f) {
        return (int) (((float) getScreenWidth(context)) * f);
    }

    public static boolean isExternalStorageWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static void animateFlash(final View view) {
        view.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        view.startAnimation(alphaAnimation);
    }

    public static int getViewHeight(View view) {
        int height = view.getHeight();
        if (height != 0) {
            return height;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height >= 0) {
            return layoutParams.height;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getResources().getDisplayMetrics().heightPixels, Integer.MIN_VALUE));
        return view.getMeasuredHeight();
    }
}
