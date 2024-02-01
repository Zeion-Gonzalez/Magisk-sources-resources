package p000a;

/* renamed from: a.Ka */
/* loaded from: classes.dex */
public final class C0563Ka implements InterfaceC2491ux {

    /* renamed from: R */
    public static final C1623eY f1834R;

    /* renamed from: S */
    public final AbstractC1235X4 f1835S;

    static {
        C1623eY c1623eY = C1623eY.f5009I;
        f1834R = C2252qQ.m3882G("EFBBBF");
    }

    public C0563Ka(AbstractC1235X4 abstractC1235X4) {
        this.f1835S = abstractC1235X4;
    }

    @Override // p000a.InterfaceC2491ux
    /* renamed from: P */
    public final Object mo329P(Object obj) {
        AbstractC1449bB abstractC1449bB = (AbstractC1449bB) obj;
        InterfaceC0694N7 mo1577G = abstractC1449bB.mo1577G();
        try {
            if (mo1577G.mo1628n(f1834R)) {
                mo1577G.mo1632r(r1.f5011S.length);
            }
            C2326rl c2326rl = new C2326rl(mo1577G);
            Object mo1115z = this.f1835S.mo1115z(c2326rl);
            if (c2326rl.mo2100he() == 10) {
                return mo1115z;
            }
            throw new C1237X6("JSON document was not fully consumed.");
        } finally {
            abstractC1449bB.close();
        }
    }
}
