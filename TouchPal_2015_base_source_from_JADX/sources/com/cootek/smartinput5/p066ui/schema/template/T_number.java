package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_number */
public class T_number extends KeyboardSchema {
    public T_number() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        RowSchema rowSchema = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_1_1";
        bVar.backgroundType = "fun";
        bVar.keyWidth = "16%p";
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
        bVar5.keyX = "85%p";
        bVar5.keyName = "sk_bk";
        bVar5.backgroundType = "fun";
        bVar5.keyIcon = "@drawable/key_fore_backspace";
        bVar5.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar5.keyWidth = "15%p";
        bVar5.keyType = "BackSpaceKey";
        rowSchema.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_2_1";
        bVar6.backgroundType = "fun";
        bVar6.keyWidth = "16%p";
        bVar6.keyType = "Key";
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "sk_2_2";
        bVar7.keyType = "Key";
        C2944b bVar8 = new C2944b();
        bVar8.keyName = "sk_2_3";
        bVar8.keyType = "Key";
        C2944b bVar9 = new C2944b();
        bVar9.keyName = "sk_2_4";
        bVar9.keyType = "Key";
        C2944b bVar10 = new C2944b();
        bVar10.keyX = "85%p";
        bVar10.keyName = "sk_sp";
        bVar10.backgroundType = "fun";
        bVar10.ignoreCurve = "true";
        bVar10.ignoreStroke = "true";
        bVar10.keyIcon = "@drawable/lspace";
        bVar10.iconPreview = "@drawable/key_preview_space";
        bVar10.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar10.keyWidth = "fraction/bottom_key_width_2";
        bVar10.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar6, bVar7, bVar8, bVar9, bVar10};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar11 = new C2944b();
        bVar11.keyName = "sk_back";
        bVar11.backgroundType = "fun_highlight";
        bVar11.ignoreSlip = "true";
        bVar11.keyIcon = "@drawable/key_fore_back";
        bVar11.keyWidth = "16%p";
        bVar11.keyType = "Key";
        C2944b bVar12 = new C2944b();
        bVar12.keyName = "sk_3_1";
        bVar12.keyType = "Key";
        C2944b bVar13 = new C2944b();
        bVar13.keyName = "sk_3_2";
        bVar13.keyType = "Key";
        C2944b bVar14 = new C2944b();
        bVar14.keyName = "sk_3_3";
        bVar14.keyType = "Key";
        C2944b bVar15 = new C2944b();
        bVar15.keyX = "85%p";
        bVar15.keyName = "sk_3_4";
        bVar15.backgroundType = "fun";
        bVar15.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar15.keyWidth = "fraction/bottom_key_width_2";
        bVar15.keyType = "Key";
        rowSchema3.keys = new C2944b[]{bVar11, bVar12, bVar13, bVar14, bVar15};
        RowSchema rowSchema4 = new RowSchema();
        rowSchema4.rowEdgeFlags = "bottom";
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_4_1";
        bVar16.backgroundType = "fun";
        bVar16.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar16.keyWidth = "16%p";
        bVar16.keyType = "Key";
        C2944b bVar17 = new C2944b();
        bVar17.keyName = "sk_4_2";
        bVar17.backgroundType = "fun";
        bVar17.keyType = "Key";
        C2944b bVar18 = new C2944b();
        bVar18.keyName = "sk_4_3";
        bVar18.keyType = "Key";
        C2944b bVar19 = new C2944b();
        bVar19.keyName = "sk_4_4";
        bVar19.backgroundType = "fun";
        bVar19.keyType = "Key";
        C2944b bVar20 = new C2944b();
        bVar20.keyX = "85%p";
        bVar20.keyName = "sk_ent";
        bVar20.backgroundType = "fun";
        bVar20.keyIcon = "@drawable/key_fore_enter";
        bVar20.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar20.mainOnlyTextSize = "@dimen/button_textsize";
        bVar20.keyWidth = "@fraction/bottom_key_width_2";
        bVar20.keyType = EnterKey.TAG;
        rowSchema4.keys = new C2944b[]{bVar16, bVar17, bVar18, bVar19, bVar20};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.mainOnlyTextSize = "@dimen/number_keyboard_main_only_text_size";
        this.keyWidth = "23%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
    }
}
