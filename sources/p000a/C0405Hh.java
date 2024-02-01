package p000a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* renamed from: a.Hh */
/* loaded from: classes.dex */
public final class C0405Hh extends C1066U0 {

    /* renamed from: f */
    public final int f1371f;

    public C0405Hh(int i, int i2, InterfaceC2364sT interfaceC2364sT) {
        super(i, interfaceC2364sT);
        boolean z;
        String str;
        String str2;
        this.f1371f = i2;
        if (i2 != 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
            Class cls = AbstractC0274FD.m575z(C1066U0.class).f2352z;
            String str3 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    str3 = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod == null) {
                        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                        if (enclosingConstructor == null) {
                            int m2572Fu = AbstractC1269Xn.m2572Fu(str3, '$', 0, false, 6);
                            if (m2572Fu != -1) {
                                str3 = str3.substring(m2572Fu + 1, str3.length());
                            }
                        } else {
                            str2 = enclosingConstructor.getName() + '$';
                        }
                    } else {
                        str2 = enclosingMethod.getName() + '$';
                    }
                    str3 = AbstractC1269Xn.m2585fi(str3, str2);
                } else {
                    boolean isArray = cls.isArray();
                    LinkedHashMap linkedHashMap = C0697NA.f2351v;
                    if (isArray) {
                        Class<?> componentType = cls.getComponentType();
                        if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                            str3 = str.concat("Array");
                        }
                        if (str3 == null) {
                            str3 = "Array";
                        }
                    } else {
                        str3 = (String) linkedHashMap.get(cls.getName());
                        if (str3 == null) {
                            str3 = cls.getSimpleName();
                        }
                    }
                }
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4187M(sb, str3, " instead").toString());
        }
        if (i >= 1) {
        } else {
            throw new IllegalArgumentException(AbstractC2441tz.m4190Q("Buffered channel capacity must be at least 1, but ", i, " was specified").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f9 A[RETURN] */
    @Override // p000a.C1066U0, p000a.InterfaceC1604eC
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo907Q(java.lang.Object r30, p000a.InterfaceC1171Vv r31) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0405Hh.mo907Q(java.lang.Object, a.Vv):java.lang.Object");
    }

    @Override // p000a.C1066U0
    /* renamed from: y */
    public final boolean mo908y() {
        return this.f1371f == 2;
    }
}
