package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.TopScrollView;

/* renamed from: com.cootek.smartinput5.ui.a */
/* compiled from: AddUserwordBar */
class C2655a implements TopScrollView.C2647g {

    /* renamed from: a */
    final /* synthetic */ AddUserwordBar f11970a;

    C2655a(AddUserwordBar addUserwordBar) {
        this.f11970a = addUserwordBar;
    }

    /* renamed from: a */
    public void mo8648a(int i) {
        this.f11970a.mo8473a(i);
    }

    /* renamed from: b */
    public void mo8650b(int i) {
        this.f11970a.mo8473a(i);
    }

    /* renamed from: a */
    public void mo8647a() {
    }

    /* renamed from: b */
    public void mo8649b() {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_clear_candidate"), 0);
        Engine.getInstance().processEvent();
    }

    /* renamed from: c */
    public void mo8652c(int i) {
    }

    /* renamed from: d */
    public void mo8654d(int i) {
    }

    /* renamed from: c */
    public void mo8651c() {
    }

    /* renamed from: d */
    public void mo8653d() {
    }

    /* renamed from: e */
    public void mo8655e() {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_smiley_open"), 0);
        Engine.getInstance().processEvent();
    }

    /* renamed from: f */
    public void mo8656f() {
    }
}
