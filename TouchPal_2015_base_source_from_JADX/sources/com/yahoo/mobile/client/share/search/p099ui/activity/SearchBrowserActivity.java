package com.yahoo.mobile.client.share.search.p099ui.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.plus.PlusShare;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.util.C4247l;
import com.yahoo.mobile.client.share.search.util.UrlUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: com.yahoo.mobile.client.share.search.ui.activity.SearchBrowserActivity */
public class SearchBrowserActivity extends Activity {

    /* renamed from: a */
    private static final String f17036a = SearchBrowserActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WebView f17037b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f17038c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f17039d;

    /* renamed from: e */
    private String f17040e;

    /* renamed from: f */
    private TextView f17041f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ProgressBar f17042g;

    /* renamed from: h */
    private View f17043h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextView f17044i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public TextView f17045j;

    /* renamed from: k */
    private ImageView f17046k;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.f17038c = extras.getString(SearchToLinkActivity.SOURCE_URL);
        this.f17040e = extras.getString("title");
        if (this.f17038c != null) {
            ActionBar actionBar = getActionBar();
            actionBar.setDisplayShowHomeEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowCustomEnabled(true);
            actionBar.setCustomView(C4073a.C4083j.yssdk_preview_header);
            this.f17043h = actionBar.getCustomView();
            if (this.f17043h != null) {
                this.f17044i = (TextView) this.f17043h.findViewById(C4073a.C4081h.preview_title);
                this.f17045j = (TextView) this.f17043h.findViewById(C4073a.C4081h.preview_subtitle);
                this.f17046k = (ImageView) this.f17043h.findViewById(C4073a.C4081h.preview_back_icon);
                this.f17046k.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        SearchBrowserActivity.this.m17611a();
                    }
                });
            }
            setContentView(C4073a.C4083j.ysssdk_search_browser_view);
            ((TextView) findViewById(C4073a.C4081h.tv_send_icon)).setTypeface(C4247l.m17792a(this));
            try {
                this.f17038c = URLDecoder.decode(this.f17038c, Utils.UTF8);
            } catch (UnsupportedEncodingException e) {
                String str = f17036a;
                e.getMessage();
            }
            this.f17037b = (WebView) findViewById(C4073a.C4081h.search_browser_webview);
            this.f17037b.getSettings().setJavaScriptEnabled(true);
            this.f17037b.setWebViewClient(new C4185a(this, (byte) 0));
            this.f17037b.loadUrl(this.f17038c);
            this.f17042g = (ProgressBar) findViewById(C4073a.C4081h.web_progress_spinner);
            this.f17041f = (TextView) findViewById(C4073a.C4081h.tv_send_link);
            this.f17041f.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    SearchBrowserActivity.this.m17614b();
                }
            });
            return;
        }
        m17611a();
    }

    public void onPause() {
        super.onPause();
        this.f17037b.onPause();
    }

    public void onResume() {
        super.onPause();
        this.f17037b.onResume();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C4073a.C4084k.menu_mini_browser, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        } else if (menuItem.getItemId() == C4073a.C4081h.menu_send) {
            m17614b();
        } else if (menuItem.getItemId() == C4073a.C4081h.menu_copy) {
            ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(PlusShare.KEY_CALL_TO_ACTION_LABEL, this.f17037b.getUrl()));
        } else if (menuItem.getItemId() == C4073a.C4081h.menu_open) {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (this.f17037b.getUrl() != null) {
                intent.setData(Uri.parse(this.f17037b.getUrl()));
            }
            startActivity(intent);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f17038c.equals(this.f17039d)) {
            m17611a();
        } else if (i == 4 && this.f17037b.canGoBack()) {
            this.f17037b.goBack();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17611a() {
        setResult(0, new Intent());
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m17614b() {
        Intent intent = new Intent();
        if (this.f17037b.getUrl() != null) {
            this.f17038c = this.f17037b.getUrl();
        }
        if (this.f17037b.getTitle() != null) {
            this.f17040e = this.f17037b.getTitle();
        }
        intent.putExtra(SearchToLinkActivity.SOURCE_URL, this.f17038c);
        intent.putExtra("title", this.f17040e);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: com.yahoo.mobile.client.share.search.ui.activity.SearchBrowserActivity$a */
    private class C4185a extends WebViewClient {
        private C4185a() {
        }

        /* synthetic */ C4185a(SearchBrowserActivity searchBrowserActivity, byte b) {
            this();
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            SearchBrowserActivity.this.f17042g.setVisibility(0);
            SearchBrowserActivity.this.f17044i.setText(SearchBrowserActivity.this.getResources().getString(C4073a.C4086m.yssdk_webview_loading));
            SearchBrowserActivity.this.f17045j.setText("");
            if (SearchBrowserActivity.this.f17038c == null || str == null || !str.equals(SearchBrowserActivity.this.f17038c)) {
                webView.loadUrl(str);
                String unused = SearchBrowserActivity.this.f17038c = str;
            } else {
                SearchBrowserActivity.this.f17037b.goBack();
            }
            return true;
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (SearchBrowserActivity.this.f17039d == null) {
                String unused = SearchBrowserActivity.this.f17039d = str;
            }
            String c = UrlUtils.m17745c(str);
            if (!(SearchBrowserActivity.this.f17044i == null || SearchBrowserActivity.this.f17045j == null || c.equals("r.search.yahoo.com"))) {
                SearchBrowserActivity.this.f17044i.setText(SearchBrowserActivity.this.f17037b.getTitle());
                SearchBrowserActivity.this.f17045j.setText(c);
            }
            SearchBrowserActivity.this.f17042g.setVisibility(8);
        }
    }
}
