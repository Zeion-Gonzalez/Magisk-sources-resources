package p000a;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: a.Rd */
/* loaded from: classes.dex */
public final class C0937Rd extends AbstractC0178DS {

    /* renamed from: I */
    public long f3216I;

    /* renamed from: q */
    public final /* synthetic */ C1177W2 f3217q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0937Rd(C1177W2 c1177w2, long j) {
        super(c1177w2);
        this.f3217q = c1177w2;
        this.f3216I = j;
        if (j == 0) {
            m348z();
        }
    }

    @Override // p000a.AbstractC0178DS, p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((!this.f546R) != false) {
                long j2 = this.f3216I;
                if (j2 == 0) {
                    return -1L;
                }
                long mo188M = super.mo188M(c2361sQ, Math.min(j2, j));
                if (mo188M != -1) {
                    long j3 = this.f3216I - mo188M;
                    this.f3216I = j3;
                    if (j3 == 0) {
                        m348z();
                    }
                    return mo188M;
                }
                this.f3217q.f3838h.m1783V();
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
        if (this.f3216I != 0) {
            try {
                z = AbstractC1181W6.m2425k(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.f3217q.f3838h.m1783V();
                m348z();
            }
        }
        this.f546R = true;
    }
}
