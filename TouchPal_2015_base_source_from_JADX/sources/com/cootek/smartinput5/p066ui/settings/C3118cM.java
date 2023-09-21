package com.cootek.smartinput5.p066ui.settings;

import android.widget.SeekBar;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.settings.cM */
/* compiled from: SkinCustomizeActivity */
class C3118cM implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ SkinCustomizeActivity f14127a;

    /* renamed from: b */
    private int f14128b = this.f14127a.f13673C.getProgress();

    C3118cM(SkinCustomizeActivity skinCustomizeActivity) {
        this.f14127a = skinCustomizeActivity;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f14128b = i;
            if (Math.abs(this.f14128b - this.f14127a.f13684N) > 10) {
                int unused = this.f14127a.f13684N = this.f14128b;
                boolean unused2 = this.f14127a.f13685O = true;
                this.f14127a.m14021d();
            }
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int unused = this.f14127a.f13684N = this.f14128b;
        C1368X.m6320c().mo5841n().mo6281j(this.f14127a.f13684N);
        boolean unused2 = this.f14127a.f13685O = true;
        this.f14127a.m14021d();
    }
}
