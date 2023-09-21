package p100m.framework.p103ui.widget.pulltorefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

/* renamed from: m.framework.ui.widget.pulltorefresh.GroupListView */
public class GroupListView extends ListView {
    public GroupListView(Context context) {
        super(context);
    }

    public GroupListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAdapter(C4296a aVar) {
        C4298a aVar2 = new C4298a(this, aVar);
        aVar.m17988a((BaseAdapter) aVar2);
        super.setAdapter(aVar2);
    }

    /* renamed from: m.framework.ui.widget.pulltorefresh.GroupListView$b */
    private static class C4297b {

        /* renamed from: a */
        public LinearLayout f17482a;

        /* renamed from: b */
        public View f17483b;

        /* renamed from: c */
        public View f17484c;

        private C4297b() {
        }

        /* synthetic */ C4297b(C4297b bVar) {
            this();
        }
    }

    /* renamed from: m.framework.ui.widget.pulltorefresh.GroupListView$a */
    public static abstract class C4296a {

        /* renamed from: a */
        private BaseAdapter f17481a;

        /* renamed from: a */
        public abstract int mo15989a();

        /* renamed from: a */
        public abstract View mo15990a(int i, int i2, View view, ViewGroup viewGroup);

        /* renamed from: a */
        public abstract View mo15991a(int i, View view, ViewGroup viewGroup);

        /* renamed from: a */
        public abstract Object mo15992a(int i, int i2);

        /* renamed from: a */
        public abstract String mo15993a(int i);

        /* renamed from: b */
        public abstract int mo15994b(int i);

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17988a(BaseAdapter baseAdapter) {
            this.f17481a = baseAdapter;
        }

        /* renamed from: b */
        public void mo15995b() {
            this.f17481a.notifyDataSetChanged();
        }
    }
}
