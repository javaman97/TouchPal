package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.func.resource.p055ui.TTextView;

/* renamed from: com.cootek.smartinput5.ui.settings.MarqueeTextView */
public class MarqueeTextView extends TTextView {
    public MarqueeTextView(Context context) {
        super(context);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean isFocused() {
        return true;
    }
}
