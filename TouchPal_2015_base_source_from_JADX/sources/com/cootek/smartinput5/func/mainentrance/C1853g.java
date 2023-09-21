package com.cootek.smartinput5.func.mainentrance;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1601bg;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: com.cootek.smartinput5.func.mainentrance.g */
/* compiled from: SkinItem */
public class C1853g {

    /* renamed from: a */
    public static final float f6178a = 0.48f;

    /* renamed from: f */
    public static final int f6179f = 0;

    /* renamed from: g */
    public static final int f6180g = 1;

    /* renamed from: h */
    public static final int f6181h = 2;

    /* renamed from: j */
    private static final float f6182j = 0.02f;

    /* renamed from: k */
    private static final float f6183k = 0.44f;

    /* renamed from: x */
    private static final String f6184x = "share_skin.jpeg";

    /* renamed from: b */
    protected View f6185b;

    /* renamed from: c */
    protected ImageView f6186c;

    /* renamed from: d */
    protected int f6187d;

    /* renamed from: e */
    protected int f6188e;

    /* renamed from: i */
    protected int f6189i = 0;

    /* renamed from: l */
    private Context f6190l;

    /* renamed from: m */
    private String f6191m;

    /* renamed from: n */
    private int f6192n;

    /* renamed from: o */
    private Drawable f6193o;

    /* renamed from: p */
    private int f6194p;

    /* renamed from: q */
    private ImageView f6195q;

    /* renamed from: r */
    private boolean f6196r;

    /* renamed from: s */
    private View.OnClickListener f6197s;

    /* renamed from: t */
    private View.OnClickListener f6198t;

    /* renamed from: u */
    private C1443as f6199u;

    /* renamed from: v */
    private C1601bg f6200v;

    /* renamed from: w */
    private boolean f6201w = false;

    public C1853g(Context context) {
        this.f6190l = context;
        int i = this.f6190l.getResources().getDisplayMetrics().widthPixels;
        this.f6187d = ((int) (((float) i) * f6183k)) - (this.f6190l.getResources().getDimensionPixelSize(R.dimen.skin_page_item_padding) * 2);
        this.f6188e = (this.f6187d * 4) / 5;
        this.f6194p = (int) (((float) i) * f6182j);
    }

    /* renamed from: a */
    public View mo6925a(View view, boolean z, boolean z2, boolean z3) {
        if (view == null) {
            view = ((LayoutInflater) this.f6190l.getSystemService("layout_inflater")).inflate(R.layout.skin_item_preference, (ViewGroup) null, false);
        }
        view.setPadding(z3 ? this.f6194p * 2 : this.f6194p, z ? this.f6194p * 2 : this.f6194p, z3 ? this.f6194p : this.f6194p * 2, z2 ? this.f6194p * 2 : this.f6194p);
        TextView textView = (TextView) view.findViewById(R.id.skin_item_title);
        if (textView != null) {
            if (!this.f6200v.f5102f || !this.f6201w) {
                textView.setText(this.f6191m);
            } else {
                textView.setText(C1974m.m9063a(this.f6190l, (int) R.string.oem_skin_update));
            }
        }
        this.f6185b = view.findViewById(R.id.skin_item);
        this.f6185b.setTag(this);
        this.f6186c = (ImageView) view.findViewById(R.id.preview);
        if (this.f6186c != null) {
            this.f6186c.setLayoutParams(new RelativeLayout.LayoutParams(-1, this.f6188e));
        }
        if (this.f6186c != null && this.f6192n > 0) {
            if (this.f6199u == null) {
                this.f6186c.setImageResource(this.f6192n);
            } else {
                int a = C1368X.m6320c().mo5838k().mo6236a(this.f6199u, this.f6192n);
                if (a > 0) {
                    try {
                        this.f6186c.setImageDrawable(this.f6199u.getResources().getDrawable(a));
                    } catch (Resources.NotFoundException e) {
                        this.f6186c.setImageResource(this.f6192n);
                    } catch (OutOfMemoryError e2) {
                        this.f6186c.setImageResource(this.f6192n);
                    }
                } else {
                    this.f6186c.setImageResource(0);
                }
            }
            view.setVisibility(0);
        } else if (this.f6193o != null) {
            view.setVisibility(0);
            this.f6186c.setImageDrawable(this.f6193o);
        } else if (this.f6193o == null) {
            view.setVisibility(4);
        }
        this.f6195q = (ImageView) view.findViewById(R.id.skin_item_mark);
        mo6913a(view);
        mo6934d();
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6913a(View view) {
        View findViewById;
        if (view != null && (findViewById = view.findViewById(R.id.skin_item_extra_mark)) != null) {
            findViewById.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo6934d() {
        if (this.f6195q != null && this.f6185b != null) {
            if (this.f6200v.f5102f) {
                this.f6195q.setVisibility(0);
                this.f6195q.setImageResource(R.drawable.skin_page_upgrade_icon);
                this.f6185b.setSelected(false);
                if (!this.f6201w) {
                    this.f6185b.setOnClickListener(this.f6198t);
                } else {
                    this.f6185b.setOnClickListener((View.OnClickListener) null);
                }
            } else if (this.f6196r) {
                this.f6195q.setVisibility(0);
                this.f6195q.setImageResource(R.drawable.skin_page_enable_icon);
                this.f6185b.setSelected(true);
                if (this.f6189i == 0) {
                    this.f6185b.setOnClickListener((View.OnClickListener) null);
                } else {
                    this.f6185b.setOnClickListener(this.f6197s);
                }
            } else {
                this.f6195q.setVisibility(8);
                this.f6185b.setSelected(false);
                this.f6185b.setOnClickListener(this.f6197s);
            }
        }
    }

    /* renamed from: e */
    public C1601bg mo6935e() {
        return this.f6200v;
    }

    /* renamed from: f */
    public String mo6936f() {
        return this.f6191m;
    }

    /* renamed from: b */
    public void mo6933b(String str) {
        this.f6191m = str;
    }

    /* renamed from: a */
    public boolean mo6914a(String str) {
        return this.f6200v.mo6810a().equalsIgnoreCase(str);
    }

    /* renamed from: a */
    public void mo6931a(boolean z) {
        if (this.f6196r != z) {
            this.f6196r = z;
            mo6934d();
        }
    }

    /* renamed from: a */
    public void mo6928a(C1443as asVar, int i) {
        this.f6199u = asVar;
        this.f6192n = i;
    }

    /* renamed from: a */
    public void mo6926a(Drawable drawable) {
        this.f6193o = drawable;
    }

    /* renamed from: g */
    public Drawable mo6937g() {
        if (this.f6186c != null) {
            return this.f6186c.getDrawable();
        }
        return null;
    }

    /* renamed from: a */
    public void mo6927a(View.OnClickListener onClickListener) {
        this.f6197s = onClickListener;
    }

    /* renamed from: b */
    public void mo6932b(View.OnClickListener onClickListener) {
        this.f6198t = onClickListener;
    }

    /* renamed from: a */
    public void mo6929a(C1601bg bgVar) {
        this.f6200v = bgVar;
    }

    /* renamed from: a */
    public void mo6911a(int i) {
        this.f6189i = i;
    }

    /* renamed from: a */
    public int mo6909a() {
        return this.f6189i;
    }

    /* renamed from: h */
    public Uri mo6938h() {
        try {
            File file = new File(C1358O.m6234a(C1358O.f4201l), f6184x);
            if (file.exists()) {
                file.delete();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            ((BitmapDrawable) mo6937g()).getBitmap().compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            if (file.exists()) {
                return Uri.fromFile(file);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: i */
    public String mo6939i() {
        return C1974m.m9063a(this.f6190l, C1593bR.m7162a().mo6232a(20));
    }

    /* renamed from: j */
    public String mo6940j() {
        return C1974m.m9063a(this.f6190l, (int) R.string.share_skin_content);
    }

    /* renamed from: a */
    public void mo6930a(Boolean bool) {
        this.f6201w = bool.booleanValue();
    }
}
