package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_voice */
public class T_voice extends KeyboardSchema {
    public T_voice() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        RowSchema rowSchema = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyX = "85%p";
        bVar.keyName = "sk_voice_sym_1";
        bVar.backgroundType = "fun";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar.keyWidth = "15%p";
        bVar.keyType = "Key";
        rowSchema.keys = new C2944b[]{bVar};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar2 = new C2944b();
        bVar2.keyX = "85%p";
        bVar2.keyName = "sk_voice_sym_2";
        bVar2.backgroundType = "fun";
        bVar2.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar2.keyWidth = "15%p";
        bVar2.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar2};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar3 = new C2944b();
        bVar3.keyX = "85%p";
        bVar3.keyName = "sk_voice_sym_3";
        bVar3.backgroundType = "fun";
        bVar3.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar3.keyWidth = "15%p";
        bVar3.keyType = "Key";
        rowSchema3.keys = new C2944b[]{bVar3};
        RowSchema rowSchema4 = new RowSchema();
        C2944b bVar4 = new C2944b();
        bVar4.keyX = "85%p";
        bVar4.keyName = "sk_voice_sym_4";
        bVar4.backgroundType = "fun";
        bVar4.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar4.keyWidth = "15%p";
        bVar4.keyType = "Key";
        rowSchema4.keys = new C2944b[]{bVar4};
        RowSchema rowSchema5 = new RowSchema();
        rowSchema5.rowEdgeFlags = "bottom";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_back";
        bVar5.backgroundType = "fun_highlight";
        bVar5.mainOnlyTextSize = "@dimen/button_textsize";
        bVar5.keyWidth = "25%p";
        bVar5.keyType = "Key";
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_check";
        bVar6.mainOnlyTextSize = "@dimen/button_textsize";
        bVar6.keyWidth = "35%p";
        bVar6.keyType = "Key";
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "sk_bk";
        bVar7.backgroundType = "fun";
        bVar7.keyIcon = "drawable/key_fore_backspace";
        bVar7.keyWidth = "25%p";
        bVar7.keyType = "BackSpaceKey";
        C2944b bVar8 = new C2944b();
        bVar8.keyX = "85%p";
        bVar8.keyName = "sk_voice_sym_5";
        bVar8.backgroundType = "fun";
        bVar8.keyIcon = "@drawable/lspace";
        bVar8.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar8.keyWidth = "15%p";
        bVar8.keyType = "Key";
        rowSchema5.keys = new C2944b[]{bVar5, bVar6, bVar7, bVar8};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4, rowSchema5};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.keyWidth = "100%p";
        this.keyHeight = "20%p";
        this.horizontalGap = "0px";
    }
}
