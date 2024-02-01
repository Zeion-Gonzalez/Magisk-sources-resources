package p000a;

/* renamed from: a.t7 */
/* loaded from: classes.dex */
public final class C2396t7 extends AbstractC2392t {

    /* renamed from: h */
    public String f7327h;

    /* renamed from: v */
    public final StringBuilder f7328v;

    /* renamed from: z */
    public final C1754gy f7329z;

    public C2396t7(char c, int i, int i2) {
        C1754gy c1754gy = new C1754gy();
        this.f7329z = c1754gy;
        this.f7328v = new StringBuilder();
        c1754gy.f5527Q = c;
        c1754gy.f5530u = i;
        c1754gy.f5529o = i2;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: P */
    public final AbstractC0883Qb mo39P() {
        return this.f7329z;
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: u */
    public final C1253XQ mo41u(InterfaceC1036TR interfaceC1036TR) {
        boolean z;
        C1858j0 c1858j0 = (C1858j0) interfaceC1036TR;
        int i = c1858j0.f5799N;
        int i2 = c1858j0.f5806h;
        CharSequence charSequence = c1858j0.f5811z;
        int i3 = c1858j0.f5808u;
        C1754gy c1754gy = this.f7329z;
        boolean z2 = false;
        if (i3 < 4) {
            char c = c1754gy.f5527Q;
            int i4 = c1754gy.f5530u;
            int m3421Pm = AbstractC1843ih.m3421Pm(c, charSequence, i, charSequence.length()) - i;
            if (m3421Pm >= i4 && AbstractC1843ih.m3408G5(charSequence, i + m3421Pm, charSequence.length()) == charSequence.length()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            return new C1253XQ(-1, -1, true);
        }
        int length = charSequence.length();
        for (int i5 = c1754gy.f5529o; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return C1253XQ.m2558z(i2);
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: v */
    public final void mo42v() {
        String m720z = AbstractC0323GC.m720z(this.f7327h.trim());
        C1754gy c1754gy = this.f7329z;
        c1754gy.f5528W = m720z;
        c1754gy.f5526G = this.f7328v.toString();
    }

    @Override // p000a.AbstractC2392t
    /* renamed from: z */
    public final void mo43z(CharSequence charSequence) {
        if (this.f7327h == null) {
            this.f7327h = charSequence.toString();
            return;
        }
        StringBuilder sb = this.f7328v;
        sb.append(charSequence);
        sb.append('\n');
    }
}
