package p000a;

/* renamed from: a.cR */
/* loaded from: classes.dex */
public final class C1509cR implements InterfaceC1576dd {

    /* renamed from: I */
    public String f4662I;

    /* renamed from: S */
    public final String f4664S;

    /* renamed from: R */
    public final String f4663R = "";

    /* renamed from: w */
    public final boolean f4665w = true;

    public C1509cR(String str) {
        this.f4664S = str;
    }

    /* renamed from: h */
    public final void m2926h(InterfaceC0806P1 interfaceC0806P1, String str) {
        C0843Pi c0843Pi;
        InterfaceC0559KW interfaceC0559KW;
        InterfaceC0559KW c1241xa;
        synchronized (this) {
            this.f4662I = str;
        }
        if (str.length() == 0) {
            if (this.f4665w) {
                c1241xa = new C2313rX(interfaceC0806P1, this, null);
                AbstractC0438II.m1032l(c1241xa);
                return;
            } else {
                c0843Pi = C0843Pi.f2844S;
                interfaceC0559KW = new C1246XG(interfaceC0806P1, this, null);
                AbstractC0438II.m994F(c0843Pi, null, interfaceC0559KW, 3);
            }
        }
        if (this.f4665w) {
            c1241xa = new C1241XA(interfaceC0806P1, this, str, null);
            AbstractC0438II.m1032l(c1241xa);
            return;
        }
        C0843Pi c0843Pi2 = C0843Pi.f2844S;
        C0334GP c0334gp = new C0334GP(interfaceC0806P1, this, str, null);
        c0843Pi = c0843Pi2;
        interfaceC0559KW = c0334gp;
        AbstractC0438II.m994F(c0843Pi, null, interfaceC0559KW, 3);
    }

    /* renamed from: z */
    public final synchronized String m2927z(InterfaceC0806P1 interfaceC0806P1) {
        if (this.f4662I == null) {
            this.f4662I = (String) AbstractC0438II.m1032l(new C2260qY(interfaceC0806P1, this, null));
        }
        return this.f4662I;
    }
}
