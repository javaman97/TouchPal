package com.cootek.smartinput5.p066ui.schema;

/* renamed from: com.cootek.smartinput5.ui.schema.RowSchema */
public class RowSchema extends C2944b {
    public C2944b[] keys;
    public String rowEdgeFlags;
    public String slideThreshold;
    public String verticalGap;

    public void setSchemaChildren(C2943a[] aVarArr) {
        if (aVarArr != null) {
            this.keys = new C2944b[aVarArr.length];
            int length = aVarArr.length;
            for (int i = 0; i < length; i++) {
                this.keys[i] = aVarArr[i];
            }
        }
    }
}
