package p000a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: a.Kc */
/* loaded from: classes.dex */
public final class C0565Kc extends AbstractC2054mi {

    /* renamed from: z */
    public static final C0565Kc f1837z = new C0565Kc();

    @Override // p000a.AbstractC2054mi
    /* renamed from: z */
    public final InterfaceC0792Om mo192z(Type type, Annotation[] annotationArr) {
        if (AbstractC2575wW.m4447p(type) != AbstractC2405tJ.m4156o()) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            int i = 0;
            Type m4389C = AbstractC2575wW.m4389C(0, (ParameterizedType) type);
            if (AbstractC2575wW.m4447p(m4389C) != C0870QJ.class) {
                return new C1746gq(i, m4389C);
            }
            if (m4389C instanceof ParameterizedType) {
                return new C1746gq(1, AbstractC2575wW.m4389C(0, (ParameterizedType) m4389C));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
