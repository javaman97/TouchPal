package p018cn.sharesdk.onekeyshare;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.cootek.nativejsapis.JavascriptHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p018cn.sharesdk.framework.CustomPlatform;
import p018cn.sharesdk.framework.FakeActivity;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.PlatformActionListener;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.UIHandler;

/* renamed from: cn.sharesdk.onekeyshare.OnekeyShare */
public class OnekeyShare extends FakeActivity implements Handler.Callback, View.OnClickListener, PlatformActionListener {
    private static final int MSG_ACTION_CCALLBACK = 2;
    private static final int MSG_CANCEL_NOTIFY = 3;
    private static final int MSG_TOAST = 1;
    private Animation animHide;
    private Animation animShow;
    private Button btnCancel;
    private PlatformActionListener callback = this;
    private boolean canceled;
    private ArrayList<CustomerLogo> customers = new ArrayList<>();
    private ShareContentCustomizeCallback customizeCallback;
    private boolean dialogMode;
    private boolean disableSSO;
    private boolean finishing;
    /* access modifiers changed from: private */
    public FrameLayout flPage;
    private PlatformGridView grid;
    private HashMap<String, String> hiddenPlatforms = new HashMap<>();
    private int notifyIcon;
    private String notifyTitle;
    private HashMap<String, Object> reqMap = new HashMap<>();
    private boolean silent;

    public void show(Context context) {
        super.show(context, (Intent) null);
    }

    public void setNotification(int i, String str) {
        this.notifyIcon = i;
        this.notifyTitle = str;
    }

    public void setAddress(String str) {
        this.reqMap.put("address", str);
    }

    public void setTitle(String str) {
        this.reqMap.put("title", str);
    }

    public void setTitleUrl(String str) {
        this.reqMap.put("titleUrl", str);
    }

    public void setText(String str) {
        this.reqMap.put("text", str);
    }

    public String getText() {
        if (this.reqMap.containsKey("text")) {
            return String.valueOf(this.reqMap.get("text"));
        }
        return null;
    }

    public void setImagePath(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.reqMap.put(JavascriptHandler.SHARE_PARAM_IMAGE_PATH, str);
        }
    }

    public void setImageUrl(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.reqMap.put("imageUrl", str);
        }
    }

    public void setUrl(String str) {
        this.reqMap.put("url", str);
    }

    public void setFilePath(String str) {
        this.reqMap.put("filePath", str);
    }

    public void setComment(String str) {
        this.reqMap.put("comment", str);
    }

    public void setSite(String str) {
        this.reqMap.put("site", str);
    }

    public void setSiteUrl(String str) {
        this.reqMap.put("siteUrl", str);
    }

    public void setVenueName(String str) {
        this.reqMap.put("venueName", str);
    }

    public void setVenueDescription(String str) {
        this.reqMap.put("venueDescription", str);
    }

    public void setLatitude(float f) {
        this.reqMap.put("latitude", Float.valueOf(f));
    }

    public void setLongitude(float f) {
        this.reqMap.put("longitude", Float.valueOf(f));
    }

    public void setSilent(boolean z) {
        this.silent = z;
    }

    public void setPlatform(String str) {
        this.reqMap.put("platform", str);
    }

    public void setCallback(PlatformActionListener platformActionListener) {
        this.callback = platformActionListener;
    }

    public PlatformActionListener getCallback() {
        return this.callback;
    }

    public void setShareContentCustomizeCallback(ShareContentCustomizeCallback shareContentCustomizeCallback) {
        this.customizeCallback = shareContentCustomizeCallback;
    }

    public ShareContentCustomizeCallback getShareContentCustomizeCallback() {
        return this.customizeCallback;
    }

    public void setCustomerLogo(Bitmap bitmap, String str, View.OnClickListener onClickListener) {
        CustomerLogo customerLogo = new CustomerLogo();
        customerLogo.label = str;
        customerLogo.logo = bitmap;
        customerLogo.listener = onClickListener;
        this.customers.add(customerLogo);
    }

    public void disableSSOWhenAuthorize() {
        this.disableSSO = true;
    }

    public void setDialogMode() {
        this.dialogMode = true;
        this.reqMap.put("dialogMode", Boolean.valueOf(this.dialogMode));
    }

    public void addHiddenPlatform(String str) {
        this.hiddenPlatforms.put(str, str);
    }

    public void onCreate() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.reqMap);
        if (hashMap.containsKey("platform")) {
            String valueOf = String.valueOf(hashMap.get("platform"));
            if (this.silent) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(ShareSDK.getPlatform(this.activity, valueOf), hashMap);
                share(hashMap2);
            } else if (ShareCore.isUseClientToShare(this.activity, valueOf)) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put(ShareSDK.getPlatform(this.activity, valueOf), hashMap);
                share(hashMap3);
            } else if (ShareSDK.getPlatform(this.activity, valueOf) instanceof CustomPlatform) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put(ShareSDK.getPlatform(this.activity, valueOf), hashMap);
                share(hashMap4);
            } else {
                EditPage editPage = new EditPage();
                editPage.setShareData(hashMap);
                editPage.setParent(this);
                if (this.dialogMode) {
                    editPage.setDialogMode();
                }
                editPage.show(this.activity, (Intent) null);
            }
            finish();
            return;
        }
        this.finishing = false;
        this.canceled = false;
        initPageView();
        initAnim();
        this.activity.setContentView(this.flPage);
        this.grid.setData(hashMap, this.silent);
        this.grid.setHiddenPlatforms(this.hiddenPlatforms);
        this.grid.setCustomerLogos(this.customers);
        this.grid.setParent(this);
        this.btnCancel.setOnClickListener(this);
        this.flPage.clearAnimation();
        this.flPage.startAnimation(this.animShow);
        ShareSDK.logDemoEvent(1, (Platform) null);
    }

    private void initPageView() {
        this.flPage = new FrameLayout(getContext());
        this.flPage.setOnClickListener(this);
        C06841 r0 = new LinearLayout(getContext()) {
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        };
        r0.setOrientation(1);
        int bitmapRes = C0661R.getBitmapRes(getContext(), "share_vp_back");
        if (bitmapRes > 0) {
            r0.setBackgroundResource(bitmapRes);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        r0.setLayoutParams(layoutParams);
        this.flPage.addView(r0);
        this.grid = new PlatformGridView(getContext());
        this.grid.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r0.addView(this.grid);
        this.btnCancel = new Button(getContext());
        this.btnCancel.setTextColor(-1);
        this.btnCancel.setTextSize(1, 20.0f);
        int stringRes = C0661R.getStringRes(getContext(), "cancel");
        if (stringRes > 0) {
            this.btnCancel.setText(stringRes);
        }
        this.btnCancel.setPadding(0, 0, 0, C0661R.dipToPx(getContext(), 5));
        int bitmapRes2 = C0661R.getBitmapRes(getContext(), "btn_cancel_back");
        if (bitmapRes2 > 0) {
            this.btnCancel.setBackgroundResource(bitmapRes2);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C0661R.dipToPx(getContext(), 45));
        int dipToPx = C0661R.dipToPx(getContext(), 10);
        layoutParams2.setMargins(dipToPx, dipToPx, dipToPx, dipToPx);
        this.btnCancel.setLayoutParams(layoutParams2);
        r0.addView(this.btnCancel);
    }

    private void initAnim() {
        this.animShow = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.animShow.setDuration(300);
        this.animHide = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.animHide.setDuration(300);
    }

    public void onClick(View view) {
        if (view.equals(this.flPage) || view.equals(this.btnCancel)) {
            this.canceled = true;
            finish();
        }
    }

    public boolean onKeyEvent(int i, KeyEvent keyEvent) {
        if (i == 4) {
            this.canceled = true;
        }
        return super.onKeyEvent(i, keyEvent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.grid != null) {
            this.grid.onConfigurationChanged();
        }
    }

    public void finish() {
        if (!this.finishing) {
            if (this.animHide == null) {
                this.finishing = true;
                super.finish();
                return;
            }
            if (this.canceled) {
                ShareSDK.logDemoEvent(2, (Platform) null);
            }
            this.finishing = true;
            this.animHide.setAnimationListener(new Animation.AnimationListener() {
                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    OnekeyShare.this.flPage.setVisibility(8);
                    OnekeyShare.super.finish();
                }
            });
            this.flPage.clearAnimation();
            this.flPage.startAnimation(this.animHide);
        }
    }

    public void share(HashMap<Platform, HashMap<String, Object>> hashMap) {
        int i;
        int stringRes;
        boolean z = false;
        for (Map.Entry next : hashMap.entrySet()) {
            Platform platform = (Platform) next.getKey();
            platform.SSOSetting(this.disableSSO);
            String name = platform.getName();
            if (("WechatMoments".equals(name) || "Wechat".equals(name) || "WechatFavorite".equals(name)) && !platform.isValid()) {
                Message message = new Message();
                message.what = 1;
                message.obj = this.activity.getString(C0661R.getStringRes(getContext(), "wechat_client_inavailable"));
                UIHandler.sendMessage(message, this);
            } else if ("GooglePlus".equals(name) && !platform.isValid()) {
                Message message2 = new Message();
                message2.what = 1;
                message2.obj = this.activity.getString(C0661R.getStringRes(getContext(), "google_plus_client_inavailable"));
                UIHandler.sendMessage(message2, this);
            } else if ("QQ".equals(name) && !platform.isValid()) {
                Message message3 = new Message();
                message3.what = 1;
                message3.obj = this.activity.getString(C0661R.getStringRes(getContext(), "qq_client_inavailable"));
                UIHandler.sendMessage(message3, this);
            } else if (!"Pinterest".equals(name) || platform.isValid()) {
                if ("Instagram".equals(name)) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setPackage("com.instagram.android");
                    intent.setType("image/*");
                    if (this.activity.getPackageManager().resolveActivity(intent, 0) == null) {
                        Message message4 = new Message();
                        message4.what = 1;
                        message4.obj = this.activity.getString(C0661R.getStringRes(getContext(), "instagram_client_inavailable"));
                        UIHandler.sendMessage(message4, this);
                    }
                }
                if (!("YixinMoments".equals(name) || "Yixin".equals(name)) || platform.isValid()) {
                    HashMap hashMap2 = (HashMap) next.getValue();
                    String valueOf = String.valueOf(hashMap2.get(JavascriptHandler.SHARE_PARAM_IMAGE_PATH));
                    if (valueOf == null || !new File(valueOf).exists()) {
                        Object obj = hashMap2.get("imageUrl");
                        if (obj == null || TextUtils.isEmpty(String.valueOf(obj))) {
                            i = 1;
                        } else if (String.valueOf(obj).endsWith(".gif")) {
                            i = 9;
                        } else {
                            if (hashMap2.containsKey("url") && !TextUtils.isEmpty(hashMap2.get("url").toString())) {
                                i = 4;
                            }
                            i = 2;
                        }
                    } else if (valueOf.endsWith(".gif")) {
                        i = 9;
                    } else {
                        if (hashMap2.containsKey("url") && !TextUtils.isEmpty(hashMap2.get("url").toString())) {
                            i = 4;
                        }
                        i = 2;
                    }
                    hashMap2.put("shareType", Integer.valueOf(i));
                    if (!z) {
                        if (equals(this.callback) && (stringRes = C0661R.getStringRes(getContext(), "sharing")) > 0) {
                            showNotification(2000, getContext().getString(stringRes));
                        }
                        finish();
                        z = true;
                    }
                    platform.setPlatformActionListener(this.callback);
                    ShareCore shareCore = new ShareCore();
                    shareCore.setShareContentCustomizeCallback(this.customizeCallback);
                    shareCore.share(platform, hashMap2);
                } else {
                    Message message5 = new Message();
                    message5.what = 1;
                    message5.obj = this.activity.getString(C0661R.getStringRes(getContext(), "yixin_client_inavailable"));
                    UIHandler.sendMessage(message5, this);
                }
            } else {
                Message message6 = new Message();
                message6.what = 1;
                message6.obj = this.activity.getString(C0661R.getStringRes(getContext(), "pinterest_client_inavailable"));
                UIHandler.sendMessage(message6, this);
            }
        }
    }

    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        Message message = new Message();
        message.what = 2;
        message.arg1 = 1;
        message.arg2 = i;
        message.obj = platform;
        UIHandler.sendMessage(message, this);
    }

    public void onError(Platform platform, int i, Throwable th) {
        th.printStackTrace();
        Message message = new Message();
        message.what = 2;
        message.arg1 = 2;
        message.arg2 = i;
        message.obj = th;
        UIHandler.sendMessage(message, this);
        ShareSDK.logDemoEvent(4, platform);
    }

    public void onCancel(Platform platform, int i) {
        Message message = new Message();
        message.what = 2;
        message.arg1 = 3;
        message.arg2 = i;
        message.obj = platform;
        UIHandler.sendMessage(message, this);
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Toast.makeText(this.activity, String.valueOf(message.obj), 0).show();
                break;
            case 2:
                switch (message.arg1) {
                    case 1:
                        int stringRes = C0661R.getStringRes(getContext(), "share_completed");
                        if (stringRes > 0) {
                            showNotification(2000, getContext().getString(stringRes));
                            break;
                        }
                        break;
                    case 2:
                        String simpleName = message.obj.getClass().getSimpleName();
                        if (!"WechatClientNotExistException".equals(simpleName) && !"WechatTimelineNotSupportedException".equals(simpleName) && !"WechatFavoriteNotSupportedException".equals(simpleName)) {
                            if (!"GooglePlusClientNotExistException".equals(simpleName)) {
                                if (!"QQClientNotExistException".equals(simpleName)) {
                                    if (!"YixinClientNotExistException".equals(simpleName) && !"YixinTimelineNotSupportedException".equals(simpleName)) {
                                        int stringRes2 = C0661R.getStringRes(getContext(), "share_failed");
                                        if (stringRes2 > 0) {
                                            showNotification(2000, getContext().getString(stringRes2));
                                            break;
                                        }
                                    } else {
                                        int stringRes3 = C0661R.getStringRes(getContext(), "yixin_client_inavailable");
                                        if (stringRes3 > 0) {
                                            showNotification(2000, getContext().getString(stringRes3));
                                            break;
                                        }
                                    }
                                } else {
                                    int stringRes4 = C0661R.getStringRes(getContext(), "qq_client_inavailable");
                                    if (stringRes4 > 0) {
                                        showNotification(2000, getContext().getString(stringRes4));
                                        break;
                                    }
                                }
                            } else {
                                int stringRes5 = C0661R.getStringRes(getContext(), "google_plus_client_inavailable");
                                if (stringRes5 > 0) {
                                    showNotification(2000, getContext().getString(stringRes5));
                                    break;
                                }
                            }
                        } else {
                            int stringRes6 = C0661R.getStringRes(getContext(), "wechat_client_inavailable");
                            if (stringRes6 > 0) {
                                showNotification(2000, getContext().getString(stringRes6));
                                break;
                            }
                        }
                        break;
                    case 3:
                        int stringRes7 = C0661R.getStringRes(getContext(), "share_canceled");
                        if (stringRes7 > 0) {
                            showNotification(2000, getContext().getString(stringRes7));
                            break;
                        }
                        break;
                }
            case 3:
                NotificationManager notificationManager = (NotificationManager) message.obj;
                if (notificationManager != null) {
                    notificationManager.cancel(message.arg1);
                    break;
                }
                break;
        }
        return false;
    }

    private void showNotification(long j, String str) {
        try {
            Context applicationContext = getContext().getApplicationContext();
            NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
            notificationManager.cancel(165191050);
            Notification notification = new Notification(this.notifyIcon, str, System.currentTimeMillis());
            notification.setLatestEventInfo(applicationContext, this.notifyTitle, str, PendingIntent.getActivity(applicationContext, 0, new Intent(), 0));
            notification.flags = 16;
            notificationManager.notify(165191050, notification);
            if (j > 0) {
                Message message = new Message();
                message.what = 3;
                message.obj = notificationManager;
                message.arg1 = 165191050;
                UIHandler.sendMessageDelayed(message, j, this);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
