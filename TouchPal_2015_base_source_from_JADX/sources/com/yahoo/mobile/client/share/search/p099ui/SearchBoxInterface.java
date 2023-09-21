package com.yahoo.mobile.client.share.search.p099ui;

import android.text.TextWatcher;
import android.view.animation.Animation;

/* renamed from: com.yahoo.mobile.client.share.search.ui.SearchBoxInterface */
public interface SearchBoxInterface {
    void clearText();

    int getSearchBarHeight();

    String getSearchText();

    void hideCancelButton();

    void hideKeyboard();

    void hideKeyboardDelayed(long j);

    void hideSearchBox(Animation animation);

    boolean isShown();

    void removeTextWatcher(TextWatcher textWatcher);

    void setSearchText(String str);

    void setSearchTextWithoutTextWatcher(String str);

    void setTextWatcher(TextWatcher textWatcher);

    void showCancelButton();

    void showHideClearButton();

    void showKeyboard();

    void showSearchBox(Animation animation);

    void translateSearchBox(int i);
}
