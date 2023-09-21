package p018cn.sharesdk.onekeyshare;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p018cn.sharesdk.framework.CustomPlatform;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.UIHandler;
import p100m.framework.p103ui.widget.viewpager.C4329a;
import p100m.framework.p103ui.widget.viewpager.ViewPagerClassic;

/* renamed from: cn.sharesdk.onekeyshare.PlatformGridView */
public class PlatformGridView extends LinearLayout implements Handler.Callback, View.OnClickListener {
    private static final int MSG_PLATFORM_LIST_GOT = 1;
    /* access modifiers changed from: private */
    public int COLUMN_PER_LINE;
    private int LINE_PER_PAGE;
    /* access modifiers changed from: private */
    public int PAGE_SIZE;
    /* access modifiers changed from: private */
    public ArrayList<CustomerLogo> customers;
    /* access modifiers changed from: private */
    public Bitmap grayPoint;
    /* access modifiers changed from: private */
    public HashMap<String, String> hiddenPlatforms;
    private ViewPagerClassic pager;
    private OnekeyShare parent;
    /* access modifiers changed from: private */
    public Platform[] platformList;
    /* access modifiers changed from: private */
    public ImageView[] points;
    private HashMap<String, Object> reqData;
    private boolean silent;
    /* access modifiers changed from: private */
    public Bitmap whitePoint;

    public PlatformGridView(Context context) {
        super(context);
        init(context);
    }

    public PlatformGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private void init(final Context context) {
        calPageSize();
        setOrientation(1);
        this.pager = new ViewPagerClassic(context);
        disableOverScrollMode(this.pager);
        this.pager.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(this.pager);
        new Thread() {
            public void run() {
                PlatformGridView.this.platformList = ShareSDK.getPlatformList(context);
                if (PlatformGridView.this.platformList == null) {
                    PlatformGridView.this.platformList = new Platform[0];
                }
                UIHandler.sendEmptyMessage(1, PlatformGridView.this);
            }
        }.start();
    }

    private void calPageSize() {
        float screenWidth = ((float) C0661R.getScreenWidth(getContext())) / ((float) C0661R.getScreenHeight(getContext()));
        if (((double) screenWidth) < 0.6d) {
            this.COLUMN_PER_LINE = 3;
            this.LINE_PER_PAGE = 3;
        } else if (((double) screenWidth) < 0.75d) {
            this.COLUMN_PER_LINE = 3;
            this.LINE_PER_PAGE = 2;
        } else {
            this.LINE_PER_PAGE = 1;
            if (((double) screenWidth) >= 1.75d) {
                this.COLUMN_PER_LINE = 6;
            } else if (((double) screenWidth) >= 1.5d) {
                this.COLUMN_PER_LINE = 5;
            } else if (((double) screenWidth) >= 1.3d) {
                this.COLUMN_PER_LINE = 4;
            } else {
                this.COLUMN_PER_LINE = 3;
            }
        }
        this.PAGE_SIZE = this.COLUMN_PER_LINE * this.LINE_PER_PAGE;
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                afterPlatformListGot();
                return false;
            default:
                return false;
        }
    }

    public void afterPlatformListGot() {
        int i;
        int length;
        this.pager.setAdapter(new PlatformAdapter(this));
        if (this.platformList != null) {
            int size = this.customers == null ? 0 : this.customers.size();
            if (this.platformList == null) {
                length = 0;
            } else {
                length = this.platformList.length;
            }
            int i2 = length + size;
            i = i2 / this.PAGE_SIZE;
            if (i2 % this.PAGE_SIZE > 0) {
                i++;
            }
        } else {
            i = 0;
        }
        this.points = new ImageView[i];
        if (this.points.length > 0) {
            Context context = getContext();
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setVisibility(i > 1 ? 0 : 8);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            linearLayout.setLayoutParams(layoutParams);
            addView(linearLayout);
            int dipToPx = C0661R.dipToPx(context, 5);
            int bitmapRes = C0661R.getBitmapRes(getContext(), "gray_point");
            if (bitmapRes > 0) {
                this.grayPoint = BitmapFactory.decodeResource(getResources(), bitmapRes);
            }
            int bitmapRes2 = C0661R.getBitmapRes(getContext(), "white_point");
            if (bitmapRes2 > 0) {
                this.whitePoint = BitmapFactory.decodeResource(getResources(), bitmapRes2);
            }
            for (int i3 = 0; i3 < i; i3++) {
                this.points[i3] = new ImageView(context);
                this.points[i3].setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.points[i3].setImageBitmap(this.grayPoint);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dipToPx, dipToPx);
                layoutParams2.setMargins(dipToPx, dipToPx, dipToPx, 0);
                this.points[i3].setLayoutParams(layoutParams2);
                linearLayout.addView(this.points[i3]);
            }
            this.points[this.pager.getCurrentScreen()].setImageBitmap(this.whitePoint);
        }
    }

    public void onConfigurationChanged() {
        calPageSize();
        int currentScreen = (this.pager.getCurrentScreen() * this.PAGE_SIZE) / this.PAGE_SIZE;
        removeViewAt(1);
        afterPlatformListGot();
        this.pager.setCurrentScreen(currentScreen);
    }

    public void setData(HashMap<String, Object> hashMap, boolean z) {
        this.reqData = hashMap;
        this.silent = z;
    }

    public void setHiddenPlatforms(HashMap<String, String> hashMap) {
        this.hiddenPlatforms = hashMap;
    }

    public void setCustomerLogos(ArrayList<CustomerLogo> arrayList) {
        this.customers = arrayList;
    }

    public void setParent(OnekeyShare onekeyShare) {
        this.parent = onekeyShare;
    }

    public void onClick(View view) {
        Platform platform = (Platform) view.getTag();
        if (platform == null) {
            return;
        }
        if (this.silent) {
            HashMap hashMap = new HashMap();
            hashMap.put(platform, this.reqData);
            this.parent.share(hashMap);
            return;
        }
        String name = platform.getName();
        this.reqData.put("platform", name);
        if ((platform instanceof CustomPlatform) || ShareCore.isUseClientToShare(getContext(), name)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(platform, this.reqData);
            this.parent.share(hashMap2);
            return;
        }
        EditPage editPage = new EditPage();
        editPage.setShareData(this.reqData);
        editPage.setParent(this.parent);
        if ("true".equals(String.valueOf(this.reqData.get("dialogMode")))) {
            editPage.setDialogMode();
        }
        editPage.show(this.parent.getContext(), (Intent) null);
        this.parent.finish();
    }

    private void disableOverScrollMode(View view) {
        if (Build.VERSION.SDK_INT >= 9) {
            Class<View> cls = View.class;
            try {
                Method method = cls.getMethod("setOverScrollMode", new Class[]{Integer.TYPE});
                method.setAccessible(true);
                method.invoke(view, new Object[]{2});
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.PlatformGridView$PlatformAdapter */
    private static class PlatformAdapter extends C4329a {
        /* access modifiers changed from: private */
        public View.OnClickListener callback;
        private GridView[] girds;
        private int lines;
        private List<Object> logos = new ArrayList();
        /* access modifiers changed from: private */
        public PlatformGridView platformGridView;

        public PlatformAdapter(PlatformGridView platformGridView2) {
            Platform[] platformArr;
            int i = 0;
            this.platformGridView = platformGridView2;
            Platform[] access$0 = platformGridView2.platformList;
            HashMap access$1 = platformGridView2.hiddenPlatforms;
            if (access$0 != null) {
                if (access$1 == null || access$1.size() <= 0) {
                    platformArr = access$0;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Platform platform : access$0) {
                        if (!access$1.containsKey(platform.getName())) {
                            arrayList.add(platform);
                        }
                    }
                    Platform[] platformArr2 = new Platform[arrayList.size()];
                    while (true) {
                        int i2 = i;
                        if (i2 >= platformArr2.length) {
                            break;
                        }
                        platformArr2[i2] = (Platform) arrayList.get(i2);
                        i = i2 + 1;
                    }
                    platformArr = platformArr2;
                }
                this.logos.addAll(Arrays.asList(platformArr));
            }
            ArrayList access$2 = platformGridView2.customers;
            if (access$2 != null) {
                this.logos.addAll(access$2);
            }
            this.callback = platformGridView2;
            this.girds = null;
            if (this.logos != null) {
                int size = this.logos.size();
                int access$3 = platformGridView2.PAGE_SIZE;
                int i3 = size / access$3;
                this.girds = new GridView[(size % access$3 > 0 ? i3 + 1 : i3)];
            }
        }

        public int getCount() {
            if (this.girds == null) {
                return 0;
            }
            return this.girds.length;
        }

        public View getView(int i, ViewGroup viewGroup) {
            if (this.girds[i] == null) {
                int access$3 = this.platformGridView.PAGE_SIZE;
                int i2 = access$3 * i;
                int size = this.logos == null ? 0 : this.logos.size();
                if (i2 + access$3 > size) {
                    access$3 = size - i2;
                }
                Object[] objArr = new Object[access$3];
                for (int i3 = 0; i3 < access$3; i3++) {
                    objArr[i3] = this.logos.get(i2 + i3);
                }
                if (i == 0) {
                    int access$4 = this.platformGridView.COLUMN_PER_LINE;
                    this.lines = objArr.length / access$4;
                    if (objArr.length % access$4 > 0) {
                        this.lines++;
                    }
                }
                this.girds[i] = new GridView(this);
                this.girds[i].setData(this.lines, objArr);
            }
            return this.girds[i];
        }

        public void onScreenChange(int i, int i2) {
            ImageView[] access$5 = this.platformGridView.points;
            for (ImageView imageBitmap : access$5) {
                imageBitmap.setImageBitmap(this.platformGridView.grayPoint);
            }
            access$5[i].setImageBitmap(this.platformGridView.whitePoint);
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.PlatformGridView$GridView */
    private static class GridView extends LinearLayout {
        private Object[] beans;
        private View.OnClickListener callback;
        private int lines;
        private PlatformAdapter platformAdapter;

        public GridView(PlatformAdapter platformAdapter2) {
            super(platformAdapter2.platformGridView.getContext());
            this.platformAdapter = platformAdapter2;
            this.callback = platformAdapter2.callback;
        }

        public void setData(int i, Object[] objArr) {
            this.lines = i;
            this.beans = objArr;
            init();
        }

        private void init() {
            int dipToPx = C0661R.dipToPx(getContext(), 5);
            setPadding(0, dipToPx, 0, dipToPx);
            setOrientation(1);
            int length = this.beans == null ? 0 : this.beans.length;
            int access$4 = this.platformAdapter.platformGridView.COLUMN_PER_LINE;
            int i = length / access$4;
            if (length % access$4 > 0) {
                i++;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            for (int i2 = 0; i2 < this.lines; i2++) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setPadding(dipToPx, 0, dipToPx, 0);
                addView(linearLayout);
                if (i2 < i) {
                    for (int i3 = 0; i3 < access$4; i3++) {
                        int i4 = (i2 * access$4) + i3;
                        if (i4 >= length) {
                            LinearLayout linearLayout2 = new LinearLayout(getContext());
                            linearLayout2.setLayoutParams(layoutParams);
                            linearLayout.addView(linearLayout2);
                        } else {
                            LinearLayout view = getView(i4, this.callback, getContext());
                            view.setTag(this.beans[i4]);
                            view.setLayoutParams(layoutParams);
                            linearLayout.addView(view);
                        }
                    }
                }
            }
        }

        private LinearLayout getView(int i, View.OnClickListener onClickListener, Context context) {
            String str;
            Bitmap bitmap;
            if (this.beans[i] instanceof Platform) {
                bitmap = getIcon((Platform) this.beans[i]);
                str = getName((Platform) this.beans[i]);
            } else {
                Bitmap bitmap2 = ((CustomerLogo) this.beans[i]).logo;
                String str2 = ((CustomerLogo) this.beans[i]).label;
                onClickListener = ((CustomerLogo) this.beans[i]).listener;
                str = str2;
                bitmap = bitmap2;
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(context);
            int dipToPx = C0661R.dipToPx(context, 5);
            imageView.setPadding(dipToPx, dipToPx, dipToPx, dipToPx);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(dipToPx, dipToPx, dipToPx, dipToPx);
            layoutParams.gravity = 1;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageBitmap(bitmap);
            linearLayout.addView(imageView);
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setSingleLine();
            textView.setIncludeFontPadding(false);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 1;
            layoutParams2.weight = 1.0f;
            layoutParams2.setMargins(dipToPx, 0, dipToPx, dipToPx);
            textView.setLayoutParams(layoutParams2);
            textView.setText(str);
            linearLayout.addView(textView);
            linearLayout.setOnClickListener(onClickListener);
            return linearLayout;
        }

        private Bitmap getIcon(Platform platform) {
            if (platform == null || platform.getName() == null) {
                return null;
            }
            return BitmapFactory.decodeResource(getResources(), C0661R.getBitmapRes(getContext(), "logo_" + platform.getName()));
        }

        private String getName(Platform platform) {
            if (platform == null || platform.getName() == null) {
                return "";
            }
            int stringRes = C0661R.getStringRes(getContext(), platform.getName());
            if (stringRes > 0) {
                return getContext().getString(stringRes);
            }
            return null;
        }
    }
}
