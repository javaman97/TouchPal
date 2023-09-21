package com.cootek.presentation.service.config;

import android.util.Xml;
import com.cootek.presentation.service.GlobalStrategy;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.Presentations;
import com.cootek.presentation.service.action.PresentAction;
import com.cootek.presentation.service.action.PresentActionFactory;
import com.cootek.presentation.service.feature.PresentFeature;
import com.cootek.presentation.service.feature.PresentFeatureFactory;
import com.cootek.presentation.service.feature.PresentFeatureGroup;
import com.cootek.presentation.service.toast.PresentToast;
import com.cootek.presentation.service.toast.PresentToastFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class PresentConfigParser {

    /* renamed from: ns */
    private static final String f2475ns = null;

    public Presentations parse(XmlPullParser xmlPullParser) {
        try {
            xmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParser.nextTag();
            xmlPullParser.require(2, f2475ns, PresentConfigXmlTag.DOCUMENT_ROOT);
            xmlPullParser.nextTag();
            Presentations presentations = new Presentations(GlobalStrategy.generate(xmlPullParser));
            try {
                xmlPullParser.nextTag();
                presentations.setToasts(readToasts(xmlPullParser, false));
                xmlPullParser.require(3, f2475ns, PresentConfigXmlTag.DOCUMENT_ROOT);
                return presentations;
            } catch (XmlPullParserException e) {
                e.printStackTrace();
                return presentations;
            } catch (IOException e2) {
                e2.printStackTrace();
                return presentations;
            }
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
            return null;
        } catch (IOException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public Presentations parse(InputStream inputStream) throws IOException, XmlPullParserException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, "utf-8");
        return parse(newPullParser);
    }

    public List<PresentToast> parse(String str) throws IOException, XmlPullParserException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.nextTag();
        return readToasts(newPullParser, true);
    }

    public static String readText(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() == 4) {
            return xmlPullParser.getText();
        }
        return "";
    }

    private PresentToast readToast(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        PresentFeature generate = PresentFeatureFactory.generate(xmlPullParser);
        xmlPullParser.nextTag();
        PresentToast generate2 = PresentToastFactory.generate(xmlPullParser);
        if (generate2 != null) {
            generate2.setFeature(generate);
        }
        xmlPullParser.nextTag();
        while (true) {
            if (xmlPullParser.getEventType() == 3 && PresentToastFactory.tagMatched(xmlPullParser.getName(), generate2)) {
                break;
            }
            if (xmlPullParser.getName().equals("action")) {
                PresentAction generate3 = PresentActionFactory.generate(xmlPullParser);
                if (generate2 != null) {
                    generate2.setAction(generate3);
                }
                if (xmlPullParser.getName().equals("action") && xmlPullParser.getEventType() != 3) {
                    xmlPullParser.nextTag();
                }
            } else if (xmlPullParser.getName().equals(PresentConfigXmlTag.TOAST_ATTR_ACTION_CONFIRM_INFO)) {
                String readText = readText(xmlPullParser);
                if (generate2 != null) {
                    generate2.setActionConfirm(readText);
                }
                xmlPullParser.nextTag();
            } else if (xmlPullParser.getName().equals(PresentConfigXmlTag.TOAST_ATTR_DISPLAY_TITLE)) {
                String readText2 = readText(xmlPullParser);
                if (generate2 != null) {
                    generate2.setDisplay(readText2);
                }
                xmlPullParser.nextTag();
            } else if (xmlPullParser.getName().equals("description")) {
                String readText3 = readText(xmlPullParser);
                if (generate2 != null) {
                    generate2.setDescription(readText3);
                }
                xmlPullParser.nextTag();
            } else if (xmlPullParser.getName().equals("imageUrl")) {
                String readText4 = readText(xmlPullParser);
                if (generate2 != null) {
                    generate2.setImageUrl(readText4);
                }
                xmlPullParser.nextTag();
            } else if (xmlPullParser.getName().equals(PresentConfigXmlTag.TOAST_ATTR_AUTO_DOWNLOAD_URL)) {
                String readText5 = readText(xmlPullParser);
                if (generate2 != null) {
                    generate2.setAutoDownloadUrl(readText5);
                }
                xmlPullParser.nextTag();
            } else {
                if (generate2 != null) {
                    generate2.postParse(xmlPullParser);
                }
                if (xmlPullParser.getEventType() != 3) {
                    xmlPullParser.nextTag();
                }
            }
            xmlPullParser.nextTag();
        }
        xmlPullParser.nextTag();
        try {
            xmlPullParser.nextTag();
        } catch (IOException e) {
            if (PresentationSystem.DUMPINFO) {
                e.printStackTrace();
            }
        } catch (XmlPullParserException e2) {
            if (PresentationSystem.DUMPINFO) {
                e2.printStackTrace();
            }
        }
        return generate2;
    }

    private List<PresentToast> readToasts(XmlPullParser xmlPullParser, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if ((xmlPullParser.getEventType() != 3 || !xmlPullParser.getName().equals(PresentConfigXmlTag.DOCUMENT_ROOT)) && (!z || xmlPullParser.getEventType() != 1)) {
                if (xmlPullParser.getName().equals(PresentConfigXmlTag.FEATURE_GROUP_ROOT)) {
                    xmlPullParser.require(2, (String) null, PresentConfigXmlTag.FEATURE_GROUP_ROOT);
                    PresentFeatureGroup presentFeatureGroup = new PresentFeatureGroup(xmlPullParser);
                    while (true) {
                        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(PresentConfigXmlTag.FEATURE_GROUP_ROOT)) {
                            break;
                        }
                        PresentToast readToast = readToast(xmlPullParser);
                        if (!(readToast == null || readToast.getFeature() == null)) {
                            readToast.getFeature().setFeatureGroup(presentFeatureGroup);
                            if (readToast.getAction() != null) {
                                arrayList.add(readToast);
                            }
                        }
                    }
                    xmlPullParser.require(3, (String) null, PresentConfigXmlTag.FEATURE_GROUP_ROOT);
                    xmlPullParser.nextTag();
                } else {
                    PresentToast readToast2 = readToast(xmlPullParser);
                    if (!(readToast2 == null || readToast2.getFeature() == null)) {
                        readToast2.getFeature().setFeatureGroup((PresentFeatureGroup) null);
                        if (readToast2.getAction() != null) {
                            arrayList.add(readToast2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
