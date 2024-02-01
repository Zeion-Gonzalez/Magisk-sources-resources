package p000a;

/* renamed from: a.jH */
/* loaded from: classes.dex */
public final class C1872jH extends AbstractC1911jx {

    /* renamed from: h */
    public final C0003A3 f5845h;

    /* renamed from: v */
    public final Object f5846v;

    /* renamed from: z */
    public final /* synthetic */ int f5847z = 0;

    public C1872jH(C0003A3 c0003a3, C1623eY c1623eY) {
        this.f5845h = c0003a3;
        this.f5846v = c1623eY;
    }

    @Override // p000a.AbstractC1911jx
    /* renamed from: h */
    public final C0003A3 mo77h() {
        return this.f5845h;
    }

    @Override // p000a.AbstractC1911jx
    /* renamed from: v */
    public final void mo78v(InterfaceC1432as interfaceC1432as) {
        int i = this.f5847z;
        Object obj = this.f5846v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                interfaceC1432as.mo936D((C1623eY) obj);
                return;
            default:
                ((AbstractC1911jx) obj).mo78v(interfaceC1432as);
                return;
        }
    }

    @Override // p000a.AbstractC1911jx
    /* renamed from: z */
    public final long mo79z() {
        int i = this.f5847z;
        Object obj = this.f5846v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((C1623eY) obj).mo1980P();
            default:
                return ((AbstractC1911jx) obj).mo79z();
        }
    }

    public C1872jH(AbstractC1911jx abstractC1911jx, C0003A3 c0003a3) {
        this.f5846v = abstractC1911jx;
        this.f5845h = c0003a3;
    }
}
