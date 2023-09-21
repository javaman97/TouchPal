package com.appsflyer;

import java.util.Map;

public interface ReferrerListener {
    void onReferrerNotFound();

    void onReferrerReceived(Map<String, String> map);
}
