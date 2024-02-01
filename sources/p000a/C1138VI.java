package p000a;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: a.VI */
/* loaded from: classes.dex */
public final class C1138VI implements InterfaceC0984SS {

    /* renamed from: I */
    public final C0616La f3709I;

    /* renamed from: R */
    public final C2323ri f3710R;

    /* renamed from: S */
    public byte f3711S;

    /* renamed from: q */
    public final CRC32 f3712q;

    /* renamed from: w */
    public final Inflater f3713w;

    public C1138VI(InterfaceC0984SS interfaceC0984SS) {
        C2323ri c2323ri = new C2323ri(interfaceC0984SS);
        this.f3710R = c2323ri;
        Inflater inflater = new Inflater(true);
        this.f3713w = inflater;
        this.f3709I = new C0616La(c2323ri, inflater);
        this.f3712q = new CRC32();
    }

    /* renamed from: z */
    public static void m2333z(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        boolean z;
        C2323ri c2323ri;
        boolean z2;
        boolean z3;
        boolean z4;
        C2361sQ c2361sQ2;
        boolean z5;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == 0) {
                return 0L;
            }
            byte b = this.f3711S;
            CRC32 crc32 = this.f3712q;
            C2323ri c2323ri2 = this.f3710R;
            if (b == 0) {
                c2323ri2.mo1615B(10L);
                C2361sQ c2361sQ3 = c2323ri2.f7151R;
                byte m4079U8 = c2361sQ3.m4079U8(3L);
                if (((m4079U8 >> 1) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    m2334h(c2323ri2.f7151R, 0L, 10L);
                }
                m2333z(8075, c2323ri2.mo1619J(), "ID1ID2");
                c2323ri2.mo1632r(8L);
                if (((m4079U8 >> 2) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    c2323ri2.mo1615B(2L);
                    if (z2) {
                        m2334h(c2323ri2.f7151R, 0L, 2L);
                    }
                    int mo1619J = c2361sQ3.mo1619J() & 65535;
                    long j3 = ((short) (((mo1619J & 255) << 8) | ((mo1619J & 65280) >>> 8))) & 65535;
                    c2323ri2.mo1615B(j3);
                    if (z2) {
                        m2334h(c2323ri2.f7151R, 0L, j3);
                        j2 = j3;
                    } else {
                        j2 = j3;
                    }
                    c2323ri2.mo1632r(j2);
                }
                if (((m4079U8 >> 3) & 1) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    c2361sQ2 = c2361sQ3;
                    long m3978z = c2323ri2.m3978z((byte) 0, 0L, Long.MAX_VALUE);
                    if (m3978z != -1) {
                        if (z2) {
                            c2323ri = c2323ri2;
                            m2334h(c2323ri2.f7151R, 0L, m3978z + 1);
                        } else {
                            c2323ri = c2323ri2;
                        }
                        c2323ri.mo1632r(m3978z + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    c2361sQ2 = c2361sQ3;
                    c2323ri = c2323ri2;
                }
                if (((m4079U8 >> 4) & 1) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    long m3978z2 = c2323ri.m3978z((byte) 0, 0L, Long.MAX_VALUE);
                    if (m3978z2 != -1) {
                        if (z2) {
                            m2334h(c2323ri.f7151R, 0L, m3978z2 + 1);
                        }
                        c2323ri.mo1632r(m3978z2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    c2323ri.mo1615B(2L);
                    int mo1619J2 = c2361sQ2.mo1619J() & 65535;
                    m2333z((short) (((mo1619J2 & 255) << 8) | ((mo1619J2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                this.f3711S = (byte) 1;
            } else {
                c2323ri = c2323ri2;
            }
            if (this.f3711S == 1) {
                long j4 = c2361sQ.f7260R;
                long mo188M = this.f3709I.mo188M(c2361sQ, j);
                if (mo188M != -1) {
                    m2334h(c2361sQ, j4, mo188M);
                    return mo188M;
                }
                this.f3711S = (byte) 2;
            }
            if (this.f3711S == 2) {
                m2333z(c2323ri.m3976G(), (int) crc32.getValue(), "CRC");
                m2333z(c2323ri.m3976G(), (int) this.f3713w.getBytesWritten(), "ISIZE");
                this.f3711S = (byte) 3;
                if (!c2323ri.mo1626b()) {
                    throw new IOException("gzip finished without exhausting source");
                }
                return -1L;
            }
            return -1L;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount < 0: ", j).toString());
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        return this.f3710R.mo189P();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3709I.close();
    }

    /* renamed from: h */
    public final void m2334h(C2361sQ c2361sQ, long j, long j2) {
        C1740gk c1740gk = c2361sQ.f7261S;
        while (true) {
            int i = c1740gk.f5482v;
            int i2 = c1740gk.f5480h;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            c1740gk = c1740gk.f5479Q;
        }
        while (j2 > 0) {
            int min = (int) Math.min(c1740gk.f5482v - r6, j2);
            this.f3712q.update(c1740gk.f5483z, (int) (c1740gk.f5480h + j), min);
            j2 -= min;
            c1740gk = c1740gk.f5479Q;
            j = 0;
        }
    }
}
