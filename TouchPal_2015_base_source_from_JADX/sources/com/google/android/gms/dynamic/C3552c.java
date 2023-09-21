package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.C3549b;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.dynamic.c */
public final class C3552c<T> extends C3549b.C3550a {

    /* renamed from: dc */
    private final T f15334dc;

    private C3552c(T t) {
        this.f15334dc = t;
    }

    /* renamed from: a */
    public static <T> T m15489a(C3549b bVar) {
        if (bVar instanceof C3552c) {
            return ((C3552c) bVar).f15334dc;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                }
            } else {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }

    /* renamed from: f */
    public static <T> C3549b m15490f(T t) {
        return new C3552c(t);
    }
}
