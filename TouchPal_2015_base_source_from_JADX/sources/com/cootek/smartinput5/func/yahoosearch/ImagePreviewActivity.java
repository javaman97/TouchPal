package com.cootek.smartinput5.func.yahoosearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Gallery;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.yahoosearch.p063ui.C2151f;
import com.cootek.smartinput5.func.yahoosearch.p063ui.SearchTabView;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import java.util.ArrayList;

public class ImagePreviewActivity extends C2135o {

    /* renamed from: a */
    public static final String f9045a = "com.cootek.smartinput5.func.yahoosearch.ImagePreviewActivity.EXTRA_QUERY";

    /* renamed from: b */
    public static final String f9046b = "com.cootek.smartinput5.func.yahoosearch.ImagePreviewActivity.EXTRA_IMAGES";

    /* renamed from: c */
    public static final String f9047c = "com.cootek.smartinput5.func.yahoosearch.ImagePreviewActivity.EXTRA_POSITION";

    /* renamed from: m */
    private static final String f9048m = " | ";
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ArrayList<PhotoData> f9049n;

    /* renamed from: o */
    private Gallery f9050o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f9051p;

    /* renamed from: q */
    private RelativeLayout f9052q;

    /* renamed from: r */
    private SearchTabView f9053r;

    /* renamed from: s */
    private SearchTabView f9054s;

    /* renamed from: t */
    private SearchTabView f9055t;

    /* renamed from: u */
    private SearchTabView f9056u;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(7);
        setContentView(R.layout.image_previewer_layout);
        getWindow().setFeatureInt(7, R.layout.browser_activity_title);
        C1368X.m6317b((Context) this);
        C2137q.m9700a((Context) this).mo7537a((Activity) this);
        Intent intent = getIntent();
        this.f9049n = intent.getParcelableArrayListExtra(f9046b);
        this.f9051p = intent.getIntExtra(f9047c, 0);
        this.f9050o = (Gallery) findViewById(R.id.gallery);
        this.f9050o.setAdapter(new C2151f(this, this.f9049n));
        this.f9050o.setSelection(this.f9051p);
        this.f9050o.setOnItemSelectedListener(new C2128h(this));
        this.f9052q = (RelativeLayout) findViewById(R.id.browser_button_frame);
        mo7502a();
        m9694b();
    }

    /* renamed from: b */
    private void m9694b() {
        this.f9054s = (SearchTabView) this.f9052q.findViewWithTag("back");
        this.f9054s.setOnClickListener(new C2129i(this));
        this.f9053r = (SearchTabView) this.f9052q.findViewWithTag("share");
        this.f9053r.setOnClickListener(new C2130j(this));
        this.f9055t = (SearchTabView) this.f9052q.findViewWithTag(C1246d.f3816bg);
        this.f9055t.setOnClickListener(new C2131k(this));
        this.f9056u = (SearchTabView) this.f9052q.findViewWithTag("save");
        this.f9056u.setOnClickListener(new C2132l(this));
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.search_open, R.anim.search_close);
    }

    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }
}
