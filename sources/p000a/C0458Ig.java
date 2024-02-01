package p000a;

/* renamed from: a.Ig */
/* loaded from: classes.dex */
public final class C0458Ig extends AbstractC1235X4 {

    /* renamed from: z */
    public final AbstractC1235X4 f1544z;

    public C0458Ig(AbstractC1235X4 abstractC1235X4) {
        this.f1544z = abstractC1235X4;
    }

    public final String toString() {
        return this.f1544z + ".nullSafe()";
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        if (obj == null) {
            abstractC2626xP.mo3926y();
        } else {
            this.f1544z.mo1114v(abstractC2626xP, obj);
        }
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final Object mo1115z(AbstractC0932RY abstractC0932RY) {
        if (abstractC0932RY.mo2100he() != 9) {
            return this.f1544z.mo1115z(abstractC0932RY);
        }
        abstractC0932RY.mo2095U8();
        return null;
    }
}
