package p018cn.sharesdk.onekeyshare;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.p009e.p010a.C0230a;
import android.support.p001v4.view.C0333F;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.nativejsapis.JavascriptHandler;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p045a.C1063f;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p018cn.sharesdk.framework.CustomPlatform;
import p018cn.sharesdk.framework.FakeActivity;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.framework.TitleLayout;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.UIHandler;

/* renamed from: cn.sharesdk.onekeyshare.EditPage */
public class EditPage extends FakeActivity implements Handler.Callback, TextWatcher, View.OnClickListener {
    private static final int MAX_TEXT_COUNT = 140;
    private static final int MSG_AFTER_IMAGE_DOWNLOAD = 2;
    private static final int MSG_PLATFORM_LIST_GOT = 1;
    private boolean dialogMode;
    private EditText etContent;
    /* access modifiers changed from: private */
    public Bitmap image;
    private ImageView ivImage;
    private ImageView ivPin;
    private LinearLayout llAt;
    private LinearLayout llPage;
    /* access modifiers changed from: private */
    public LinearLayout llPlat;
    private TitleLayout llTitle;
    private OnekeyShare parent;
    /* access modifiers changed from: private */
    public Platform[] platformList;
    /* access modifiers changed from: private */
    public HashMap<String, Object> reqData;
    /* access modifiers changed from: private */
    public boolean shareImage;
    private TextView tvCounter;
    private View[] views;

    public void setShareData(HashMap<String, Object> hashMap) {
        this.reqData = hashMap;
    }

    public void setParent(OnekeyShare onekeyShare) {
        this.parent = onekeyShare;
    }

    public void setDialogMode() {
        this.dialogMode = true;
    }

    public void setActivity(Activity activity) {
        super.setActivity(activity);
        if (this.dialogMode) {
            activity.setTheme(16973835);
            activity.requestWindowFeature(1);
        }
        activity.getWindow().setSoftInputMode(5);
    }

    public void onCreate() {
        if (this.reqData == null) {
            finish();
            return;
        }
        initPageView();
        this.activity.setContentView(this.llPage);
        onTextChanged(this.etContent.getText(), 0, this.etContent.length(), 0);
        new Thread() {
            public void run() {
                int i = 0;
                EditPage.this.platformList = ShareSDK.getPlatformList(EditPage.this.activity);
                if (EditPage.this.platformList != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Platform platform : EditPage.this.platformList) {
                        String name = platform.getName();
                        if (!(platform instanceof CustomPlatform) && !ShareCore.isUseClientToShare(EditPage.this.activity, name)) {
                            arrayList.add(platform);
                        }
                    }
                    EditPage.this.platformList = new Platform[arrayList.size()];
                    while (true) {
                        int i2 = i;
                        if (i2 >= EditPage.this.platformList.length) {
                            UIHandler.sendEmptyMessage(1, EditPage.this);
                            return;
                        } else {
                            EditPage.this.platformList[i2] = (Platform) arrayList.get(i2);
                            i = i2 + 1;
                        }
                    }
                }
            }
        }.start();
    }

    private void initPageView() {
        this.llPage = new LinearLayout(getContext());
        this.llPage.setBackgroundColor(-13487566);
        this.llPage.setOrientation(1);
        this.llTitle = new TitleLayout(getContext());
        int bitmapRes = C0661R.getBitmapRes(this.activity, "title_back");
        if (bitmapRes > 0) {
            this.llTitle.setBackgroundResource(bitmapRes);
        }
        this.llTitle.getBtnBack().setOnClickListener(this);
        int stringRes = C0661R.getStringRes(this.activity, "multi_share");
        if (stringRes > 0) {
            this.llTitle.getTvTitle().setText(stringRes);
        }
        this.llTitle.getBtnRight().setVisibility(0);
        int stringRes2 = C0661R.getStringRes(this.activity, "share");
        if (stringRes2 > 0) {
            this.llTitle.getBtnRight().setText(stringRes2);
        }
        this.llTitle.getBtnRight().setOnClickListener(this);
        this.llTitle.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.llPage.addView(this.llTitle);
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams);
        this.llPage.addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 51;
        linearLayout.setLayoutParams(layoutParams2);
        frameLayout.addView(linearLayout);
        this.ivPin = new ImageView(getContext());
        int bitmapRes2 = C0661R.getBitmapRes(this.activity, "pin");
        if (bitmapRes2 > 0) {
            this.ivPin.setImageResource(bitmapRes2);
        }
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(C0661R.dipToPx(getContext(), 80), C0661R.dipToPx(getContext(), 36));
        layoutParams3.topMargin = C0661R.dipToPx(getContext(), 6);
        layoutParams3.gravity = 53;
        this.ivPin.setLayoutParams(layoutParams3);
        frameLayout.addView(this.ivPin);
        ImageView imageView = new ImageView(getContext());
        int bitmapRes3 = C0661R.getBitmapRes(this.activity, "title_shadow");
        if (bitmapRes3 > 0) {
            imageView.setBackgroundResource(bitmapRes3);
        }
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(imageView);
        final LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setMinimumHeight(C0661R.dipToPx(getContext(), Settings.SHOW_PRIVACY_POLICY));
        int bitmapRes4 = C0661R.getBitmapRes(this.activity, "edittext_back");
        if (bitmapRes4 > 0) {
            linearLayout2.setBackgroundResource(bitmapRes4);
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        int dipToPx = C0661R.dipToPx(getContext(), 3);
        layoutParams4.setMargins(dipToPx, dipToPx, dipToPx, dipToPx);
        layoutParams4.weight = 1.0f;
        linearLayout2.setLayoutParams(layoutParams4);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        int bitmapRes5 = C0661R.getBitmapRes(this.activity, "share_tb_back");
        if (bitmapRes5 > 0) {
            linearLayout3.setBackgroundResource(bitmapRes5);
        }
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int dipToPx2 = C0661R.dipToPx(getContext(), 4);
        layoutParams5.setMargins(dipToPx2, 0, dipToPx2, dipToPx2);
        linearLayout3.setLayoutParams(layoutParams5);
        linearLayout.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams6.weight = 1.0f;
        linearLayout4.setLayoutParams(layoutParams6);
        linearLayout2.addView(linearLayout4);
        this.etContent = new EditText(getContext());
        this.etContent.setGravity(51);
        this.etContent.setBackgroundDrawable((Drawable) null);
        this.etContent.setText(String.valueOf(this.reqData.get("text")));
        this.etContent.addTextChangedListener(this);
        this.etContent.setLayoutParams(layoutParams6);
        linearLayout4.addView(this.etContent);
        checkAtMth(linearLayout4, String.valueOf(this.reqData.get("platform")));
        int dipToPx3 = C0661R.dipToPx(getContext(), 74);
        int dipToPx4 = C0661R.dipToPx(getContext(), 16);
        String valueOf = String.valueOf(this.reqData.get(JavascriptHandler.SHARE_PARAM_IMAGE_PATH));
        if (!TextUtils.isEmpty(valueOf) && new File(valueOf).exists()) {
            try {
                this.shareImage = true;
                this.image = C0661R.getBitmap(valueOf);
            } catch (Throwable th) {
                th.printStackTrace();
                this.shareImage = false;
            }
            initImage(linearLayout2);
        } else if (this.reqData.containsKey("imageUrl")) {
            this.ivPin.setVisibility(8);
            new Thread() {
                public void run() {
                    String valueOf = String.valueOf(EditPage.this.reqData.get("imageUrl"));
                    try {
                        EditPage.this.shareImage = true;
                        EditPage.this.image = C0661R.getBitmap((Context) EditPage.this.activity, valueOf);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        EditPage.this.shareImage = false;
                        EditPage.this.image = null;
                    }
                    if (EditPage.this.image != null && !EditPage.this.image.isRecycled()) {
                        Message message = new Message();
                        message.what = 2;
                        message.obj = linearLayout2;
                        UIHandler.sendMessage(message, EditPage.this);
                    }
                }
            }.start();
        } else {
            this.shareImage = false;
            this.ivPin.setVisibility(8);
        }
        if (this.shareImage) {
            Button button = new Button(getContext());
            button.setTag("img_cancel");
            button.setOnClickListener(this);
            int bitmapRes6 = C0661R.getBitmapRes(this.activity, "img_cancel");
            if (bitmapRes6 > 0) {
                button.setBackgroundResource(bitmapRes6);
            }
            int dipToPx5 = C0661R.dipToPx(getContext(), 20);
            int dipToPx6 = C0661R.dipToPx(getContext(), 83);
            int dipToPx7 = C0661R.dipToPx(getContext(), 13);
            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(dipToPx5, dipToPx5);
            layoutParams7.topMargin = dipToPx6;
            layoutParams7.rightMargin = dipToPx7;
            layoutParams7.gravity = 53;
            button.setPadding(dipToPx2, dipToPx2, dipToPx2, dipToPx2);
            button.setLayoutParams(layoutParams7);
            frameLayout.addView(button);
        }
        this.tvCounter = new TextView(getContext());
        this.tvCounter.setText(String.valueOf(140));
        this.tvCounter.setTextColor(-3158065);
        this.tvCounter.setTextSize(1, 15.0f);
        this.tvCounter.setTypeface(Typeface.DEFAULT_BOLD);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams8.bottomMargin = dipToPx3;
        layoutParams8.gravity = 85;
        this.tvCounter.setPadding(0, 0, dipToPx4, 0);
        this.tvCounter.setLayoutParams(layoutParams8);
        frameLayout.addView(this.tvCounter);
        TextView textView = new TextView(getContext());
        int stringRes3 = C0661R.getStringRes(this.activity, "share_to");
        if (stringRes3 > 0) {
            textView.setText(stringRes3);
        }
        textView.setTextColor(-3158065);
        textView.setTextSize(1, 15.0f);
        int dipToPx8 = C0661R.dipToPx(getContext(), 9);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 16;
        layoutParams9.setMargins(dipToPx8, 0, 0, 0);
        textView.setLayoutParams(layoutParams9);
        linearLayout3.addView(textView);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setHorizontalFadingEdgeEnabled(false);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams10.setMargins(dipToPx8, dipToPx8, dipToPx8, dipToPx8);
        horizontalScrollView.setLayoutParams(layoutParams10);
        linearLayout3.addView(horizontalScrollView);
        this.llPlat = new LinearLayout(getContext());
        this.llPlat.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        horizontalScrollView.addView(this.llPlat);
    }

    private void initImage(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        linearLayout.addView(linearLayout2);
        this.ivImage = new ImageView(getContext());
        int bitmapRes = C0661R.getBitmapRes(this.activity, "btn_back_nor");
        if (bitmapRes > 0) {
            this.ivImage.setBackgroundResource(bitmapRes);
        }
        this.ivImage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.ivImage.setVisibility(8);
        this.ivImage.setVisibility(0);
        this.ivImage.setImageBitmap(this.image);
        int dipToPx = C0661R.dipToPx(getContext(), 4);
        this.ivImage.setPadding(dipToPx, dipToPx, dipToPx, dipToPx);
        int dipToPx2 = C0661R.dipToPx(getContext(), 74);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dipToPx2, dipToPx2);
        layoutParams.setMargins(0, C0661R.dipToPx(getContext(), 16), C0661R.dipToPx(getContext(), 8), 0);
        this.ivImage.setLayoutParams(layoutParams);
        linearLayout2.addView(this.ivImage);
        if (!this.shareImage) {
            this.ivPin.setVisibility(8);
            this.ivImage.setVisibility(8);
        }
        this.ivImage.setOnClickListener(this);
    }

    private void checkAtMth(LinearLayout linearLayout, String str) {
        if ("SinaWeibo".equals(str) || "TencentWeibo".equals(str) || "Facebook".equals(str) || "Twitter".equals(str)) {
            this.llAt = new LinearLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = C0661R.dipToPx(getContext(), 10);
            layoutParams.bottomMargin = C0661R.dipToPx(getContext(), 10);
            layoutParams.gravity = 83;
            this.llAt.setLayoutParams(layoutParams);
            this.llAt.setOnClickListener(this);
            linearLayout.addView(this.llAt);
            TextView textView = new TextView(getContext());
            int bitmapRes = C0661R.getBitmapRes(this.activity, "btn_back_nor");
            if (bitmapRes > 0) {
                textView.setBackgroundResource(bitmapRes);
            }
            int dipToPx = C0661R.dipToPx(getContext(), 32);
            textView.setLayoutParams(new LinearLayout.LayoutParams(dipToPx, dipToPx));
            textView.setTextSize(1, 18.0f);
            textView.setText(C1063f.f3053e);
            textView.setPadding(0, 0, 0, C0661R.dipToPx(getContext(), 2));
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextColor(C0333F.f835s);
            textView.setGravity(17);
            this.llAt.addView(textView);
            TextView textView2 = new TextView(getContext());
            textView2.setTextSize(1, 18.0f);
            textView2.setTextColor(C0333F.f835s);
            int stringRes = C0661R.getStringRes(this.activity, "list_friends");
            textView2.setText(getContext().getString(stringRes, new Object[]{getName(str)}));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            textView2.setLayoutParams(layoutParams2);
            this.llAt.addView(textView2);
        }
    }

    private String getName(String str) {
        if (str == null) {
            return "";
        }
        return getContext().getString(C0661R.getStringRes(getContext(), str));
    }

    public void onClick(View view) {
        Platform platform;
        int i = 0;
        if (view.equals(this.ivImage)) {
            if (this.image != null && !this.image.isRecycled()) {
                PicViewer picViewer = new PicViewer();
                picViewer.setImageBitmap(this.image);
                picViewer.show(this.activity, (Intent) null);
            }
        } else if (view.equals(this.llTitle.getBtnBack())) {
            while (true) {
                if (i >= this.views.length) {
                    platform = null;
                    break;
                } else if (this.views[i].getVisibility() == 4) {
                    platform = this.platformList[i];
                    break;
                } else {
                    i++;
                }
            }
            if (platform != null) {
                ShareSDK.logDemoEvent(5, platform);
            }
            finish();
        } else if (view.equals(this.llTitle.getBtnRight())) {
            this.reqData.put("text", this.etContent.getText().toString());
            if (!this.shareImage) {
                if (this.reqData.get(JavascriptHandler.SHARE_PARAM_IMAGE_PATH) == null) {
                    this.reqData.put("imageUrl", (Object) null);
                } else {
                    this.reqData.put(JavascriptHandler.SHARE_PARAM_IMAGE_PATH, (Object) null);
                }
            }
            HashMap hashMap = new HashMap();
            boolean z = false;
            for (int i2 = 0; i2 < this.views.length; i2++) {
                if (this.views[i2].getVisibility() != 0) {
                    hashMap.put(this.platformList[i2], this.reqData);
                    z = true;
                }
            }
            if (z) {
                if (this.parent != null) {
                    this.parent.share(hashMap);
                }
                finish();
                return;
            }
            int stringRes = C0661R.getStringRes(this.activity, "select_one_plat_at_least");
            if (stringRes > 0) {
                Toast.makeText(getContext(), stringRes, 0).show();
            }
        } else if (view.equals(this.llAt)) {
            FollowList followList = new FollowList();
            followList.setPlatform(ShareSDK.getPlatform(this.activity, String.valueOf(this.reqData.get("platform"))));
            followList.setBackPage(this);
            followList.show(this.activity, (Intent) null);
        } else {
            if ("img_cancel".equals(view.getTag())) {
                view.setVisibility(8);
                this.ivPin.setVisibility(8);
                this.ivImage.setVisibility(8);
                this.shareImage = false;
            }
            if (view instanceof FrameLayout) {
                ((FrameLayout) view).getChildAt(1).performClick();
            } else if (view.getVisibility() == 4) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                afterPlatformListGot();
                break;
            case 2:
                this.ivPin.setVisibility(0);
                initImage((LinearLayout) message.obj);
                break;
        }
        return false;
    }

    public void afterPlatformListGot() {
        int length;
        String valueOf = String.valueOf(this.reqData.get("platform"));
        if (this.platformList == null) {
            length = 0;
        } else {
            length = this.platformList.length;
        }
        this.views = new View[length];
        final int dipToPx = C0661R.dipToPx(getContext(), 36);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dipToPx, dipToPx);
        final int dipToPx2 = C0661R.dipToPx(getContext(), 9);
        layoutParams.setMargins(0, 0, dipToPx2, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 51;
        final int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(layoutParams);
            if (i2 >= length - 1) {
                frameLayout.setLayoutParams(new LinearLayout.LayoutParams(dipToPx, dipToPx));
            }
            this.llPlat.addView(frameLayout);
            frameLayout.setOnClickListener(this);
            ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageBitmap(getPlatLogo(this.platformList[i2]));
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(imageView);
            this.views[i2] = new View(getContext());
            this.views[i2].setBackgroundColor(-805306369);
            this.views[i2].setOnClickListener(this);
            if (valueOf != null && valueOf.equals(this.platformList[i2].getName())) {
                this.views[i2].setVisibility(4);
                ShareSDK.logDemoEvent(3, this.platformList[i2]);
                i = i2;
            }
            this.views[i2].setLayoutParams(layoutParams2);
            frameLayout.addView(this.views[i2]);
        }
        UIHandler.sendEmptyMessageDelayed(0, 333, new Handler.Callback() {
            public boolean handleMessage(Message message) {
                ((HorizontalScrollView) EditPage.this.llPlat.getParent()).scrollTo(i * (dipToPx + dipToPx2), 0);
                return false;
            }
        });
    }

    private Bitmap getPlatLogo(Platform platform) {
        int bitmapRes;
        if (platform == null || platform.getName() == null || (bitmapRes = C0661R.getBitmapRes(this.activity, "logo_" + platform.getName())) <= 0) {
            return null;
        }
        return BitmapFactory.decodeResource(this.activity.getResources(), bitmapRes);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length = 140 - this.etContent.length();
        this.tvCounter.setText(String.valueOf(length));
        this.tvCounter.setTextColor(length > 0 ? -3158065 : C0230a.f588c);
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onResult(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append('@').append(it.next()).append(' ');
        }
        this.etContent.append(sb.toString());
    }

    public void finish() {
        InputMethodManager inputMethodManager;
        try {
            inputMethodManager = (InputMethodManager) this.activity.getSystemService("input_method");
        } catch (Throwable th) {
            th.printStackTrace();
            inputMethodManager = null;
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.etContent.getWindowToken(), 0);
        }
        super.finish();
    }
}
