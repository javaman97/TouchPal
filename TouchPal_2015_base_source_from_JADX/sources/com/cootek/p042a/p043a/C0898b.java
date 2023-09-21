package com.cootek.p042a.p043a;

/* renamed from: com.cootek.a.a.b */
/* compiled from: PerfActionType */
public enum C0898b {
    ROOT,
    INNER,
    PROCESS_EVENT,
    KBD_DRAW,
    KBD_BUF_DRAW,
    CANDBAR_DRAW,
    CANDBAR_BUF_DRAW,
    UPDATE_RESULT,
    INIT_FUNCTION_MANAGER,
    ON_CREATE,
    ON_CREATE_INPUT_VIEW,
    ON_START_INPUT,
    ON_START_INPUT_VIEW,
    ON_FINISH_INPUT,
    ON_FINISH_INPUT_VIEW,
    ON_WINDOW_SHOWN,
    ON_WINDOW_HIDDEN,
    BASIC_COUNT,
    DOWN_UP,
    OP,
    DOWN_2,
    DOWN_3,
    MEASURE_TEXT,
    CAND_DRAW_TEXT,
    CAND_DRAW_MORE,
    CAND_DRAW_ADD,
    CHANGE_EXPLICIT,
    CHANGE_INLINE,
    CHANGE_CANDIDATE,
    CHANGE_INPUT_CONN,
    CHANGE_SURFACE,
    CHANGE_SURFACE_DISPLAY,
    CHANGE_FILTER,
    CHANGE_VERBOSE,
    KBD_DRAWABLE,
    KBD_DRAW_TEXT,
    TOTAL_COUNT;

    /* renamed from: a */
    static C0898b[] m4899a() {
        return m4900a(INNER, BASIC_COUNT);
    }

    /* renamed from: b */
    static C0898b[] m4901b() {
        return m4900a(BASIC_COUNT, TOTAL_COUNT);
    }

    /* renamed from: a */
    static C0898b[] m4900a(C0898b bVar, C0898b bVar2) {
        if (bVar2.ordinal() <= bVar.ordinal()) {
            return null;
        }
        C0898b[] bVarArr = new C0898b[((bVar2.ordinal() - bVar.ordinal()) - 1)];
        System.arraycopy(values(), bVar.ordinal() + 1, bVarArr, 0, bVarArr.length);
        return bVarArr;
    }
}
