package com.cootek.smartinput5.p066ui.settings;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Toast;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.cropimage.CropImageActivity;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1345G;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p066ui.C2726bF;
import com.cootek.smartinput5.p066ui.C2787cK;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.settings.C3013aa;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.settings.SkinCustomizeActivity */
public class SkinCustomizeActivity extends C1976b implements C3013aa.C3015b {
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static boolean f13656R = false;

    /* renamed from: a */
    public static final String f13657a = "SkinCustomizeActivity.EXTRA_CUSTOM_SKIN_SET";

    /* renamed from: b */
    public static final String f13658b = "SkinCustomizeActivity.EXTRA_IMAGE_FILE_PATH";

    /* renamed from: c */
    public static final String f13659c = "SkinCustomizeActivity.EXTRA_IMAGE_TEMP_FILE_PATH";

    /* renamed from: d */
    public static final String f13660d = "SkinCustomizeActivity.EXTRA_STRING_IMAGE_PREIVEW_FILE_PATH";

    /* renamed from: e */
    public static final String f13661e = "SkinCustomizeActivity.EXTRA_ASPECT_X";

    /* renamed from: f */
    public static final String f13662f = "SkinCustomizeActivity.EXTRA_ASPECT_Y";

    /* renamed from: g */
    public static final String f13663g = "SkinCustomizeActivity.EXTRA_IMAGE_MAX_HEIGHT";

    /* renamed from: h */
    public static final String f13664h = "SkinCustomizeActivity.EXTRA_IMAGE_MAX_WIDTH";

    /* renamed from: i */
    public static final String f13665i = "SkinCustomizeActivity.EXTRA_BOOLEAN_CREATE_NEW";

    /* renamed from: j */
    public static final int f13666j = 1;

    /* renamed from: k */
    protected static final String f13667k = null;

    /* renamed from: l */
    private static final int f13668l = 0;

    /* renamed from: m */
    private static final int f13669m = 1;

    /* renamed from: n */
    private static final int f13670n = 2;

    /* renamed from: A */
    private CustomSkinBtn f13671A;

    /* renamed from: B */
    private CustomSkinBtn f13672B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public SeekBar f13673C;

    /* renamed from: D */
    private ImageView f13674D;

    /* renamed from: E */
    private EditText f13675E;

    /* renamed from: F */
    private boolean f13676F;

    /* renamed from: G */
    private int f13677G;

    /* renamed from: H */
    private int f13678H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public Drawable f13679I;

    /* renamed from: J */
    private String f13680J;

    /* renamed from: K */
    private String f13681K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f13682L;

    /* renamed from: M */
    private String f13683M = null;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public int f13684N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f13685O = true;

    /* renamed from: P */
    private boolean f13686P = false;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f13687Q = false;

    /* renamed from: S */
    private String f13688S;

    /* renamed from: T */
    private ArrayList<Integer> f13689T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public SoftKeyboardView f13690U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public FunctionBar f13691V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public View f13692W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C2826E f13693X;

    /* renamed from: Y */
    private Bitmap f13694Y;

    /* renamed from: o */
    private String f13695o;

    /* renamed from: p */
    private int f13696p;

    /* renamed from: q */
    private int f13697q;

    /* renamed from: r */
    private int f13698r;

    /* renamed from: s */
    private int f13699s;

    /* renamed from: t */
    private String f13700t = "";

    /* renamed from: u */
    private Context f13701u;

    /* renamed from: v */
    private LinearLayout f13702v;

    /* renamed from: w */
    private ImageButton f13703w;

    /* renamed from: x */
    private Button f13704x;

    /* renamed from: y */
    private Button f13705y;

    /* renamed from: z */
    private CustomSkinBtn f13706z;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13685O = true;
        f13656R = true;
        C1602bh n = C1368X.m6320c().mo5841n();
        Settings instance = Settings.getInstance();
        this.f13676F = getIntent().getBooleanExtra(f13665i, true);
        this.f13677G = instance.getIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER);
        this.f13678H = getIntent().getIntExtra(f13657a, 0);
        Settings.getInstance().setIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER, this.f13678H);
        this.f13695o = getIntent().getStringExtra(f13658b);
        this.f13680J = getIntent().getStringExtra(f13659c);
        this.f13681K = getIntent().getStringExtra(f13660d);
        String str = C1602bh.f5131t + this.f13678H;
        if (this.f13676F) {
            this.f13684N = getResources().getInteger(R.integer.CUSTOM_SKIN_ALPHA);
            this.f13683M = getResources().getString(R.string.CUSTOM_SKIN_COLOR_SET);
            this.f13682L = getResources().getInteger(R.integer.CUSTOM_SKIN_BACKGROUND_COLOR);
        } else if (this.f13678H > 0) {
            this.f13684N = instance.getIntSetting(Settings.CUSTOM_SKIN_ALPHA, 28, str, (Config) null);
            this.f13683M = instance.getStringSetting(Settings.CUSTOM_SKIN_COLOR_SET, 28, str, (Config) null);
            this.f13682L = instance.getIntSetting(Settings.CUSTOM_SKIN_BACKGROUND_COLOR);
        } else {
            this.f13684N = instance.getIntSetting(Settings.CUSTOM_SKIN_ALPHA);
            this.f13683M = instance.getStringSetting(Settings.CUSTOM_SKIN_COLOR_SET);
            this.f13682L = instance.getIntSetting(Settings.CUSTOM_SKIN_BACKGROUND_COLOR);
        }
        this.f13688S = n.mo6288n().getPackageName();
        if (TextUtils.isEmpty(this.f13695o) || TextUtils.isEmpty(this.f13680J)) {
            finish();
            return;
        }
        File file = new File(this.f13695o);
        new File(this.f13680J).delete();
        this.f13700t = "temp_pic_" + System.currentTimeMillis();
        this.f13696p = getIntent().getIntExtra(f13661e, 0);
        this.f13697q = getIntent().getIntExtra(f13662f, 0);
        this.f13698r = getIntent().getIntExtra(f13664h, 0);
        this.f13699s = getIntent().getIntExtra(f13663g, 0);
        if ((file != null && !n.mo6300v()) || this.f13676F) {
            m14011a(file);
        }
        requestWindowFeature(1);
        setContentView(R.layout.custom_skin_layout);
        this.f13703w = (ImageButton) findViewById(R.id.custom_skin_back);
        this.f13702v = (LinearLayout) findViewById(R.id.custom_skin_option_layout);
        this.f13704x = (Button) findViewById(R.id.custom_skin_cancel_btn);
        this.f13705y = (Button) findViewById(R.id.custom_skin_save_btn);
        m14035k();
        m14037l();
        m14039m();
        m14040n();
        this.f13674D = (ImageView) findViewById(R.id.custom_skin_preview_image);
        this.f13675E = (EditText) findViewById(R.id.custom_skin_hidden_edit);
    }

    /* renamed from: a */
    public static boolean m14013a() {
        return f13656R;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        f13656R = true;
        m14046t();
        Settings.getInstance().enableTemporarySettingMode(m14047u());
        m14043q();
        C1602bh n = C1368X.m6320c().mo5841n();
        Settings.getInstance().setIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER, this.f13678H);
        Settings.getInstance().setStringSetting(80, C1602bh.f5115d);
        n.mo6259a(C1602bh.f5115d, true, true, true);
        if (this.f13685O) {
            m14045s();
            new Handler().postDelayed(new C3107cB(this), 100);
        }
    }

    public void onStop() {
        m14044r();
        Settings.getInstance().disableTemporarySettingMode();
        if (!this.f13686P) {
            if (Engine.isInitialized()) {
                ((TouchPalIME) Engine.getInstance().getIms()).hideWindow();
            }
            Settings.getInstance().setIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER, this.f13677G);
            Settings.getInstance().setStringSetting(80, this.f13688S);
            C1368X.m6320c().mo5841n().mo6259a(this.f13688S, true, true, true);
        }
        this.f13685O = true;
        f13656R = false;
        super.onStop();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if ((i != 4 || keyEvent.getRepeatCount() != 0) && i != 3) {
            return super.onKeyDown(i, keyEvent);
        }
        m14042p();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m14019c() {
        int width = this.f13692W.getWidth();
        int height = this.f13692W.getHeight();
        C1368X.m6320c().mo5841n().mo6281j(this.f13684N);
        if (width > 0 && height > 0) {
            this.f13694Y = null;
            System.gc();
            try {
                this.f13694Y = (Bitmap) new WeakReference(Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)).get();
                Canvas canvas = new Canvas(this.f13694Y);
                if (this.f13679I != null) {
                    this.f13679I.setBounds(0, 0, width, height);
                    this.f13679I.draw(canvas);
                } else if (this.f13682L != 0) {
                    Paint paint = new Paint();
                    paint.setColor(this.f13682L);
                    canvas.drawRect(new Rect(0, 0, width, height), paint);
                }
                this.f13674D.setImageBitmap(this.f13694Y);
            } catch (OutOfMemoryError e) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public synchronized void m14021d() {
        if (this.f13685O) {
            if (!(this.f13692W == null || this.f13693X == null || this.f13691V == null || this.f13690U == null || !Engine.isInitialized())) {
                C1368X.m6320c().mo5841n().mo6281j(this.f13684N);
                C1368X.m6320c().mo5841n().mo6295q(this.f13683M);
                C2726bF.m12512d();
                C2787cK.m12705c();
                int width = this.f13692W.getWidth();
                int height = this.f13692W.getHeight();
                this.f13694Y = null;
                System.gc();
                try {
                    this.f13694Y = (Bitmap) new WeakReference(Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565)).get();
                    Canvas canvas = new Canvas(this.f13694Y);
                    if (this.f13679I != null) {
                        this.f13679I.setBounds(0, 0, width, height);
                        this.f13679I.draw(canvas);
                    } else if (this.f13682L != 0) {
                        Paint paint = new Paint();
                        paint.setColor(this.f13682L);
                        canvas.drawRect(new Rect(0, 0, width, height), paint);
                    }
                    canvas.translate(0.0f, 0.0f);
                    this.f13691V.mo8533a(canvas);
                    canvas.translate(0.0f, (float) this.f13691V.getHeight());
                    this.f13690U.mo8727a(canvas);
                    this.f13674D.setImageBitmap(this.f13694Y);
                } catch (OutOfMemoryError e) {
                }
            }
        }
    }

    /* renamed from: e */
    private boolean m14024e() {
        File file = new File(this.f13695o);
        if (this.f13679I != null) {
            C0997e.m5173a(new File(this.f13680J), file);
        } else if (this.f13682L == 0) {
            return false;
        } else {
            m14011a(file);
        }
        File file2 = new File(this.f13681K);
        if (this.f13694Y != null) {
            C0997e.m5184a(this.f13694Y, file2, Bitmap.CompressFormat.JPEG);
        }
        C1602bh n = C1368X.m6320c().mo5841n();
        Settings instance = Settings.getInstance();
        String str = C1602bh.f5131t + this.f13678H;
        if (this.f13683M == null || C1345G.m6154a(this.f13683M) == null) {
            return false;
        }
        if (this.f13678H > 0) {
            instance.setStringSetting(Settings.CUSTOM_SKIN_COLOR_SET, this.f13683M, 28, str, (Config) null, true);
        } else {
            instance.setStringSetting(Settings.CUSTOM_SKIN_COLOR_SET, this.f13683M);
        }
        instance.setStringSetting(80, C1602bh.f5115d);
        if (this.f13678H > 0) {
            instance.setIntSetting(Settings.CUSTOM_SKIN_ALPHA, this.f13684N, 28, str, (Config) null, true);
        } else {
            instance.setIntSetting(Settings.CUSTOM_SKIN_ALPHA, this.f13684N);
        }
        if (this.f13682L != 0) {
            instance.setIntSetting(Settings.CUSTOM_SKIN_BACKGROUND_COLOR, this.f13682L);
        }
        Settings.getInstance().setIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER, this.f13678H, true);
        return n.mo6259a(C1602bh.f5115d, true, true, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m14025f() {
        Toast.makeText(this, C1974m.m9063a((Context) this, (int) R.string.custom_skin_saving), 1).show();
        this.f13686P = m14024e();
        if (!this.f13686P) {
            Settings.getInstance().setIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER, this.f13677G);
            Settings.getInstance().setStringSetting(80, f13667k);
            C1368X.m6320c().mo5841n().mo6259a(f13667k, true, true, true);
        } else {
            Intent intent = new Intent();
            intent.putExtra(f13657a, this.f13678H);
            intent.putExtra(f13665i, this.f13676F);
            setResult(-1, intent);
        }
        finish();
        new Handler().postDelayed(new C3113cH(this), 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public File m14027g() {
        File a = C1358O.m6234a(C1358O.f4201l);
        if (a != null) {
            return new File(a, this.f13700t);
        }
        return null;
    }

    /* renamed from: a */
    private void m14009a(Uri uri) {
        Intent intent = new Intent(this, CropImageActivity.class);
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", this.f13696p);
        intent.putExtra("aspectY", this.f13697q);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("return-data", false);
        intent.setFlags(1073741824);
        File file = new File(this.f13680J);
        if (file != null) {
            intent.putExtra("output", Uri.fromFile(file));
        }
        startActivityForResult(intent, 2);
    }

    /* renamed from: h */
    private boolean m14030h() {
        return this.f13696p > 0 && this.f13697q > 0;
    }

    /* renamed from: i */
    private void m14032i() {
        this.f13679I = Drawable.createFromPath(this.f13680J);
        this.f13682L = 0;
        this.f13687Q = true;
        this.f13685O = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14012a(String str) {
        this.f13683M = str;
        this.f13685O = true;
        m14021d();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        System.gc();
        switch (i) {
            case 0:
                File g = m14027g();
                if (g != null && g.exists()) {
                    if (m14030h()) {
                        this.f13685O = false;
                        m14009a(Uri.fromFile(g));
                        return;
                    }
                    this.f13680J = g.getAbsolutePath();
                    m14032i();
                    return;
                }
                return;
            case 1:
                if (intent == null) {
                    return;
                }
                if (m14030h()) {
                    this.f13685O = false;
                    m14009a(intent.getData());
                    return;
                }
                this.f13680J = intent.getData().getPath();
                m14032i();
                return;
            case 2:
                if (i2 == -1 || intent != null) {
                    m14032i();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo9983a(int i) {
        this.f13679I = null;
        this.f13682L = i;
        this.f13687Q = true;
        this.f13685O = true;
        m14021d();
    }

    /* renamed from: j */
    private View m14034j() {
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.skin_page_divider_width));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.custom_skin_setting_item_padding);
        layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
        view.setLayoutParams(layoutParams);
        view.setBackgroundResource(R.color.custom_skin_divider_color);
        return view;
    }

    /* renamed from: k */
    private void m14035k() {
        LayoutInflater from = LayoutInflater.from(this);
        CustomSkinItem customSkinItem = (CustomSkinItem) from.inflate(R.layout.custom_skin_item_layout, (ViewGroup) null);
        customSkinItem.setTitleText(R.string.customize_skin_set_background);
        customSkinItem.setContentCount(3);
        this.f13706z = (CustomSkinBtn) from.inflate(R.layout.custom_skin_btn_layout, (ViewGroup) null);
        this.f13706z.setText(R.string.customize_skin_choose_photo);
        this.f13706z.setIcon(R.drawable.btn_custom_skin_photo);
        this.f13671A = (CustomSkinBtn) from.inflate(R.layout.custom_skin_btn_layout, (ViewGroup) null);
        this.f13671A.setText(R.string.customize_skin_choose_gallery);
        this.f13671A.setIcon(R.drawable.btn_custom_skin_gallery);
        this.f13672B = (CustomSkinBtn) from.inflate(R.layout.custom_skin_btn_layout, (ViewGroup) null);
        this.f13672B.setText(R.string.customize_skin_choose_color);
        this.f13672B.setIcon(R.drawable.btn_custom_skin_color);
        customSkinItem.mo9792a(this.f13706z);
        customSkinItem.mo9792a(this.f13671A);
        customSkinItem.mo9792a(this.f13672B);
        this.f13702v.addView(customSkinItem);
        this.f13702v.addView(m14034j());
    }

    /* renamed from: l */
    private void m14037l() {
        CustomSkinItem customSkinItem = (CustomSkinItem) LayoutInflater.from(this).inflate(R.layout.custom_skin_item_layout, (ViewGroup) null);
        customSkinItem.setTitleText(R.string.customize_skin_set_color);
        customSkinItem.setContentCount(r3);
        for (C1345G g : C1345G.values()) {
            SquareColorItem squareColorItem = new SquareColorItem(this);
            String name = g.name();
            int color = getResources().getColor(g.mo5588a());
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.custom_skin_color_size);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.custom_skin_color_padding);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, dimensionPixelSize, 1.0f);
            layoutParams.leftMargin = dimensionPixelSize2;
            layoutParams.rightMargin = dimensionPixelSize2;
            squareColorItem.setLayoutParams(layoutParams);
            squareColorItem.setBackgroundColor(color);
            squareColorItem.setOnClickListener(new C3114cI(this, name));
            customSkinItem.mo9792a(squareColorItem);
        }
        this.f13702v.addView(customSkinItem);
        this.f13702v.addView(m14034j());
    }

    /* renamed from: m */
    private void m14039m() {
        LayoutInflater from = LayoutInflater.from(this);
        CustomSkinItem customSkinItem = (CustomSkinItem) from.inflate(R.layout.custom_skin_item_layout, (ViewGroup) null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        customSkinItem.setTitleText(R.string.customize_skin_set_transparency);
        this.f13673C = (SeekBar) from.inflate(R.layout.custom_skin_alpha_bar, (ViewGroup) null);
        this.f13673C.setLayoutParams(layoutParams);
        customSkinItem.mo9792a(this.f13673C);
        this.f13702v.addView(customSkinItem);
        this.f13702v.addView(m14034j());
    }

    /* renamed from: n */
    private void m14040n() {
        this.f13706z.setOnClickListener(new C3115cJ(this));
        this.f13671A.setOnClickListener(new C3116cK(this));
        this.f13672B.setOnClickListener(new C3117cL(this));
        this.f13673C.setProgress(this.f13684N);
        this.f13673C.setOnSeekBarChangeListener(new C3118cM(this));
        this.f13703w.setOnClickListener(new C3119cN(this));
        this.f13705y.setOnClickListener(new C3120cO(this));
        this.f13704x.setOnClickListener(new C3109cD(this));
        ((RelativeLayout) findViewById(R.id.custom_skin_title)).setOnTouchListener(new C3110cE(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m14041o() {
        this.f13686P = false;
        if (this.f13676F) {
            File file = new File(this.f13695o);
            if (file.exists()) {
                file.delete();
            }
        }
        Settings.getInstance().disableTemporarySettingMode();
        Settings.getInstance().setIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER, this.f13677G);
        Settings.getInstance().setStringSetting(80, this.f13688S);
        C1368X.m6320c().mo5841n().mo6259a(this.f13688S, true, true, true);
        finish();
    }

    /* renamed from: p */
    private void m14042p() {
        new AlertDialog.Builder(this).setTitle((CharSequence) null).setMessage(getResString(R.string.customize_skin_quit_message)).setNegativeButton(getResString(R.string.no), new C3112cG(this)).setPositiveButton(getResString(R.string.yes), new C3111cF(this)).show();
    }

    /* renamed from: a */
    private void m14011a(File file) {
        int i = this.f13698r / this.f13696p;
        int i2 = this.f13699s / this.f13697q;
        if (i >= i2) {
            i = i2;
        }
        int i3 = this.f13696p * i;
        int i4 = i * this.f13697q;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(this.f13682L);
        canvas.drawRect(new Rect(0, 0, i3, i4), paint);
        C0997e.m5184a(createBitmap, file, Bitmap.CompressFormat.JPEG);
    }

    /* renamed from: q */
    private void m14043q() {
        Settings instance = Settings.getInstance();
        if (!TextUtils.isEmpty(C1549b.f4791a)) {
            if (!instance.isLanguageEnabled(C1549b.f4791a)) {
                instance.setLanguageEnabled(C1549b.f4791a, true);
            }
            instance.setStringSetting(10, C1549b.f4791a);
            instance.setStringSetting(11, C1549b.f4791a);
        }
        m14008a(2, C1549b.f4791a);
        Settings.getInstance().setBoolSetting(Settings.ONE_HANDED_LAYOUT, false);
        instance.setIntSetting(Settings.KEYBOARD_HEIGHT_NORMAL, -1);
        if (Engine.isInitialized()) {
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            widgetManager.mo9630ad().mo9247e();
            widgetManager.mo9631ae();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m14044r() {
    }

    /* renamed from: a */
    private void m14008a(int i, String str) {
        Settings.getInstance().setIntSetting(3, i, 1, C1368X.m6320c().mo5835h().getLanguageCategory(str, 1), (Config) null, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m14045s() {
        this.f13675E.setFocusable(true);
        this.f13675E.setFocusableInTouchMode(true);
        this.f13675E.requestFocus();
        ((InputMethodManager) getSystemService("input_method")).showSoftInput(this.f13675E, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m14046t() {
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f13675E.getWindowToken(), 0);
        this.f13675E.setFocusable(false);
    }

    /* renamed from: u */
    private ArrayList<Integer> m14047u() {
        this.f13689T = new ArrayList<>();
        this.f13689T.add(80);
        this.f13689T.add(Integer.valueOf(Settings.CUSTOM_SKIN_ALPHA));
        this.f13689T.add(Integer.valueOf(Settings.CUSTOM_SKIN_COLOR_SET));
        this.f13689T.add(Integer.valueOf(Settings.CUSTOM_SKIN_BACKGROUND_COLOR));
        this.f13689T.add(Integer.valueOf(Settings.CUSTOM_SKIN_SET_NUMBER));
        this.f13689T.add(Integer.valueOf(Settings.CUSTOM_SKIN_CREATE_TIME));
        return this.f13689T;
    }
}
