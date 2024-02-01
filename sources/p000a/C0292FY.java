package p000a;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: a.FY */
/* loaded from: classes.dex */
public final class C0292FY implements InterfaceC2578wb {

    /* renamed from: R */
    public final Object f1019R;

    /* renamed from: S */
    public final /* synthetic */ int f1020S = 0;

    /* renamed from: w */
    public final Object f1021w;

    public C0292FY(C1052Ti c1052Ti, C0292FY c0292fy) {
        this.f1019R = c1052Ti;
        this.f1021w = c0292fy;
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: P */
    public final C1819iG mo607P() {
        switch (this.f1020S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return (C2056mk) this.f1019R;
            default:
                return (C1819iG) this.f1021w;
        }
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: Q */
    public final void mo608Q(C2361sQ c2361sQ, long j) {
        int i = this.f1020S;
        Object obj = this.f1021w;
        Object obj2 = this.f1019R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC0795Op.m1872u(c2361sQ.f7260R, 0L, j);
                while (j > 0) {
                    C1740gk c1740gk = c2361sQ.f7261S;
                    long j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += c1740gk.f5482v - c1740gk.f5480h;
                            if (j2 >= j) {
                                j2 = j;
                            } else {
                                c1740gk = c1740gk.f5479Q;
                            }
                        }
                    }
                    C2056mk c2056mk = (C2056mk) obj2;
                    InterfaceC2578wb interfaceC2578wb = (InterfaceC2578wb) obj;
                    c2056mk.m3687o();
                    try {
                        interfaceC2578wb.mo608Q(c2361sQ, j2);
                        if (!c2056mk.m3686W()) {
                            j -= j2;
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
                }
                return;
            default:
                AbstractC0795Op.m1872u(c2361sQ.f7260R, 0L, j);
                while (j > 0) {
                    ((C1819iG) obj).mo377Q();
                    C1740gk c1740gk2 = c2361sQ.f7261S;
                    int min = (int) Math.min(j, c1740gk2.f5482v - c1740gk2.f5480h);
                    ((OutputStream) obj2).write(c1740gk2.f5483z, c1740gk2.f5480h, min);
                    int i2 = c1740gk2.f5480h + min;
                    c1740gk2.f5480h = i2;
                    long j3 = min;
                    j -= j3;
                    c2361sQ.f7260R -= j3;
                    if (i2 == c1740gk2.f5482v) {
                        c2361sQ.f7261S = c1740gk2.m3272z();
                        AbstractC0539KA.m1253z(c1740gk2);
                    }
                }
                return;
        }
    }

    @Override // p000a.InterfaceC2578wb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f1020S;
        Object obj = this.f1019R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2056mk c2056mk = (C2056mk) obj;
                InterfaceC2578wb interfaceC2578wb = (InterfaceC2578wb) this.f1021w;
                c2056mk.m3687o();
                try {
                    interfaceC2578wb.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // p000a.InterfaceC2578wb, java.io.Flushable
    public final void flush() {
        int i = this.f1020S;
        Object obj = this.f1019R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2056mk c2056mk = (C2056mk) obj;
                InterfaceC2578wb interfaceC2578wb = (InterfaceC2578wb) this.f1021w;
                c2056mk.m3687o();
                try {
                    interfaceC2578wb.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f1020S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return "AsyncTimeout.sink(" + ((InterfaceC2578wb) this.f1021w) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1019R) + ')';
        }
    }

    public C0292FY(OutputStream outputStream, C1819iG c1819iG) {
        this.f1019R = outputStream;
        this.f1021w = c1819iG;
    }
}
