package p000a;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a.w7 */
/* loaded from: classes.dex */
public final class C2555w7 {

    /* renamed from: v */
    public static final C2555w7 f7802v = new C2555w7();

    /* renamed from: z */
    public final HashMap f7804z = new HashMap();

    /* renamed from: h */
    public final HashMap f7803h = new HashMap();

    /* renamed from: v */
    public static void m4375v(HashMap hashMap, C0780OW c0780ow, EnumC2241qF enumC2241qF, Class cls) {
        EnumC2241qF enumC2241qF2 = (EnumC2241qF) hashMap.get(c0780ow);
        if (enumC2241qF2 == null || enumC2241qF == enumC2241qF2) {
            if (enumC2241qF2 == null) {
                hashMap.put(c0780ow, enumC2241qF);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0780ow.f2639h.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC2241qF2 + ", new value " + enumC2241qF);
    }

    /* renamed from: h */
    public final C0925RP m4376h(Class cls) {
        C0925RP c0925rp = (C0925RP) this.f7804z.get(cls);
        return c0925rp != null ? c0925rp : m4377z(cls, null);
    }

    /* renamed from: z */
    public final C0925RP m4377z(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(m4376h(superclass).f3175h);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m4376h(cls2).f3175h.entrySet()) {
                m4375v(hashMap, (C0780OW) entry.getKey(), (EnumC2241qF) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0492JH interfaceC0492JH = (InterfaceC0492JH) method.getAnnotation(InterfaceC0492JH.class);
            if (interfaceC0492JH != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC1546d7.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                EnumC2241qF value = interfaceC0492JH.value();
                if (parameterTypes.length > 1) {
                    if (EnumC2241qF.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == EnumC2241qF.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m4375v(hashMap, new C0780OW(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0925RP c0925rp = new C0925RP(hashMap);
        this.f7804z.put(cls, c0925rp);
        this.f7803h.put(cls, Boolean.valueOf(z));
        return c0925rp;
    }
}
