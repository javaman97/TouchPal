package com.yahoo.mobile.client.share.search.suggest;

public interface IRanking extends Comparable<IRanking> {
    String getItemId();

    String getType();
}
