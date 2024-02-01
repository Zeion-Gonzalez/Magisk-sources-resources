package p000a;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: a.DT */
/* loaded from: classes.dex */
public abstract class AbstractC0179DT {

    /* renamed from: z */
    public static final List f550z = AbstractC1292YB.m2661T(Application.class, C0827PQ.class);

    /* renamed from: h */
    public static final List f549h = Collections.singletonList(C0827PQ.class);

    /* renamed from: h */
    public static final AbstractC1952kk m349h(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC1952kk) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }

    /* renamed from: z */
    public static final Constructor m350z(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List m3132Pm = AbstractC1658fB.m3132Pm(constructor.getParameterTypes());
            if (AbstractC1292YB.m2695u(list, m3132Pm)) {
                return constructor;
            }
            if (list.size() == m3132Pm.size() && m3132Pm.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
