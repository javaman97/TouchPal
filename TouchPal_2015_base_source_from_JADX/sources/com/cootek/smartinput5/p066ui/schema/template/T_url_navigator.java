package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_url_navigator */
public class T_url_navigator extends KeyboardSchema {
    public T_url_navigator() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        RowSchema rowSchema = new RowSchema();
        rowSchema.rowEdgeFlags = "top";
        rowSchema.keyHeight = "75%p";
        RowSchema rowSchema2 = new RowSchema();
        rowSchema2.rowEdgeFlags = "bottom";
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_prev";
        bVar.backgroundType = "fun";
        bVar.keyIcon = "@drawable/key_fore_prev";
        bVar.keyWidth = "35%p";
        bVar.keyType = "Key";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_next";
        bVar2.backgroundType = "fun";
        bVar2.keyIcon = "@drawable/key_fore_next";
        bVar2.keyWidth = "35%p";
        bVar2.keyType = "Key";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_back";
        bVar3.backgroundType = "fun_highlight";
        bVar3.keyIcon = "@drawable/key_fore_back";
        bVar3.mainOnlyTextSize = "@dimen/button_textsize";
        bVar3.keyWidth = "15%p";
        bVar3.keyType = "Key";
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_ent";
        bVar4.backgroundType = "fun";
        bVar4.keyIcon = "@drawable/url_navigator_enter_icon";
        bVar4.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar4.mainOnlyTextSize = "@dimen/button_textsize";
        bVar4.keyWidth = "15%p";
        bVar4.keyType = EnterKey.TAG;
        rowSchema2.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.keyWidth = "100%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
    }
}
