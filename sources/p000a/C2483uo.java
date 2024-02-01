package p000a;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: a.uo */
/* loaded from: classes.dex */
public final class C2483uo implements Closeable {

    /* renamed from: g */
    public static final Logger f7603g = Logger.getLogger(AbstractC2367sX.class.getName());

    /* renamed from: I */
    public int f7604I;

    /* renamed from: R */
    public final boolean f7605R;

    /* renamed from: S */
    public final InterfaceC1432as f7606S;

    /* renamed from: k */
    public final C1516ca f7607k;

    /* renamed from: q */
    public boolean f7608q;

    /* renamed from: w */
    public final C2361sQ f7609w;

    public C2483uo(InterfaceC1432as interfaceC1432as, boolean z) {
        this.f7606S = interfaceC1432as;
        this.f7605R = z;
        C2361sQ c2361sQ = new C2361sQ();
        this.f7609w = c2361sQ;
        this.f7604I = 16384;
        this.f7607k = new C1516ca(c2361sQ);
    }

    /* renamed from: BO */
    public final synchronized void m4260BO(int i, long j) {
        if (this.f7608q) {
            throw new IOException("closed");
        }
        if (!(j != 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        m4262G(i, 4, 8, 0);
        this.f7606S.mo943i((int) j);
        this.f7606S.flush();
    }

    /* renamed from: C */
    public final synchronized void m4261C(int i, int i2, boolean z) {
        if (this.f7608q) {
            throw new IOException("closed");
        }
        m4262G(0, 8, 6, z ? 1 : 0);
        this.f7606S.mo943i(i);
        this.f7606S.mo943i(i2);
        this.f7606S.flush();
    }

    /* renamed from: G */
    public final void m4262G(int i, int i2, int i3, int i4) {
        boolean z;
        Level level = Level.FINE;
        Logger logger = f7603g;
        boolean z2 = false;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC2367sX.m4092z(i, i2, i3, i4, false));
        }
        if (i2 <= this.f7604I) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((Integer.MIN_VALUE & i) == 0) {
                z2 = true;
            }
            if (z2) {
                byte[] bArr = AbstractC1181W6.f3860z;
                InterfaceC1432as interfaceC1432as = this.f7606S;
                interfaceC1432as.mo945qn((i2 >>> 16) & 255);
                interfaceC1432as.mo945qn((i2 >>> 8) & 255);
                interfaceC1432as.mo945qn(i2 & 255);
                interfaceC1432as.mo945qn(i3 & 255);
                interfaceC1432as.mo945qn(i4 & 255);
                interfaceC1432as.mo943i(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("reserved bit set: ", i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f7604I + ": " + i2).toString());
    }

    /* renamed from: U8 */
    public final synchronized void m4263U8(C1148VU c1148vu) {
        int i;
        if (!this.f7608q) {
            m4262G(0, Integer.bitCount(c1148vu.f3733z) * 6, 4, 0);
            for (int i2 = 0; i2 < 10; i2++) {
                boolean z = true;
                if (((1 << i2) & c1148vu.f3733z) == 0) {
                    z = false;
                }
                if (z) {
                    if (i2 != 4) {
                        if (i2 != 7) {
                            i = i2;
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                    this.f7606S.mo937H(i);
                    this.f7606S.mo943i(c1148vu.f3732h[i2]);
                }
            }
            this.f7606S.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: V */
    public final synchronized void m4264V(int i, EnumC0754O6 enumC0754O6, byte[] bArr) {
        boolean z;
        if (!this.f7608q) {
            boolean z2 = false;
            if (enumC0754O6.f2565S != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m4262G(0, bArr.length + 8, 7, 0);
                this.f7606S.mo943i(i);
                this.f7606S.mo943i(enumC0754O6.f2565S);
                if (bArr.length == 0) {
                    z2 = true;
                }
                if ((!z2) != false) {
                    this.f7606S.mo939N(bArr);
                }
                this.f7606S.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f7608q = true;
        this.f7606S.close();
    }

    public final synchronized void flush() {
        if (this.f7608q) {
            throw new IOException("closed");
        }
        this.f7606S.flush();
    }

    /* renamed from: h */
    public final synchronized void m4265h(boolean z, int i, C2361sQ c2361sQ, int i2) {
        if (!this.f7608q) {
            m4262G(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                this.f7606S.mo608Q(c2361sQ, i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: he */
    public final void m4266he(int i, long j) {
        while (j > 0) {
            long min = Math.min(this.f7604I, j);
            j -= min;
            m4262G(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f7606S.mo608Q(this.f7609w, min);
        }
    }

    /* renamed from: x */
    public final synchronized void m4267x(int i, EnumC0754O6 enumC0754O6) {
        boolean z;
        if (!this.f7608q) {
            if (enumC0754O6.f2565S != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m4262G(i, 4, 3, 0);
                this.f7606S.mo943i(enumC0754O6.f2565S);
                this.f7606S.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: y */
    public final synchronized void m4268y(int i, ArrayList arrayList, boolean z) {
        int i2;
        if (!this.f7608q) {
            this.f7607k.m2938P(arrayList);
            long j = this.f7609w.f7260R;
            long min = Math.min(this.f7604I, j);
            if (j == min) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (z) {
                i2 |= 1;
            }
            m4262G(i, (int) min, 1, i2);
            this.f7606S.mo608Q(this.f7609w, min);
            if (j > min) {
                m4266he(i, j - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: z */
    public final synchronized void m4269z(C1148VU c1148vu) {
        int i;
        int i2;
        if (!this.f7608q) {
            int i3 = this.f7604I;
            int i4 = c1148vu.f3733z;
            if ((i4 & 32) != 0) {
                i3 = c1148vu.f3732h[5];
            }
            this.f7604I = i3;
            if ((i4 & 2) != 0) {
                i = c1148vu.f3732h[1];
            } else {
                i = -1;
            }
            if (i != -1) {
                C1516ca c1516ca = this.f7607k;
                if ((i4 & 2) != 0) {
                    i2 = c1148vu.f3732h[1];
                } else {
                    i2 = -1;
                }
                c1516ca.getClass();
                int min = Math.min(i2, 16384);
                int i5 = c1516ca.f4684N;
                if (i5 != min) {
                    if (min < i5) {
                        c1516ca.f4691v = Math.min(c1516ca.f4691v, min);
                    }
                    c1516ca.f4685P = true;
                    c1516ca.f4684N = min;
                    int i6 = c1516ca.f4687W;
                    if (min < i6) {
                        if (min == 0) {
                            C0668Me[] c0668MeArr = c1516ca.f4686Q;
                            Arrays.fill(c0668MeArr, 0, c0668MeArr.length, (Object) null);
                            c1516ca.f4690u = c1516ca.f4686Q.length - 1;
                            c1516ca.f4689o = 0;
                            c1516ca.f4687W = 0;
                        } else {
                            c1516ca.m2941z(i6 - min);
                        }
                    }
                }
            }
            m4262G(0, 0, 4, 1);
            this.f7606S.flush();
        } else {
            throw new IOException("closed");
        }
    }
}
