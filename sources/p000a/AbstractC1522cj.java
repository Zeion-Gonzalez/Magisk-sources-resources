package p000a;

/* renamed from: a.cj */
/* loaded from: classes.dex */
public abstract class AbstractC1522cj {

    /* renamed from: h */
    public C2739zj[] f4700h;

    /* renamed from: z */
    public final C2621xJ f4701z;

    public AbstractC1522cj() {
        this(new C2621xJ());
    }

    /* renamed from: N */
    public abstract void mo2375N(C2739zj c2739zj);

    /* renamed from: P */
    public void mo2376P(C2739zj c2739zj) {
    }

    /* renamed from: Q */
    public void mo2377Q(C2739zj c2739zj) {
    }

    /* renamed from: h */
    public abstract C2621xJ mo2378h();

    /* renamed from: o */
    public void mo2379o(C2739zj c2739zj) {
    }

    /* renamed from: u */
    public abstract void mo2380u(C2739zj c2739zj);

    /* renamed from: v */
    public void mo2049v(int i, C2739zj c2739zj) {
        if (this.f4700h == null) {
            this.f4700h = new C2739zj[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f4700h[AbstractC1843ih.m3425T(i2)] = c2739zj;
            }
        }
    }

    /* renamed from: z */
    public final void m2946z() {
        C2739zj[] c2739zjArr = this.f4700h;
        if (c2739zjArr != null) {
            C2739zj c2739zj = c2739zjArr[AbstractC1843ih.m3425T(1)];
            C2739zj c2739zj2 = this.f4700h[AbstractC1843ih.m3425T(2)];
            C2621xJ c2621xJ = this.f4701z;
            if (c2739zj2 == null) {
                c2739zj2 = c2621xJ.m4520z(2);
            }
            if (c2739zj == null) {
                c2739zj = c2621xJ.m4520z(1);
            }
            mo2380u(C2739zj.m4675z(c2739zj, c2739zj2));
            C2739zj c2739zj3 = this.f4700h[AbstractC1843ih.m3425T(16)];
            if (c2739zj3 != null) {
                mo2377Q(c2739zj3);
            }
            C2739zj c2739zj4 = this.f4700h[AbstractC1843ih.m3425T(32)];
            if (c2739zj4 != null) {
                mo2376P(c2739zj4);
            }
            C2739zj c2739zj5 = this.f4700h[AbstractC1843ih.m3425T(64)];
            if (c2739zj5 != null) {
                mo2379o(c2739zj5);
            }
        }
    }

    public AbstractC1522cj(C2621xJ c2621xJ) {
        this.f4701z = c2621xJ;
    }
}
