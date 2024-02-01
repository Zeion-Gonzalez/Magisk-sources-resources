package p000a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: a.KP */
/* loaded from: classes.dex */
public final class C0553KP extends AbstractC0772OO {
    @Override // p000a.AbstractC0772OO
    /* renamed from: h */
    public final InterfaceC2491ux mo1264h(Type type, Annotation[] annotationArr, C0313Fz c0313Fz) {
        if (type == String.class) {
            return C2089nL.f6453S;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return C1899jl.f5936S;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return C0165DC.f522S;
        }
        if (type == Character.class || type == Character.TYPE) {
            return C1830iS.f5724S;
        }
        if (type == Double.class || type == Double.TYPE) {
            return C1423aj.f4460S;
        }
        if (type == Float.class || type == Float.TYPE) {
            return C1597e4.f4906S;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return C1191WH.f3869S;
        }
        if (type == Long.class || type == Long.TYPE) {
            return C2045mY.f6369S;
        }
        if (type == Short.class || type == Short.TYPE) {
            return C1297YH.f4152S;
        }
        return null;
    }

    @Override // p000a.AbstractC0772OO
    /* renamed from: z */
    public final InterfaceC2491ux mo1265z(Type type, Annotation[] annotationArr) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return C2249qN.f6916S;
        }
        return null;
    }
}
