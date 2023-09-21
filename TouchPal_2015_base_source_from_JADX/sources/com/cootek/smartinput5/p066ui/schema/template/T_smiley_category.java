package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_smiley_category */
public class T_smiley_category extends KeyboardSchema {
    public T_smiley_category() {
        this.height = "@fraction/keyboard_height";
        this.width = "100%p";
        this.slipThreshold = "100%p";
        this.enableDrawMoveContrail = "false";
        RowSchema rowSchema = new RowSchema();
        rowSchema.rowEdgeFlags = "top";
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_category_recent";
        bVar.keyIcon = "@drawable/emoji_recent";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.supportCustomSkin = "false";
        bVar.keyType = "SmileyCategoryKey";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_category_people";
        bVar2.keyIcon = "@drawable/emoji_people";
        bVar2.supportCustomSkin = "false";
        bVar2.keyType = "SmileyCategoryKey";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_category_nature";
        bVar3.keyIcon = "@drawable/emoji_nature";
        bVar3.supportCustomSkin = "false";
        bVar3.keyType = "SmileyCategoryKey";
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_category_objects";
        bVar4.keyIcon = "@drawable/emoji_objects";
        bVar4.supportCustomSkin = "false";
        bVar4.keyType = "SmileyCategoryKey";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_category_places";
        bVar5.keyIcon = "@drawable/emoji_places";
        bVar5.supportCustomSkin = "false";
        bVar5.keyType = "SmileyCategoryKey";
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_category_symbols";
        bVar6.keyIcon = "@drawable/emoji_symbols";
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
        this.keyWidth = "16.66%p";
        this.keyHeight = "@fraction/smiley_category_height";
        this.horizontalGap = "0px";
    }
}
