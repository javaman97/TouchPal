package com.cootek.smartinput5.p066ui.schema.template;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;

/* renamed from: com.cootek.smartinput5.ui.schema.template.T_clipboard */
public class T_clipboard extends KeyboardSchema {
    public T_clipboard() {
        this.height = "@fraction/keyboard_height";
        this.slipThreshold = "60%p";
        RowSchema rowSchema = new RowSchema();
        rowSchema.rowEdgeFlags = "bottom";
        C2944b bVar = new C2944b();
        bVar.keyName = "sk_blank";
        bVar.keyEdgeFlags = Settings.KEYBOARD_MARGIN_LEFT;
        bVar.keyType = "EditKey";
        rowSchema.keys = new C2944b[]{bVar};
        this.mRows = new RowSchema[]{rowSchema};
        this.verticalGap = "0px";
        this.slideThreshold = "@fraction/key_slide_threshold";
        this.keyWidth = "100%p";
        this.keyHeight = "100%p";
        this.horizontalGap = "0px";
    }
}
