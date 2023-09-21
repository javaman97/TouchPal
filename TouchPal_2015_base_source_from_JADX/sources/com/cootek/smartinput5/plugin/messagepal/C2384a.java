package com.cootek.smartinput5.plugin.messagepal;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.messagepal.a */
/* compiled from: MessageList */
class C2384a implements TabHost.TabContentFactory {

    /* renamed from: a */
    final /* synthetic */ MessageList f10468a;

    C2384a(MessageList messageList) {
        this.f10468a = messageList;
    }

    public View createTabContent(String str) {
        View inflate = this.f10468a.getLayoutInflater().inflate(R.layout.message_pal_list_view, (ViewGroup) null);
        this.f10468a.m10916a(inflate, str);
        return inflate;
    }
}
