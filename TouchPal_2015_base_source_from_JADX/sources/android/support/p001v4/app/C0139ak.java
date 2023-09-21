package android.support.p001v4.app;

import android.app.Activity;
import android.content.Intent;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.widget.ShareActionProvider;

/* renamed from: android.support.v4.app.ak */
/* compiled from: ShareCompatICS */
class C0139ak {

    /* renamed from: a */
    private static final String f370a = ".sharecompat_";

    C0139ak() {
    }

    /* renamed from: a */
    public static void m561a(MenuItem menuItem, Activity activity, Intent intent) {
        ShareActionProvider shareActionProvider;
        ActionProvider actionProvider = menuItem.getActionProvider();
        if (!(actionProvider instanceof ShareActionProvider)) {
            shareActionProvider = new ShareActionProvider(activity);
        } else {
            shareActionProvider = (ShareActionProvider) actionProvider;
        }
        shareActionProvider.setShareHistoryFileName(f370a + activity.getClass().getName());
        shareActionProvider.setShareIntent(intent);
        menuItem.setActionProvider(shareActionProvider);
    }
}
