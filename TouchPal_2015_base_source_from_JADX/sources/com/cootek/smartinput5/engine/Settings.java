package com.cootek.smartinput5.engine;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p052b.C1550c;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p049e.C1252b;
import com.cootek.smartinput5.plugin.typingrace.C2441Q;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Settings {
    public static final int ACCESSIBILITY_ENABLED = 251;
    public static final int ACCOUNT_CHECK_NEXT_TIME = 271;
    public static final int ACCOUNT_INFO = 270;
    public static final int ACTIVATE_IDENTIFIER = 201;
    public static final int ACTIVATE_SERVER_REGION = 360;
    public static final int ADAPTIVE_LEARNING = 32;
    public static final int ADVANCED_VIBRATION = 229;
    public static final int ADVERTISE_STRATEGY = 384;
    public static final int ADVERTISE_UPDATE_TIME = 385;
    public static final int ALREADY_OWN_PKGS = 234;
    public static final String ANDROID_ID = "android_id";
    public static final int ANDROID_VERSION = 327;
    public static final int ANIMATION_EFFECT = 87;
    public static final int API_INPUT_CONNECTION_DISABLED = 153;
    public static final int APPLY_SYSTEM_VIBRATE = 380;
    public static final int APPLY_SYSTEM_VOLUME = 99;
    public static final int APPSFLYER_NEXT_ACTIVE_TIME = 311;
    public static final int ARCTIC_CLOUD_INPUT_ENABLE = 272;
    public static final int AUTOSPACE_ENABLE = 37;
    public static final int AUTO_ADJUST_SPECIAL_KEYBOARD_SIZE = 388;
    public static final int AUTO_ADJUST_SPECIAL_KEYBOARD_SIZE_TOAST = 399;
    public static final int AUTO_ADJUST_WORD_PRIORITY = 52;
    public static final int AUTO_BACKUP_DICTIONARY_TIME = 224;
    public static final int AUTO_CAPITALIZATION = 54;
    public static final int AUTO_CAPITALIZE_LAST = 64;
    public static final int AUTO_CORRECTION = 59;
    public static final int AUTO_LEAVE_HANDWRITE_MASK_TIMES = 157;
    public static final int AUTO_MERGING_WORD = 66;
    public static final int AUTO_REBUILD_ENABLED = 344;
    public static final int AUTO_REBUILD_NEXT_CHECK_TIME = 345;
    public static final int AUTO_SAVE_USERWORD = 47;
    public static final int AUTO_UPDATE_VERSION = 83;
    public static final int BACKSPACE_TO_REPLACE_INLINE = 71;
    public static final int BACKWARD_CORRECTION = 68;
    public static final int BIND_GOOGLE_SERVICE_FAILED = 278;
    public static final int BUILDIN_SKIN_UPDATE_CHECKED = 370;
    public static final int BUTTON_DELIVER = 74;
    public static final int CANDIDATE_SIZE = 123;
    public static final int CATEGORY_ADS_SOURCE = 33;
    public static final int CATEGORY_ADTLEARNING = 12;
    public static final int CATEGORY_CELLDICT = 3;
    public static final int CATEGORY_CHS_LANGUAGE = 24;
    public static final int CATEGORY_CLOUDINPUT = 15;
    public static final int CATEGORY_COMPLETE_DICTIONARY = 18;
    public static final int CATEGORY_CURVE = 5;
    public static final int CATEGORY_CUSTOM_SKIN_NUMBER = 28;
    public static final int CATEGORY_DOWNLOADED_LIMITATION = 20;
    public static final int CATEGORY_DRAWER_GUIDE_POINT = 25;
    public static final int CATEGORY_DRAWER_ITEM_CLICK = 29;
    public static final int CATEGORY_EMOJI = 16;
    public static final int CATEGORY_FASTSWITCH = 0;
    public static final int CATEGORY_INPUT_TYPE = 27;
    public static final int CATEGORY_KEYBOARD_MARGIN = 18;
    public static final int CATEGORY_LANGUAGE = 17;
    public static final int CATEGORY_LAYOUT = 9;
    public static final int CATEGORY_MISSION_STATE = 19;
    public static final int CATEGORY_MISTYPING = 7;
    public static final int CATEGORY_MIXINPUT = 2;
    public static final int CATEGORY_MOBILE_IDENTIFY_INFORMATION = 32;
    public static final int CATEGORY_NEXTWORD = 4;
    public static final int CATEGORY_PLUGIN_PINNED = 23;
    public static final int CATEGORY_PRIORITY = 13;
    public static final int CATEGORY_RECOGRANGE = 8;
    public static final int CATEGORY_SCREENSHOT_COLLECTION = 31;
    public static final int CATEGORY_SENTENCE = 11;
    public static final int CATEGORY_SKIN_PACKAGE_NAME = 30;
    public static final int CATEGORY_SMILEY_CATEGORY = 22;
    public static final int CATEGORY_SPEED = 10;
    public static final int CATEGORY_SPGETNEXTWORD = 14;
    public static final int CATEGORY_SUBTYPE = 1;
    public static final int CATEGORY_TIMESTAMP = 19;
    public static final int CATEGORY_UPDATE_OEM = 26;
    public static final int CATEGORY_USERWORD = 6;
    public static final int CATEGORY_USER_DICT = 21;
    public static final int CELL_DICTIONARY = 16;
    public static final int CLIPBOARD_LOCK_NOTIFICATION_SHOWN = 321;
    public static final int CLIPBOARD_NOTIFICATION_SHOWN = 320;
    public static final int CLIPBOARD_SLOT_EXPANDED_TOAST_SHOWN = 322;
    public static final int CLOKE_ENABLE_ANY_TIME = 1;
    @Deprecated
    public static final int CLOKE_ENABLE_MANUALLY = 2;
    public static final int CLOKE_ENABLE_MODE = 168;
    public static final int CLOKE_ENABLE_NEVER = 3;
    public static final int CLOKE_ENABLE_WIFI_ONLY = 0;
    public static final int CLOUD_BACKUP_SYNC = 260;
    public static final int CLOUD_ENABLED = 46;
    public static final int CLOUD_HANDWRITING_ENABLED = 125;
    @Deprecated
    public static final int CLOUD_HANDWRITING_PROMPTED = 126;
    public static final int CLOUD_HANDWRITING_UPDATE_TIME = 137;
    public static final int CLOUD_HANDWRITING_VALID = 124;
    public static final int CLOUD_SERVICE_LAST_SYNC_TIME = 265;
    public static final int CLOUD_SERVICE_SYNC_NEXT_TIME = 266;
    public static final int CLOUD_SERVICE_WIFI_ONLY = 264;
    public static final int COLORFUL_EMOJI_BUTTON_CLICKED = 355;
    public static final int COLORFUL_EMOJI_BUTTON_SHOW = 395;
    public static final int COMMIT_ANIMATION_ENABLED = 244;
    public static final int CONDITION_STATE_INIT = 0;
    public static final int CONDITION_STATE_READY = 1;
    public static final int CONDITION_STATE_SHOWN = 2;
    public static final int CONTACT_IMPORTED = 131;
    public static final int CURRENT_CHANNEL_CODE = 312;
    public static final int CURRENT_DICTIONARY_TIMESTAMP = 95;
    public static final int CURRENT_DYNAMIC_BG_INDEX = 359;
    public static final int CURRENT_EMOJI_INPUT_TYPE = 227;
    public static final int CURRENT_HOTWORD_DICTIONARY_ID = 246;
    public static final int CURRENT_LANGUAGE = 10;
    public static final int CURRENT_LANG_BEFORE_UPDATE = 377;
    public static final int CURRENT_PERFORMANCE_MODE = 387;
    public static final int CURRENT_SMILEY_CATEGORY = 275;
    public static final int CURRENT_SMILEY_TAB = 225;
    public static final int CURVE_BACKWARD_CORRECTION = 69;
    public static final int CURVE_DOWNLOAD_LANGUAGE = 236;
    public static final int CURVE_DOWNLOAD_PROMPTED = 136;
    public static final int CURVE_ENABLED = 31;
    public static final int CURVE_ENABLED_UI = 144;
    public static final int CURVE_ENV_WORD = 67;
    public static final int CURVE_IN_TIME = 82;
    public static final int CURVE_PREDICTION = 30;
    public static final int CUSTOM_SKIN_ALPHA = 330;
    public static final int CUSTOM_SKIN_BACKGROUND_COLOR = 331;
    public static final int CUSTOM_SKIN_COLOR_SET = 332;
    public static final int CUSTOM_SKIN_CREATE_TIME = 363;
    public static final int CUSTOM_SKIN_SET_NUMBER = 362;
    public static final int DEFUALT_SKIN_UPDATED = 353;
    public static final int DEVICE_TYPE = 163;
    public static final int DEVICE_TYPE_PHONE = 1;
    public static final int DEVICE_TYPE_TABLET = 2;
    public static final int DIAGNOSE_MODE_ENABLED = 63;
    public static final int DICTIONARY_COMPLETE = 204;
    public static final int DICTIONARY_LAST_UPDATE_TIME = 106;
    public static final int DICTIONARY_UPDATE_INTERVAL = 105;
    public static final int DICT_ERROR_ON_DAILY_BACKUP_OCCURRED = 328;
    public static final int DISABLED_SYMBOL_TAB = 6;
    public static final int DISPLAY_EMOJI_BY_SYSTEM = 310;
    public static final int DOMAIN_LOOKUP_NEXT_CHECK_TIME = 342;
    public static final int DOWNLOADED_PKG_COUNT = 233;
    public static final int DOWNSLIDE_SYMBOLS = 7;
    public static final int DRAWER_GUIDE_POINT_SHOWED = 350;
    public static final int DRAWER_PIN_GUIDE_SHOWED = 365;
    public static final int DYNAMIC_SPELL_CHECK_ENABLE = 167;
    public static final int DYNIMAC_CHANGE_KB_BACKGROUND_TIME = 358;
    @Deprecated
    public static final int EMOJI_ENABLED = 45;
    public static final int EMOJI_PREDICTION = 62;
    public static final int EMOJI_RECENT_RECODE = 354;
    public static final String EMOJI_SCREENSHOT = "emoji_screenshot";
    public static final int EMOJI_SHAKE_SHOWN = 348;
    public static final int EMOJI_VERSION = 309;
    @Deprecated
    public static final int EMOTION_KEY_LONG_PRESS = 161;
    @Deprecated
    public static final int EMOTION_SCROLL = 122;
    private static final String EMPTY_STRING = "";
    public static final int ENABLED_LANGUAGE = 13;
    public static final int ENV_WORD = 40;
    public static final int ERROR_PRONUNCIATION = 58;
    public static final int FIRST_BIGRAM_HIGHLIGHT = 191;
    public static final int FIRST_CHS_KEYBOARD = 117;
    public static final int FIRST_CHS_MORE = 118;
    public static final int FIRST_DEL_WIZARD = 115;
    public static final int FIRST_ENTER_SHOP = 287;
    public static final int FIRST_HANDWRITE_TIPS = 155;
    public static final int FIRST_INSTALL_TIME = 208;
    public static final int FIRST_INSTALL_VERSION = 286;
    public static final int FIRST_KEYBOARD_SHOWN_OPEN_DRAWER = 356;
    public static final int FIRST_LANGUAGE_LAYOUT = 189;
    public static final int FIRST_LANGUAGE_MODE = 188;
    @Deprecated
    public static final int FIRST_LAN_LONG_PRESS = 116;
    public static final int FIRST_LAYOUT_SELECT = 151;
    public static final int FIRST_SHOW_CANDIDATE_ON_STARTINPUT = 364;
    public static final int FIRST_SIZE_ADJUSTMENT = 152;
    public static final int FIRST_START_CLIPBOARD = 319;
    public static final int FIRST_START_INPUTMETHOD = 181;
    public static final int FIRST_START_KEYBOARD = 119;
    public static final int FIRST_START_TIME = 120;
    public static final int FIRST_SWITCH_LANGUAGE = 376;
    public static final int FIRST_TUTORIAL_WELCOME = 180;
    public static final int FIRST_VERSION_UPDATE = 198;
    public static final int FORBID_SIMPLE_CANDIDATE_STYLE = 248;
    public static final int FORWARD_PREDICTION = 55;
    public static final int FUNCTIONBAR = 78;
    public static final int FUNCTIONBAR_SETTINGS = 79;
    public static final int GOODS_CHECK_NEXT_TIME = 267;
    public static final int GUIDE_FINISH_PAGE_SHOWED = 341;
    public static final int GUIDE_PLAY_STATE = 228;
    public static final int GUIDE_STATE_COMPLETELY_WATCHED = 2;
    public static final int GUIDE_STATE_HAS_WATCHED = 1;
    public static final int GUIDE_STATE_NOT_WATCHED = 0;
    public static final int HANDWRITE_COLOR = 100;
    public static final int HANDWRITE_INTERVAL = 102;
    public static final int HANDWRITE_MASK_ENABLED = 48;
    public static final int HANDWRITE_RECOG_RANGE = 29;
    public static final int HANDWRITE_WIDTH = 101;
    public static final int HARD_KEYBOARD_TIP_MAX_TIMES = 3;
    public static final int HARD_KEYBOARD_TIP_SHOWN_TIMES = 183;
    public static final int HARD_SYMBOL_CURRENT_TAB = 111;
    public static final int HARD_SYMBOL_TAB_FOCUSED = 112;
    public static final int HAS_ACCEPTED_POLICY = 268;
    public static final int HAS_ACTIVATE_EFFECTIVELY = 396;
    public static final int HAS_CLICKED_DOWNLOAD_EMOJI_BUTTON = 280;
    public static final int HAS_DOWNLOAD_LIMITATION = 232;
    public static final int HAS_EMOJI_FONT = 346;
    @Deprecated
    public static final int HAS_SET_COMMA_MODE_MANUALLY = 196;
    public static final int HAS_SHOWN_GUIDE_INTRO_VIEW = 304;
    public static final int HAS_SLOGAN_ANIMATION_PLAYED = 282;
    public static final int HOTWORD_LAST_UPDATE_TIME = 273;
    public static final int HOTWORD_PAGE_ACCESS_TIME = 281;
    public static final int HW_RECOG_RANGE_ALL = 261903;
    public static final int HW_RECOG_RANGE_LETTER = 6;
    public static final int HW_RECOG_RANGE_LETTER_NUMBER = 7;
    public static final int HW_RECOG_RANGE_NUMBER = 1;
    public static final int HW_RECOG_RANGE_NUMBER_SYMBOL = 9;
    public static final int HW_RECOG_RANGE_SYMBOL = 8;
    public static final int HW_RECOG_RANGE_ZH = 261888;
    public static final int HW_RECOG_RANGE_ZH_LETTER = 261894;
    public static final String IDENTIFIER = "identifier";
    public static final int IFLY_VOICE_CHOSEN_LANGUAGE = 326;
    public static final String IMEI = "imei";
    public static final int IME_CUR_VERSION = 103;
    public static final int IME_CUR_VERSION_INSTALL_TIME = 373;
    public static final int IME_LAST_VERSION = 372;
    public static final int IMPORT_SYS_USER_DIC_ENABLE = 166;
    public static final int INITIALIZED_TOUCHPAL_CLOUD_IN_GUIDE = 269;
    public static final int INPUT_SPEED_BAR = 84;
    public static final int INPUT_TOP_SPEED_CHINESE = 85;
    public static final int INPUT_TOP_SPEED_OTHER = 86;
    public static final String INPUT_TYPE_NORMAL = "normal";
    public static final String INPUT_TYPE_SPECIAL = "special";
    public static final int INSTALLED_LANGUAGE = 14;
    public static final int INVITE_SUCCEED = 169;
    @Deprecated
    public static final int IS_CHINESE_LANGUAGE_ENABLED = 195;
    public static final int IS_FIRST_KEYBOARD_SHOW = 347;
    @Deprecated
    public static final int IS_KEYBOARD_ZOOMING_AT_LEFT = 213;
    public static final int IS_SMARTINPUT_ACTIVATED = 367;
    public static final int JIANPIN_SENTENCE_ENABLED = 57;
    @Deprecated
    public static final int KEYBOARD_BOTTOM_MARGIN = 256;
    public static final int KEYBOARD_HEIGHT_HW = 255;
    public static final int KEYBOARD_HEIGHT_NORMAL = 254;
    public static final int KEYBOARD_LAYOUT = 4;
    public static final int KEYBOARD_LAYOUT_AUTO = 0;
    public static final int KEYBOARD_LAYOUT_AZERTY = 2;
    public static final int KEYBOARD_LAYOUT_CUSTOM1 = 4;
    public static final int KEYBOARD_LAYOUT_CUSTOM2 = 5;
    public static final int KEYBOARD_LAYOUT_CUSTOM3 = 6;
    public static final int KEYBOARD_LAYOUT_OTHER = 7;
    public static final int KEYBOARD_LAYOUT_QWERTY = 1;
    public static final int KEYBOARD_LAYOUT_QWERTZ = 3;
    @Deprecated
    public static final int KEYBOARD_LEFT_MARGIN_RATIO = 257;
    public static final int KEYBOARD_MARGIN = 389;
    public static final String KEYBOARD_MARGIN_BOTTOM = "bottom";
    public static final String KEYBOARD_MARGIN_LEFT = "left";
    public static final String KEYBOARD_MARGIN_RIGHT = "right";
    public static final int KEYBOARD_NUMBER_ROW_STYLE = 393;
    @Deprecated
    public static final int KEYBOARD_POSITION = 259;
    public static final int KEYBOARD_POSITION_AT_LEFT = 2;
    public static final int KEYBOARD_POSITION_AT_RIGHT = 3;
    public static final int KEYBOARD_POSITION_DISABLE_ZOOM_MODE = 5;
    public static final int KEYBOARD_POSITION_FULL_WIDTH_NORMAL = 0;
    public static final int KEYBOARD_POSITION_FULL_WIDTH_RAISED = 1;
    public static final int KEYBOARD_POSITION_IN_MIDDLE = 4;
    @Deprecated
    public static final int KEYBOARD_RIGHT_MARGIN_RATIO = 258;
    public static final String KEYBOARD_SCREENSHOT = "keyboard_screenshot";
    public static final int KEYBOARD_SHOW_TIMES = 357;
    public static final int KEYBOARD_SPECIAL_ENGLISH_SUBTYPE = 194;
    public static final int KEYBOARD_SUBTYPE = 3;
    public static final int KEYBOARD_SUBTYPE_FULL = 2;
    public static final int KEYBOARD_SUBTYPE_OTHER = 4;
    public static final int KEYBOARD_SUBTYPE_PHONEPAD = 1;
    public static final int KEYBOARD_SUBTYPE_TPLUS = 3;
    public static final int KEY_SPEED_TOTAL_KEY_TIMES = 160;
    public static final int KEY_SPEED_TOTAL_TIME = 159;
    public static final int LANDSCAPE_DEFAULT_SCREEN_MODE = 0;
    public static final int LANDSCAPE_HALF_SCREEN_MODE = 1;
    public static final int LANDSCAPE_SCREEN_MODE = 294;
    @Deprecated
    public static final int LANGUAGE_INSTALLED_ONCE = 113;
    public static final int LANGUAGE_JUST_INSTALLED = 192;
    @Deprecated
    public static final int LANGUAGE_KEY_COMMA_MODE = 186;
    public static final int LANGUAGE_SWITCHING_MODE = 338;
    public static final int LANGUAGE_USED_TIMES = 145;
    public static final int LANG_KEY_ENABLED = 335;
    public static final int LAST_ACTIVATED_TIME_IN_MILLIS = 366;
    public static final int LAST_ACTIVATE_CONSUME_TIME = 295;
    public static final int LAST_ACTIVATION_SUCCESS_TIME = 200;
    public static final int LAST_ACTIVE_STAT_TIME = 383;
    public static final int LAST_AUTO_UPDATE_TIMESTAMP = 334;
    public static final int LAST_BACKUP_DICT_TIME = 209;
    public static final int LAST_CHECK_IMAGE_RESULT = 343;
    public static final int LAST_CHECK_TASK_DAY = 77;
    public static final int LAST_CLOUD_BACKUP_DICT_TIME = 210;
    public static final int LAST_CLOUD_RESTORE_DICT_TIME = 211;
    public static final int LAST_NOTIFY_UPDATE = 148;
    public static final int LAST_PAOPAO_NEWS_ID = 89;
    public static final int LAST_PAOPAO_PANEL_TAB = 158;
    public static final int LAST_PRODUCT_TYPE = 305;
    public static final int LAST_RECORD_OPEN_KEYBOARD_TIME = 375;
    public static final int LAST_RECORD_USER_PATTERN_TIME = 374;
    public static final int LBS_NOTIFIED_LOCATION = 97;
    public static final int LBS_NOTIFIED_LOCATION_CLEAR_TIME = 98;
    public static final int LOCAL_CLOUD_SEARCH_ENABLED = 61;
    public static final int LONG_PRESS_COMMA_TIP_SHOWN = 392;
    public static final int LONG_PRESS_DELAY = 290;
    public static final String MACADDRESS = "macaddress";
    public static final int MANUALLY_ENTER_HANDWRITE_MASK_TIMES = 154;
    public static final int MAX_CACHEINPUTSIZE = 44;
    public static final int MAX_SETTING = 399;
    public static final int MISSION_STATE_CLOSE = 3;
    public static final int MISSION_STATE_FINISH = 2;
    public static final int MISSION_STATE_INIT = 0;
    public static final int MISSION_STATE_START = 1;
    public static final int MISTYPING_CORRECTION = 9;
    public static final int MISTYPING_FULL_CORRECT = 4;
    public static final int MISTYPING_LOWLEVEL_CORRECT = 2;
    public static final int MISTYPING_NO_CORRECT = 1;
    public static final int MISTYPING_NO_SINGLE_WORD = 3;
    public static final int MIXLANGUAGE_INPUT = 12;
    public static final int MIX_LANGUAGE = 49;
    public static final int MOBIL_IDENTIFY_INFORMATION = 381;
    public static final int NEED_CHANGE_KEYBOARD_BG = 361;
    public static final int NEED_CHECK_IMPORTED_DATA = 323;
    public static final int NEED_REFRESH_MORE_TAB_NEW_TAG = 238;
    public static final int NETWORK_DATA_NEXT_CHECK_TIME = 333;
    @Deprecated
    public static final int NEVER_USED = 0;
    public static final int NEW_LOG_LAST_CHECK_TIMESTAMP = 240;
    public static final int NEW_LOG_NEXT_CHECK_TIME = 239;
    public static final int NEXT_ACTIVE_TIME = 130;
    public static final int NEXT_CONTACT_IMPORT_TIME = 132;
    public static final int NEXT_LOCALIZE_WEB_TIME = 206;
    public static final int NEXT_LOG_UPLOAD_TIME = 187;
    public static final int NEXT_QUERY_PAOPAO_NEWS_TIME = 90;
    public static final int NEXT_QUERY_UPDATE_TIME = 91;
    public static final int NEXT_STATISTIC_WORD_PREDIC_STATUS_TIME = 289;
    public static final int NEXT_STAT_STROKE_FILTER_TIME = 292;
    public static final int NEXT_SYS_USER_DIC_IMPORT_TIME = 165;
    public static final int OCEAN_LANGUAGE_STATUS = 70;
    public static final String OEM_UPDATE_SKIN = "update_skin";
    public static final String OEM_UPDATE_SKIN_CHECKED = "update_skin_checked";
    public static final int OKINAWA_MAX_CATEGORY = 16;
    public static final int OKINAWA_MAX_SETTING = 71;
    public static final int OLD_TOKEN_FORM_UNINSTALL = 394;
    public static final int ONCE_CLEAR_CONTACT = 133;
    public static final int ONE_HANDED_LAYOUT = 212;
    public static final int ONE_HAND_PARAM = 329;
    public static final int OPEN_PAOPAO_PANEL_FIRST = 235;
    public static final int OPTION_PAGE_OPEN_TIMES = 382;
    public static final int PACKAGE_TYPE = 182;
    public static final int PAOPAO = 76;
    public static final int PAOPAO_DRAWER_SHOW_TIMES = 337;
    public static final int PERF_DATA_NEXT_CHECK_TIME = 284;
    public static final int PINYINVAGUE_AN_ANG = 24;
    public static final int PINYINVAGUE_C_CH = 17;
    public static final int PINYINVAGUE_EN_ENG = 25;
    public static final int PINYINVAGUE_F_H = 20;
    public static final int PINYINVAGUE_IAN_IANG = 27;
    public static final int PINYINVAGUE_IN_ING = 26;
    public static final int PINYINVAGUE_L_N = 21;
    public static final int PINYINVAGUE_L_R = 22;
    public static final int PINYINVAGUE_N_R = 23;
    public static final int PINYINVAGUE_S_SH = 18;
    public static final int PINYINVAGUE_UAN_UANG = 28;
    public static final int PINYINVAGUE_Z_ZH = 19;
    public static final int PINYIN_HANDWRITE_MIX_PROMPTED = 156;
    public static final int PIN_MODE_ENTERED = 390;
    public static final int PLUGIN_PINNED = 336;
    public static final int PORTRAIT_KEYBOARD_SIZE = 81;
    public static final int PREDICT_NEXT_WORD = 2;
    public static final int PREUSED_CHS_LANGUAGE = 339;
    public static final int PREUSED_LANGUAGE = 11;
    public static final int PREUSED_LANG_BEFORE_UPDATE = 378;
    @Deprecated
    public static final int PREVIEW = 75;
    public static final int PREVIEW_ADVANCED = 2;
    public static final int PREVIEW_CLOSED = 0;
    public static final int PREVIEW_LEVEL = 193;
    public static final int PREVIEW_NORMAL = 1;
    @Deprecated
    public static final int PRODUCT_ACTIVATION_CODE = 92;
    public static final int PRODUCT_TYPE = 162;
    public static final int PRODUCT_TYPE_INTERNATIONAL = 1;
    public static final int PRODUCT_TYPE_MAINLAND = 2;
    @Deprecated
    public static final int QUICK_SETTINGS_NEW_SETTINGS = 203;
    public static final int QUICK_SWITCHER_DICT = 109;
    public static final int QUICK_SWITCHER_LANGUAGE = 107;
    public static final int QUICK_SWITCHER_LAYOUT = 108;
    public static final int QUICK_SWITCHER_PREV_LANGUAGE = 140;
    public static final int QUICK_SWITCHER_PREV_LAYOUT_L = 142;
    public static final int QUICK_SWITCHER_PREV_LAYOUT_P = 141;
    public static final int RATE_US_BUTTON_CLICKED = 308;
    public static final int RATE_US_NEXT_SHOW_TIME = 307;
    public static final int RATE_US_NOTICATION_SHOW_TIMES = 325;
    public static final int RECENTLY_USED_EMOJI = 276;
    public static final int RECENTLY_USED_SYMBOLS = 291;
    @Deprecated
    public static final int RECENTLY_USED_SYMBOLS_CHS = 129;
    @Deprecated
    public static final int RECENTLY_USED_SYMBOLS_ENG = 128;
    public static final int RECENT_LOACALE = 349;
    public static final int RECOMMEND_CHANNEL_CODE = 313;
    public static final int RECOMMEND_VERSION_CODE = 352;
    public static final int RECORD_TIMESTAMP = 391;
    public static final int REFERRER = 369;
    @Deprecated
    public static final int SAVED_LANGUAGE_HISTORY = 114;
    public static final int SAVED_SEARCH_RESULT = 397;
    public static final int SCREENSHOT_TAKEN = 379;
    @Deprecated
    public static final int SCREEN_ORIENTATION = 143;
    @Deprecated
    public static final int SELECT_LANGUAGE_DIALOG = 121;
    public static final int SERVER_USER_TOKEN = 88;
    public static final String SETTINGS_FILE_NAME = "TouchPalOptions";
    public static final String SETTING_SCREENSHOT = "setting_screenshot";
    public static final int SHOW_ARCTIC_PREDICT_ALERT_DIALOG = 285;
    @Deprecated
    public static final int SHOW_AUTO_SPACE_TIP = 220;
    public static final int SHOW_CANDIDATE_ON_STARTINPUT = 65;
    public static final int SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION = 241;
    public static final int SHOW_DIALER_PROMOTE = 190;
    public static final int SHOW_DOUBLE_CLICK_SHIFT_TIPS = 205;
    public static final int SHOW_EMOJI_IN_APP_TIP = 245;
    public static final int SHOW_EMOJI_WORKING_TIPS = 318;
    public static final int SHOW_FOLLOW_WEIBO = 172;
    public static final int SHOW_FORBID_SIMPLE_CANDIDATE_STYLE_DIALOG = 249;
    public static final int SHOW_HOTWORD_PAOPAO = 185;
    public static final int SHOW_INSTALL_INCOMPATIBLE_LANGUAGE = 197;
    public static final int SHOW_LANGPACKS_ADDON = 149;
    public static final int SHOW_LANG_FIRST_SETUP_DLG = 199;
    public static final int SHOW_PAOPAO_INDICATOR = 135;
    public static final int SHOW_PINYINCURVE_TUTORIAL_DIALOG = 252;
    public static final int SHOW_PRIVACY_POLICY = 150;
    public static final int SHOW_PROMOTE_PINYIN_ADDONS = 134;
    public static final int SHOW_SKIN_UPDATE_DIALOG = 231;
    @Deprecated
    public static final int SHOW_SLIDE_WIZARD = 223;
    public static final int SHOW_SUPER_DICT_DOWNLOAD_REMINDER = 301;
    public static final int SHOW_SUPER_DICT_EXPIRED_REMINDER = 302;
    public static final int SHOW_SWITCH_LANGUAGE_TIP = 340;
    public static final int SHOW_TUTORIAL = 104;
    @Deprecated
    public static final int SHOW_WAVE_ENABLE_DIALOG = 218;
    public static final int SHOW_WAVE_QUICK_SLIDE_TIPS_TIMES = 221;
    public static final int SHOW_WAVE_TIP_CONTINUE_SLIDE = 216;
    @Deprecated
    public static final int SHOW_WAVE_TIP_CONTINUE_SLIDE_DIALOG = 217;
    public static final int SHOW_WAVE_TIP_SLIDE_DOWN = 215;
    public static final int SHOW_WAVE_TUTORIAL_DIALOG = 242;
    public static final int SHOW_WRONG_UPDATE_DIALOG = 306;
    public static final int SHOW_YAHOO_SEARCH = 398;
    public static final int SHUANGPIN_CONFIG = 51;
    public static final int SHUANGPIN_CONFIG_JJ = 3;
    public static final int SHUANGPIN_CONFIG_MS = 6;
    public static final int SHUANGPIN_CONFIG_NONE = 1;
    public static final int SHUANGPIN_CONFIG_SG = 7;
    public static final int SHUANGPIN_CONFIG_USER = 9;
    public static final int SHUANGPIN_CONFIG_XH = 4;
    public static final int SHUANGPIN_CONFIG_ZG = 8;
    public static final int SHUANGPIN_CONFIG_ZN = 5;
    public static final int SHUANGPIN_CONFIG_ZR = 2;
    public static final String SIM_CHS_LANGUAGE = "simplified_chinese";
    public static final int SKIN = 80;
    public static final int SKIN_FIRST_INSTALLED_TIME = 371;
    public static final int SLIDE_INPUT_TIP_STATE = 230;
    public static final int SMARTDIALER_PROMOTION_PAOPAO_SHOWN = 139;
    public static final int SMART_AUTOSPACE = 56;
    public static final int SMART_SEARCH_NEXT_DETAIL_SHOW_TIME = 297;
    public static final int SMART_SEARCH_PREVIEW_POSITION_Y = 296;
    public static final int SMS_AUTO_LEARN = 176;
    public static final int SMS_LEARNING_LAST_DATE_INBOX = 179;
    public static final int SMS_LEARNING_LAST_DATE_SEND = 171;
    public static final int SMS_LEARN_RESULT = 175;
    public static final int SMS_LEARN_RESULT_FAILED = 2;
    public static final int SMS_LEARN_RESULT_NONE = 3;
    public static final int SMS_LEARN_RESULT_NOT_START = 0;
    public static final int SMS_LEARN_RESULT_SUCCESS = 1;
    public static final int SMS_NEXT_IMPORT_TIME = 177;
    public static final int SMS_ONLY_IMPORT_OUTGOING = 178;
    public static final int SOUND = 72;
    public static final int SPACE_GET_NEXTWORD = 36;
    public static final int SPACE_LONG_PRESS_TIP_STATE = 237;
    public static final int SPELL_CHECK = 33;
    public static final int SPELL_CHECK_ADVANCE = 2;
    public static final int SPELL_CHECK_CLOSE = 1;
    public static final int SPELL_CHECK_NORMAL = 3;
    public static final int STATISTIC_DATA = 35;
    public static final int STATISTIC_ENABLED = 34;
    public static final int STATISTIC_USAGE_CONFIG = 279;
    public static final int STROKE_FILTER = 8;
    public static final int SUPER_DICT_DOWNLOADED = 300;
    public static final int SUPER_DICT_ENABLED_UI = 299;
    public static final int SUPPORT_AUTO_CHANGE_TITLE_CASE = 386;
    public static final int SURFACE_SLIP = 5;
    public static final int SURFACE_TYPE_HARD_KEYBOARD = 5;
    public static final int SURFACE_TYPE_HARD_SYMBOL = 6;
    public static final int SURFACE_TYPE_POPUP_EXPAND = 7;
    public static final int SURFACE_TYPE_SOFT_FULLCANDIDATE = 3;
    public static final int SURFACE_TYPE_SOFT_KEYBOARD = 1;
    public static final int SURFACE_TYPE_SOFT_SPECIAL = 4;
    public static final int SURFACE_TYPE_SOFT_SYMBOL = 2;
    public static final int SWICTH_LANGUAGE_NOT_SET = 0;
    public static final int SWITCH_LANGUAGE_WITHOUT_LANG_KEY = 2;
    public static final int SWITCH_LANGUAGE_WITH_LANG_KEY = 1;
    public static final int SYMBOL_DISABLE_LOCK = 2;
    public static final int SYMBOL_DISABLE_UNLOCK = 4;
    public static final int SYMBOL_DISPLAY_EMOTICON = 202;
    public static final int SYMBOL_ENABLE_LOCK = 1;
    public static final int SYMBOL_ENABLE_UNLOCK = 0;
    public static final int SYMBOL_KEYBOARD_LAYOUT = 110;
    @Deprecated
    public static final int SYMBOL_LOCK = 38;
    public static final int SYMBOL_LOCK_STATUS = 127;
    public static final int SYMBOL_TAB_PROPMT_TIMES = 96;
    public static final int SYM_CURRENT_PAGE = 94;
    public static final int SYM_CURRENT_TAB = 93;
    public static final int SYM_CURRENT_TAB_CHS = 138;
    public static final int SYS_USER_DIC_IMPORTED = 164;
    private static final String TAG = "Settings";
    public static final int TEACHING_MISSION_STATE = 219;
    public static final int TOTALLY_NEW_PACK = 303;
    public static final int TOUCH_CORRECT = 39;
    public static final int TOUCH_TO_SAVE_TIP_OCCURED = 214;
    public static final int TRAD_SIMP_CONVERT_AUTO = 0;
    public static final int TRAD_SIMP_CONVERT_OUTPUT_SIMP = 1;
    public static final int TRAD_SIMP_CONVERT_OUTPUT_TRAD = 2;
    public static final int TRAD_SIMP_CONVERT_STRATEGY = 60;
    @Deprecated
    public static final int TRANSLATE_CHS = 15;
    public static final String TRD_CHS_LANGUAGE = "traditional_chinese";
    public static final int TWITTER_IMPORT_SINCE_ID = 170;
    public static final int TWITTER_LEARN_RESULT = 174;
    public static final int TWITTER_LEARN_RESULT_FAILED = 2;
    public static final int TWITTER_LEARN_RESULT_NONE = 3;
    public static final int TWITTER_LEARN_RESULT_NOT_START = 0;
    public static final int TWITTER_LEARN_RESULT_SUCCESS = 1;
    public static final int UI_MULTITHREADING_OPTIMIZE = 288;
    public static final int UPDATE_LIVE_WORDS = 247;
    public static final int UPDATE_OEM = 351;
    public static final int UPLOAD_INFO_NEXT_QUERY_TIME = 283;
    public static final int UPLOAD_USER_INPUT_CHECKER_FAILED_TIMES = 368;
    public static final int USERDATA_COLLECT_ENABLE = 146;
    public static final int USER_DICT_CHECK_STRICT_MODE = 316;
    public static final int USER_DICT_REPORT_ENABLE = 317;
    public static final int USER_DIC_BASE_VERSION = 261;
    public static final int USER_DIC_CURRENT_VERSION = 263;
    public static final int USER_DIC_MD5 = 277;
    public static final int USER_DIC_REF_VERSION = 262;
    public static final int USER_INPUT_DATA_UPLOAD_TIME = 222;
    @Deprecated
    public static final int USE_LITE_EMOJI = 274;
    public static final int USE_SYSTEM_DEFAULT_FONT = 243;
    public static final String UUID = "uuid";
    public static final int V4_USRDICT_IMPORTED = 184;
    @Deprecated
    public static final int VIBRATE = 73;
    public static final int VIBRATE_TIME = 250;
    public static final int VIP_RENEW_CHECK_NEXT_TIME = 315;
    public static final int VIP_RENEW_NEVER_REMINDED = 0;
    public static final int VIP_RENEW_REMINDED = 1;
    public static final int VIP_RENEW_REMINDER = 314;
    @Deprecated
    public static final int VOICE_CHINESE_INPUT_LANGUAGE = 253;
    public static final int VOICE_INPUT_DEFAULT = 0;
    public static final int VOICE_INPUT_ENGINE = 298;
    public static final int VOICE_INPUT_LANGUAGE = 293;
    public static final int VOICE_INPUT_SYSTEM = 1;
    public static final int VOICE_VERSION_DIALOG_SHOWED = 324;
    public static final int WAVE_ENABLE = 53;
    public static final int WAVE_WITHOUT_NEXT_WORD_ON_CANDIDATE = 226;
    public static final int WESTERN_SENTENCE_ENABLED = 50;
    public static final int WORD_PREDICTION = 1;
    public static final int WUBI_AUTO_ADJUST_TIP_OCCURED = 207;
    public static final int WUBI_BIGCHARSET = 43;
    public static final int WUBI_COMMITWHENUNIQUE = 41;
    public static final int WUBI_DISPLAYCODE = 42;
    @Deprecated
    public static final int WUBI_Z_MODE_INSTALL_PINYIN_TIPS = 173;
    public static final int WUBI_Z_MODE_PROMPTED = 147;
    private static boolean mInitialized = false;
    private static Settings mInstance;
    private static final String[] sCategoryTypes = {"FASTSWITCH", "SUBTYPE", "MIXINPUT", "CELLDICT", "NEXTWORD", "CURVE", "USERWORD", "MISTYPING", "RECOGRANGE", "LAYOUT", "SPEED", "SENTENCE", "ADTLEARNING", "PRIORITY", "SPGETNEXTWORD", "CLOUDINPUT", "EMOJI", "LANGUAGE", "COMPLETEDICTIONARY", "MISSIONSTATE", "DOWNLOADLIMITATION", "USER_DICT", "SMILEYCATEGORY", "CATEGORY_PLUGIN_PINNED", "CATEGORY_CHS_LANGUAGE", "CATEGORY_DRAWER_GUIDE_POINT", "CATEGORY_UPDATE_OEM", "CATEGORY_INPUT_TYPE", "CATEGORY_CUSTOM_SKIN_NUMBER", "CATEGORY_DRAWER_ITEM_CLICK", "CATEGORY_SKIN_PACKAGE_NAME", "CATEGORY_SCREENSHOT_COLLECTION", "CATEGORY_MOBILE_IDENTIFY_INFORMATION", "CATEGORY_ADS_SOURCE", "CATEGORY_KEYBOARD_MARGIN", "CATEGORY_TIMESTAMP"};
    private static HashMap<String, Integer> sKeyIdMap = new HashMap<>();
    private static final String[] sKeyStrings = {"NEVER_USED", "WORD_PREDICTION", "PREDICT_NEXT_WORD", "KEYBOARD_SUBTYPE", "KEYBOARD_LAYOUT", "SURFACE_SLIP", "DISABLED_SYMBOL_TAB", "DOWNSLIDE_SYMBOLS", "STROKE_FILTER", "MISTYPING_CORRECTION", C1060e.f3014e, "PREUSED_LANGUAGE", "MIXLANGUAGE_INPUT", "ENABLED_LANGUAGE", C1060e.f3013d, "TRANSLATE_CHS", "CELL_DICTIONARY", "PINYINVAGUE_C_CH", "PINYINVAGUE_S_SH", "PINYINVAGUE_Z_ZH", "PINYINVAGUE_F_H", "PINYINVAGUE_L_N", "PINYINVAGUE_L_R", "PINYINVAGUE_N_R", "PINYINVAGUE_AN_ANG", "PINYINVAGUE_EN_ENG", "PINYINVAGUE_IN_ING", "PINYINVAGUE_IAN_IANG", "PINYINVAGUE_UAN_UANG", "HANDWRITE_RECOG_RANGE", "CURVE_PREDICTION", "CURVE_ENABLED", "ADAPTIVE_LEARNING", "SPELL_CHECK", "STATISTIC_ENABLED", "STATISTIC_DATA", "SPACE_GET_NEXTWORD", "AUTOSPACE_ENABLE", "SYMBOL_LOCK", "TOUCH_CORRECT", "ENV_WORD", "WUBI_COMMITWHENUNIQUE", "WUBI_DISPLAYCODE", "WUBI_BIGCHARSET", "MAX_CACHEINPUTSIZE", "EMOJI_ENABLED", "CLOUD_ENABLED", "AUTO_SAVE_USERWORD", "HANDWRITE_MASK_ENABLED", "MIX_LANGUAGE", "WESTERN_SENTENCE_ENABLED", "SHUANGPIN_CONFIG", "AUTO_ADJUST_WORD_PRIORITY", "WAVE_ENABLE", "AUTO_CAPITALIZATION", "FORWARD_PREDICTION", "SMART_AUTOSPACE", "JIANPIN_SENTENCE_ENABLED", "ERROR_PRONUNCIATION", "AUTO_CORRECTION", "TRAD_SIMP_CONVERT_STRATEGY", "LOCAL_CLOUD_SEARCH_ENABLED", "EMOJI_PREDICTION", "DIAGNOSE_MODE_ENABLED", "AUTO_CAPITALIZE_LAST", C1246d.f3866cd, "AUTO_MERGING_WORD", "CURVE_ENV_WORD", "BACKWARD_CORRECTION", "CURVE_BACKWARD_CORRECTION", "OCEAN_LANGUAGE_STATUS", "BACKSPACE_TO_REPLACE_INLINE", "SOUND", "VIBRATE", "BUTTON_DELIVER", "PREVIEW", "PAOPAO", "LAST_CHECK_TASK_DAY", "FUNCTIONBAR", "FUNCTIONBAR_SETTINGS", "SKIN", "PORTRAIT_KEYBOARD_SIZE", "CURVE_IN_TIME", "AUTO_UPDATE_VERSION", "INPUT_SPEED_BAR", "INPUT_TOP_SPEED_CHINESE", "INPUT_TOP_SPEED_OTHER", "ANIMATION_EFFECT", C2441Q.f10636a, "PAOPAO_LAST_NEWS_ID", "PAOPAO_NEXT_QUERY_NEWS_TIME", "PAOPAO_NEXT_QUERY_UPDATE_TIME", "PRODUCT_ACTIVATION_CODE", "SYM_CURRENT_TAB", "SYM_CURRENT_PAGE", "CURRENT_DICTIONARY_TIMESTAMP", "SYMBOL_TAB_PROPMT_TIMES", "LBS_NOTIFIED_LOCATION", "LBS_NOTIFIED_LOCATION_CLEAR_TIME", "APPLY_SYSTEM_VOLUME", "HANDWRITE_COLOR", "HANDWRITE_WIDTH", "HANDWRITE_INTERVAL", "IME_CUR_VERSION", "SHOW_TUTORIAL", "DICTIONARY_UPDATE_INTERVAL", "DICTIONARY_LAST_UPDATE_TIME", "QUICK_SWITCHER_LANGUAGE", "QUICK_SWITCHER_LAYOUT", "QUICK_SWITCHER_DICT", "SYMBOL_KEYBOARD_LAYOUT", "HARD_SYMBOL_CURRENT_TAB", "HARD_SYMBOL_TAB_FOCUSED", "LANGUAGE_INSTALLED_ONCE", "SAVED_LANGUAGE_HISTORY", "FIRST_DEL_WIZARD", "FIRST_LAN_LONG_PRESS", "FIRST_CHS_KEYBOARD", "FIRST_CHS_MORE", "FIRST_START_KEYBOARD", "FIRST_START_TIME", "SELECT_LANGUAGE_DIALOG", "EMOTION_SCROLL", "CANDIDATE_SIZE", "CLOUD_HANDWRITING_VALID", "CLOUD_HANDWRITING_ENABLED", "CLOUD_HANDWRITING_PROMPTED", "SYMBOL_LOCK_STATUS", "RECENTLY_USED_SYMBOLS_ENG", "RECENTLY_USED_SYMBOLS_CHS", "NEXT_ACTIVE_TIME", "CONTACT_IMPORTED", "NEXT_CONTACT_IMPORT_TIME", "ONCE_CLEAR_CONTACT", "SHOW_PROMOTE_PINYIN_ADDONS", "SHOW_PAOPAO_INDICATOR", "CURVE_DOWNLOAD_PROMPTED", "CLOUD_HANDWRITING_UPDATE_TIME", "SYM_CURRENT_TAB_CHS", "SMARTDIALER_PROMOTION_PAOPAO_SHOWN", "QUICK_SWITCHER_PREV_LANGUAGE", "QUICK_SWITCHER_PREV_LAYOUT_P", "QUICK_SWITCHER_PREV_LAYOUT_L", "SCREEN_ORIENTATION", "CURVE_ENABLED_UI", "LANGUAGE_USED_TIMES", "USERDATA_COLLECT_ENABLE", "WUBI_Z_MODE_PROMPTED", "LAST_NOTIFY_UPDATE", "SHOW_LANGPACKS_ADDON", "SHOW_PRIVACY_POLICY", "FIRST_LAYOUT_SELECT", "FIRST_SIZE_ADJUSTMENT", "API_INPUT_CONNECTION_DISABLED", "MANUALLY_ENTER_HANDWRITE_MASK_TIMES", "FIRST_HANDWRITE_TIPS", "PINYIN_HANDWRITE_MIX_PROMPTED", "AUTO_LEAVE_HANDWRITE_MASK_TIMES", "LAST_PAOPAO_PANEL_TAB", "KEY_SPEED_TOTAL_TIME", "KEY_SPEED_TOTAL_KEY_TIMES", "EMOTION_KEY_LONG_PRESS", "PRODUCT_TYPE", "DEVICE_TYPE", "SYS_USER_DIC_IMPORTED", "NEXT_SYS_USER_DIC_IMPORT_TIME", "IMPORT_SYS_USER_DIC_ENABLE", "DYNAMIC_SPELL_CHECK_ENABLE", "CLOKE_ENABLE_MODE", "INVITE_SUCCEED", "TWITTER_IMPORT_SINCE_ID", "SMS_LEARNING_LAST_DATE_SEND", "SHOW_FOLLOW_WEIBO", "WUBI_Z_MODE_INSTALL_PINYIN_TIPS", "TWITTER_LEARN_RESULT", "SMS_LEARN_RESULT", "SMS_AUTO_LEARN", "SMS_NEXT_IMPORT_TIME", "SMS_ONLY_IMPORT_OUTGOING", "SMS_LEARNING_LAST_DATE_INBOX", "FIRST_TUTORIAL_WELCOME", "FIRST_START_INPUTMETHOD", "PACKAGE_TYPE", "HARD_KEYBOARD_TIP_SHOWN_TIMES", "V4_USRDICT_IMPORTED", "SHOW_HOTWORD_PAOPAO", "LANGUAGE_KEY_COMMA_MODE", "NEXT_LOG_UPLOAD_TIME", "FIRST_LANGUAGE_MODE", "FIRST_LANGUAGE_LAYOUT", "SHOW_DIALER_PROMOTE", "FIRST_BIGRAM_HIGHLIGHT", "LANGUAGE_JUST_INSTALLED", "PREVIEW_LEVEL", "KEYBOARD_SPECIAL_ENGLISH_SUBTYPE", "IS_CHINESE_LANGUAGE_ENABLED", "HAS_SET_COMMA_MODE_MANUALLY", "SHOW_INSTALL_INCOMPATIBLE_LANGUAGE", "FIRST_VERSION_UPDATE", "SHOW_LANG_FIRST_SETUP_DLG", "LAST_ACTIVATION_SUCCESS_TIME", "ACTIVATE_IDENTIFIER", "SYMBOL_DISPLAY_EMOTICON", "QUICK_SETTINGS_NEW_SETTINGS", "DICTIONARY_COMPLETE", "SHOW_DOUBLE_CLICK_SHIFT_TIPS", "NEXT_LOCALIZE_WEB_TIME", "WUBI_AUTO_ADJUST_TIP_OCCURED", "FIRST_INSTALL_TIME", "LAST_BACKUP_DICT_TIME", "LAST_CLOUD_BACKUP_DICT_TIME", "LAST_CLOUD_RESTORE_DICT_TIME", "ONE_HANDED_LAYOUT", "IS_KEYBOARD_ZOOMING_AT_LEFT", "TOUCH_TO_SAVE_TIP_OCCURED", "SHOW_WAVE_TIP_SLIDE_DOWN", "SHOW_WAVE_TIP_CONTINUE_SLIDE", "SHOW_WAVE_TIP_CONTINUE_SLIDE_DIALOG", "SHOW_WAVE_ENABLE_DIALOG", "TEACHING_MISSION_STATE", "SHOW_AUTO_SPACE_TIP", "SHOW_WAVE_QUICK_SLIDE_TIPS_TIMES", "USER_INPUT_DATA_UPLOAD_TIME", "SHOW_SLIDE_WIZARD", "AUTO_BACKUP_DICTIONARY_TIME", "CURRENT_SMILEY_TAB", "WAVE_WITHOUT_NEXT_WORD_ON_CANDIDATE", "CURRENT_EMOJI_INPUT_TYPE", "GUIDE_PLAY_STATE", "ADVANCED_VIBRATION", "SLIDE_INPUT_TIP_STATE", "SHOW_SKIN_UPDATE_DIALOG", "HAS_DOWNLOAD_LIMITATION", "DOWNLOADED_PKG_COUNT", "ALREADY_OWN_PKGS", "OPEN_PAOPAO_PANEL_FIRST", "CURVE_DOWNLOAD_LANGUAGE", "SPACE_LONG_PRESS_TIP_STATE", "NEED_REFRESH_MORE_TAB_NEW_TAG", "NEW_LOG_NEXT_CHECK_TIME", "NEW_LOG_LAST_CHECK_TIMESTAMP", "SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION", "SHOW_WAVE_TUTORIAL_DIALOG", "USE_SYSTEM_DEFAULT_FONT", "COMMIT_ANIMATION_ENABLED", "SHOW_EMOJI_IN_APP_TIP", "CURRENT_HOTWORD_DICTIONARY_ID", "UPDATE_LIVE_WORDS", "FORBID_SIMPLE_CANDIDATE_STYLE", "SHOW_FORBID_SIMPLE_CANDIDATE_STYLE_DIALOG", "VIBRATE_TIME", "ACCESSIBILITY_ENABLED", "SHOW_PINYINCURVE_TUTORIAL_DIALOG", "VOICE_CHINESE_INPUT_LANGUAGE", "KEYBOARD_HEIGHT_NORMAL", "KEYBOARD_HEIGHT_HW", "KEYBOARD_BOTTOM_MARGIN", "KEYBOARD_LEFT_MARGIN_RATIO", "KEYBOARD_RIGHT_MARGIN_RATIO", "KEYBOARD_POSITION", "CLOUD_BACKUP_SYNC", "USER_DIC_BASE_VERSION", "USER_DIC_REF_VERSION", "USER_DIC_CURRENT_VERSION", "CLOUD_SERVICE_WIFI_ONLY", "CLOUD_SERVICE_LAST_SYNC_TIME", "CLOUD_SERVICE_SYNC_NEXT_TIME", "GOODS_CHECK_NEXT_TIME", "HAS_ACCEPTED_POLICY", "INITIALIZED_TOUCHPAL_CLOUD_IN_GUIDE", "ACCOUNT_INFO", "ACCOUNT_CHECK_NEXT_TIME", "ARCTIC_CLOUD_INPUT_ENABLE", "HOTWORD_LAST_UPDATE_TIME", "USE_LITE_EMOJI", "CURRENT_SMILEY_CATEGORY", "RECENTLY_USED_EMOJI", "USER_DIC_MD5", "BIND_GOOGLE_SERVICE_FAILED", "STATISTIC_USAGE_CONFIG", "HAS_CLICKED_DOWNLOAD_EMOJI_BUTTON", "HOTWORD_PAGE_ACCESS_TIME", "HAS_SLOGAN_ANIMATION_PLAYED", "UPLOAD_INFO_NEXT_QUERY_TIME", "PERF_DATA_NEXT_CHECK_TIME", "SHOW_ARCTIC_PREDICT_ALERT_DIALOG", C1246d.f3729Z, "FIRST_ENTER_SHOP", "UI_MULTITHREADING_OPTIMIZE", "NEXT_STATISTIC_WORD_PREDIC_STATUS_TIME", "LONG_PRESS_DELAY", "RECENTLY_USED_SYMBOLS", "NEXT_STAT_STROKE_FILTER_TIME", "VOICE_INPUT_LANGUAGE", "LANDSCAPE_SCREEN_MODE", "LAST_ACTIVATE_CONSUME_TIME", "SMART_SEARCH_PREVIEW_POSITION_Y", "SMART_SEARCH_NEXT_DETAIL_SHOW_TIME", "VOICE_INPUT_ENGINE", "SUPER_DICT_ENABLED_UI", "SUPER_DICT_DOWNLOADED", "SHOW_SUPER_DICT_DOWNLOAD_REMINDER", "SHOW_SUPER_DICT_EXPIRED_REMINDER", "TOTALLY_NEW_PACK", "HAS_SHOWN_GUIDE_INTRO_VIEW", "LAST_PRODUCT_TYPE", "SHOW_WRONG_UPDATE_DIALOG", "RATE_US_NEXT_SHOW_TIME", "RATE_US_BUTTON_CLICKED", "EMOJI_VERSION", "DISPLAY_EMOJI_BY_SYSTEM", "APPSFLYER_NEXT_ACTIVE_TIME", "CURRENT_CHANNEL_CODE", "RECOMMEND_CHANNEL_CODE", "VIP_RENEW_REMINDER", "VIP_RENEW_CHECK_NEXT_TIME", "USER_DICT_CHECK_STRICT_MODE", "USER_DICT_REPORT_ENABLE", "SHOW_EMOJI_WORKING_TIPS", "FIRST_START_CLIPBOARD", "CLIPBOARD_NOTIFICATION_SHOWN", "CLIPBOARD_LOCK_NOTIFICATION_SHOWN", "CLIPBOARD_SLOT_EXPANDED_TOAST_SHOWN", "NEED_CHECK_IMPORTED_DATA", "VOICE_VERSION_DIALOG_SHOWED", "RATE_US_NOTICATION_SHOW_TIMES", "IFLY_VOICE_CHOSEN_LANGUAGE", C1060e.f3011b, "DICT_ERROR_ON_DAILY_BACKUP_OCCURRED", "ONE_HAND_PARAM", "CUSTOM_SKIN_ALPHA", "CUSTOM_SKIN_BACKGROUND_COLOR", "CUSTOM_SKIN_COLOR_SET", "NETWORK_DATA_NEXT_CHECK_TIME", "LAST_AUTO_UPDATE_TIMESTAMP", "LANG_KEY_ENABLED", C1246d.f3887cy, "PAOPAO_DRAWER_SHOW_TIMES", "LANGUAGE_SWITCHING_MODE", "PREUSED_CHS_LANGUAGE", "SHOW_SWITCH_LANGUAGE_TIP", "GUIDE_FINISH_PAGE_SHOWED", "DOMAIN_LOOKUP_NEXT_CHECK_TIME", "LAST_CHECK_IMAGE_RESULT", "AUTO_REBUILD_ENABLED", "AUTO_REBUILD_NEXT_CHECK_TIME", "HAS_EMOJI_FONT", "IS_FIRST_KEYBOARD_SHOW", "EMOJI_SHAKE_SHOWN", "RECENT_LOACALE", "DRAWER_GUIDE_POINT_SHOWED", "UPDATE_OEM", "RECOMMEND_VERSION_CODE", "DEFUALT_SKIN_UPDATED", "EMOJI_RECENT_RECODE", "COLORFUL_EMOJI_BUTTON_CLICKED", "FIRST_KEYBOARD_SHOWN_OPEN_DRAWER", "KEYBOARD_SHOW_TIMES", "DYNIMAC_CHANGE_KB_BACKGROUND_TIME", "CURRENT_DYNAMIC_BG_INDEX", "NEED_CHANGE_KEYBOARD_BG", "ACTIVATE_SERVER_REGION", "CUSTOM_SKIN_SET_NUMBER", "CUSTOM_SKIN_CREATE_TIME", "FIRST_SHOW_CANDIDATE_ON_STARTINPUT", "DRAWER_PIN_GUIDE_SHOWED", "LAST_ACTIVATED_TIME_IN_MILLIS", "IS_SMARTINPUT_ACTIVATED", "UPLOAD_USER_INPUT_CHECKER_FAILED_TIMES", "REFERRER", "BUILDIN_SKIN_UPDATE_CHECKED", "SKIN_FIRST_INSTALLED_TIME", "IME_LAST_VERSION", C1060e.f3010a, "LAST_RECORD_USER_PATTERN_TIME", "LAST_RECORD_OPEN_KEYBOARD_TIME", "FIRST_SWITCH_LANGUAGE", "CURRENT_LANG_BEFORE_UPDATE", "PREUSED_LANG_BEFORE_UPDATE", "SCREENSHOT_TAKEN", "APPLY_SYSTEM_VIBRATE", "MOBIL_IDENTIFY_INFORMATION", "OPTION_PAGE_OPEN_TIMES", "LAST_ACTIVE_STAT_TIME", "ADVERTISE_STRATEGY", "ADVERTISE_UPDATE_TIME", "SUPPORT_AUTO_CHANGE_TITLE_CASE", "CURRENT_PERFORMANCE_MODE", "AUTO_ADJUST_SPECIAL_KEYBOARD_SIZE", "KEYBOARD_MARGIN", "PIN_MODE_ENTERED", "RECORD_TIME_STAMP", "LONG_PRESS_COMMA_TIP_SHOWN", "KEYBOARD_NUMBER_ROW_STYLE", "OLD_TOKEN_FORM_UNINSTALL", "COLORFUL_EMOJI_BUTTON_SHOW", "HAS_ACTIVATE_EFFECTIVELY", "SAVED_SEARCH_RESULT", "SHOW_YAHOO_SEARCH", "AUTO_ADJUST_SPECIAL_KEYBOARD_SIZE_TOAST"};
    private static final int[] sNoPersistIdsAfterPreciseMode = {1};
    private static final int[] sNonPersistIdsAfterSpecialMode = new int[0];
    private static final String[] sOrientationTypes = {"P", C1712h.f5602x, "S"};
    private Object[] defaults = new Object[0];
    private boolean isTemporarySettingMode;
    private Config mConfig;
    private Context mContext;
    private boolean mDisabledSpecial;
    private HashSet<String> mModifiedPreferences;
    private HashSet<String> mNullDefaultKeySet = new HashSet<>();
    private CopyOnWriteArrayList<Integer> mPermanentSettingList = new CopyOnWriteArrayList<>();
    private SharedPreferences mPreferences;
    private Map<String, Object> mPreferencesMap;
    private Resources mResources;
    private Hashtable<String, Object> mSpecialPreferencesMap;
    private Hashtable<String, Object> mTempExcludePreferenceMap;
    private List<Integer> mTempExcludeSettingIdList;
    private Hashtable<String, Object> mTemporaryPreferencesMap;

    public enum RECORDED_TIMESTAMP_TAG {
        external_language_time_stamp,
        emoji_plugin_packs_timestamp
    }

    static {
        int length = sKeyStrings.length;
        for (int i = 0; i < length; i++) {
            sKeyIdMap.put(sKeyStrings[i], Integer.valueOf(i));
        }
    }

    public static Settings getInstance() {
        if (mInstance != null) {
            return mInstance;
        }
        throw new IllegalArgumentException("Param InputMethodService is null.");
    }

    public static void initialize(SharedPreferences sharedPreferences, Context context, Config config) {
        mInstance = new Settings(sharedPreferences, context, config);
        mInitialized = true;
    }

    public static boolean isInitialized() {
        return mInitialized;
    }

    public static void destroy() {
        mInstance.writeBack();
        mInstance = null;
        mInitialized = false;
    }

    private Settings(SharedPreferences sharedPreferences, Context context, Config config) {
        this.mPreferences = sharedPreferences;
        this.mModifiedPreferences = new HashSet<>();
        this.mPreferencesMap = sharedPreferences.getAll();
        this.mContext = context;
        this.mResources = context.getResources();
        this.mConfig = config;
        this.mSpecialPreferencesMap = new Hashtable<>();
        this.mTemporaryPreferencesMap = new Hashtable<>();
        this.mTempExcludePreferenceMap = new Hashtable<>();
        this.mTempExcludeSettingIdList = new CopyOnWriteArrayList();
        this.isTemporarySettingMode = false;
        initSetting();
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0021 A[LOOP:0: B:1:0x0021->B:4:0x002a, LOOP_START, PHI: r0 
      PHI: (r0v6 int) = (r0v5 int), (r0v7 int) binds: [B:0:0x0000, B:4:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clearAllSettings() {
        /*
            r3 = this;
            java.util.HashSet<java.lang.String> r0 = r3.mModifiedPreferences
            r0.clear()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.mPreferencesMap
            r0.clear()
            java.util.Hashtable<java.lang.String, java.lang.Object> r0 = r3.mSpecialPreferencesMap
            r0.clear()
            java.util.Hashtable<java.lang.String, java.lang.Object> r0 = r3.mTemporaryPreferencesMap
            r0.clear()
            r3.clearTempExcludeSettings()
            android.content.SharedPreferences r0 = r3.mPreferences
            android.content.SharedPreferences$Editor r1 = r0.edit()
            r1.clear()
            r0 = 0
        L_0x0021:
            boolean r2 = r1.commit()
            if (r2 != 0) goto L_0x002c
            int r0 = r0 + 1
            r2 = 3
            if (r0 <= r2) goto L_0x0021
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.engine.Settings.clearAllSettings():void");
    }

    public Config getConfig() {
        return this.mConfig;
    }

    private boolean needInitDefaults() {
        if (this.defaults.length > 0) {
            return false;
        }
        if (this.mResources == null) {
            if (!C1368X.m6324d()) {
                return false;
            }
            this.mResources = C1368X.m6313b().getResources();
        }
        if (this.mResources != null) {
            return true;
        }
        return false;
    }

    private void initSetting() {
        if (needInitDefaults()) {
            this.defaults = new Object[]{0, Boolean.valueOf(this.mResources.getBoolean(R.bool.WORD_PREDICTION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PREDICT_NEXT_WORD)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_SUBTYPE)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_LAYOUT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SURFACE_SLIP)), Boolean.valueOf(this.mResources.getBoolean(R.bool.DISABLED_SYMBOL_TAB)), Boolean.valueOf(this.mResources.getBoolean(R.bool.DOWNSLIDE_SYMBOLS)), Boolean.valueOf(this.mResources.getBoolean(R.bool.STROKE_FILTER)), Integer.valueOf(this.mResources.getInteger(R.integer.MISTYPING_CORRECTION)), C1974m.m9063a(this.mContext, (int) R.string.CURRENT_LANGUAGE), C1974m.m9063a(this.mContext, (int) R.string.PREUSED_LANGUAGE), Boolean.valueOf(this.mResources.getBoolean(R.bool.MIXLANGUAGE_INPUT)), C1974m.m9063a(this.mContext, (int) R.string.ENABLED_LANGUAGE), C1974m.m9063a(this.mContext, (int) R.string.INSTALLED_LANGUAGE), Boolean.valueOf(this.mResources.getBoolean(R.bool.TRANSLATE_CHS)), C1974m.m9063a(this.mContext, (int) R.string.CELL_DICTIONARY), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_C_CH)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_S_SH)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_Z_ZH)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_F_H)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_L_N)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_L_R)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_N_R)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_AN_ANG)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_EN_ENG)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_IN_ING)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_IAN_IANG)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYINVAGUE_UAN_UANG)), Integer.valueOf(this.mResources.getInteger(R.integer.HANDWRITE_RECOG_RANGE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CURVE_PREDICTION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CURVE_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.ADAPTIVE_LEARNING)), Integer.valueOf(this.mResources.getInteger(R.integer.SPELL_CHECK)), Boolean.valueOf(this.mResources.getBoolean(R.bool.STATISTIC_ENABLED)), C1974m.m9063a(this.mContext, (int) R.string.STATISTIC_DATA), Boolean.valueOf(this.mResources.getBoolean(R.bool.SPACE_GET_NEXTWORD)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTOSPACE_ENABLE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SYMBOL_LOCK)), Boolean.valueOf(this.mResources.getBoolean(R.bool.TOUCH_CORRECT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.ENV_WORD)), Boolean.valueOf(this.mResources.getBoolean(R.bool.WUBI_COMMITWHENUNIQUE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.WUBI_DISPLAYCODE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.WUBI_BIGCHARSET)), Integer.valueOf(this.mResources.getInteger(R.integer.MAX_CACHEINPUTSIZE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.EMOJI_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CLOUD_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTO_SAVE_USERWORD)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HANDWRITE_MASK_ENABLED)), C1974m.m9063a(this.mContext, (int) R.string.MIX_LANGUAGE), Boolean.valueOf(this.mResources.getBoolean(R.bool.WESTERN_SENTENCE_ENABLED)), Integer.valueOf(this.mResources.getInteger(R.integer.SHUANGPIN_CONFIG)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTO_ADJUST_WORD_PRIORITY)), Boolean.valueOf(this.mResources.getBoolean(R.bool.WAVE_ENABLE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTO_CAPITALIZATION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FORWARD_PREDICTION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SMART_AUTOSPACE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.JIANPIN_SENTENCE_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.ERROR_PRONUNCIATION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTO_CORRECTION)), Integer.valueOf(this.mResources.getInteger(R.integer.TRAD_SIMP_CONVERT_STRATEGY)), Boolean.valueOf(this.mResources.getBoolean(R.bool.LOCAL_CLOUD_SEARCH_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.EMOJI_PREDICTION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.DIAGNOSE_MODE_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTO_CAPITALIZE_LAST)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_CANDIDATE_ON_STARTINPUT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTO_MERGING_WORD)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CURVE_ENV_WORD)), Boolean.valueOf(this.mResources.getBoolean(R.bool.BACKWARD_CORRECTION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CURVE_BACKWARD_CORRECTION)), Integer.valueOf(this.mResources.getInteger(R.integer.OCEAN_LANGUAGE_STATUS)), Boolean.valueOf(this.mResources.getBoolean(R.bool.BACKSPACE_TO_REPLACE_INLINE)), Integer.valueOf(this.mResources.getInteger(R.integer.SOUND)), Integer.valueOf(this.mResources.getInteger(R.integer.VIBRATE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.BUTTON_DELIVER)), Integer.valueOf(this.mResources.getInteger(R.integer.PREVIEW)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PAOPAO)), Integer.valueOf(this.mResources.getInteger(R.integer.LAST_CHECK_TASK_DAY)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FUNCTIONBAR)), C1974m.m9063a(this.mContext, (int) R.string.FUNCTIONBAR_SETTINGS), C1974m.m9063a(this.mContext, (int) R.string.SKIN), Integer.valueOf(this.mResources.getInteger(R.integer.PORTRAIT_KEYBOARD_SIZE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CURVE_IN_TIME)), Integer.valueOf(this.mResources.getInteger(R.integer.AUTO_UPDATE_VERSION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.INPUT_SPEED_BAR)), C1974m.m9063a(this.mContext, (int) R.string.INPUT_TOP_SPEED_CHINESE), C1974m.m9063a(this.mContext, (int) R.string.INPUT_TOP_SPEED_OTHER), Boolean.valueOf(this.mResources.getBoolean(R.bool.ANIMATION_EFFECT)), C1974m.m9063a(this.mContext, (int) R.string.SERVER_USER_TOKEN), Integer.valueOf(this.mResources.getInteger(R.integer.PAOPAO_LAST_NEWS_ID)), Integer.valueOf(this.mResources.getInteger(R.integer.PAOPAO_NEXT_QUERY_NEWS_TIME)), Integer.valueOf(this.mResources.getInteger(R.integer.PAOPAO_NEXT_QUERY_UPDATE_TIME)), C1974m.m9063a(this.mContext, (int) R.string.PRODUCT_ACTIVATION_CODE), C1974m.m9063a(this.mContext, (int) R.string.SYM_CURRENT_TAB), Integer.valueOf(this.mResources.getInteger(R.integer.SYM_CURRENT_PAGE)), Integer.valueOf(this.mResources.getInteger(R.integer.CURRENT_DICTIONARY_TIMESTAMP)), Integer.valueOf(this.mResources.getInteger(R.integer.SYMBOL_TAB_PROPMT_TIMES)), C1974m.m9063a(this.mContext, (int) R.string.LBS_NOTIFIED_LOCATION), Integer.valueOf(this.mResources.getInteger(R.integer.LBS_NOTIFIED_LOCATION_CLEAR_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.APPLY_SYSTEM_VOLUME)), C1974m.m9063a(this.mContext, (int) R.string.HANDWRITE_COLOR), Integer.valueOf(this.mResources.getInteger(R.integer.HANDWRITE_WIDTH)), Integer.valueOf(this.mResources.getInteger(R.integer.HANDWRITE_INTERVAL)), Integer.valueOf(this.mResources.getInteger(R.integer.IME_CUR_VERSION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_TUTORIAL)), Integer.valueOf(this.mResources.getInteger(R.integer.DEFAULT_AUTO_UPDATE_INTERVAL)), C1974m.m9063a(this.mContext, (int) R.string.DEFAULT_DICTIONARY_LAST_UPDATE_TIME), C1974m.m9063a(this.mContext, (int) R.string.QUICK_SWITCHER_LANGUAGE), Integer.valueOf(this.mResources.getInteger(R.integer.QUICK_SWITCHER_LAYOUT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.QUICK_SWITCHER_DICT)), Integer.valueOf(this.mResources.getInteger(R.integer.SYMBOL_LAYOUT)), Integer.valueOf(this.mResources.getInteger(R.integer.HARD_SYMBOL_CURRENT_TAB)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HARD_SYMBOL_TAB_FOCUSED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.LANGUAGE_INSTALLED_ONCE)), C1974m.m9063a(this.mContext, (int) R.string.EMPTY_STRING), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_DEL_WIZARD)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_LAN_LONG_PRESS)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_CHS_KEYBOARD)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_CHS_MORE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_START_KEYBOARD)), Integer.valueOf(this.mResources.getInteger(R.integer.FIRST_START_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SELECT_LANGUAGE_DIALOG)), Boolean.valueOf(this.mResources.getBoolean(R.bool.EMOTION_SCROLL)), Integer.valueOf(this.mResources.getInteger(R.integer.CANDIDATE_SIZE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CLOUD_HANDWRITING_VALID)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CLOUD_HANDWRITING_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CLOUD_HANDWRITING_PROMPTED)), Integer.valueOf(this.mResources.getInteger(R.integer.SYMBOL_LOCK_STATUS)), C1974m.m9063a(this.mContext, (int) R.string.RECENTLY_USED_SYMBOLS_ENG), C1974m.m9063a(this.mContext, (int) R.string.RECENTLY_USED_SYMBOLS_CHS), Integer.valueOf(this.mResources.getInteger(R.integer.NEXT_ACTIVE_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CONTACT_IMPORTED)), Integer.valueOf(this.mResources.getInteger(R.integer.NEXT_CONTACT_IMPORT_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.ONCE_CLEAR_CONTACT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_PROMOTE_PINYIN_ADDONS)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_PAOPAO_INDICATOR)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CURVE_DOWNLOAD_PROMPTED)), Integer.valueOf(this.mResources.getInteger(R.integer.CLOUD_HANDWRITING_UPDATE_TIME)), C1974m.m9063a(this.mContext, (int) R.string.SYM_CURRENT_TAB_CHS), Boolean.valueOf(this.mResources.getBoolean(R.bool.SMARTDIALER_PROMOTION_PAOPAO_SHOWN)), C1974m.m9063a(this.mContext, (int) R.string.QUICK_SWITCHER_PREV_LANGUAGE), Integer.valueOf(this.mResources.getInteger(R.integer.QUICK_SWITCHER_PREV_LAYOUT_P)), Integer.valueOf(this.mResources.getInteger(R.integer.QUICK_SWITCHER_PREV_LAYOUT_L)), 0, Boolean.valueOf(this.mResources.getBoolean(R.bool.CURVE_ENABLED_UI)), Integer.valueOf(this.mResources.getInteger(R.integer.LANGUAGE_USED_TIMES)), Boolean.valueOf(this.mResources.getBoolean(R.bool.USERDATA_COLLECT_ENABLE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.WUBI_Z_MODE_PROMPTED)), Integer.valueOf(this.mResources.getInteger(R.integer.LAST_NOTIFY_UPDATE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_LANGPACKS_ADDON)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_PRIVACY_POLICY)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_LAYOUT_SELECT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_SIZE_ADJUSTMENT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.API_INPUT_CONNECTION_DISABLED)), Integer.valueOf(this.mResources.getInteger(R.integer.MANUALLY_ENTER_HANDWRITE_MASK_TIMES)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_HANDWRITE_TIPS)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PINYIN_HANDWRITE_MIX_PROMPTED)), Integer.valueOf(this.mResources.getInteger(R.integer.AUTO_LEAVE_HANDWRITE_MASK_TIMES)), Integer.valueOf(this.mResources.getInteger(R.integer.LAST_PAOPAO_PANEL_TAB)), C1974m.m9063a(this.mContext, (int) R.string.KEY_SPEED_TOTAL_TIME), C1974m.m9063a(this.mContext, (int) R.string.KEY_SPEED_TOTAL_KEY_TIMES), Boolean.valueOf(this.mResources.getBoolean(R.bool.EMOTION_KEY_LONG_PRESS)), Integer.valueOf(this.mResources.getInteger(R.integer.PRODUCT_TYPE)), Integer.valueOf(this.mResources.getInteger(R.integer.DEVICE_TYPE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SYS_USER_DIC_IMPORTED)), Integer.valueOf(this.mResources.getInteger(R.integer.NEXT_SYS_USER_DIC_IMPORT_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.IMPORT_SYS_USER_DIC_ENABLE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.DYNAMIC_SPELL_CHECK_ENABLE)), Integer.valueOf(this.mResources.getInteger(R.integer.CLOKE_ENABLE_MODE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.INVITE_SUCCEED)), C1974m.m9063a(this.mContext, (int) R.string.TWITTER_IMPORT_SINCE_ID), C1974m.m9063a(this.mContext, (int) R.string.SMS_LEARNING_LAST_DATE_SEND), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_FOLLOW_WEIBO)), Integer.valueOf(this.mResources.getInteger(R.integer.WUBI_Z_MODE_INSTALL_PINYIN_TIPS)), Integer.valueOf(this.mResources.getInteger(R.integer.TWITTER_LEARN_RESULT)), Integer.valueOf(this.mResources.getInteger(R.integer.SMS_LEARN_RESULT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SMS_AUTO_LEARN)), Integer.valueOf(this.mResources.getInteger(R.integer.SMS_NEXT_IMPORT_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SMS_ONLY_IMPORT_OUTGOING)), C1974m.m9063a(this.mContext, (int) R.string.SMS_LEARNING_LAST_DATE_INBOX), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_TUTORIAL_WELCOME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_START_INPUTMETHOD)), Integer.valueOf(this.mResources.getInteger(R.integer.PACKAGE_TYPE)), Integer.valueOf(this.mResources.getInteger(R.integer.HARD_KEYBOARD_TIP_SHOWN_TIMES)), Boolean.valueOf(this.mResources.getBoolean(R.bool.V4_USRDICT_IMPORTED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_HOTWORD_PAOPAO)), Boolean.valueOf(this.mResources.getBoolean(R.bool.LANGUAGE_KEY_COMMA_MODE)), Integer.valueOf(this.mResources.getInteger(R.integer.NEXT_LOG_UPLOAD_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_LANGUAGE_MODE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_LANGUAGE_LAYOUT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_DIALER_PROMOTE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_BIGRAM_HIGHLIGHT)), C1974m.m9063a(this.mContext, (int) R.string.LANGUAGE_JUST_INSTALLED), Integer.valueOf(this.mResources.getInteger(R.integer.PREVIEW_LEVEL)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_SPECIAL_ENGLISH_SUBTYPE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.IS_CHINESE_LANGUAGE_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_SET_COMMA_MODE_MANUALLY)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_INSTALL_INCOMPATIBLE_LANGUAGE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_VERSION_UPDATE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_LANG_FIRST_SETUP_DLG)), Integer.valueOf(this.mResources.getInteger(R.integer.LAST_ACTIVATION_SUCCESS_TIME)), C1974m.m9063a(this.mContext, (int) R.string.ACTIVATE_IDENTIFIER), Boolean.valueOf(this.mResources.getBoolean(R.bool.SYMBOL_DISPLAY_EMOTICON)), C1974m.m9063a(this.mContext, (int) R.string.QUICK_SETTINGS_NEW_SETTINGS), Boolean.valueOf(this.mResources.getBoolean(R.bool.DICTIONARY_COMPLETE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_DOUBLE_CLICK_SHIFT_TIPS)), Integer.valueOf(this.mResources.getInteger(R.integer.NEXT_LOCALIZE_WEB_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.WUBI_AUTO_ADJUST_TIP_OCCURED)), 0L, 0L, 0L, 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.ONE_HANDED_LAYOUT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.IS_KEYBOARD_ZOOMING_AT_LEFT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.TOUCH_TO_SAVE_TIP_OCCURED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_WAVE_TIP_SLIDE_DOWN)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_WAVE_TIP_CONTINUE_SLIDE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_WAVE_TIP_CONTINUE_SLIDE_DIALOG)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_WAVE_ENABLE_DIALOG)), Integer.valueOf(this.mResources.getInteger(R.integer.TEACHING_MISSION_STATE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_AUTO_SPACE_TIP)), 3, Integer.valueOf(this.mResources.getInteger(R.integer.USER_INPUT_DATA_UPLOAD_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_SLIDE_WIZARD)), Integer.valueOf(this.mResources.getInteger(R.integer.AUTO_BACKUP_DICTIONARY_TIME)), C1974m.m9063a(this.mContext, (int) R.string.CURRENT_SMILEY_TAB), Boolean.valueOf(this.mResources.getBoolean(R.bool.WAVE_WITHOUT_NEXT_WORD_ON_CANDIDATE)), Integer.valueOf(this.mResources.getInteger(R.integer.CURRENT_EMOJI_INPUT_TYPE)), Integer.valueOf(this.mResources.getInteger(R.integer.GUIDE_PLAY_STATE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.ADVANCED_VIBRATION)), Integer.valueOf(this.mResources.getInteger(R.integer.SLIDE_INPUT_TIP_STATE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_SKIN_UPDATE_DIALOG)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_DOWNLOAD_LIMITATION)), Integer.valueOf(this.mResources.getInteger(R.integer.DOWNLOADED_PKG_COUNT)), C1974m.m9063a(this.mContext, (int) R.string.ALREADY_OWN_PKGS), Boolean.valueOf(this.mResources.getBoolean(R.bool.OPEN_PAOPAO_PANEL_FIRST)), C1974m.m9063a(this.mContext, (int) R.string.CURVE_DOWNLOAD_LANGUAGE), Integer.valueOf(this.mResources.getInteger(R.integer.SPACE_LONG_PRESS_TIP_STATE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.NEED_REFRESH_MORE_TAB_NEW_TAG)), Integer.valueOf(this.mResources.getInteger(R.integer.NEW_LOG_NEXT_CHECK_TIME)), 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_CONTINUE_TO_ACTIVE_NOTIFICATION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_WAVE_TUTORIAL_DIALOG)), Boolean.valueOf(this.mResources.getBoolean(R.bool.USE_SYSTEM_DEFAULT_FONT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.COMMIT_ANIMATION_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_EMOJI_IN_APP_TIP)), C1974m.m9063a(this.mContext, (int) R.string.CURRENT_HOTWORD_DICTIONARY_ID), Boolean.valueOf(this.mResources.getBoolean(R.bool.UPDATE_LIVE_WORDS)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FORBID_SIMPLE_CANDIDATE_STYLE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_FORBID_SIMPLE_CANDIDATE_STYLE_DIALOG)), Integer.valueOf(this.mResources.getInteger(R.integer.VIBRATE_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.ACCESSIBILITY_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_PINYINCURVE_TUTORIAL_DIALOG)), C1974m.m9063a(this.mContext, (int) R.string.VOICE_CHINESE_INPUT_LANGUAGE), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_HEIGHT_NORMAL)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_HEIGHT_HW)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_BOTTOM_MARGIN)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_LEFT_MARGIN_RATIO)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_RIGHT_MARGIN_RATIO)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_POSITION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.CLOUD_BACKUP_SYNC)), 0L, 0L, 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.CLOUD_SERVICE_WIFI_ONLY)), 0L, 0, 0, Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_ACCEPTED_POLICY)), Boolean.valueOf(this.mResources.getBoolean(R.bool.INITIALIZED_TOUCHPAL_CLOUD_IN_GUIDE)), C1974m.m9063a(this.mContext, (int) R.string.ACCOUNT_INFO), 0, Boolean.valueOf(this.mResources.getBoolean(R.bool.ARCTIC_CLOUD_INPUT_ENABLE)), 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.USE_LITE_EMOJI)), C1974m.m9063a(this.mContext, (int) R.string.CURRENT_SMILEY_CATEGORY), C1974m.m9063a(this.mContext, (int) R.string.RECENTLY_USED_EMOJI), "", Boolean.valueOf(this.mResources.getBoolean(R.bool.BIND_GOOGLE_SERVICE_FAILED)), C1974m.m9063a(this.mContext, (int) R.string.STATISTIC_USAGE_CONFIG), Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_CLICKED_DOWNLOAD_EMOJI_BUTTON)), 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_SLOGAN_ANIMATION_PLAYED)), 0, 0, Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_ARCTIC_PREDICT_ALERT_DIALOG)), 0, true, -1, 0L, Integer.valueOf(this.mResources.getInteger(R.integer.LONG_PRESS_DELAY)), C1974m.m9063a(this.mContext, (int) R.string.RECENTLY_USED_SYMBOLS), 0L, C1974m.m9063a(this.mContext, (int) R.string.VOICE_INPUT_LANGUAGE), Integer.valueOf(this.mResources.getInteger(R.integer.LANDSCAPE_SCREEN_MODE)), 0, 0, 0L, Integer.valueOf(this.mResources.getInteger(R.integer.VOICE_INPUT_ENGINE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SUPER_DICT_ENABLED_UI)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SUPER_DICT_DOWNLOADED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_SUPER_DICT_DOWNLOAD_REMINDER)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_SUPER_DICT_EXPIRED_REMINDER)), Boolean.valueOf(this.mResources.getBoolean(R.bool.TOTALLY_NEW_PACK)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_SHOWN_GUIDE_INTRO_VIEW)), Integer.valueOf(this.mResources.getInteger(R.integer.PRODUCT_TYPE)), true, 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.RATE_US_BUTTON_CLICKED)), 0, Boolean.valueOf(this.mResources.getBoolean(R.bool.DISPLAY_EMOJI_BY_SYSTEM)), 0L, C1974m.m9063a(this.mContext, (int) R.string.CURRENT_CHANNEL_CODE), C1974m.m9063a(this.mContext, (int) R.string.RECOMMEND_CHANNEL_CODE), Integer.valueOf(this.mResources.getInteger(R.integer.VIP_RENEW_REMINDER)), 0, Boolean.valueOf(this.mResources.getBoolean(R.bool.USER_DICT_CHECK_STRICT_MODE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.USER_DICT_REPORT_ENABLE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_EMOJI_WORKING_TIPS)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_START_CLIPBOARD)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_SHOWN_CLIPBOARD_NOTIFICATION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_SHOWN_CLIPBOARD_LOCK_NOTIFICATION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_SHOWN_CLIPBOARD_SLOT_EXPANDED_TOAST)), Boolean.valueOf(this.mResources.getBoolean(R.bool.NEED_CHECK_IMPORTED_DATA)), Boolean.valueOf(this.mResources.getBoolean(R.bool.VOICE_VERSION_DIALOG_SHOWED)), Integer.valueOf(this.mResources.getInteger(R.integer.RATE_US_NOTICATION_SHOW_TIMES)), C1974m.m9063a(this.mContext, (int) R.string.IFLY_VOICE_CHOSEN_LANGUAGE), 0, Boolean.valueOf(this.mResources.getBoolean(R.bool.DICT_ERROR_ON_DAILY_BACKUP_OCCURRED)), C1974m.m9063a(this.mContext, (int) R.string.ONE_HAND_PARAM), Integer.valueOf(this.mResources.getInteger(R.integer.CUSTOM_SKIN_ALPHA)), Integer.valueOf(this.mResources.getInteger(R.integer.CUSTOM_SKIN_BACKGROUND_COLOR)), C1974m.m9063a(this.mContext, (int) R.string.CUSTOM_SKIN_COLOR_SET), Integer.valueOf(this.mResources.getInteger(R.integer.NETWORK_DATA_NEXT_CHECK_TIME)), 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.LANG_KEY_ENABLED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PLUGIN_PINNED)), Integer.valueOf(this.mResources.getInteger(R.integer.PAOPAO_DRAWER_SHOW_TIMES)), Integer.valueOf(this.mResources.getInteger(R.integer.LANGUAGE_SWITCHING_MODE)), this.mResources.getString(R.string.PREUSED_CHS_LANGUAGE), Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_SWITCH_LANGUAGE_TIP)), Boolean.valueOf(this.mResources.getBoolean(R.bool.GUIDE_FINISH_PAGE_SHOWED)), Integer.valueOf(this.mResources.getInteger(R.integer.DOMAIN_LOOKUP_NEXT_CHECK_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.LAST_CHECK_IMAGE_RESULT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTO_REBUILD_ENABLED)), Integer.valueOf(this.mResources.getInteger(R.integer.AUTO_REBUILD_NEXT_CHECK_TIME)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_EMOJI_FONT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.IS_FIRST_KEYBOARD_SHOW)), Boolean.valueOf(this.mResources.getBoolean(R.bool.EMOJI_SHAKE_SHOWN)), this.mResources.getString(R.string.RECENT_LOACALE), Boolean.valueOf(this.mResources.getBoolean(R.bool.DRAWER_GUIDE_POINT_SHOWED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.UPDATE_OEM)), Integer.valueOf(this.mResources.getInteger(R.integer.RECOMMEND_VERSION_CODE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.DEFUALT_SKIN_UPDATED)), "", Boolean.valueOf(this.mResources.getBoolean(R.bool.COLORFUL_EMOJI_BUTTON_CLICKED)), Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_KEYBOARD_SHOWN_OPEN_DRAWER)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_SHOW_TIMES)), 0L, Integer.valueOf(this.mResources.getInteger(R.integer.CURRENT_DYNAMIC_BG_INDEX)), Integer.valueOf(this.mResources.getInteger(R.integer.ACTIVATE_SERVER_REGION)), Boolean.valueOf(this.mResources.getBoolean(R.bool.NEED_CHANGE_KEYBOARD_BG)), Integer.valueOf(this.mResources.getInteger(R.integer.CUSTOM_SKIN_SET_NUMBER)), 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_SHOW_CANDIDATE_ON_STARTINPUT)), Boolean.valueOf(this.mResources.getBoolean(R.bool.DRAWER_PIN_GUIDE_SHOWED)), 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.IS_SMARTINPUT_ACTIVATED)), Integer.valueOf(this.mResources.getInteger(R.integer.UPLOAD_USER_INPUT_CHECKER_FAILED_TIMES)), this.mResources.getString(R.string.REFERRER), Boolean.valueOf(this.mResources.getBoolean(R.bool.BUILDIN_SKIN_UPDATE_CHECKED)), 0L, Integer.valueOf(this.mResources.getInteger(R.integer.IME_LAST_VERSION)), 0L, 0L, 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.FIRST_SWITCH_LANGUAGE)), this.mResources.getString(R.string.CURRENT_LANG_BEFORE_UPDATE), this.mResources.getString(R.string.PREUSED_LANG_BEFORE_UPDATE), Boolean.valueOf(this.mResources.getBoolean(R.bool.SCREENSHOT_TAKEN)), Boolean.valueOf(this.mResources.getBoolean(R.bool.APPLY_SYSTEM_VIBRATE)), this.mResources.getString(R.string.MOBIL_IDENTIFY_INFORMATION), Integer.valueOf(this.mResources.getInteger(R.integer.OPTION_PAGE_OPEN_TIMES)), Integer.valueOf(this.mResources.getInteger(R.integer.LAST_ACTIVE_STAT_TIME)), this.mResources.getString(R.string.ADVERTISE_STRATEGY), 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.SUPPORT_AUTO_CHANGE_TITLE_CASE)), Integer.valueOf(this.mResources.getInteger(R.integer.CURRENT_PERFORMANCE_MODE)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTO_ADJUST_SPECIAL_KEYBOARD_SIZE)), Integer.valueOf(this.mResources.getInteger(R.integer.KEYBOARD_MARGIN)), Boolean.valueOf(this.mResources.getBoolean(R.bool.PIN_MODE_ENTERED)), 0L, Boolean.valueOf(this.mResources.getBoolean(R.bool.LONG_PRESS_COMMA_TIP_SHOWN)), Boolean.valueOf(this.mResources.getBoolean(R.bool.KEYBOARD_NUMBER_ROW_STYLE)), "", Boolean.valueOf(this.mResources.getBoolean(R.bool.COLORFUL_EMOJI_BUTTON_SHOW)), Boolean.valueOf(this.mResources.getBoolean(R.bool.HAS_ACTIVATE_EFFECTIVELY)), "", Boolean.valueOf(this.mResources.getBoolean(R.bool.SHOW_YAHOO_SEARCH)), Boolean.valueOf(this.mResources.getBoolean(R.bool.AUTO_ADJUST_SPECIAL_KEYBOARD_SIZE_TOAST))};
        }
    }

    public static String getKeyById(int i) {
        return sKeyStrings[i];
    }

    public String getKeyByCategory(int i, int i2, String str) {
        return getKeyById(i) + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + sCategoryTypes[i2] + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + str;
    }

    public long getLongSetting(int i) {
        return getLongSetting(i, -1, (String) null, (Config) null);
    }

    public long getLongSetting(int i, int i2, String str, Config config) {
        Object value = getValue(i, i2, str, config);
        try {
            return ((Long) value).longValue();
        } catch (ClassCastException e) {
            try {
                return Long.parseLong(String.valueOf(value));
            } catch (NumberFormatException e2) {
                return 0;
            }
        }
    }

    public boolean getBoolSetting(int i) {
        return getBoolSetting(i, -1, (String) null, (Config) null);
    }

    public boolean getBoolSetting(int i, int i2, String str, Config config) {
        boolean z = false;
        if (i == 1 && Engine.isInitialized()) {
            int triStatus = Engine.getInstance().getTriStatus(0);
            String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
            if (!TextUtils.isEmpty(currentLanguageId) && currentLanguageId.equals(C1549b.f4831b)) {
                if (triStatus != 3) {
                    return true;
                }
                return false;
            }
        }
        if (i == 335 && getIntSetting(LANGUAGE_SWITCHING_MODE) == 0) {
            return C1368X.m6320c().mo5842o().mo5957m();
        }
        Object value = getValue(i, i2, str, config);
        if (value != null) {
            z = ((Boolean) value).booleanValue();
        }
        return z;
    }

    public int getIntSetting(int i) {
        return getIntSetting(i, -1, (String) null, (Config) null);
    }

    public int getIntSetting(int i, int i2, String str, Config config) {
        int inputType;
        if (i == 4 && getIntSetting(3) == 1) {
            return 7;
        }
        if (i == 3 && C1593bR.m7162a().f5076b && Engine.isInitialized() && ((inputType = Engine.getInstance().getEditor().getInputType()) == 8 || inputType == 32 || inputType == 4)) {
            String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
            if (!TextUtils.isEmpty(currentLanguageId) && currentLanguageId.equals(C1549b.f4791a)) {
                return getIntSetting(KEYBOARD_SPECIAL_ENGLISH_SUBTYPE);
            }
        }
        Object value = getValue(i, i2, str, config);
        if (value == null) {
            return 0;
        }
        return ((Integer) value).intValue();
    }

    public String getStringSetting(int i) {
        return getStringSetting(i, -1, (String) null, (Config) null);
    }

    public String getStringSetting(int i, int i2, String str, Config config) {
        String str2 = (String) getValue(i, i2, str, config);
        if (i == 16 && C1593bR.m7162a().f5075a) {
            str2 = C1368X.m6320c().mo5845r().mo7212p(str2);
        }
        if (i == 10 && Engine.isInitialized() && i2 != 27) {
            Editor editor = Engine.getInstance().getEditor();
            if (!editor.isSpecialMode()) {
                str2 = getStringSetting(10, 27, INPUT_TYPE_NORMAL, (Config) null);
            } else if (editor.isPasswordOrUrl()) {
                str2 = getStringSetting(10, 27, INPUT_TYPE_SPECIAL, (Config) null);
            }
        }
        return str2 == null ? "" : str2;
    }

    public void setLongSetting(int i, long j) {
        setLongSetting(i, j, true);
    }

    public void setLongSetting(int i, long j, boolean z) {
        setLongSetting(i, j, -1, (String) null, (Config) null, z);
    }

    public void setLongSetting(int i, long j, int i2, String str, Config config, boolean z) {
        setValue(i, Long.valueOf(j), i2, str, config);
        if (z) {
            fireSettingChange(i);
        }
    }

    public void setBoolSetting(int i, boolean z) {
        setBoolSetting(i, z, true);
    }

    public void setBoolSetting(int i, boolean z, boolean z2) {
        setBoolSetting(i, z, -1, (String) null, (Config) null, z2);
    }

    private boolean constantAutoCorrectionState(String str) {
        C1550c a = C1550c.m6998a(str);
        if (a != null) {
            return a.mo6143k();
        }
        return false;
    }

    public void setBoolSetting(int i, boolean z, int i2, String str, Config config, boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (i != 1 || !Engine.isInitialized()) {
            if (i == 59 && constantAutoCorrectionState(Engine.getInstance().getCurrentLanguageId())) {
                z3 = false;
            }
            z3 = true;
        } else {
            if (constantPredictionState(Engine.getInstance().getCurrentLanguageId())) {
                z3 = false;
            }
            z3 = true;
        }
        if (z3) {
            setValue(i, Boolean.valueOf(z), i2, str, config);
        }
        if (i == 144) {
            if (!z) {
                z4 = true;
            }
            C1252b.f4005j = z4;
            setBoolSetting(31, z, -1, (String) null, (Config) null, true);
        }
        if (z2) {
            fireSettingChange(i);
        }
    }

    public void setIntSetting(int i, int i2) {
        setIntSetting(i, i2, true);
    }

    public void setIntSetting(int i, int i2, boolean z) {
        setIntSetting(i, i2, -1, (String) null, (Config) null, z);
    }

    public void setIntSetting(int i, int i2, int i3, String str, Config config, boolean z) {
        int inputType;
        if (i == 3) {
            if (i2 < 4) {
                if (C1593bR.m7162a().f5076b && Engine.isInitialized() && ((inputType = Engine.getInstance().getEditor().getInputType()) == 8 || inputType == 32 || inputType == 4)) {
                    String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
                    if (!TextUtils.isEmpty(currentLanguageId) && currentLanguageId.equals(C1549b.f4791a)) {
                        setIntSetting(KEYBOARD_SPECIAL_ENGLISH_SUBTYPE, i2);
                    }
                }
            } else {
                return;
            }
        }
        if (i == 338) {
            if (i2 == 1) {
                setBoolSetting(LANG_KEY_ENABLED, true);
            } else if (i2 == 2) {
                setBoolSetting(LANG_KEY_ENABLED, false);
            }
        }
        setValue(i, Integer.valueOf(i2), i3, str, config);
        if (z) {
            fireSettingChange(i);
        }
    }

    public void setStringSetting(int i, String str) {
        setStringSetting(i, str, true);
    }

    public void setStringSetting(int i, String str, boolean z) {
        setStringSetting(i, str, -1, (String) null, (Config) null, z);
    }

    private boolean constantPredictionState(String str) {
        C1550c a = C1550c.m6998a(str);
        if (a != null) {
            return a.mo6173j();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStringSetting(int r10, java.lang.String r11, int r12, java.lang.String r13, com.cootek.smartinput5.engine.Config r14, boolean r15) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 10
            if (r10 != r2) goto L_0x0088
            boolean r2 = com.cootek.smartinput5.engine.Engine.isInitialized()
            if (r2 == 0) goto L_0x0085
            com.cootek.smartinput5.engine.Engine r2 = com.cootek.smartinput5.engine.Engine.getInstance()
            java.lang.String r2 = r2.getCurrentLanguageId()
            boolean r3 = r9.constantPredictionState(r2)
            if (r3 == 0) goto L_0x0021
            boolean r3 = r9.constantPredictionState(r11)
            if (r3 != 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            boolean r2 = r9.constantAutoCorrectionState(r2)
            if (r2 == 0) goto L_0x0085
            boolean r2 = r9.constantAutoCorrectionState(r11)
            if (r2 != 0) goto L_0x0085
            r1 = 1
            r7 = r1
            r8 = r0
        L_0x0030:
            boolean r0 = com.cootek.smartinput5.engine.Engine.isInitialized()
            if (r0 == 0) goto L_0x0058
            r0 = 27
            if (r12 == r0) goto L_0x0058
            com.cootek.smartinput5.engine.Engine r0 = com.cootek.smartinput5.engine.Engine.getInstance()
            com.cootek.smartinput5.engine.Editor r0 = r0.getEditor()
            boolean r1 = r0.isSpecialMode()
            if (r1 != 0) goto L_0x006e
            com.cootek.smartinput5.engine.Settings r0 = getInstance()
            r1 = 10
            r3 = 27
            java.lang.String r4 = "normal"
            r5 = 0
            r6 = 0
            r2 = r11
            r0.setStringSetting(r1, r2, r3, r4, r5, r6)
        L_0x0058:
            r9.setValue(r10, r11, r12, r13, r14)
            if (r15 == 0) goto L_0x0060
            r9.fireSettingChange(r10)
        L_0x0060:
            if (r8 == 0) goto L_0x0066
            r0 = 1
            r9.fireSettingChange(r0)
        L_0x0066:
            if (r7 == 0) goto L_0x006d
            r0 = 59
            r9.fireSettingChange(r0)
        L_0x006d:
            return
        L_0x006e:
            boolean r0 = r0.isPasswordOrUrl()
            if (r0 == 0) goto L_0x0058
            com.cootek.smartinput5.engine.Settings r0 = getInstance()
            r1 = 10
            r3 = 27
            java.lang.String r4 = "special"
            r5 = 0
            r6 = 0
            r2 = r11
            r0.setStringSetting(r1, r2, r3, r4, r5, r6)
            goto L_0x0058
        L_0x0085:
            r7 = r1
            r8 = r0
            goto L_0x0030
        L_0x0088:
            r7 = r1
            r8 = r0
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.engine.Settings.setStringSetting(int, java.lang.String, int, java.lang.String, com.cootek.smartinput5.engine.Config, boolean):void");
    }

    public boolean isLanguageEnabled(String str) {
        Object valueByKey = getValueByKey(str);
        if (valueByKey != null && (valueByKey instanceof Boolean)) {
            return ((Boolean) valueByKey).booleanValue();
        }
        setLanguageEnabled(str, true);
        return true;
    }

    public boolean isLanguageAvailable(String str) {
        if (!C1389aD.m6426G(str)) {
            return false;
        }
        return getBoolSetting(DICTIONARY_COMPLETE, 18, str, (Config) null);
    }

    public void setLanguageEnabled(String str, boolean z) {
        if (C1389aD.m6470y(str) && z && getIntSetting(LANGUAGE_SWITCHING_MODE) == 0) {
            setBoolSetting(LANG_KEY_ENABLED, true);
        }
        commitEditor(str, Boolean.valueOf(z));
        fireSettingChange(14);
    }

    public Object getValueByKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getValue(str, getIdByKey(str));
    }

    public int getIdByKey(String str) {
        Integer num = sKeyIdMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private Object getValue(int i, int i2, String str, Config config) {
        Object obj = null;
        if (0 == 0 && categoryValid(i, i2, str) && mConfigValid(i, config)) {
            obj = getValue(getKeyByConfigAndCategory(i, i2, str, config), -1);
        }
        if (obj == null && mConfigValid(i, config)) {
            obj = getValue(getKeyByConfig(i, config), -1);
        }
        if (obj == null && categoryValid(i, i2, str)) {
            obj = getValue(getKeyByCategory(i, i2, str), -1);
        }
        if (obj == null) {
            return getValue(getKeyById(i), i);
        }
        return obj;
    }

    private Object getValue(String str, int i) {
        if (!persistAfterSpecialMode(str) && !this.mDisabledSpecial && Engine.isInitialized() && Engine.getInstance().getEditor().isSpecialMode() && this.mSpecialPreferencesMap.containsKey(str)) {
            return this.mSpecialPreferencesMap.get(str);
        }
        if (isTemporarySettingMode() && !isSettingInPermanentList(str) && this.mTemporaryPreferencesMap.containsKey(str)) {
            return this.mTemporaryPreferencesMap.get(str);
        }
        if (Engine.isPreciseMode() && !persistAfterPreciseMode(str) && this.mSpecialPreferencesMap.containsKey(str)) {
            return this.mSpecialPreferencesMap.get(str);
        }
        if (isSettingTempExcluded(str) && this.mTempExcludePreferenceMap.containsKey(str)) {
            return this.mTempExcludePreferenceMap.get(str);
        }
        if (this.mPreferencesMap.containsKey(str)) {
            return this.mPreferencesMap.get(str);
        }
        Object obj = null;
        if (C1132b.m5654a(this.mContext).mo4408b()) {
            obj = C1132b.m5654a(this.mContext).mo4400a(str);
        }
        if (obj == null) {
            if (i >= 1 && i < sKeyStrings.length && i < this.defaults.length) {
                initSetting();
                obj = this.defaults[i];
            } else if (!this.mNullDefaultKeySet.contains(str) && (obj = getDefaultValue(str)) == null) {
                this.mNullDefaultKeySet.add(str);
            }
        }
        if (obj == null) {
            return obj;
        }
        this.mPreferencesMap.put(str, obj);
        return obj;
    }

    private Object getDefaultValue(String str) {
        return C1974m.m9061a(this.mContext, str);
    }

    private void setValue(int i, Object obj, int i2, String str, Config config) {
        String keyById;
        if (categoryValid(i, i2, str) && mConfigValid(i, config)) {
            keyById = getKeyByConfigAndCategory(i, i2, str, config);
        } else if (mConfigValid(i, config)) {
            keyById = getKeyByConfig(i, config);
        } else if (categoryValid(i, i2, str)) {
            keyById = getKeyByCategory(i, i2, str);
        } else {
            keyById = getKeyById(i);
        }
        commitEditor(keyById, obj);
    }

    private boolean persistAfterSpecialMode(String str) {
        for (int i : sNonPersistIdsAfterSpecialMode) {
            if (str.startsWith(sKeyStrings[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean persistAfterPreciseMode(String str) {
        for (int i : sNoPersistIdsAfterPreciseMode) {
            if (str.startsWith(sKeyStrings[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean isSettingInPermanentList(String str) {
        if (this.mPermanentSettingList == null) {
            return false;
        }
        for (int i = 0; i < this.mPermanentSettingList.size(); i++) {
            if (str.startsWith(sKeyStrings[this.mPermanentSettingList.get(i).intValue()])) {
                return true;
            }
        }
        return false;
    }

    public void putKeyValue(String str, Object obj) {
        commitEditor(str, obj);
    }

    private synchronized void commitEditor(String str, Object obj) {
        if (!(str == null || obj == null)) {
            if (!persistAfterSpecialMode(str) && !this.mDisabledSpecial && Engine.isInitialized() && Engine.getInstance().getEditor().isSpecialMode()) {
                this.mSpecialPreferencesMap.put(str, obj);
            } else if (isTemporarySettingMode() && !isSettingInPermanentList(str)) {
                this.mTemporaryPreferencesMap.put(str, obj);
            } else if (isSettingTempExcluded(str)) {
                this.mTempExcludePreferenceMap.put(str, obj);
            } else if (!Engine.isPreciseMode() || persistAfterPreciseMode(str)) {
                this.mPreferencesMap.put(str, obj);
                this.mModifiedPreferences.add(str);
            } else {
                this.mSpecialPreferencesMap.put(str, obj);
            }
        }
    }

    private boolean mConfigValid(int i, Config config) {
        return i == 3 || i == 126 || i == 255 || i == 254 || i == 296 || i == 339;
    }

    private boolean categoryValid(int i, int i2, String str) {
        return i2 >= 0 && i2 < sCategoryTypes.length;
    }

    private String getKeyByConfig(int i, Config config) {
        if (config == null) {
            config = this.mConfig;
        }
        return getKeyById(i) + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + sOrientationTypes[config.getOrientation() - 1];
    }

    private String getKeyByConfigAndCategory(int i, int i2, String str, Config config) {
        return getKeyByConfig(i, config) + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + sCategoryTypes[i2] + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + str;
    }

    public void fireSettingChange(int i) {
        Okinawa i2;
        if (C1368X.m6324d() && (i2 = C1368X.m6320c().mo5836i()) != null) {
            i2.fireSettingsChangedOperation(i);
            i2.processEvent();
        }
        if (Engine.isInitialized()) {
            Engine.getInstance().settingChanged(i);
        }
    }

    public synchronized void writeBack() {
        this.mSpecialPreferencesMap.clear();
        if (this.mModifiedPreferences.size() != 0) {
            SharedPreferences.Editor edit = this.mPreferences.edit();
            Iterator<String> it = this.mModifiedPreferences.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Object obj = this.mPreferencesMap.get(next);
                if (obj != null) {
                    if (obj instanceof String) {
                        edit.putString(next, (String) obj);
                    } else if (obj instanceof Boolean) {
                        edit.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        edit.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        edit.putLong(next, ((Long) obj).longValue());
                    }
                }
            }
            this.mModifiedPreferences.clear();
            edit.commit();
        }
    }

    public void setDisableSpecial(boolean z) {
        this.mDisabledSpecial = z;
    }

    public boolean getAdvancedPredictionSetting() {
        if (getBoolSetting(53)) {
            if (!getBoolSetting(32, 12, "western", (Config) null) || !getBoolSetting(40)) {
                return false;
            }
            return true;
        } else if (!getBoolSetting(2, 4, "western", (Config) null) || !getBoolSetting(32, 12, "western", (Config) null) || !getBoolSetting(40)) {
            return false;
        } else {
            return true;
        }
    }

    public void setAdvancedPredictionSetting(boolean z) {
        if (!getBoolSetting(53)) {
            setBoolSetting(2, z, 4, "western", (Config) null, true);
        }
        setBoolSetting(32, z, 12, "western", (Config) null, true);
        setBoolSetting(40, z);
    }

    public void setWaveEnableSetting(boolean z) {
        if (!z || !getBoolSetting(WAVE_WITHOUT_NEXT_WORD_ON_CANDIDATE)) {
            setBoolSetting(2, getAdvancedPredictionSetting(), 4, "western", (Config) null, true);
        } else {
            setBoolSetting(2, false, 4, "western", (Config) null, true);
        }
        setBoolSetting(53, z);
    }

    public void enableTemporarySettingMode(ArrayList<Integer> arrayList) {
        this.isTemporarySettingMode = true;
        if (arrayList != null) {
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                this.mPermanentSettingList.add(it.next());
            }
            return;
        }
        this.mPermanentSettingList.clear();
    }

    public void disableTemporarySettingMode() {
        this.isTemporarySettingMode = false;
        this.mPermanentSettingList.clear();
        this.mTemporaryPreferencesMap.clear();
    }

    public boolean isTemporarySettingMode() {
        return this.isTemporarySettingMode;
    }

    public synchronized boolean changeSetting(String str, Object obj, boolean z) {
        boolean z2;
        z2 = true;
        if (z) {
            if (this.mPreferencesMap.containsKey(str)) {
                z2 = false;
            }
        }
        if (z2) {
            this.mPreferencesMap.put(str, obj);
            if (!this.mModifiedPreferences.contains(str)) {
                this.mModifiedPreferences.add(str);
            }
        }
        return z2;
    }

    public void addTempExcludeSetting(int i) {
        if (!this.mTempExcludeSettingIdList.contains(Integer.valueOf(i)) && i <= 399) {
            this.mTempExcludeSettingIdList.add(Integer.valueOf(i));
        }
    }

    public void removeTempExcludeSetting(int i) {
        this.mTempExcludeSettingIdList.remove(Integer.valueOf(i));
    }

    public void clearTempExcludeSettings() {
        this.mTempExcludePreferenceMap.clear();
        this.mTempExcludeSettingIdList.clear();
    }

    private boolean isSettingTempExcluded(String str) {
        for (Integer intValue : this.mTempExcludeSettingIdList) {
            if (str.startsWith(sKeyStrings[intValue.intValue()])) {
                return true;
            }
        }
        return false;
    }

    public Object getWrittenMapValue(String str) {
        if (str == null || this.mPreferencesMap == null) {
            return null;
        }
        return this.mPreferencesMap.get(str);
    }

    public Map<String, Object> getPreferenceMap() {
        return this.mPreferencesMap;
    }

    public void onConfigurationChanged() {
        this.mNullDefaultKeySet.clear();
    }
}
