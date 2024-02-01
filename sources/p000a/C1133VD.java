package p000a;

import java.util.Enumeration;

/* renamed from: a.VD */
/* loaded from: classes.dex */
public final class C1133VD extends AbstractC0209E {

    /* renamed from: R */
    public final AbstractC1176W f3695R;

    /* renamed from: S */
    public final C2074n2 f3696S;

    public C1133VD(AbstractC1333Z abstractC1333Z) {
        if (abstractC1333Z.size() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1333Z.size());
        }
        Enumeration mo147f = abstractC1333Z.mo147f();
        this.f3696S = C2074n2.m3693V(mo147f.nextElement());
        this.f3695R = AbstractC1176W.m2404s(mo147f.nextElement());
    }

    /* renamed from: V */
    public static C1133VD m2331V(Object obj) {
        if (obj instanceof C1133VD) {
            return (C1133VD) obj;
        }
        if (obj != null) {
            return new C1133VD(AbstractC1333Z.m2714U(obj));
        }
        return null;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(2);
        c2551w.m4371z(this.f3696S);
        c2551w.m4371z(this.f3695R);
        return new C1802hw(c2551w);
    }
}
