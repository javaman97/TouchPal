package com.yahoo.mobile.client.share.search.interfaces;

import android.view.View;
import android.widget.EditText;

public interface ISearchViewHolder {
    View getClearTextButton();

    EditText getSearchEditText();

    int getSearchViewHeightOffset();

    View getVoiceSearchButton();

    void onFocusChanged(EditText editText, boolean z);

    void onVoiceSearchAvailabilityChanged(boolean z);

    void setSearchController(ISearchController iSearchController);
}
