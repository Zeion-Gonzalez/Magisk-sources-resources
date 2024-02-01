package p000a;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* renamed from: a.bA */
/* loaded from: classes.dex */
public final class C1448bA {

    /* renamed from: h */
    public static final C2698yx f4530h = new C2698yx();

    /* renamed from: z */
    public final /* synthetic */ C0364Gx f4531z;

    public C1448bA(C0364Gx c0364Gx) {
        this.f4531z = c0364Gx;
    }

    /* renamed from: h */
    public static Class m2866h(ClassLoader classLoader, String str) {
        C2698yx c2698yx = f4530h;
        C2698yx c2698yx2 = (C2698yx) c2698yx.getOrDefault(classLoader, null);
        if (c2698yx2 == null) {
            c2698yx2 = new C2698yx();
            c2698yx.put(classLoader, c2698yx2);
        }
        Class cls = (Class) c2698yx2.getOrDefault(str, null);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c2698yx2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* renamed from: v */
    public static Class m2867v(ClassLoader classLoader, String str) {
        try {
            return m2866h(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0993Sd(AbstractC2441tz.m4184G("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0993Sd(AbstractC2441tz.m4184G("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* renamed from: z */
    public final AbstractComponentCallbacksC2342s3 m2868z(String str) {
        Context context = this.f4531z.f1260s.f2884w;
        Object obj = AbstractComponentCallbacksC2342s3.f7181UZ;
        try {
            return (AbstractComponentCallbacksC2342s3) m2867v(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new C0993Sd(AbstractC2441tz.m4184G("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0993Sd(AbstractC2441tz.m4184G("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0993Sd(AbstractC2441tz.m4184G("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0993Sd(AbstractC2441tz.m4184G("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
