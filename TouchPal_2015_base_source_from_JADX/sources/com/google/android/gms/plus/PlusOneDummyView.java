package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class PlusOneDummyView extends FrameLayout {
    public static final String TAG = "PlusOneDummyView";

    /* renamed from: com.google.android.gms.plus.PlusOneDummyView$a */
    private static class C3928a implements C3931d {
        private Context mContext;

        private C3928a(Context context) {
            this.mContext = context;
        }

        public Drawable getDrawable(int i) {
            return this.mContext.getResources().getDrawable(17301508);
        }

        public boolean isValid() {
            return true;
        }
    }

    /* renamed from: com.google.android.gms.plus.PlusOneDummyView$b */
    private static class C3929b implements C3931d {
        private Context mContext;

        private C3929b(Context context) {
            this.mContext = context;
        }

        public Drawable getDrawable(int i) {
            String str;
            try {
                Resources resources = this.mContext.createPackageContext(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, 4).getResources();
                switch (i) {
                    case 0:
                        str = "ic_plusone_small";
                        break;
                    case 1:
                        str = "ic_plusone_medium";
                        break;
                    case 2:
                        str = "ic_plusone_tall";
                        break;
                    default:
                        str = "ic_plusone_standard";
                        break;
                }
                return resources.getDrawable(resources.getIdentifier(str, "drawable", GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE));
            } catch (PackageManager.NameNotFoundException e) {
                return null;
            }
        }

        public boolean isValid() {
            try {
                this.mContext.createPackageContext(GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE, 4).getResources();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.plus.PlusOneDummyView$c */
    private static class C3930c implements C3931d {
        private Context mContext;

        private C3930c(Context context) {
            this.mContext = context;
        }

        public Drawable getDrawable(int i) {
            String str;
            switch (i) {
                case 0:
                    str = "ic_plusone_small_off_client";
                    break;
                case 1:
                    str = "ic_plusone_medium_off_client";
                    break;
                case 2:
                    str = "ic_plusone_tall_off_client";
                    break;
                default:
                    str = "ic_plusone_standard_off_client";
                    break;
            }
            return this.mContext.getResources().getDrawable(this.mContext.getResources().getIdentifier(str, "drawable", this.mContext.getPackageName()));
        }

        public boolean isValid() {
            return (this.mContext.getResources().getIdentifier("ic_plusone_small_off_client", "drawable", this.mContext.getPackageName()) == 0 || this.mContext.getResources().getIdentifier("ic_plusone_medium_off_client", "drawable", this.mContext.getPackageName()) == 0 || this.mContext.getResources().getIdentifier("ic_plusone_tall_off_client", "drawable", this.mContext.getPackageName()) == 0 || this.mContext.getResources().getIdentifier("ic_plusone_standard_off_client", "drawable", this.mContext.getPackageName()) == 0) ? false : true;
        }
    }

    /* renamed from: com.google.android.gms.plus.PlusOneDummyView$d */
    private interface C3931d {
        Drawable getDrawable(int i);

        boolean isValid();
    }

    public PlusOneDummyView(Context context, int i) {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        button.setBackgroundDrawable(m16910bx().getDrawable(i));
        Point T = m16909T(i);
        addView(button, new FrameLayout.LayoutParams(T.x, T.y, 17));
    }

    /* renamed from: T */
    private Point m16909T(int i) {
        int i2 = 24;
        int i3 = 20;
        Point point = new Point();
        switch (i) {
            case 0:
                i3 = 14;
                break;
            case 1:
                i2 = 32;
                break;
            case 2:
                i2 = 50;
                break;
            default:
                i2 = 38;
                i3 = 24;
                break;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float applyDimension = TypedValue.applyDimension(1, (float) i2, displayMetrics);
        float applyDimension2 = TypedValue.applyDimension(1, (float) i3, displayMetrics);
        point.x = (int) (((double) applyDimension) + 0.5d);
        point.y = (int) (((double) applyDimension2) + 0.5d);
        return point;
    }

    /* renamed from: bx */
    private C3931d m16910bx() {
        C3931d bVar = new C3929b(getContext());
        if (!bVar.isValid()) {
            bVar = new C3930c(getContext());
        }
        return !bVar.isValid() ? new C3928a(getContext()) : bVar;
    }
}
