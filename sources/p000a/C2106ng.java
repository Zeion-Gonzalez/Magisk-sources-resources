package p000a;

/* renamed from: a.ng */
/* loaded from: classes.dex */
public final class C2106ng implements InterfaceC1576dd {

    /* renamed from: R */
    public final int f6503R;

    /* renamed from: S */
    public final String f6504S;

    /* renamed from: w */
    public Integer f6505w;

    public C2106ng(int i, String str) {
        this.f6504S = str;
        this.f6503R = i;
    }

    /* renamed from: h */
    public final void m3733h(InterfaceC0806P1 interfaceC0806P1, int i) {
        synchronized (this) {
            this.f6505w = Integer.valueOf(i);
        }
        AbstractC0438II.m994F(C0843Pi.f2844S, null, new C1043TZ(interfaceC0806P1, this, i, null), 3);
    }

    /* renamed from: z */
    public final synchronized Integer m3734z(InterfaceC0806P1 interfaceC0806P1) {
        if (this.f6505w == null) {
            this.f6505w = (Integer) AbstractC0438II.m1032l(new C1954km(interfaceC0806P1, this, null));
        }
        return this.f6505w;
    }
}
