package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.cootek.smartinput5.func.at */
/* compiled from: ImageGetter */
public class C1464at implements Html.ImageGetter {

    /* renamed from: b */
    private static final String f4686b = "@(\\S+:)?drawable/\\S+";

    /* renamed from: c */
    private static final String f4687c = "@\\S+:.*";

    /* renamed from: a */
    Context f4688a;

    public C1464at(Context context) {
        this.f4688a = context;
    }

    public Drawable getDrawable(String str) {
        Drawable drawable = null;
        if (str.matches(f4686b)) {
            Resources resources = this.f4688a.getResources();
            int identifier = resources.getIdentifier(str, "drawable", str.matches(f4687c) ? null : this.f4688a.getPackageName());
            if (identifier != 0) {
                drawable = resources.getDrawable(identifier);
            }
        } else {
            try {
                InputStream openStream = new URL(str).openStream();
                if (openStream != null) {
                    drawable = Drawable.createFromStream(openStream, "");
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return drawable;
    }
}
