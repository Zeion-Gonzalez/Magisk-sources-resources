package p000a;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: a.lt */
/* loaded from: classes.dex */
public final class C2014lt extends C2056mk {

    /* renamed from: S */
    public final /* synthetic */ C0573Kk f6256S;

    public C2014lt(C0573Kk c0573Kk) {
        this.f6256S = c0573Kk;
    }

    @Override // p000a.C2056mk
    /* renamed from: G */
    public final IOException mo2218G(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p000a.C2056mk
    /* renamed from: M */
    public final void mo2219M() {
        this.f6256S.m1297N(EnumC0754O6.f2560g);
        C0669Mf c0669Mf = this.f6256S.f1864h;
        synchronized (c0669Mf) {
            long j = c0669Mf.f2198c;
            long j2 = c0669Mf.f2190J;
            if (j >= j2) {
                c0669Mf.f2190J = j2 + 1;
                c0669Mf.f2188H = System.nanoTime() + 1000000000;
                c0669Mf.f2209s.m3579v(new C2717zI(3, c0669Mf, AbstractC2441tz.m4187M(new StringBuilder(), c0669Mf.f2189I, " ping"), 0), 0L);
            }
        }
    }

    /* renamed from: V */
    public final void m3654V() {
        if (m3686W()) {
            throw mo2218G(null);
        }
    }
}
