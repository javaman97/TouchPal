package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_chs_soft_tplus_international */
public class T_chs_soft_tplus_international extends KeyboardSchema {
    public T_chs_soft_tplus_international() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        this.shadowRect = "0%p:0%p:100%p:50%p,10%p:50%p:85%p:75%p";
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
        bVar11.keyName = "sk_sep_sft";
        bVar11.backgroundType = "fun_highlight";
        bVar11.triType = "shift";
        bVar11.combineFlag = "shift";
        bVar11.keyIcon = "@drawable/key_fore_shift";
        bVar11.iconPreview = "@drawable/key_fore_shift";
        bVar11.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar11.keyWidth = "10%p";
        bVar11.keyType = "SeparatorKey";
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
        bVar15.keyName = "sk_3_4";
        bVar15.mainTitleRef = "Q W";
        bVar15.keyWidth = "15%p";
        bVar15.keyType = "Key";
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_bk";
        bVar16.backgroundType = "fun";
        bVar16.ignoreCurve = "true";
        bVar16.ignoreStroke = "true";
        bVar16.keyIcon = "@drawable/key_fore_backspace";
        bVar16.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar16.keyWidth = "15%p";
        bVar16.keyType = "BackSpaceKey";
        rowSchema3.keys = new C2944b[]{bVar11, bVar12, bVar13, bVar14, bVar15, bVar16};
        RowSchema rowSchema4 = new RowSchema();
        rowSchema4.rowEdgeFlags = "bottom";
        C2944b bVar17 = new C2944b();
        bVar17.keyName = "sk_sym";
        bVar17.backgroundType = "fun";
        bVar17.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar17.mainOnlyTextSize = "@dimen/button_textsize";
        bVar17.keyWidth = "@fraction/bottom_key_width_2";
        bVar17.keyType = "Key";
        C2944b bVar18 = new C2944b();
        bVar18.keyName = "sk_lng";
        bVar18.backgroundType = "fun";
        bVar18.triType = "opt_curve";
        bVar18.foregroundType = "fitCenter";
        bVar18.hasLongPressIcon = "true";
        bVar18.mainOnlyTextSize = "@dimen/button_textsize";
        bVar18.keyWidth = "@fraction/bottom_key_width_1";
        bVar18.keyType = "LanguageKey";
        C2944b bVar19 = new C2944b();
        bVar19.keyName = "Comma";
        bVar19.ignoreCurve = "true";
        bVar19.supportPreviewPopup = "false";
        bVar19.keyWidth = "@fraction/bottom_key_width_7";
        bVar19.keyType = "Key";
        C2944b bVar20 = new C2944b();
        bVar20.keyName = "sk_sp";
        bVar20.foregroundType = "fitCenter";
        bVar20.keyIcon = "@drawable/key_sp_normal";
        bVar20.iconPreview = "@drawable/key_preview_space";
        bVar20.keyWidth = "@fraction/bottom_key_width_4";
        bVar20.altTextInCorner = "true";
        bVar20.keyType = "SpaceKey";
        C2944b bVar21 = new C2944b();
        bVar21.altTextX = "0dip";
        bVar21.altTextXAlign = "center";
        bVar21.altTextYAlign = "top";
        bVar21.altTextY = "@dimen/curve_keyboard_alt_text_y";
        bVar21.keyName = "Dot";
        bVar21.supportPreviewPopup = "false";
        bVar21.keyWidth = "@fraction/bottom_key_width_1";
        bVar21.keyType = "Key";
        C2944b bVar22 = new C2944b();
        bVar22.keyName = "sk_num";
        bVar22.backgroundType = "fun";
        bVar22.mainOnlyTextSize = "@dimen/button_textsize";
        bVar22.keyWidth = "@fraction/bottom_key_width_1";
        bVar22.keyType = "Key";
        C2944b bVar23 = new C2944b();
        bVar23.keyX = "@fraction/bottom_key_width_2_minus";
        bVar23.keyName = "sk_ent";
        bVar23.backgroundType = "fun";
        bVar23.keyIcon = "@drawable/key_fore_enter";
        bVar23.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar23.mainOnlyTextSize = "@dimen/button_textsize";
        bVar23.keyWidth = "@fraction/bottom_key_width_2";
        bVar23.keyType = EnterKey.TAG;
        rowSchema4.keys = new C2944b[]{bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.keyWidth = "20%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
    }
}
