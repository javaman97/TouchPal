package com.cootek.smartinput5.func.p051a;

import android.text.TextUtils;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

/* renamed from: com.cootek.smartinput5.func.a.f */
/* compiled from: HttpResponseHandler */
public class C1381f implements ResponseHandler<Object> {
    public Object handleResponse(HttpResponse httpResponse) throws ClientProtocolException, IOException {
        String entityUtils = EntityUtils.toString(httpResponse.getEntity(), Utils.UTF8);
        if (TextUtils.isEmpty(entityUtils)) {
            return false;
        }
        return entityUtils;
    }
}
