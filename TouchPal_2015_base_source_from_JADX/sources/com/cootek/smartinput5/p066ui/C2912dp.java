package com.cootek.smartinput5.p066ui;

import android.os.Handler;
import android.os.Message;
import com.cootek.smartinput5.engine.Engine;
import com.emoji.keyboard.touchpal.R;
import java.io.ByteArrayOutputStream;

/* renamed from: com.cootek.smartinput5.ui.dp */
/* compiled from: VoiceView */
class C2912dp extends Handler {

    /* renamed from: a */
    final /* synthetic */ VoiceView f13143a;

    C2912dp(VoiceView voiceView) {
        this.f13143a = voiceView;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.f13143a.f11965z == 1 && Engine.isInitialized()) {
                    Engine.getInstance().getVoiceProcessor().stopInputVoice();
                    VoiceView.f11950y.mo3975a((ByteArrayOutputStream) null, 0, 0);
                    break;
                }
            case 2:
                if (this.f13143a.f11965z == 2 && Engine.isInitialized()) {
                    Engine.getInstance().getVoiceProcessor().cancelInputVoice();
                    VoiceView.f11950y.mo3976a(this.f13143a.m12287a((int) R.string.vi_error_network));
                    Engine.getInstance().fireLuaCallOperation(Engine.LUA_CALL_VOICE_RECOGNIZE_END);
                    Engine.getInstance().processEvent();
                    this.f13143a.mo8881i();
                    break;
                }
        }
        super.handleMessage(message);
    }
}
