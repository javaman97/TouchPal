package com.cootek.smartinputv5.wxapi;

import android.content.Intent;
import com.cootek.smartinput5.Guide;
import com.cootek.smartinput5.engine.Engine;
import p018cn.sharesdk.wechat.utils.WXMediaMessage;
import p018cn.sharesdk.wechat.utils.WechatHandlerActivity;

public class WXEntryActivity extends WechatHandlerActivity {
    public void onGetMessageFromWXReq(WXMediaMessage wXMediaMessage) {
        Intent intent = new Intent(this, Guide.class);
        intent.setFlags(Engine.EXCEPTION_ERROR);
        startActivity(intent);
    }

    public void onShowMessageFromWXReq(WXMediaMessage wXMediaMessage) {
    }
}
