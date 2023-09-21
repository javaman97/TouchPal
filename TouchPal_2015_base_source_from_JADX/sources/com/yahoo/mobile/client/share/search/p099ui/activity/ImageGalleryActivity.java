package com.yahoo.mobile.client.share.search.p099ui.activity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.p001v4.app.C0167o;
import android.support.p001v4.view.ViewPager;
import android.text.Html;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.p066ui.EnterKey;
import com.google.android.gms.plus.PlusShare;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.interfaces.Export;
import com.yahoo.mobile.client.share.search.p099ui.C4169a;
import com.yahoo.mobile.client.share.search.p099ui.view.ListenableImageView;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import com.yahoo.mobile.client.share.search.util.C4227a;
import com.yahoo.mobile.client.share.search.util.C4242g;
import com.yahoo.mobile.client.share.search.util.C4243h;
import com.yahoo.mobile.client.share.search.util.C4245j;
import com.yahoo.mobile.client.share.search.util.C4247l;
import com.yahoo.mobile.client.share.search.util.C4248m;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;

@SuppressLint({"NewApi"})
@Export
/* renamed from: com.yahoo.mobile.client.share.search.ui.activity.ImageGalleryActivity */
public class ImageGalleryActivity extends C0167o implements View.OnClickListener, ListenableImageView.ImageViewListener {
    public static final String CURRENT_POS = "current_pos";
    public static final String DOWNLOAD_PATH = "/tmp/";
    public static final String FINISH_ENTER_ANIMATION_ID = "FINISH_ENTER_ANIMATION_ID";
    public static final String FINISH_EXIT_ANIMATION_ID = "FINISH_EXIT_ANIMATION_ID";
    public static final String LISTING_POS = "listing_position";
    public static final String PHOTODATA_LIST = "image_urls";
    public static final String PHOTO_DATA = "photo_data";
    public static final String REFERER = "referer";
    public static final String START_POS = "start_position";
    public static final String USE_FINISH_ANIMATION = "USE_FINISH_ANIMATION";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f16955A = 0;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f16956B = 0;

    /* renamed from: C */
    private int f16957C;

    /* renamed from: D */
    private int f16958D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f16959E;

    /* renamed from: F */
    private String f16960F = "sch_imageviewer_screen";

    /* renamed from: G */
    private boolean f16961G = true;

    /* renamed from: H */
    private int f16962H;

    /* renamed from: I */
    private boolean f16963I = false;

    /* renamed from: J */
    private boolean f16964J = false;

    /* renamed from: K */
    private int f16965K = 0;

    /* renamed from: L */
    private int f16966L = 0;

    /* renamed from: M */
    private int f16967M = 0;

    /* renamed from: N */
    private int f16968N = 0;

    /* renamed from: a */
    private TextView f16969a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f16970b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TextView f16971c;

    /* renamed from: d */
    private String f16972d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public LinearLayout f16973e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f16974f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f16975g;

    /* renamed from: h */
    private TextView f16976h;

    /* renamed from: i */
    private String f16977i = null;

    /* renamed from: j */
    private View f16978j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public ViewPager f16979k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public LinearLayout f16980l;

    /* renamed from: m */
    private TextView f16981m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C4169a f16982n;

    /* renamed from: o */
    private ArrayList<PhotoData> f16983o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f16984p = false;

    /* renamed from: q */
    private String f16985q = null;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f16986r = true;

    /* renamed from: s */
    private boolean f16987s = true;

    /* renamed from: t */
    private TextView f16988t;

    /* renamed from: u */
    private ActionBar f16989u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public TextView f16990v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public TextView f16991w;

    /* renamed from: x */
    private ImageView f16992x;

    /* renamed from: y */
    private int f16993y = 0;

    /* renamed from: z */
    private int f16994z = 0;

    /* renamed from: i */
    static /* synthetic */ void m17586i(ImageGalleryActivity imageGalleryActivity) {
        imageGalleryActivity.f16981m.setTextColor(imageGalleryActivity.getResources().getColor(C4073a.C4078e.yssdk_grey_900));
        imageGalleryActivity.f16981m.setEnabled(false);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C4129c.m17444i().getInstrument().activityOnStart(this);
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        C4129c.m17444i().getInstrument().activityOnStop(this);
        super.onStop();
    }

    public static Intent getIntent(Context context, String str, int i, ArrayList<PhotoData> arrayList, int i2, SearchQuery searchQuery, String str2, int i3, boolean z, boolean z2) {
        Intent intent = new Intent(context, ImageGalleryActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("listing_name", str);
        bundle.putInt(LISTING_POS, i);
        bundle.putParcelableArrayList(PHOTODATA_LIST, arrayList);
        bundle.putInt("photodata_offset", i2);
        intent.putExtras(bundle);
        intent.putExtra(USE_FINISH_ANIMATION, true);
        intent.putExtra(FINISH_ENTER_ANIMATION_ID, C4073a.C4074a.yssdk_zoom_in);
        intent.putExtra(FINISH_EXIT_ANIMATION_ID, C4073a.C4074a.yssdk_slide_out_to_right);
        intent.putExtra(REFERER, str2);
        if (!(searchQuery == null || searchQuery.getQueryString() == null)) {
            intent.putExtra("query", searchQuery.getQueryString());
        }
        intent.putExtra("SDK_MODE", i3);
        intent.putExtra("preview_mode", z);
        intent.putExtra("copyright_enabled", z2);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (!C4129c.m17437c()) {
            finish();
        }
        if (bundle != null) {
            this.f16993y = bundle.getInt("header_view_visibility");
            this.f16994z = bundle.getInt("image_info_visibility");
            this.f16955A = bundle.getInt("system_visibility");
            this.f16956B = bundle.getInt("status_bar_layoutparams");
        } else {
            this.f16993y = 0;
            this.f16994z = 0;
            this.f16955A = 0;
            this.f16956B = 0;
        }
        setProgressBarVisibility(false);
        getWindow().requestFeature(8);
        Bundle extras = getIntent().getExtras();
        if (extras == null || !m17575a(extras)) {
            z = false;
        } else {
            if (extras.containsKey(USE_FINISH_ANIMATION)) {
                this.f16964J = extras.getBoolean(USE_FINISH_ANIMATION);
                if (this.f16964J) {
                    if (extras.containsKey(FINISH_ENTER_ANIMATION_ID)) {
                        this.f16968N = extras.getInt(FINISH_ENTER_ANIMATION_ID);
                    }
                    if (extras.containsKey(FINISH_EXIT_ANIMATION_ID)) {
                        this.f16967M = extras.getInt(FINISH_EXIT_ANIMATION_ID);
                    }
                }
            }
            if (extras.containsKey("SDK_MODE") && extras.getInt("SDK_MODE") == 5) {
                this.f16960F = "sch_shr_imageviewer_screen";
                this.f16961G = false;
            }
            z = true;
        }
        if (!z && !m17575a(bundle)) {
            setResult(0);
            finish();
        }
        setContentView(C4073a.C4083j.yssdk_image_gallery);
        this.f16970b = (TextView) findViewById(C4073a.C4081h.view_title);
        this.f16971c = (TextView) findViewById(C4073a.C4081h.view_url);
        this.f16969a = (TextView) findViewById(C4073a.C4081h.close);
        this.f16973e = (LinearLayout) findViewById(C4073a.C4081h.image_info_view);
        this.f16974f = (TextView) findViewById(C4073a.C4081h.image_dimensions);
        this.f16975g = (TextView) findViewById(C4073a.C4081h.description);
        this.f16976h = (TextView) findViewById(C4073a.C4081h.copyright);
        this.f16979k = (ViewPager) findViewById(C4073a.C4081h.gallery);
        this.f16980l = (LinearLayout) findViewById(C4073a.C4081h.header_view);
        this.f16978j = getWindow().getDecorView();
        this.f16981m = (TextView) findViewById(C4073a.C4081h.share_button);
        if (!this.f16961G) {
            this.f16981m.setVisibility(8);
        }
        this.f16988t = (TextView) findViewById(C4073a.C4081h.image_share_button);
        this.f16988t.setOnClickListener(this);
        this.f16970b.setOnClickListener(this);
        this.f16971c.setOnClickListener(this);
        this.f16969a.setTypeface(C4247l.m17792a(this));
        this.f16969a.setOnClickListener(this);
        this.f16973e.setVisibility(this.f16994z);
        this.f16980l.setVisibility(this.f16993y);
        this.f16989u = getActionBar();
        this.f16989u.setDisplayShowHomeEnabled(false);
        this.f16989u.setDisplayHomeAsUpEnabled(false);
        this.f16989u.setDisplayShowCustomEnabled(true);
        this.f16989u.setCustomView(C4073a.C4083j.yssdk_preview_header);
        View customView = this.f16989u.getCustomView();
        if (customView != null) {
            this.f16990v = (TextView) customView.findViewById(C4073a.C4081h.preview_title);
            this.f16991w = (TextView) customView.findViewById(C4073a.C4081h.preview_subtitle);
            this.f16992x = (ImageView) customView.findViewById(C4073a.C4081h.preview_back_icon);
            this.f16976h = (TextView) customView.findViewById(C4073a.C4081h.preview_copyright);
            if (this.f16987s) {
                this.f16976h.setVisibility(0);
                this.f16990v.setTextSize(0, getResources().getDimension(C4073a.C4079f.yssdk_preview_title_textsize_small));
                this.f16991w.setTextSize(0, getResources().getDimension(C4073a.C4079f.yssdk_preview_subtitle_textsize_small));
            }
            this.f16990v.setOnClickListener(this);
            this.f16991w.setOnClickListener(this);
            this.f16992x.setOnClickListener(this);
        }
        if (this.f16986r) {
            this.f16980l.setVisibility(8);
            this.f16973e.setVisibility(8);
            this.f16988t.setVisibility(0);
            TextView textView = (TextView) findViewById(C4073a.C4081h.image_send_icon);
            textView.setTypeface(C4247l.m17792a(this));
            textView.setVisibility(0);
        } else {
            this.f16989u.hide();
        }
        this.f16957C = this.f16958D - this.f16962H;
        new StringBuilder("GallerySize: ").append(this.f16983o.size()).append(", startPositon: ").append(this.f16957C);
        this.f16959E = this.f16957C;
        if (!this.f16986r) {
            this.f16973e.setClickable(true);
            this.f16973e.setOnClickListener(this);
            final GestureDetector gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    ImageGalleryActivity.this.m17578b();
                    return false;
                }
            });
            this.f16979k.setOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    gestureDetector.onTouchEvent(motionEvent);
                    return false;
                }
            });
            if (C4248m.f17357l) {
                this.f16955A = this.f16955A | 1024 | 512;
                resetHeaderViewLayout();
                resetImageInfoLayout();
                this.f16978j.setSystemUiVisibility(this.f16955A);
            } else if (C4248m.f17355j) {
                this.f16955A |= 1024;
                resetHeaderViewLayout();
                if (this.f16956B == 1024) {
                    getWindow().addFlags(this.f16956B);
                }
                this.f16978j.setSystemUiVisibility(this.f16955A);
            } else if (C4248m.f17353h) {
                this.f16978j.setSystemUiVisibility(this.f16955A);
            }
            if (C4248m.f17353h) {
                this.f16978j.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
                    public final void onSystemUiVisibilityChange(int i) {
                        int i2;
                        int i3;
                        int d;
                        boolean z = true;
                        int i4 = 0;
                        if (C4248m.f17357l) {
                            if ((i & 4) != 0) {
                                z = false;
                            }
                            LinearLayout b = ImageGalleryActivity.this.f16980l;
                            if (z) {
                                i3 = 0;
                            } else {
                                i3 = 8;
                            }
                            b.setVisibility(i3);
                            LinearLayout c = ImageGalleryActivity.this.f16973e;
                            if (!z) {
                                i4 = 8;
                            }
                            c.setVisibility(i4);
                            ImageGalleryActivity imageGalleryActivity = ImageGalleryActivity.this;
                            if (z) {
                                d = ImageGalleryActivity.this.f16955A & -2049 & -5 & -3;
                            } else {
                                d = ImageGalleryActivity.this.f16955A;
                            }
                            int unused = imageGalleryActivity.f16955A = d;
                        } else if (C4248m.f17353h) {
                            if ((i & 1) != 0) {
                                z = false;
                            }
                            LinearLayout b2 = ImageGalleryActivity.this.f16980l;
                            if (z) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            b2.setVisibility(i2);
                            LinearLayout c2 = ImageGalleryActivity.this.f16973e;
                            if (!z) {
                                i4 = 8;
                            }
                            c2.setVisibility(i4);
                            int unused2 = ImageGalleryActivity.this.f16955A = z ? ImageGalleryActivity.this.f16955A & -2 : ImageGalleryActivity.this.f16955A;
                            if (C4248m.f17355j && z) {
                                int unused3 = ImageGalleryActivity.this.f16956B = 0;
                                ImageGalleryActivity.this.getWindow().clearFlags(1024);
                            }
                        }
                    }
                });
            }
        }
        this.f16979k.setPageMargin((int) getResources().getDimension(C4073a.C4079f.imageGalleryMargin));
        this.f16979k.setAdapter(this.f16982n);
        this.f16979k.requestFocus(66);
        this.f16979k.setOnPageChangeListener(new ViewPager.C0382e() {
            public final void onPageSelected(int i) {
                PhotoData a = ImageGalleryActivity.this.f16982n.mo15579a(i);
                ListenableImageView listenableImageView = (ListenableImageView) ImageGalleryActivity.this.f16979k.findViewWithTag(a);
                if (listenableImageView != null) {
                    if (listenableImageView.getDrawable() != null) {
                        ImageGalleryActivity.this.m17580c();
                    } else {
                        ImageGalleryActivity.m17586i(ImageGalleryActivity.this);
                        listenableImageView.mo15828a(ImageGalleryActivity.this);
                    }
                }
                if (a != null) {
                    if (ImageGalleryActivity.this.f16986r) {
                        ImageGalleryActivity.this.f16990v.setText(Html.fromHtml(a.getTitle()));
                        ImageGalleryActivity.this.f16991w.setText(a.getDisplayUrl());
                        ImageGalleryActivity.this.f16991w.setTag(a.getSourceUrl());
                    } else {
                        ImageGalleryActivity.this.f16970b.setText(Html.fromHtml(a.getTitle()));
                        ImageGalleryActivity.this.f16971c.setText(a.getDisplayUrl());
                        ImageGalleryActivity.this.f16971c.setTag(a.getSourceUrl());
                        ImageGalleryActivity.this.f16974f.setText(ImageGalleryActivity.this.m17570a(a.getDimensionsAndSize()));
                        ImageGalleryActivity.this.f16975g.setText(Html.fromHtml(a.getTitle()));
                    }
                }
                if (i > ImageGalleryActivity.this.f16959E) {
                    ImageGalleryActivity.this.logItemChangedRight(ImageGalleryActivity.this.f16982n.mo15579a(i));
                    boolean unused = ImageGalleryActivity.this.f16984p = true;
                } else if (i < ImageGalleryActivity.this.f16959E) {
                    ImageGalleryActivity.this.logItemChangedLeft(ImageGalleryActivity.this.f16982n.mo15579a(i));
                    boolean unused2 = ImageGalleryActivity.this.f16984p = true;
                }
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    int unused = ImageGalleryActivity.this.f16959E = ImageGalleryActivity.this.f16979k.getCurrentItem();
                }
            }
        });
        PhotoData a = this.f16982n.mo15579a(this.f16957C);
        a.getDisplayUrl();
        this.f16979k.setCurrentItem(this.f16957C);
        if (this.f16986r) {
            this.f16990v.setText(Html.fromHtml(a.getTitle()));
            this.f16991w.setText(a.getDisplayUrl());
        } else {
            this.f16970b.setText(Html.fromHtml(a.getTitle()));
            this.f16971c.setText(a.getDisplayUrl());
            this.f16971c.setTag(a.getSourceUrl());
            this.f16975g.setText(Html.fromHtml(a.getTitle()));
            this.f16974f.setText(m17570a(a.getDimensionsAndSize()));
            this.f16981m.setTypeface(C4247l.m17792a(this));
            this.f16981m.setOnClickListener(this);
        }
        PhotoData a2 = this.f16982n.mo15579a(this.f16957C);
        HashMap hashMap = new HashMap();
        hashMap.put("sch_url", a2.getPhotoUrl());
        if (!TextUtils.isEmpty(this.f16985q)) {
            hashMap.put("query", this.f16985q);
        }
        hashMap.put("sch_cmpt", "image viewer");
        C4242g.m17773a(980778379, "sch_open_component", hashMap);
    }

    /* renamed from: a */
    private boolean m17575a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        if (!bundle.containsKey("listing_name")) {
            return false;
        }
        this.f16972d = bundle.getString("listing_name");
        if (!bundle.containsKey(PHOTODATA_LIST)) {
            return false;
        }
        this.f16983o = bundle.getParcelableArrayList(PHOTODATA_LIST);
        this.f16982n = new C4169a(this, this.f16983o, this);
        this.f16977i = bundle.getString(REFERER);
        this.f16985q = bundle.getString("query");
        this.f16958D = bundle.getInt(LISTING_POS, 0);
        this.f16962H = bundle.getInt("photodata_offset", 0);
        this.f16986r = bundle.getBoolean("preview_mode", true);
        this.f16987s = bundle.getBoolean("copyright_enabled", true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        HashMap hashMap = new HashMap();
        hashMap.put("sch_cmpt", "image viewer");
        C4242g.m17773a(980778379, "sch_close_component", hashMap);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("listing_name", this.f16972d);
        bundle.putInt(START_POS, this.f16979k.getCurrentItem());
        bundle.putParcelableArrayList(PHOTODATA_LIST, this.f16983o);
        if (this.f16980l != null) {
            bundle.putInt("header_view_visibility", this.f16980l.getVisibility());
        }
        if (this.f16973e != null) {
            bundle.putInt("image_info_visibility", this.f16973e.getVisibility());
        }
        bundle.putInt("system_visibility", this.f16955A);
        bundle.putInt("status_bar_layoutparams", this.f16956B);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey(START_POS)) {
            this.f16957C = bundle.getInt(START_POS);
            this.f16979k.setCurrentItem(this.f16957C);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onResume() {
        super.onResume();
        C4242g.m17774a((Context) this);
        getWindow().getDecorView().postDelayed(new Runnable() {
            public final void run() {
                ((InputMethodManager) ImageGalleryActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(ImageGalleryActivity.this.getWindow().getDecorView().getWindowToken(), 0);
            }
        }, 50);
        HashMap hashMap = new HashMap();
        hashMap.put("screen_name", "sch_shr_imageviewer_screen");
        C4242g.m17773a(980778379, "page_view_classic", hashMap);
    }

    public void onPause() {
        C4242g.m17775b(this);
        if (isFinishing() && this.f16982n != null) {
            this.f16982n.mo15580a();
        }
        super.onPause();
    }

    public void finish() {
        super.finish();
        if (this.f16964J) {
            overridePendingTransition(this.f16968N, this.f16967M);
        }
    }

    public void onBackPressed() {
        m17571a();
    }

    @SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
    /* renamed from: a */
    private Uri m17568a(ImageView imageView, PhotoData photoData) {
        Uri uri;
        Drawable drawable;
        File filesDir;
        if (!C4129c.m17459x()) {
            return null;
        }
        if (photoData.hasDownLoadedPhoto()) {
            uri = Uri.fromFile(new File(photoData.getEscapedPhotoUrl()));
        } else if (photoData.hasDownloadedThumb()) {
            uri = Uri.fromFile(new File(photoData.getEscapedThumbnailUrl()));
        } else {
            if (!(imageView == null || (drawable = imageView.getDrawable()) == null)) {
                if (C4245j.m17789c(this)) {
                    filesDir = Environment.getExternalStorageDirectory();
                } else {
                    filesDir = getFilesDir();
                }
                if (filesDir != null && filesDir.canWrite() && filesDir.canRead()) {
                    File file = new File(filesDir.getAbsolutePath() + DOWNLOAD_PATH + C4129c.m17457v() + "/");
                    file.mkdirs();
                    if (file.isDirectory() && file.exists()) {
                        File[] listFiles = file.listFiles(new FilenameFilter() {
                            public final boolean accept(File file, String str) {
                                if (str.contains("yssdk_share")) {
                                    return true;
                                }
                                return false;
                            }
                        });
                        for (File delete : listFiles) {
                            delete.delete();
                        }
                    }
                    File file2 = new File(file, "yssdk_share" + System.currentTimeMillis() + ".jpg");
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                        fileOutputStream.close();
                        uri = Uri.fromFile(file2);
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (file2.exists()) {
                            file2.delete();
                        }
                    }
                }
            }
            uri = null;
        }
        return uri;
    }

    public void onClick(View view) {
        PhotoData a = this.f16982n.mo15579a(this.f16979k.getCurrentItem());
        if ((view == this.f16971c || view == this.f16970b) && this.f16971c.getTag() != null && (this.f16971c.getTag() instanceof String)) {
            String str = (String) this.f16971c.getTag();
            m17574a(str, "url");
            C4227a.m17749a(this, str, this.f16977i, this.f16960F);
        } else if (view == this.f16981m) {
            Uri a2 = m17568a((ImageView) (ListenableImageView) this.f16979k.findViewWithTag(a), a);
            String origPhotoUrl = a.getOrigPhotoUrl();
            if (a2 == null) {
                C4129c.m17444i().getShare().share(this, (String) null, getString(C4073a.C4086m.yssdk_share_via), this.f16970b.getText().toString(), origPhotoUrl, getSupportFragmentManager(), "share_fragment");
            } else {
                C4129c.m17444i().getShare().share(this, a2.toString(), getString(C4073a.C4086m.yssdk_share_via), this.f16970b.getText().toString(), origPhotoUrl, getSupportFragmentManager(), "share_fragment");
            }
            m17574a(origPhotoUrl, "share");
        } else if (view == this.f16969a) {
            m17571a();
        } else if (view == this.f16973e) {
            m17578b();
            m17574a(a.getOrigPhotoUrl(), "info");
        } else if (view == this.f16988t) {
            m17572a(a, this.f16959E);
        } else if (view == this.f16992x) {
            m17571a();
        } else if ((view == this.f16990v || view == this.f16991w) && this.f16991w.getTag() != null && (this.f16991w.getTag() instanceof String)) {
            C4227a.m17750a(this, (String) this.f16991w.getTag());
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C4073a.C4084k.menu_send_image, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        PhotoData a = this.f16982n.mo15579a(this.f16979k.getCurrentItem());
        int itemId = menuItem.getItemId();
        if (itemId == C4073a.C4081h.menu_send) {
            m17572a(a, this.f16959E);
        } else if (itemId == C4073a.C4081h.menu_copy) {
            ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(PlusShare.KEY_CALL_TO_ACTION_LABEL, a.getPhotoUrl()));
        } else if (itemId == C4073a.C4081h.menu_open) {
            C4227a.m17750a(this, a.getSourceUrl());
        } else if (itemId == 16908332) {
            m17571a();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: a */
    private void m17572a(PhotoData photoData, int i) {
        Intent intent = new Intent();
        intent.putExtra(PHOTO_DATA, photoData);
        intent.putExtra(CURRENT_POS, i);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: a */
    private void m17571a() {
        if (this.f16984p) {
            int currentItem = this.f16979k.getCurrentItem();
            HashMap hashMap = new HashMap();
            hashMap.put("current_index", Integer.valueOf(currentItem + this.f16962H));
            C4243h.m17777a((Context) this, "update_image_current_index", hashMap);
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m17570a(String str) {
        if (str.contains("KB")) {
            return str.replace("KB", getResources().getString(C4073a.C4086m.yssdk_kb));
        }
        if (str.contains("MB")) {
            return str.replace("MB", getResources().getString(C4073a.C4086m.yssdk_mb));
        }
        return null;
    }

    public void logItemChangedRight(PhotoData photoData) {
        if (photoData != null) {
            m17574a(photoData.getEscapedPhotoUrl(), EnterKey.NEXT);
        }
    }

    public void logItemChangedLeft(PhotoData photoData) {
        if (photoData != null) {
            m17574a(photoData.getEscapedPhotoUrl(), "prev");
        }
    }

    public void resetHeaderViewLayout() {
        int a = C4248m.m17794a(getApplicationContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16980l.getLayoutParams();
        marginLayoutParams.topMargin = a;
        if (getResources().getConfiguration().orientation == 2 && C4248m.f17357l) {
            Rect rect = new Rect();
            getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            marginLayoutParams.width = rect.width();
        }
        this.f16980l.requestLayout();
    }

    public void resetImageInfoLayout() {
        if (getResources().getConfiguration().orientation == 1 && C4248m.f17348c) {
            Rect rect = new Rect();
            getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getRealSize(point);
            ((ViewGroup.MarginLayoutParams) this.f16973e.getLayoutParams()).bottomMargin = point.y - rect.height();
            this.f16973e.requestLayout();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17578b() {
        if (this.f16980l.getVisibility() == 0 && this.f16973e.getVisibility() == 0) {
            this.f16980l.setVisibility(8);
            this.f16973e.setVisibility(8);
            if (C4248m.f17357l) {
                this.f16955A = this.f16955A | 2 | 4 | 2048;
                this.f16978j.setSystemUiVisibility(this.f16955A);
            } else if (C4248m.f17355j) {
                this.f16955A |= 1;
                this.f16956B = 1024;
                getWindow().addFlags(this.f16956B);
                this.f16978j.setSystemUiVisibility(this.f16955A);
            } else if (C4248m.f17353h) {
                this.f16955A |= 1;
                this.f16978j.setSystemUiVisibility(this.f16955A);
            }
        } else {
            this.f16980l.setVisibility(0);
            this.f16973e.setVisibility(0);
            if (C4248m.f17357l) {
                this.f16955A = this.f16955A & -5 & -3 & -2049;
                this.f16978j.setSystemUiVisibility(this.f16955A);
            } else if (C4248m.f17355j) {
                this.f16955A &= -2;
                this.f16956B = 0;
                getWindow().clearFlags(1024);
                this.f16978j.setSystemUiVisibility(this.f16955A);
            } else if (C4248m.f17353h) {
                this.f16955A &= -2;
                this.f16978j.setSystemUiVisibility(this.f16955A);
            }
        }
    }

    public void onImageLoaded(ImageView imageView) {
        if (imageView == ((ListenableImageView) this.f16979k.findViewWithTag(this.f16982n.mo15579a(this.f16979k.getCurrentItem())))) {
            m17580c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17580c() {
        this.f16981m.setTextColor(getResources().getColor(C4073a.C4078e.white));
        this.f16981m.setEnabled(true);
    }

    /* renamed from: a */
    private static void m17574a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sch_url", str);
        hashMap.put("sch_type", str2);
        C4242g.m17773a(980778379, "sch_select_action", hashMap);
    }
}
