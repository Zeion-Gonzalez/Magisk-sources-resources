package p000a;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: a.WM */
/* loaded from: classes.dex */
public final class C1196WM extends AbstractC0929RT {

    /* renamed from: S */
    public final Class f3899S;

    public C1196WM(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f3899S = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    @Override // p000a.AbstractC0929RT
    /* renamed from: N */
    public final void mo1953N(Bundle bundle, String str, Object obj) {
        ?? r4 = (Serializable[]) obj;
        this.f3899S.cast(r4);
        bundle.putSerializable(str, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1292YB.m2695u(C1196WM.class, obj.getClass())) {
            return false;
        }
        return AbstractC1292YB.m2695u(this.f3899S, ((C1196WM) obj).f3899S);
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: h */
    public final String mo1954h() {
        return this.f3899S.getName();
    }

    public final int hashCode() {
        return this.f3899S.hashCode();
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: v */
    public final Object mo1955v(String str) {
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // p000a.AbstractC0929RT
    /* renamed from: z */
    public final Object mo1956z(String str, Bundle bundle) {
        return (Serializable[]) bundle.get(str);
    }
}
