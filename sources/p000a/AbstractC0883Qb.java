package p000a;

/* renamed from: a.Qb */
/* loaded from: classes.dex */
public abstract class AbstractC0883Qb extends AbstractC1462bT {
    @Override // p000a.AbstractC1462bT
    /* renamed from: P */
    public final void mo2028P(AbstractC1462bT abstractC1462bT) {
        if (abstractC1462bT instanceof AbstractC0883Qb) {
            this.f4557z = abstractC1462bT;
            return;
        }
        throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
    }

    @Override // p000a.AbstractC1462bT
    /* renamed from: v */
    public final AbstractC1462bT mo2029v() {
        return (AbstractC0883Qb) this.f4557z;
    }
}
