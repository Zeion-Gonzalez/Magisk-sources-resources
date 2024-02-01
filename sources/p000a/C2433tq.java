package p000a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: a.tq */
/* loaded from: classes.dex */
public final class C2433tq extends AbstractC0772OO {

    /* renamed from: z */
    public boolean f7459z = true;

    @Override // p000a.AbstractC0772OO
    /* renamed from: h */
    public final InterfaceC2491ux mo1264h(Type type, Annotation[] annotationArr, C0313Fz c0313Fz) {
        if (type == AbstractC1449bB.class) {
            return AbstractC2575wW.m4456x(annotationArr, InterfaceC1252XP.class) ? C2169ot.f6649S : C1086UK.f3556S;
        }
        if (type == Void.class) {
            return C1641es.f5101S;
        }
        if (!this.f7459z || type != C0329GJ.class) {
            return null;
        }
        try {
            return C1930kJ.f5995S;
        } catch (NoClassDefFoundError unused) {
            this.f7459z = false;
            return null;
        }
    }

    @Override // p000a.AbstractC0772OO
    /* renamed from: z */
    public final InterfaceC2491ux mo1265z(Type type, Annotation[] annotationArr) {
        if (AbstractC1911jx.class.isAssignableFrom(AbstractC2575wW.m4447p(type))) {
            return C2567wM.f7846S;
        }
        return null;
    }
}
