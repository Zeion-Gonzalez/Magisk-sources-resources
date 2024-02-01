package p000a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: a.nO */
/* loaded from: classes.dex */
public final class C2091nO extends AbstractC0772OO {

    /* renamed from: z */
    public final C0657MQ f6456z;

    public C2091nO(C0657MQ c0657mq) {
        this.f6456z = c0657mq;
    }

    /* renamed from: v */
    public static Set m3717v(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC0767OJ.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    @Override // p000a.AbstractC0772OO
    /* renamed from: h */
    public final InterfaceC2491ux mo1264h(Type type, Annotation[] annotationArr, C0313Fz c0313Fz) {
        return new C0563Ka(this.f6456z.m1460z(type, m3717v(annotationArr), null));
    }

    @Override // p000a.AbstractC0772OO
    /* renamed from: z */
    public final InterfaceC2491ux mo1265z(Type type, Annotation[] annotationArr) {
        return new C0498JP(this.f6456z.m1460z(type, m3717v(annotationArr), null));
    }
}
