package com.cootek.smartinput5.p047c;

import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.c.U */
/* compiled from: PluginWidgetItemTable */
public class C1195U {

    /* renamed from: a */
    public static C1194T[] f3557a = {C1194T.WIDGET_LANGUAGE, C1194T.WIDGET_SKIN, C1194T.WIDGET_STORE, C1194T.WIDGET_VOICE, C1194T.WIDGET_HW_MASK, C1194T.WIDGET_EDIT, C1194T.WIDGET_RESIZE_KEYBOARD, C1194T.WIDGET_PREDICTION, C1194T.WIDGET_CHT_CHS_CONVERT, C1194T.WIDGET_TRENDS, C1194T.WIDGET_MORE};

    /* renamed from: a */
    public ArrayList<C1199d> mo4466a() {
        ArrayList<C1199d> arrayList = new ArrayList<>();
        for (C1194T t : f3557a) {
            if (t.mo4465a().mo4458f()) {
                arrayList.add(t.mo4465a());
            }
        }
        return arrayList;
    }
}
