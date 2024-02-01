package p000a;

import java.util.Enumeration;

/* renamed from: a.PU */
/* loaded from: classes.dex */
public final class C0830PU extends AbstractC0209E {

    /* renamed from: I */
    public final AbstractC0102C f2811I;

    /* renamed from: R */
    public final C2074n2 f2812R;

    /* renamed from: S */
    public final C2339s f2813S;

    /* renamed from: q */
    public final AbstractC1176W f2814q;

    /* renamed from: w */
    public final AbstractC0477J f2815w;

    public C0830PU(AbstractC1333Z abstractC1333Z) {
        Enumeration mo147f = abstractC1333Z.mo147f();
        C2339s m3996y = C2339s.m3996y(mo147f.nextElement());
        this.f2813S = m3996y;
        int m3997U = m3996y.m3997U();
        if (m3997U >= 0 && m3997U <= 1) {
            this.f2812R = C2074n2.m3693V(mo147f.nextElement());
            this.f2815w = AbstractC0477J.m1154y(mo147f.nextElement());
            int i = -1;
            while (mo147f.hasMoreElements()) {
                AbstractC1857j abstractC1857j = (AbstractC1857j) mo147f.nextElement();
                int i2 = abstractC1857j.f5794w;
                if (i2 > i) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            if (m3997U >= 1) {
                                this.f2814q = (AbstractC1176W) AbstractC1176W.f3832R.m442W(abstractC1857j, false);
                            } else {
                                throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                            }
                        } else {
                            throw new IllegalArgumentException("unknown optional field in private key info");
                        }
                    } else {
                        this.f2811I = (AbstractC0102C) AbstractC0102C.f386w.m442W(abstractC1857j, false);
                    }
                    i = i2;
                } else {
                    throw new IllegalArgumentException("invalid optional field in private key info");
                }
            }
            return;
        }
        throw new IllegalArgumentException("invalid version for private key info");
    }

    /* renamed from: V */
    public static C0830PU m1932V(Object obj) {
        if (obj instanceof C0830PU) {
            return (C0830PU) obj;
        }
        if (obj != null) {
            return new C0830PU(AbstractC1333Z.m2714U(obj));
        }
        return null;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(5);
        c2551w.m4371z(this.f2813S);
        c2551w.m4371z(this.f2812R);
        c2551w.m4371z(this.f2815w);
        boolean z = false;
        AbstractC0102C abstractC0102C = this.f2811I;
        if (abstractC0102C != null) {
            c2551w.m4371z(new C1524cl(z ? 1 : 0, z ? 1 : 0, abstractC0102C, z));
        }
        AbstractC1176W abstractC1176W = this.f2814q;
        if (abstractC1176W != null) {
            c2551w.m4371z(new C1524cl(1, z ? 1 : 0, abstractC1176W, z));
        }
        return new C1802hw(c2551w);
    }
}
