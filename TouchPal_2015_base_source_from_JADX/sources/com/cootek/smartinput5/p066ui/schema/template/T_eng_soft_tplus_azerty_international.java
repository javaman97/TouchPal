package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_eng_soft_tplus_azerty_international */
public class T_eng_soft_tplus_azerty_international extends KeyboardSchema {
    public T_eng_soft_tplus_azerty_international() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        this.hasDictSwitcher = "true";
        RowSchema rowSchema = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_1_1";
        bVar.mainTitleRef = "Q W";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.keyType = "Key";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_1_2";
        bVar2.mainTitleRef = "Q W";
        bVar2.keyType = "Key";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_1_3";
        bVar3.mainTitleRef = "Q W";
        bVar3.keyType = "Key";
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_1_4";
        bVar4.mainTitleRef = "Q W";
        bVar4.keyType = "Key";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_1_5";
        bVar5.mainTitleRef = "Q W";
        bVar5.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar5.keyType = "Key";
        rowSchema.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_2_1";
        bVar6.mainTitleRef = "Q W";
        bVar6.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar6.keyType = "Key";
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "sk_2_2";
        bVar7.mainTitleRef = "Q W";
        bVar7.keyType = "Key";
        C2944b bVar8 = new C2944b();
        bVar8.keyName = "sk_2_3";
        bVar8.mainTitleRef = "Q W";
        bVar8.keyType = "Key";
        C2944b bVar9 = new C2944b();
        bVar9.keyName = "sk_2_4";
        bVar9.mainTitleRef = "Q W";
        bVar9.keyType = "Key";
        C2944b bVar10 = new C2944b();
        bVar10.keyName = "sk_2_5";
        bVar10.mainTitleRef = "Q W";
        bVar10.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar10.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar6, bVar7, bVar8, bVar9, bVar10};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar11 = new C2944b();
        bVar11.keyName = "sk_sft";
        bVar11.backgroundType = "fun_highlight";
        bVar11.triType = "shift";
        bVar11.combineFlag = "shift";
        bVar11.keyIcon = "@drawable/key_fore_shift";
        bVar11.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar11.keyWidth = "20%p";
        bVar11.keyType = "Key";
        C2944b bVar12 = new C2944b();
        bVar12.keyName = "sk_3_1";
        bVar12.mainTitleRef = "Q W";
        bVar12.keyType = "Key";
        C2944b bVar13 = new C2944b();
        bVar13.keyName = "sk_3_2";
        bVar13.mainTitleRef = "Q W";
        bVar13.keyType = "Key";
        C2944b bVar14 = new C2944b();
        bVar14.keyName = "sk_3_3";
        bVar14.mainTitleRef = "Q W";
        bVar14.keyType = "Key";
        C2944b bVar15 = new C2944b();
        bVar15.keyName = "sk_bk";
        bVar15.backgroundType = "fun";
        bVar15.ignoreCurve = "true";
        bVar15.ignoreStroke = "true";
        bVar15.keyIcon = "@drawable/key_fore_backspace";
        bVar15.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar15.keyWidth = "20%p";
        bVar15.keyType = "BackSpaceKey";
        rowSchema3.keys = new C2944b[]{bVar11, bVar12, bVar13, bVar14, bVar15};
        RowSchema rowSchema4 = new RowSchema();
        rowSchema4.rowEdgeFlags = "bottom";
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_sym";
        bVar16.backgroundType = "fun";
        bVar16.ignoreCurve = "true";
        bVar16.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar16.mainOnlyTextSize = "@dimen/en_lang_sym_textsize";
        bVar16.keyWidth = "@fraction/bottom_key_width_2";
        bVar16.keyType = "Key";
        C2944b bVar17 = new C2944b();
        bVar17.keyName = "sk_lng";
        bVar17.backgroundType = "fun";
        bVar17.triType = "opt_curve";
        bVar17.foregroundType = "fitCenter";
        bVar17.ignoreCurve = "true";
        bVar17.hasLongPressIcon = "true";
        bVar17.mainOnlyTextSize = "@dimen/en_lang_sym_textsize";
        bVar17.keyWidth = "@fraction/bottom_key_width_1";
        bVar17.keyType = "LanguageKey";
        C2944b bVar18 = new C2944b();
        bVar18.keyName = "Comma";
        bVar18.binType = "dict";
        bVar18.foregroundType = "fitCenter";
        bVar18.ignoreCurve = "true";
        bVar18.supportPreviewPopup = "false";
        bVar18.keyWidth = "@fraction/bottom_key_width_7";
        bVar18.keyType = "CommaKey";
        C2944b bVar19 = new C2944b();
        bVar19.keyName = "sk_sp";
        bVar19.binType = "dict";
        bVar19.foregroundType = "fitCenter";
        bVar19.ignoreCurve = "true";
        bVar19.ignoreStroke = "true";
        bVar19.keyIcon = "@drawable/key_sp_normal";
        bVar19.iconPreview = "@drawable/key_preview_space";
        bVar19.keyWidth = "@fraction/bottom_key_width_space_shrink";
        bVar19.altTextInCorner = "true";
        bVar19.keyType = "SpaceKey";
        C2944b bVar20 = new C2944b();
        bVar20.altTextX = "0dip";
        bVar20.altTextXAlign = "center";
        bVar20.altTextYAlign = "top";
        bVar20.altTextY = "@dimen/curve_keyboard_alt_text_y";
        bVar20.keyName = "Dot";
        bVar20.ignoreCurve = "true";
        bVar20.supportPreviewPopup = "false";
        bVar20.keyWidth = "@fraction/bottom_key_width_1";
        bVar20.keyType = "Key";
        C2944b bVar21 = new C2944b();
        bVar21.keyX = "@fraction/bottom_key_width_2_minus";
        bVar21.keyName = "sk_ent";
        bVar21.backgroundType = "fun";
        bVar21.ignoreCurve = "true";
        bVar21.keyIcon = "@drawable/key_fore_enter";
        bVar21.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar21.mainOnlyTextSize = "@dimen/button_textsize";
        bVar21.keyWidth = "@fraction/bottom_key_width_2";
        bVar21.keyType = EnterKey.TAG;
        rowSchema4.keys = new C2944b[]{bVar16, bVar17, bVar18, bVar19, bVar20, bVar21};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.keyWidth = "20%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
    }
}
