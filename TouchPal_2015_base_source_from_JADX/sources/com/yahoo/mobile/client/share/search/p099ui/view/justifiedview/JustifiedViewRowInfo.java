package com.yahoo.mobile.client.share.search.p099ui.view.justifiedview;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;

/* renamed from: com.yahoo.mobile.client.share.search.ui.view.justifiedview.JustifiedViewRowInfo */
public class JustifiedViewRowInfo implements Comparable<JustifiedViewRowInfo> {

    /* renamed from: a */
    ArrayList<C4223b> f17290a = new ArrayList<>();

    /* renamed from: b */
    public int f17291b;

    public ArrayList<C4223b> getArrayJustifiedViewInfo() {
        return this.f17290a;
    }

    public double getRowHeight() {
        if (this.f17290a.size() > 0) {
            return this.f17290a.get(0).f17293b.getHeight();
        }
        return 0.0d;
    }

    @SuppressFBWarnings({"EQ_COMPARETO_USE_OBJECT_EQUALS"})
    public int compareTo(JustifiedViewRowInfo justifiedViewRowInfo) {
        int size = (this.f17291b + this.f17290a.size()) - 1;
        int size2 = (justifiedViewRowInfo.f17291b + justifiedViewRowInfo.f17290a.size()) - 1;
        if (size < justifiedViewRowInfo.f17291b) {
            return -1;
        }
        if (size2 < this.f17291b) {
            return 1;
        }
        return 0;
    }
}
