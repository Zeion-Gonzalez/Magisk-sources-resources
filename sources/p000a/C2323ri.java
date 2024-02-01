package p000a;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: a.ri */
/* loaded from: classes.dex */
public final class C2323ri implements InterfaceC0694N7 {

    /* renamed from: R */
    public final C2361sQ f7151R = new C2361sQ();

    /* renamed from: S */
    public final InterfaceC0984SS f7152S;

    /* renamed from: w */
    public boolean f7153w;

    public C2323ri(InterfaceC0984SS interfaceC0984SS) {
        this.f7152S = interfaceC0984SS;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: B */
    public final void mo1615B(long j) {
        if (!mo1617F(j)) {
            throw new EOFException();
        }
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: EC */
    public final byte mo1616EC() {
        mo1615B(1L);
        return this.f7151R.mo1616EC();
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: F */
    public final boolean mo1617F(long j) {
        boolean z;
        C2361sQ c2361sQ;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((!this.f7153w) == false) {
                throw new IllegalStateException("closed".toString());
            }
            do {
                c2361sQ = this.f7151R;
                if (c2361sQ.f7260R >= j) {
                    return true;
                }
            } while (this.f7152S.mo188M(c2361sQ, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount < 0: ", j).toString());
    }

    /* renamed from: G */
    public final int m3976G() {
        mo1615B(4L);
        int mo1620L = this.f7151R.mo1620L();
        return ((mo1620L & 255) << 24) | (((-16777216) & mo1620L) >>> 24) | ((16711680 & mo1620L) >>> 8) | ((65280 & mo1620L) << 8);
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: I */
    public final long mo1618I(C2361sQ c2361sQ) {
        C2361sQ c2361sQ2;
        long j = 0;
        while (true) {
            InterfaceC0984SS interfaceC0984SS = this.f7152S;
            c2361sQ2 = this.f7151R;
            if (interfaceC0984SS.mo188M(c2361sQ2, 8192L) == -1) {
                break;
            }
            long m4069C = c2361sQ2.m4069C();
            if (m4069C > 0) {
                j += m4069C;
                c2361sQ.mo608Q(c2361sQ2, m4069C);
            }
        }
        long j2 = c2361sQ2.f7260R;
        if (j2 > 0) {
            long j3 = j + j2;
            c2361sQ.mo608Q(c2361sQ2, j2);
            return j3;
        }
        return j;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: J */
    public final short mo1619J() {
        mo1615B(2L);
        return this.f7151R.mo1619J();
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: L */
    public final int mo1620L() {
        mo1615B(4L);
        return this.f7151R.mo1620L();
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((!this.f7153w) != false) {
                C2361sQ c2361sQ2 = this.f7151R;
                if (c2361sQ2.f7260R == 0 && this.f7152S.mo188M(c2361sQ2, 8192L) == -1) {
                    return -1L;
                }
                return c2361sQ2.mo188M(c2361sQ, Math.min(j, c2361sQ2.f7260R));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount < 0: ", j).toString());
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: O */
    public final long mo1621O(C1623eY c1623eY) {
        if ((!this.f7153w) != false) {
            long j = 0;
            while (true) {
                C2361sQ c2361sQ = this.f7151R;
                long m4084dx = c2361sQ.m4084dx(j, c1623eY);
                if (m4084dx == -1) {
                    long j2 = c2361sQ.f7260R;
                    if (this.f7152S.mo188M(c2361sQ, 8192L) == -1) {
                        return -1L;
                    }
                    j = Math.max(j, j2);
                } else {
                    return m4084dx;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        return this.f7152S.mo189P();
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: U */
    public final String mo1622U(long j) {
        boolean z;
        long j2;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long m3978z = m3978z((byte) 10, 0L, j2);
            C2361sQ c2361sQ = this.f7151R;
            if (m3978z != -1) {
                return AbstractC1756h.m3283h(c2361sQ, m3978z);
            }
            if (j2 < Long.MAX_VALUE && mo1617F(j2) && c2361sQ.m4079U8(j2 - 1) == 13 && mo1617F(1 + j2) && c2361sQ.m4079U8(j2) == 10) {
                return AbstractC1756h.m3283h(c2361sQ, j2);
            }
            C2361sQ c2361sQ2 = new C2361sQ();
            c2361sQ.m4089x(c2361sQ2, 0L, Math.min(32, c2361sQ.f7260R));
            throw new EOFException("\\n not found: limit=" + Math.min(c2361sQ.f7260R, j) + " content=" + c2361sQ2.mo1631q().mo1979N() + (char) 8230);
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("limit < 0: ", j).toString());
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: UZ */
    public final String mo1623UZ(Charset charset) {
        C2361sQ c2361sQ = this.f7151R;
        c2361sQ.m4075O4(this.f7152S);
        return c2361sQ.mo1623UZ(charset);
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: X */
    public final long mo1624X(C1623eY c1623eY) {
        if ((!this.f7153w) != false) {
            long j = 0;
            while (true) {
                C2361sQ c2361sQ = this.f7151R;
                long m4085he = c2361sQ.m4085he(j, c1623eY);
                if (m4085he == -1) {
                    long j2 = c2361sQ.f7260R;
                    if (this.f7152S.mo188M(c2361sQ, 8192L) == -1) {
                        return -1L;
                    }
                    j = Math.max(j, (j2 - c1623eY.f5011S.length) + 1);
                } else {
                    return m4085he;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return -1;
     */
    @Override // p000a.InterfaceC0694N7
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo1625Z(p000a.C2678ya r8) {
        /*
            r7 = this;
            boolean r0 = r7.f7153w
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L31
        L6:
            a.sQ r0 = r7.f7151R
            int r2 = p000a.AbstractC1756h.m3284v(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L21
            if (r2 == r4) goto L1f
            a.eY[] r8 = r8.f8358S
            r8 = r8[r2]
            int r8 = r8.mo1980P()
            long r3 = (long) r8
            r0.mo1632r(r3)
            goto L30
        L1f:
            r2 = r4
            goto L30
        L21:
            a.SS r2 = r7.f7152S
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.mo188M(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L6
            goto L1f
        L30:
            return r2
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2323ri.mo1625Z(a.ya):int");
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: b */
    public final boolean mo1626b() {
        if ((!this.f7153w) != true) {
            throw new IllegalStateException("closed".toString());
        }
        C2361sQ c2361sQ = this.f7151R;
        return c2361sQ.mo1626b() && this.f7152S.mo188M(c2361sQ, 8192L) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f7153w) {
            return;
        }
        this.f7153w = true;
        this.f7152S.close();
        this.f7151R.m4091z();
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: g */
    public final C1623eY mo1627g(long j) {
        mo1615B(j);
        return this.f7151R.mo1627g(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0029, code lost:
    
        if (r4 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002c, code lost:
    
        p000a.AbstractC1292YB.m2665V(16);
        p000a.AbstractC1292YB.m2665V(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0043, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(java.lang.Integer.toString(r8, 16)));
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m3977h() {
        /*
            r11 = this;
            r0 = 1
            r11.mo1615B(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.mo1617F(r6)
            a.sQ r9 = r11.f7151R
            if (r8 == 0) goto L44
            byte r8 = r9.m4079U8(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L44
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            p000a.AbstractC1292YB.m2665V(r1)
            p000a.AbstractC1292YB.m2665V(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L44:
            long r0 = r9.m4073Ha()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2323ri.m3977h():long");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7153w;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: n */
    public final boolean mo1628n(C1623eY c1623eY) {
        byte[] bArr = c1623eY.f5011S;
        int length = bArr.length;
        if ((!this.f7153w) != false) {
            if (length >= 0 && bArr.length - 0 >= length) {
                for (int i = 0; i < length; i++) {
                    long j = i + 0;
                    if (mo1617F(1 + j)) {
                        if (this.f7151R.m4079U8(j) == c1623eY.f5011S[0 + i]) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: n0 */
    public final C0922RM mo1629n0() {
        return new C0922RM(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0031, code lost:
    
        if (r0 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0034, code lost:
    
        p000a.AbstractC1292YB.m2665V(16);
        p000a.AbstractC1292YB.m2665V(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004b, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(java.lang.Integer.toString(r2, 16)));
     */
    @Override // p000a.InterfaceC0694N7
    /* renamed from: nF */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo1630nF() {
        /*
            r6 = this;
            r0 = 1
            r6.mo1615B(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.mo1617F(r2)
            a.sQ r3 = r6.f7151R
            if (r2 == 0) goto L4c
            long r4 = (long) r0
            byte r2 = r3.m4079U8(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4c
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            p000a.AbstractC1292YB.m2665V(r1)
            p000a.AbstractC1292YB.m2665V(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L4c:
            long r0 = r3.mo1630nF()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2323ri.mo1630nF():long");
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: q */
    public final C1623eY mo1631q() {
        C2361sQ c2361sQ = this.f7151R;
        c2361sQ.m4075O4(this.f7152S);
        return c2361sQ.mo1631q();
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: r */
    public final void mo1632r(long j) {
        if ((!this.f7153w) != false) {
            while (j > 0) {
                C2361sQ c2361sQ = this.f7151R;
                if (c2361sQ.f7260R == 0 && this.f7152S.mo188M(c2361sQ, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, c2361sQ.f7260R);
                c2361sQ.mo1632r(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C2361sQ c2361sQ = this.f7151R;
        if (c2361sQ.f7260R == 0 && this.f7152S.mo188M(c2361sQ, 8192L) == -1) {
            return -1;
        }
        return c2361sQ.read(byteBuffer);
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: t */
    public final String mo1633t() {
        return mo1622U(Long.MAX_VALUE);
    }

    public final String toString() {
        return "buffer(" + this.f7152S + ')';
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: v */
    public final C2361sQ mo1634v() {
        return this.f7151R;
    }

    /* renamed from: z */
    public final long m3978z(byte b, long j, long j2) {
        boolean z = true;
        if ((!this.f7153w) != false) {
            long j3 = 0;
            if (0 > j2) {
                z = false;
            }
            if (z) {
                while (j3 < j2) {
                    long m4067BO = this.f7151R.m4067BO(b, j3, j2);
                    if (m4067BO != -1) {
                        return m4067BO;
                    }
                    C2361sQ c2361sQ = this.f7151R;
                    long j4 = c2361sQ.f7260R;
                    if (j4 >= j2 || this.f7152S.mo188M(c2361sQ, 8192L) == -1) {
                        return -1L;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1L;
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4205u("fromIndex=0 toIndex=", j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }
}
