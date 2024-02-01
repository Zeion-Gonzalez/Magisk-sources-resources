package p000a;

/* renamed from: a.ht */
/* loaded from: classes.dex */
public final class C1800ht extends AbstractC0209E {

    /* renamed from: g */
    public static final C2339s f5655g;

    /* renamed from: k */
    public static final C2074n2 f5656k;

    /* renamed from: q */
    public static final C2074n2 f5657q;

    /* renamed from: y */
    public static final C2339s f5658y;

    /* renamed from: I */
    public final C2339s f5659I;

    /* renamed from: R */
    public final C2074n2 f5660R;

    /* renamed from: S */
    public final C2074n2 f5661S;

    /* renamed from: w */
    public final C2339s f5662w;

    static {
        C2074n2 c2074n2 = new C2074n2(InterfaceC1455bJ.f4537N, C1618eR.f5003S);
        f5657q = c2074n2;
        f5656k = new C2074n2(InterfaceC0237EV.f816u, c2074n2);
        f5655g = new C2339s(20L);
        f5658y = new C2339s(1L);
    }

    public C1800ht(AbstractC1333Z abstractC1333Z) {
        this.f5661S = f5657q;
        this.f5660R = f5656k;
        this.f5662w = f5655g;
        this.f5659I = f5658y;
        for (int i = 0; i != abstractC1333Z.size(); i++) {
            AbstractC1857j abstractC1857j = (AbstractC1857j) abstractC1333Z.mo142E(i);
            int i2 = abstractC1857j.f5794w;
            if (i2 == 0) {
                this.f5661S = C2074n2.m3693V((AbstractC1333Z) AbstractC1333Z.f4223R.m442W(abstractC1857j, true));
            } else if (i2 == 1) {
                this.f5660R = C2074n2.m3693V((AbstractC1333Z) AbstractC1333Z.f4223R.m442W(abstractC1857j, true));
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalArgumentException("unknown tag");
                }
                this.f5659I = (C2339s) C2339s.f7177w.m442W(abstractC1857j, true);
            } else {
                this.f5662w = (C2339s) C2339s.f7177w.m442W(abstractC1857j, true);
            }
        }
    }

    /* renamed from: V */
    public static C1800ht m3355V(InterfaceC0959S interfaceC0959S) {
        if (interfaceC0959S instanceof C1800ht) {
            return (C1800ht) interfaceC0959S;
        }
        if (interfaceC0959S != null) {
            return new C1800ht(AbstractC1333Z.m2714U(interfaceC0959S));
        }
        return null;
    }

    @Override // p000a.InterfaceC0959S
    /* renamed from: N */
    public final AbstractC1593e mo302N() {
        C2551w c2551w = new C2551w(4);
        C2074n2 c2074n2 = f5657q;
        C2074n2 c2074n22 = this.f5661S;
        int i = 0;
        boolean z = true;
        if (!c2074n22.equals(c2074n2)) {
            c2551w.m4371z(new C1524cl(i, i, c2074n22, z));
        }
        C2074n2 c2074n23 = f5656k;
        C2074n2 c2074n24 = this.f5660R;
        if (!c2074n24.equals(c2074n23)) {
            c2551w.m4371z(new C1524cl(z ? 1 : 0, i, c2074n24, z));
        }
        C2339s c2339s = f5655g;
        C2339s c2339s2 = this.f5662w;
        if (!c2339s2.m3068I(c2339s)) {
            c2551w.m4371z(new C1524cl(2, i, c2339s2, z));
        }
        C2339s c2339s3 = f5658y;
        C2339s c2339s4 = this.f5659I;
        if (!c2339s4.m3068I(c2339s3)) {
            c2551w.m4371z(new C1524cl(3, i, c2339s4, z));
        }
        return new C1802hw(c2551w);
    }

    public C1800ht(C2074n2 c2074n2, C2074n2 c2074n22, C2339s c2339s, C2339s c2339s2) {
        this.f5661S = c2074n2;
        this.f5660R = c2074n22;
        this.f5662w = c2339s;
        this.f5659I = c2339s2;
    }
}
