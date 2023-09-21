package com.yahoo.mobile.client.share.search.suggest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.yahoo.mobile.client.share.search.suggest.g */
public final class C4156g {

    /* renamed from: a */
    private final Context f16899a;

    /* renamed from: b */
    private final int f16900b;

    /* renamed from: c */
    private final Queue<View> f16901c = new LinkedList();

    public C4156g(Context context, int i) {
        this.f16899a = context;
        this.f16900b = i;
    }

    /* renamed from: a */
    public final View mo15478a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return View.inflate(this.f16899a, this.f16900b, (ViewGroup) null);
        }
        while (viewGroup.getChildCount() != 0) {
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeViewAt(0);
            this.f16901c.add(childAt);
        }
        return viewGroup;
    }

    /* renamed from: a */
    public final View mo15477a() {
        return this.f16901c.poll();
    }
}
