package p000a;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: a.yZ */
/* loaded from: classes.dex */
public final class C2677yZ extends AbstractC1442b2 {

    /* renamed from: I */
    public boolean f8351I;

    /* renamed from: R */
    public final long f8352R;

    /* renamed from: g */
    public final /* synthetic */ C0998Si f8353g;

    /* renamed from: k */
    public boolean f8354k;

    /* renamed from: q */
    public boolean f8355q;

    /* renamed from: w */
    public long f8356w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2677yZ(C0998Si c0998Si, InterfaceC0984SS interfaceC0984SS, long j) {
        super(interfaceC0984SS);
        this.f8353g = c0998Si;
        this.f8352R = j;
        this.f8351I = true;
        if (j == 0) {
            m4589z(null);
        }
    }

    @Override // p000a.AbstractC1442b2, p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        if ((!this.f8354k) != false) {
            try {
                long mo188M = this.f4518S.mo188M(c2361sQ, j);
                if (this.f8351I) {
                    this.f8351I = false;
                    C0998Si c0998Si = this.f8353g;
                    C1710g8 c1710g8 = c0998Si.f3350h;
                    C0523Jr c0523Jr = c0998Si.f3353z;
                    c1710g8.getClass();
                }
                if (mo188M == -1) {
                    m4589z(null);
                    return -1L;
                }
                long j2 = this.f8356w + mo188M;
                long j3 = this.f8352R;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
                }
                this.f8356w = j2;
                if (j2 == j3) {
                    m4589z(null);
                }
                return mo188M;
            } catch (IOException e) {
                throw m4589z(e);
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000a.AbstractC1442b2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8354k) {
            return;
        }
        this.f8354k = true;
        try {
            super.close();
            m4589z(null);
        } catch (IOException e) {
            throw m4589z(e);
        }
    }

    /* renamed from: z */
    public final IOException m4589z(IOException iOException) {
        if (this.f8355q) {
            return iOException;
        }
        this.f8355q = true;
        C0998Si c0998Si = this.f8353g;
        if (iOException == null && this.f8351I) {
            this.f8351I = false;
            c0998Si.f3350h.getClass();
        }
        if (iOException != null) {
            c0998Si.m2171v(iOException);
        }
        c0998Si.f3350h.getClass();
        return c0998Si.f3353z.m1217W(c0998Si, false, true, iOException);
    }
}
