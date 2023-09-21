package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.p009e.p010a.C0230a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C3538a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    public static class C3539a extends RuntimeException {
        public C3539a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* renamed from: a */
    public static int m15415a(Parcel parcel, int i) {
        return (i & C0230a.f588c) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m15416a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(a + dataPosition);
        return t;
    }

    /* renamed from: a */
    private static void m15417a(Parcel parcel, int i, int i2) {
        int a = m15415a(parcel, i);
        if (a != i2) {
            throw new C3539a("Expected size " + i2 + " got " + a + " (0x" + Integer.toHexString(a) + ")", parcel);
        }
    }

    /* renamed from: a */
    public static void m15418a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(a + dataPosition);
        }
    }

    /* renamed from: b */
    public static int m15419b(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: b */
    public static void m15420b(Parcel parcel, int i) {
        parcel.setDataPosition(m15415a(parcel, i) + parcel.dataPosition());
    }

    /* renamed from: b */
    public static <T> T[] m15421b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArray;
    }

    /* renamed from: c */
    public static int m15422c(Parcel parcel) {
        int b = m15419b(parcel);
        int a = m15415a(parcel, b);
        int dataPosition = parcel.dataPosition();
        if (m15434m(b) != 20293) {
            throw new C3539a("Expected object header. Got 0x" + Integer.toHexString(b), parcel);
        }
        int i = dataPosition + a;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new C3539a("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m15423c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(a + dataPosition);
        return createTypedArrayList;
    }

    /* renamed from: c */
    public static boolean m15424c(Parcel parcel, int i) {
        m15417a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static byte m15425d(Parcel parcel, int i) {
        m15417a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: e */
    public static short m15426e(Parcel parcel, int i) {
        m15417a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: f */
    public static int m15427f(Parcel parcel, int i) {
        m15417a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: g */
    public static long m15428g(Parcel parcel, int i) {
        m15417a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: h */
    public static BigInteger m15429h(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return new BigInteger(createByteArray);
    }

    /* renamed from: i */
    public static float m15430i(Parcel parcel, int i) {
        m15417a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: j */
    public static double m15431j(Parcel parcel, int i) {
        m15417a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: k */
    public static BigDecimal m15432k(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(a + dataPosition);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: l */
    public static String m15433l(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(a + dataPosition);
        return readString;
    }

    /* renamed from: m */
    public static int m15434m(int i) {
        return 65535 & i;
    }

    /* renamed from: m */
    public static IBinder m15435m(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(a + dataPosition);
        return readStrongBinder;
    }

    /* renamed from: n */
    public static Bundle m15436n(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(a + dataPosition);
        return readBundle;
    }

    /* renamed from: o */
    public static byte[] m15437o(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(a + dataPosition);
        return createByteArray;
    }

    /* renamed from: p */
    public static boolean[] m15438p(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(a + dataPosition);
        return createBooleanArray;
    }

    /* renamed from: q */
    public static int[] m15439q(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(a + dataPosition);
        return createIntArray;
    }

    /* renamed from: r */
    public static long[] m15440r(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(a + dataPosition);
        return createLongArray;
    }

    /* renamed from: s */
    public static BigInteger[] m15441s(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigIntegerArr;
    }

    /* renamed from: t */
    public static float[] m15442t(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(a + dataPosition);
        return createFloatArray;
    }

    /* renamed from: u */
    public static double[] m15443u(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(a + dataPosition);
        return createDoubleArray;
    }

    /* renamed from: v */
    public static BigDecimal[] m15444v(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + a);
        return bigDecimalArr;
    }

    /* renamed from: w */
    public static String[] m15445w(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(a + dataPosition);
        return createStringArray;
    }

    /* renamed from: x */
    public static ArrayList<String> m15446x(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(a + dataPosition);
        return createStringArrayList;
    }

    /* renamed from: y */
    public static Parcel m15447y(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, a);
        parcel.setDataPosition(a + dataPosition);
        return obtain;
    }

    /* renamed from: z */
    public static Parcel[] m15448z(Parcel parcel, int i) {
        int a = m15415a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(readInt2 + dataPosition2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + a);
        return parcelArr;
    }
}
