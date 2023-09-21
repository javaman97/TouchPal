package com.cootek.smartinput5.func;

import android.annotation.TargetApi;
import android.content.ClipboardManager;
import android.content.Context;

@TargetApi(11)
public class ClipboardManager11_ extends ClipboardManager {
    private ClipboardManager mClipboardManager = null;
    private boolean primaryClipChangedListenerAdded = false;

    public CharSequence getText(Context context) {
        if (getManager(context) != null) {
            return getManager(context).getText();
        }
        return null;
    }

    public void setText(Context context, CharSequence charSequence) {
        if (getManager(context) != null) {
            try {
                getManager(context).setText(charSequence);
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
            }
        }
    }

    /* access modifiers changed from: private */
    public ClipboardManager getManager(Context context) {
        if (this.mClipboardManager == null) {
            this.mClipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        }
        return this.mClipboardManager;
    }

    public void addClipboardItem(Context context) {
    }

    public void setUpMultiClipboardEnv(Context context) {
        if (!this.primaryClipChangedListenerAdded && getManager(context) != null) {
            try {
                getManager(context).addPrimaryClipChangedListener(new C2066v(this, context));
            } catch (NullPointerException e) {
            }
            this.primaryClipChangedListenerAdded = true;
        }
    }
}
