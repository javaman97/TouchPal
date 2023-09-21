package com.cootek.smartinput5.plugin.messagepal;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.plugin.messagepal.C2389f;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageList extends C1976b implements C2389f.C2390a {

    /* renamed from: a */
    private HashMap<String, C2383a> f10461a;

    /* renamed from: b */
    private TabHost f10462b;

    /* renamed from: c */
    private TabHost.TabContentFactory f10463c;

    /* renamed from: com.cootek.smartinput5.plugin.messagepal.MessageList$a */
    private class C2383a {

        /* renamed from: a */
        String f10464a;

        /* renamed from: b */
        String f10465b;

        /* renamed from: c */
        List<String> f10466c;

        private C2383a() {
        }

        /* synthetic */ C2383a(MessageList messageList, C2384a aVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().addFlags(131072);
        setContentView(R.layout.message_pal);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        this.f10462b = (TabHost) findViewById(16908306);
        this.f10462b.setup();
        this.f10463c = new C2384a(this);
        findViewById(R.id.buttonExit).setOnClickListener(new C2386c(this));
        this.f10461a = new HashMap<>();
        C2389f.m10925a((Context) this).mo8089a((C2389f.C2390a) this);
        m10919b();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C2389f.m10924a().mo8091b((C2389f.C2390a) this);
        this.f10461a = null;
        super.onDestroy();
        System.gc();
    }

    /* renamed from: a */
    private void m10917a(TabHost tabHost, TabHost.TabContentFactory tabContentFactory, String str, String str2) {
        TextView textView = (TextView) getLayoutInflater().inflate(R.layout.message_pal_tab_item, (ViewGroup) null);
        textView.setText(str2);
        tabHost.addTab(tabHost.newTabSpec(str).setIndicator(textView).setContent(tabContentFactory));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10916a(View view, String str) {
        ListView listView = (ListView) view.findViewById(R.id.messageListView);
        listView.setAdapter(new C2385b(this, this, R.layout.message_pal_list_item, R.id.text1, this.f10461a.get(str).f10466c));
        listView.setOnItemClickListener(new C2387d(this));
    }

    /* renamed from: b */
    private void m10919b() {
        InputStream inputStream;
        String str;
        JSONArray jSONArray;
        int length;
        String str2 = null;
        try {
            inputStream = new FileInputStream(C2389f.m10924a().mo8090b());
        } catch (Exception e) {
            inputStream = null;
        }
        if (inputStream == null) {
            try {
                inputStream = C1460o.m6799b().mo6099a((Context) this, C2389f.f10475b);
            } catch (IOException e2) {
                e2.printStackTrace();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        }
        if (inputStream != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = bufferedInputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            }
            str2 = byteArrayOutputStream.toString(Utils.UTF8);
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONArray jSONArray2 = new JSONArray(str2);
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i);
                    String string = jSONObject.getString("category");
                    String string2 = jSONObject.getString("category_alias");
                    if (TextUtils.isEmpty(string2)) {
                        str = string;
                    } else {
                        str = string2;
                    }
                    if (!TextUtils.isEmpty(string) && (length = jSONArray.length()) != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < length; i2++) {
                            arrayList.add((jSONArray = jSONObject.getJSONArray("contents")).getString(i2));
                        }
                        C2383a aVar = new C2383a(this, (C2384a) null);
                        aVar.f10464a = string;
                        aVar.f10465b = str;
                        aVar.f10466c = arrayList;
                        this.f10461a.put(string, aVar);
                        m10917a(this.f10462b, this.f10463c, aVar.f10464a, aVar.f10465b);
                    }
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo8079a() {
        this.f10462b.clearAllTabs();
        m10919b();
    }
}
