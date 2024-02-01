package p000a;

/* renamed from: a.av */
/* loaded from: classes.dex */
public abstract class AbstractC1434av implements InterfaceC0281FL {

    /* renamed from: S */
    public transient C1336Z2 f4490S;

    @Override // p000a.InterfaceC0281FL
    /* renamed from: P */
    public final void mo578P(AbstractC1965ky abstractC1965ky) {
        synchronized (this) {
            C1336Z2 c1336z2 = this.f4490S;
            if (c1336z2 == null) {
                return;
            }
            c1336z2.m923u(abstractC1965ky);
        }
    }

    /* renamed from: Q */
    public final void m2861Q(int i) {
        synchronized (this) {
            C1336Z2 c1336z2 = this.f4490S;
            if (c1336z2 == null) {
                return;
            }
            c1336z2.mo920P(this, i, null);
        }
    }

    @Override // p000a.InterfaceC0281FL
    /* renamed from: z */
    public final void mo579z(AbstractC1965ky abstractC1965ky) {
        synchronized (this) {
            if (this.f4490S == null) {
                this.f4490S = new C1336Z2();
            }
        }
        this.f4490S.m925z(abstractC1965ky);
    }
}
