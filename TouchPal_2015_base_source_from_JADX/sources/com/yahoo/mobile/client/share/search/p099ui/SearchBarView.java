package com.yahoo.mobile.client.share.search.p099ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p001v4.app.C0167o;
import android.support.p001v4.content.C0213m;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.controllers.VoiceController;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.interfaces.ISearchController;
import com.yahoo.mobile.client.share.search.interfaces.ISearchViewHolder;
import com.yahoo.mobile.client.share.search.p099ui.ISearchBox;
import com.yahoo.mobile.client.share.search.p099ui.view.EnhancementTitleView;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.util.C4228b;
import com.yahoo.mobile.client.share.search.util.C4242g;
import com.yahoo.mobile.client.share.search.util.C4244i;
import com.yahoo.mobile.client.share.search.util.C4245j;
import java.util.HashMap;

/* renamed from: com.yahoo.mobile.client.share.search.ui.SearchBarView */
public class SearchBarView extends LinearLayout implements TextWatcher, View.OnClickListener, View.OnFocusChangeListener, TextView.OnEditorActionListener, VoiceController.IVoiceControllerListener, ISearchBox {

    /* renamed from: l */
    private static final String f16903l = SearchBarView.class.getSimpleName();

    /* renamed from: a */
    protected ISearchViewHolder f16904a;

    /* renamed from: b */
    protected EditText f16905b;

    /* renamed from: c */
    protected View f16906c;

    /* renamed from: d */
    protected View f16907d;

    /* renamed from: e */
    protected View.OnClickListener f16908e;

    /* renamed from: f */
    protected BackPressedListener f16909f;

    /* renamed from: g */
    protected SearchQuery f16910g = null;

    /* renamed from: h */
    protected SearchQuery f16911h = null;

    /* renamed from: i */
    protected SearchBoxListener f16912i;

    /* renamed from: j */
    protected String f16913j = "sch_search_screen";

    /* renamed from: k */
    protected String f16914k = "";
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C0167o f16915m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f16916n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public SearchQuery f16917o;

    /* renamed from: p */
    private Runnable f16918p;

    /* renamed from: q */
    private EnhancementTitleView f16919q;

    /* renamed from: r */
    private ISearchBox.QueryAction f16920r = ISearchBox.QueryAction.NOTHING;

    /* renamed from: s */
    private BroadcastReceiver f16921s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public VoiceController f16922t = null;

    /* renamed from: com.yahoo.mobile.client.share.search.ui.SearchBarView$BackPressedListener */
    public interface BackPressedListener {
        void onBackPressed();
    }

    public SearchBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16915m = (C0167o) context;
        inflate(context, C4073a.C4083j.yssdk_enhancement_title, this);
        this.f16919q = (EnhancementTitleView) getChildAt(0);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f16922t = new VoiceController(this.f16915m, this);
        this.f16921s = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                Bundle extras = intent.getExtras();
                String string = extras.getString("view_content");
                if (string == null) {
                    return;
                }
                if (string.equalsIgnoreCase("fragment_changed")) {
                    SearchBarView.this.f16913j = C4242g.m17772a(SearchBarView.this.f16915m, (String) ((HashMap) extras.getSerializable("properties")).get("target_fragment"));
                    if (TextUtils.isEmpty(SearchBarView.this.f16913j)) {
                        SearchBarView.this.f16913j = "sch_search_screen";
                    }
                } else if (string.equalsIgnoreCase("update_buckets")) {
                    if (!SearchBarView.this.f16916n && SearchBarView.this.f16922t != null) {
                        SearchBarView.this.f16922t.destroyVoiceRecognizer();
                    }
                    VoiceController unused = SearchBarView.this.f16922t = new VoiceController(SearchBarView.this.f16915m, SearchBarView.this);
                    SearchBarView.this.mo15495a(SearchBarView.this.f16922t);
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0213m.m882a((Context) this.f16915m).mo694a(this.f16921s);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0213m.m882a((Context) this.f16915m).mo695a(this.f16921s, new IntentFilter("LocalBroadcast"));
    }

    /* renamed from: a */
    public final void mo15493a(int i) {
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i, this, false);
        if (!(inflate instanceof ISearchViewHolder)) {
            throw new IllegalArgumentException(inflate + " does not implement ISearchViewHolder.");
        } else if (((ISearchViewHolder) inflate).getSearchEditText() == null) {
            throw new IllegalArgumentException(inflate + " cannot return null from getSearchEditText().");
        } else {
            if (this.f16904a != null) {
                removeView((View) this.f16904a);
            }
            this.f16904a = (ISearchViewHolder) inflate;
            addView(inflate, 0);
            this.f16904a.setSearchController(new ISearchController() {
                public final void submitQueryString(String str) {
                    SearchBarView.this.f16905b.setText(str);
                    SearchBarView.this.submitQuery();
                }

                public final void clearQueryString() {
                    SearchBarView.this.mo15504f();
                }

                public final boolean isVoiceSearchAvailable() {
                    return SearchBarView.this.f16922t.isVoiceAvailable();
                }

                public final void startVoiceSearch() {
                    SearchBarView.this.mo15501d();
                }

                public final void goBack() {
                    SearchBarView.this.mo15500c();
                }
            });
            this.f16905b = this.f16904a.getSearchEditText();
            this.f16905b.setOnFocusChangeListener(this);
            this.f16905b.addTextChangedListener(this);
            this.f16905b.setOnEditorActionListener(this);
            this.f16905b.setOnClickListener(this);
            this.f16905b.setOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    SearchBarView.this.mo15503e();
                    return false;
                }
            });
            this.f16906c = this.f16904a.getVoiceSearchButton();
            if (this.f16906c != null) {
                this.f16906c.setOnClickListener(this);
            }
            this.f16907d = this.f16904a.getClearTextButton();
            if (this.f16907d != null) {
                this.f16907d.setOnClickListener(this);
            }
            mo15503e();
            hideKeyboard();
        }
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (textView == this.f16905b) {
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 6:
                    if (this.f16912i == null) {
                        return true;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("query", this.f16905b.getText());
                    hashMap.put("sch_mthd", "text");
                    C4242g.m17773a(980778382, "sch_submit_query", hashMap);
                    submitQuery();
                    return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15495a(VoiceController voiceController) {
        mo15503e();
        if (this.f16904a != null) {
            this.f16904a.onVoiceSearchAvailabilityChanged(voiceController.isVoiceAvailable());
        }
    }

    public SearchBoxListener getSearchBoxListener() {
        return this.f16912i;
    }

    public void setSearchBoxListener(SearchBoxListener searchBoxListener) {
        this.f16912i = searchBoxListener;
    }

    public void setEnhancementTitle(String str) {
        this.f16919q.mo15826a(str);
    }

    public int getSearchBoxHeight() {
        return Utils.getViewHeight(this) + this.f16904a.getSearchViewHeightOffset();
    }

    public SearchQuery getQuery() {
        return new SearchQuery(new SearchQuery.Builder().setQueryString(m17539g()).setCursorPosition(this.f16905b.getSelectionEnd()));
    }

    /* renamed from: g */
    private String m17539g() {
        return this.f16905b.getText().toString();
    }

    /* renamed from: a */
    public final VoiceController mo15492a() {
        return this.f16922t;
    }

    public void setQuery(SearchQuery searchQuery) {
        m17535a(searchQuery.getQueryString());
    }

    /* renamed from: a */
    private void m17535a(String str) {
        this.f16905b.setText(str);
        this.f16905b.setSelection(str.length());
    }

    /* renamed from: a */
    public final void mo15494a(View.OnClickListener onClickListener) {
        this.f16908e = onClickListener;
    }

    /* renamed from: a */
    public final void mo15496a(BackPressedListener backPressedListener) {
        this.f16909f = backPressedListener;
    }

    public boolean isShown() {
        return super.isShown();
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (4 == keyEvent.getKeyCode()) {
                if (this.f16905b.hasFocus()) {
                    requestFocus();
                    hideKeyboard();
                    m17541i();
                    return true;
                }
                if (this.f16909f != null) {
                    this.f16909f.onBackPressed();
                }
                requestFocus();
                hideKeyboard();
            } else if (66 == keyEvent.getKeyCode()) {
                submitQuery();
            }
        }
        return false;
    }

    public void submitQuery(SearchQuery.SearchQueryAction searchQueryAction) {
        synchronized (this) {
            String g = m17539g();
            if (g != null && !g.trim().isEmpty()) {
                this.f16920r = ISearchBox.QueryAction.SUBMITTED;
                this.f16910g = new SearchQuery(new SearchQuery.Builder(getQuery()).setQueryAction(searchQueryAction).isVoiceSearch(searchQueryAction == SearchQuery.SearchQueryAction.VOICE));
                this.f16912i.onQuerySubmitted(this, this.f16910g);
                this.f16911h = this.f16910g;
                requestFocus();
                m17541i();
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getRepeatCount() == 0) {
            m17541i();
        }
        return this.f16905b.onKeyDown(i, keyEvent);
    }

    public boolean setFocus() {
        mo15498b();
        setCursorVisible(true);
        return m17542j();
    }

    public void hideKeyboard() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f16905b.getWindowToken(), 0);
    }

    /* renamed from: b */
    public final void mo15498b() {
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.f16905b, 0);
    }

    public void onFocusChange(View view, boolean z) {
        synchronized (this) {
            if (z) {
                new C4244i(getContext()).mo15879a();
                setCursorVisible(true);
                postDelayed(new Runnable() {
                    public final void run() {
                        SearchBarView.this.mo15498b();
                    }
                }, 750);
            } else {
                if (this.f16920r == ISearchBox.QueryAction.NOTHING) {
                    m17540h();
                }
                postDelayed(new Runnable() {
                    public final void run() {
                        SearchBarView.this.hideKeyboard();
                    }
                }, 500);
                m17541i();
            }
            if (this.f16904a != null) {
                this.f16904a.onFocusChanged(this.f16905b, z);
            }
        }
        this.f16920r = ISearchBox.QueryAction.NOTHING;
        this.f16912i.onFocusChange(this, z);
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.length() > 0) {
            if (this.f16910g == null || !this.f16910g.getQueryString().equals(charSequence.toString()) || this.f16920r != ISearchBox.QueryAction.CANCELED) {
                mo15503e();
            } else {
                m17541i();
            }
        } else if (charSequence.length() == 0) {
            mo15503e();
        }
        if (this.f16920r != ISearchBox.QueryAction.CANCELED) {
            final SearchQuery query = getQuery();
            if (!query.equals(this.f16917o)) {
                this.f16917o = query;
                if (this.f16918p != null) {
                    removeCallbacks(this.f16918p);
                }
                this.f16918p = new Runnable() {
                    public final void run() {
                        if (query.equals(SearchBarView.this.f16917o)) {
                            SearchBarView.this.f16912i.onQueryChanged(SearchBarView.this, query);
                        }
                    }
                };
                postDelayed(this.f16918p, 200);
                return;
            }
            return;
        }
        if (this.f16918p != null) {
            removeCallbacks(this.f16918p);
        }
        this.f16917o = null;
    }

    /* renamed from: c */
    public final void mo15500c() {
        if (this.f16908e != null) {
            this.f16908e.onClick(this);
            return;
        }
        this.f16920r = ISearchBox.QueryAction.CANCELED;
        m17540h();
        this.f16912i.onCancelPressed(this);
    }

    /* renamed from: d */
    public final void mo15501d() {
        if (!this.f16922t.isVoiceAvailable() || this.f16916n) {
            return;
        }
        if (!C4245j.m17787b((Context) this.f16915m)) {
            C4228b.m17752a((Context) this.f16915m);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sch_type", "voice");
        C4242g.m17773a(980778382, "sch_select_action", hashMap);
        this.f16916n = true;
        this.f16922t.startVoiceSearch();
    }

    public void onClick(View view) {
        if (view == this.f16905b) {
            setCursorVisible(true);
            mo15498b();
        } else if (view == this.f16907d) {
            mo15504f();
        } else if (view == this.f16906c) {
            mo15501d();
        }
    }

    /* renamed from: h */
    private void m17540h() {
        if (this.f16910g == null) {
            this.f16905b.setText("");
        } else if (this.f16910g.getQueryString().compareToIgnoreCase(this.f16905b.getText().toString()) != 0) {
            this.f16905b.setText(this.f16910g.getQueryString());
        }
    }

    public void setCursorVisible(boolean z) {
        this.f16905b.setCursorVisible(z);
    }

    public void submitQuery() {
        submitQuery(SearchQuery.SearchQueryAction.MANUAL);
    }

    public void clearQuery() {
        m17535a("");
        this.f16910g = null;
    }

    public void onVoiceResult(VoiceController voiceController, SearchQuery searchQuery) {
        if (!(voiceController == null || voiceController == this.f16922t)) {
            voiceController.destroyVoiceRecognizer();
        }
        this.f16914k = searchQuery.toString();
        setQuery(searchQuery);
        String str = this.f16914k;
        HashMap hashMap = new HashMap();
        hashMap.put("query", str);
        hashMap.put("sch_mthd", "voice");
        C4242g.m17773a(980778382, "sch_submit_query", hashMap);
        submitQuery(SearchQuery.SearchQueryAction.VOICE);
        onFocusChange(this, false);
    }

    public void onVoiceDialogDismissed(VoiceController voiceController) {
        if (!(voiceController == null || voiceController == this.f16922t)) {
            voiceController.destroyVoiceRecognizer();
        }
        this.f16916n = false;
        m17540h();
    }

    /* renamed from: a */
    private static void m17534a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: e */
    public final void mo15503e() {
        if (this.f16905b == null || this.f16905b.getEditableText().length() <= 0) {
            m17541i();
            return;
        }
        m17534a(this.f16907d, 0);
        m17534a(this.f16906c, 8);
    }

    /* renamed from: i */
    private void m17541i() {
        m17534a(this.f16907d, 8);
        if (this.f16922t == null || !this.f16922t.isVoiceAvailable()) {
            m17534a(this.f16906c, 8);
        } else {
            m17534a(this.f16906c, 0);
        }
    }

    /* renamed from: j */
    private boolean m17542j() {
        if (this.f16905b.requestFocus()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo15504f() {
        if (this.f16905b != null) {
            this.f16905b.setText("");
        }
        m17542j();
        post(new Runnable() {
            public final void run() {
                ((InputMethodManager) SearchBarView.this.f16915m.getSystemService("input_method")).showSoftInput(SearchBarView.this.f16905b, 1);
            }
        });
        mo15503e();
    }
}
