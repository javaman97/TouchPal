package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_eng_sym_types */
public class T_eng_sym_types extends KeyboardSchema {
    public T_eng_sym_types() {
        this.height = "@fraction/keyboard_height";
        this.width = "16%p";
        this.slipThreshold = "100%p";
        this.enableDrawMoveContrail = "false";
        RowSchema rowSchema = new RowSchema();
        rowSchema.rowEdgeFlags = "top";
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_recent";
        bVar.keyIcon = "@drawable/key_fore_sym_recent";
        bVar.keyType = "SymTypeKey";
        rowSchema.keys = new C2944b[]{bVar};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_punc_eng";
        bVar2.keyIcon = "@drawable/key_fore_sym_en";
        bVar2.keyType = "SymTypeKey";
        rowSchema2.keys = new C2944b[]{bVar2};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_emoticon";
        bVar3.keyIcon = "@drawable/key_fore_sym_emo";
        bVar3.keyType = "SymTypeKey";
        rowSchema3.keys = new C2944b[]{bVar3};
        RowSchema rowSchema4 = new RowSchema();
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_web";
        bVar4.keyIcon = "@drawable/key_fore_sym_web";
        bVar4.keyType = "SymTypeKey";
        rowSchema4.keys = new C2944b[]{bVar4};
        RowSchema rowSchema5 = new RowSchema();
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_number";
        bVar5.keyIcon = "@drawable/key_fore_sym_num";
        bVar5.keyType = "SymTypeKey";
        rowSchema5.keys = new C2944b[]{bVar5};
        RowSchema rowSchema6 = new RowSchema();
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_greek";
        bVar6.keyIcon = "@drawable/key_fore_sym_greek";
        bVar6.keyType = "SymTypeKey";
        rowSchema6.keys = new C2944b[]{bVar6};
        RowSchema rowSchema7 = new RowSchema();
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "sk_latin";
        bVar7.keyIcon = "@drawable/key_fore_sym_latin";
        bVar7.keyType = "SymTypeKey";
        rowSchema7.keys = new C2944b[]{bVar7};
        RowSchema rowSchema8 = new RowSchema();
        C2944b bVar8 = new C2944b();
        bVar8.keyName = "sk_maths";
        bVar8.keyIcon = "@drawable/key_fore_sym_maths";
        bVar8.keyType = "SymTypeKey";
        rowSchema8.keys = new C2944b[]{bVar8};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4, rowSchema5, rowSchema6, rowSchema7, rowSchema8};
        this.verticalGap = "0px";
        this.slideThreshold = "100%p";
        this.backgroundType = "fun";
        this.ignoreSlip = "true";
        this.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        this.mainOnlyTextSize = "@dimen/button_textsize";
        this.keyWidth = "100%p";
        this.keyHeight = "16%p";
        this.horizontalGap = "0px";
    }
}
