package com.cootek.smartinput5.func;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.cootek.smartinput5.engine.ClipboardBackend;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;

@TargetApi(11)
public class ClipboardManager18 extends ClipboardManager {
    private ClipboardManager mClipboardManager = null;

    public void setText(Context context, CharSequence charSequence) {
        if (getManager(context) != null) {
            try {
                getManager(context).setText(charSequence);
            } catch (Exception e) {
            }
        }
    }

    public CharSequence getText(Context context) {
        ClipData.Item item;
        if (getManager(context) == null) {
            return null;
        }
        ClipData primaryClip = getManager(context).getPrimaryClip();
        if (primaryClip != null) {
            item = primaryClip.getItemAt(0);
        } else {
            item = null;
        }
        if (item != null && item.getUri() == null) {
            return item.getText();
        }
        return null;
    }

    private ClipboardManager getManager(Context context) {
        if (this.mClipboardManager == null) {
            this.mClipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        }
        return this.mClipboardManager;
    }

    public void addClipboardItem(Context context) {
        CharSequence text = getText(context);
        if (text != null) {
            if (text.length() > ClipboardBackend.CLIPBOARD_ITEM_MAX_SIZE) {
                Toast.makeText(context, C1974m.m9063a(context, (int) R.string.clipboard_too_long_text), 0).show();
                ClipboardBackend.getInstance().addNewItem(text.subSequence(0, ClipboardBackend.CLIPBOARD_ITEM_MAX_SIZE - 1));
                return;
            }
            ClipboardBackend.getInstance().addNewItem(text);
        }
    }

    public void setUpMultiClipboardEnv(Context context) {
    }
}
