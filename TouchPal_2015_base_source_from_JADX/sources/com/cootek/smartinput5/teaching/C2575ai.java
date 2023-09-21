package com.cootek.smartinput5.teaching;

import android.widget.EditText;

/* renamed from: com.cootek.smartinput5.teaching.ai */
/* compiled from: TutorialMissionActivity */
class C2575ai implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2557a f11058a;

    /* renamed from: b */
    final /* synthetic */ EditText f11059b;

    /* renamed from: c */
    final /* synthetic */ TutorialMissionActivity f11060c;

    C2575ai(TutorialMissionActivity tutorialMissionActivity, C2557a aVar, EditText editText) {
        this.f11060c = tutorialMissionActivity;
        this.f11058a = aVar;
        this.f11059b = editText;
    }

    public void run() {
        this.f11060c.m11349b(this.f11058a, this.f11059b);
    }
}
