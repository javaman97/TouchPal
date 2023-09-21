package com.cootek.smartinput5.func.resource.p055ui;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.cootek.smartinput5.func.resource.C1963b;
import com.cootek.smartinput5.func.resource.C1969h;
import com.emoji.keyboard.touchpal.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.cootek.smartinput5.func.resource.ui.TPreferenceScreen */
public class TPreferenceScreen extends PreferenceGroup implements DialogInterface.OnDismissListener, AdapterView.OnItemClickListener {
    private Class<?> mAdapterClazz = null;
    private Drawable mBackroundDrawable;
    private Dialog mDialog;
    private Drawable mDivider = null;
    private ListView mListView;
    private int mPaddingBottom = 0;
    private int mPaddingLeft = 0;
    private int mPaddingRight = 0;
    private int mPaddingTop = 0;
    private ListAdapter mRootAdapter;

    public TPreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842891);
        init(context, attributeSet);
    }

    public TPreferenceScreen(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        C1963b.m9042a(context, this, attributeSet);
    }

    private Class<?> getAdapterClass() {
        if (this.mAdapterClazz == null) {
            try {
                this.mAdapterClazz = Class.forName("android.preference.PreferenceGroupAdapter");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return this.mAdapterClazz;
    }

    public ListAdapter getRootAdapter() {
        if (this.mRootAdapter == null) {
            try {
                Constructor<?> constructor = getAdapterClass().getConstructor(new Class[]{PreferenceGroup.class});
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(new Object[]{this});
                if (newInstance != null) {
                    this.mRootAdapter = (ListAdapter) newInstance;
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
            } catch (InstantiationException e4) {
                e4.printStackTrace();
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
        return this.mRootAdapter;
    }

    public void onClick() {
        if (getIntent() == null && getPreferenceCount() != 0) {
            showDialog((Bundle) null);
        }
    }

    private void showDialog(Bundle bundle) {
        if (this.mDialog == null || !this.mDialog.isShowing()) {
            Context context = getContext();
            if (this.mListView != null) {
                this.mListView.setAdapter((ListAdapter) null);
            }
            View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.preference_list_fragment, (ViewGroup) null);
            if (inflate != null) {
                this.mListView = (ListView) inflate.findViewById(16908298);
            }
            if (this.mListView != null) {
                this.mListView.setOnItemClickListener(this);
                this.mListView.setDivider(this.mDivider);
                this.mListView.setAdapter(getRootAdapter());
                this.mListView.setBackgroundDrawable(this.mBackroundDrawable);
                this.mListView.setPadding(this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom);
            }
            onAttachedToActivity();
            doShowDialog(context, inflate, bundle);
        }
    }

    private void doShowDialog(Context context, View view, Bundle bundle) {
        Dialog dialog = new Dialog(context, R.style.Preference);
        this.mDialog = dialog;
        CharSequence title = getTitle();
        if (TextUtils.isEmpty(title)) {
            dialog.getWindow().requestFeature(1);
        } else {
            dialog.setTitle(title);
        }
        dialog.setContentView(view);
        dialog.setOnDismissListener(this);
        if (bundle != null) {
            dialog.onRestoreInstanceState(bundle);
        }
        try {
            dialog.show();
        } catch (Exception e) {
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.mDialog = null;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListView listView;
        if (adapterView instanceof ListView) {
            listView = (ListView) adapterView;
            i -= listView.getHeaderViewsCount();
        } else {
            listView = null;
        }
        Object item = getRootAdapter().getItem(i);
        if (item instanceof Preference) {
            if (item instanceof TPreferenceScreen) {
                ((TPreferenceScreen) item).updateListParams(listView);
            }
            clickPreference((Preference) item);
        }
    }

    private void clickPreference(Preference preference) {
        if (preference.isEnabled()) {
            C1969h.m9053a(Preference.class, preference, "onClick", (Object) null);
            Preference.OnPreferenceClickListener onPreferenceClickListener = preference.getOnPreferenceClickListener();
            if (onPreferenceClickListener == null || !onPreferenceClickListener.onPreferenceClick(preference)) {
                notifyChanged();
                Intent intent = preference.getIntent();
                if (intent != null) {
                    try {
                        preference.getContext().startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean isOnSameScreenAsChildren() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Dialog dialog = this.mDialog;
        if (dialog == null || !dialog.isShowing()) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        savedState.f6739a = true;
        savedState.f6740b = dialog.onSaveInstanceState();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f6739a) {
            showDialog(savedState.f6740b);
        }
    }

    /* renamed from: com.cootek.smartinput5.func.resource.ui.TPreferenceScreen$SavedState */
    private static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1975a();

        /* renamed from: a */
        boolean f6739a;

        /* renamed from: b */
        Bundle f6740b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z = true;
            this.f6739a = parcel.readInt() != 1 ? false : z;
            this.f6740b = parcel.readBundle();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6739a ? 1 : 0);
            parcel.writeBundle(this.f6740b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyChanged() {
        super.notifyChanged();
    }

    /* access modifiers changed from: protected */
    public void notifyHierarchyChanged() {
        super.notifyHierarchyChanged();
    }

    public void updateListParams(ListView listView) {
        if (listView != null) {
            this.mBackroundDrawable = listView.getBackground();
            this.mDivider = listView.getDivider();
            this.mPaddingLeft = listView.getPaddingLeft();
            this.mPaddingRight = listView.getPaddingRight();
            this.mPaddingTop = listView.getPaddingTop();
            this.mPaddingBottom = listView.getPaddingBottom();
        }
    }
}
