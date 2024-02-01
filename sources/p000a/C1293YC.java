package p000a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: a.YC */
/* loaded from: classes.dex */
public final class C1293YC implements GenericArrayType {

    /* renamed from: z */
    public final Type f4146z;

    public C1293YC(Type type) {
        this.f4146z = AbstractC1167Vq.m2392z(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC0795Op.m1854k(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f4146z;
    }

    public final int hashCode() {
        return this.f4146z.hashCode();
    }

    public final String toString() {
        return AbstractC1167Vq.m2387W(this.f4146z) + "[]";
    }
}
