package com.cootek.smartinput5.engine;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.C2117w;
import com.cootek.smartinput5.func.ClipboardManager;
import com.cootek.smartinput5.func.resource.C1974m;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ClipboardBackend implements ClipboardManager.C1341a {
    public static int CLIPBOARD_ITEM_MAX_SIZE = 10000;
    private static final String CLIP_BOARD_CACHE_FILE = "clipboard.cache";
    public static int CLIP_BOARD_EXPANDED_SLOT = 20;
    public static int CLIP_BOARD_NORMAL_SLOT = 10;
    public static int EDIT_SLOT = 10;
    public static final String EMPTY_STRING = " ";
    public static int INPUT_CACHE_SLOT = 10;
    private static final int MSG_COMMIT_TEXT = 0;
    private static final int MSG_DO_UPDATE_SELECTION = 1;
    private static final int MSG_MODIFY_CLIPBOARD = 2;
    private static final int MSG_RESET_CLIPBOARD = 3;
    private static final String TAG = "CloudManager";
    public static int clipboardSlotNum = 10;
    private static ClipboardBackend sInstance;
    private List<ClipBoardItem> clipQueue;
    private ClipboardManager mClipboardManager;
    private Context mContext;
    private Handler mHandler = new Handler() {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ClipboardBackend.this.doPaste();
                    return;
                case 1:
                    ClipboardBackend.this.doUpdateSelection();
                    return;
                case 2:
                    ClipboardBackend.this.modifyClipboard();
                    return;
                case 3:
                    ClipboardBackend.this.resetClipboard();
                    return;
                default:
                    return;
            }
        }
    };
    private boolean mModifiedClipboard = false;
    private CharSequence mOldClipboardContent;

    public ClipboardBackend(Context context) {
        this.mContext = context;
        this.mClipboardManager = C2117w.m9655a();
    }

    public static void initialize(Context context) {
        sInstance = new ClipboardBackend(context);
        try {
            sInstance.refreshClipQueue();
        } catch (IOException e) {
        }
        sInstance.refreshClipboardSlot();
    }

    public static ClipboardBackend getInstance() {
        return sInstance;
    }

    public Context getContext() {
        return this.mContext;
    }

    public void refreshClipboardSlot() {
        if (C1617br.m7367a().mo6335b()) {
            clipboardSlotNum = CLIP_BOARD_EXPANDED_SLOT;
        } else {
            clipboardSlotNum = CLIP_BOARD_NORMAL_SLOT;
        }
    }

    public void refreshClipQueue() throws IOException {
        new JSONArray();
        this.clipQueue = new ArrayList();
        File file = new File(this.mContext.getFilesDir(), CLIP_BOARD_CACHE_FILE);
        if (file.exists()) {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Utils.UTF8);
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine);
                    stringBuffer.append(C0911j.f2473c);
                } else {
                    try {
                        break;
                    } catch (JSONException e) {
                        return;
                    } finally {
                        bufferedReader.close();
                    }
                }
            }
            JSONArray optJSONArray = new JSONObject(stringBuffer.toString()).optJSONArray("body");
            if (optJSONArray != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= optJSONArray.length()) {
                        break;
                    }
                    this.clipQueue.add(new ClipBoardItem((JSONObject) optJSONArray.opt(i2)));
                    i = i2 + 1;
                }
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void update() {
        /*
            r1 = this;
            monitor-enter(r1)
            r1.updateClipQueue()     // Catch:{ JSONException -> 0x0006, IOException -> 0x0008, all -> 0x000a }
        L_0x0004:
            monitor-exit(r1)
            return
        L_0x0006:
            r0 = move-exception
            goto L_0x0004
        L_0x0008:
            r0 = move-exception
            goto L_0x0004
        L_0x000a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.engine.ClipboardBackend.update():void");
    }

    public void updateClipQueue() throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        File file = new File(this.mContext.getFilesDir(), CLIP_BOARD_CACHE_FILE);
        for (ClipBoardItem json : this.clipQueue) {
            jSONArray.put(json.toJson());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("body", jSONArray);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(jSONObject.toString());
        fileWriter.close();
    }

    public synchronized void saveClipBoardItem(CharSequence charSequence) throws IOException, JSONException {
        boolean z;
        CharSequence charSequence2;
        if (isValid(charSequence)) {
            if (!charSequence.equals(this.mOldClipboardContent)) {
                CharSequence trim = charSequence.toString().trim();
                refreshClipboardSlot();
                if (trim.length() > CLIPBOARD_ITEM_MAX_SIZE) {
                    z = true;
                    charSequence2 = trim.subSequence(0, CLIPBOARD_ITEM_MAX_SIZE - 1);
                } else {
                    z = false;
                    charSequence2 = trim;
                }
                ClipBoardItem clipBoardItem = new ClipBoardItem(charSequence2, System.currentTimeMillis());
                Iterator<ClipBoardItem> it = this.clipQueue.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().text.contentEquals(charSequence2)) {
                            break;
                        }
                    } else {
                        for (ClipBoardItem next : this.clipQueue) {
                            if (!next.locked) {
                                this.clipQueue.set(this.clipQueue.indexOf(next), clipBoardItem);
                            } else {
                                next = clipBoardItem;
                            }
                            clipBoardItem = next;
                        }
                        if (this.clipQueue.size() < clipboardSlotNum) {
                            this.clipQueue.add(clipBoardItem);
                        }
                        if (Engine.isInitialized()) {
                            Engine.getInstance().getWidgetManager().mo9610P().mo8511e();
                        }
                        if (z) {
                            Toast.makeText(this.mContext, C1974m.m9063a(this.mContext, (int) R.string.clipboard_too_long_text), 0).show();
                        }
                    }
                }
            }
        }
    }

    public synchronized List<ClipBoardItem> readClipBoardItems() throws IOException, JSONException {
        if (this.clipQueue.size() > clipboardSlotNum) {
            for (int size = this.clipQueue.size() - 1; size >= clipboardSlotNum; size--) {
                this.clipQueue.remove(size);
            }
        }
        return this.clipQueue;
    }

    public synchronized void lockClipBoardItem(int i, boolean z) {
        if (i >= 0) {
            if (i < this.clipQueue.size()) {
                this.clipQueue.get(i).locked = z;
            }
        }
    }

    public synchronized void deleteClipBoardItem(int i) {
        if (i >= 0) {
            if (i < this.clipQueue.size()) {
                this.clipQueue.remove(i);
            }
        }
    }

    public int getClipboardSlots() {
        if (this.clipQueue.size() <= clipboardSlotNum) {
            return this.clipQueue.size();
        }
        return clipboardSlotNum;
    }

    public void performPaste(int i) {
        if (i >= 0 && i < this.clipQueue.size()) {
            pasteCharSequence(this.clipQueue.get(i).text);
        }
    }

    private void pasteCharSequence(CharSequence charSequence) {
        if (Engine.isInitialized() && !TextUtils.isEmpty(charSequence)) {
            Engine.getInstance().getIms().getCurrentInputConnection().commitText(charSequence, 0);
            onItemCommitted();
        }
    }

    public void onItemCommitted() {
        if (needModifyClipboard()) {
            this.mHandler.removeMessages(2);
            this.mHandler.sendEmptyMessage(2);
        }
    }

    /* access modifiers changed from: private */
    public void doPaste() {
        if (Engine.isInitialized()) {
            Engine.getInstance().commitKeyEvent(Engine.KEYCODE_EDIT_PASTE);
            this.mHandler.removeMessages(1);
            this.mHandler.sendEmptyMessageDelayed(1, 100);
        }
    }

    /* access modifiers changed from: private */
    public void doUpdateSelection() {
        if (Engine.isInitialized()) {
            Engine.getInstance().onUpdateSelection(1);
        }
        this.mHandler.removeMessages(3);
        this.mHandler.sendEmptyMessage(3);
    }

    public boolean needModifyClipboard() {
        if (!Engine.isInitialized() || !"com.tencent.mm".equalsIgnoreCase(Engine.getInstance().getEditor().getEditorPackageName())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void modifyClipboard() {
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(1);
        if (this.mClipboardManager != null) {
            CharSequence text = this.mClipboardManager.getText(this.mContext);
            if (!" ".equals(text)) {
                this.mOldClipboardContent = text;
                this.mModifiedClipboard = true;
                this.mClipboardManager.setText(this.mContext, " ");
            }
            this.mHandler.removeMessages(0);
            this.mHandler.sendEmptyMessageDelayed(0, 100);
        }
    }

    /* access modifiers changed from: private */
    public void resetClipboard() {
        if (this.mModifiedClipboard && this.mClipboardManager != null && " ".equals(this.mClipboardManager.getText(this.mContext))) {
            this.mClipboardManager.setText(this.mContext, this.mOldClipboardContent);
            this.mModifiedClipboard = false;
        }
    }

    private boolean isValid(CharSequence charSequence) {
        if (charSequence == null || TextUtils.isEmpty(charSequence.toString().trim())) {
            return false;
        }
        return true;
    }

    public void addNewItem(CharSequence charSequence) {
        try {
            saveClipBoardItem(charSequence);
        } catch (IOException | JSONException e) {
        }
    }
}
