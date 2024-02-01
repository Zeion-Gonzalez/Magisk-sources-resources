package p000a;

/* renamed from: a.he */
/* loaded from: classes.dex */
public final class C1788he extends AbstractC1500cH {
    public C1788he() {
        super((Object) null);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: E */
    public final void mo137E(C1590dx c1590dx, Thread thread) {
        c1590dx.f4883z = thread;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: N */
    public final boolean mo138N(AbstractFutureC1350ZH abstractFutureC1350ZH, Object obj, Object obj2) {
        synchronized (abstractFutureC1350ZH) {
            if (abstractFutureC1350ZH.f4251z != obj) {
                return false;
            }
            abstractFutureC1350ZH.f4251z = obj2;
            return true;
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: P */
    public final boolean mo139P(AbstractFutureC1350ZH abstractFutureC1350ZH, C1074U8 c1074u8) {
        C1074U8 c1074u82 = C1074U8.f3541h;
        synchronized (abstractFutureC1350ZH) {
            if (abstractFutureC1350ZH.f4249h == c1074u8) {
                abstractFutureC1350ZH.f4249h = c1074u82;
                return true;
            }
            return false;
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: Q */
    public final boolean mo140Q(AbstractFutureC1350ZH abstractFutureC1350ZH, C1590dx c1590dx, C1590dx c1590dx2) {
        synchronized (abstractFutureC1350ZH) {
            if (abstractFutureC1350ZH.f4250v != c1590dx) {
                return false;
            }
            abstractFutureC1350ZH.f4250v = c1590dx2;
            return true;
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: U */
    public final void mo141U(C1590dx c1590dx, C1590dx c1590dx2) {
        c1590dx.f4882h = c1590dx2;
    }
}
