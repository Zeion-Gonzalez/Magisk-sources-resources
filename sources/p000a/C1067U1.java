package p000a;

import java.util.Enumeration;

/* renamed from: a.U1 */
/* loaded from: classes.dex */
public final class C1067U1 extends AbstractC0209E {

    /* renamed from: I */
    public final AbstractC0102C f3524I;

    /* renamed from: R */
    public final C1130V9 f3525R;

    /* renamed from: S */
    public final C2339s f3526S;

    /* renamed from: g */
    public final AbstractC0102C f3527g;

    /* renamed from: k */
    public final AbstractC0477J f3528k;

    /* renamed from: q */
    public final C2074n2 f3529q;

    /* renamed from: w */
    public final C2074n2 f3530w;

    public C1067U1(AbstractC1333Z abstractC1333Z) {
        C1130V9 c1130v9;
        Enumeration mo147f = abstractC1333Z.mo147f();
        this.f3526S = (C2339s) mo147f.nextElement();
        Object nextElement = mo147f.nextElement();
        if (nextElement == null || (nextElement instanceof C1130V9)) {
            c1130v9 = (C1130V9) nextElement;
        } else if (nextElement instanceof C0927RR) {
            c1130v9 = new C1130V9((C0927RR) nextElement);
        } else if (nextElement instanceof AbstractC0477J) {
            c1130v9 = new C1130V9((AbstractC0477J) nextElement);
        } else {
            if (!(nextElement instanceof AbstractC1593e)) {
                throw new IllegalArgumentException("Illegal object in SignerIdentifier: ".concat(nextElement.getClass().getName()));
            }
            c1130v9 = new C1130V9((AbstractC1593e) nextElement);
        }
        this.f3525R = c1130v9;
        this.f3530w = C2074n2.m3693V(mo147f.nextElement());
        Object nextElement2 = mo147f.nextElement();
        if (nextElement2 instanceof AbstractC1857j) {
            this.f3524I = (AbstractC0102C) AbstractC0102C.f386w.m442W((AbstractC1857j) nextElement2, false);
            nextElement2 = mo147f.nextElement();
        } else {
            this.f3524I = null;
        }
        this.f3529q = C2074n2.m3693V(nextElement2);
        this.f3528k = AbstractC0477J.m1154y(mo147f.nextElement());
        if (!mo147f.hasMoreElements()) {
            this.f3527g = null;
        } else {
            this.f3527g = (AbstractC0102C) AbstractC0102C.f386w.m442W((AbstractC1857j) mo147f.nextElement(), false);
        }
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(7);
        c2551w.m4371z(this.f3526S);
        c2551w.m4371z(this.f3525R);
        c2551w.m4371z(this.f3530w);
        boolean z = false;
        AbstractC0102C abstractC0102C = this.f3524I;
        if (abstractC0102C != null) {
            c2551w.m4371z(new C1524cl(z ? 1 : 0, z ? 1 : 0, abstractC0102C, z));
        }
        c2551w.m4371z(this.f3529q);
        c2551w.m4371z(this.f3528k);
        AbstractC0102C abstractC0102C2 = this.f3527g;
        if (abstractC0102C2 != null) {
            c2551w.m4371z(new C1524cl(1, z ? 1 : 0, abstractC0102C2, z));
        }
        return new C1802hw(c2551w);
    }

    public C1067U1(C1130V9 c1130v9, C2074n2 c2074n2, C2420ta c2420ta, C2074n2 c2074n22, C1745gp c1745gp, C2420ta c2420ta2) {
        this.f3526S = c1130v9.f3680S instanceof AbstractC1857j ? new C2339s(3L) : new C2339s(1L);
        this.f3525R = c1130v9;
        this.f3530w = c2074n2;
        this.f3524I = c2420ta;
        this.f3529q = c2074n22;
        this.f3528k = c1745gp;
        this.f3527g = c2420ta2;
    }
}
