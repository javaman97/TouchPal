package com.google.protobuf;

import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.UnsupportedEncodingException;

public class Internal {

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    public static String stringDefaultValue(String str) {
        try {
            return new String(str.getBytes("ISO-8859-1"), Utils.UTF8);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e);
        }
    }

    public static ByteString bytesDefaultValue(String str) {
        try {
            return ByteString.copyFrom(str.getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e);
        }
    }

    public static boolean isValidUtf8(ByteString byteString) {
        int size = byteString.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            byte byteAt = byteString.byteAt(i) & 255;
            if (byteAt < 128) {
                i = i2;
            } else if (byteAt < 194 || byteAt > 244) {
                return false;
            } else {
                if (i2 >= size) {
                    return false;
                }
                int i3 = i2 + 1;
                byte byteAt2 = byteString.byteAt(i2) & 255;
                if (byteAt2 < 128 || byteAt2 > 191) {
                    return false;
                }
                if (byteAt <= 223) {
                    i = i3;
                } else if (i3 >= size) {
                    return false;
                } else {
                    i = i3 + 1;
                    byte byteAt3 = byteString.byteAt(i3) & 255;
                    if (byteAt3 < 128 || byteAt3 > 191) {
                        return false;
                    }
                    if (byteAt <= 239) {
                        if ((byteAt == 224 && byteAt2 < 160) || (byteAt == 237 && byteAt2 > 159)) {
                            return false;
                        }
                    } else if (i >= size) {
                        return false;
                    } else {
                        int i4 = i + 1;
                        byte byteAt4 = byteString.byteAt(i) & 255;
                        if (byteAt4 < 128 || byteAt4 > 191) {
                            return false;
                        }
                        if ((byteAt == 240 && byteAt2 < 144) || (byteAt == 244 && byteAt2 > 143)) {
                            return false;
                        }
                        i = i4;
                    }
                }
            }
        }
        return true;
    }
}
