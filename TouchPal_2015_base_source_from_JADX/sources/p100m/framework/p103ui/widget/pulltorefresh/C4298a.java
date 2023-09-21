package p100m.framework.p103ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import p100m.framework.p103ui.widget.pulltorefresh.GroupListView;

/* renamed from: m.framework.ui.widget.pulltorefresh.a */
/* compiled from: GroupListView */
class C4298a extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ GroupListView f17502a;

    /* renamed from: b */
    private final /* synthetic */ GroupListView.C4296a f17503b;

    C4298a(GroupListView groupListView, GroupListView.C4296a aVar) {
        this.f17502a = groupListView;
        this.f17503b = aVar;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int[] a = m18018a(i);
        int i2 = a[0];
        int i3 = a[1];
        if (view == null) {
            GroupListView.C4297b bVar = new GroupListView.C4297b((GroupListView.C4297b) null);
            bVar.f17482a = new LinearLayout(viewGroup.getContext());
            bVar.f17482a.setOrientation(1);
            bVar.f17482a.setTag(bVar);
            if (i2 > -1) {
                if (i3 == -1) {
                    bVar.f17483b = this.f17503b.mo15991a(i2, bVar.f17483b, bVar.f17482a);
                    bVar.f17482a.addView(bVar.f17483b);
                } else if (i3 > -1) {
                    bVar.f17484c = this.f17503b.mo15990a(i2, i3, bVar.f17484c, bVar.f17482a);
                    bVar.f17482a.addView(bVar.f17484c);
                }
            }
            return bVar.f17482a;
        }
        GroupListView.C4297b bVar2 = (GroupListView.C4297b) view.getTag();
        if (i2 <= -1) {
            return view;
        }
        if (i3 == -1) {
            bVar2.f17483b = this.f17503b.mo15991a(i2, bVar2.f17483b, bVar2.f17482a);
            if (bVar2.f17484c == null) {
                return view;
            }
            bVar2.f17482a.removeView(bVar2.f17484c);
            return view;
        } else if (i3 <= -1) {
            return view;
        } else {
            bVar2.f17484c = this.f17503b.mo15990a(i2, i3, bVar2.f17484c, bVar2.f17482a);
            if (bVar2.f17483b == null) {
                return view;
            }
            bVar2.f17482a.removeView(bVar2.f17483b);
            return view;
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public Object getItem(int i) {
        int[] a = m18018a(i);
        int i2 = a[0];
        int i3 = a[1];
        if (i2 > -1) {
            if (i3 == -1) {
                return this.f17503b.mo15993a(i3);
            }
            if (i3 > -1) {
                return this.f17503b.mo15992a(i2, i3);
            }
        }
        return null;
    }

    /* renamed from: a */
    private int[] m18018a(int i) {
        int[] iArr = {-1, -2};
        int a = this.f17503b.mo15989a();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= a) {
                break;
            }
            int b = this.f17503b.mo15994b(i2) + 1;
            if (i3 + b > i) {
                iArr[0] = i2;
                iArr[1] = (i - i3) - 1;
                break;
            }
            i3 += b;
            i2++;
        }
        return iArr;
    }

    public int getCount() {
        int a = this.f17503b.mo15989a();
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            i += this.f17503b.mo15994b(i2) + 1;
        }
        return i;
    }
}
