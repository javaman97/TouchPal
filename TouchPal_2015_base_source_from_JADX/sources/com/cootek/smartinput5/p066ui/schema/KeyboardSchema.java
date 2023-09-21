package com.cootek.smartinput5.p066ui.schema;

/* renamed from: com.cootek.smartinput5.ui.schema.KeyboardSchema */
public class KeyboardSchema extends RowSchema {
    public String animationAreaHeight;
    public String animationAreaLeft;
    public String animationAreaTop;
    public String animationAreaWidth;
    public String backgroundBottomHeight;
    public String backgroundBottomWdith;
    public String backgroundLeftEdge;
    public String backgroundTopEdge;
    public String candiateCounts;
    public String candidateColumCount;
    public String candidateRowCount;
    public String enableDrawMoveContrail;
    public String hasDictSwitcher;
    public String hasLeftScroll;
    public String height;
    public RowSchema[] mRows;
    public String mainTextFontBold;
    public String numKeyboardSchemaId;
    public String shadowRect;
    public String slipThreshold;
    public String smileyKeyboardSchemaId;
    public String supportSmileyAnimation;
    public String useDynamicGridPager;
    public String width;

    public void setSchemaChildren(C2943a[] aVarArr) {
        if (aVarArr != null) {
            this.mRows = new RowSchema[aVarArr.length];
            int length = this.mRows.length;
            for (int i = 0; i < length; i++) {
                this.mRows[i] = aVarArr[i];
            }
        }
    }

    public RowSchema[] getRowSchema() {
        return this.mRows;
    }

    public String getNumKeyboardSchemaId() {
        return this.numKeyboardSchemaId;
    }

    public String getSmileyKeyboardSchemaId() {
        return this.smileyKeyboardSchemaId;
    }
}
