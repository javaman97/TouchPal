package com.cootek.smartinput5.func;

import android.content.Context;

public abstract class ClipboardManager {

    /* renamed from: com.cootek.smartinput5.func.ClipboardManager$a */
    public interface C1341a {
        void addNewItem(CharSequence charSequence);
    }

    public abstract void addClipboardItem(Context context);

    public abstract CharSequence getText(Context context);

    public abstract void setText(Context context, CharSequence charSequence);

    public abstract void setUpMultiClipboardEnv(Context context);
}
