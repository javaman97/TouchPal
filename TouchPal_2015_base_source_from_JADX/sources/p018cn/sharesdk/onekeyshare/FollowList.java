package p018cn.sharesdk.onekeyshare;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.view.C0333F;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.EnterKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p018cn.sharesdk.framework.FakeActivity;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.PlatformActionListener;
import p018cn.sharesdk.framework.TitleLayout;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.UIHandler;
import p100m.framework.p103ui.widget.asyncview.AsyncImageView;
import p100m.framework.p103ui.widget.asyncview.C4287c;
import p100m.framework.p103ui.widget.pulltorefresh.C4309l;
import p100m.framework.p103ui.widget.pulltorefresh.PullToRefreshView;

/* renamed from: cn.sharesdk.onekeyshare.FollowList */
public class FollowList extends FakeActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private FollowAdapter adapter;
    private TitleLayout llTitle;
    private EditPage page;
    private Platform platform;

    public void setPlatform(Platform platform2) {
        this.platform = platform2;
    }

    public void onCreate() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setBackgroundColor(-657931);
        linearLayout.setOrientation(1);
        this.activity.setContentView(linearLayout);
        this.llTitle = new TitleLayout(getContext());
        int bitmapRes = C0661R.getBitmapRes(getContext(), "title_back");
        if (bitmapRes > 0) {
            this.llTitle.setBackgroundResource(bitmapRes);
        }
        this.llTitle.getBtnBack().setOnClickListener(this);
        int stringRes = C0661R.getStringRes(getContext(), "multi_share");
        if (stringRes > 0) {
            this.llTitle.getTvTitle().setText(stringRes);
        }
        this.llTitle.getBtnRight().setVisibility(0);
        int stringRes2 = C0661R.getStringRes(getContext(), "finish");
        if (stringRes2 > 0) {
            this.llTitle.getBtnRight().setText(stringRes2);
        }
        this.llTitle.getBtnRight().setOnClickListener(this);
        this.llTitle.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(this.llTitle);
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams);
        linearLayout.addView(frameLayout);
        PullToRefreshView pullToRefreshView = new PullToRefreshView(getContext());
        pullToRefreshView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(pullToRefreshView);
        this.adapter = new FollowAdapter(pullToRefreshView);
        this.adapter.setPlatform(this.platform);
        pullToRefreshView.setAdapter(this.adapter);
        this.adapter.getListView().setOnItemClickListener(this);
        ImageView imageView = new ImageView(getContext());
        int bitmapRes2 = C0661R.getBitmapRes(getContext(), "title_shadow");
        if (bitmapRes2 > 0) {
            imageView.setBackgroundResource(bitmapRes2);
        }
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(imageView);
        pullToRefreshView.mo15997a(true);
    }

    public void onClick(View view) {
        int i = 0;
        String name = this.platform.getName();
        if (view.equals(this.llTitle.getBtnRight())) {
            ArrayList arrayList = new ArrayList();
            if ("SinaWeibo".equals(name)) {
                int count = this.adapter.getCount();
                while (i < count) {
                    if (this.adapter.getItem(i).checked) {
                        arrayList.add(this.adapter.getItem(i).screeName);
                    }
                    i++;
                }
            } else if ("TencentWeibo".equals(name)) {
                int count2 = this.adapter.getCount();
                while (i < count2) {
                    if (this.adapter.getItem(i).checked) {
                        arrayList.add(this.adapter.getItem(i).uid);
                    }
                    i++;
                }
            } else if ("Facebook".equals(name)) {
                int count3 = this.adapter.getCount();
                while (i < count3) {
                    if (this.adapter.getItem(i).checked) {
                        arrayList.add("[" + this.adapter.getItem(i).uid + "]");
                    }
                    i++;
                }
            } else if ("Twitter".equals(name)) {
                int count4 = this.adapter.getCount();
                while (i < count4) {
                    if (this.adapter.getItem(i).checked) {
                        arrayList.add(this.adapter.getItem(i).uid);
                    }
                    i++;
                }
            }
            this.page.onResult(arrayList);
        }
        finish();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Following item = this.adapter.getItem(i);
        item.checked = !item.checked;
        this.adapter.notifyDataSetChanged();
    }

    public void setBackPage(EditPage editPage) {
        this.page = editPage;
    }

    /* renamed from: cn.sharesdk.onekeyshare.FollowList$FollowAdapter */
    private static class FollowAdapter extends C4309l implements Handler.Callback, PlatformActionListener {
        private Bitmap bmChd;
        private Bitmap bmUnch;
        private int curPage = -1;
        private ArrayList<Following> follows = new ArrayList<>();
        private boolean hasNext = true;
        private PRTHeader llHeader = new PRTHeader(getContext());
        private HashMap<String, Following> map = new HashMap<>();
        private Platform platform;

        public FollowAdapter(PullToRefreshView pullToRefreshView) {
            super(pullToRefreshView);
            int bitmapRes = C0661R.getBitmapRes(getContext(), "auth_follow_cb_chd");
            if (bitmapRes > 0) {
                this.bmChd = BitmapFactory.decodeResource(pullToRefreshView.getResources(), bitmapRes);
            }
            int bitmapRes2 = C0661R.getBitmapRes(getContext(), "auth_follow_cb_unc");
            if (bitmapRes2 > 0) {
                this.bmUnch = BitmapFactory.decodeResource(pullToRefreshView.getResources(), bitmapRes2);
            }
        }

        public void setPlatform(Platform platform2) {
            this.platform = platform2;
            platform2.setPlatformActionListener(this);
        }

        private void next() {
            if (this.hasNext) {
                this.platform.listFriend(15, this.curPage + 1, (String) null);
            }
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            FollowListItem followListItem;
            LinearLayout linearLayout;
            if (view == null) {
                LinearLayout linearLayout2 = new LinearLayout(viewGroup.getContext());
                followListItem = new FollowListItem((FollowListItem) null);
                linearLayout2.setTag(followListItem);
                followListItem.aivIcon = new AsyncImageView(getContext());
                int dipToPx = C0661R.dipToPx(getContext(), 52);
                int dipToPx2 = C0661R.dipToPx(viewGroup.getContext(), 10);
                int dipToPx3 = C0661R.dipToPx(viewGroup.getContext(), 5);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dipToPx, dipToPx);
                layoutParams.gravity = 16;
                layoutParams.setMargins(dipToPx2, dipToPx3, dipToPx2, dipToPx3);
                followListItem.aivIcon.setLayoutParams(layoutParams);
                linearLayout2.addView(followListItem.aivIcon);
                LinearLayout linearLayout3 = new LinearLayout(viewGroup.getContext());
                linearLayout3.setPadding(0, dipToPx2, dipToPx2, dipToPx2);
                linearLayout3.setOrientation(1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                linearLayout3.setLayoutParams(layoutParams2);
                linearLayout2.addView(linearLayout3);
                followListItem.tvName = new TextView(viewGroup.getContext());
                followListItem.tvName.setTextColor(C0333F.f835s);
                followListItem.tvName.setTextSize(1, 18.0f);
                followListItem.tvName.setSingleLine();
                linearLayout3.addView(followListItem.tvName);
                followListItem.tvSign = new TextView(viewGroup.getContext());
                followListItem.tvSign.setTextColor(2130706432);
                followListItem.tvSign.setTextSize(1, 14.0f);
                followListItem.tvSign.setSingleLine();
                linearLayout3.addView(followListItem.tvSign);
                followListItem.ivCheck = new ImageView(viewGroup.getContext());
                followListItem.ivCheck.setPadding(0, 0, dipToPx2, 0);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 16;
                followListItem.ivCheck.setLayoutParams(layoutParams3);
                linearLayout2.addView(followListItem.ivCheck);
                linearLayout = linearLayout2;
            } else {
                followListItem = (FollowListItem) view.getTag();
                linearLayout = view;
            }
            Following item = getItem(i);
            followListItem.tvName.setText(item.screeName);
            followListItem.tvSign.setText(item.description);
            followListItem.ivCheck.setImageBitmap(item.checked ? this.bmChd : this.bmUnch);
            if (isFling()) {
                Bitmap b = C4287c.m17959b(item.icon);
                if (b == null || b.isRecycled()) {
                    followListItem.aivIcon.mo15977a((String) null, (int) AsyncImageView.f17445a);
                } else {
                    followListItem.aivIcon.setImageBitmap(b);
                }
            } else {
                followListItem.aivIcon.mo15976a(item.icon);
            }
            if (i == getCount() - 1) {
                next();
            }
            return linearLayout;
        }

        public Following getItem(int i) {
            return this.follows.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getCount() {
            if (this.follows == null) {
                return 0;
            }
            return this.follows.size();
        }

        public View getHeaderView() {
            return this.llHeader;
        }

        public void onPullDown(int i) {
            this.llHeader.onPullDown(i);
        }

        public void onRequest() {
            this.llHeader.onRequest();
            this.curPage = -1;
            this.hasNext = true;
            this.map.clear();
            next();
        }

        public void onCancel(Platform platform2, int i) {
            UIHandler.sendEmptyMessage(-1, this);
        }

        public void onComplete(Platform platform2, int i, HashMap<String, Object> hashMap) {
            ArrayList<Following> parseList = parseList(hashMap);
            if (parseList != null && parseList.size() > 0) {
                this.curPage++;
                Message message = new Message();
                message.what = 1;
                message.obj = parseList;
                UIHandler.sendMessage(message, this);
            }
        }

        public void onError(Platform platform2, int i, Throwable th) {
            th.printStackTrace();
        }

        private ArrayList<Following> parseList(HashMap<String, Object> hashMap) {
            boolean z;
            boolean z2 = true;
            if (hashMap == null || hashMap.size() <= 0) {
                return null;
            }
            ArrayList<Following> arrayList = new ArrayList<>();
            if ("SinaWeibo".equals(this.platform.getName())) {
                Iterator it = ((ArrayList) hashMap.get("users")).iterator();
                while (it.hasNext()) {
                    HashMap hashMap2 = (HashMap) it.next();
                    String valueOf = String.valueOf(hashMap2.get("id"));
                    if (!this.map.containsKey(valueOf)) {
                        Following following = new Following((Following) null);
                        following.uid = valueOf;
                        following.screeName = String.valueOf(hashMap2.get("name"));
                        following.description = String.valueOf(hashMap2.get("description"));
                        following.icon = String.valueOf(hashMap2.get("profile_image_url"));
                        this.map.put(following.uid, following);
                        arrayList.add(following);
                    }
                }
                if (((Integer) hashMap.get("total_number")).intValue() > this.map.size()) {
                    z = true;
                } else {
                    z = false;
                }
                this.hasNext = z;
            } else if ("TencentWeibo".equals(this.platform.getName())) {
                if (((Integer) hashMap.get("hasnext")).intValue() != 0) {
                    z2 = false;
                }
                this.hasNext = z2;
                Iterator it2 = ((ArrayList) hashMap.get("info")).iterator();
                while (it2.hasNext()) {
                    HashMap hashMap3 = (HashMap) it2.next();
                    String valueOf2 = String.valueOf(hashMap3.get("name"));
                    if (!this.map.containsKey(valueOf2)) {
                        Following following2 = new Following((Following) null);
                        following2.screeName = String.valueOf(hashMap3.get("nick"));
                        following2.uid = valueOf2;
                        ArrayList arrayList2 = (ArrayList) hashMap3.get("tweet");
                        if (0 < arrayList2.size()) {
                            following2.description = String.valueOf(((HashMap) arrayList2.get(0)).get("text"));
                        }
                        following2.icon = String.valueOf(String.valueOf(hashMap3.get("head"))) + "/100";
                        this.map.put(following2.uid, following2);
                        arrayList.add(following2);
                    }
                }
            } else if ("Facebook".equals(this.platform.getName())) {
                Iterator it3 = ((ArrayList) hashMap.get("data")).iterator();
                while (it3.hasNext()) {
                    HashMap hashMap4 = (HashMap) it3.next();
                    String valueOf3 = String.valueOf(hashMap4.get("id"));
                    if (!this.map.containsKey(valueOf3)) {
                        Following following3 = new Following((Following) null);
                        following3.uid = valueOf3;
                        following3.screeName = String.valueOf(hashMap4.get("name"));
                        HashMap hashMap5 = (HashMap) hashMap4.get("picture");
                        if (hashMap5 != null) {
                            HashMap hashMap6 = (HashMap) hashMap5.get("data");
                            if (hashMap4 != null) {
                                following3.icon = String.valueOf(hashMap6.get("url"));
                            }
                        }
                        this.map.put(following3.uid, following3);
                        arrayList.add(following3);
                    }
                }
                this.hasNext = ((HashMap) hashMap.get("paging")).containsKey(EnterKey.NEXT);
            } else if ("Twitter".equals(this.platform.getName())) {
                Iterator it4 = ((ArrayList) hashMap.get("users")).iterator();
                while (it4.hasNext()) {
                    HashMap hashMap7 = (HashMap) it4.next();
                    String valueOf4 = String.valueOf(hashMap7.get("screen_name"));
                    if (!this.map.containsKey(valueOf4)) {
                        Following following4 = new Following((Following) null);
                        following4.uid = valueOf4;
                        following4.screeName = String.valueOf(hashMap7.get("name"));
                        following4.description = String.valueOf(hashMap7.get("description"));
                        following4.icon = String.valueOf(hashMap7.get("profile_image_url"));
                        this.map.put(following4.uid, following4);
                        arrayList.add(following4);
                    }
                }
            }
            return arrayList;
        }

        public boolean handleMessage(Message message) {
            if (message.what < 0) {
                ((Activity) getContext()).finish();
                return false;
            }
            if (this.curPage <= 0) {
                this.follows.clear();
            }
            this.follows.addAll((ArrayList) message.obj);
            notifyDataSetChanged();
            return false;
        }

        public void onReversed() {
            super.onReversed();
            this.llHeader.reverse();
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.FollowList$FollowListItem */
    private static class FollowListItem {
        public AsyncImageView aivIcon;
        public ImageView ivCheck;
        public TextView tvName;
        public TextView tvSign;

        private FollowListItem() {
        }

        /* synthetic */ FollowListItem(FollowListItem followListItem) {
            this();
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.FollowList$Following */
    private static class Following {
        public boolean checked;
        public String description;
        public String icon;
        public String screeName;
        public String uid;

        private Following() {
        }

        /* synthetic */ Following(Following following) {
            this();
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.FollowList$PRTHeader */
    private static class PRTHeader extends LinearLayout {
        private RotateImageView ivArrow;
        private ProgressBar pbRefreshing;
        private TextView tvHeader;

        public PRTHeader(Context context) {
            super(context);
            setOrientation(1);
            LinearLayout linearLayout = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            addView(linearLayout, layoutParams);
            this.ivArrow = new RotateImageView(context);
            int bitmapRes = C0661R.getBitmapRes(context, "ssdk_oks_ptr_ptr");
            if (bitmapRes > 0) {
                this.ivArrow.setImageResource(bitmapRes);
            }
            int dipToPx = C0661R.dipToPx(context, 32);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dipToPx, dipToPx);
            layoutParams2.gravity = 16;
            linearLayout.addView(this.ivArrow, layoutParams2);
            this.pbRefreshing = new ProgressBar(context);
            linearLayout.addView(this.pbRefreshing, layoutParams2);
            this.pbRefreshing.setVisibility(8);
            this.tvHeader = new TextView(getContext());
            this.tvHeader.setTextSize(1, 18.0f);
            this.tvHeader.setGravity(17);
            int dipToPx2 = C0661R.dipToPx(getContext(), 10);
            this.tvHeader.setPadding(dipToPx2, dipToPx2, dipToPx2, dipToPx2);
            this.tvHeader.setTextColor(C0333F.f835s);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 16;
            linearLayout.addView(this.tvHeader, layoutParams3);
        }

        public void onPullDown(int i) {
            int i2 = Settings.FIRST_TUTORIAL_WELCOME;
            int i3 = 0;
            if (i > 100) {
                int i4 = ((i - 100) * Settings.FIRST_TUTORIAL_WELCOME) / 20;
                if (i4 <= 180) {
                    i2 = i4;
                }
                if (i2 >= 0) {
                    i3 = i2;
                }
                this.ivArrow.setRotation(i3);
            } else {
                this.ivArrow.setRotation(0);
            }
            if (i < 100) {
                int stringRes = C0661R.getStringRes(getContext(), "pull_to_refresh");
                if (stringRes > 0) {
                    this.tvHeader.setText(stringRes);
                    return;
                }
                return;
            }
            int stringRes2 = C0661R.getStringRes(getContext(), "release_to_refresh");
            if (stringRes2 > 0) {
                this.tvHeader.setText(stringRes2);
            }
        }

        public void onRequest() {
            this.ivArrow.setVisibility(8);
            this.pbRefreshing.setVisibility(0);
            int stringRes = C0661R.getStringRes(getContext(), "refreshing");
            if (stringRes > 0) {
                this.tvHeader.setText(stringRes);
            }
        }

        public void reverse() {
            this.pbRefreshing.setVisibility(8);
            this.ivArrow.setRotation(Settings.FIRST_TUTORIAL_WELCOME);
            this.ivArrow.setVisibility(0);
        }
    }

    /* renamed from: cn.sharesdk.onekeyshare.FollowList$RotateImageView */
    private static class RotateImageView extends ImageView {
        private int rotation;

        public RotateImageView(Context context) {
            super(context);
        }

        public void setRotation(int i) {
            this.rotation = i;
            invalidate();
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            canvas.rotate((float) this.rotation, (float) (getWidth() / 2), (float) (getHeight() / 2));
            super.onDraw(canvas);
        }
    }
}
