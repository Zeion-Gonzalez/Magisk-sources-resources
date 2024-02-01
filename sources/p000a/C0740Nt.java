package p000a;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: a.Nt */
/* loaded from: classes.dex */
public final class C0740Nt implements WildcardType {

    /* renamed from: h */
    public final Type f2518h;

    /* renamed from: z */
    public final Type f2519z;

    public C0740Nt(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            Type type = typeArr[0];
            type.getClass();
            AbstractC2575wW.m4403N(type);
            this.f2518h = null;
            this.f2519z = typeArr[0];
            return;
        }
        Type type2 = typeArr2[0];
        type2.getClass();
        AbstractC2575wW.m4403N(type2);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f2518h = typeArr2[0];
        this.f2519z = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC2575wW.m4412U(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f2518h;
        return type != null ? new Type[]{type} : AbstractC2575wW.f7877d;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f2519z};
    }

    public final int hashCode() {
        Type type = this.f2518h;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f2519z.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f2518h;
        if (type != null) {
            return "? super " + AbstractC2575wW.m4405O4(type);
        }
        Type type2 = this.f2519z;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC2575wW.m4405O4(type2);
    }
}
