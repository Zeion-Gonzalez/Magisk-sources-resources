package p000a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: a.uI */
/* loaded from: classes.dex */
public final class C2456uI implements ParameterizedType {

    /* renamed from: h */
    public final Type f7536h;

    /* renamed from: v */
    public final Type[] f7537v;

    /* renamed from: z */
    public final Type f7538z;

    public C2456uI(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            AbstractC2575wW.m4403N(type3);
        }
        this.f7538z = type;
        this.f7536h = type2;
        this.f7537v = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC2575wW.m4412U(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f7537v.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f7538z;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f7536h;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f7537v) ^ this.f7536h.hashCode();
        Type type = this.f7538z;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f7537v;
        int length = typeArr.length;
        Type type = this.f7536h;
        if (length == 0) {
            return AbstractC2575wW.m4405O4(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC2575wW.m4405O4(type));
        sb.append("<");
        sb.append(AbstractC2575wW.m4405O4(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC2575wW.m4405O4(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
