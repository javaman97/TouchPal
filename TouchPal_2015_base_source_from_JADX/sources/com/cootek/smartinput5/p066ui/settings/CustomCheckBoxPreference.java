package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.CustomCheckBoxPreference */
public class CustomCheckBoxPreference extends CustomizablePreference {
    protected CheckBox mCheckBox;
    private int mCheckBoxVisibility = 0;
    /* access modifiers changed from: private */
    public boolean mChecked;
    protected View mContentView;
    private Context mContext;
    protected int mCustomBtnDrawableResId = 0;
    protected boolean mCustomBtnEnable = true;
    protected int mCustomBtnTextColor = -1;
    protected int mCustomBtnTextResId = 0;
    protected boolean mCustomBtnVisible = false;
    protected TextView mCustomButton;
    protected ImageView mCustomView;
    protected int mCustomViewDrawableResId;
    protected boolean mCustomViewEnable = true;
    protected boolean mCustomViewVisible = true;
    protected C2952a mOnClickButtonListener;
    protected C2953b mOnClickCustomListener;
    protected View mWidgetFrame;

    /* renamed from: com.cootek.smartinput5.ui.settings.CustomCheckBoxPreference$a */
    public interface C2952a {
        /* renamed from: a */
        void mo9788a(CustomCheckBoxPreference customCheckBoxPreference);
    }

    /* renamed from: com.cootek.smartinput5.ui.settings.CustomCheckBoxPreference$b */
    public interface C2953b {
        /* renamed from: a */
        void mo9789a(CustomCheckBoxPreference customCheckBoxPreference);
    }

    public CustomCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.CustomCheckBoxPreference);
        this.mCustomViewEnable = obtainStyledAttributes.getBoolean(1, true);
        this.mCustomViewVisible = obtainStyledAttributes.getBoolean(0, true);
        this.mCustomViewDrawableResId = obtainStyledAttributes.getResourceId(2, 0);
        this.mCustomBtnVisible = obtainStyledAttributes.getBoolean(3, false);
        this.mCustomBtnDrawableResId = obtainStyledAttributes.getResourceId(4, 0);
        this.mCustomBtnTextResId = obtainStyledAttributes.getResourceId(5, 0);
        obtainStyledAttributes.recycle();
    }

    public CustomCheckBoxPreference(Context context) {
        super(context, (AttributeSet) null);
        this.mContext = context;
    }

    public View getContentView() {
        return this.mContentView;
    }

    public void setChecked(boolean z) {
        this.mChecked = z;
        if (this.mCheckBox != null) {
            this.mCheckBox.setChecked(z);
        }
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    public void setCheckBoxVisibility(int i) {
        this.mCheckBoxVisibility = i;
    }

    public void setCustomViewDrawable(int i) {
        this.mCustomViewDrawableResId = i;
    }

    public void setCustomViewEnable(boolean z) {
        this.mCustomViewEnable = z;
        if (this.mCustomView != null) {
            this.mCustomView.setEnabled(this.mCustomViewEnable);
        }
    }

    public void setCustomViewVisible(boolean z) {
        this.mCustomViewVisible = z;
    }

    public void setCustomButtonEnable(boolean z) {
        this.mCustomBtnEnable = z;
        if (this.mCustomButton != null) {
            this.mCustomButton.setEnabled(this.mCustomBtnEnable);
        }
    }

    public void setCustomButtonVisible(boolean z) {
        this.mCustomBtnVisible = z;
    }

    public void setCustomButtonBgDrawable(int i) {
        this.mCustomBtnDrawableResId = i;
    }

    public void setCustomButtonText(int i) {
        this.mCustomBtnTextResId = i;
    }

    public void setCustomViewOnClickListener(C2953b bVar) {
        this.mOnClickCustomListener = bVar;
    }

    public void setCustomButtonOnClickListener(C2952a aVar) {
        this.mOnClickButtonListener = aVar;
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        this.mContentView = view;
        this.mCustomView = (ImageView) view.findViewById(R.id.custom);
        if (this.mCustomView != null) {
            if (this.mCustomViewVisible) {
                if (this.mCustomViewDrawableResId > 0) {
                    this.mCustomView.setImageResource(this.mCustomViewDrawableResId);
                }
                this.mCustomView.setVisibility(0);
                this.mCustomView.setEnabled(this.mCustomViewEnable);
                this.mCustomView.setOnClickListener(new C3022ah(this));
            } else {
                this.mCustomView.setVisibility(8);
            }
        }
        this.mCustomButton = (TextView) view.findViewById(R.id.custom_btn);
        if (this.mCustomButton != null) {
            if (this.mCustomBtnVisible) {
                if (this.mCustomBtnDrawableResId > 0) {
                    this.mCustomButton.setBackgroundResource(this.mCustomBtnDrawableResId);
                }
                if (this.mCustomBtnTextResId > 0) {
                    this.mCustomButton.setText(this.mCustomBtnTextResId);
                }
                this.mCustomButton.setVisibility(0);
                this.mCustomButton.setEnabled(this.mCustomBtnEnable);
                this.mCustomButton.setOnClickListener(new C3023ai(this));
            } else {
                this.mCustomButton.setVisibility(8);
            }
        }
        this.mWidgetFrame = this.mContentView.findViewById(16908312);
        if (this.mWidgetFrame != null) {
            this.mWidgetFrame.setOnTouchListener(new C3024aj(this));
            this.mWidgetFrame.setFocusable(false);
        }
        this.mContentView.setOnTouchListener(new C3025ak(this));
        this.mCheckBox = (CheckBox) view.findViewById(R.id.checkbox);
        if (this.mCheckBox != null) {
            this.mCheckBox.setFocusable(false);
            this.mCheckBox.setOnClickListener(new C3026al(this));
            this.mCheckBox.setOnCheckedChangeListener(new C3027am(this));
            this.mCheckBox.setChecked(this.mChecked);
            this.mCheckBox.setVisibility(this.mCheckBoxVisibility);
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
        layoutInflater.inflate(R.layout.custom_checkbox, linearLayout);
        linearLayout.addView(inflate);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public void onClick() {
        this.mCheckBox.toggle();
        super.onClick();
    }
}
