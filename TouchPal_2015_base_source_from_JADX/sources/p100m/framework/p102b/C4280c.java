package p100m.framework.p102b;

/* renamed from: m.framework.b.c */
/* compiled from: HEX */
public class C4280c {

    /* renamed from: a */
    private static final char[] f17442a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m17904a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static byte[] m17905a(String str) {
        byte[] bArr = null;
        if (str != null) {
            int length = str.length();
            if (length % 2 != 1) {
                int i = length / 2;
                bArr = new byte[i];
                for (int i2 = 0; i2 < i; i2++) {
                    bArr[i2] = (byte) Integer.parseInt(str.substring(i2 * 2, (i2 * 2) + 2), 16);
                }
            }
        }
        return bArr;
    }

    /* renamed from: b */
    public static String m17907b(byte[] bArr) {
        return new String(m17909c(bArr));
    }

    /* renamed from: b */
    public static byte[] m17908b(String str) {
        return m17906a(str.toCharArray());
    }

    /* renamed from: a */
    public static byte[] m17906a(char[] cArr) {
        int i = 0;
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new RuntimeException("Odd number of characters.");
        }
        byte[] bArr = new byte[(length >> 1)];
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            i = i3 + 1;
            bArr[i2] = (byte) (((m17903a(cArr[i], i) << 4) | m17903a(cArr[i3], i3)) & 255);
            i2++;
        }
        return bArr;
    }

    /* renamed from: a */
    protected static int m17903a(char c, int i) {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        throw new RuntimeException("Illegal hexadecimal charcter " + c + " at index " + i);
    }

    /* renamed from: c */
    public static char[] m17909c(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        char[] cArr = new char[(length << 1)];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr[i] = f17442a[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = f17442a[bArr[i2] & 15];
        }
        return cArr;
    }

    /* renamed from: d */
    public byte[] mo15970d(byte[] bArr) {
        return m17906a(new String(bArr).toCharArray());
    }

    /* renamed from: a */
    public byte[] mo15968a(Object obj) {
        try {
            return m17906a(obj instanceof String ? ((String) obj).toCharArray() : (char[]) obj);
        } catch (ClassCastException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: e */
    public byte[] mo15971e(byte[] bArr) {
        return new String(m17909c(bArr)).getBytes();
    }

    /* renamed from: b */
    public char[] mo15969b(Object obj) {
        try {
            return m17909c(obj instanceof String ? ((String) obj).getBytes() : (byte[]) obj);
        } catch (ClassCastException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
