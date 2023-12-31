package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_chs_sym_types */
public class T_chs_sym_types extends KeyboardSchema {
    public T_chs_sym_types() {
        this.height = "@fraction/keyboard_height";
        this.width = "16%p";
        this.slipThreshold = "100%p";
        this.enableDrawMoveContrail = "false";
        RowSchema rowSchema = new RowSchema();
        rowSchema.rowEdgeFlags = "top";
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_recent";
        bVar.keyIcon = "@drawable/key_fore_sym_recent";
        bVar.keyType = "SymTypeKeyChs";
        rowSchema.keys = new C2944b[]{bVar};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_punc_cn";
        bVar2.keyIcon = "@drawable/key_fore_sym_cn";
        bVar2.keyType = "SymTypeKeyChs";
        rowSchema2.keys = new C2944b[]{bVar2};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_punc_eng";
        bVar3.keyIcon = "@drawable/key_fore_sym_en";
        bVar3.keyType = "SymTypeKeyChs";
        rowSchema3.keys = new C2944b[]{bVar3};
        RowSchema rowSchema4 = new RowSchema();
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_emoticon";
        bVar4.keyIcon = "@drawable/key_fore_sym_emo";
        bVar4.keyType = "SymTypeKeyChs";
        rowSchema4.keys = new C2944b[]{bVar4};
        RowSchema rowSchema5 = new RowSchema();
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_web";
        bVar5.keyIcon = "@drawable/key_fore_sym_web";
        bVar5.keyType = "SymTypeKeyChs";
        rowSchema5.keys = new C2944b[]{bVar5};
        RowSchema rowSchema6 = new RowSchema();
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_number";
        bVar6.keyIcon = "@drawable/key_fore_sym_num";
        bVar6.keyType = "SymTypeKeyChs";
        rowSchema6.keys = new C2944b[]{bVar6};
        RowSchema rowSchema7 = new RowSchema();
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "sk_serial";
        bVar7.keyIcon = "@drawable/key_fore_sym_serial";
        bVar7.keyType = "SymTypeKeyChs";
        rowSchema7.keys = new C2944b[]{bVar7};
        RowSchema rowSchema8 = new RowSchema();
        C2944b bVar8 = new C2944b();
        bVar8.keyName = "sk_radical";
        bVar8.keyIcon = "@drawable/key_fore_sym_radical";
        bVar8.keyType = "SymTypeKeyChs";
        rowSchema8.keys = new C2944b[]{bVar8};
        RowSchema rowSchema9 = new RowSchema();
        C2944b bVar9 = new C2944b();
        bVar9.keyName = "sk_pinyin";
        bVar9.keyIcon = "@drawable/key_fore_sym_pinyin";
        bVar9.keyType = "SymTypeKeyChs";
        rowSchema9.keys = new C2944b[]{bVar9};
        RowSchema rowSchema10 = new RowSchema();
        C2944b bVar10 = new C2944b();
        bVar10.keyName = "sk_maths";
        bVar10.keyIcon = "@drawable/key_fore_sym_maths";
        bVar10.keyType = "SymTypeKeyChs";
        rowSchema10.keys = new C2944b[]{bVar10};
        RowSchema rowSchema11 = new RowSchema();
        C2944b bVar11 = new C2944b();
        bVar11.keyName = "sk_russia";
        bVar11.keyIcon = "@drawable/key_fore_sym_russia";
        bVar11.keyType = "SymTypeKeyChs";
        rowSchema11.keys = new C2944b[]{bVar11};
        RowSchema rowSchema12 = new RowSchema();
        C2944b bVar12 = new C2944b();
        bVar12.keyName = "sk_greek";
        bVar12.keyIcon = "@drawable/key_fore_sym_greek";
        bVar12.keyType = "SymTypeKeyChs";
        rowSchema12.keys = new C2944b[]{bVar12};
        RowSchema rowSchema13 = new RowSchema();
        C2944b bVar13 = new C2944b();
        bVar13.keyName = "sk_latin";
        bVar13.keyIcon = "@drawable/key_fore_sym_latin";
        bVar13.keyType = "SymTypeKeyChs";
        rowSchema13.keys = new C2944b[]{bVar13};
        RowSchema rowSchema14 = new RowSchema();
        C2944b bVar14 = new C2944b();
        bVar14.keyName = "sk_kata";
        bVar14.keyIcon = "@drawable/key_fore_sym_kata";
        bVar14.keyType = "SymTypeKeyChs";
        rowSchema14.keys = new C2944b[]{bVar14};
        RowSchema rowSchema15 = new RowSchema();
        C2944b bVar15 = new C2944b();
        bVar15.keyName = "sk_hira";
        bVar15.keyIcon = "@drawable/key_fore_sym_hira";
        bVar15.keyType = "SymTypeKeyChs";
        rowSchema15.keys = new C2944b[]{bVar15};
        RowSchema rowSchema16 = new RowSchema();
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_zhuyin_japan";
        bVar16.keyIcon = "@drawable/key_fore_sym_zhuyin_japan";
        bVar16.keyType = "SymTypeKeyChs";
        rowSchema16.keys = new C2944b[]{bVar16};
        RowSchema rowSchema17 = new RowSchema();
        rowSchema17.rowEdgeFlags = "bottom";
        C2944b bVar17 = new C2944b();
        bVar17.keyName = "sk_icon";
        bVar17.keyIcon = "@drawable/key_fore_sym_icon";
        bVar17.keyType = "SymTypeKeyChs";
        rowSchema17.keys = new C2944b[]{bVar17};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4, rowSchema5, rowSchema6, rowSchema7, rowSchema8, rowSchema9, rowSchema10, rowSchema11, rowSchema12, rowSchema13, rowSchema14, rowSchema15, rowSchema16, rowSchema17};
        this.verticalGap = "0px";
        this.slideThreshold = "100%p";
        this.ignoreSlip = "true";
        this.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        this.mainOnlyTextSize = "@dimen/button_textsize";
        this.keyWidth = "100%p";
        this.keyHeight = "16%p";
        this.horizontalGap = "0px";
    }
}
