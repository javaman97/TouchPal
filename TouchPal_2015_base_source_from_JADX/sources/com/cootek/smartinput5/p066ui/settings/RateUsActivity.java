package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1626bx;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.func.share.C1979a;
import com.cootek.smartinput5.func.share.C1985g;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: com.cootek.smartinput5.ui.settings.RateUsActivity */
public class RateUsActivity extends C1976b {

    /* renamed from: a */
    public static final String f13612a = "fromNotification";

    /* renamed from: b */
    protected boolean f13613b = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f13614c;

    /* renamed from: d */
    private String f13615d = ".jpeg";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13614c = this;
        requestWindowFeature(1);
        setContentView(R.layout.rate_us);
        C1368X.m6317b((Context) this);
        m13958c();
        m13957b();
        if (C1368X.m6324d()) {
            C1246d.m6010a(this.f13614c).mo4591a("RATE_US/PAGE/", "SHOW", C1246d.f3836c);
            Intent intent = getIntent();
            if (intent != null && intent.getBooleanExtra("fromNotification", false)) {
                C1246d.m6010a(this.f13614c).mo4591a("RATE_US/NOTIFICATION", "CLICK", C1246d.f3836c);
            }
        }
    }

    /* renamed from: b */
    private void m13957b() {
        TextView textView = (TextView) findViewById(R.id.efficiency_txt_content);
        TextView textView2 = (TextView) findViewById(R.id.corrected_txt_content);
        TextView textView3 = (TextView) findViewById(R.id.strokes_txt_content);
        C1626bx I = C1368X.m6320c().mo5823I();
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.getDefault());
        if (I != null) {
            textView2.setText(numberInstance.format(I.mo6386d()));
            long c = I.mo6385c();
            textView3.setText(numberInstance.format(c));
            textView.setText("+" + new DecimalFormat("#%").format((double) m13955a(c, I.mo6391i())));
        }
    }

    /* renamed from: a */
    private float m13955a(long j, long j2) {
        if (j2 != 0) {
            return ((float) j) / ((float) j2);
        }
        return 0.0f;
    }

    /* renamed from: c */
    private void m13958c() {
        ((LinearLayout) findViewById(R.id.rate_us_area)).setOnClickListener(new C3066bW(this));
        Button button = (Button) findViewById(R.id.rate_us_btn_rate);
        if (C1979a.m9109a()) {
            button.setText(C1974m.m9063a(this.f13614c, (int) R.string.share));
        }
        button.setOnClickListener(new C3067bX(this, button));
        ((ImageButton) findViewById(R.id.rate_us_back_btn)).setOnClickListener(new C3068bY(this));
        ((ImageButton) findViewById(R.id.rate_us_btn_share)).setOnClickListener(new C3069bZ(this));
        ((Button) findViewById(R.id.rate_us_btn_later)).setOnClickListener(new C3132ca(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9955a() {
        View findViewById = findViewById(R.id.rate_us_share_frame);
        findViewById.setDrawingCacheEnabled(true);
        Uri uri = null;
        try {
            File file = new File(C1358O.m6234a(C1358O.f4201l), C1358O.f4210u + String.valueOf(System.currentTimeMillis()) + this.f13615d);
            if (file.exists()) {
                file.delete();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            findViewById.getDrawingCache().compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            findViewById.destroyDrawingCache();
            findViewById.setDrawingCacheEnabled(false);
            if (file.exists()) {
                uri = Uri.fromFile(file);
            }
        } catch (Exception e) {
        }
        C1985g.m9133a(this, getResString(R.string.share), getResString(R.string.rate_us_share), uri);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f13613b = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }
}
