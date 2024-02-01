package p000a;

/* renamed from: a.HI */
/* loaded from: classes.dex */
public final class C0383HI implements InterfaceC0384HJ {

    /* renamed from: S */
    public final InterfaceC0384HJ f1303S;

    /* renamed from: R */
    public int f1302R = 0;

    /* renamed from: w */
    public int f1305w = -1;

    /* renamed from: I */
    public int f1301I = -1;

    /* renamed from: q */
    public Object f1304q = null;

    public C0383HI(InterfaceC0384HJ interfaceC0384HJ) {
        this.f1303S = interfaceC0384HJ;
    }

    @Override // p000a.InterfaceC0384HJ
    /* renamed from: N */
    public final void mo872N(int i, int i2, Object obj) {
        int i3;
        if (this.f1302R == 3) {
            int i4 = this.f1305w;
            int i5 = this.f1301I;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f1304q == obj) {
                this.f1305w = Math.min(i, i4);
                this.f1301I = Math.max(i5 + i4, i3) - this.f1305w;
                return;
            }
        }
        m876z();
        this.f1305w = i;
        this.f1301I = i2;
        this.f1304q = obj;
        this.f1302R = 3;
    }

    @Override // p000a.InterfaceC0384HJ
    /* renamed from: P */
    public final void mo873P(int i, int i2) {
        m876z();
        this.f1303S.mo873P(i, i2);
    }

    @Override // p000a.InterfaceC0384HJ
    /* renamed from: h */
    public final void mo874h(int i, int i2) {
        int i3;
        if (this.f1302R == 2 && (i3 = this.f1305w) >= i && i3 <= i + i2) {
            this.f1301I += i2;
            this.f1305w = i;
        } else {
            m876z();
            this.f1305w = i;
            this.f1301I = i2;
            this.f1302R = 2;
        }
    }

    @Override // p000a.InterfaceC0384HJ
    /* renamed from: v */
    public final void mo875v(int i, int i2) {
        int i3;
        if (this.f1302R == 1 && i >= (i3 = this.f1305w)) {
            int i4 = this.f1301I;
            if (i <= i3 + i4) {
                this.f1301I = i4 + i2;
                this.f1305w = Math.min(i, i3);
                return;
            }
        }
        m876z();
        this.f1305w = i;
        this.f1301I = i2;
        this.f1302R = 1;
    }

    /* renamed from: z */
    public final void m876z() {
        int i = this.f1302R;
        if (i == 0) {
            return;
        }
        InterfaceC0384HJ interfaceC0384HJ = this.f1303S;
        if (i == 1) {
            interfaceC0384HJ.mo875v(this.f1305w, this.f1301I);
        } else if (i == 2) {
            interfaceC0384HJ.mo874h(this.f1305w, this.f1301I);
        } else if (i == 3) {
            interfaceC0384HJ.mo872N(this.f1305w, this.f1301I, this.f1304q);
        }
        this.f1304q = null;
        this.f1302R = 0;
    }
}
