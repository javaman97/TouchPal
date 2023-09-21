package com.yahoo.mobile.client.share.search.interfaces;

import com.yahoo.mobile.client.share.search.SearchError;
import java.util.Map;

public interface INetworkAsync {
    public static final int METHOD_DELETE = 3;
    public static final int METHOD_GET = 0;
    public static final int METHOD_POST = 1;
    public static final int METHOD_PUT = 2;

    public interface Listener<T> {
        void onError(SearchError searchError);

        void onResponse(T t);
    }

    public interface Parser<T> {
        T parse(byte[] bArr, Map<String, String> map);
    }

    void cancelRequest(Object obj);

    <T> Object requestAsync(String str, int i, Map<String, String> map, byte[] bArr, Listener<T> listener, Parser<T> parser, int i2, String str2);
}
