package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_chs_sym_keyboard3_international */
public class T_chs_sym_keyboard3_international extends KeyboardSchema {
    public T_chs_sym_keyboard3_international() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        this.mainTextFontBold = "true";
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
        bVar7.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar7.keyType = "Key";
        rowSchema.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        rowSchema.keyWidth = "14.2857%p";
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar8 = new C2944b();
        bVar8.keyName = "sk_2_1";
        bVar8.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar8.keyType = "Key";
        C2944b bVar9 = new C2944b();
        bVar9.keyName = "sk_2_2";
        bVar9.keyType = "Key";
        C2944b bVar10 = new C2944b();
        bVar10.keyName = "sk_2_3";
        bVar10.keyType = "Key";
        C2944b bVar11 = new C2944b();
        bVar11.keyName = "sk_2_4";
        bVar11.keyType = "Key";
        C2944b bVar12 = new C2944b();
        bVar12.keyName = "sk_2_5";
        bVar12.keyType = "Key";
        C2944b bVar13 = new C2944b();
        bVar13.keyName = "sk_2_6";
        bVar13.keyType = "Key";
        C2944b bVar14 = new C2944b();
        bVar14.keyName = "sk_2_7";
        bVar14.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar14.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        rowSchema2.keyWidth = "14.2857%p";
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar15 = new C2944b();
        bVar15.keyName = "sk_3_1";
        bVar15.keyType = "Key";
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_3_2";
        bVar16.keyType = "Key";
        C2944b bVar17 = new C2944b();
        bVar17.keyName = "sk_3_3";
        bVar17.keyType = "Key";
        C2944b bVar18 = new C2944b();
        bVar18.keyName = "sk_3_4";
        bVar18.keyType = "Key";
        C2944b bVar19 = new C2944b();
        bVar19.keyName = "sk_3_5";
        bVar19.keyType = "Key";
        C2944b bVar20 = new C2944b();
        bVar20.keyName = "sk_bk";
        bVar20.backgroundType = "fun";
        bVar20.keyIcon = "@drawable/key_fore_backspace";
        bVar20.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar20.keyType = "BackSpaceKey";
        rowSchema3.keys = new C2944b[]{bVar15, bVar16, bVar17, bVar18, bVar19, bVar20};
        rowSchema3.mainOnlyTextSize = "17sp";
        rowSchema3.keyWidth = "16.667%p";
        RowSchema rowSchema4 = new RowSchema();
        rowSchema4.rowEdgeFlags = "bottom";
        C2944b bVar21 = new C2944b();
        bVar21.keyName = "sk_back";
        bVar21.backgroundType = "fun_highlight";
        bVar21.ignoreCurve = "true";
        bVar21.keyIcon = "@drawable/key_fore_back";
        bVar21.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar21.keyWidth = "@fraction/bottom_key_width_2";
        bVar21.keyType = "Key";
        C2944b bVar22 = new C2944b();
        bVar22.keyName = "sk_sp";
        bVar22.foregroundType = "fitCenter";
        bVar22.keyIcon = "@drawable/key_sp_normal";
        bVar22.iconPreview = "@drawable/key_preview_space";
        bVar22.keyWidth = "@fraction/bottom_key_width_space_big";
        bVar22.altTextInCorner = "true";
        bVar22.keyType = "Key";
        C2944b bVar23 = new C2944b();
        bVar23.keyName = "NextPage";
        bVar23.backgroundType = "fun";
        bVar23.keyWidth = "15%p";
        bVar23.keyType = "Key";
        C2944b bVar24 = new C2944b();
        bVar24.keyName = "sk_ent";
        bVar24.backgroundType = "fun";
        bVar24.keyIcon = "@drawable/key_fore_enter";
        bVar24.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar24.mainOnlyTextSize = "@dimen/button_textsize";
        bVar24.keyWidth = "@fraction/bottom_key_width_2";
        bVar24.keyType = EnterKey.TAG;
        rowSchema4.keys = new C2944b[]{bVar21, bVar22, bVar23, bVar24};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.keyWidth = "20%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
    }
}