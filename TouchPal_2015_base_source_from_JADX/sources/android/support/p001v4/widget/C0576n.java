package android.support.p001v4.widget;

import android.view.View;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.n */
/* compiled from: ListViewAutoScrollHelper */
public class C0576n extends C0548a {

    /* renamed from: g */
    private final ListView f1427g;

    public C0576n(ListView listView) {
        super(listView);
        this.f1427g = listView;
    }

    /* renamed from: a */
    public void mo1888a(int i, int i2) {
        View childAt;
        ListView listView = this.f1427g;
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i2);
        }
    }

    /* renamed from: e */
    public boolean mo1899e(int i) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028 A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1900f(int r7) {
        /*
            r6 = this;
            r0 = 0
            android.widget.ListView r1 = r6.f1427g
            int r2 = r1.getCount()
            if (r2 != 0) goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            int r3 = r1.getChildCount()
            int r4 = r1.getFirstVisiblePosition()
            int r5 = r4 + r3
            if (r7 <= 0) goto L_0x002a
            if (r5 < r2) goto L_0x0028
            int r2 = r3 + -1
            android.view.View r2 = r1.getChildAt(r2)
            int r2 = r2.getBottom()
            int r1 = r1.getHeight()
            if (r2 <= r1) goto L_0x0009
        L_0x0028:
            r0 = 1
            goto L_0x0009
        L_0x002a:
            if (r7 >= 0) goto L_0x0009
            if (r4 > 0) goto L_0x0028
            android.view.View r1 = r1.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0028
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.widget.C0576n.mo1900f(int):boolean");
    }
}
