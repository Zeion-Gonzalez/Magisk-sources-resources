package p000a;

/* renamed from: a.j1 */
/* loaded from: classes.dex */
public abstract class AbstractC1859j1 extends AbstractC2020m implements InterfaceC2741zl {

    /* renamed from: R */
    public static final C1388a1 f5812R = new C1388a1(0);

    public AbstractC1859j1() {
        super(C1710g8.f5377R);
    }

    /* renamed from: C */
    public abstract void mo195C(InterfaceC1255XS interfaceC1255XS, Runnable runnable);

    /* renamed from: U8 */
    public boolean mo3030U8() {
        return !(this instanceof AbstractC2493uz);
    }

    @Override // p000a.AbstractC2020m, p000a.InterfaceC1255XS
    /* renamed from: V */
    public final InterfaceC1255XS mo105V(InterfaceC0631Ls interfaceC0631Ls) {
        boolean z;
        boolean z2 = interfaceC0631Ls instanceof AbstractC1967l;
        C0070BN c0070bn = C0070BN.f302S;
        if (z2) {
            AbstractC1967l abstractC1967l = (AbstractC1967l) interfaceC0631Ls;
            InterfaceC0631Ls interfaceC0631Ls2 = this.f6279S;
            if (interfaceC0631Ls2 != abstractC1967l) {
                if (abstractC1967l.f6088R != interfaceC0631Ls2) {
                    z = false;
                    if (z && ((InterfaceC1088UM) abstractC1967l.f6089S.mo85W(this)) != null) {
                        return c0070bn;
                    }
                }
            } else {
                abstractC1967l.getClass();
            }
            z = true;
            if (z) {
                return c0070bn;
            }
        } else if (C1710g8.f5377R == interfaceC0631Ls) {
            return c0070bn;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2575wW.m4418Y(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0017  */
    @Override // p000a.AbstractC2020m, p000a.InterfaceC1255XS
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.InterfaceC1088UM mo107y(p000a.InterfaceC0631Ls r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p000a.AbstractC1967l
            if (r0 == 0) goto L24
            a.l r3 = (p000a.AbstractC1967l) r3
            a.Ls r0 = r2.f6279S
            if (r0 == r3) goto L11
            a.Ls r1 = r3.f6088R
            if (r1 != r0) goto Lf
            goto L14
        Lf:
            r0 = 0
            goto L15
        L11:
            r3.getClass()
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L2a
            a.sT r3 = r3.f6089S
            java.lang.Object r3 = r3.mo85W(r2)
            a.UM r3 = (p000a.InterfaceC1088UM) r3
            boolean r0 = r3 instanceof p000a.InterfaceC1088UM
            if (r0 == 0) goto L2a
            goto L2b
        L24:
            a.g8 r0 = p000a.C1710g8.f5377R
            if (r0 != r3) goto L2a
            r3 = r2
            goto L2b
        L2a:
            r3 = 0
        L2b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1859j1.mo107y(a.Ls):a.UM");
    }
}
