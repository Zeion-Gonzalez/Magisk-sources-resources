package p000a;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* renamed from: a.W2 */
/* loaded from: classes.dex */
public final class C1177W2 implements InterfaceC0297Fe {

    /* renamed from: N */
    public int f3835N;

    /* renamed from: P */
    public final InterfaceC1432as f3836P;

    /* renamed from: Q */
    public final C1310YX f3837Q;

    /* renamed from: h */
    public final C0770OM f3838h;

    /* renamed from: v */
    public final InterfaceC0694N7 f3839v;

    /* renamed from: z */
    public final C0234ES f3840z;

    public C1177W2(C0234ES c0234es, C0770OM c0770om, InterfaceC0694N7 interfaceC0694N7, InterfaceC1432as interfaceC1432as) {
        this.f3840z = c0234es;
        this.f3838h = c0770om;
        this.f3839v = interfaceC0694N7;
        this.f3836P = interfaceC1432as;
        this.f3837Q = new C1310YX(interfaceC0694N7);
    }

    /* renamed from: G */
    public final void m2406G(C1494c7 c1494c7, String str) {
        boolean z;
        if (this.f3835N == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC1432as interfaceC1432as = this.f3836P;
            interfaceC1432as.mo938K(str).mo938K("\r\n");
            int length = c1494c7.f4637S.length / 2;
            for (int i = 0; i < length; i++) {
                interfaceC1432as.mo938K(c1494c7.m2898v(i)).mo938K(": ").mo938K(c1494c7.m2894N(i)).mo938K("\r\n");
            }
            interfaceC1432as.mo938K("\r\n");
            this.f3835N = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f3835N).toString());
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: N */
    public final void mo626N() {
        this.f3836P.flush();
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: P */
    public final void mo627P() {
        this.f3836P.flush();
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: Q */
    public final C2368sZ mo628Q(boolean z) {
        boolean z2;
        C1310YX c1310yx = this.f3837Q;
        int i = this.f3835N;
        boolean z3 = false;
        if (i != 1 && i != 2 && i != 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            try {
                String mo1622U = c1310yx.f4171z.mo1622U(c1310yx.f4170h);
                c1310yx.f4170h -= mo1622U.length();
                C1014T1 m3220E = C1710g8.m3220E(mo1622U);
                int i2 = m3220E.f3391h;
                C2368sZ c2368sZ = new C2368sZ();
                c2368sZ.f7282h = m3220E.f3393z;
                c2368sZ.f7285v = i2;
                c2368sZ.f7277P = m3220E.f3392v;
                c2368sZ.f7278Q = c1310yx.m2706z().m2895P();
                if (z && i2 == 100) {
                    return null;
                }
                if (i2 != 100) {
                    if (102 <= i2 && i2 < 200) {
                        z3 = true;
                    }
                    if (!z3) {
                        this.f3835N = 4;
                        return c2368sZ;
                    }
                }
                this.f3835N = 3;
                return c2368sZ;
            } catch (EOFException e) {
                throw new IOException(AbstractC2441tz.m4200k("unexpected end of stream on ", this.f3838h.f2627h.f6034z.f7113W.m4566u()), e);
            }
        }
        throw new IllegalStateException(("state: " + this.f3835N).toString());
    }

    /* renamed from: W */
    public final C0937Rd m2407W(long j) {
        if (this.f3835N == 4) {
            this.f3835N = 5;
            return new C0937Rd(this, j);
        }
        throw new IllegalStateException(("state: " + this.f3835N).toString());
    }

    @Override // p000a.InterfaceC0297Fe
    public final void cancel() {
        Socket socket = this.f3838h.f2631v;
        if (socket != null) {
            AbstractC1181W6.m2416P(socket);
        }
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: h */
    public final InterfaceC0984SS mo629h(C1429ap c1429ap) {
        if (!AbstractC0967S9.m2150z(c1429ap)) {
            return m2407W(0L);
        }
        String m2897h = c1429ap.f4472k.m2897h("Transfer-Encoding");
        if (m2897h == null) {
            m2897h = null;
        }
        boolean z = true;
        if (AbstractC1269Xn.m2594yF("chunked", m2897h)) {
            C2658y7 c2658y7 = (C2658y7) c1429ap.f4467S.f4279h;
            if (this.f3835N != 4) {
                z = false;
            }
            if (z) {
                this.f3835N = 5;
                return new C1733gd(this, c2658y7);
            }
            throw new IllegalStateException(("state: " + this.f3835N).toString());
        }
        long m2422W = AbstractC1181W6.m2422W(c1429ap);
        if (m2422W != -1) {
            return m2407W(m2422W);
        }
        if (this.f3835N != 4) {
            z = false;
        }
        if (z) {
            this.f3835N = 5;
            this.f3838h.m1783V();
            return new C2069my(this);
        }
        throw new IllegalStateException(("state: " + this.f3835N).toString());
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: o */
    public final long mo630o(C1429ap c1429ap) {
        if (!AbstractC0967S9.m2150z(c1429ap)) {
            return 0L;
        }
        String m2897h = c1429ap.f4472k.m2897h("Transfer-Encoding");
        if (m2897h == null) {
            m2897h = null;
        }
        if (AbstractC1269Xn.m2594yF("chunked", m2897h)) {
            return -1L;
        }
        return AbstractC1181W6.m2422W(c1429ap);
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: u */
    public final C0770OM mo631u() {
        return this.f3838h;
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: v */
    public final InterfaceC2578wb mo632v(C1364ZX c1364zx, long j) {
        AbstractC1911jx abstractC1911jx = (AbstractC1911jx) c1364zx.f4276N;
        if (abstractC1911jx != null) {
            abstractC1911jx.getClass();
        }
        boolean z = true;
        if (AbstractC1269Xn.m2594yF("chunked", c1364zx.m2760N("Transfer-Encoding"))) {
            if (this.f3835N != 1) {
                z = false;
            }
            if (z) {
                this.f3835N = 2;
                return new C1901jn(this);
            }
            throw new IllegalStateException(("state: " + this.f3835N).toString());
        }
        if (j != -1) {
            if (this.f3835N != 1) {
                z = false;
            }
            if (z) {
                this.f3835N = 2;
                return new C0605LL(this);
            }
            throw new IllegalStateException(("state: " + this.f3835N).toString());
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: z */
    public final void mo633z(C1364ZX c1364zx) {
        boolean z;
        Proxy.Type type = this.f3838h.f2627h.f6032h.type();
        StringBuilder sb = new StringBuilder();
        sb.append((String) c1364zx.f4281v);
        sb.append(' ');
        Object obj = c1364zx.f4279h;
        if (!((C2658y7) obj).f8277G && type == Proxy.Type.HTTP) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            sb.append((C2658y7) obj);
        } else {
            C2658y7 c2658y7 = (C2658y7) obj;
            String m4564h = c2658y7.m4564h();
            String m4562P = c2658y7.m4562P();
            if (m4562P != null) {
                m4564h = m4564h + '?' + m4562P;
            }
            sb.append(m4564h);
        }
        sb.append(" HTTP/1.1");
        m2406G((C1494c7) c1364zx.f4277P, sb.toString());
    }
}
