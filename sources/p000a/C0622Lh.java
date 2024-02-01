package p000a;

/* renamed from: a.Lh */
/* loaded from: classes.dex */
public final class C0622Lh extends AbstractC1333Z {
    @Override // p000a.AbstractC1333Z
    /* renamed from: J */
    public final AbstractC0102C mo143J() {
        return new C0448IW(this.f4224S);
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m339V(z, 48, this.f4224S);
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: Y */
    public final AbstractC0477J mo145Y() {
        return new C1787hb(m2715s());
    }

    @Override // p000a.AbstractC1333Z
    /* renamed from: r */
    public final AbstractC1176W mo150r() {
        return new C1400aG(m2716y());
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        int i = z ? 4 : 3;
        int length = this.f4224S.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.f4224S[i2].mo302N().mo151w(true);
        }
        return i;
    }
}
