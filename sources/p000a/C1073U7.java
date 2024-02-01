package p000a;

/* renamed from: a.U7 */
/* loaded from: classes.dex */
public final class C1073U7 implements InterfaceC0656MP {

    /* renamed from: S */
    public final /* synthetic */ C2192pI f3540S;

    public C1073U7(C2192pI c2192pI, int i) {
        if (i != 1) {
            this.f3540S = c2192pI;
        } else {
            this.f3540S = c2192pI;
        }
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: v */
    public final boolean mo1242v(C2189pE c2189pE) {
        C2192pI c2192pI = this.f3540S;
        if (c2189pE == c2192pI.f6748w) {
            return false;
        }
        c2192pI.f6744p = ((SubMenuC1188WE) c2189pE).f3866J.f3653z;
        InterfaceC0656MP interfaceC0656MP = c2192pI.f6745q;
        if (interfaceC0656MP == null) {
            return false;
        }
        return interfaceC0656MP.mo1242v(c2189pE);
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: z */
    public final void mo1243z(C2189pE c2189pE, boolean z) {
        if (c2189pE instanceof SubMenuC1188WE) {
            c2189pE.mo2451M().m3804v(false);
        }
        InterfaceC0656MP interfaceC0656MP = this.f3540S.f6745q;
        if (interfaceC0656MP != null) {
            interfaceC0656MP.mo1243z(c2189pE, z);
        }
    }
}
