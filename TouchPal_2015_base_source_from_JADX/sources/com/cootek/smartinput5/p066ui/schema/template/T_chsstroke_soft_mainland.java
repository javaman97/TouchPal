package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_chsstroke_soft_mainland */
public class T_chsstroke_soft_mainland extends KeyboardSchema {
    public T_chsstroke_soft_mainland() {
        this.height = "fraction/keyboard_height";
        this.slipThreshold = "60%p";
        this.shadowRect = "0%p:0%p:85%p:75%p";
        this.hasLeftScroll = "true";
        RowSchema rowSchema = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_heng";
        bVar.mainTitleRef = "通配";
        bVar.horizontalGap = "15%p";
        bVar.keyType = "Key";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_shu";
        bVar2.mainTitleRef = "通配";
        bVar2.keyType = "Key";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_pie";
        bVar3.mainTitleRef = "通配";
        bVar3.keyType = "Key";
        C2944b bVar4 = new C2944b();
        bVar4.keyX = "85%p";
        bVar4.keyName = "sk_bk";
        bVar4.backgroundType = "fun";
        bVar4.keyIcon = "drawable/key_fore_backspace";
        bVar4.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar4.keyWidth = "15%p";
        bVar4.keyType = "BackSpaceKey";
        rowSchema.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4};
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_na";
        bVar5.mainTitleRef = "通配";
        bVar5.horizontalGap = "15%p";
        bVar5.keyType = "Key";
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_zhe";
        bVar6.mainTitleRef = "通配";
        bVar6.keyType = "Key";
        C2944b bVar7 = new C2944b();
        bVar7.keyName = "sk_ci";
        bVar7.mainTitleRef = "通配";
        bVar7.keyType = "Key";
        C2944b bVar8 = new C2944b();
        bVar8.keyX = "85%p";
        bVar8.keyName = "sk_num";
        bVar8.backgroundType = "fun";
        bVar8.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar8.mainOnlyTextSize = "@dimen/button_textsize";
        bVar8.keyWidth = "15%p";
        bVar8.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar5, bVar6, bVar7, bVar8};
        RowSchema rowSchema3 = new RowSchema();
        C2944b bVar9 = new C2944b();
        bVar9.keyName = "sk_colon";
        bVar9.mainTitleRef = "通配";
        bVar9.horizontalGap = "15%p";
        bVar9.keyType = "Key";
        C2944b bVar10 = new C2944b();
        bVar10.keyName = "sk_ellipsis";
        bVar10.mainTitleRef = "通配";
        bVar10.keyType = "Key";
        C2944b bVar11 = new C2944b();
        bVar11.keyName = "sk_tong";
        bVar11.mainTitleRef = "通配";
        bVar11.keyType = "Key";
        C2944b bVar12 = new C2944b();
        bVar12.keyX = "85%p";
        bVar12.keyName = "sk_abc";
        bVar12.backgroundType = "fun";
        bVar12.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar12.mainOnlyTextSize = "@dimen/button_textsize";
        bVar12.keyWidth = "15%p";
        bVar12.keyType = "Key";
        rowSchema3.keys = new C2944b[]{bVar9, bVar10, bVar11, bVar12};
        RowSchema rowSchema4 = new RowSchema();
        rowSchema4.rowEdgeFlags = "bottom";
        C2944b bVar13 = new C2944b();
        bVar13.keyName = "sk_sym";
        bVar13.backgroundType = "fun";
        bVar13.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar13.mainOnlyTextSize = "@dimen/button_textsize";
        bVar13.keyWidth = "@fraction/bottom_key_width_2";
        bVar13.keyType = "Key";
        C2944b bVar14 = new C2944b();
        bVar14.keyName = "sk_lng";
        bVar14.backgroundType = "fun";
        bVar14.triType = "opt_curve";
        bVar14.foregroundType = "fitCenter";
        bVar14.hasLongPressIcon = "true";
        bVar14.mainOnlyTextSize = "@dimen/button_textsize";
        bVar14.keyWidth = "@fraction/bottom_key_width_1";
        bVar14.keyType = "LanguageKey";
        C2944b bVar15 = new C2944b();
        bVar15.keyName = "Comma";
        bVar15.ignoreCurve = "true";
        bVar15.supportPreviewPopup = "false";
        bVar15.keyWidth = "@fraction/bottom_key_width_7";
        bVar15.keyType = "Key";
        C2944b bVar16 = new C2944b();
        bVar16.keyName = "sk_sp";
        bVar16.foregroundType = "fitCenter";
        bVar16.keyIcon = "@drawable/key_sp_normal";
        bVar16.iconPreview = "@drawable/key_preview_space";
        bVar16.keyWidth = "@fraction/bottom_key_width_space_shrink";
        bVar16.altTextInCorner = "true";
        bVar16.keyType = "SpaceKey";
        C2944b bVar17 = new C2944b();
        bVar17.altTextX = "0dip";
        bVar17.altTextXAlign = "center";
        bVar17.altTextYAlign = "top";
        bVar17.altTextY = "@dimen/curve_keyboard_alt_text_y";
        bVar17.keyName = "Dot";
        bVar17.supportPreviewPopup = "false";
        bVar17.keyWidth = "@fraction/bottom_key_width_7";
        bVar17.keyType = "Key";
        C2944b bVar18 = new C2944b();
        bVar18.keyX = "@fraction/bottom_key_width_2_minus";
        bVar18.keyName = "sk_ent";
        bVar18.backgroundType = "fun";
        bVar18.keyIcon = "@drawable/key_fore_enter";
        bVar18.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar18.mainOnlyTextSize = "@dimen/button_textsize";
        bVar18.keyWidth = "@fraction/bottom_key_width_2";
        bVar18.keyType = EnterKey.TAG;
        rowSchema4.keys = new C2944b[]{bVar13, bVar14, bVar15, bVar16, bVar17, bVar18};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2, rowSchema3, rowSchema4};
        this.verticalGap = "0px";
        this.slideThreshold = "fraction/key_slide_threshold";
        this.supportPreviewPopup = "false";
        this.keyWidth = "23.3%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
        this.altTextInCorner = "true";
    }
}
