package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_emojiart_category */
public class T_emojiart_category extends KeyboardSchema {
    public T_emojiart_category() {
        this.height = "@fraction/keyboard_height";
        this.width = "100%p";
        this.slipThreshold = "100%p";
        this.enableDrawMoveContrail = "false";
        RowSchema rowSchema = new RowSchema();
        rowSchema.rowEdgeFlags = "top";
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_category_emoji_art_greeting";
        bVar.keyIcon = "@drawable/emoji_art_tab_greeting";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.supportCustomSkin = "false";
        bVar.keyType = "SmileyCategoryKey";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_category_emoji_art_fun";
        bVar2.keyIcon = "@drawable/emoji_art_tab_fun";
        bVar2.supportCustomSkin = "false";
        bVar2.keyType = "SmileyCategoryKey";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_category_emoji_art_love";
        bVar3.keyIcon = "@drawable/emoji_art_tab_love";
        bVar3.supportCustomSkin = "false";
        bVar3.keyType = "SmileyCategoryKey";
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_category_emoji_art_holiday";
        bVar4.keyIcon = "@drawable/emoji_art_tab_holiday";
        bVar4.supportCustomSkin = "false";
        bVar4.keyType = "SmileyCategoryKey";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_category_emoji_art_life";
        bVar5.keyIcon = "@drawable/emoji_art_tab_life";
        bVar5.supportCustomSkin = "false";
        bVar5.keyType = "SmileyCategoryKey";
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_category_emoji_art_school";
        bVar6.keyIcon = "@drawable/emoji_art_tab_school";
        bVar6.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar6.supportCustomSkin = "false";
        bVar6.keyType = "SmileyCategoryKey";
        rowSchema.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        this.mRows = new RowSchema[]{rowSchema};
        this.verticalGap = "0px";
        this.slideThreshold = "100%p";
        this.backgroundType = "fun";
        this.ignoreSlip = "true";
        this.supportPreviewPopup = "false";
        this.mainOnlyTextSize = "@dimen/button_textsize";
        this.keyWidth = "16.6%p";
        this.keyHeight = "@fraction/smiley_category_height";
        this.horizontalGap = "0px";
    }
}
