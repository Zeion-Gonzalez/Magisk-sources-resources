package p000a;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: a.TI */
/* loaded from: classes.dex */
public class C1028TI extends AbstractC0929RT {

    /* renamed from: S */
    public final Class f3434S;

    public C1028TI(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (true ^ cls.isEnum()) {
            this.f3434S = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: N */
    public final void mo1953N(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        this.f3434S.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: Q */
    public Serializable mo1955v(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1028TI)) {
            return false;
        }
        return AbstractC1292YB.m2695u(this.f3434S, ((C1028TI) obj).f3434S);
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: h */
    public String mo1954h() {
        return this.f3434S.getName();
    }

    public final int hashCode() {
        return this.f3434S.hashCode();
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: z */
    public final Object mo1956z(String str, Bundle bundle) {
        return (Serializable) bundle.get(str);
    }

    public C1028TI(Class cls, int i) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f3434S = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
