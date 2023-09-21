package com.cootek.presentation.service.toast;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class GuidePointTree {
    private static final String TAG = "GuidePointTree";
    private Map<String, GuidePointNode> mPointsMap;
    private SharedPreferences mSharedPref;
    private String mToastId;

    public GuidePointTree(String str, XmlPullParser xmlPullParser) {
        this.mToastId = str;
        if (this.mSharedPref == null) {
            this.mSharedPref = PresentationSystem.getInstance().getContext().getSharedPreferences("GuidePointsClearList_" + this.mToastId, 0);
        }
        try {
            this.mPointsMap = new HashMap();
            parse(xmlPullParser);
        } catch (IOException e) {
            if (PresentationSystem.DUMPINFO) {
                e.printStackTrace();
            }
        } catch (XmlPullParserException e2) {
            if (PresentationSystem.DUMPINFO) {
                e2.printStackTrace();
            }
        }
    }

    private GuidePointNode parse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i;
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        GuidePointNode guidePointNode = new GuidePointNode();
        guidePointNode.dismissStrategy = 2;
        guidePointNode.pointId = "root";
        guidePointNode.parent = null;
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, guidePointNode);
        this.mPointsMap.put(guidePointNode.pointId, guidePointNode);
        int i2 = 1;
        while (i2 != 0) {
            try {
                i = xmlPullParser.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                i = 3;
            }
            switch (i) {
                case 2:
                    if (!xmlPullParser.getName().equals(PresentConfigXmlTag.GUIDE_POINT_NODE)) {
                        break;
                    } else {
                        GuidePointNode guidePointNode2 = new GuidePointNode();
                        guidePointNode2.pointId = xmlPullParser.getAttributeValue((String) null, "id");
                        if (PresentationSystem.DUMPINFO) {
                            Log.i(TAG, "add node id: " + guidePointNode2.pointId);
                        }
                        guidePointNode2.pointType = GuidePointNode.getPointType(xmlPullParser.getAttributeValue((String) null, "type"));
                        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.GUIDE_PIONT_ATTR_DISMISS_RULE);
                        if (TextUtils.equals(attributeValue, PresentConfigXmlTag.GUIDE_POINT_DISSMISS_RULE_ALL_CHILDREN)) {
                            guidePointNode2.dismissStrategy = 2;
                        } else if (TextUtils.equals(attributeValue, PresentConfigXmlTag.GUIDE_POINT_DISSMISS_RULE_ANY_CHILD)) {
                            guidePointNode2.dismissStrategy = 1;
                        } else if (TextUtils.equals(attributeValue, PresentConfigXmlTag.GUIDE_POINT_DISSMISS_RULE_SELF_SHOWN)) {
                            guidePointNode2.dismissStrategy = 4;
                        } else if (TextUtils.equals(attributeValue, PresentConfigXmlTag.GUIDE_POINT_DISSMISS_RULE_NEVER)) {
                            guidePointNode2.dismissStrategy = 5;
                        } else {
                            guidePointNode2.dismissStrategy = 3;
                        }
                        guidePointNode2.pointHolderShowConditions = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.GUIDE_POINT_ATTR_HOLDER_SHOW_CONDITION);
                        guidePointNode2.pointSelfShowConditions = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.GUIDE_POINT_ATTR_SELF_SHOW_CONDITION);
                        guidePointNode2.extensionId = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.GUIDE_PIONT_ATTR_EXTENSION_ID);
                        GuidePointNode guidePointNode3 = (GuidePointNode) arrayList.get(i2 - 1);
                        guidePointNode2.parent = guidePointNode3;
                        if (guidePointNode3.children == null) {
                            guidePointNode3.children = new ArrayList();
                        }
                        guidePointNode3.children.add(guidePointNode2);
                        this.mPointsMap.put(guidePointNode2.pointId, guidePointNode2);
                        arrayList.add(i2, guidePointNode2);
                        i2++;
                        break;
                    }
                case 3:
                    i2--;
                    break;
            }
        }
        return guidePointNode;
    }

    public boolean canShow(GuidePointNode guidePointNode) {
        boolean z;
        boolean z2;
        if (guidePointNode.isLeaf() || guidePointNode.dismissStrategy == 3 || guidePointNode.dismissStrategy == 4) {
            if (isClear(guidePointNode) || !guidePointNode.canHolderShow() || !guidePointNode.canSelfShow()) {
                return false;
            }
            return true;
        } else if (guidePointNode.dismissStrategy == 1) {
            Iterator<GuidePointNode> it = guidePointNode.children.iterator();
            boolean z3 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                GuidePointNode next = it.next();
                if (!guidePointNode.canHolderShow() || !guidePointNode.canSelfShow()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (!canShow(next)) {
                        z = false;
                        break;
                    }
                    z3 = true;
                }
            }
            if (z3) {
                return z;
            }
            return false;
        } else {
            boolean z4 = false;
            for (GuidePointNode next2 : guidePointNode.children) {
                if (guidePointNode.canHolderShow() && guidePointNode.canSelfShow()) {
                    z4 = z4 || canShow(next2);
                }
            }
            return z4;
        }
    }

    private void shown(GuidePointNode guidePointNode) {
        if (guidePointNode.dismissStrategy == 4) {
            clear(guidePointNode);
        }
    }

    private boolean canClear(GuidePointNode guidePointNode) {
        int i = guidePointNode.dismissStrategy;
        return i != 5 && (guidePointNode.isLeaf() || i == 3);
    }

    private void clicked(GuidePointNode guidePointNode) {
        if (canClear(guidePointNode)) {
            clear(guidePointNode);
        }
    }

    private void clear(GuidePointNode guidePointNode) {
        this.mSharedPref.edit().putBoolean(guidePointNode.pointId, true).commit();
    }

    private boolean isClear(GuidePointNode guidePointNode) {
        return this.mSharedPref.getBoolean(guidePointNode.pointId, false);
    }

    public int childrenCount(String str) {
        GuidePointNode guidePointNode = this.mPointsMap.get(str);
        int i = 0;
        if (!(guidePointNode == null || guidePointNode.children == null)) {
            for (GuidePointNode canShow : guidePointNode.children) {
                if (canShow(canShow)) {
                    i++;
                }
            }
        }
        return i;
    }

    public int getType(String str) {
        int i;
        GuidePointNode guidePointNode = this.mPointsMap.get(str);
        if (guidePointNode == null) {
            i = 0;
        } else if (guidePointNode.pointType == -1) {
            i = guidePointNode.pointType;
        } else {
            i = canShow(guidePointNode) ? guidePointNode.pointType : 0;
        }
        if (PresentationSystem.DUMPINFO) {
            Log.i(TAG, "getType guidePointId: " + str + " ret: " + i);
        }
        return i;
    }

    public void clicked(String str) {
        GuidePointNode guidePointNode = this.mPointsMap.get(str);
        if (guidePointNode != null) {
            clicked(guidePointNode);
            PresentationSystem.getInstance().getPresentStatisticUploader().addItem("CLICK", (String) null, String.valueOf(this.mToastId) + ":" + str);
        }
    }

    public void shown(String str) {
        GuidePointNode guidePointNode = this.mPointsMap.get(str);
        if (guidePointNode != null) {
            shown(guidePointNode);
            PresentationSystem.getInstance().getPresentStatisticUploader().addItem("SHOW", (String) null, String.valueOf(this.mToastId) + ":" + str);
        }
    }
}
