package p000a;

import java.util.Enumeration;

/* renamed from: a.yp */
/* loaded from: classes.dex */
public final class C2692yp extends AbstractC0209E {

    /* renamed from: I */
    public final AbstractC0102C f8418I;

    /* renamed from: R */
    public final AbstractC0102C f8419R;

    /* renamed from: S */
    public final C2339s f8420S;

    /* renamed from: U */
    public final boolean f8421U;

    /* renamed from: g */
    public final AbstractC0102C f8422g;

    /* renamed from: k */
    public final boolean f8423k;

    /* renamed from: q */
    public final boolean f8424q;

    /* renamed from: s */
    public final boolean f8425s;

    /* renamed from: w */
    public final C1987lO f8426w;

    /* renamed from: y */
    public final AbstractC0102C f8427y;

    /* renamed from: E */
    public static final C2339s f8414E = new C2339s(1);

    /* renamed from: f */
    public static final C2339s f8416f = new C2339s(3);

    /* renamed from: r */
    public static final C2339s f8417r = new C2339s(4);

    /* renamed from: Y */
    public static final C2339s f8415Y = new C2339s(5);

    public C2692yp(AbstractC1333Z abstractC1333Z) {
        Enumeration mo147f = abstractC1333Z.mo147f();
        this.f8420S = C2339s.m3996y(mo147f.nextElement());
        this.f8419R = (AbstractC0102C) mo147f.nextElement();
        Object nextElement = mo147f.nextElement();
        AbstractC0102C abstractC0102C = null;
        this.f8426w = nextElement instanceof C1987lO ? (C1987lO) nextElement : nextElement != null ? new C1987lO(AbstractC1333Z.m2714U(nextElement)) : null;
        while (mo147f.hasMoreElements()) {
            AbstractC1593e abstractC1593e = (AbstractC1593e) mo147f.nextElement();
            if (abstractC1593e instanceof AbstractC1857j) {
                AbstractC1857j abstractC1857j = (AbstractC1857j) abstractC1593e;
                int i = abstractC1857j.f5794w;
                if (i == 0) {
                    this.f8425s = abstractC1857j instanceof C2645xt;
                    this.f8422g = (AbstractC0102C) AbstractC0102C.f386w.m442W(abstractC1857j, false);
                } else {
                    if (i != 1) {
                        throw new IllegalArgumentException("unknown tag value " + abstractC1857j.f5794w);
                    }
                    this.f8421U = abstractC1857j instanceof C2645xt;
                    this.f8427y = (AbstractC0102C) AbstractC0102C.f386w.m442W(abstractC1857j, false);
                }
            } else {
                if (!(abstractC1593e instanceof AbstractC0102C)) {
                    throw new IllegalArgumentException("SET expected, not encountered");
                }
                abstractC0102C = (AbstractC0102C) abstractC1593e;
            }
        }
        if (abstractC0102C == null) {
            throw new IllegalArgumentException("signerInfos not set");
        }
        this.f8418I = abstractC0102C;
        this.f8424q = this.f8419R instanceof C0448IW;
        this.f8423k = abstractC0102C instanceof C0448IW;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        InterfaceC0959S c1524cl;
        InterfaceC0959S c1524cl2;
        C2551w c2551w = new C2551w(6);
        c2551w.m4371z(this.f8420S);
        c2551w.m4371z(this.f8419R);
        C1987lO c1987lO = this.f8426w;
        c2551w.m4371z(c1987lO);
        boolean z = this.f8425s;
        boolean z2 = false;
        AbstractC0102C abstractC0102C = this.f8422g;
        if (abstractC0102C != null) {
            if (z) {
                c1524cl2 = new C2645xt(0, abstractC0102C);
            } else {
                c1524cl2 = new C1524cl(z2 ? 1 : 0, z2 ? 1 : 0, abstractC0102C, z2);
            }
            c2551w.m4371z(c1524cl2);
        }
        boolean z3 = this.f8421U;
        AbstractC0102C abstractC0102C2 = this.f8427y;
        if (abstractC0102C2 != null) {
            int i = 1;
            if (z3) {
                c1524cl = new C2645xt(1, abstractC0102C2);
            } else {
                c1524cl = new C1524cl(i, z2 ? 1 : 0, abstractC0102C2, z2);
            }
            c2551w.m4371z(c1524cl);
        }
        c2551w.m4371z(this.f8418I);
        if (c1987lO.f6162w && !this.f8424q && !this.f8423k && !z3 && !z) {
            return new C0423I1(c2551w);
        }
        return new C0622Lh(c2551w);
    }

    public C2692yp(C0152Cy c0152Cy, C1987lO c1987lO, C0448IW c0448iw, C0448IW c0448iw2, C2420ta c2420ta) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C2339s c2339s;
        int i = 1;
        if (c0448iw != null) {
            C0261F c0261f = new C0261F(i, c0448iw);
            z = false;
            z2 = false;
            z3 = false;
            while (c0261f.hasMoreElements()) {
                Object nextElement = c0261f.nextElement();
                if (nextElement instanceof AbstractC1857j) {
                    int i2 = AbstractC1857j.m3472s(nextElement).f5794w;
                    if (i2 == 1) {
                        z3 = true;
                    } else if (i2 == 2) {
                        z2 = true;
                    } else if (i2 == 3) {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        if (z) {
            c2339s = new C2339s(5L);
        } else {
            if (c0448iw2 != null) {
                C0261F c0261f2 = new C0261F(i, c0448iw2);
                z4 = false;
                while (c0261f2.hasMoreElements()) {
                    if (c0261f2.nextElement() instanceof AbstractC1857j) {
                        z4 = true;
                    }
                }
            } else {
                z4 = false;
            }
            if (z4) {
                c2339s = f8415Y;
            } else if (z2) {
                c2339s = f8417r;
            } else {
                if (!z3) {
                    C0261F c0261f3 = new C0261F(i, c2420ta);
                    while (true) {
                        if (!c0261f3.hasMoreElements()) {
                            i = 0;
                            break;
                        } else {
                            Object nextElement2 = c0261f3.nextElement();
                            if ((nextElement2 instanceof C1067U1 ? (C1067U1) nextElement2 : nextElement2 != null ? new C1067U1(AbstractC1333Z.m2714U(nextElement2)) : null).f3526S.m3998s(3)) {
                                break;
                            }
                        }
                    }
                    if (i == 0 && InterfaceC0141Cj.f489h.m3068I(c1987lO.f6161S)) {
                        c2339s = f8414E;
                    }
                }
                c2339s = f8416f;
            }
        }
        this.f8420S = c2339s;
        this.f8419R = c0152Cy;
        this.f8426w = c1987lO;
        this.f8422g = c0448iw;
        this.f8427y = c0448iw2;
        this.f8418I = c2420ta;
        this.f8424q = c0152Cy instanceof C0448IW;
        this.f8421U = c0448iw2 instanceof C0448IW;
        this.f8425s = c0448iw instanceof C0448IW;
        this.f8423k = c2420ta instanceof C0448IW;
    }
}
