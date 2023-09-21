package com.cootek.smartinput5.func.resource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.cootek.smartinput5.func.resource.h */
/* compiled from: PreferenceUtils */
public class C1969h {
    /* renamed from: a */
    public static Object m9053a(Class<?> cls, Object obj, String str, Object obj2) {
        Object obj3;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            obj3 = declaredMethod.invoke(obj, new Object[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            obj3 = null;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            obj3 = null;
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
            obj3 = null;
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
            obj3 = null;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            obj3 = null;
        }
        if (obj3 == null) {
            return obj2;
        }
        return obj3;
    }
}
