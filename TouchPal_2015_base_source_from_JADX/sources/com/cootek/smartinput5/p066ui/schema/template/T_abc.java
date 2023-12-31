package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_abc */
public class T_abc extends KeyboardSchema {
    public T_abc() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        RowSchema rowSchema = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_1_1";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.keyType = "Key";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_1_2";
        bVar2.keyType = "Key";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_1_3";
        bVar3.keyType = "Key";
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_1_4";
        bVar4.keyType = "Key";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_1_5";
        bVar5.keyType = "Key";
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_1_6";
        bVar6.keyType = "Key";
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "sk_1_7";
        bVar7.keyType = "Key";
        C2944b bVar8 = new C2944b();
        bVar8.keyName = "sk_1_8";
        bVar8.keyType = "Key";
        C2944b bVar9 = new C2944b();
        bVar9.keyName = "sk_1_9";
        bVar9.keyType = "Key";
        C2944b bVar10 = new C2944b();
        bVar10.keyName = "sk_1_10";
        bVar10.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar10.keyType = "Key";
        rowSchema.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar11 = new C2944b();
        bVar11.keyName = "sk_2_1";
        bVar11.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar11.horizontalGap = "5%p";
        bVar11.keyType = "Key";
        C2944b bVar12 = new C2944b();
        bVar12.keyName = "sk_2_2";
        bVar12.keyType = "Key";
        C2944b bVar13 = new C2944b();
        bVar13.keyName = "sk_2_3";
        bVar13.keyType = "Key";
        C2944b bVar14 = new C2944b();
        bVar14.keyName = "sk_2_4";
        bVar14.keyType = "Key";
        C2944b bVar15 = new C2944b();
        bVar15.keyName = "sk_2_5";
        bVar15.keyType = "Key";
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_2_6";
        bVar16.keyType = "Key";
        C2944b bVar17 = new C2944b();
        bVar17.keyName = "sk_2_7";
        bVar17.keyType = "Key";
        C2944b bVar18 = new C2944b();
        bVar18.keyName = "sk_2_8";
        bVar18.keyType = "Key";
        C2944b bVar19 = new C2944b();
        bVar19.keyName = "sk_2_9";
        bVar19.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar19.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar20 = new C2944b();
        bVar20.keyName = "sk_sft";
        bVar20.backgroundType = "fun_highlight";
        bVar20.triType = "shift";
        bVar20.combineFlag = "shift";
        bVar20.ignoreCurve = "true";
        bVar20.keyIcon = "@drawable/key_fore_shift";
        bVar20.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar20.keyWidth = "15%p";
        bVar20.keyType = "Key";
        C2944b bVar21 = new C2944b();
        bVar21.keyName = "sk_3_1";
        bVar21.keyType = "Key";
        C2944b bVar22 = new C2944b();
        bVar22.keyName = "sk_3_2";
        bVar22.keyType = "Key";
        C2944b bVar23 = new C2944b();
        bVar23.keyName = "sk_3_3";
        bVar23.keyType = "Key";
        C2944b bVar24 = new C2944b();
        bVar24.keyName = "sk_3_4";
        bVar24.keyType = "Key";
        C2944b bVar25 = new C2944b();
        bVar25.keyName = "sk_3_5";
        bVar25.keyType = "Key";
        C2944b bVar26 = new C2944b();
        bVar26.keyName = "sk_3_6";
        bVar26.keyType = "Key";
        C2944b bVar27 = new C2944b();
        bVar27.keyName = "sk_3_7";
        bVar27.keyType = "Key";
        C2944b bVar28 = new C2944b();
        bVar28.keyName = "sk_bk";
        bVar28.backgroundType = "fun";
        bVar28.ignoreCurve = "true";
        bVar28.ignoreStroke = "true";
        bVar28.keyIcon = "@drawable/key_fore_backspace";
        bVar28.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar28.keyWidth = "15%p";
        bVar28.keyType = "BackSpaceKey";
        rowSchema3.keys = new C2944b[]{bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28};
        RowSchema rowSchema4 = new RowSchema();
        rowSchema4.rowEdgeFlags = "bottom";
        C2944b bVar29 = new C2944b();
        bVar29.keyName = "sk_sym";
        bVar29.backgroundType = "fun";
        bVar29.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar29.mainOnlyTextSize = "@dimen/button_textsize";
        bVar29.keyWidth = "@fraction/bottom_key_width_2";
        bVar29.keyType = "Key";
        C2944b bVar30 = new C2944b();
        bVar30.keyName = "sk_4_1";
        bVar30.backgroundType = "fun";
        bVar30.hasLongPressIcon = "true";
        bVar30.mainOnlyTextSize = "@dimen/en_lang_sym_textsize";
        bVar30.keyWidth = "@fraction/bottom_key_width_1";
        bVar30.keyType = "Key";
        C2944b bVar31 = new C2944b();
        bVar31.keyName = "Comma";
        bVar31.supportPreviewPopup = "false";
        bVar31.keyWidth = "@fraction/bottom_key_width_7";
        bVar31.keyType = "Key";
        C2944b bVar32 = new C2944b();
        bVar32.keyName = "sk_sp";
        bVar32.keyIcon = "@drawable/key_normal_space";
        bVar32.iconPreview = "@drawable/key_preview_space";
        bVar32.keyWidth = "@fraction/bottom_key_width_13";
        bVar32.altTextInCorner = "true";
        bVar32.keyType = "Key";
        C2944b bVar33 = new C2944b();
        bVar33.keyName = "Dot";
        bVar33.supportPreviewPopup = "false";
        bVar33.keyWidth = "@fraction/bottom_key_chinese_dot";
        bVar33.keyType = "Key";
        C2944b bVar34 = new C2944b();
        bVar34.keyName = "sk_back";
        bVar34.backgroundType = "fun_highlight";
        bVar34.keyIcon = "@drawable/key_fore_back";
        bVar34.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar34.mainOnlyTextSize = "@dimen/button_textsize";
        bVar34.keyWidth = "@fraction/bottom_key_width_11";
        bVar34.keyType = "Key";
        rowSchema4.keys = new C2944b[]{bVar29, bVar30, bVar31, bVar32, bVar33, bVar34};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.mainOnlyTextSize = "@dimen/abc_main_only_text_size";
        this.keyWidth = "10%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
        this.altTextInCorner = "@bool/full_keyboard_text_layout_in_corner";
    }
}
