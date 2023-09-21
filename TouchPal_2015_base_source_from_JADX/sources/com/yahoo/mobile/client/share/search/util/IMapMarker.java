package com.yahoo.mobile.client.share.search.util;

import android.os.Parcelable;

public interface IMapMarker extends Parcelable {
    double getLatitude();

    double getLongitude();

    String getSnippet();

    String getTitle();
}
