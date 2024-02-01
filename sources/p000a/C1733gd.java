package p000a;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: a.gd */
/* loaded from: classes.dex */
public final class C1733gd extends AbstractC0178DS {

    /* renamed from: I */
    public final C2658y7 f5461I;

    /* renamed from: g */
    public final /* synthetic */ C1177W2 f5462g;

    /* renamed from: k */
    public boolean f5463k;

    /* renamed from: q */
    public long f5464q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733gd(C1177W2 c1177w2, C2658y7 c2658y7) {
        super(c1177w2);
        this.f5462g = c1177w2;
        this.f5461I = c2658y7;
        this.f5464q = -1L;
        this.f5463k = true;
    }

    @Override // p000a.AbstractC0178DS, p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((!this.f546R) != false) {
                if (!this.f5463k) {
                    return -1L;
                }
                long j2 = this.f5464q;
                C1177W2 c1177w2 = this.f5462g;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        c1177w2.f3839v.mo1633t();
                    }
                    try {
                        this.f5464q = c1177w2.f3839v.mo1630nF();
                        String obj = AbstractC1269Xn.m2580Uf(c1177w2.f3839v.mo1633t()).toString();
                        if (this.f5464q >= 0) {
                            if (obj.length() <= 0) {
                                z2 = false;
                            }
                            if (!z2 || obj.startsWith(";")) {
                                if (this.f5464q == 0) {
                                    this.f5463k = false;
                                    AbstractC0967S9.m2149h(c1177w2.f3840z.f770U, this.f5461I, c1177w2.f3837Q.m2706z());
                                    m348z();
                                }
                                if (!this.f5463k) {
                                    return -1L;
                                }
                            }
                        }
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f5464q + obj + '\"');
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long mo188M = super.mo188M(c2361sQ, Math.min(j, this.f5464q));
                if (mo188M != -1) {
                    this.f5464q -= mo188M;
                    return mo188M;
                }
                c1177w2.f3838h.m1783V();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m348z();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount < 0: ", j).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.f546R) {
            return;
        }
        if (this.f5463k) {
            try {
                z = AbstractC1181W6.m2425k(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f5462g.f3838h.m1783V();
                m348z();
            }
        }
        this.f546R = true;
    }
}
