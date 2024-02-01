package p000a;

import java.util.ArrayList;

/* renamed from: a.a2 */
/* loaded from: classes.dex */
public abstract class AbstractC1389a2 extends C1628ed implements InterfaceC0617Lb {

    /* renamed from: Pm */
    public C1628ed[] f4325Pm = new C1628ed[4];

    /* renamed from: oI */
    public int f4326oI = 0;

    /* renamed from: i */
    public final void m2779i(int i, C0368H0 c0368h0, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f4326oI; i2++) {
            C1628ed c1628ed = this.f4325Pm[i2];
            ArrayList arrayList2 = c0368h0.f1273z;
            if (!arrayList2.contains(c1628ed)) {
                arrayList2.add(c1628ed);
            }
        }
        for (int i3 = 0; i3 < this.f4326oI; i3++) {
            AbstractC1843ih.m3458r(this.f4325Pm[i3], i, arrayList, c0368h0);
        }
    }

    @Override // p000a.InterfaceC0617Lb
    /* renamed from: z */
    public void mo1386z() {
    }
}
