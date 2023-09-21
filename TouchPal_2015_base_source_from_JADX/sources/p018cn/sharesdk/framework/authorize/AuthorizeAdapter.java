package p018cn.sharesdk.framework.authorize;

import android.app.Activity;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import p018cn.sharesdk.framework.TitleLayout;

/* renamed from: cn.sharesdk.framework.authorize.AuthorizeAdapter */
public class AuthorizeAdapter {
    private Activity activity;
    private boolean noTitle;
    private String platform;
    private boolean popUpAnimationDisable;
    private RelativeLayout rlBody;
    private TitleLayout title;
    private WebView webview;

    /* access modifiers changed from: protected */
    public void disablePopUpAnimation() {
        this.popUpAnimationDisable = true;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public RelativeLayout getBodyView() {
        return this.rlBody;
    }

    public String getPlatformName() {
        return this.platform;
    }

    public TitleLayout getTitleLayout() {
        return this.title;
    }

    public WebView getWebBody() {
        return this.webview;
    }

    public void hideShareSDKLogo() {
        getTitleLayout().getChildAt(getTitleLayout().getChildCount() - 1).setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public boolean isNotitle() {
        return this.noTitle;
    }

    /* access modifiers changed from: package-private */
    public boolean isPopUpAnimationDisable() {
        return this.popUpAnimationDisable;
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public boolean onFinish() {
        return false;
    }

    public boolean onKeyEvent(int i, KeyEvent keyEvent) {
        return false;
    }

    public void onPause() {
    }

    public void onResize(int i, int i2, int i3, int i4) {
    }

    public void onRestart() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    /* access modifiers changed from: package-private */
    public void setBodyView(RelativeLayout relativeLayout) {
        this.rlBody = relativeLayout;
    }

    /* access modifiers changed from: package-private */
    public void setNotitle(boolean z) {
        this.noTitle = z;
    }

    /* access modifiers changed from: package-private */
    public void setPlatformName(String str) {
        this.platform = str;
    }

    /* access modifiers changed from: package-private */
    public void setTitleView(TitleLayout titleLayout) {
        this.title = titleLayout;
    }

    /* access modifiers changed from: package-private */
    public void setWebView(WebView webView) {
        this.webview = webView;
    }
}
