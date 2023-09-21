package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.p066ui.TopScrollView;

/* renamed from: com.cootek.smartinput5.ui.i */
/* compiled from: CandidateBar */
class C2930i implements TopScrollView.C2647g {

    /* renamed from: a */
    final /* synthetic */ CandidateBar f13287a;

    C2930i(CandidateBar candidateBar) {
        this.f13287a = candidateBar;
    }

    /* renamed from: a */
    public void mo8648a(int i) {
        if (!this.f13287a.f11164A) {
            this.f13287a.mo8473a(i);
        }
    }

    /* renamed from: b */
    public void mo8650b(int i) {
        if (this.f13287a.f11164A) {
            return;
        }
        if (C1389aD.m6427H(Engine.getInstance().getCurrentLanguageId())) {
            boolean unused = this.f13287a.f11167D = Settings.getInstance().getBoolSetting(37);
            Settings.getInstance().setBoolSetting(37, false);
            Engine.getInstance().fireSelectCandidateOperation(this.f13287a.f11169a + i);
            Engine.getInstance().fireLuaCallOperation(Engine.LUA_CALL_COMPOUND_WORD_INPUT);
            Engine.getInstance().processEvent();
            Settings.getInstance().setBoolSetting(37, this.f13287a.f11167D);
            boolean unused2 = this.f13287a.f11165B = false;
            return;
        }
        this.f13287a.mo8473a(i);
    }

    /* renamed from: c */
    public void mo8652c(int i) {
        if (!this.f13287a.f11164A) {
            this.f13287a.f11170b.mo9122a((CandidateItem) this.f13287a.mo8477b(i));
        }
    }

    /* renamed from: a */
    public void mo8647a() {
        if (!this.f13287a.f11164A && this.f13287a.isClickable()) {
            Engine instance = Engine.getInstance();
            instance.fireKeyOperation(instance.getKeyId("sk_mo"), 0);
            instance.processEvent();
        }
    }

    /* renamed from: b */
    public void mo8649b() {
        if (!this.f13287a.f11164A && this.f13287a.isClickable()) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_clear_candidate"), 0);
            Engine.getInstance().processEvent();
        }
    }

    /* renamed from: d */
    public void mo8654d(int i) {
        if (!this.f13287a.f11164A) {
            Engine.getInstance().fireSetDefaultCandidateOperation(i);
            Engine.getInstance().processEvent();
        }
    }

    /* renamed from: d */
    public void mo8653d() {
        if (!this.f13287a.f11164A && !this.f13287a.f11165B) {
            boolean unused = this.f13287a.f11165B = true;
        }
    }

    /* renamed from: c */
    public void mo8651c() {
        if (!this.f13287a.f11164A && !this.f13287a.f11165B) {
            boolean unused = this.f13287a.f11165B = true;
        }
    }

    /* renamed from: e */
    public void mo8655e() {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_smiley_open"), 0);
        Engine.getInstance().processEvent();
    }

    /* renamed from: f */
    public void mo8656f() {
        this.f13287a.mo8829o();
    }
}
