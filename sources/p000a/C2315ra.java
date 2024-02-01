package p000a;

import java.io.IOException;

/* renamed from: a.ra */
/* loaded from: classes.dex */
public final class C2315ra implements InterfaceC2135oG {

    /* renamed from: N */
    public final /* synthetic */ C1284Y2 f7133N;

    /* renamed from: P */
    public boolean f7134P;

    /* renamed from: h */
    public final InterfaceC2578wb f7135h;

    /* renamed from: v */
    public final C0453Ib f7136v;

    /* renamed from: z */
    public final C1570dX f7137z;

    public C2315ra(C1284Y2 c1284y2, C1570dX c1570dX) {
        this.f7133N = c1284y2;
        this.f7137z = c1570dX;
        InterfaceC2578wb m3035P = c1570dX.m3035P(1);
        this.f7135h = m3035P;
        this.f7136v = new C0453Ib(c1284y2, this, m3035P);
    }

    /* renamed from: z */
    public final void m3974z() {
        synchronized (this.f7133N) {
            if (this.f7134P) {
                return;
            }
            this.f7134P = true;
            AbstractC1181W6.m2430v(this.f7135h);
            try {
                this.f7137z.m3038z();
            } catch (IOException unused) {
            }
        }
    }
}
