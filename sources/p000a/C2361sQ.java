package p000a;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: a.sQ */
/* loaded from: classes.dex */
public final class C2361sQ implements InterfaceC0694N7, InterfaceC1432as, Cloneable, ByteChannel {

    /* renamed from: R */
    public long f7260R;

    /* renamed from: S */
    public C1740gk f7261S;

    @Override // p000a.InterfaceC0694N7
    /* renamed from: B */
    public final void mo1615B(long j) {
        if (this.f7260R < j) {
            throw new EOFException();
        }
    }

    /* renamed from: BO */
    public final long m4067BO(byte b, long j, long j2) {
        C1740gk c1740gk;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        boolean z = false;
        if (0 <= j3 && j3 <= j4) {
            z = true;
        }
        if (z) {
            long j6 = this.f7260R;
            if (j4 > j6) {
                j4 = j6;
            }
            if (j3 != j4 && (c1740gk = this.f7261S) != null) {
                if (j6 - j3 < j3) {
                    while (j6 > j3) {
                        c1740gk = c1740gk.f5481u;
                        j6 -= c1740gk.f5482v - c1740gk.f5480h;
                    }
                    while (j6 < j4) {
                        byte[] bArr = c1740gk.f5483z;
                        int min = (int) Math.min(c1740gk.f5482v, (c1740gk.f5480h + j4) - j6);
                        for (int i = (int) ((c1740gk.f5480h + j3) - j6); i < min; i++) {
                            if (bArr[i] == b) {
                                return (i - c1740gk.f5480h) + j6;
                            }
                        }
                        j6 += c1740gk.f5482v - c1740gk.f5480h;
                        c1740gk = c1740gk.f5479Q;
                        j3 = j6;
                    }
                } else {
                    while (true) {
                        long j7 = (c1740gk.f5482v - c1740gk.f5480h) + j5;
                        if (j7 > j3) {
                            break;
                        }
                        c1740gk = c1740gk.f5479Q;
                        j5 = j7;
                    }
                    while (j5 < j4) {
                        byte[] bArr2 = c1740gk.f5483z;
                        int min2 = (int) Math.min(c1740gk.f5482v, (c1740gk.f5480h + j4) - j5);
                        for (int i2 = (int) ((c1740gk.f5480h + j3) - j5); i2 < min2; i2++) {
                            if (bArr2[i2] == b) {
                                return (i2 - c1740gk.f5480h) + j5;
                            }
                        }
                        j5 += c1740gk.f5482v - c1740gk.f5480h;
                        c1740gk = c1740gk.f5479Q;
                        j3 = j5;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f7260R + " fromIndex=" + j3 + " toIndex=" + j4).toString());
    }

    /* renamed from: BX */
    public final C1623eY m4068BX(int i) {
        if (i == 0) {
            return C1623eY.f5009I;
        }
        AbstractC0795Op.m1872u(this.f7260R, 0L, i);
        C1740gk c1740gk = this.f7261S;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c1740gk.f5482v;
            int i6 = c1740gk.f5480h;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                c1740gk = c1740gk.f5479Q;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        C1740gk c1740gk2 = this.f7261S;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = c1740gk2.f5483z;
            i2 += c1740gk2.f5482v - c1740gk2.f5480h;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = c1740gk2.f5480h;
            c1740gk2.f5478P = true;
            i7++;
            c1740gk2 = c1740gk2.f5479Q;
        }
        return new C0855Px(bArr, iArr);
    }

    /* renamed from: C */
    public final long m4069C() {
        long j = this.f7260R;
        if (j == 0) {
            return 0L;
        }
        C1740gk c1740gk = this.f7261S.f5481u;
        if (c1740gk.f5482v < 8192 && c1740gk.f5477N) {
            j -= r3 - c1740gk.f5480h;
        }
        return j;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: D */
    public final InterfaceC1432as mo936D(C1623eY c1623eY) {
        c1623eY.mo1983V(this, c1623eY.mo1980P());
        return this;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: EC */
    public final byte mo1616EC() {
        long j = this.f7260R;
        if (j != 0) {
            C1740gk c1740gk = this.f7261S;
            int i = c1740gk.f5480h;
            int i2 = c1740gk.f5482v;
            int i3 = i + 1;
            byte b = c1740gk.f5483z[i];
            this.f7260R = j - 1;
            if (i3 == i2) {
                this.f7261S = c1740gk.m3272z();
                AbstractC0539KA.m1253z(c1740gk);
            } else {
                c1740gk.f5480h = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    /* renamed from: EQ */
    public final void m4070EQ(int i) {
        C1740gk m4081d2 = m4081d2(2);
        int i2 = m4081d2.f5482v;
        int i3 = i2 + 1;
        byte[] bArr = m4081d2.f5483z;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        m4081d2.f5482v = i3 + 1;
        this.f7260R += 2;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: F */
    public final boolean mo1617F(long j) {
        return this.f7260R >= j;
    }

    /* renamed from: Fu */
    public final void m4071Fu(String str) {
        m4078Ry(0, str.length(), str);
    }

    /* renamed from: G5 */
    public final String m4072G5(long j) {
        return m4076Pm(j, AbstractC2047ma.f6374z);
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: H */
    public final /* bridge */ /* synthetic */ InterfaceC1432as mo937H(int i) {
        m4070EQ(i);
        return this;
    }

    /* renamed from: Ha */
    public final long m4073Ha() {
        int i;
        String str;
        if (this.f7260R != 0) {
            long j = -7;
            long j2 = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            do {
                C1740gk c1740gk = this.f7261S;
                byte[] bArr = c1740gk.f5483z;
                int i3 = c1740gk.f5480h;
                int i4 = c1740gk.f5482v;
                while (i3 < i4) {
                    byte b = bArr[i3];
                    if (b >= 48 && b <= 57) {
                        int i5 = 48 - b;
                        if (j2 >= -922337203685477580L && (j2 != -922337203685477580L || i5 >= j)) {
                            j2 = (j2 * 10) + i5;
                        } else {
                            C2361sQ c2361sQ = new C2361sQ();
                            c2361sQ.m4082d3(j2);
                            c2361sQ.m4086nB(b);
                            if (!z) {
                                c2361sQ.mo1616EC();
                            }
                            throw new NumberFormatException("Number too large: ".concat(c2361sQ.m4087oI()));
                        }
                    } else if (b == 45 && i2 == 0) {
                        j--;
                        z = true;
                    } else {
                        z2 = true;
                        break;
                    }
                    i3++;
                    i2++;
                }
                if (i3 == i4) {
                    this.f7261S = c1740gk.m3272z();
                    AbstractC0539KA.m1253z(c1740gk);
                } else {
                    c1740gk.f5480h = i3;
                }
                if (z2) {
                    break;
                }
            } while (this.f7261S != null);
            long j3 = this.f7260R - i2;
            this.f7260R = j3;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            if (i2 < i) {
                if (j3 != 0) {
                    if (z) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" but was 0x");
                    byte m4079U8 = m4079U8(0L);
                    char[] cArr = AbstractC1843ih.f5761z;
                    sb.append(new String(new char[]{cArr[(m4079U8 >> 4) & 15], cArr[m4079U8 & 15]}));
                    throw new NumberFormatException(sb.toString());
                }
                throw new EOFException();
            }
            if (!z) {
                return -j2;
            }
            return j2;
        }
        throw new EOFException();
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: I */
    public final long mo1618I(C2361sQ c2361sQ) {
        long j = this.f7260R;
        if (j > 0) {
            c2361sQ.mo608Q(this, j);
        }
        return j;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: J */
    public final short mo1619J() {
        long j = this.f7260R;
        if (j >= 2) {
            C1740gk c1740gk = this.f7261S;
            int i = c1740gk.f5480h;
            int i2 = c1740gk.f5482v;
            if (i2 - i < 2) {
                return (short) (((mo1616EC() & 255) << 8) | (mo1616EC() & 255));
            }
            int i3 = i + 1;
            byte[] bArr = c1740gk.f5483z;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f7260R = j - 2;
            if (i4 == i2) {
                this.f7261S = c1740gk.m3272z();
                AbstractC0539KA.m1253z(c1740gk);
            } else {
                c1740gk.f5480h = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: K */
    public final /* bridge */ /* synthetic */ InterfaceC1432as mo938K(String str) {
        m4071Fu(str);
        return this;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: L */
    public final int mo1620L() {
        long j = this.f7260R;
        if (j >= 4) {
            C1740gk c1740gk = this.f7261S;
            int i = c1740gk.f5480h;
            int i2 = c1740gk.f5482v;
            if (i2 - i < 4) {
                return ((mo1616EC() & 255) << 24) | ((mo1616EC() & 255) << 16) | ((mo1616EC() & 255) << 8) | (mo1616EC() & 255);
            }
            int i3 = i + 1;
            byte[] bArr = c1740gk.f5483z;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.f7260R = j - 4;
            if (i8 == i2) {
                this.f7261S = c1740gk.m3272z();
                AbstractC0539KA.m1253z(c1740gk);
            } else {
                c1740gk.f5480h = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    /* renamed from: Lq */
    public final byte[] m4074Lq(long j) {
        boolean z;
        int i = 0;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f7260R >= j) {
                int i2 = (int) j;
                byte[] bArr = new byte[i2];
                while (i < i2) {
                    int m4080ZH = m4080ZH(bArr, i, i2 - i);
                    if (m4080ZH != -1) {
                        i += m4080ZH;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount: ", j).toString());
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
            long j2 = this.f7260R;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            c2361sQ.mo608Q(this, j);
            return j;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount < 0: ", j).toString());
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: N */
    public final InterfaceC1432as mo939N(byte[] bArr) {
        m4083dG(bArr, 0, bArr.length);
        return this;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: O */
    public final long mo1621O(C1623eY c1623eY) {
        return m4084dx(0L, c1623eY);
    }

    /* renamed from: O4 */
    public final void m4075O4(InterfaceC0984SS interfaceC0984SS) {
        do {
        } while (interfaceC0984SS.mo188M(this, 8192L) != -1);
    }

    @Override // p000a.InterfaceC0984SS
    /* renamed from: P */
    public final C1819iG mo189P() {
        return C1819iG.f5685P;
    }

    /* renamed from: Pm */
    public final String m4076Pm(long j, Charset charset) {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f7260R >= j) {
                if (j == 0) {
                    return "";
                }
                C1740gk c1740gk = this.f7261S;
                int i = c1740gk.f5480h;
                if (i + j > c1740gk.f5482v) {
                    return new String(m4074Lq(j), charset);
                }
                int i2 = (int) j;
                String str = new String(c1740gk.f5483z, i, i2, charset);
                int i3 = c1740gk.f5480h + i2;
                c1740gk.f5480h = i3;
                this.f7260R -= j;
                if (i3 == c1740gk.f5482v) {
                    this.f7261S = c1740gk.m3272z();
                    AbstractC0539KA.m1253z(c1740gk);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount: ", j).toString());
    }

    @Override // p000a.InterfaceC2578wb
    /* renamed from: Q */
    public final void mo608Q(C2361sQ c2361sQ, long j) {
        boolean z;
        boolean z2;
        int i;
        C1740gk c1740gk;
        boolean z3;
        C1740gk m1252h;
        int i2;
        if (c2361sQ != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC0795Op.m1872u(c2361sQ.f7260R, 0L, j);
            while (j > 0) {
                C1740gk c1740gk2 = c2361sQ.f7261S;
                int i3 = c1740gk2.f5482v;
                int i4 = c1740gk2.f5480h;
                if (j < i3 - i4) {
                    C1740gk c1740gk3 = this.f7261S;
                    if (c1740gk3 != null) {
                        c1740gk = c1740gk3.f5481u;
                    } else {
                        c1740gk = null;
                    }
                    if (c1740gk != null && c1740gk.f5477N) {
                        long j2 = c1740gk.f5482v + j;
                        if (c1740gk.f5478P) {
                            i2 = 0;
                        } else {
                            i2 = c1740gk.f5480h;
                        }
                        if (j2 - i2 <= 8192) {
                            c1740gk2.m3269P(c1740gk, (int) j);
                            c2361sQ.f7260R -= j;
                            this.f7260R += j;
                            return;
                        }
                    }
                    int i5 = (int) j;
                    if (i5 > 0 && i5 <= i3 - i4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (i5 >= 1024) {
                            m1252h = c1740gk2.m3271v();
                        } else {
                            m1252h = AbstractC0539KA.m1252h();
                            int i6 = c1740gk2.f5480h;
                            System.arraycopy(c1740gk2.f5483z, i6, m1252h.f5483z, 0, (i6 + i5) - i6);
                        }
                        m1252h.f5482v = m1252h.f5480h + i5;
                        c1740gk2.f5480h += i5;
                        c1740gk2.f5481u.m3270h(m1252h);
                        c2361sQ.f7261S = m1252h;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                C1740gk c1740gk4 = c2361sQ.f7261S;
                long j3 = c1740gk4.f5482v - c1740gk4.f5480h;
                c2361sQ.f7261S = c1740gk4.m3272z();
                C1740gk c1740gk5 = this.f7261S;
                if (c1740gk5 == null) {
                    this.f7261S = c1740gk4;
                    c1740gk4.f5481u = c1740gk4;
                    c1740gk4.f5479Q = c1740gk4;
                } else {
                    c1740gk5.f5481u.m3270h(c1740gk4);
                    C1740gk c1740gk6 = c1740gk4.f5481u;
                    if (c1740gk6 != c1740gk4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (c1740gk6.f5477N) {
                            int i7 = c1740gk4.f5482v - c1740gk4.f5480h;
                            int i8 = 8192 - c1740gk6.f5482v;
                            if (c1740gk6.f5478P) {
                                i = 0;
                            } else {
                                i = c1740gk6.f5480h;
                            }
                            if (i7 <= i8 + i) {
                                c1740gk4.m3269P(c1740gk6, i7);
                                c1740gk4.m3272z();
                                AbstractC0539KA.m1253z(c1740gk4);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                c2361sQ.f7260R -= j3;
                this.f7260R += j3;
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: R */
    public final /* bridge */ /* synthetic */ InterfaceC1432as mo940R(long j) {
        m4090yF(j);
        return this;
    }

    /* renamed from: Rh */
    public final void m4077Rh(int i) {
        boolean z;
        String str;
        long j;
        long j2;
        if (i < 128) {
            m4086nB(i);
            return;
        }
        if (i < 2048) {
            C1740gk m4081d2 = m4081d2(2);
            int i2 = m4081d2.f5482v;
            byte[] bArr = m4081d2.f5483z;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            m4081d2.f5482v = i2 + 2;
            j = this.f7260R;
            j2 = 2;
        } else {
            int i3 = 0;
            if (55296 <= i && i < 57344) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m4086nB(63);
                return;
            }
            if (i < 65536) {
                C1740gk m4081d22 = m4081d2(3);
                int i4 = m4081d22.f5482v;
                byte[] bArr2 = m4081d22.f5483z;
                bArr2[i4] = (byte) ((i >> 12) | 224);
                bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i4 + 2] = (byte) ((i & 63) | 128);
                m4081d22.f5482v = i4 + 3;
                j = this.f7260R;
                j2 = 3;
            } else if (i <= 1114111) {
                C1740gk m4081d23 = m4081d2(4);
                int i5 = m4081d23.f5482v;
                byte[] bArr3 = m4081d23.f5483z;
                bArr3[i5] = (byte) ((i >> 18) | 240);
                bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i5 + 3] = (byte) ((i & 63) | 128);
                m4081d23.f5482v = i5 + 4;
                j = this.f7260R;
                j2 = 4;
            } else {
                StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
                if (i != 0) {
                    char[] cArr = AbstractC1843ih.f5761z;
                    char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                    while (i3 < 8 && cArr2[i3] == '0') {
                        i3++;
                    }
                    if (i3 >= 0) {
                        if (i3 <= 8) {
                            str = new String(cArr2, i3, 8 - i3);
                        } else {
                            throw new IllegalArgumentException(AbstractC2441tz.m4190Q("startIndex: ", i3, " > endIndex: 8"));
                        }
                    } else {
                        throw new IndexOutOfBoundsException(AbstractC2441tz.m4190Q("startIndex: ", i3, ", endIndex: 8, size: 8"));
                    }
                } else {
                    str = "0";
                }
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f7260R = j + j2;
    }

    /* renamed from: Ry */
    public final void m4078Ry(int i, int i2, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        char charAt;
        long j;
        long j2;
        char c;
        boolean z4;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            C1740gk m4081d2 = m4081d2(1);
                            int i3 = m4081d2.f5482v - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            byte[] bArr = m4081d2.f5483z;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = m4081d2.f5482v;
                            int i6 = (i3 + i) - i5;
                            m4081d2.f5482v = i5 + i6;
                            this.f7260R += i6;
                        } else {
                            if (charAt2 < 2048) {
                                C1740gk m4081d22 = m4081d2(2);
                                int i7 = m4081d22.f5482v;
                                byte[] bArr2 = m4081d22.f5483z;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                m4081d22.f5482v = i7 + 2;
                                j = this.f7260R;
                                j2 = 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = str.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c && c < 57344) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                        C1740gk m4081d23 = m4081d2(4);
                                        int i10 = m4081d23.f5482v;
                                        byte[] bArr3 = m4081d23.f5483z;
                                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                        m4081d23.f5482v = i10 + 4;
                                        this.f7260R += 4;
                                        i += 2;
                                    }
                                }
                                m4086nB(63);
                                i = i8;
                            } else {
                                C1740gk m4081d24 = m4081d2(3);
                                int i11 = m4081d24.f5482v;
                                byte[] bArr4 = m4081d24.f5483z;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                m4081d24.f5482v = i11 + 3;
                                j = this.f7260R;
                                j2 = 3;
                            }
                            this.f7260R = j + j2;
                            i++;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4188N("beginIndex < 0: ", i).toString());
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: S */
    public final InterfaceC1432as mo941S() {
        return this;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: U */
    public final String mo1622U(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long m4067BO = m4067BO((byte) 10, 0L, j2);
            if (m4067BO != -1) {
                return AbstractC1756h.m3283h(this, m4067BO);
            }
            if (j2 < this.f7260R && m4079U8(j2 - 1) == 13 && m4079U8(j2) == 10) {
                return AbstractC1756h.m3283h(this, j2);
            }
            C2361sQ c2361sQ = new C2361sQ();
            m4089x(c2361sQ, 0L, Math.min(32, this.f7260R));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f7260R, j) + " content=" + c2361sQ.mo1631q().mo1979N() + (char) 8230);
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("limit < 0: ", j).toString());
    }

    /* renamed from: U8 */
    public final byte m4079U8(long j) {
        AbstractC0795Op.m1872u(this.f7260R, j, 1L);
        C1740gk c1740gk = this.f7261S;
        c1740gk.getClass();
        long j2 = this.f7260R;
        if (j2 - j < j) {
            while (j2 > j) {
                c1740gk = c1740gk.f5481u;
                j2 -= c1740gk.f5482v - c1740gk.f5480h;
            }
            return c1740gk.f5483z[(int) ((c1740gk.f5480h + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = c1740gk.f5482v;
            int i2 = c1740gk.f5480h;
            long j4 = (i - i2) + j3;
            if (j4 <= j) {
                c1740gk = c1740gk.f5479Q;
                j3 = j4;
            } else {
                return c1740gk.f5483z[(int) ((i2 + j) - j3)];
            }
        }
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: UZ */
    public final String mo1623UZ(Charset charset) {
        return m4076Pm(this.f7260R, charset);
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: X */
    public final long mo1624X(C1623eY c1623eY) {
        return m4085he(0L, c1623eY);
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: Z */
    public final int mo1625Z(C2678ya c2678ya) {
        int m3284v = AbstractC1756h.m3284v(this, c2678ya, false);
        if (m3284v == -1) {
            return -1;
        }
        mo1632r(c2678ya.f8358S[m3284v].mo1980P());
        return m3284v;
    }

    /* renamed from: ZH */
    public final int m4080ZH(byte[] bArr, int i, int i2) {
        AbstractC0795Op.m1872u(bArr.length, i, i2);
        C1740gk c1740gk = this.f7261S;
        if (c1740gk == null) {
            return -1;
        }
        int min = Math.min(i2, c1740gk.f5482v - c1740gk.f5480h);
        int i3 = c1740gk.f5480h;
        System.arraycopy(c1740gk.f5483z, i3, bArr, i, (i3 + min) - i3);
        int i4 = c1740gk.f5480h + min;
        c1740gk.f5480h = i4;
        this.f7260R -= min;
        if (i4 == c1740gk.f5482v) {
            this.f7261S = c1740gk.m3272z();
            AbstractC0539KA.m1253z(c1740gk);
        }
        return min;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: b */
    public final boolean mo1626b() {
        return this.f7260R == 0;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC1432as mo942c(int i, int i2, String str) {
        m4078Ry(i, i2, str);
        return this;
    }

    public final Object clone() {
        C2361sQ c2361sQ = new C2361sQ();
        if (this.f7260R != 0) {
            C1740gk c1740gk = this.f7261S;
            C1740gk m3271v = c1740gk.m3271v();
            c2361sQ.f7261S = m3271v;
            m3271v.f5481u = m3271v;
            m3271v.f5479Q = m3271v;
            for (C1740gk c1740gk2 = c1740gk.f5479Q; c1740gk2 != c1740gk; c1740gk2 = c1740gk2.f5479Q) {
                m3271v.f5481u.m3270h(c1740gk2.m3271v());
            }
            c2361sQ.f7260R = this.f7260R;
        }
        return c2361sQ;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000a.InterfaceC2578wb
    public final void close() {
    }

    /* renamed from: d2 */
    public final C1740gk m4081d2(int i) {
        if (!(i >= 1 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C1740gk c1740gk = this.f7261S;
        if (c1740gk == null) {
            C1740gk m1252h = AbstractC0539KA.m1252h();
            this.f7261S = m1252h;
            m1252h.f5481u = m1252h;
            m1252h.f5479Q = m1252h;
            return m1252h;
        }
        C1740gk c1740gk2 = c1740gk.f5481u;
        if (c1740gk2.f5482v + i <= 8192 && c1740gk2.f5477N) {
            return c1740gk2;
        }
        C1740gk m1252h2 = AbstractC0539KA.m1252h();
        c1740gk2.m3270h(m1252h2);
        return m1252h2;
    }

    /* renamed from: d3 */
    public final C2361sQ m4082d3(long j) {
        boolean z;
        byte[] bArr;
        if (j == 0) {
            m4086nB(48);
        } else {
            int i = 1;
            if (j < 0) {
                j = -j;
                if (j < 0) {
                    m4071Fu("-9223372036854775808");
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (j < 100000000) {
                if (j < 10000) {
                    if (j < 100) {
                        if (j >= 10) {
                            i = 2;
                        }
                    } else if (j < 1000) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                } else if (j < 1000000) {
                    if (j < 100000) {
                        i = 5;
                    } else {
                        i = 6;
                    }
                } else if (j < 10000000) {
                    i = 7;
                } else {
                    i = 8;
                }
            } else if (j < 1000000000000L) {
                if (j < 10000000000L) {
                    if (j < 1000000000) {
                        i = 9;
                    } else {
                        i = 10;
                    }
                } else if (j < 100000000000L) {
                    i = 11;
                } else {
                    i = 12;
                }
            } else if (j < 1000000000000000L) {
                if (j < 10000000000000L) {
                    i = 13;
                } else if (j < 100000000000000L) {
                    i = 14;
                } else {
                    i = 15;
                }
            } else if (j < 100000000000000000L) {
                if (j < 10000000000000000L) {
                    i = 16;
                } else {
                    i = 17;
                }
            } else if (j < 1000000000000000000L) {
                i = 18;
            } else {
                i = 19;
            }
            if (z) {
                i++;
            }
            C1740gk m4081d2 = m4081d2(i);
            int i2 = m4081d2.f5482v + i;
            while (true) {
                bArr = m4081d2.f5483z;
                if (j == 0) {
                    break;
                }
                long j2 = 10;
                i2--;
                bArr[i2] = AbstractC1756h.f5545z[(int) (j % j2)];
                j /= j2;
            }
            if (z) {
                bArr[i2 - 1] = 45;
            }
            m4081d2.f5482v += i;
            this.f7260R += i;
        }
        return this;
    }

    /* renamed from: dG */
    public final void m4083dG(byte[] bArr, int i, int i2) {
        long j = i2;
        AbstractC0795Op.m1872u(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C1740gk m4081d2 = m4081d2(1);
            int min = Math.min(i3 - i, 8192 - m4081d2.f5482v);
            int i4 = i + min;
            System.arraycopy(bArr, i, m4081d2.f5483z, m4081d2.f5482v, i4 - i);
            m4081d2.f5482v += min;
            i = i4;
        }
        this.f7260R += j;
    }

    /* renamed from: dx */
    public final long m4084dx(long j, C1623eY c1623eY) {
        boolean z;
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1740gk c1740gk = this.f7261S;
            if (c1740gk != null) {
                long j3 = this.f7260R;
                if (j3 - j < j) {
                    while (j3 > j) {
                        c1740gk = c1740gk.f5481u;
                        j3 -= c1740gk.f5482v - c1740gk.f5480h;
                    }
                    byte[] bArr = c1623eY.f5011S;
                    if (bArr.length == 2) {
                        byte b = bArr[0];
                        byte b2 = bArr[1];
                        while (j3 < this.f7260R) {
                            byte[] bArr2 = c1740gk.f5483z;
                            i2 = (int) ((c1740gk.f5480h + j) - j3);
                            int i3 = c1740gk.f5482v;
                            while (i2 < i3) {
                                byte b3 = bArr2[i2];
                                if (b3 != b && b3 != b2) {
                                    i2++;
                                }
                                return (i2 - c1740gk.f5480h) + j3;
                            }
                            j3 += c1740gk.f5482v - c1740gk.f5480h;
                            c1740gk = c1740gk.f5479Q;
                            j = j3;
                        }
                    } else {
                        while (j3 < this.f7260R) {
                            byte[] bArr3 = c1740gk.f5483z;
                            i2 = (int) ((c1740gk.f5480h + j) - j3);
                            int i4 = c1740gk.f5482v;
                            while (i2 < i4) {
                                byte b4 = bArr3[i2];
                                for (byte b5 : bArr) {
                                    if (b4 == b5) {
                                        return (i2 - c1740gk.f5480h) + j3;
                                    }
                                }
                                i2++;
                            }
                            j3 += c1740gk.f5482v - c1740gk.f5480h;
                            c1740gk = c1740gk.f5479Q;
                            j = j3;
                        }
                    }
                } else {
                    while (true) {
                        long j4 = (c1740gk.f5482v - c1740gk.f5480h) + j2;
                        if (j4 > j) {
                            break;
                        }
                        c1740gk = c1740gk.f5479Q;
                        j2 = j4;
                    }
                    byte[] bArr4 = c1623eY.f5011S;
                    if (bArr4.length == 2) {
                        byte b6 = bArr4[0];
                        byte b7 = bArr4[1];
                        while (j2 < this.f7260R) {
                            byte[] bArr5 = c1740gk.f5483z;
                            i = (int) ((c1740gk.f5480h + j) - j2);
                            int i5 = c1740gk.f5482v;
                            while (i < i5) {
                                byte b8 = bArr5[i];
                                if (b8 != b6 && b8 != b7) {
                                    i++;
                                }
                                return (i - c1740gk.f5480h) + j2;
                            }
                            j2 += c1740gk.f5482v - c1740gk.f5480h;
                            c1740gk = c1740gk.f5479Q;
                            j = j2;
                        }
                    } else {
                        while (j2 < this.f7260R) {
                            byte[] bArr6 = c1740gk.f5483z;
                            i = (int) ((c1740gk.f5480h + j) - j2);
                            int i6 = c1740gk.f5482v;
                            while (i < i6) {
                                byte b9 = bArr6[i];
                                for (byte b10 : bArr4) {
                                    if (b9 == b10) {
                                        return (i - c1740gk.f5480h) + j2;
                                    }
                                }
                                i++;
                            }
                            j2 += c1740gk.f5482v - c1740gk.f5480h;
                            c1740gk = c1740gk.f5479Q;
                            j = j2;
                        }
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("fromIndex < 0: ", j).toString());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2361sQ) {
                long j = this.f7260R;
                C2361sQ c2361sQ = (C2361sQ) obj;
                if (j == c2361sQ.f7260R) {
                    if (j != 0) {
                        C1740gk c1740gk = this.f7261S;
                        C1740gk c1740gk2 = c2361sQ.f7261S;
                        int i = c1740gk.f5480h;
                        int i2 = c1740gk2.f5480h;
                        long j2 = 0;
                        while (j2 < this.f7260R) {
                            long min = Math.min(c1740gk.f5482v - i, c1740gk2.f5482v - i2);
                            long j3 = 0;
                            while (j3 < min) {
                                int i3 = i + 1;
                                byte b = c1740gk.f5483z[i];
                                int i4 = i2 + 1;
                                if (b == c1740gk2.f5483z[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == c1740gk.f5482v) {
                                C1740gk c1740gk3 = c1740gk.f5479Q;
                                i = c1740gk3.f5480h;
                                c1740gk = c1740gk3;
                            }
                            if (i2 == c1740gk2.f5482v) {
                                c1740gk2 = c1740gk2.f5479Q;
                                i2 = c1740gk2.f5480h;
                            }
                            j2 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // p000a.InterfaceC1432as, p000a.InterfaceC2578wb, java.io.Flushable
    public final void flush() {
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: g */
    public final C1623eY mo1627g(long j) {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f7260R >= j) {
                if (j >= 4096) {
                    C1623eY m4068BX = m4068BX((int) j);
                    mo1632r(j);
                    return m4068BX;
                }
                return new C1623eY(m4074Lq(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount: ", j).toString());
    }

    public final int hashCode() {
        C1740gk c1740gk = this.f7261S;
        if (c1740gk == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c1740gk.f5482v;
            for (int i3 = c1740gk.f5480h; i3 < i2; i3++) {
                i = (i * 31) + c1740gk.f5483z[i3];
            }
            c1740gk = c1740gk.f5479Q;
        } while (c1740gk != this.f7261S);
        return i;
    }

    /* renamed from: he */
    public final long m4085he(long j, C1623eY c1623eY) {
        boolean z;
        long j2 = j;
        boolean z2 = true;
        if (c1623eY.f5011S.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = 0;
            if (j2 < 0) {
                z2 = false;
            }
            if (z2) {
                C1740gk c1740gk = this.f7261S;
                if (c1740gk != null) {
                    long j4 = this.f7260R;
                    long j5 = j4 - j2;
                    byte[] bArr = c1623eY.f5011S;
                    if (j5 < j2) {
                        while (j4 > j2) {
                            c1740gk = c1740gk.f5481u;
                            j4 -= c1740gk.f5482v - c1740gk.f5480h;
                        }
                        byte b = bArr[0];
                        int length = bArr.length;
                        long j6 = (this.f7260R - length) + 1;
                        while (j4 < j6) {
                            byte[] bArr2 = c1740gk.f5483z;
                            long j7 = j6;
                            int min = (int) Math.min(c1740gk.f5482v, (c1740gk.f5480h + j6) - j4);
                            for (int i = (int) ((c1740gk.f5480h + j2) - j4); i < min; i++) {
                                if (bArr2[i] == b && AbstractC1756h.m3285z(c1740gk, i + 1, bArr, length)) {
                                    return (i - c1740gk.f5480h) + j4;
                                }
                            }
                            j4 += c1740gk.f5482v - c1740gk.f5480h;
                            c1740gk = c1740gk.f5479Q;
                            j2 = j4;
                            j6 = j7;
                        }
                    } else {
                        while (true) {
                            long j8 = (c1740gk.f5482v - c1740gk.f5480h) + j3;
                            if (j8 > j2) {
                                break;
                            }
                            c1740gk = c1740gk.f5479Q;
                            j3 = j8;
                        }
                        byte b2 = bArr[0];
                        int length2 = bArr.length;
                        long j9 = (this.f7260R - length2) + 1;
                        while (j3 < j9) {
                            byte[] bArr3 = c1740gk.f5483z;
                            long j10 = j9;
                            int min2 = (int) Math.min(c1740gk.f5482v, (c1740gk.f5480h + j9) - j3);
                            for (int i2 = (int) ((c1740gk.f5480h + j2) - j3); i2 < min2; i2++) {
                                if (bArr3[i2] == b2 && AbstractC1756h.m3285z(c1740gk, i2 + 1, bArr, length2)) {
                                    return (i2 - c1740gk.f5480h) + j3;
                                }
                            }
                            j3 += c1740gk.f5482v - c1740gk.f5480h;
                            c1740gk = c1740gk.f5479Q;
                            j2 = j3;
                            j9 = j10;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(AbstractC2441tz.m4205u("fromIndex < 0: ", j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ InterfaceC1432as mo943i(int i) {
        m4088tJ(i);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ InterfaceC1432as mo944m(long j) {
        m4082d3(j);
        return this;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: n */
    public final boolean mo1628n(C1623eY c1623eY) {
        byte[] bArr = c1623eY.f5011S;
        int length = bArr.length;
        if (length < 0 || this.f7260R - 0 < length || bArr.length - 0 < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (m4079U8(i + 0) != c1623eY.f5011S[0 + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: n0 */
    public final C0922RM mo1629n0() {
        return new C0922RM(this, 0);
    }

    /* renamed from: nB */
    public final void m4086nB(int i) {
        C1740gk m4081d2 = m4081d2(1);
        int i2 = m4081d2.f5482v;
        m4081d2.f5482v = i2 + 1;
        m4081d2.f5483z[i2] = (byte) i;
        this.f7260R++;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a1 A[EDGE_INSN: B:94:0x00a1->B:90:0x00a1 BREAK  A[LOOP:0: B:56:0x000c->B:98:?], SYNTHETIC] */
    @Override // p000a.InterfaceC0694N7
    /* renamed from: nF */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo1630nF() {
        /*
            r15 = this;
            long r0 = r15.f7260R
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La8
            r0 = 0
            r1 = r0
            r4 = r1
            r5 = r2
        Lc:
            a.gk r7 = r15.f7261S
            byte[] r8 = r7.f5483z
            int r9 = r7.f5480h
            int r10 = r7.f5482v
        L14:
            if (r9 >= r10) goto L8d
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L23
            r12 = 57
            if (r11 > r12) goto L23
            int r12 = r11 + (-48)
            goto L3a
        L23:
            r12 = 97
            if (r11 < r12) goto L2e
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L2e
            int r12 = r11 + (-97)
            goto L38
        L2e:
            r12 = 65
            if (r11 < r12) goto L65
            r12 = 70
            if (r11 > r12) goto L65
            int r12 = r11 + (-65)
        L38:
            int r12 = r12 + 10
        L3a:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r5
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4a
            r11 = 4
            long r5 = r5 << r11
            long r11 = (long) r12
            long r5 = r5 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L14
        L4a:
            a.sQ r0 = new a.sQ
            r0.<init>()
            r0.m4090yF(r5)
            r0.m4086nB(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.m4087oI()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L65:
            r4 = 1
            if (r1 == 0) goto L69
            goto L8d
        L69:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 2
            char[] r2 = new char[r2]
            char[] r3 = p000a.AbstractC1843ih.f5761z
            int r5 = r11 >> 4
            r5 = r5 & 15
            char r5 = r3[r5]
            r2[r0] = r5
            r0 = r11 & 15
            char r0 = r3[r0]
            r2[r4] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8d:
            if (r9 != r10) goto L99
            a.gk r8 = r7.m3272z()
            r15.f7261S = r8
            p000a.AbstractC0539KA.m1253z(r7)
            goto L9b
        L99:
            r7.f5480h = r9
        L9b:
            if (r4 != 0) goto La1
            a.gk r7 = r15.f7261S
            if (r7 != 0) goto Lc
        La1:
            long r2 = r15.f7260R
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f7260R = r2
            return r5
        La8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2361sQ.mo1630nF():long");
    }

    /* renamed from: oI */
    public final String m4087oI() {
        return m4076Pm(this.f7260R, AbstractC2047ma.f6374z);
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: q */
    public final C1623eY mo1631q() {
        return mo1627g(this.f7260R);
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: qn */
    public final /* bridge */ /* synthetic */ InterfaceC1432as mo945qn(int i) {
        m4086nB(i);
        return this;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: r */
    public final void mo1632r(long j) {
        while (j > 0) {
            C1740gk c1740gk = this.f7261S;
            if (c1740gk != null) {
                int min = (int) Math.min(j, c1740gk.f5482v - c1740gk.f5480h);
                long j2 = min;
                this.f7260R -= j2;
                j -= j2;
                int i = c1740gk.f5480h + min;
                c1740gk.f5480h = i;
                if (i == c1740gk.f5482v) {
                    this.f7261S = c1740gk.m3272z();
                    AbstractC0539KA.m1253z(c1740gk);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C1740gk c1740gk = this.f7261S;
        if (c1740gk == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c1740gk.f5482v - c1740gk.f5480h);
        byteBuffer.put(c1740gk.f5483z, c1740gk.f5480h, min);
        int i = c1740gk.f5480h + min;
        c1740gk.f5480h = i;
        this.f7260R -= min;
        if (i == c1740gk.f5482v) {
            this.f7261S = c1740gk.m3272z();
            AbstractC0539KA.m1253z(c1740gk);
        }
        return min;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: t */
    public final String mo1633t() {
        return mo1622U(Long.MAX_VALUE);
    }

    /* renamed from: tJ */
    public final void m4088tJ(int i) {
        C1740gk m4081d2 = m4081d2(4);
        int i2 = m4081d2.f5482v;
        int i3 = i2 + 1;
        byte[] bArr = m4081d2.f5483z;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        m4081d2.f5482v = i5 + 1;
        this.f7260R += 4;
    }

    public final String toString() {
        boolean z;
        long j = this.f7260R;
        if (j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m4068BX((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f7260R).toString());
    }

    @Override // p000a.InterfaceC1432as
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ InterfaceC1432as mo946u(byte[] bArr, int i, int i2) {
        m4083dG(bArr, i, i2);
        return this;
    }

    @Override // p000a.InterfaceC0694N7
    /* renamed from: v */
    public final C2361sQ mo1634v() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C1740gk m4081d2 = m4081d2(1);
            int min = Math.min(i, 8192 - m4081d2.f5482v);
            byteBuffer.get(m4081d2.f5483z, m4081d2.f5482v, min);
            i -= min;
            m4081d2.f5482v += min;
        }
        this.f7260R += remaining;
        return remaining;
    }

    /* renamed from: x */
    public final void m4089x(C2361sQ c2361sQ, long j, long j2) {
        AbstractC0795Op.m1872u(this.f7260R, j, j2);
        if (j2 != 0) {
            c2361sQ.f7260R += j2;
            C1740gk c1740gk = this.f7261S;
            while (true) {
                long j3 = c1740gk.f5482v - c1740gk.f5480h;
                if (j < j3) {
                    break;
                }
                j -= j3;
                c1740gk = c1740gk.f5479Q;
            }
            while (j2 > 0) {
                C1740gk m3271v = c1740gk.m3271v();
                int i = m3271v.f5480h + ((int) j);
                m3271v.f5480h = i;
                m3271v.f5482v = Math.min(i + ((int) j2), m3271v.f5482v);
                C1740gk c1740gk2 = c2361sQ.f7261S;
                if (c1740gk2 == null) {
                    m3271v.f5481u = m3271v;
                    m3271v.f5479Q = m3271v;
                    c2361sQ.f7261S = m3271v;
                } else {
                    c1740gk2.f5481u.m3270h(m3271v);
                }
                j2 -= m3271v.f5482v - m3271v.f5480h;
                c1740gk = c1740gk.f5479Q;
                j = 0;
            }
        }
    }

    /* renamed from: yF */
    public final C2361sQ m4090yF(long j) {
        if (j == 0) {
            m4086nB(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
            C1740gk m4081d2 = m4081d2(i);
            int i2 = m4081d2.f5482v;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                m4081d2.f5483z[i3] = AbstractC1756h.f5545z[(int) (15 & j)];
                j >>>= 4;
            }
            m4081d2.f5482v += i;
            this.f7260R += i;
        }
        return this;
    }

    /* renamed from: z */
    public final void m4091z() {
        mo1632r(this.f7260R);
    }
}
