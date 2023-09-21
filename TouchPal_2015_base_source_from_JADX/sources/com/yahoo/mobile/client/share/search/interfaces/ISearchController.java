package com.yahoo.mobile.client.share.search.interfaces;

public interface ISearchController {
    void clearQueryString();

    void goBack();

    boolean isVoiceSearchAvailable();

    void startVoiceSearch();

    void submitQueryString(String str);
}
