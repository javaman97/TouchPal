package com.cootek.smartinput5.net.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.paopaopanel.SlidePage;
import com.cootek.smartinput5.func.paopaopanel.TouchPalHorizontalScrollView;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p045a.C1063f;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

public class TCloudShowActivity extends Activity implements TouchPalHorizontalScrollView.C1931c {

    /* renamed from: a */
    private static final String f10220a = "TCloudShowActivity";

    /* renamed from: c */
    private static final int[] f10221c = {R.drawable.touchpal_cloud_backup_sync, R.drawable.touchpal_cloud_cloud_prediction, R.drawable.touchpal_cloud_word_trend};

    /* renamed from: d */
    private static final int[] f10222d = {R.string.optpage_backup_sync_screen_title, R.string.optpage_cloud_prediction_title, R.string.optpage_live_words_title};

    /* renamed from: e */
    private static final int[] f10223e = {R.string.optpage_backup_sync_screen_summary, R.string.optpage_cloud_prediction_summary, R.string.optpage_live_words_summary};

    /* renamed from: f */
    private static final int f10224f = 3;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f10225b;

    /* renamed from: g */
    private TextView f10226g;

    /* renamed from: h */
    private SlidePage f10227h;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        requestWindowFeature(1);
        setContentView(R.layout.cloud_show_activity);
        this.f10225b = this;
        this.f10226g = (TextView) findViewById(R.id.login);
        m10636a();
        m10637b();
        if (this.f10225b != null) {
            C1246d.m6010a(this.f10225b).mo4591a("LOGIN/OPERATION", C1246d.f3774ar, C1246d.f3933e);
        }
    }

    /* renamed from: a */
    private void m10636a() {
        this.f10227h = (SlidePage) findViewById(R.id.touchpal_cloud_slide_wizard);
        this.f10227h.setPageListener(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f10225b.getResources().getDisplayMetrics().widthPixels, -1);
        for (int i = 0; i < 3; i++) {
            if (m10638b(i)) {
                LinearLayout c = m10639c(i);
                c.setLayoutParams(layoutParams);
                this.f10227h.mo7092a((View) c);
            }
        }
        this.f10227h.setIdentifierLayoutId(R.drawable.touchpal_cloud_slide_page_footer);
        this.f10227h.mo7090a();
    }

    /* renamed from: b */
    private boolean m10638b(int i) {
        if (!C1132b.m5662a()) {
            return true;
        }
        switch (i) {
            case 0:
                return C1132b.m5654a((Context) this).mo4392a(C1135d.OEM_SLIDE_WIZARD_CLOUD_BACKUP_SYNC, (Boolean) true).booleanValue();
            case 1:
                return C1132b.m5654a((Context) this).mo4392a(C1135d.OEM_SLIDE_WIZARD_CLOUD_PREDICTION, (Boolean) true).booleanValue();
            case 2:
                return C1132b.m5654a((Context) this).mo4392a(C1135d.OEM_SLIDE_WIZARD_WORD_TRENDS, (Boolean) true).booleanValue();
            default:
                return true;
        }
    }

    /* renamed from: c */
    private LinearLayout m10639c(int i) {
        String str = null;
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) this.f10225b.getSystemService("layout_inflater")).inflate(R.layout.touchpal_cloud_slide_wizard_page, (ViewGroup) null);
        ((ImageView) linearLayout.findViewById(R.id.slide_page_img)).setImageResource(f10221c[i]);
        String d = m10640d(f10222d[i]);
        String d2 = m10640d(f10223e[i]);
        if (d2 == null || !d2.startsWith(C1063f.f3053e)) {
            str = d2;
        }
        ((TextView) linearLayout.findViewById(R.id.touchpal_cloud_feature_title)).setText(d);
        ((TextView) linearLayout.findViewById(R.id.touchpal_cloud_feature_summary)).setText(str);
        return linearLayout;
    }

    /* renamed from: d */
    private String m10640d(int i) {
        return C1974m.m9063a((Context) this, i);
    }

    /* renamed from: a */
    public void mo4155a(int i) {
        if (this.f10227h != null) {
            this.f10227h.mo4155a(i);
        }
    }

    /* renamed from: b */
    private void m10637b() {
        this.f10226g.setOnClickListener(new C2340m(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f10227h.mo7094b();
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
