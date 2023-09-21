package com.cootek.smartinput5.p066ui.settings;

import android.widget.SeekBar;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.CandidateBar;
import com.cootek.smartinput5.p066ui.TopScrollView;

/* renamed from: com.cootek.smartinput5.ui.settings.aT */
/* compiled from: KeyboardCustomizeActivity */
class C3005aT implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ KeyboardCustomizeActivity f13835a;

    C3005aT(KeyboardCustomizeActivity keyboardCustomizeActivity) {
        this.f13835a = keyboardCustomizeActivity;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        seekBar.setProgress(this.f13835a.m13799a(0, 2, 0, 100, TopScrollView.m12056e(Settings.getInstance().getIntSetting(123))));
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        CandidateBar f;
        int a = this.f13835a.m13799a(0, 100, 0, 2, i);
        if (Settings.getInstance().getIntSetting(123) != TopScrollView.m12060f(a)) {
            Settings.getInstance().setIntSetting(123, TopScrollView.m12060f(a));
            if (Engine.isInitialized() && (f = Engine.getInstance().getWidgetManager().mo9651i().mo9720f()) != null) {
                f.mo8820h();
                Engine.getInstance().updateResult(16, -1);
            }
        }
    }
}
