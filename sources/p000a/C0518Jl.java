package p000a;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: a.Jl */
/* loaded from: classes.dex */
public final class C0518Jl implements InterfaceC0635Lx {

    /* renamed from: z */
    public final /* synthetic */ int f1731z;

    public /* synthetic */ C0518Jl(int i) {
        this.f1731z = i;
    }

    /* renamed from: h */
    public static void m1206h(Type type, Class cls) {
        Class<?> m1853j = AbstractC0795Op.m1853j(type);
        if (cls.isAssignableFrom(m1853j)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + m1853j.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    /* renamed from: z */
    public final AbstractC1235X4 m1207z(Type type, Set set, C0657MQ c0657mq) {
        AbstractC1235X4 abstractC1235X4;
        AbstractC1235X4 abstractC1235X42;
        AbstractC1235X4 c0718nw;
        Class<?> cls;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        AbstractC2703z2 c2244qI;
        Class cls2;
        boolean z;
        Field[] fieldArr;
        InterfaceC1777hQ interfaceC1777hQ;
        C2603x0 c2603x0;
        Class m1853j;
        Type[] actualTypeArguments;
        Type type2 = type;
        int i = 0;
        int i2 = 1;
        switch (this.f1731z) {
            case AbstractC0795Op.f2698E /* 0 */:
                Type genericComponentType = type2 instanceof GenericArrayType ? ((GenericArrayType) type2).getGenericComponentType() : type2 instanceof Class ? ((Class) type2).getComponentType() : null;
                if (genericComponentType == null || !set.isEmpty()) {
                    return null;
                }
                Class m1853j2 = AbstractC0795Op.m1853j(genericComponentType);
                c0657mq.getClass();
                return new C0556KT(m1853j2, c0657mq.m1460z(genericComponentType, AbstractC1167Vq.f3801z, null)).m2535h();
            case 1:
                if (!(type2 instanceof Class) && !(type2 instanceof ParameterizedType)) {
                    return null;
                }
                Class m1853j3 = AbstractC0795Op.m1853j(type);
                if (m1853j3.isInterface() || m1853j3.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (AbstractC1167Vq.m2385P(m1853j3)) {
                    m1206h(type2, List.class);
                    m1206h(type2, Set.class);
                    m1206h(type2, Map.class);
                    m1206h(type2, Collection.class);
                    String str = "Platform " + m1853j3;
                    if (type2 instanceof ParameterizedType) {
                        str = str + " in " + type2;
                    }
                    throw new IllegalArgumentException(AbstractC2441tz.m4195W(str, " requires explicit JsonAdapter to be registered"));
                }
                if (m1853j3.isAnonymousClass()) {
                    throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(m1853j3.getName()));
                }
                if (m1853j3.isLocalClass()) {
                    throw new IllegalArgumentException("Cannot serialize local class ".concat(m1853j3.getName()));
                }
                if (m1853j3.getEnclosingClass() != null && !Modifier.isStatic(m1853j3.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(m1853j3.getName()));
                }
                if (Modifier.isAbstract(m1853j3.getModifiers())) {
                    throw new IllegalArgumentException("Cannot serialize abstract class ".concat(m1853j3.getName()));
                }
                Class<? extends Annotation> cls3 = AbstractC1167Vq.f3798P;
                if (!(cls3 != null && m1853j3.isAnnotationPresent(cls3))) {
                    try {
                        try {
                            try {
                                try {
                                    Constructor declaredConstructor2 = m1853j3.getDeclaredConstructor(new Class[0]);
                                    declaredConstructor2.setAccessible(true);
                                    c2244qI = new C2244qI(declaredConstructor2, m1853j3, i);
                                } catch (IllegalAccessException unused) {
                                    throw new AssertionError();
                                } catch (NoSuchMethodException unused2) {
                                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                    declaredMethod.setAccessible(true);
                                    c2244qI = new C2244qI(declaredMethod, m1853j3, i2);
                                } catch (InvocationTargetException e) {
                                    AbstractC1167Vq.m2390u(e);
                                    throw null;
                                }
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                declaredMethod2.setAccessible(true);
                                int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                                declaredMethod3.setAccessible(true);
                                c2244qI = new C1818iF(declaredMethod3, m1853j3, intValue);
                            } catch (IllegalAccessException unused4) {
                                throw new AssertionError();
                            }
                        } catch (NoSuchMethodException unused5) {
                            Class<?> cls4 = Class.forName("sun.misc.Unsafe");
                            Field declaredField = cls4.getDeclaredField("theUnsafe");
                            declaredField.setAccessible(true);
                            c2244qI = new C2033mG(cls4.getMethod("allocateInstance", Class.class), declaredField.get(null), m1853j3);
                        }
                        TreeMap treeMap = new TreeMap();
                        while (type2 != Object.class) {
                            Class m1853j4 = AbstractC0795Op.m1853j(type2);
                            boolean m2385P = AbstractC1167Vq.m2385P(m1853j4);
                            Field[] declaredFields = m1853j4.getDeclaredFields();
                            int length = declaredFields.length;
                            int i3 = i;
                            while (i < length) {
                                Field field = declaredFields[i];
                                int modifiers = field.getModifiers();
                                if (!Modifier.isStatic(modifiers) && !Modifier.isTransient(modifiers) && (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !m2385P)) {
                                    i3 = i2;
                                }
                                if (i3 != 0 && ((interfaceC1777hQ = (InterfaceC1777hQ) field.getAnnotation(InterfaceC1777hQ.class)) == null || !interfaceC1777hQ.ignore())) {
                                    Type m2386Q = AbstractC1167Vq.m2386Q(type2, m1853j4, field.getGenericType(), new LinkedHashSet());
                                    Annotation[] annotations = field.getAnnotations();
                                    int length2 = annotations.length;
                                    LinkedHashSet linkedHashSet = null;
                                    int i4 = 0;
                                    while (true) {
                                        cls2 = m1853j4;
                                        if (i4 < length2) {
                                            Annotation annotation = annotations[i4];
                                            boolean z2 = m2385P;
                                            Field[] fieldArr2 = declaredFields;
                                            if (annotation.annotationType().isAnnotationPresent(InterfaceC0767OJ.class)) {
                                                if (linkedHashSet == null) {
                                                    linkedHashSet = new LinkedHashSet();
                                                }
                                                LinkedHashSet linkedHashSet2 = linkedHashSet;
                                                linkedHashSet2.add(annotation);
                                                linkedHashSet = linkedHashSet2;
                                            }
                                            i4++;
                                            m1853j4 = cls2;
                                            m2385P = z2;
                                            declaredFields = fieldArr2;
                                        } else {
                                            z = m2385P;
                                            fieldArr = declaredFields;
                                            Set unmodifiableSet = linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : AbstractC1167Vq.f3801z;
                                            String name = field.getName();
                                            AbstractC1235X4 m1460z = c0657mq.m1460z(m2386Q, unmodifiableSet, name);
                                            field.setAccessible(true);
                                            if (interfaceC1777hQ != null) {
                                                String name2 = interfaceC1777hQ.name();
                                                if (!"\u0000".equals(name2)) {
                                                    name = name2;
                                                }
                                            }
                                            C1454bI c1454bI = (C1454bI) treeMap.put(name, new C1454bI(name, field, m1460z));
                                            if (c1454bI != null) {
                                                throw new IllegalArgumentException("Conflicting fields:\n    " + c1454bI.f4534h + "\n    " + field);
                                            }
                                        }
                                    }
                                } else {
                                    cls2 = m1853j4;
                                    z = m2385P;
                                    fieldArr = declaredFields;
                                }
                                i++;
                                i3 = 0;
                                i2 = 1;
                                m1853j4 = cls2;
                                m2385P = z;
                                declaredFields = fieldArr;
                            }
                            Class m1853j5 = AbstractC0795Op.m1853j(type2);
                            type2 = AbstractC1167Vq.m2386Q(type2, m1853j5, m1853j5.getGenericSuperclass(), new LinkedHashSet());
                            i = 0;
                            i2 = 1;
                        }
                        return new C0577Ko(c2244qI, treeMap).m2535h();
                    } catch (Exception unused6) {
                        throw new IllegalArgumentException("cannot construct instances of ".concat(m1853j3.getName()));
                    }
                }
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + m1853j3.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            case 2:
                Class m1853j6 = AbstractC0795Op.m1853j(type);
                if (!set.isEmpty()) {
                    return null;
                }
                if (m1853j6 == List.class || m1853j6 == Collection.class) {
                    Type m1810G = AbstractC0795Op.m1810G(type);
                    c0657mq.getClass();
                    c2603x0 = new C2603x0(c0657mq.m1460z(m1810G, AbstractC1167Vq.f3801z, null), i);
                } else {
                    if (m1853j6 != Set.class) {
                        return null;
                    }
                    Type m1810G2 = AbstractC0795Op.m1810G(type);
                    c0657mq.getClass();
                    c2603x0 = new C2603x0(c0657mq.m1460z(m1810G2, AbstractC1167Vq.f3801z, null), i2);
                }
                return c2603x0.m2535h();
            case 3:
                if (!set.isEmpty() || (m1853j = AbstractC0795Op.m1853j(type)) != Map.class) {
                    return null;
                }
                if (type2 == Properties.class) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else if (Map.class.isAssignableFrom(m1853j)) {
                    Type m2386Q2 = AbstractC1167Vq.m2386Q(type2, m1853j, AbstractC1167Vq.m2391v(type2, m1853j, Map.class), new LinkedHashSet());
                    actualTypeArguments = m2386Q2 instanceof ParameterizedType ? ((ParameterizedType) m2386Q2).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                } else {
                    throw new IllegalArgumentException();
                }
                return new C2253qR(c0657mq, actualTypeArguments[0], actualTypeArguments[1]).m2535h();
            case 4:
                return null;
            default:
                if (!set.isEmpty()) {
                    return null;
                }
                Class cls5 = Boolean.TYPE;
                C2424tg c2424tg = AbstractC0795Op.f2701M;
                if (type2 == cls5) {
                    return c2424tg;
                }
                Class cls6 = Byte.TYPE;
                C2424tg c2424tg2 = AbstractC0795Op.f2708V;
                if (type2 == cls6) {
                    return c2424tg2;
                }
                Class cls7 = Character.TYPE;
                C2424tg c2424tg3 = AbstractC0795Op.f2706S;
                if (type2 == cls7) {
                    return c2424tg3;
                }
                Class cls8 = Double.TYPE;
                C2424tg c2424tg4 = AbstractC0795Op.f2705R;
                if (type2 == cls8) {
                    return c2424tg4;
                }
                Class cls9 = Float.TYPE;
                C2424tg c2424tg5 = AbstractC0795Op.f2718w;
                if (type2 == cls9) {
                    return c2424tg5;
                }
                Class cls10 = Integer.TYPE;
                C2424tg c2424tg6 = AbstractC0795Op.f2700I;
                if (type2 == cls10) {
                    return c2424tg6;
                }
                Class cls11 = Long.TYPE;
                C2424tg c2424tg7 = AbstractC0795Op.f2714q;
                if (type2 == cls11) {
                    return c2424tg7;
                }
                Class cls12 = Short.TYPE;
                C2424tg c2424tg8 = AbstractC0795Op.f2712k;
                if (type2 == cls12) {
                    return c2424tg8;
                }
                if (type2 == Boolean.class) {
                    return c2424tg.m2535h();
                }
                if (type2 == Byte.class) {
                    return c2424tg2.m2535h();
                }
                if (type2 == Character.class) {
                    return c2424tg3.m2535h();
                }
                if (type2 == Double.class) {
                    return c2424tg4.m2535h();
                }
                if (type2 == Float.class) {
                    return c2424tg5.m2535h();
                }
                if (type2 == Integer.class) {
                    return c2424tg6.m2535h();
                }
                if (type2 == Long.class) {
                    return c2424tg7.m2535h();
                }
                if (type2 == Short.class) {
                    return c2424tg8.m2535h();
                }
                if (type2 == String.class) {
                    c0718nw = AbstractC0795Op.f2710g;
                } else if (type2 == Object.class) {
                    c0718nw = new C1355ZM(c0657mq);
                } else {
                    Class m1853j7 = AbstractC0795Op.m1853j(type);
                    Set set2 = AbstractC1167Vq.f3801z;
                    InterfaceC0467Ip interfaceC0467Ip = (InterfaceC0467Ip) m1853j7.getAnnotation(InterfaceC0467Ip.class);
                    if (interfaceC0467Ip == null || !interfaceC0467Ip.generateAdapter()) {
                        abstractC1235X4 = null;
                        abstractC1235X42 = null;
                    } else {
                        try {
                            try {
                                cls = Class.forName(m1853j7.getName().replace("$", "_") + "JsonAdapter", true, m1853j7.getClassLoader());
                                try {
                                    if (type2 instanceof ParameterizedType) {
                                        Type[] actualTypeArguments2 = ((ParameterizedType) type2).getActualTypeArguments();
                                        try {
                                            declaredConstructor = cls.getDeclaredConstructor(C0657MQ.class, Type[].class);
                                            objArr = new Object[]{c0657mq, actualTypeArguments2};
                                        } catch (NoSuchMethodException unused7) {
                                            objArr = new Object[]{actualTypeArguments2};
                                            declaredConstructor = cls.getDeclaredConstructor(Type[].class);
                                        }
                                    } else {
                                        try {
                                            objArr = new Object[]{c0657mq};
                                            declaredConstructor = cls.getDeclaredConstructor(C0657MQ.class);
                                        } catch (NoSuchMethodException unused8) {
                                            declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                                            objArr = new Object[0];
                                        }
                                    }
                                    declaredConstructor.setAccessible(true);
                                    abstractC1235X42 = ((AbstractC1235X4) declaredConstructor.newInstance(objArr)).m2535h();
                                    abstractC1235X4 = null;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    if ((type2 instanceof ParameterizedType) || cls.getTypeParameters().length == 0) {
                                        throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type2, e);
                                    }
                                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type2 + "'. Suspiciously, the type was not parameterized but the target class '" + cls.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                                }
                            } catch (ClassNotFoundException e3) {
                                throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type2, e3);
                            } catch (IllegalAccessException e4) {
                                throw new RuntimeException("Failed to access the generated JsonAdapter for " + type2, e4);
                            } catch (InstantiationException e5) {
                                throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type2, e5);
                            } catch (InvocationTargetException e6) {
                                AbstractC1167Vq.m2390u(e6);
                                throw null;
                            }
                        } catch (NoSuchMethodException e7) {
                            e = e7;
                            cls = null;
                        }
                    }
                    if (abstractC1235X42 != null) {
                        return abstractC1235X42;
                    }
                    if (!m1853j7.isEnum()) {
                        return abstractC1235X4;
                    }
                    c0718nw = new C0718NW(m1853j7);
                }
                return c0718nw.m2535h();
        }
    }
}
