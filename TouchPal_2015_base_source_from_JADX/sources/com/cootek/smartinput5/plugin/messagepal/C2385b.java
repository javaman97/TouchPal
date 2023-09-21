package com.cootek.smartinput5.plugin.messagepal;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;

/* renamed from: com.cootek.smartinput5.plugin.messagepal.b */
/* compiled from: MessageList */
class C2385b extends ArrayAdapter<String> {

    /* renamed from: a */
    final /* synthetic */ MessageList f10469a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2385b(MessageList messageList, Context context, int i, int i2, List<String> list) {
        super(context, i, i2, list);
        this.f10469a = messageList;
    }

    /* renamed from: a */
    public String getItem(int i) {
        return (i + 1) + ". " + ((String) super.getItem(i));
    }

    /* renamed from: b */
    public String mo8084b(int i) {
        return (String) super.getItem(i);
    }
}
