package p000a;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: a.l0 */
/* loaded from: classes.dex */
public final class C1968l0 extends AbstractC2099nZ {

    /* renamed from: I */
    public long f6090I;

    /* renamed from: R */
    public final long f6091R;

    /* renamed from: k */
    public final /* synthetic */ C0998Si f6092k;

    /* renamed from: q */
    public boolean f6093q;

    /* renamed from: w */
    public boolean f6094w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1968l0(C0998Si c0998Si, InterfaceC2578wb interfaceC2578wb, long j) {
        super(interfaceC2578wb);
        this.f6092k = c0998Si;
        this.f6091R = j;
    }

    @Override // p000a.AbstractC2099nZ, p000a.InterfaceC2578wb
    /* renamed from: Q */
    public final void mo608Q(C2361sQ c2361sQ, long j) {
        if ((!this.f6093q) != true) {
            throw new IllegalStateException("closed".toString());
        }
        long j2 = this.f6091R;
        if (j2 == -1 || this.f6090I + j <= j2) {
            try {
                super.mo608Q(c2361sQ, j);
                this.f6090I += j;
                return;
            } catch (IOException e) {
                throw m3584z(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f6090I + j));
    }

    @Override // p000a.AbstractC2099nZ, p000a.InterfaceC2578wb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6093q) {
            return;
        }
        this.f6093q = true;
        long j = this.f6091R;
        if (j != -1 && this.f6090I != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            m3584z(null);
        } catch (IOException e) {
            throw m3584z(e);
        }
    }

    @Override // p000a.AbstractC2099nZ, p000a.InterfaceC2578wb, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            throw m3584z(e);
        }
    }

    /* renamed from: z */
    public final IOException m3584z(IOException iOException) {
        if (this.f6094w) {
            return iOException;
        }
        this.f6094w = true;
        C0998Si c0998Si = this.f6092k;
        if (iOException != null) {
            c0998Si.m2171v(iOException);
        }
        c0998Si.f3350h.getClass();
        return c0998Si.f3353z.m1217W(c0998Si, true, false, iOException);
    }
}
