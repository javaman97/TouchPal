package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.cootek.smartinput5.func.C1593bR;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.PluginPreference */
public class PluginPreference extends CustomizablePreference {
    /* access modifiers changed from: private */
    public boolean mChecked;
    private View mContentView;
    private Context mContext;
    private boolean mEnableUninstall = false;
    /* access modifiers changed from: private */
    public C2969a mOnClickListener;
    private boolean mSelected = false;
    /* access modifiers changed from: private */
    public CheckBox mViewCheck;
    /* access modifiers changed from: private */
    public View mViewPos;
    private ImageView mViewUninstall;
    /* access modifiers changed from: private */
    public View mWidgetFrame;

    /* renamed from: com.cootek.smartinput5.ui.settings.PluginPreference$a */
    public interface C2969a {
        /* renamed from: a */
        void mo9934a(PluginPreference pluginPreference);

        /* renamed from: b */
        void mo9935b(PluginPreference pluginPreference);
    }

    public PluginPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mContext = context;
    }

    public PluginPreference(Context context) {
        super(context, (AttributeSet) null);
        this.mContext = context;
    }

    public View getContentView() {
        return this.mContentView;
    }

    public void setOnClickListener(C2969a aVar) {
        this.mOnClickListener = aVar;
    }

    public void setSelected(boolean z) {
        this.mSelected = z;
        updateSelect();
    }

    public boolean isSelected() {
        return this.mSelected;
    }

    public void setChecked(boolean z) {
        this.mChecked = z;
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    public void setEnableUninstall(boolean z) {
        this.mEnableUninstall = z;
    }

    private void updateSelect() {
        if (this.mContentView == null) {
            return;
        }
        if (this.mSelected) {
            this.mContentView.setBackgroundColor(-3355444);
        } else {
            this.mContentView.setBackgroundColor(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        this.mContentView = view;
        updateSelect();
        this.mContentView.setOnTouchListener(new C3057bN(this));
        this.mViewPos = view.findViewById(R.id.custom_btn);
        this.mViewPos.setVisibility(0);
        this.mViewPos.setBackgroundResource(R.drawable.key_btn_move);
        if (this.mViewPos != null) {
            this.mViewPos.setOnClickListener(new C3058bO(this));
            this.mViewPos.setFocusable(false);
        }
        this.mViewUninstall = (ImageView) view.findViewById(R.id.custom);
        if (this.mViewUninstall != null) {
            this.mViewUninstall.setVisibility(C1593bR.m7162a().mo6232a(4));
            this.mViewUninstall.setImageResource(R.drawable.key_btn_uninstall_ctrl);
            if (this.mEnableUninstall) {
                this.mViewUninstall.setOnClickListener(new C3059bP(this));
            } else {
                this.mViewUninstall.setVisibility(8);
                this.mViewUninstall.setEnabled(false);
            }
            this.mViewUninstall.setFocusable(false);
        }
        this.mWidgetFrame = this.mContentView.findViewById(16908312);
        if (this.mWidgetFrame != null) {
            this.mWidgetFrame.setOnTouchListener(new C3060bQ(this));
            this.mWidgetFrame.setFocusable(false);
        }
        this.mViewCheck = (CheckBox) view.findViewById(R.id.checkbox);
        if (this.mViewCheck != null) {
            this.mViewCheck.setClickable(false);
            this.mViewCheck.setFocusable(false);
            this.mViewCheck.setChecked(this.mChecked);
            this.mViewCheck.setOnCheckedChangeListener(new C3061bR(this));
        }
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup viewGroup) {
        int layoutResource = super.getLayoutResource();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(layoutResource, viewGroup, false);
        layoutInflater.inflate(R.layout.custom_checkbox_preference, (ViewGroup) inflate.findViewById(16908312));
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(inflate.getLayoutParams());
        linearLayout.setGravity(16);
        linearLayout.addView((CheckBox) layoutInflater.inflate(R.layout.custom_checkbox, (ViewGroup) null));
        linearLayout.addView(inflate);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public void onClick() {
        this.mViewCheck.toggle();
        super.onClick();
    }
}
