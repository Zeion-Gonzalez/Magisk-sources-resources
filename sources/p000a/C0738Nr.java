package p000a;

/* renamed from: a.Nr */
/* loaded from: classes.dex */
public final class C0738Nr implements InterfaceC2374sf {

    /* renamed from: R */
    public int f2512R;

    /* renamed from: S */
    public C1336Z2 f2513S;

    /* renamed from: g */
    public final /* synthetic */ DialogC2727zU f2514g;

    /* renamed from: q */
    public boolean f2516q;

    /* renamed from: w */
    public String f2517w = "";

    /* renamed from: I */
    public boolean f2511I = true;

    /* renamed from: k */
    public InterfaceC2364sT f2515k = C2463uP.f7559I;

    public C0738Nr(DialogC2727zU dialogC2727zU) {
        this.f2514g = dialogC2727zU;
    }

    /* renamed from: N */
    public final boolean m1708N() {
        boolean z;
        if (this.f2512R != 0) {
            return false;
        }
        if (this.f2517w.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // p000a.InterfaceC0281FL
    /* renamed from: P */
    public final void mo578P(AbstractC1965ky abstractC1965ky) {
        AbstractC0795Op.m1832UZ(this, abstractC1965ky);
    }

    @Override // p000a.InterfaceC2374sf
    /* renamed from: Q */
    public final void mo1709Q(int i) {
        AbstractC0795Op.m1801B(this, i);
    }

    /* renamed from: W */
    public final void m1710W(Object obj) {
        if (obj instanceof Integer) {
            obj = this.f2514g.getContext().getText(((Number) obj).intValue());
        }
        String obj2 = obj.toString();
        int[] iArr = {24, 12};
        if (!AbstractC1292YB.m2695u(this.f2517w, obj2)) {
            this.f2517w = obj2;
            for (int i = 0; i < 2; i++) {
                AbstractC0795Op.m1801B(this, iArr[i]);
            }
        }
    }

    /* renamed from: h */
    public final void m1711h() {
        InterfaceC2364sT interfaceC2364sT = this.f2515k;
        DialogC2727zU dialogC2727zU = this.f2514g;
        interfaceC2364sT.mo85W(dialogC2727zU);
        if (!this.f2516q) {
            dialogC2727zU.dismiss();
        }
    }

    @Override // p000a.InterfaceC2374sf
    /* renamed from: o */
    public final void mo1712o(C1336Z2 c1336z2) {
        this.f2513S = c1336z2;
    }

    /* renamed from: u */
    public final void m1713u(int i) {
        int[] iArr = {15, 12};
        if (this.f2512R != i) {
            this.f2512R = i;
            for (int i2 = 0; i2 < 2; i2++) {
                mo1709Q(iArr[i2]);
            }
        }
    }

    @Override // p000a.InterfaceC2374sf
    /* renamed from: v */
    public final C1336Z2 mo1714v() {
        return this.f2513S;
    }

    @Override // p000a.InterfaceC0281FL
    /* renamed from: z */
    public final void mo579z(AbstractC1965ky abstractC1965ky) {
        AbstractC0795Op.m1878z(this, abstractC1965ky);
    }
}
