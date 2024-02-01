package p000a;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: a.Pe */
/* loaded from: classes.dex */
public final class C0839Pe extends AbstractC0929RT {

    /* renamed from: S */
    public final Class f2834S;

    public C0839Pe(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f2834S = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: N */
    public final void mo1953N(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        this.f2834S.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1292YB.m2695u(C0839Pe.class, obj.getClass())) {
            return false;
        }
        return AbstractC1292YB.m2695u(this.f2834S, ((C0839Pe) obj).f2834S);
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: h */
    public final String mo1954h() {
        return this.f2834S.getName();
    }

    public final int hashCode() {
        return this.f2834S.hashCode();
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: v */
    public final Object mo1955v(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: z */
    public final Object mo1956z(String str, Bundle bundle) {
        return (Parcelable[]) bundle.get(str);
    }
}
