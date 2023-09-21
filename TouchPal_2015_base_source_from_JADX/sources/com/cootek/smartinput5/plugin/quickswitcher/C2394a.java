package com.cootek.smartinput5.plugin.quickswitcher;

import android.view.View;
import android.widget.AdapterView;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.plugin.quickswitcher.a */
/* compiled from: Options */
class C2394a implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ Options f10497a;

    C2394a(Options options) {
        this.f10497a = options;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f10497a.m10952c(i);
        if (!this.f10497a.f10496i) {
            int b = this.f10497a.m10940a(Settings.getInstance().getIntSetting(Settings.QUICK_SWITCHER_LAYOUT));
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= this.f10497a.f10495h.size()) {
                    break;
                } else if (b == ((Integer) this.f10497a.f10495h.get(i3)).intValue()) {
                    this.f10497a.f10491d.setSelection(i3);
                    break;
                } else {
                    i2 = i3 + 1;
                }
            }
            boolean unused = this.f10497a.f10496i = true;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
