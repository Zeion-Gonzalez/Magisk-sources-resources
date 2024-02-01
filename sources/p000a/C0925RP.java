package p000a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: a.RP */
/* loaded from: classes.dex */
public final class C0925RP {

    /* renamed from: h */
    public final Map f3175h;

    /* renamed from: z */
    public final HashMap f3176z = new HashMap();

    public C0925RP(HashMap hashMap) {
        this.f3175h = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC2241qF enumC2241qF = (EnumC2241qF) entry.getValue();
            List list = (List) this.f3176z.get(enumC2241qF);
            if (list == null) {
                list = new ArrayList();
                this.f3176z.put(enumC2241qF, list);
            }
            list.add((C0780OW) entry.getKey());
        }
    }

    /* renamed from: z */
    public static void m2074z(List list, InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0780OW c0780ow = (C0780OW) list.get(size);
                c0780ow.getClass();
                try {
                    int i = c0780ow.f2640z;
                    Method method = c0780ow.f2639h;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(obj, interfaceC1546d7, enumC2241qF);
                            }
                        } else {
                            method.invoke(obj, interfaceC1546d7);
                        }
                    } else {
                        method.invoke(obj, new Object[0]);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
