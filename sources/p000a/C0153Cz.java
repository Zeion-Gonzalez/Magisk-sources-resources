package p000a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: a.Cz */
/* loaded from: classes.dex */
public final class C0153Cz implements GenericArrayType {

    /* renamed from: z */
    public final Type f511z;

    public C0153Cz(Type type) {
        this.f511z = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC2575wW.m4412U(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f511z;
    }

    public final int hashCode() {
        return this.f511z.hashCode();
    }

    public final String toString() {
        return AbstractC2575wW.m4405O4(this.f511z) + "[]";
    }
}
