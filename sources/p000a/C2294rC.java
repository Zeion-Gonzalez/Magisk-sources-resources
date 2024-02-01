package p000a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.rC */
/* loaded from: classes.dex */
public final class C2294rC implements InterfaceC0984SS {

    /* renamed from: R */
    public final Object f7088R;

    /* renamed from: S */
    public final /* synthetic */ int f7089S = 0;

    /* renamed from: w */
    public final Object f7090w;

    public C2294rC(C1052Ti c1052Ti, C2294rC c2294rC) {
        this.f7088R = c1052Ti;
        this.f7090w = c2294rC;
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        boolean z;
        int i = this.f7089S;
        Object obj = this.f7090w;
        Object obj2 = this.f7088R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2056mk c2056mk = (C2056mk) obj2;
                InterfaceC0984SS interfaceC0984SS = (InterfaceC0984SS) obj;
                c2056mk.m3687o();
                try {
                    long mo188M = interfaceC0984SS.mo188M(c2361sQ, j);
                    if (!c2056mk.m3686W()) {
                        return mo188M;
                    }
                    throw c2056mk.mo2218G(null);
                } catch (IOException e) {
                    if (!c2056mk.m3686W()) {
                        throw e;
                    }
                    throw c2056mk.mo2218G(e);
                } finally {
                    c2056mk.m3686W();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    try {
                        ((C1819iG) obj).mo377Q();
                        C1740gk m4081d2 = c2361sQ.m4081d2(1);
                        int read = ((InputStream) obj2).read(m4081d2.f5483z, m4081d2.f5482v, (int) Math.min(j, 8192 - m4081d2.f5482v));
                        if (read == -1) {
                            if (m4081d2.f5480h == m4081d2.f5482v) {
                                c2361sQ.f7261S = m4081d2.m3272z();
                                AbstractC0539KA.m1253z(m4081d2);
                            }
                            return -1L;
                        }
                        m4081d2.f5482v += read;
                        long j2 = read;
                        c2361sQ.f7260R += j2;
                        return j2;
                    } catch (AssertionError e2) {
                        if (AbstractC1292YB.m2656O(e2)) {
                            throw new IOException(e2);
                        }
                        throw e2;
                    }
                }
                throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount < 0: ", j).toString());
        }
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        switch (this.f7089S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (C2056mk) this.f7088R;
            default:
                return (C1819iG) this.f7090w;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f7089S;
        Object obj = this.f7088R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2056mk c2056mk = (C2056mk) obj;
                InterfaceC0984SS interfaceC0984SS = (InterfaceC0984SS) this.f7090w;
                c2056mk.m3687o();
                try {
                    interfaceC0984SS.close();
                    if (!c2056mk.m3686W()) {
                        return;
                    } else {
                        throw c2056mk.mo2218G(null);
                    }
                } catch (IOException e) {
                    if (!c2056mk.m3686W()) {
                        throw e;
                    }
                    throw c2056mk.mo2218G(e);
                } finally {
                    c2056mk.m3686W();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f7089S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return "AsyncTimeout.source(" + ((InterfaceC0984SS) this.f7090w) + ')';
            default:
                return "source(" + ((InputStream) this.f7088R) + ')';
        }
    }

    public C2294rC(InputStream inputStream, C1819iG c1819iG) {
        this.f7088R = inputStream;
        this.f7090w = c1819iG;
    }
}
