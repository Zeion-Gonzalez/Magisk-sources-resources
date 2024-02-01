package p000a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: a.NA */
/* loaded from: classes.dex */
public final class C0697NA implements InterfaceC1367Zb, InterfaceC0592L4 {

    /* renamed from: h */
    public static final Map f2350h;

    /* renamed from: v */
    public static final LinkedHashMap f2351v;

    /* renamed from: z */
    public final Class f2352z;

    static {
        int i = 0;
        List m2661T = AbstractC1292YB.m2661T(InterfaceC1459bP.class, InterfaceC2364sT.class, InterfaceC0559KW.class, InterfaceC0548KJ.class, C1929kI.class, InterfaceC1029TJ.class, InterfaceC2258qW.class, InterfaceC0748O0.class, InterfaceC0562KZ.class, InterfaceC1456bK.class, InterfaceC0739Ns.class, InterfaceC1383Zu.class, InterfaceC0728Ng.class, InterfaceC1201WS.class, InterfaceC1306YT.class, InterfaceC1299YK.class, InterfaceC0412Ho.class, InterfaceC1040TW.class, InterfaceC2475ug.class, InterfaceC1853iu.class, InterfaceC0415Hr.class, InterfaceC2331rs.class, InterfaceC1377Zm.class);
        ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(m2661T));
        for (Object obj : m2661T) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C0084Bc((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                AbstractC1292YB.m2699zx();
                throw null;
            }
        }
        f2350h = AbstractC0873QM.m2012d2(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        for (String str : hashMap.values()) {
            hashMap3.put("kotlin.jvm.internal." + AbstractC1269Xn.m2593vk(str, '.') + "CompanionObject", str.concat(".Companion"));
        }
        for (Map.Entry entry : f2350h.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0438II.m990C(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC1269Xn.m2593vk((String) entry2.getValue(), '.'));
        }
        f2351v = linkedHashMap;
    }

    public C0697NA(Class cls) {
        this.f2352z = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0697NA) && AbstractC1292YB.m2695u(AbstractC1292YB.m2670Z(this), AbstractC1292YB.m2670Z((InterfaceC1367Zb) obj));
    }

    public final int hashCode() {
        return AbstractC1292YB.m2670Z(this).hashCode();
    }

    public final String toString() {
        return this.f2352z.toString() + " (Kotlin reflection is not available)";
    }

    @Override // p000a.InterfaceC0592L4
    /* renamed from: z */
    public final Class mo1318z() {
        return this.f2352z;
    }
}
