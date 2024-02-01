package p000a;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: a.Be */
/* loaded from: classes.dex */
public final class C0086Be extends AbstractC2054mi {

    /* renamed from: z */
    public final Executor f332z;

    public C0086Be(Executor executor) {
        this.f332z = executor;
    }

    @Override // p000a.AbstractC2054mi
    /* renamed from: z */
    public final InterfaceC0792Om mo192z(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (AbstractC2575wW.m4447p(type) != InterfaceC0987SV.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m4389C = AbstractC2575wW.m4389C(0, (ParameterizedType) type);
            if (!AbstractC2575wW.m4456x(annotationArr, InterfaceC1633ei.class)) {
                executor = this.f332z;
            }
            return new C1174Vy(13, this, m4389C, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
