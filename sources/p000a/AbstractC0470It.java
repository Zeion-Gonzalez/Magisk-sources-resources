package p000a;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: a.It */
/* loaded from: classes.dex */
public abstract class AbstractC0470It {

    /* renamed from: z */
    public static final HashMap f1564z = new HashMap();

    /* renamed from: h */
    public static final HashMap f1563h = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static int m1135h(Class cls) {
        Constructor constructor;
        boolean z;
        boolean z2;
        List list;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        HashMap hashMap = f1564z;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r4 != null) {
                    str = r4.getName();
                } else {
                    str = "";
                }
                if (str.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                String concat = AbstractC1269Xn.m2588hs(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = f1563h;
            if (constructor != null) {
                list = Collections.singletonList(constructor);
            } else {
                C2555w7 c2555w7 = C2555w7.f7802v;
                HashMap hashMap3 = c2555w7.f7803h;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (((InterfaceC0492JH) declaredMethods[i2].getAnnotation(InterfaceC0492JH.class)) != null) {
                                    c2555w7.m4377z(cls, declaredMethods);
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC2630xV.class.isAssignableFrom(superclass)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (m1135h(superclass) != 1) {
                            arrayList = new ArrayList((Collection) hashMap2.get(superclass));
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && InterfaceC2630xV.class.isAssignableFrom(cls2)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                if (m1135h(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) hashMap2.get(cls2));
                            }
                            i3++;
                        } else if (arrayList != null) {
                            list = arrayList;
                        }
                    }
                }
            }
            hashMap2.put(cls, list);
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }

    /* renamed from: z */
    public static void m1136z(Constructor constructor, Object obj) {
        try {
            AbstractC2441tz.m4208y(constructor.newInstance(obj));
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
