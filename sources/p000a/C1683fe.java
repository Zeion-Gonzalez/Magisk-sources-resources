package p000a;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.fe */
/* loaded from: classes.dex */
public final class C1683fe extends C0391HQ {
    @Override // p000a.C0391HQ
    /* renamed from: F */
    public final Method mo880F(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p000a.C0391HQ
    /* renamed from: J */
    public final Typeface mo882J(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1318y, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1314Y.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
