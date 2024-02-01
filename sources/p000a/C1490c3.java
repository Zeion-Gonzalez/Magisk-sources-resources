package p000a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: a.c3 */
/* loaded from: classes.dex */
public final class C1490c3 extends AbstractC0772OO {

    /* renamed from: z */
    public static final C1490c3 f4628z = new C1490c3();

    @Override // p000a.AbstractC0772OO
    /* renamed from: h */
    public final InterfaceC2491ux mo1264h(Type type, Annotation[] annotationArr, C0313Fz c0313Fz) {
        if (AbstractC2575wW.m4447p(type) != AbstractC2405tJ.m4137H()) {
            return null;
        }
        return new C0175DP(15, c0313Fz.m684N(AbstractC2575wW.m4389C(0, (ParameterizedType) type), annotationArr));
    }
}
