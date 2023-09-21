package com.cootek.smartinput5;

import android.content.Intent;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1593bR;

/* renamed from: com.cootek.smartinput5.w */
/* compiled from: GuideFinishedActivity */
class C3282w implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ GuideFinishedActivity f14406a;

    C3282w(GuideFinishedActivity guideFinishedActivity) {
        this.f14406a = guideFinishedActivity;
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.f14406a, C1593bR.m7162a().mo6234b(0));
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.putExtra("SHOW_ALL_LANGUAGE", true);
        this.f14406a.startActivity(intent);
    }
}
