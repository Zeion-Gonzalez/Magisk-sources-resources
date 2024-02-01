package p000a;

/* renamed from: a.dy */
/* loaded from: classes.dex */
public final class C1591dy implements InterfaceC1428ao {

    /* renamed from: S */
    public final C2564wJ[] f4884S;

    public C1591dy(C2564wJ... c2564wJArr) {
        this.f4884S = c2564wJArr;
    }

    @Override // p000a.InterfaceC1428ao
    /* renamed from: N */
    public final AbstractC1952kk mo1121N(Class cls, C0945Rm c0945Rm) {
        AbstractC1952kk abstractC1952kk = null;
        for (C2564wJ c2564wJ : this.f4884S) {
            if (AbstractC1292YB.m2695u(c2564wJ.f7834z, cls)) {
                Object mo85W = c2564wJ.f7833h.mo85W(c0945Rm);
                if (mo85W instanceof AbstractC1952kk) {
                    abstractC1952kk = (AbstractC1952kk) mo85W;
                } else {
                    abstractC1952kk = null;
                }
            }
        }
        if (abstractC1952kk != null) {
            return abstractC1952kk;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // p000a.InterfaceC1428ao
    /* renamed from: z */
    public final AbstractC1952kk mo1123z(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }
}
