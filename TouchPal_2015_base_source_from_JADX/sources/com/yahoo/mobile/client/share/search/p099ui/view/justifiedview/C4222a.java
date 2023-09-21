package com.yahoo.mobile.client.share.search.p099ui.view.justifiedview;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.justifiedview.a */
public final class C4222a {
    /* renamed from: a */
    public static ArrayList<JustifiedViewRowInfo> m17721a(ArrayList<C4223b> arrayList, double d, double d2, double d3) {
        ArrayList<JustifiedViewRowInfo> arrayList2 = new ArrayList<>();
        JustifiedViewRowInfo justifiedViewRowInfo = new JustifiedViewRowInfo();
        arrayList2.add(justifiedViewRowInfo);
        Iterator<C4223b> it = arrayList.iterator();
        JustifiedViewRowInfo justifiedViewRowInfo2 = justifiedViewRowInfo;
        double d4 = 0.0d;
        while (it.hasNext()) {
            C4223b next = it.next();
            next.mo15846a(next.f17292a, d2 / next.f17292a.getHeight());
            double width = next.f17293b.getWidth();
            double d5 = (d4 + width) - d;
            if (d4 == 0.0d || d5 <= 0.0d || d5 < d - d4 || justifiedViewRowInfo2.getArrayJustifiedViewInfo().size() < 2) {
                d4 += width;
            } else {
                justifiedViewRowInfo2 = new JustifiedViewRowInfo();
                arrayList2.add(justifiedViewRowInfo2);
                d4 = width;
            }
            justifiedViewRowInfo2.getArrayJustifiedViewInfo().add(next);
        }
        if (arrayList2.size() > 1 && justifiedViewRowInfo2.getArrayJustifiedViewInfo().size() < 2) {
            arrayList2.get(arrayList2.size() - 2).getArrayJustifiedViewInfo().addAll(justifiedViewRowInfo2.getArrayJustifiedViewInfo());
            arrayList2.remove(arrayList2.size() - 1);
        }
        Iterator<JustifiedViewRowInfo> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            JustifiedViewRowInfo next2 = it2.next();
            double d6 = 0.0d;
            Iterator<C4223b> it3 = next2.getArrayJustifiedViewInfo().iterator();
            while (it3.hasNext()) {
                d6 += it3.next().f17293b.getWidth();
            }
            double size = (d - (((double) (next2.getArrayJustifiedViewInfo().size() - 1)) * d3)) / d6;
            Iterator<C4223b> it4 = next2.getArrayJustifiedViewInfo().iterator();
            while (it4.hasNext()) {
                C4223b next3 = it4.next();
                next3.mo15846a(next3.f17293b, size);
            }
        }
        return arrayList2;
    }
}
