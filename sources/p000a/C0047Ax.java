package p000a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* renamed from: a.Ax */
/* loaded from: classes.dex */
public final class C0047Ax implements ParameterizedType {

    /* renamed from: h */
    public final Type f198h;

    /* renamed from: v */
    public final Type[] f199v;

    /* renamed from: z */
    public final Type f200z;

    public C0047Ax(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || AbstractC0795Op.m1853j(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f200z = type == null ? null : AbstractC1167Vq.m2392z(type);
        this.f198h = AbstractC1167Vq.m2392z(type2);
        this.f199v = (Type[]) typeArr.clone();
        int i = 0;
        while (true) {
            Type[] typeArr2 = this.f199v;
            if (i >= typeArr2.length) {
                return;
            }
            Type type3 = typeArr2[i];
            type3.getClass();
            AbstractC1167Vq.m2388h(type3);
            Type[] typeArr3 = this.f199v;
            typeArr3[i] = AbstractC1167Vq.m2392z(typeArr3[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC0795Op.m1854k(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f199v.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f200z;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f198h;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.f199v) ^ this.f198h.hashCode();
        Type type = this.f200z;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        Type[] typeArr = this.f199v;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(AbstractC1167Vq.m2387W(this.f198h));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(AbstractC1167Vq.m2387W(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(AbstractC1167Vq.m2387W(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
