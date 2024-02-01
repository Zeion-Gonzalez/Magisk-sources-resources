package p000a;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: a.PX */
/* loaded from: classes.dex */
public final class C0833PX implements WildcardType {

    /* renamed from: h */
    public final Type f2817h;

    /* renamed from: z */
    public final Type f2818z;

    public C0833PX(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            Type type = typeArr[0];
            type.getClass();
            AbstractC1167Vq.m2388h(type);
            this.f2817h = null;
            this.f2818z = AbstractC1167Vq.m2392z(typeArr[0]);
            return;
        }
        Type type2 = typeArr2[0];
        type2.getClass();
        AbstractC1167Vq.m2388h(type2);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f2817h = AbstractC1167Vq.m2392z(typeArr2[0]);
        this.f2818z = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC0795Op.m1854k(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f2817h;
        return type != null ? new Type[]{type} : AbstractC1167Vq.f3799h;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f2818z};
    }

    public final int hashCode() {
        Type type = this.f2817h;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f2818z.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f2817h;
        if (type != null) {
            return "? super " + AbstractC1167Vq.m2387W(type);
        }
        Type type2 = this.f2818z;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC1167Vq.m2387W(type2);
    }
}
