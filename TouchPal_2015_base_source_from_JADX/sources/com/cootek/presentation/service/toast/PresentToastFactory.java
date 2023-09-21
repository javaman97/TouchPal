package com.cootek.presentation.service.toast;

import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.GlobalStrategy;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.history.PresentHistoryManager;
import org.xmlpull.v1.XmlPullParser;

public class PresentToastFactory {
    public static PresentToast generate(XmlPullParser xmlPullParser) {
        try {
            String name = xmlPullParser.getName();
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_STATUS_BAR)) {
                return new StatusbarToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_TOOLBAR)) {
                return new ToolbarToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_NEXTWORD)) {
                return new NextWordToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_CLOUD_INPUT)) {
                return new CloudInputToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_STARTUP)) {
                return new StartupToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_DUMMY)) {
                return new DummyToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_FULLSCREEN)) {
                return new FullscreenToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_EXTENSION_STATIC)) {
                return new ExtensionStaticToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_GUIDE_POINTS)) {
                return new GuidePointsToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_DESKTOP_SHORTCUT)) {
                return new DesktopShortcutToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_POPUP)) {
                return new PopupToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_BACKGROUNDIMAGE)) {
                return new BackgroundImageToast(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.TOAST_ROOT_FREECALLHANGUP)) {
                return new FreecallHangupToast(xmlPullParser);
            }
            return PresentationSystem.getInstance().createToast(name, xmlPullParser);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public static boolean tagMatched(String str, PresentToast presentToast) {
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_STATUS_BAR)) {
            return presentToast instanceof StatusbarToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_TOOLBAR)) {
            return presentToast instanceof ToolbarToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_NEXTWORD)) {
            return presentToast instanceof NextWordToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_CLOUD_INPUT)) {
            return presentToast instanceof CloudInputToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_STARTUP)) {
            return presentToast instanceof StartupToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_DUMMY)) {
            return presentToast instanceof DummyToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_FULLSCREEN)) {
            return presentToast instanceof FullscreenToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_EXTENSION_STATIC)) {
            return presentToast instanceof ExtensionStaticToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_GUIDE_POINTS)) {
            return presentToast instanceof GuidePointsToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_DESKTOP_SHORTCUT)) {
            return presentToast instanceof DesktopShortcutToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_POPUP)) {
            return presentToast instanceof PopupToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_BACKGROUNDIMAGE)) {
            return presentToast instanceof BackgroundImageToast;
        }
        if (str.equals(PresentConfigXmlTag.TOAST_ROOT_FREECALLHANGUP)) {
            return presentToast instanceof FreecallHangupToast;
        }
        return PresentationSystem.getInstance().matchToast(str, presentToast);
    }

    public static boolean needQuiet(Class<? extends PresentToast> cls) {
        int i;
        long lastStartupPresentTime;
        GlobalStrategy globalStrategy = null;
        if (PresentationSystem.getInstance().getPresentations() != null) {
            globalStrategy = PresentationSystem.getInstance().getPresentations().getGlobalStrategy();
        }
        if (globalStrategy == null) {
            return true;
        }
        long currentTimeMillis = SystemFacade.currentTimeMillis();
        PresentHistoryManager historyManager = PresentationSystem.getInstance().getHistoryManager();
        if (ToolbarToast.class.isAssignableFrom(cls)) {
            i = globalStrategy.toolbarQuietDays;
            lastStartupPresentTime = historyManager.getLastToolbarPresentTime();
        } else if (StatusbarToast.class.isAssignableFrom(cls)) {
            i = globalStrategy.statusbarQuietDays;
            lastStartupPresentTime = historyManager.getLastStatusbarPresentTime();
        } else if (!StatusbarToast.class.isAssignableFrom(cls)) {
            return false;
        } else {
            i = globalStrategy.startupQuietDays;
            lastStartupPresentTime = historyManager.getLastStartupPresentTime();
        }
        if (i == -1 || currentTimeMillis < lastStartupPresentTime + (((long) i) * 86400000)) {
            return true;
        }
        return false;
    }
}
