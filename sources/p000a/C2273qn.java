package p000a;

import java.util.RandomAccess;

/* renamed from: a.qn */
/* loaded from: classes.dex */
public final class C2273qn extends AbstractC0386HL implements RandomAccess {

    /* renamed from: R */
    public final int f6988R;

    /* renamed from: S */
    public final AbstractC0386HL f6989S;

    /* renamed from: w */
    public final int f6990w;

    public C2273qn(AbstractC0386HL abstractC0386HL, int i, int i2) {
        this.f6989S = abstractC0386HL;
        this.f6988R = i;
        C0054B3.m100v(i, i2, abstractC0386HL.mo26h());
        this.f6990w = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C0054B3.m101z(i, this.f6990w);
        return this.f6989S.get(this.f6988R + i);
    }

    @Override // p000a.AbstractC0530K
    /* renamed from: h */
    public final int mo26h() {
        return this.f6990w;
    }
}
