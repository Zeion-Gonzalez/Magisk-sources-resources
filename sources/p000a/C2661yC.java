package p000a;

/* renamed from: a.yC */
/* loaded from: classes.dex */
public final class C2661yC extends AbstractC0209E {

    /* renamed from: E */
    public final AbstractC1176W f8290E;

    /* renamed from: I */
    public final C2074n2 f8291I;

    /* renamed from: R */
    public final C2339s f8292R;

    /* renamed from: S */
    public final AbstractC1333Z f8293S;

    /* renamed from: U */
    public final AbstractC1176W f8294U;

    /* renamed from: f */
    public final C2051me f8295f;

    /* renamed from: g */
    public final C2006lk f8296g;

    /* renamed from: k */
    public final C2006lk f8297k;

    /* renamed from: q */
    public final C2043mV f8298q;

    /* renamed from: s */
    public final C1133VD f8299s;

    /* renamed from: w */
    public final C2339s f8300w;

    /* renamed from: y */
    public final C2043mV f8301y;

    public C2661yC(AbstractC1333Z abstractC1333Z) {
        int i;
        boolean z;
        boolean z2;
        C2043mV c2043mV;
        C2043mV c2043mV2;
        C2051me c2051me;
        this.f8293S = abstractC1333Z;
        if (abstractC1333Z.mo142E(0) instanceof AbstractC1857j) {
            this.f8292R = (C2339s) C2339s.f7177w.m442W((AbstractC1857j) abstractC1333Z.mo142E(0), true);
            i = 0;
        } else {
            this.f8292R = new C2339s(0L);
            i = -1;
        }
        if (this.f8292R.m3998s(0)) {
            z2 = false;
            z = true;
        } else if (this.f8292R.m3998s(1)) {
            z = false;
            z2 = true;
        } else if (this.f8292R.m3998s(2)) {
            z = false;
            z2 = false;
        } else {
            throw new IllegalArgumentException("version number not recognised");
        }
        this.f8300w = C2339s.m3996y(abstractC1333Z.mo142E(i + 1));
        this.f8291I = C2074n2.m3693V(abstractC1333Z.mo142E(i + 2));
        InterfaceC0959S mo142E = abstractC1333Z.mo142E(i + 3);
        C0516Jj c0516Jj = C2043mV.f6362k;
        if (mo142E instanceof C2043mV) {
            c2043mV = (C2043mV) mo142E;
        } else if (mo142E != null) {
            c2043mV = new C2043mV(AbstractC1333Z.m2714U(mo142E));
        } else {
            c2043mV = null;
        }
        this.f8298q = c2043mV;
        AbstractC1333Z abstractC1333Z2 = (AbstractC1333Z) abstractC1333Z.mo142E(i + 4);
        this.f8297k = C2006lk.m3636V(abstractC1333Z2.mo142E(0));
        this.f8296g = C2006lk.m3636V(abstractC1333Z2.mo142E(1));
        InterfaceC0959S mo142E2 = abstractC1333Z.mo142E(i + 5);
        if (mo142E2 instanceof C2043mV) {
            c2043mV2 = (C2043mV) mo142E2;
        } else if (mo142E2 != null) {
            c2043mV2 = new C2043mV(AbstractC1333Z.m2714U(mo142E2));
        } else {
            c2043mV2 = null;
        }
        this.f8301y = c2043mV2;
        int i2 = i + 6;
        this.f8299s = C1133VD.m2331V(abstractC1333Z.mo142E(i2));
        int size = (abstractC1333Z.size() - i2) - 1;
        if (size != 0 && z) {
            throw new IllegalArgumentException("version 1 certificate contains extra data");
        }
        while (size > 0) {
            AbstractC1857j abstractC1857j = (AbstractC1857j) abstractC1333Z.mo142E(i2 + size);
            int i3 = abstractC1857j.f5794w;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        if (!z2) {
                            AbstractC1333Z abstractC1333Z3 = (AbstractC1333Z) AbstractC1333Z.f4223R.m442W(abstractC1857j, true);
                            if (abstractC1333Z3 instanceof C2051me) {
                                c2051me = (C2051me) abstractC1333Z3;
                            } else if (abstractC1333Z3 != null) {
                                c2051me = new C2051me(AbstractC1333Z.m2714U(abstractC1333Z3));
                            } else {
                                c2051me = null;
                            }
                            this.f8295f = c2051me;
                        } else {
                            throw new IllegalArgumentException("version 2 certificate cannot contain extensions");
                        }
                    } else {
                        throw new IllegalArgumentException("Unknown tag encountered in structure: " + abstractC1857j.f5794w);
                    }
                } else {
                    this.f8290E = (AbstractC1176W) AbstractC1176W.f3832R.m442W(abstractC1857j, false);
                }
            } else {
                this.f8294U = (AbstractC1176W) AbstractC1176W.f3832R.m442W(abstractC1857j, false);
            }
            size--;
        }
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        String m3119z = AbstractC1642et.m3119z("org.bouncycastle.x509.allow_non-der_tbscert");
        AbstractC1333Z abstractC1333Z = this.f8293S;
        if (m3119z == null || AbstractC1642et.m3118h("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return abstractC1333Z;
        }
        C2551w c2551w = new C2551w();
        C2339s c2339s = this.f8292R;
        boolean z = false;
        boolean z2 = true;
        if (!c2339s.m3998s(0)) {
            c2551w.m4371z(new C1524cl(z ? 1 : 0, z ? 1 : 0, c2339s, z2));
        }
        c2551w.m4371z(this.f8300w);
        c2551w.m4371z(this.f8291I);
        c2551w.m4371z(this.f8298q);
        int i = 2;
        C2551w c2551w2 = new C2551w(2);
        c2551w2.m4371z(this.f8297k);
        c2551w2.m4371z(this.f8296g);
        c2551w.m4371z(new C1802hw(c2551w2));
        InterfaceC0959S interfaceC0959S = this.f8301y;
        if (interfaceC0959S == null) {
            interfaceC0959S = new C1802hw();
        }
        c2551w.m4371z(interfaceC0959S);
        c2551w.m4371z(this.f8299s);
        AbstractC1176W abstractC1176W = this.f8294U;
        if (abstractC1176W != null) {
            c2551w.m4371z(new C1524cl(z2 ? 1 : 0, z ? 1 : 0, abstractC1176W, z));
        }
        AbstractC1176W abstractC1176W2 = this.f8290E;
        if (abstractC1176W2 != null) {
            c2551w.m4371z(new C1524cl(i, z ? 1 : 0, abstractC1176W2, z));
        }
        C2051me c2051me = this.f8295f;
        if (c2051me != null) {
            c2551w.m4371z(new C1524cl(3, z ? 1 : 0, c2051me, z2));
        }
        return new C1802hw(c2551w);
    }
}
