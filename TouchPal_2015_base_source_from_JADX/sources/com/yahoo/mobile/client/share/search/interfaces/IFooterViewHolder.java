package com.yahoo.mobile.client.share.search.interfaces;

import java.util.List;

public interface IFooterViewHolder {
    void addTab(ISearchVertical iSearchVertical);

    void onTabChanged(float f);

    void setTabController(ITabController iTabController);

    void setTabs(List<ISearchVertical> list);
}
