package com.cootek.smartinput5.func.mainentrance;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.engine.Settings;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.mainentrance.b */
/* compiled from: CustomSkinItem */
public class C1847b extends C1853g implements Comparable<C1847b> {

    /* renamed from: j */
    private int f6152j;

    /* renamed from: k */
    private long f6153k = 0;

    public C1847b(Context context, int i) {
        super(context);
        this.f6152j = i;
    }

    /* renamed from: a */
    public boolean mo6914a(String str) {
        if (this.f6152j != Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER)) {
            return false;
        }
        return super.mo6914a(str);
    }

    /* renamed from: a */
    public void mo6911a(int i) {
        this.f6189i = 1;
    }

    /* renamed from: a */
    public int mo6909a() {
        return 1;
    }

    /* renamed from: b */
    public int mo6915b() {
        return this.f6152j;
    }

    /* renamed from: a */
    public void mo6912a(long j) {
        this.f6153k = j;
    }

    /* renamed from: c */
    public long mo6916c() {
        return this.f6153k;
    }

    /* renamed from: a */
    public int compareTo(C1847b bVar) {
        if (this.f6153k > bVar.mo6916c()) {
            return -1;
        }
        if (this.f6153k < bVar.mo6916c()) {
            return 1;
        }
        return this.f6152j - bVar.mo6915b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6913a(View view) {
        View findViewById;
        if (view != null && (findViewById = view.findViewById(R.id.skin_item_extra_mark)) != null) {
            findViewById.setVisibility(0);
            findViewById.setLayoutParams(new RelativeLayout.LayoutParams(this.f6187d, this.f6188e));
            findViewById.setBackgroundResource(R.drawable.skin_page_custom_mark_icon);
        }
    }
}
