package com.cootek.smartinput5.p066ui.control;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.cropimage.CropImageActivity;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;
import java.io.File;

/* renamed from: com.cootek.smartinput5.ui.control.GetImageActivity */
public class GetImageActivity extends C1976b {

    /* renamed from: a */
    public static final String f12654a = "GetImageActivity.EXTRA_IMAGE_FILE_PATH";

    /* renamed from: b */
    public static final String f12655b = "GetImageActivity.EXTRA_ASPECT_X";

    /* renamed from: c */
    public static final String f12656c = "GetImageActivity.EXTRA_ASPECT_Y";

    /* renamed from: d */
    public static final String f12657d = "GetImageActivity.EXTRA_IMAGE_MAX_HEIGHT";

    /* renamed from: e */
    public static final String f12658e = "GetImageActivity.EXTRA_IMAGE_MAX_WIDTH";

    /* renamed from: f */
    public static final String f12659f = "GetImageActivity.EXTRA_ACTION_AFTER_SUCCEED";

    /* renamed from: g */
    public static final String f12660g = "GetImageActivity.EXTRA_ACTION_ON_FINISHED";

    /* renamed from: h */
    public static final int f12661h = 1;

    /* renamed from: i */
    public static final int f12662i = 1;

    /* renamed from: j */
    private static final int f12663j = 0;

    /* renamed from: k */
    private static final int f12664k = 0;

    /* renamed from: l */
    private static final int f12665l = 0;

    /* renamed from: m */
    private static final int f12666m = 1;

    /* renamed from: n */
    private static final int f12667n = 2;

    /* renamed from: o */
    private String f12668o;

    /* renamed from: p */
    private long f12669p;

    /* renamed from: q */
    private int f12670q;

    /* renamed from: r */
    private int f12671r;

    /* renamed from: s */
    private int f12672s;

    /* renamed from: t */
    private int f12673t;

    /* renamed from: u */
    private int f12674u;

    /* renamed from: v */
    private int f12675v;

    /* renamed from: w */
    private String f12676w = "";

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f12668o = getIntent().getStringExtra(f12654a);
        if (TextUtils.isEmpty(this.f12668o)) {
            finish();
            return;
        }
        this.f12669p = new File(this.f12668o).lastModified();
        this.f12676w = "temp_pic_" + System.currentTimeMillis();
        this.f12670q = getIntent().getIntExtra(f12655b, 0);
        this.f12671r = getIntent().getIntExtra(f12656c, 0);
        this.f12672s = getIntent().getIntExtra(f12658e, 0);
        this.f12673t = getIntent().getIntExtra(f12657d, 0);
        this.f12674u = getIntent().getIntExtra(f12659f, 0);
        this.f12675v = getIntent().getIntExtra(f12660g, 0);
        if (m12935b() && m12936c()) {
            int i = (this.f12672s * this.f12671r) / this.f12670q;
            int i2 = (this.f12673t * this.f12670q) / this.f12671r;
            if (this.f12672s == 0) {
                this.f12672s = i2;
            } else if (this.f12673t == 0) {
                this.f12673t = i;
            } else if (i > this.f12673t) {
                this.f12672s = i2;
            } else if (i2 > this.f12672s) {
                this.f12673t = i;
            }
        }
        m12939f();
        m12933a();
    }

    /* renamed from: a */
    private void m12933a() {
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        aVar.setTitle(getResString(R.string.get_image_dialog_title));
        aVar.setItems(new String[]{getResString(R.string.get_image_dialog_camera), getResString(R.string.get_image_dialog_gallery)}, new C2879w(this));
        aVar.setOnCancelListener(new C2880x(this));
        aVar.show();
    }

    /* renamed from: b */
    private boolean m12935b() {
        return this.f12670q > 0 && this.f12671r > 0;
    }

    /* renamed from: c */
    private boolean m12936c() {
        return this.f12673t > 0 || this.f12672s > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public File m12937d() {
        File a = C1358O.m6234a(C1358O.f4201l);
        if (a != null) {
            return new File(a, this.f12676w);
        }
        return null;
    }

    /* renamed from: a */
    private void m12934a(Uri uri) {
        Intent intent = new Intent(this, CropImageActivity.class);
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", this.f12670q);
        intent.putExtra("aspectY", this.f12671r);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("return-data", false);
        intent.setFlags(1073741824);
        File file = new File(this.f12668o);
        if (file != null) {
            intent.putExtra("output", Uri.fromFile(file));
        }
        startActivityForResult(intent, 2);
    }

    /* renamed from: e */
    private void m12938e() {
        int i;
        boolean z;
        int i2;
        if (m12936c()) {
            System.gc();
            Bitmap decodeFile = BitmapFactory.decodeFile(this.f12668o, C1584bI.m7144b(new File(this.f12668o)));
            if (decodeFile != null) {
                int width = decodeFile.getWidth();
                int height = decodeFile.getHeight();
                if (width <= this.f12672s || this.f12672s <= 0) {
                    i = width;
                    z = false;
                } else {
                    i = this.f12672s;
                    z = true;
                }
                if (height <= this.f12673t || this.f12673t <= 0) {
                    i2 = height;
                } else {
                    i2 = this.f12673t;
                    z = true;
                }
                if (z) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, i, i2, false);
                    C0997e.m5184a(createScaledBitmap, new File(this.f12668o), Bitmap.CompressFormat.JPEG);
                    createScaledBitmap.recycle();
                }
            }
        }
    }

    /* renamed from: f */
    private void m12939f() {
        File d = m12937d();
        if (d != null && d.exists()) {
            d.delete();
        }
    }

    /* renamed from: g */
    private void m12940g() {
        if (this.f12669p != new File(this.f12668o).lastModified() && this.f12674u == 1) {
            C1368X.m6320c().mo5841n().mo6244A();
            Settings.getInstance().setStringSetting(80, C1602bh.f5115d);
            C1368X.m6320c().mo5841n().mo6258a(C1602bh.f5115d, true, true);
        }
    }

    public void finish() {
        m12938e();
        if (this.f12675v == 1) {
            new Handler().postDelayed(new C2881y(this), 200);
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m12939f();
        super.onDestroy();
        System.gc();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        System.gc();
        switch (i) {
            case 0:
                File d = m12937d();
                if (d == null || !d.exists()) {
                    finish();
                    return;
                } else if (m12935b()) {
                    m12934a(Uri.fromFile(d));
                    return;
                } else {
                    C0997e.m5173a(d, new File(this.f12668o));
                    m12940g();
                    finish();
                    return;
                }
            case 1:
                if (intent == null) {
                    finish();
                    return;
                } else if (m12935b()) {
                    m12934a(intent.getData());
                    return;
                } else {
                    C0997e.m5173a(new File(intent.getData().getPath()), new File(this.f12668o));
                    m12940g();
                    finish();
                    return;
                }
            case 2:
                if (i2 == -1 || intent != null) {
                    m12940g();
                }
                finish();
                return;
            default:
                return;
        }
    }
}
