package com.cootek.smartinput5.teaching;

import android.view.View;
import android.widget.EditText;

/* renamed from: com.cootek.smartinput5.teaching.ag */
/* compiled from: TutorialMissionActivity */
class C2573ag implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2557a f11053a;

    /* renamed from: b */
    final /* synthetic */ EditText f11054b;

    /* renamed from: c */
    final /* synthetic */ TutorialMissionActivity f11055c;

    C2573ag(TutorialMissionActivity tutorialMissionActivity, C2557a aVar, EditText editText) {
        this.f11055c = tutorialMissionActivity;
        this.f11053a = aVar;
        this.f11054b = editText;
    }

    public void onClick(View view) {
        this.f11055c.m11349b(this.f11053a, this.f11054b);
    }
}
