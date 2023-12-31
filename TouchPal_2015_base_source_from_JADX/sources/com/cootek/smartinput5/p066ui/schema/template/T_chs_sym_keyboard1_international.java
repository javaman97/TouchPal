package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_chs_sym_keyboard1_international */
public class T_chs_sym_keyboard1_international extends KeyboardSchema {
    public T_chs_sym_keyboard1_international() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        this.mainTextFontBold = "true";
        RowSchema rowSchema = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_1_1";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.keyWidth = "13.33%p";
        bVar.keyType = "Key";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_1_2";
        bVar2.keyWidth = "13.33%p";
        bVar2.keyType = "Key";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_1_3";
        bVar3.keyWidth = "13.33%p";
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
        bVar9.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar9.keyType = "Key";
        rowSchema.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar10 = new C2944b();
        bVar10.keyName = "sk_2_1";
        bVar10.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar10.keyWidth = "13.33%p";
        bVar10.keyType = "Key";
        C2944b bVar11 = new C2944b();
        bVar11.keyName = "sk_2_2";
        bVar11.keyWidth = "13.33%p";
        bVar11.keyType = "Key";
        C2944b bVar12 = new C2944b();
        bVar12.keyName = "sk_2_3";
        bVar12.keyWidth = "13.33%p";
        bVar12.keyType = "Key";
        C2944b bVar13 = new C2944b();
        bVar13.keyName = "sk_2_4";
        bVar13.keyType = "Key";
        C2944b bVar14 = new C2944b();
        bVar14.keyName = "sk_2_5";
        bVar14.keyType = "Key";
        C2944b bVar15 = new C2944b();
        bVar15.keyName = "sk_2_6";
        bVar15.keyType = "Key";
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_2_7";
        bVar16.keyType = "Key";
        C2944b bVar17 = new C2944b();
        bVar17.keyName = "sk_2_8";
        bVar17.keyType = "Key";
        C2944b bVar18 = new C2944b();
        bVar18.keyName = "sk_2_9";
        bVar18.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar18.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar19 = new C2944b();
        bVar19.keyName = "sk_3_1";
        bVar19.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar19.keyWidth = "13.33%p";
        bVar19.keyType = "Key";
        C2944b bVar20 = new C2944b();
        bVar20.keyName = "sk_3_2";
        bVar20.keyWidth = "13.33%p";
        bVar20.keyType = "Key";
        C2944b bVar21 = new C2944b();
        bVar21.keyName = "sk_3_3";
        bVar21.keyWidth = "13.33%p";
        bVar21.keyType = "Key";
        C2944b bVar22 = new C2944b();
        bVar22.keyName = "sk_3_4";
        bVar22.keyType = "Key";
        C2944b bVar23 = new C2944b();
        bVar23.keyName = "sk_3_5";
        bVar23.keyType = "Key";
        C2944b bVar24 = new C2944b();
        bVar24.keyName = "sk_3_6";
        bVar24.keyType = "Key";
        C2944b bVar25 = new C2944b();
        bVar25.keyName = "sk_3_7";
        bVar25.keyType = "Key";
        C2944b bVar26 = new C2944b();
        bVar26.keyName = "sk_bk";
        bVar26.backgroundType = "fun";
        bVar26.keyIcon = "@drawable/key_fore_backspace";
        bVar26.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar26.keyWidth = "20%p";
        bVar26.keyType = "BackSpaceKey";
        rowSchema3.keys = new C2944b[]{bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26};
        RowSchema rowSchema4 = new RowSchema();
        rowSchema4.rowEdgeFlags = "bottom";
        C2944b bVar27 = new C2944b();
        bVar27.keyName = "sk_back";
        bVar27.backgroundType = "fun_highlight";
        bVar27.ignoreCurve = "true";
        bVar27.keyIcon = "@drawable/key_fore_back";
        bVar27.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar27.keyWidth = "13.33%p";
        bVar27.keyType = "Key";
        C2944b bVar28 = new C2944b();
        bVar28.keyName = "sk_4_1";
        bVar28.keyWidth = "13.33%p";
        bVar28.keyType = "Key";
        C2944b bVar29 = new C2944b();
        bVar29.keyName = "sk_4_2";
        bVar29.keyWidth = "13.33%p";
        bVar29.keyType = "Key";
        C2944b bVar30 = new C2944b();
        bVar30.keyName = "sk_sp";
        bVar30.foregroundType = "fitCenter";
        bVar30.keyIcon = "@drawable/key_sp_normal";
        bVar30.iconPreview = "@drawable/key_preview_space";
        bVar30.keyWidth = "30%p";
        bVar30.altTextInCorner = "true";
        bVar30.keyType = "Key";
        C2944b bVar31 = new C2944b();
        bVar31.keyName = "NextPage";
        bVar31.backgroundType = "fun";
        bVar31.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar31.keyWidth = "15%p";
        bVar31.keyType = "Key";
        C2944b bVar32 = new C2944b();
        bVar32.keyName = "sk_ent";
        bVar32.backgroundType = "fun";
        bVar32.keyIcon = "@drawable/key_fore_enter";
        bVar32.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar32.mainOnlyTextSize = "@dimen/button_textsize";
        bVar32.keyWidth = "@fraction/bottom_key_width_2";
        bVar32.keyType = EnterKey.TAG;
        rowSchema4.keys = new C2944b[]{bVar27, bVar28, bVar29, bVar30, bVar31, bVar32};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4};
        this.smileyKeyboardSchemaId = "eng_sym_keyboard1_sub_schema";
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.altTextSize = "@dimen/keyboard_alt_text_size_small";
        this.keyWidth = "10%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
        this.altTextInCorner = "@bool/full_keyboard_text_layout_in_corner";
    }
}
