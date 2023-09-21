package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_eng_sym_keyboard3 */
public class T_eng_sym_keyboard3 extends KeyboardSchema {
    public T_eng_sym_keyboard3() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        this.mainTextFontBold = "true";
        RowSchema rowSchema = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_1_1";
        bVar.mainTitleRef = "8";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.keyType = "EmojiKey";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_1_2";
        bVar2.mainTitleRef = "8";
        bVar2.keyType = "EmojiKey";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_1_3";
        bVar3.mainTitleRef = "8";
        bVar3.keyType = "EmojiKey";
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_1_4";
        bVar4.mainTitleRef = "8";
        bVar4.keyType = "EmojiKey";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_1_5";
        bVar5.mainTitleRef = "8";
        bVar5.keyType = "EmojiKey";
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_1_6";
        bVar6.mainTitleRef = "8";
        bVar6.keyType = "EmojiKey";
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "sk_1_7";
        bVar7.mainTitleRef = "8";
        bVar7.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar7.keyType = "EmojiKey";
        rowSchema.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar8 = new C2944b();
        bVar8.keyName = "sk_2_1";
        bVar8.mainTitleRef = "8";
        bVar8.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar8.keyType = "EmojiKey";
        C2944b bVar9 = new C2944b();
        bVar9.keyName = "sk_2_2";
        bVar9.mainTitleRef = "8";
        bVar9.keyType = "EmojiKey";
        C2944b bVar10 = new C2944b();
        bVar10.keyName = "sk_2_3";
        bVar10.mainTitleRef = "8";
        bVar10.keyType = "EmojiKey";
        C2944b bVar11 = new C2944b();
        bVar11.keyName = "sk_2_4";
        bVar11.mainTitleRef = "8";
        bVar11.keyType = "EmojiKey";
        C2944b bVar12 = new C2944b();
        bVar12.keyName = "sk_2_5";
        bVar12.mainTitleRef = "8";
        bVar12.keyType = "EmojiKey";
        C2944b bVar13 = new C2944b();
        bVar13.keyName = "sk_2_6";
        bVar13.mainTitleRef = "8";
        bVar13.keyType = "EmojiKey";
        C2944b bVar14 = new C2944b();
        bVar14.keyName = "sk_2_7";
        bVar14.mainTitleRef = "8";
        bVar14.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar14.keyType = "EmojiKey";
        rowSchema2.keys = new C2944b[]{bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar15 = new C2944b();
        bVar15.keyName = "sk_3_1";
        bVar15.mainTitleRef = "8";
        bVar15.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar15.keyType = "Key";
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_3_2";
        bVar16.mainTitleRef = "8";
        bVar16.keyType = "Key";
        C2944b bVar17 = new C2944b();
        bVar17.keyName = "sk_3_3";
        bVar17.mainTitleRef = "8";
        bVar17.keyType = "Key";
        C2944b bVar18 = new C2944b();
        bVar18.keyName = "sk_3_4";
        bVar18.mainTitleRef = "8";
        bVar18.keyType = "Key";
        C2944b bVar19 = new C2944b();
        bVar19.keyName = "sk_3_5";
        bVar19.mainTitleRef = "8";
        bVar19.keyType = "Key";
        C2944b bVar20 = new C2944b();
        bVar20.keyName = "sk_bk";
        bVar20.backgroundType = "fun";
        bVar20.keyIcon = "@drawable/key_fore_backspace";
        bVar20.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar20.keyWidth = "18.19%p";
        bVar20.keyType = "BackSpaceKey";
        rowSchema3.keys = new C2944b[]{bVar15, bVar16, bVar17, bVar18, bVar19, bVar20};
        rowSchema3.mainOnlyTextSize = "15sp";
        rowSchema3.keyWidth = "16.36%p";
        RowSchema rowSchema4 = new RowSchema();
        rowSchema4.rowEdgeFlags = "bottom";
        C2944b bVar21 = new C2944b();
        bVar21.keyName = "sk_emo";
        bVar21.backgroundType = "fun";
        bVar21.ignoreCurve = "true";
        bVar21.mainOnlyTextSize = "@dimen/button_textsize";
        bVar21.keyWidth = "13.33%p";
        bVar21.keyType = "Key";
        C2944b bVar22 = new C2944b();
        bVar22.keyName = "sk_back";
        bVar22.backgroundType = "fun_highlight";
        bVar22.ignoreCurve = "true";
        bVar22.keyIcon = "@drawable/key_fore_back";
        bVar22.keyWidth = "13.33%p";
        bVar22.keyType = "Key";
        C2944b bVar23 = new C2944b();
        bVar23.keyName = "sk_sp";
        bVar23.foregroundType = "fitCenter";
        bVar23.keyIcon = "@drawable/key_sp_normal";
        bVar23.iconPreview = "@drawable/key_preview_space";
        bVar23.keyWidth = "43.33%p";
        bVar23.altTextInCorner = "true";
        bVar23.keyType = "Key";
        C2944b bVar24 = new C2944b();
        bVar24.keyName = "NextPage";
        bVar24.backgroundType = "fun";
        bVar24.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar24.keyWidth = "15%p";
        bVar24.keyType = "Key";
        C2944b bVar25 = new C2944b();
        bVar25.keyX = "@fraction/bottom_key_width_2_minus";
        bVar25.keyName = "sk_ent";
        bVar25.backgroundType = "fun";
        bVar25.keyIcon = "@drawable/key_fore_enter";
        bVar25.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar25.mainOnlyTextSize = "@dimen/button_textsize";
        bVar25.keyWidth = "@fraction/bottom_key_width_2";
        bVar25.keyType = EnterKey.TAG;
        rowSchema4.keys = new C2944b[]{bVar21, bVar22, bVar23, bVar24, bVar25};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.keyWidth = "14.29%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
    }
}
