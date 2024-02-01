package p000a;

import java.io.IOException;

/* renamed from: a.hE */
/* loaded from: classes.dex */
public final class C1767hE extends AbstractC0209E {

    /* renamed from: I */
    public static final C1281Y f5563I = AbstractC2441tz.m4189P("2.5.29.9");

    /* renamed from: g */
    public static final C1281Y f5564g;

    /* renamed from: k */
    public static final C1281Y f5565k;

    /* renamed from: q */
    public static final C1281Y f5566q;

    /* renamed from: R */
    public final boolean f5567R;

    /* renamed from: S */
    public final C1281Y f5568S;

    /* renamed from: w */
    public final AbstractC0477J f5569w;

    static {
        new C1281Y("2.5.29.14").m2622E();
        new C1281Y("2.5.29.15").m2622E();
        new C1281Y("2.5.29.16").m2622E();
        f5566q = new C1281Y("2.5.29.17").m2622E();
        f5565k = AbstractC2441tz.m4189P("2.5.29.18");
        new C1281Y("2.5.29.19").m2622E();
        new C1281Y("2.5.29.20").m2622E();
        new C1281Y("2.5.29.21").m2622E();
        new C1281Y("2.5.29.23").m2622E();
        new C1281Y("2.5.29.24").m2622E();
        new C1281Y("2.5.29.27").m2622E();
        new C1281Y("2.5.29.28").m2622E();
        f5564g = new C1281Y("2.5.29.29").m2622E();
        new C1281Y("2.5.29.30").m2622E();
        new C1281Y("2.5.29.31").m2622E();
        new C1281Y("2.5.29.32").m2622E();
        new C1281Y("2.5.29.33").m2622E();
        new C1281Y("2.5.29.35").m2622E();
        new C1281Y("2.5.29.36").m2622E();
        new C1281Y("2.5.29.37").m2622E();
        new C1281Y("2.5.29.46").m2622E();
        new C1281Y("2.5.29.54").m2622E();
        new C1281Y("1.3.6.1.5.5.7.1.1").m2622E();
        new C1281Y("1.3.6.1.5.5.7.1.11").m2622E();
        new C1281Y("1.3.6.1.5.5.7.1.12").m2622E();
        new C1281Y("1.3.6.1.5.5.7.1.2").m2622E();
        new C1281Y("1.3.6.1.5.5.7.1.3").m2622E();
        new C1281Y("1.3.6.1.5.5.7.1.4").m2622E();
        new C1281Y("2.5.29.56").m2622E();
        new C1281Y("2.5.29.55").m2622E();
        new C1281Y("2.5.29.60").m2622E();
        new C1281Y("2.5.29.72").m2622E();
        new C1281Y("2.5.29.73").m2622E();
        new C1281Y("2.5.29.74").m2622E();
    }

    public C1767hE(AbstractC1333Z abstractC1333Z) {
        C0637M c0637m;
        InterfaceC0959S mo142E;
        if (abstractC1333Z.size() == 2) {
            this.f5568S = C1281Y.m2621U(abstractC1333Z.mo142E(0));
            this.f5567R = false;
            mo142E = abstractC1333Z.mo142E(1);
        } else if (abstractC1333Z.size() == 3) {
            this.f5568S = C1281Y.m2621U(abstractC1333Z.mo142E(0));
            InterfaceC0959S mo142E2 = abstractC1333Z.mo142E(1);
            C2120o c2120o = C0637M.f2060R;
            if (mo142E2 != null && !(mo142E2 instanceof C0637M)) {
                if (mo142E2 instanceof byte[]) {
                    try {
                        c0637m = (C0637M) C0637M.f2060R.m438N((byte[]) mo142E2);
                    } catch (IOException e) {
                        throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e.getMessage());
                    }
                } else {
                    throw new IllegalArgumentException("illegal object in getInstance: ".concat(mo142E2.getClass().getName()));
                }
            } else {
                c0637m = (C0637M) mo142E2;
            }
            this.f5567R = c0637m.m1429s();
            mo142E = abstractC1333Z.mo142E(2);
        } else {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC1333Z.size());
        }
        this.f5569w = AbstractC0477J.m1154y(mo142E);
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(3);
        c2551w.m4371z(this.f5568S);
        if (this.f5567R) {
            c2551w.m4371z(C0637M.f2059I);
        }
        c2551w.m4371z(this.f5569w);
        return new C1802hw(c2551w);
    }

    @Override // p000a.AbstractC0209E
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1767hE)) {
            return false;
        }
        C1767hE c1767hE = (C1767hE) obj;
        if (!c1767hE.f5568S.m3068I(this.f5568S) || !c1767hE.f5569w.m3068I(this.f5569w) || c1767hE.f5567R != this.f5567R) {
            return false;
        }
        return true;
    }

    @Override // p000a.AbstractC0209E
    public final int hashCode() {
        C1281Y c1281y = this.f5568S;
        AbstractC0477J abstractC0477J = this.f5569w;
        boolean z = this.f5567R;
        int hashCode = c1281y.hashCode() ^ abstractC0477J.hashCode();
        return z ? hashCode : ~hashCode;
    }
}
