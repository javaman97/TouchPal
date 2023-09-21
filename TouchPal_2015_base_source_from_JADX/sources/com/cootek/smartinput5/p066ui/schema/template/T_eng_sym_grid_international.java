package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_eng_sym_grid_international */
public class T_eng_sym_grid_international extends KeyboardSchema {
    public T_eng_sym_grid_international() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "30%p";
        this.mainTextFontBold = "false";
        this.animationAreaLeft = "16%p";
        this.animationAreaTop = "0%p";
        this.animationAreaWidth = "84%p";
        this.animationAreaHeight = "80%p";
        RowSchema rowSchema = new RowSchema();
        rowSchema.keyHeight = "80%p";
        RowSchema rowSchema2 = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_back";
        bVar.backgroundType = "fun";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.keyWidth = "17%p";
        bVar.keyType = "Key";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_lock";
        bVar2.triType = "lock";
        bVar2.keyIcon = "@drawable/key_fore_lock_status";
        bVar2.keyWidth = "@fraction/bottom_key_width_1";
        bVar2.keyType = "Key";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_prev";
        bVar3.keyIcon = "@drawable/key_fore_prev";
        bVar3.keyWidth = "19%p";
        bVar3.keyType = "PageKey";
        C2944b bVar4 = new C2944b();
        bVar4.mainTextXAlign = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar4.mainTextYAlign = "top";
        bVar4.mainTextX = "@dimen/symbol_page_number_x";
        bVar4.mainTextY = "@dimen/symbol_page_number_y";
        bVar4.keyName = "sk_next";
        bVar4.keyIcon = "@drawable/key_fore_next";
        bVar4.mainOnlyTextSize = "@dimen/button_textsize";
        bVar4.keyWidth = "19%p";
        bVar4.keyType = "PageKey";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_bk";
        bVar5.backgroundType = "fun";
        bVar5.keyIcon = "@drawable/key_fore_backspace";
        bVar5.keyWidth = "17%p";
        bVar5.keyType = "BackSpaceKey";
        C2944b bVar6 = new C2944b();
        bVar6.keyName = "sk_hide";
        bVar6.backgroundType = "fun";
        bVar6.keyIcon = "@drawable/key_fore_hide";
        bVar6.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar6.keyWidth = "18%p";
        bVar6.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        rowSchema2.backgroundType = "fun";
        rowSchema2.ignoreSlip = "true";
        rowSchema2.keyHeight = "20%p";
        this.mRows = new RowSchema[]{rowSchema, rowSchema2};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.keyWidth = "21%p";
        this.keyHeight = "20%p";
        this.horizontalGap = "0px";
    }
}
