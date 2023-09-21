package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_more_pinyin */
public class T_more_pinyin extends KeyboardSchema {
    public T_more_pinyin() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "30%p";
        this.animationAreaLeft = "0%p";
        this.animationAreaTop = "0%p";
        this.animationAreaWidth = "100%p";
        this.animationAreaHeight = "75%p";
        this.candidateRowCount = "3";
        this.candidateColumCount = "4";
        this.useDynamicGridPager = "true";
        RowSchema rowSchema = new RowSchema();
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_free_space";
        bVar.keyWidth = "100%p";
        bVar.keyType = "Key";
        rowSchema.keys = new C2944b[]{bVar};
        rowSchema.keyHeight = "75%p";
        RowSchema rowSchema2 = new RowSchema();
        rowSchema2.rowEdgeFlags = "bottom";
        C2944b bVar2 = new C2944b();
        bVar2.keyName = "sk_1_1";
        bVar2.backgroundType = "fun";
        bVar2.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar2.keyWidth = "25%p";
        bVar2.keyType = "SingleWordKey";
        C2944b bVar3 = new C2944b();
        bVar3.keyName = "sk_prev";
        bVar3.backgroundType = "fun";
        bVar3.keyIcon = "@drawable/key_fore_prev";
        bVar3.keyWidth = "25%p";
        bVar3.keyType = "CandidatePage";
        C2944b bVar4 = new C2944b();
        bVar4.mainTextXAlign = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar4.mainTextYAlign = "top";
        bVar4.mainTextX = "@dimen/symbol_page_number_x";
        bVar4.mainTextY = "@dimen/symbol_page_number_y";
        bVar4.keyName = "sk_next";
        bVar4.backgroundType = "fun";
        bVar4.keyIcon = "@drawable/key_fore_next";
        bVar4.mainOnlyTextSize = "@dimen/button_textsize";
        bVar4.keyWidth = "25%p";
        bVar4.keyType = "CandidatePage";
        C2944b bVar5 = new C2944b();
        bVar5.keyName = "sk_back";
        bVar5.backgroundType = "fun_highlight";
        bVar5.keyIcon = "@drawable/key_fore_back";
        bVar5.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar5.keyWidth = "25%p";
        bVar5.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar2, bVar3, bVar4, bVar5};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.supportPreviewPopup = "false";
        this.keyWidth = "25%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
    }
}
