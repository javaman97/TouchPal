package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_emotions */
public class T_emotions extends KeyboardSchema {
    public T_emotions() {
        this.height = "@fraction/keyboard_height";
        this.width = "15%p";
        this.slipThreshold = "60%p";
        this.enableDrawMoveContrail = "false";
        RowSchema rowSchema = new RowSchema();
        rowSchema.rowEdgeFlags = "top";
        C2944b bVar = new C2944b();
        bVar.keyName = "emo_1";
        bVar.keyType = "EmotionKey";
        rowSchema.keys = new C2944b[]{bVar};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "emo_2";
        bVar2.keyType = "EmotionKey";
        rowSchema2.keys = new C2944b[]{bVar2};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "emo_3";
        bVar3.keyType = "EmotionKey";
        rowSchema3.keys = new C2944b[]{bVar3};
        RowSchema rowSchema4 = new RowSchema();
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "emo_4";
        bVar4.keyType = "EmotionKey";
        rowSchema4.keys = new C2944b[]{bVar4};
        RowSchema rowSchema5 = new RowSchema();
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "emo_5";
        bVar5.keyType = "EmotionKey";
        rowSchema5.keys = new C2944b[]{bVar5};
        RowSchema rowSchema6 = new RowSchema();
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "emo_6";
        bVar6.keyType = "EmotionKey";
        rowSchema6.keys = new C2944b[]{bVar6};
        RowSchema rowSchema7 = new RowSchema();
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "emo_7";
        bVar7.keyType = "EmotionKey";
        rowSchema7.keys = new C2944b[]{bVar7};
        RowSchema rowSchema8 = new RowSchema();
        rowSchema8.rowEdgeFlags = "bottom";
        C2944b bVar8 = new C2944b();
        bVar8.keyName = "emo_8";
        bVar8.keyType = "EmotionKey";
        rowSchema8.keys = new C2944b[]{bVar8};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4, rowSchema5, rowSchema6, rowSchema7, rowSchema8};
        this.verticalGap = "0px";
        this.slideThreshold = "100%p";
        this.ignoreStroke = "true";
        this.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        this.supportPreviewPopup = "false";
        this.keyWidth = "100%p";
        this.keyHeight = "19%p";
        this.horizontalGap = "0px";
        this.maxDisplay = "4";
    }
}
