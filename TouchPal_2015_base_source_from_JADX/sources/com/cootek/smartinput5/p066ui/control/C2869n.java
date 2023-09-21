package com.cootek.smartinput5.p066ui.control;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p066ui.BottomBtnsFrame;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.control.n */
/* compiled from: DialogWidget */
public class C2869n {

    /* renamed from: a */
    private Context f13058a;

    /* renamed from: b */
    private View f13059b;

    /* renamed from: c */
    private Dialog f13060c;

    /* renamed from: d */
    private CharSequence f13061d;

    /* renamed from: e */
    private CharSequence f13062e;

    /* renamed from: f */
    private Drawable f13063f;

    /* renamed from: g */
    private int f13064g;

    /* renamed from: h */
    private boolean f13065h = false;

    /* renamed from: i */
    private boolean f13066i = false;

    /* renamed from: j */
    private int f13067j;

    /* renamed from: k */
    private boolean f13068k;

    /* renamed from: l */
    private View f13069l;

    /* renamed from: m */
    private Button f13070m;

    /* renamed from: n */
    private Button f13071n;

    /* renamed from: a */
    public static void m13273a(ListView listView, int i) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int count = adapter.getCount();
            if (i > count) {
                i = count;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                View view = adapter.getView(i3, (View) null, listView);
                view.measure(0, 0);
                i2 += view.getMeasuredHeight();
            }
            if (count == 0) {
                ((View) listView.getParent()).setVisibility(8);
            } else {
                ((View) listView.getParent()).setVisibility(0);
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = (listView.getDividerHeight() * (adapter.getCount() - 1)) + i2;
            listView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public static void m13272a(ListView listView) {
        m13273a(listView, listView.getAdapter().getCount());
    }

    public C2869n(Context context, boolean z, boolean z2) {
        this.f13058a = context;
        this.f13064g = context.getResources().getDimensionPixelSize(R.dimen.divider_height);
        this.f13067j = 17;
        this.f13068k = z2;
        this.f13066i = z;
        mo8658g();
    }

    /* renamed from: g */
    private void mo8658g() {
        this.f13069l = ((LayoutInflater) mo9539i().getSystemService("layout_inflater")).inflate(mo8659h(), (ViewGroup) null, false);
        mo8590a(this.f13068k);
    }

    /* renamed from: i */
    public Context mo9539i() {
        return this.f13058a;
    }

    /* renamed from: a */
    public void mo9526a(View view) {
        this.f13059b = view;
    }

    /* renamed from: j */
    public View mo9540j() {
        return this.f13059b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9533b(boolean z) {
        this.f13065h = z;
    }

    /* renamed from: h */
    private int mo8659h() {
        return this.f13066i ? R.layout.dialog_with_title : R.layout.dialog;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo9537d(int i) {
        this.f13067j = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo9521a(int i, boolean z) {
        return m13268a(this.f13058a, i, z);
    }

    /* renamed from: a */
    public static View m13268a(Context context, int i, boolean z) {
        return m13270a(context, C1974m.m9063a(context, i), z);
    }

    /* renamed from: a */
    public static View m13270a(Context context, String str, boolean z) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.paopao_single_item_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.item_text);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.item_checkbox);
        checkBox.setChecked(z);
        textView.setText(str);
        textView.setOnClickListener(new C2870o(checkBox));
        checkBox.setOnClickListener(new C2871p(checkBox));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo9529b(int i, boolean z) {
        return mo9522a(this.f13058a.getResources().getString(i), z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo9522a(String str, boolean z) {
        View inflate = ((LayoutInflater) this.f13058a.getSystemService("layout_inflater")).inflate(R.layout.paopao_multi_item_view, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.item_text);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.item_checkbox);
        checkBox.setChecked(z);
        textView.setText(str);
        textView.setOnClickListener(new C2872q(this, checkBox));
        return inflate;
    }

    /* renamed from: a */
    public void mo9524a(int i, int i2) {
        m13271a(1, new Point(i, i2));
    }

    /* renamed from: a */
    public void mo7053a() {
        m13271a(1, (Point) null);
    }

    /* renamed from: a */
    private void m13271a(int i, Point point) {
        BottomBtnsFrame bottomBtnsFrame;
        if (this.f13059b != null) {
            if (this.f13060c == null) {
                this.f13060c = mo9520a(point);
            }
            ViewGroup viewGroup = (ViewGroup) this.f13069l.findViewById(R.id.title_frame);
            if (viewGroup != null) {
                mo9527a(viewGroup);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f13069l.findViewById(R.id.content_frame);
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
                if (this.f13059b.getParent() != null) {
                    ((ViewGroup) this.f13059b.getParent()).removeView(this.f13059b);
                }
                viewGroup2.addView(this.f13059b, new ViewGroup.LayoutParams(-1, -2));
                this.f13059b.setVisibility(0);
            }
            if (this.f13068k && (bottomBtnsFrame = (BottomBtnsFrame) this.f13069l.findViewById(R.id.buttons_frame)) != null) {
                bottomBtnsFrame.mo8486a();
            }
            this.f13060c.setContentView(this.f13069l);
            int k = m13277k();
            this.f13059b.measure(0, 0);
            if (this.f13059b.getMeasuredHeight() > k) {
                ViewGroup.LayoutParams layoutParams = this.f13059b.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -2);
                }
                layoutParams.height = k;
                this.f13059b.setLayoutParams(layoutParams);
            }
            Engine.getInstance().getDialogManager().showDialog(this.f13060c, i);
        }
    }

    /* renamed from: k */
    private int m13277k() {
        int i = (this.f13058a.getResources().getDisplayMetrics().heightPixels * 3) / 4;
        if (this.f13068k) {
            View findViewById = this.f13069l.findViewById(R.id.buttons_frame);
            findViewById.measure(0, 0);
            i -= findViewById.getMeasuredHeight();
        }
        View findViewById2 = this.f13069l.findViewById(R.id.title_frame);
        if (findViewById2 == null || findViewById2.getVisibility() == 8) {
            return i;
        }
        findViewById2.measure(0, 0);
        return i - findViewById2.getMeasuredHeight();
    }

    /* renamed from: b_ */
    public void mo9534b_() {
        if (mo9536c_()) {
            Engine.getInstance().getDialogManager().dismissDialog(this.f13060c);
        }
    }

    /* renamed from: c_ */
    public boolean mo9536c_() {
        return this.f13060c != null && this.f13060c.isShowing();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Dialog mo9520a(Point point) {
        Dialog dialog = new Dialog(this.f13058a);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(mo8598e_());
        dialog.setOnCancelListener(new C2873r(this));
        dialog.setOnDismissListener(new C2874s(this));
        View findViewById = dialog.findViewById(16908310);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        Window window = dialog.getWindow();
        window.getDecorView().setBackgroundDrawable((Drawable) null);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.type = C2261Q.f9802h;
        attributes.flags = 131074;
        attributes.dimAmount = 0.5f;
        if (point != null) {
            attributes.x = point.x;
            attributes.y = point.y;
            attributes.gravity = 48;
        }
        attributes.y -= 50;
        window.setAttributes(attributes);
        return dialog;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9527a(ViewGroup viewGroup) {
        if (this.f13061d == null && this.f13063f == null) {
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.title);
        if (textView != null) {
            if (this.f13061d == null) {
                View findViewById = viewGroup.findViewById(R.id.title_line);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                textView.setVisibility(8);
            } else if (textView != null) {
                textView.setText(this.f13061d);
                textView.setGravity(this.f13067j);
                if (this.f13063f != null) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(this.f13063f, (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }
        }
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.sub_title);
        if (textView2 == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f13062e)) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(this.f13062e);
    }

    /* renamed from: a */
    public void mo9528a(CharSequence charSequence) {
        this.f13061d = charSequence;
    }

    /* renamed from: b */
    public void mo9532b(CharSequence charSequence) {
        this.f13062e = charSequence;
    }

    /* renamed from: a */
    public void mo9525a(Drawable drawable) {
        this.f13063f = drawable;
    }

    /* renamed from: b */
    public void mo9531b(ViewGroup viewGroup) {
        viewGroup.addView(m13278l(), new ViewGroup.LayoutParams(-1, this.f13064g));
    }

    /* renamed from: l */
    private View m13278l() {
        View view = new View(mo9539i());
        view.setBackgroundDrawable(mo9539i().getResources().getDrawable(R.drawable.paopao_divider));
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9535c(boolean z) {
        this.f13068k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d_ */
    public Button mo8596d_() {
        return this.f13070m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Button mo8595d() {
        return this.f13071n;
    }

    /* renamed from: a */
    private void mo8590a(boolean z) {
        BottomBtnsFrame bottomBtnsFrame;
        if (this.f13069l != null && (bottomBtnsFrame = (BottomBtnsFrame) this.f13069l.findViewById(R.id.buttons_frame)) != null) {
            if (z) {
                bottomBtnsFrame.setVisibility(0);
                this.f13070m = bottomBtnsFrame.getPositiveBtn();
                this.f13071n = bottomBtnsFrame.getNegertiveBtn();
                this.f13070m.setText(C1974m.m9063a(this.f13058a, (int) R.string.ok));
                this.f13071n.setText(C1974m.m9063a(this.f13058a, (int) R.string.cancel));
                return;
            }
            bottomBtnsFrame.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static View m13267a(Context context, int i, int i2) {
        return m13269a(context, C1974m.m9063a(context, i), i2);
    }

    /* renamed from: a */
    public static View m13269a(Context context, String str, int i) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(R.layout.dialog_with_title, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.width = context.getResources().getDimensionPixelSize(R.dimen.paopao_dialog_width);
        ((LinearLayout) inflate.findViewById(R.id.dialog_frame)).setLayoutParams(layoutParams);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        ((FrameLayout) inflate.findViewById(R.id.content_frame)).addView(layoutInflater.inflate(i, (ViewGroup) null));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo8597e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo8599f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e_ */
    public boolean mo8598e_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo9538e(int i) {
        return C1974m.m9063a(mo9539i(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo9523a(int i, Object... objArr) {
        return C1974m.m9064a(mo9539i(), i, objArr);
    }

    /* renamed from: b */
    public void mo9530b(Drawable drawable) {
        if (this.f13069l != null) {
            this.f13069l.setBackgroundDrawable(drawable);
        }
    }
}
