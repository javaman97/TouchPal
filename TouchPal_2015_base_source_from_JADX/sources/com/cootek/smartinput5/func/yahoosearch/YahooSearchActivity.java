package com.cootek.smartinput5.func.yahoosearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchActivity;
import com.yahoo.mobile.client.share.search.p099ui.activity.SearchToLinkActivity;

public class YahooSearchActivity extends SearchToLinkActivity {

    /* renamed from: o */
    private static final int f9057o = 0;

    /* renamed from: p */
    private static final int f9058p = 1;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ImageView f9059q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public AnimationDrawable f9060r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Drawable f9061s;

    /* renamed from: t */
    private EditText f9062t;

    /* renamed from: u */
    private View f9063u;

    /* renamed from: v */
    private Handler f9064v = new C2139s(this);

    public void onCreate(Bundle bundle) {
        C2137q.m9700a((Context) this).mo7536a();
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        C2137q.m9700a((Context) this).mo7537a((Activity) this);
        this.f9059q = (ImageView) findViewById(R.id.cat_view);
        this.f9060r = (AnimationDrawable) getResources().getDrawable(R.drawable.cat_anim);
        this.f9061s = getResources().getDrawable(R.drawable.cat_one_claw);
    }

    public void setContentView(int i) {
        requestWindowFeature(7);
        super.setContentView(i);
        getWindow().setFeatureInt(7, R.layout.search_activity_title);
        ((ViewGroup) findViewById(16908290)).getChildAt(0).setBackgroundColor(-1);
    }

    public void setContentView(View view) {
        requestWindowFeature(7);
        super.setContentView(view);
        getWindow().setFeatureInt(7, R.layout.search_activity_title);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        requestWindowFeature(7);
        super.setContentView(view, layoutParams);
        getWindow().setFeatureInt(7, R.layout.search_activity_title);
    }

    public void onResume() {
        super.onResume();
        this.f9064v.removeMessages(1);
        this.f9064v.sendEmptyMessage(0);
        this.f9064v.sendEmptyMessageDelayed(1, 2100);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (this.f9062t == null) {
                this.f9062t = (EditText) findViewById(R.id.search_text);
            }
            if (TextUtils.isEmpty(this.f9062t.getText().toString())) {
                this.f9062t.setFocusable(true);
                this.f9062t.setFocusableInTouchMode(true);
                this.f9062t.requestFocus();
                this.f9062t.post(new C2140t(this));
            }
            if (this.f9063u == null) {
                this.f9063u = findViewById(R.id.close);
            }
            this.f9063u.setOnClickListener(new C2141u(this));
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra(SearchActivity.QUERY_STRING);
        if (stringExtra != null) {
            if (this.f9062t == null) {
                this.f9062t = (EditText) findViewById(R.id.search_text);
            }
            this.f9062t.setText(stringExtra);
        }
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
