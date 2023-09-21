package com.yahoo.mobile.client.share.search.p099ui;

/* renamed from: com.yahoo.mobile.client.share.search.ui.TabBarInterFace */
public interface TabBarInterFace {
    public static final int HIDE = 0;
    public static final int SHOW = 1;

    void hideBottomTabBar(boolean z);

    void onTabChanged();

    void showBottomTabBar(boolean z);
}
