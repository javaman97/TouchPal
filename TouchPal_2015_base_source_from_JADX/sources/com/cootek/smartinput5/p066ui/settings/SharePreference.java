package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.SharePreference */
public class SharePreference extends CustomizablePreference {
    private int mBackgroundColor;
    private ViewGroup mContent;
    protected Context mContext;
    private ImageView mImageView;
    private int mImgRes;
    private String mSummary;
    private TextView mSummaryView;
    private String mTitle;
    private TextView mTitleView;

    public SharePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public SharePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public SharePreference(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        setLayoutResource(R.layout.share_limit);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        this.mTitleView = (TextView) view.findViewById(R.id.title);
        this.mTitleView.setSingleLine(false);
        this.mSummaryView = (TextView) view.findViewById(R.id.summary);
        this.mImageView = (ImageView) view.findViewById(R.id.share_img);
        this.mContent = (ViewGroup) view.findViewById(R.id.share_frame);
        updateContent();
    }

    public void setTitle(int i) {
        setTitle(this.mContext.getResources().getString(i));
    }

    public void setTitle(String str) {
        this.mTitle = str;
        updateContent();
    }

    public void setSummary(int i) {
        setSummary(this.mContext.getResources().getString(i));
    }

    public void setSummary(String str) {
        this.mSummary = str;
        updateContent();
    }

    public void setImageRes(int i) {
        this.mImgRes = i;
        updateContent();
    }

    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
        updateContent();
    }

    private void updateContent() {
        if (!(this.mTitleView == null || this.mTitle == null)) {
            this.mTitleView.setText(this.mTitle);
        }
        if (this.mSummaryView != null) {
            if (this.mSummary != null) {
                this.mSummaryView.setText(this.mSummary);
                this.mSummaryView.setVisibility(0);
            } else {
                this.mSummaryView.setVisibility(8);
            }
        }
        if (this.mImageView != null) {
            if (this.mImgRes != 0) {
                this.mImageView.setBackgroundResource(this.mImgRes);
                this.mImageView.setVisibility(0);
            } else {
                this.mImageView.setVisibility(8);
            }
        }
        if (this.mContent != null) {
            this.mContent.setBackgroundColor(this.mBackgroundColor);
        }
    }
}
