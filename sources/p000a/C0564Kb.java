package p000a;

/* renamed from: a.Kb */
/* loaded from: classes.dex */
public final class C0564Kb implements InterfaceC1975l8 {

    /* renamed from: z */
    public final InterfaceC2155oe f1836z;

    public C0564Kb(InterfaceC2155oe interfaceC2155oe) {
        this.f1836z = interfaceC2155oe;
    }

    @Override // p000a.InterfaceC1975l8
    /* renamed from: z */
    public final C1429ap mo264z(C2515vK c2515vK) {
        AbstractC1449bB abstractC1449bB;
        C1364ZX c1364zx = c2515vK.f7697N;
        c1364zx.getClass();
        C2306rP c2306rP = new C2306rP(c1364zx);
        AbstractC1911jx abstractC1911jx = (AbstractC1911jx) c1364zx.f4276N;
        if (abstractC1911jx != null) {
            C0003A3 mo77h = abstractC1911jx.mo77h();
            if (mo77h != null) {
                c2306rP.m3963h("Content-Type", mo77h.f67z);
            }
            long mo79z = abstractC1911jx.mo79z();
            if (mo79z != -1) {
                c2306rP.m3963h("Content-Length", String.valueOf(mo79z));
                c2306rP.m3962P("Transfer-Encoding");
            } else {
                c2306rP.m3963h("Transfer-Encoding", "chunked");
                c2306rP.m3962P("Content-Length");
            }
        }
        String m2760N = c1364zx.m2760N("Host");
        boolean z = false;
        Object obj = c1364zx.f4279h;
        if (m2760N == null) {
            c2306rP.m3963h("Host", AbstractC1181W6.m2432y((C2658y7) obj, false));
        }
        if (c1364zx.m2760N("Connection") == null) {
            c2306rP.m3963h("Connection", "Keep-Alive");
        }
        if (c1364zx.m2760N("Accept-Encoding") == null && c1364zx.m2760N("Range") == null) {
            c2306rP.m3963h("Accept-Encoding", "gzip");
            z = true;
        }
        InterfaceC2155oe interfaceC2155oe = this.f1836z;
        interfaceC2155oe.getClass();
        if (c1364zx.m2760N("User-Agent") == null) {
            c2306rP.m3963h("User-Agent", "okhttp/4.12.0");
        }
        C1429ap m4356h = c2515vK.m4356h(c2306rP.m3965z());
        C1494c7 c1494c7 = m4356h.f4472k;
        AbstractC0967S9.m2149h(interfaceC2155oe, (C2658y7) obj, c1494c7);
        C2368sZ c2368sZ = new C2368sZ(m4356h);
        c2368sZ.f7286z = c1364zx;
        if (z) {
            String m2897h = c1494c7.m2897h("Content-Encoding");
            String str = null;
            if (m2897h == null) {
                m2897h = null;
            }
            if (AbstractC1269Xn.m2594yF("gzip", m2897h) && AbstractC0967S9.m2150z(m4356h) && (abstractC1449bB = m4356h.f4471g) != null) {
                C1138VI c1138vi = new C1138VI(abstractC1449bB.mo1577G());
                C1571dY m2895P = c1494c7.m2895P();
                m2895P.m3041Q("Content-Encoding");
                m2895P.m3041Q("Content-Length");
                c2368sZ.f7278Q = m2895P.m3040P().m2895P();
                String m2897h2 = c1494c7.m2897h("Content-Type");
                if (m2897h2 != null) {
                    str = m2897h2;
                }
                c2368sZ.f7284u = new C0679Mq(str, -1L, new C2323ri(c1138vi));
            }
        }
        return c2368sZ.m4094z();
    }
}
