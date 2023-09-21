package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_more */
public class T_more extends KeyboardSchema {
    public T_more() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "30%p";
        this.animationAreaLeft = "0%p";
        this.animationAreaTop = "0%p";
        this.animationAreaWidth = "100%p";
        this.animationAreaHeight = "75%p";
        this.candidateRowCount = "3";
        this.candidateColumCount = "3";
        this.useDynamicGridPager = "false";
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
        bVar2.keyName = "sk_prev";
        bVar2.backgroundType = "fun";
        bVar2.keyIcon = "@drawable/key_fore_prev";
        bVar2.keyWidth = "33.33%p";
        bVar2.keyType = "CandidatePage";
        C2944b bVar3 = new C2944b();
        bVar3.mainTextXAlign = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar3.mainTextYAlign = "top";
        bVar3.mainTextX = "@dimen/symbol_page_number_x";
        bVar3.mainTextY = "@dimen/symbol_page_number_y";
        bVar3.keyName = "sk_next";
        bVar3.backgroundType = "fun";
        bVar3.keyIcon = "@drawable/key_fore_next";
        bVar3.mainOnlyTextSize = "@dimen/button_textsize";
        bVar3.keyWidth = "33.33%p";
        bVar3.keyType = "CandidatePage";
        C2944b bVar4 = new C2944b();
        bVar4.keyName = "sk_back";
        bVar4.backgroundType = "fun_highlight";
        bVar4.keyIcon = "@drawable/key_fore_back";
        bVar4.keyEdgeFlags = Settings.KEYBOARD_MARGIN_RIGHT;
        bVar4.keyWidth = "33.33%p";
        bVar4.keyType = "Key";
        rowSchema2.keys = new C2944b[]{bVar2, bVar3, bVar4};
        this.mRows = new RowSchema[]{rowSchema, rowSchema2};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.supportPreviewPopup = "false";
        this.keyWidth = "25%p";
        this.keyHeight = "25%p";
        this.horizontalGap = "0px";
    }
}
