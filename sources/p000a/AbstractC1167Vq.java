package p000a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: a.Vq */
/* loaded from: classes.dex */
public abstract class AbstractC1167Vq {

    /* renamed from: P */
    public static final Class f3798P;

    /* renamed from: h */
    public static final Type[] f3799h;

    /* renamed from: v */
    public static final Class f3800v;

    /* renamed from: z */
    public static final Set f3801z;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:36:0x001a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:86)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    static {
        /*
            java.util.Set r0 = java.util.Collections.emptySet()
            p000a.AbstractC1167Vq.f3801z = r0
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            p000a.AbstractC1167Vq.f3799h = r0
            r0 = 0
            java.lang.String r1 = getKotlinMetadataClassName()     // Catch: java.lang.ClassNotFoundException -> L15
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L15
            goto L16
        L15:
            r1 = r0
        L16:
            p000a.AbstractC1167Vq.f3798P = r1
            java.lang.Class<kotlin.jvm.internal.DefaultConstructorMarker> r0 = kotlin.jvm.internal.DefaultConstructorMarker.class
        L1a:
            p000a.AbstractC1167Vq.f3800v = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r0.<init>(r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            java.util.Collections.unmodifiableMap(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1167Vq.<clinit>():void");
    }

    /* renamed from: G */
    public static C1237X6 m2383G(String str, String str2, AbstractC0932RY abstractC0932RY) {
        String m2101od = abstractC0932RY.m2101od();
        return new C1237X6(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, m2101od) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, m2101od));
    }

    /* renamed from: N */
    public static C1237X6 m2384N(String str, String str2, AbstractC0932RY abstractC0932RY) {
        String m2101od = abstractC0932RY.m2101od();
        return new C1237X6(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, m2101od) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, m2101od));
    }

    /* renamed from: P */
    public static boolean m2385P(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    /* renamed from: Q */
    public static Type m2386Q(Type type, Class cls, Type type2, LinkedHashSet linkedHashSet) {
        Type[] typeArr;
        Type[] typeArr2;
        boolean z;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (linkedHashSet.contains(typeVariable)) {
                    return type2;
                }
                linkedHashSet.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type m2391v = m2391v(type, cls, cls2);
                    if (m2391v instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        while (i < typeParameters.length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) m2391v).getActualTypeArguments()[i];
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type m2386Q = m2386Q(type, cls, componentType, linkedHashSet);
                        if (componentType != m2386Q) {
                            return new C1293YC(m2386Q);
                        }
                        return cls3;
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type m2386Q2 = m2386Q(type, cls, genericComponentType, linkedHashSet);
                    if (genericComponentType != m2386Q2) {
                        return new C1293YC(m2386Q2);
                    }
                    return genericArrayType;
                }
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type m2386Q3 = m2386Q(type, cls, ownerType, linkedHashSet);
                    if (m2386Q3 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type m2386Q4 = m2386Q(type, cls, actualTypeArguments[i], linkedHashSet);
                        if (m2386Q4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = m2386Q4;
                        }
                        i++;
                    }
                    if (z) {
                        return new C0047Ax(m2386Q3, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                }
                boolean z2 = type2 instanceof WildcardType;
                WildcardType wildcardType = type2;
                if (z2) {
                    WildcardType wildcardType2 = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType2.getLowerBounds();
                    Type[] upperBounds = wildcardType2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type m2386Q5 = m2386Q(type, cls, lowerBounds[0], linkedHashSet);
                        wildcardType = wildcardType2;
                        if (m2386Q5 != lowerBounds[0]) {
                            if (m2386Q5 instanceof WildcardType) {
                                typeArr2 = ((WildcardType) m2386Q5).getLowerBounds();
                            } else {
                                typeArr2 = new Type[]{m2386Q5};
                            }
                            return new C0833PX(new Type[]{Object.class}, typeArr2);
                        }
                    } else {
                        wildcardType = wildcardType2;
                        if (upperBounds.length == 1) {
                            Type m2386Q6 = m2386Q(type, cls, upperBounds[0], linkedHashSet);
                            wildcardType = wildcardType2;
                            if (m2386Q6 != upperBounds[0]) {
                                if (m2386Q6 instanceof WildcardType) {
                                    typeArr = ((WildcardType) m2386Q6).getUpperBounds();
                                } else {
                                    typeArr = new Type[]{m2386Q6};
                                }
                                return new C0833PX(typeArr, f3799h);
                            }
                        }
                    }
                }
                return wildcardType;
            }
        } while (type2 != typeVariable);
        return type2;
    }

    /* renamed from: W */
    public static String m2387W(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    /* renamed from: h */
    public static void m2388h(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /* renamed from: o */
    public static String m2389o(Type type, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: u */
    public static void m2390u(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    /* renamed from: v */
    public static Type m2391v(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m2391v(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m2391v(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: z */
    public static Type m2392z(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C1293YC(m2392z(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof C0047Ax) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0047Ax(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof C1293YC ? type : new C1293YC(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C0833PX)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C0833PX(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }
}
