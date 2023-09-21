package com.cootek.smartinput5.plugin.messagepal;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.cootek.smartinput5.plugin.messagepal.d */
/* compiled from: MessageList */
class C2387d implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ MessageList f10471a;

    C2387d(MessageList messageList) {
        this.f10471a = messageList;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String b = ((C2385b) adapterView.getAdapter()).mo8084b(i);
        Intent intent = new Intent("com.emoji.keyboard.touchpal.INTERNAL_ACTION.plugin.messagepal.action.SEND");
        intent.putExtra("text", b);
        this.f10471a.sendBroadcast(intent);
        this.f10471a.finish();
    }
}
