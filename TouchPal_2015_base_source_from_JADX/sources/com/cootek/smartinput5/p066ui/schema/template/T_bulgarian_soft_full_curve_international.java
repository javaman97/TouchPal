package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_bulgarian_soft_full_curve_international */
public class T_bulgarian_soft_full_curve_international extends KeyboardSchema {
    public T_bulgarian_soft_full_curve_international() {
        this.height = "fraction/keyboard_height";
        this.slipThreshold = "60%p";
        this.hasDictSwitcher = "true";
        RowSchema rowSchema = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_1_1";
        bVar.mainTitleRef = "щ";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.keyType = "Key";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_1_2";
        bVar2.mainTitleRef = "щ";
        bVar2.keyType = "Key";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_1_3";
        bVar3.mainTitleRef = "щ";
        bVar3.keyType = "Key";
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_1_4";
        bVar4.mainTitleRef = "щ";
        bVar4.keyType = "Key";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_1_5";
        bVar5.mainTitleRef = "щ";
        bVar5.keyType = "Key";
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_1_6";
        bVar6.mainTitleRef = "щ";
        bVar6.keyType = "Key";
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "sk_1_7";
        bVar7.mainTitleRef = "щ";
        bVar7.keyType = "Key";
        C2944b bVar8 = new C2944b();
        bVar8.keyName = "sk_1_8";
        bVar8.mainTitleRef = "щ";
        bVar8.keyType = "Key";
        C2944b bVar9 = new C2944b();
        bVar9.keyName = "sk_1_9";
        bVar9.mainTitleRef = "щ";
        bVar9.keyType = "Key";
        C2944b bVar10 = new C2944b();
        bVar10.keyName = "sk_1_10";
        bVar10.mainTitleRef = "щ";
        bVar10.keyType = "Key";
        C2944b bVar11 = new C2944b();
        bVar11.keyName = "sk_1_11";
        bVar11.mainTitleRef = "щ";
        bVar11.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar11.keyType = "Key";
        rowSchema.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11};
        rowSchema.mainTextX = "50%p";
        rowSchema.mainTextY = "67%p";
        rowSchema.altTextX = "@dimen/curve_keyboard_alt_text_x";
        rowSchema.altTextXAlign = Settings.KEYBOARD_MARGIN_RIGHT;
        rowSchema.altTextYAlign = "top";
        rowSchema.altTextY = "@dimen/curve_keyboard_alt_text_y";
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar12 = new C2944b();
        bVar12.keyName = "sk_2_1";
        bVar12.mainTitleRef = "щ";
        bVar12.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar12.keyType = "Key";
        C2944b bVar13 = new C2944b();
        bVar13.keyName = "sk_2_2";
        bVar13.mainTitleRef = "щ";
        bVar13.keyType = "Key";
        C2944b bVar14 = new C2944b();
        bVar14.keyName = "sk_2_3";
        bVar14.mainTitleRef = "щ";
        bVar14.keyType = "Key";
        C2944b bVar15 = new C2944b();
        bVar15.keyName = "sk_2_4";
        bVar15.mainTitleRef = "щ";
        bVar15.keyType = "Key";
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_2_5";
        bVar16.mainTitleRef = "щ";
        bVar16.keyType = "Key";
        C2944b bVar17 = new C2944b();
        bVar17.keyName = "sk_2_6";
        bVar17.mainTitleRef = "щ";
        bVar17.keyType = "Key";
        C2944b bVar18 = new C2944b();
        bVar18.keyName = "sk_2_7";
        bVar18.mainTitleRef = "щ";
        bVar18.keyType = "Key";
        C2944b bVar19 = new C2944b();
        bVar19.keyName = "sk_2_8";
        bVar19.mainTitleRef = "щ";
        bVar19.keyType = "Key";
        C2944b bVar20 = new C2944b();
        bVar20.keyName = "sk_2_9";
        bVar20.mainTitleRef = "щ";
        bVar20.keyType = "Key";
        C2944b bVar21 = new C2944b();
        bVar21.keyName = "sk_2_10";
        bVar21.mainTitleRef = "щ";
        bVar21.keyType = "Key";
        C2944b bVar22 = new C2944b();
        bVar22.keyName = "sk_2_11";
        bVar22.mainTitleRef = "щ";
        bVar22.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar22.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar23 = new C2944b();
        bVar23.keyName = "sk_sft";
        bVar23.backgroundType = "fun_highlight";
        bVar23.triType = "shift";
        bVar23.combineFlag = "shift";
        bVar23.ignoreCurve = "true";
        bVar23.keyIcon = "drawable/key_fore_shift";
        bVar23.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar23.keyWidth = "13.64%p";
        bVar23.keyType = "Key";
        C2944b bVar24 = new C2944b();
        bVar24.keyName = "sk_3_1";
        bVar24.mainTitleRef = "щ";
        bVar24.keyType = "Key";
        C2944b bVar25 = new C2944b();
        bVar25.keyName = "sk_3_2";
        bVar25.mainTitleRef = "щ";
        bVar25.keyType = "Key";
        C2944b bVar26 = new C2944b();
        bVar26.keyName = "sk_3_3";
        bVar26.mainTitleRef = "щ";
        bVar26.keyType = "Key";
        C2944b bVar27 = new C2944b();
        bVar27.keyName = "sk_3_4";
        bVar27.mainTitleRef = "щ";
        bVar27.keyType = "Key";
        C2944b bVar28 = new C2944b();
        bVar28.keyName = "sk_3_5";
        bVar28.mainTitleRef = "щ";
        bVar28.keyType = "Key";
        C2944b bVar29 = new C2944b();
        bVar29.keyName = "sk_3_6";
        bVar29.mainTitleRef = "щ";
        bVar29.keyType = "Key";
        C2944b bVar30 = new C2944b();
        bVar30.keyName = "sk_3_7";
        bVar30.mainTitleRef = "щ";
        bVar30.keyType = "Key";
        C2944b bVar31 = new C2944b();
        bVar31.keyName = "sk_3_8";
        bVar31.mainTitleRef = "щ";
        bVar31.keyType = "Key";
        C2944b bVar32 = new C2944b();
        bVar32.keyName = "sk_bk";
        bVar32.backgroundType = "fun";
        bVar32.ignoreCurve = "true";
        bVar32.ignoreStroke = "true";
        bVar32.keyIcon = "drawable/key_fore_backspace";
        bVar32.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar32.keyWidth = "13.64%p";
        bVar32.keyType = "BackSpaceKey";
        rowSchema3.keys = new C2944b[]{bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32};
        RowSchema rowSchema4 = new RowSchema();
        rowSchema4.rowEdgeFlags = "bottom";
        C2944b bVar33 = new C2944b();
        bVar33.keyName = "sk_sym";
        bVar33.backgroundType = "fun";
        bVar33.ignoreCurve = "true";
        bVar33.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar33.mainOnlyTextSize = "@dimen/en_lang_sym_textsize";
        bVar33.keyWidth = "@fraction/bottom_key_width_2";
        bVar33.keyType = "Key";
        C2944b bVar34 = new C2944b();
        bVar34.keyName = "sk_lng";
        bVar34.backgroundType = "fun";
        bVar34.triType = "opt_curve";
        bVar34.foregroundType = "fitCenter";
        bVar34.ignoreCurve = "true";
        bVar34.hasLongPressIcon = "true";
        bVar34.mainOnlyTextSize = "@dimen/en_lang_sym_textsize";
        bVar34.keyWidth = "@fraction/bottom_key_width_1";
        bVar34.keyType = "LanguageKey";
        C2944b bVar35 = new C2944b();
        bVar35.keyName = "Comma";
        bVar35.binType = "dict";
        bVar35.foregroundType = "fitCenter";
        bVar35.ignoreCurve = "true";
        bVar35.supportPreviewPopup = "false";
        bVar35.keyWidth = "@fraction/bottom_key_width_7";
        bVar35.keyType = "CommaKey";
        C2944b bVar36 = new C2944b();
        bVar36.keyName = "sk_sp";
        bVar36.binType = "dict";
        bVar36.foregroundType = "fitCenter";
        bVar36.ignoreCurve = "true";
        bVar36.ignoreStroke = "true";
        bVar36.keyIcon = "@drawable/key_sp_normal";
        bVar36.iconPreview = "@drawable/key_preview_space";
        bVar36.keyWidth = "@fraction/bottom_key_width_space_shrink";
        bVar36.altTextInCorner = "true";
        bVar36.keyType = "SpaceKey";
        C2944b bVar37 = new C2944b();
        bVar37.altTextX = "0dip";
        bVar37.altTextXAlign = "center";
        bVar37.altTextYAlign = "top";
        bVar37.altTextY = "@dimen/curve_keyboard_alt_text_y";
        bVar37.keyName = "Dot";
        bVar37.ignoreCurve = "true";
        bVar37.supportPreviewPopup = "false";
        bVar37.keyWidth = "@fraction/bottom_key_width_1";
        bVar37.keyType = "Key";
        C2944b bVar38 = new C2944b();
        bVar38.keyX = "@fraction/bottom_key_width_2_minus";
        bVar38.keyName = "sk_ent";
        bVar38.backgroundType = "fun";
        bVar38.ignoreCurve = "true";
        bVar38.keyIcon = "@drawable/key_fore_enter";
        bVar38.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar38.mainOnlyTextSize = "@dimen/button_textsize";
        bVar38.keyWidth = "@fraction/bottom_key_width_2";
        bVar38.keyType = EnterKey.TAG;
        rowSchema4.keys = new C2944b[]{bVar33, bVar34, bVar35, bVar36, bVar37, bVar38};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4};
        this.numKeyboardSchemaId = "soft_full_keyboard_sub_schema";
        this.verticalGap = "0px";
        this.slideThreshold = "fraction/key_slide_threshold";
        this.altTextSize = "@dimen/keyboard_alt_text_size_small";
        this.keyWidth = "9.09%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
        this.altTextInCorner = "bool/full_keyboard_text_layout_in_corner";
    }
}