package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Message;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.p047c.C1194T;
import com.cootek.smartinput5.p047c.C1199d;
import com.cootek.smartinput5.p066ui.p068b.C2717b;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.CommaKey */
public class CommaKey extends C2806cb {
    C1199d mPlugin = C1194T.m5771a(C2717b.PLUGIN_PREDICTION.toString());

    public CommaKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
        updateIcon();
    }

    public void updateIcon() {
        this.icon = getLongPressIcon();
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        updateIcon();
        super.updateKeyInfo();
    }

    /* access modifiers changed from: protected */
    public void refreshIconColor() {
        updateIcon();
        super.refreshIconColor();
    }

    public static Drawable getLongPressIcon() {
        C1602bh n;
        if (!C1368X.m6324d() || (n = C1368X.m6320c().mo5841n()) == null) {
            return null;
        }
        boolean boolSetting = Settings.getInstance().getBoolSetting(1);
        C2726bF bFVar = C2726bF.COMMA_ICON_NORMAL;
        if (boolSetting) {
            return n.mo6250a((int) R.drawable.sk_comma_prediction_on, bFVar);
        }
        return n.mo6250a((int) R.drawable.sk_comma_prediction_off, bFVar);
    }

    /* access modifiers changed from: protected */
    public Drawable getPreviewIcon(int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void doLongPressOnce(Message message) {
        super.doLongPressOnce(message);
        showLongPressPopup(this);
    }

    public static void showLongPressPopup(C2806cb cbVar) {
        Engine.getInstance().getWidgetManager().mo9668y().mo9512a(cbVar);
    }
}
