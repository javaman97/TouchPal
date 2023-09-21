package com.cootek.smartinput5.p066ui.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.C2894d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.InvitationDialog */
public class InvitationDialog extends C1976b {

    /* renamed from: a */
    public static final String f13456a = "InvitationDialog.EXTRA_NEGATIVE_BUTTON_ACTION";

    /* renamed from: b */
    public static final int f13457b = 0;

    /* renamed from: c */
    public static final int f13458c = 1;

    /* renamed from: d */
    public static final int f13459d = 2;

    /* renamed from: e */
    public static final String f13460e = "InvitationDialog.EXTRA_DISABLE_FOR_TEMP_RECOVER";

    /* renamed from: f */
    public static boolean f13461f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Context f13462g;

    /* renamed from: h */
    private Window f13463h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public EditText f13464i;

    /* renamed from: j */
    private String[] f13465j;

    /* renamed from: k */
    private Dialog f13466k;

    /* renamed from: l */
    private TextView f13467l;

    /* renamed from: m */
    private Button f13468m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f13469n = null;

    /* renamed from: o */
    private int f13470o;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13462g = this;
        requestWindowFeature(1);
        Intent intent = getIntent();
        this.f13469n = getResString(R.string.invitation_twitter_msg);
        this.f13470o = intent.getIntExtra(f13456a, 2);
        this.f13463h = getWindow();
        this.f13463h.setBackgroundDrawable(new ColorDrawable(0));
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.invitation_dlg, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_tip);
        this.f13464i = (EditText) inflate.findViewById(R.id.et_invitation_code);
        this.f13467l = (TextView) inflate.findViewById(R.id.active_way_tips);
        this.f13468m = (Button) inflate.findViewById(R.id.active_by_twitter);
        Button button = (Button) inflate.findViewById(R.id.active_by_code);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.active_by_code_layout);
        String str = "V5";
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
        }
        textView.setText(getResString(R.string.invitation_tip, str));
        if (TextUtils.isEmpty(this.f13469n) || !C1132b.m5654a(this.f13462g).mo4392a(C1135d.INVITATION_WITH_TWITTER, (Boolean) true).booleanValue()) {
            this.f13467l.setVisibility(8);
            this.f13468m.setVisibility(8);
            button.setVisibility(8);
            linearLayout.setVisibility(0);
            new Handler().postDelayed(new C2996aK(this), 700);
        } else {
            button.setOnClickListener(new C2997aL(this, linearLayout));
            this.f13468m.setOnClickListener(new C2998aM(this));
        }
        C2894d.C2895a aVar = new C2894d.C2895a(this);
        aVar.setTitle(C1974m.m9063a((Context) this, C1593bR.m7162a().mo6232a(16)));
        aVar.setIcon(R.drawable.icon_small);
        aVar.setView(inflate);
        Button button2 = (Button) inflate.findViewById(R.id.negative_button);
        switch (this.f13470o) {
            case 0:
                button2.setText(getResString(R.string.invitation_apply_code));
                button2.setOnClickListener(new C2999aN(this));
                break;
            case 1:
                button2.setText(getResString(R.string.invitation_download_stable));
                button2.setOnClickListener(new C3000aO(this));
                break;
            case 2:
                button2.setText(getResString(R.string.cancel));
                button2.setOnClickListener(new C3001aP(this));
                break;
            default:
                button2.setVisibility(8);
                break;
        }
        ((Button) inflate.findViewById(R.id.active_button)).setOnClickListener(new C3002aQ(this));
        aVar.setOnCancelListener(new C3003aR(this));
        this.f13466k = aVar.create();
        this.f13466k.setCanceledOnTouchOutside(false);
        this.f13466k.show();
        if (Engine.isInitialized()) {
            Engine.getInstance().onInvitationDialogShown();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9865a() {
        Editable text = this.f13464i.getText();
        if (text == null) {
            return false;
        }
        String obj = text.toString();
        if (this.f13465j == null) {
            this.f13465j = C1974m.m9070b(this.f13462g, R.array.invitation_code_list);
            String a = C1132b.m5654a(this.f13462g).mo4402a(C1135d.INVITATION_CODE, "");
            if (!TextUtils.isEmpty(a)) {
                this.f13465j = new String[]{a};
            }
        }
        for (String equalsIgnoreCase : this.f13465j) {
            if (obj.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.f13466k.show();
        if (Engine.isInitialized()) {
            Engine.getInstance().onInvitationDialogShown();
            super.onResume();
            return;
        }
        super.onResume();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f13466k.dismiss();
        if (Engine.isInitialized()) {
            Engine.getInstance().onInvitationDialogHidden();
            super.onPause();
            return;
        }
        super.onPause();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f13466k.dismiss();
        if (Engine.isInitialized()) {
            Engine.getInstance().onInvitationDialogHidden();
        }
        super.onDestroy();
    }
}
