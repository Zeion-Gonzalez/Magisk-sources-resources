package p000a;

/* renamed from: a.bT */
/* loaded from: classes.dex */
public abstract class AbstractC1462bT {

    /* renamed from: z */
    public AbstractC1462bT f4557z = null;

    /* renamed from: h */
    public AbstractC1462bT f4555h = null;

    /* renamed from: v */
    public AbstractC1462bT f4556v = null;

    /* renamed from: P */
    public AbstractC1462bT f4554P = null;

    /* renamed from: N */
    public AbstractC1462bT f4553N = null;

    /* renamed from: N */
    public String mo2873N() {
        return "";
    }

    /* renamed from: P */
    public void mo2028P(AbstractC1462bT abstractC1462bT) {
        this.f4557z = abstractC1462bT;
    }

    /* renamed from: Q */
    public final void m2874Q() {
        AbstractC1462bT abstractC1462bT = this.f4554P;
        if (abstractC1462bT != null) {
            abstractC1462bT.f4553N = this.f4553N;
        } else {
            AbstractC1462bT abstractC1462bT2 = this.f4557z;
            if (abstractC1462bT2 != null) {
                abstractC1462bT2.f4555h = this.f4553N;
            }
        }
        AbstractC1462bT abstractC1462bT3 = this.f4553N;
        if (abstractC1462bT3 != null) {
            abstractC1462bT3.f4554P = abstractC1462bT;
        } else {
            AbstractC1462bT abstractC1462bT4 = this.f4557z;
            if (abstractC1462bT4 != null) {
                abstractC1462bT4.f4556v = abstractC1462bT;
            }
        }
        this.f4557z = null;
        this.f4553N = null;
        this.f4554P = null;
    }

    /* renamed from: h */
    public final void m2875h(AbstractC1462bT abstractC1462bT) {
        abstractC1462bT.m2874Q();
        abstractC1462bT.mo2028P(this);
        AbstractC1462bT abstractC1462bT2 = this.f4556v;
        if (abstractC1462bT2 != null) {
            abstractC1462bT2.f4553N = abstractC1462bT;
            abstractC1462bT.f4554P = abstractC1462bT2;
        } else {
            this.f4555h = abstractC1462bT;
        }
        this.f4556v = abstractC1462bT;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + mo2873N() + "}";
    }

    /* renamed from: v */
    public AbstractC1462bT mo2029v() {
        return this.f4557z;
    }

    /* renamed from: z */
    public abstract void mo60z(InterfaceC1964kx interfaceC1964kx);
}
