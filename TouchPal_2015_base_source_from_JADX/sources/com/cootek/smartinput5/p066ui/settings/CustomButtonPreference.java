package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.CustomButtonPreference */
public class CustomButtonPreference extends CustomizablePreference {
    private int mCustomDrawableResId;
    protected boolean mCustomEnable = true;
    private ImageView mCustomView;
    protected boolean mCustomVisible = true;
    /* access modifiers changed from: private */
    public C2951a mOnCustomButtonClickListener;

    /* renamed from: com.cootek.smartinput5.ui.settings.CustomButtonPreference$a */
    public interface C2951a {
        void onCustomButtonClick(CustomButtonPreference customButtonPreference);
    }

    public CustomButtonPreference(Context context) {
        super(context);
    }

    public CustomButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setCustomViewDrawable(int i) {
        this.mCustomDrawableResId = i;
    }

    public void setCustomViewVisible(boolean z) {
        this.mCustomVisible = z;
    }

    public void setCustomViewEnable(boolean z) {
        this.mCustomEnable = z;
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        this.mCustomView = (ImageView) view.findViewById(R.id.custom);
        if (this.mCustomView != null) {
            if (this.mCustomDrawableResId > 0) {
                this.mCustomView.setImageResource(this.mCustomDrawableResId);
            }
            if (!this.mCustomVisible) {
                this.mCustomView.setVisibility(8);
            } else if (!this.mCustomEnable) {
                this.mCustomView.setVisibility(0);
                this.mCustomView.setEnabled(false);
            } else {
                this.mCustomView.setVisibility(0);
                this.mCustomView.setEnabled(true);
                this.mCustomView.setOnClickListener(new C3021ag(this));
            }
            this.mCustomView.setFocusable(false);
        }
    }

    /* access modifiers changed from: protected */
    public View onCreateView(ViewGroup viewGroup) {
        int layoutResource = super.getLayoutResource();
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(layoutResource, viewGroup, false);
        layoutInflater.inflate(R.layout.custom_button_preference, (ViewGroup) inflate.findViewById(16908312));
        return inflate;
    }

    public void setOnCustomButtonClickListener(C2951a aVar) {
        this.mOnCustomButtonClickListener = aVar;
    }
}
