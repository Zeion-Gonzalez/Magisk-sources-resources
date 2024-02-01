package p000a;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: a.dN */
/* loaded from: classes.dex */
public final class C1562dN extends AbstractC0929RT {

    /* renamed from: S */
    public final Class f4823S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1562dN(Class cls) {
        super(true);
        boolean z = true;
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            z = false;
        }
        if (z) {
            this.f4823S = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: N */
    public final void mo1953N(Bundle bundle, String str, Object obj) {
        this.f4823S.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1292YB.m2695u(C1562dN.class, obj.getClass())) {
            return false;
        }
        return AbstractC1292YB.m2695u(this.f4823S, ((C1562dN) obj).f4823S);
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: h */
    public final String mo1954h() {
        return this.f4823S.getName();
    }

    public final int hashCode() {
        return this.f4823S.hashCode();
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: v */
    public final Object mo1955v(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: z */
    public final Object mo1956z(String str, Bundle bundle) {
        return bundle.get(str);
    }
}
