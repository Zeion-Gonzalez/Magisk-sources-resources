package p000a;

/* renamed from: a.YX */
/* loaded from: classes.dex */
public final class C1310YX {

    /* renamed from: h */
    public long f4170h = 262144;

    /* renamed from: z */
    public final InterfaceC0694N7 f4171z;

    public C1310YX(InterfaceC0694N7 interfaceC0694N7) {
        this.f4171z = interfaceC0694N7;
    }

    /* renamed from: z */
    public final C1494c7 m2706z() {
        boolean z;
        C1571dY c1571dY = new C1571dY();
        while (true) {
            String mo1622U = this.f4171z.mo1622U(this.f4170h);
            this.f4170h -= mo1622U.length();
            if (mo1622U.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c1571dY.m3042h(mo1622U);
            } else {
                return c1571dY.m3040P();
            }
        }
    }
}
