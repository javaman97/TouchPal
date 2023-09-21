package com.cootek.smartinput5.p066ui.settings;

import android.os.Bundle;
import android.widget.Button;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.SpecialThanksActivity */
public class SpecialThanksActivity extends C1976b {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.special_thanks);
        setTitle(getResString(R.string.optpage_special_thanks));
        Button button = (Button) findViewById(R.id.tv_visit_getlocalization_website);
        if (button != null) {
            button.setOnClickListener(new C3189da(this));
        }
    }
}
