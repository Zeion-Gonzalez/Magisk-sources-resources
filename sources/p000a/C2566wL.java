package p000a;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: a.wL */
/* loaded from: classes.dex */
public final class C2566wL extends AbstractC1911jx {

    /* renamed from: N */
    public static final C0003A3 f7836N;

    /* renamed from: Q */
    public static final C0003A3 f7837Q;

    /* renamed from: W */
    public static final byte[] f7838W;

    /* renamed from: o */
    public static final byte[] f7839o;

    /* renamed from: u */
    public static final byte[] f7840u;

    /* renamed from: P */
    public long f7841P;

    /* renamed from: h */
    public final List f7842h;

    /* renamed from: v */
    public final C0003A3 f7843v;

    /* renamed from: z */
    public final C1623eY f7844z;

    static {
        Pattern pattern = C0003A3.f64P;
        f7836N = C1710g8.m3223I("multipart/mixed");
        C1710g8.m3223I("multipart/alternative");
        C1710g8.m3223I("multipart/digest");
        C1710g8.m3223I("multipart/parallel");
        f7837Q = C1710g8.m3223I("multipart/form-data");
        f7840u = new byte[]{58, 32};
        f7839o = new byte[]{13, 10};
        f7838W = new byte[]{45, 45};
    }

    public C2566wL(C1623eY c1623eY, C0003A3 c0003a3, List list) {
        this.f7844z = c1623eY;
        this.f7842h = list;
        Pattern pattern = C0003A3.f64P;
        this.f7843v = C1710g8.m3223I(c0003a3 + "; boundary=" + c1623eY.m3077M());
        this.f7841P = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: P */
    public final long m4384P(InterfaceC1432as interfaceC1432as, boolean z) {
        C2361sQ c2361sQ;
        InterfaceC1432as interfaceC1432as2;
        if (z) {
            interfaceC1432as2 = new C2361sQ();
            c2361sQ = interfaceC1432as2;
        } else {
            c2361sQ = 0;
            interfaceC1432as2 = interfaceC1432as;
        }
        List list = this.f7842h;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C1623eY c1623eY = this.f7844z;
            byte[] bArr = f7838W;
            byte[] bArr2 = f7839o;
            if (i < size) {
                C1360ZS c1360zs = (C1360ZS) list.get(i);
                C1494c7 c1494c7 = c1360zs.f4270z;
                interfaceC1432as2.mo939N(bArr);
                interfaceC1432as2.mo936D(c1623eY);
                interfaceC1432as2.mo939N(bArr2);
                if (c1494c7 != null) {
                    int length = c1494c7.f4637S.length / 2;
                    for (int i2 = 0; i2 < length; i2++) {
                        interfaceC1432as2.mo938K(c1494c7.m2898v(i2)).mo939N(f7840u).mo938K(c1494c7.m2894N(i2)).mo939N(bArr2);
                    }
                }
                AbstractC1911jx abstractC1911jx = c1360zs.f4269h;
                C0003A3 mo77h = abstractC1911jx.mo77h();
                if (mo77h != null) {
                    interfaceC1432as2.mo938K("Content-Type: ").mo938K(mo77h.f67z).mo939N(bArr2);
                }
                long mo79z = abstractC1911jx.mo79z();
                if (mo79z != -1) {
                    interfaceC1432as2.mo938K("Content-Length: ").mo944m(mo79z).mo939N(bArr2);
                } else if (z) {
                    c2361sQ.m4091z();
                    return -1L;
                }
                interfaceC1432as2.mo939N(bArr2);
                if (z) {
                    j += mo79z;
                } else {
                    abstractC1911jx.mo78v(interfaceC1432as2);
                }
                interfaceC1432as2.mo939N(bArr2);
                i++;
            } else {
                interfaceC1432as2.mo939N(bArr);
                interfaceC1432as2.mo936D(c1623eY);
                interfaceC1432as2.mo939N(bArr);
                interfaceC1432as2.mo939N(bArr2);
                if (z) {
                    long j2 = j + c2361sQ.f7260R;
                    c2361sQ.m4091z();
                    return j2;
                }
                return j;
            }
        }
    }

    @Override // p000a.AbstractC1911jx
    /* renamed from: h */
    public final C0003A3 mo77h() {
        return this.f7843v;
    }

    @Override // p000a.AbstractC1911jx
    /* renamed from: v */
    public final void mo78v(InterfaceC1432as interfaceC1432as) {
        m4384P(interfaceC1432as, false);
    }

    @Override // p000a.AbstractC1911jx
    /* renamed from: z */
    public final long mo79z() {
        long j = this.f7841P;
        if (j != -1) {
            return j;
        }
        long m4384P = m4384P(null, true);
        this.f7841P = m4384P;
        return m4384P;
    }
}
