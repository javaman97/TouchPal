package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_smiley_pad */
public class T_smiley_pad extends KeyboardSchema {
    public T_smiley_pad() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "30%p";
        this.mainTextFontBold = "false";
        this.animationAreaLeft = "16%p";
        this.animationAreaTop = "0%p";
        this.animationAreaWidth = "84%p";
        this.animationAreaHeight = "80%p";
        this.backgroundLeftEdge = "0%p";
        this.backgroundTopEdge = "85%p";
        RowSchema rowSchema = new RowSchema();
        rowSchema.keyHeight = "85%p";
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_emoticon";
        bVar.backgroundType = "fun";
        bVar.ignoreSlip = "true";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.supportPreviewPopup = "false";
        bVar.mainOnlyTextSize = "@dimen/button_textsize";
        bVar.keyWidth = "29%p";
        bVar.keyType = "SmileyTabKey";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_emotion";
        bVar2.backgroundType = "fun";
        bVar2.ignoreSlip = "true";
        bVar2.supportPreviewPopup = "false";
        bVar2.mainOnlyTextSize = "@dimen/button_textsize";
        bVar2.keyWidth = "29%p";
        bVar2.keyType = "SmileyTabKey";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_guess_emoji";
        bVar3.backgroundType = "fun";
        bVar3.ignoreSlip = "true";
        bVar3.keyIcon = "@drawable/key_fore_guess_emoji";
        bVar3.supportPreviewPopup = "false";
        bVar3.supportCustomSkin = "false";
        bVar3.mainOnlyTextSize = "@dimen/button_textsize";
        bVar3.keyWidth = "14%p";
        bVar3.keyType = "Key";
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_bk";
        bVar4.backgroundType = "fun";
        bVar4.ignoreSlip = "true";
        bVar4.keyIcon = "@drawable/key_fore_backspace";
        bVar4.supportPreviewPopup = "false";
        bVar4.keyWidth = "14%p";
        bVar4.keyType = "BackSpaceKey";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_back";
        bVar5.backgroundType = "fun_highlight";
        bVar5.ignoreSlip = "true";
        bVar5.keyIcon = "@drawable/key_fore_back";
        bVar5.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar5.supportPreviewPopup = "false";
        bVar5.keyWidth = "14%p";
        bVar5.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        rowSchema2.keyHeight = "15%p";
        this.mRows = new RowSchema[]{rowSchema, rowSchema2};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.keyWidth = "21%p";
        this.keyHeight = "20%p";
        this.horizontalGap = "0px";
    }
}
