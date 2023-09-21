package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.cootek.smartinput5.engine.ClipboardBackend;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.vip.PurchaseVipActivity;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.ui.q */
/* compiled from: ClipboardSimpleAdapter */
public class C2939q extends SimpleAdapter {

    /* renamed from: a */
    public static int f13346a = 3;

    /* renamed from: b */
    final List<View> f13347b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f13348c;

    /* renamed from: d */
    private Resources f13349d = this.f13348c.getResources();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<Map<String, Object>> f13350e;

    /* renamed from: f */
    private View f13351f;

    /* renamed from: g */
    private TextView f13352g;

    /* renamed from: h */
    private View f13353h;

    /* renamed from: i */
    private TextView f13354i;

    /* renamed from: j */
    private View f13355j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f13356k;

    /* renamed from: l */
    private AlphaAnimation f13357l;

    /* renamed from: m */
    private TranslateAnimation f13358m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AnimationSet f13359n;

    /* renamed from: o */
    private TranslateAnimation f13360o;

    /* renamed from: p */
    private Animation f13361p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C2940a f13362q;

    /* renamed from: com.cootek.smartinput5.ui.q$a */
    /* compiled from: ClipboardSimpleAdapter */
    public interface C2940a {
        /* renamed from: a */
        void mo8507a(int i);

        /* renamed from: b */
        void mo8508b(int i);

        /* renamed from: c */
        void mo8509c();

        int getDisplayHeight();

        int getDisplayWidth();
    }

    public C2939q(Context context, List<Map<String, Object>> list, int i, String[] strArr, int[] iArr) {
        super(context, list, i, strArr, iArr);
        this.f13348c = context;
        this.f13350e = list;
        LayoutInflater from = LayoutInflater.from(this.f13348c);
        this.f13351f = (LinearLayout) from.inflate(R.layout.need_more_item_view, (ViewGroup) null);
        this.f13352g = (FittedTextView) this.f13351f.findViewById(R.id.free_storage_message);
        this.f13353h = from.inflate(R.layout.clipboard_notification_item_view, (ViewGroup) null);
        this.f13354i = (TextView) this.f13353h.findViewById(R.id.clipboard_notify_message);
        this.f13354i.setText(m13605c((int) R.string.clipboard_notification_text));
        this.f13355j = this.f13353h.findViewById(R.id.i_know_btn);
        this.f13358m = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        this.f13358m.setDuration(200);
        this.f13357l = new AlphaAnimation(1.0f, 0.0f);
        this.f13357l.setDuration(200);
        this.f13359n = new AnimationSet(true);
        this.f13359n.addAnimation(this.f13358m);
        this.f13359n.addAnimation(this.f13357l);
        this.f13359n.setDuration(200);
        this.f13359n.setAnimationListener(new C2941r(this));
        this.f13360o = new TranslateAnimation(1, -1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        this.f13360o.setDuration(500);
        this.f13361p = new ScaleAnimation(1.0f, 1.0f, 0.1f, 1.0f);
        this.f13361p.setDuration(200);
        this.f13361p.setFillAfter(true);
        this.f13347b = new ArrayList();
        for (int i2 = 0; i2 < ClipboardBackend.clipboardSlotNum; i2++) {
            this.f13347b.add((Object) null);
        }
    }

    /* renamed from: a */
    private String m13599a(int i, Object... objArr) {
        return C1974m.m9064a(this.f13348c, i, objArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m13605c(int i) {
        return C1974m.m9063a(this.f13348c, i);
    }

    /* renamed from: a */
    public void mo9736a(C2940a aVar) {
        this.f13362q = aVar;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.f13350e.get(i).get("first_notification") != null) {
            this.f13355j.setOnClickListener(new C3255w(this, i));
            if (!Settings.getInstance().getBoolSetting(Settings.CLIPBOARD_NOTIFICATION_SHOWN) || mo9741f() <= 0) {
                this.f13353h.setVisibility(8);
            }
            return this.f13353h;
        } else if (this.f13350e.get(i).get("premium_notification") != null) {
            m13610h();
            return this.f13351f;
        } else if (i > ClipboardBackend.clipboardSlotNum || this.f13350e.get(i).get("text") == null) {
            view2.setVisibility(8);
            return view2;
        } else {
            View inflate = View.inflate(this.f13348c, R.layout.clipboard_item_view, (ViewGroup) null);
            View findViewById = inflate.findViewById(R.id.clipboard_item_content_layout);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.clipboard_item_lock_checkbox);
            if ((i - mo9738c()) % 2 != 0) {
                findViewById.setBackgroundResource(R.color.clipboard_item_odd_bg);
                if (((Boolean) this.f13350e.get(i).get("islocked")).booleanValue()) {
                    imageView.setImageResource(R.drawable.clipboard_lock_checkbox);
                }
            } else if ((i - mo9738c()) % 2 == 0) {
                findViewById.setBackgroundResource(R.color.clipboard_item_even_bg);
                if (((Boolean) this.f13350e.get(i).get("islocked")).booleanValue()) {
                    imageView.setImageResource(R.drawable.clipboard_lock_checkbox_dark);
                }
            }
            View findViewById2 = inflate.findViewById(R.id.clipboard_item_btn);
            View findViewById3 = inflate.findViewById(R.id.clipboard_item_menu_layout);
            findViewById3.setVisibility(8);
            this.f13347b.set(m13606d(i), findViewById3);
            findViewById2.setOnClickListener(new C3256x(this, findViewById3, i));
            findViewById3.findViewById(R.id.clipboard_item_remove_view).setOnClickListener(new C3257y(this, i, findViewById3));
            View findViewById4 = findViewById3.findViewById(R.id.clipboard_item_lock_view);
            if (this.f13350e.get(i).get("islocked") != null) {
                View findViewById5 = findViewById4.findViewById(R.id.clipboard_item_lock_text);
                View findViewById6 = findViewById4.findViewById(R.id.clipboard_item_lock_image);
                if (((Boolean) this.f13350e.get(i).get("islocked")).booleanValue()) {
                    ((TextView) findViewById5).setText(m13605c((int) R.string.clipboard_menu_unlock));
                    ((ImageView) findViewById6).setImageResource(R.drawable.clipboard_menu_unlock);
                } else {
                    ((TextView) findViewById5).setText(m13605c((int) R.string.clipboard_menu_lock));
                    ((ImageView) findViewById6).setImageResource(R.drawable.clipboard_menu_lock);
                }
            }
            findViewById4.setOnClickListener(new C2609B(this, findViewById3, i));
            TextView textView = (TextView) inflate.findViewById(R.id.clipboard_item_content);
            CharSequence charSequence = (CharSequence) this.f13350e.get(i).get("text");
            textView.setText(charSequence);
            textView.setOnClickListener(new C2610C(this, charSequence, i));
            textView.setOnLongClickListener(new C2613D(this, findViewById3, i));
            return inflate;
        }
    }

    /* renamed from: a */
    public void mo9733a(int i) {
        boolean booleanValue = ((Boolean) this.f13350e.get(i).get("islocked")).booleanValue();
        if (!booleanValue) {
            C1246d.m6010a(this.f13348c).mo4591a(C1246d.f3753aW, C1246d.f3822bm, C1246d.f3783b);
        } else {
            C1246d.m6010a(this.f13348c).mo4591a(C1246d.f3753aW, C1246d.f3823bn, C1246d.f3783b);
        }
        this.f13350e.get(i).put("islocked", Boolean.valueOf(!booleanValue));
        if (!Settings.getInstance().getBoolSetting(Settings.CLIPBOARD_LOCK_NOTIFICATION_SHOWN)) {
            Toast.makeText(this.f13348c, m13605c((int) R.string.clipboard_lock_notify_text), 1).show();
            Settings.getInstance().setBoolSetting(Settings.CLIPBOARD_LOCK_NOTIFICATION_SHOWN, true);
        }
        ClipboardBackend.getInstance().lockClipBoardItem(m13606d(i), ((Boolean) this.f13350e.get(i).get("islocked")).booleanValue());
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public synchronized void mo9737b(int i) {
        this.f13356k = i;
        if (this.f13356k >= 0 && this.f13356k < this.f13350e.size()) {
            if (this.f13350e.get(this.f13356k).get("first_notification") != null) {
                this.f13350e.remove(this.f13356k);
                Settings.getInstance().setBoolSetting(Settings.CLIPBOARD_NOTIFICATION_SHOWN, true);
            } else if (this.f13356k >= mo9738c() && this.f13356k <= mo9739d()) {
                ClipboardBackend.getInstance().deleteClipBoardItem(m13606d(this.f13356k));
                this.f13350e.remove(this.f13356k);
            }
            if (mo9741f() < ClipboardBackend.clipboardSlotNum - f13346a && m13612j() > 0) {
                this.f13350e.remove(m13612j());
            }
        }
    }

    /* renamed from: a */
    public void mo9732a() {
        if (!Settings.getInstance().getBoolSetting(Settings.CLIPBOARD_NOTIFICATION_SHOWN)) {
            this.f13353h.setVisibility(0);
            this.f13353h.startAnimation(this.f13360o);
            this.f13362q.mo8509c();
        }
    }

    /* renamed from: h */
    private void m13610h() {
        int i = ClipboardBackend.clipboardSlotNum;
        this.f13352g.setText(m13599a((int) R.string.storage_full_summary, Integer.valueOf(i - mo9741f()), Integer.valueOf(i)));
        View findViewById = this.f13351f.findViewById(R.id.purchase_premium_message);
        int dimensionPixelSize = this.f13349d.getDimensionPixelSize(R.dimen.need_more_item_height);
        if (ClipboardBackend.getInstance().getClipboardSlots() >= ClipboardBackend.clipboardSlotNum) {
            this.f13351f.setBackgroundResource(R.drawable.bg_need_more_highlight);
            findViewById.setVisibility(0);
            this.f13352g.setHeight(dimensionPixelSize / 2);
            this.f13351f.setOnClickListener(new C2614E(this));
            return;
        }
        this.f13351f.setBackgroundResource(R.drawable.bg_need_more);
        findViewById.setVisibility(8);
        this.f13352g.setHeight(dimensionPixelSize);
        this.f13351f.setOnClickListener(new C2615F(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m13611i() {
        Intent intent = new Intent();
        intent.setClass(this.f13348c, PurchaseVipActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f13348c.startActivity(intent);
    }

    /* renamed from: b */
    public static int m13600b() {
        if (!Settings.getInstance().getBoolSetting(Settings.CLIPBOARD_NOTIFICATION_SHOWN)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public int mo9738c() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f13350e.size()) {
                return -1;
            }
            if (this.f13350e.get(i2).get("text") != null) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    /* renamed from: d */
    public int mo9739d() {
        for (int size = this.f13350e.size() - 1; size >= 0; size--) {
            if (this.f13350e.get(size).get("text") != null) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public int mo9740e() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f13350e.size()) {
                return -1;
            }
            if (this.f13350e.get(i2).get("first_notification") != null) {
                return i2;
            }
            i = i2 + 1;
        }
    }

    /* renamed from: j */
    private int m13612j() {
        for (int size = this.f13350e.size() - 1; size >= 0; size--) {
            if (this.f13350e.get(size).get("premium_notification") != null) {
                return size;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public int m13606d(int i) {
        return i - mo9738c();
    }

    /* renamed from: f */
    public int mo9741f() {
        if (mo9739d() >= 0 && mo9738c() >= 0) {
            return (mo9739d() - mo9738c()) + 1;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo9735a(View view, int i) {
        view.measure(-1, -2);
        int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = 0;
        view.setVisibility(0);
        C2942s sVar = new C2942s(this, measuredHeight, view);
        sVar.setAnimationListener(new C3252t(this, i));
        sVar.setDuration(200);
        view.startAnimation(sVar);
    }

    /* renamed from: a */
    public void mo9734a(View view) {
        view.measure(-1, -2);
        int measuredHeight = view.getMeasuredHeight();
        view.getLayoutParams().height = measuredHeight;
        C3253u uVar = new C3253u(this, measuredHeight, view);
        uVar.setAnimationListener(new C3254v(this, view));
        uVar.setDuration(200);
        view.startAnimation(uVar);
    }

    /* renamed from: g */
    public void mo9742g() {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_back_from_clipboard"), 0);
        Engine.getInstance().processEvent();
    }
}
