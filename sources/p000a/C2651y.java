package p000a;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: a.y */
/* loaded from: classes.dex */
public final class C2651y extends FilterInputStream {

    /* renamed from: R */
    public final boolean f8262R;

    /* renamed from: S */
    public final int f8263S;

    /* renamed from: w */
    public final byte[][] f8264w;

    public C2651y(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        this(byteArrayInputStream, i, z, new byte[11]);
    }

    /* renamed from: G */
    public static char[] m4549G(C1312YZ c1312yz) {
        int i;
        int i2 = c1312yz.f4175I;
        if ((i2 & 1) == 0) {
            int i3 = i2 / 2;
            char[] cArr = new char[i3];
            byte[] bArr = new byte[8];
            int i4 = 0;
            int i5 = 0;
            while (i2 >= 8) {
                if (AbstractC0438II.m1006O(c1312yz, bArr, 8) == 8) {
                    cArr[i5] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                    cArr[i5 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                    cArr[i5 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                    cArr[i5 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                    i5 += 4;
                    i2 -= 8;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (i2 > 0) {
                if (AbstractC0438II.m1006O(c1312yz, bArr, i2) == i2) {
                    while (true) {
                        int i6 = i4 + 1;
                        int i7 = i6 + 1;
                        i = i5 + 1;
                        cArr[i5] = (char) ((bArr[i4] << 8) | (bArr[i6] & 255));
                        if (i7 >= i2) {
                            break;
                        }
                        i4 = i7;
                        i5 = i;
                    }
                    i5 = i;
                } else {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
            }
            if (c1312yz.f4175I == 0 && i3 == i5) {
                return cArr;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    /* renamed from: V */
    public static byte[] m4550V(C1312YZ c1312yz, byte[][] bArr) {
        int i = c1312yz.f4175I;
        if (i >= bArr.length) {
            return c1312yz.m2707h();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i == bArr2.length) {
            if (i != 0) {
                int i2 = c1312yz.f4418R;
                if (i < i2) {
                    int m1006O = i - AbstractC0438II.m1006O(c1312yz.f4419S, bArr2, bArr2.length);
                    c1312yz.f4175I = m1006O;
                    if (m1006O == 0) {
                        c1312yz.m2825z();
                    } else {
                        throw new EOFException("DEF length " + c1312yz.f4176w + " object truncated by " + c1312yz.f4175I);
                    }
                } else {
                    throw new IOException("corrupted stream - out of bounds length found: " + c1312yz.f4175I + " >= " + i2);
                }
            }
            return bArr2;
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    /* renamed from: h */
    public static AbstractC1593e m4551h(int i, C1312YZ c1312yz, byte[][] bArr) {
        int i2 = 0;
        try {
            switch (i) {
                case 1:
                    return C0637M.m1428y(m4550V(c1312yz, bArr));
                case 2:
                    return new C2339s(c1312yz.m2707h());
                case 3:
                    return AbstractC1176W.m2405y(c1312yz.m2707h());
                case 4:
                    byte[] m2707h = c1312yz.m2707h();
                    C2120o c2120o = AbstractC0477J.f1589R;
                    return new C1745gp(m2707h);
                case 5:
                    if (c1312yz.m2707h().length == 0) {
                        return C1618eR.f5003S;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    byte[] m4550V = m4550V(c1312yz, bArr);
                    C2120o c2120o2 = C1281Y.f4114w;
                    C1281Y c1281y = (C1281Y) C1281Y.f4113I.get(new C2282r(m4550V));
                    if (c1281y == null) {
                        return new C1281Y(m4550V, true);
                    }
                    return c1281y;
                case 7:
                    return new C1648f(new C1338Z4(c1312yz.m2707h()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    byte[] m4550V2 = m4550V(c1312yz, bArr);
                    if (m4550V2.length > 1) {
                        return new C0422I(m4550V2, true);
                    }
                    if (m4550V2.length != 0) {
                        int i3 = m4550V2[0] & 255;
                        if (i3 >= 12) {
                            return new C0422I(m4550V2, true);
                        }
                        C0422I[] c0422iArr = C0422I.f1398R;
                        C0422I c0422i = c0422iArr[i3];
                        if (c0422i == null) {
                            c0422i = new C0422I(m4550V2, true);
                            c0422iArr[i3] = c0422i;
                        }
                        return c0422i;
                    }
                    throw new IllegalArgumentException("ENUMERATED has zero length");
                case 12:
                    return new C2303rM(c1312yz.m2707h());
                case 13:
                    return new C1230X(c1312yz.m2707h());
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i + " encountered");
                case 18:
                    return new C1226Wu(c1312yz.m2707h());
                case 19:
                    return new C0194Dj(c1312yz.m2707h());
                case 20:
                    return new C0300Fh(c1312yz.m2707h());
                case 21:
                    return new C1714gD(c1312yz.m2707h());
                case 22:
                    return new C2732zZ(c1312yz.m2707h());
                case 23:
                    return new C0588L(c1312yz.m2707h());
                case 24:
                    return new C1702g(c1312yz.m2707h());
                case 25:
                    return new C1338Z4(c1312yz.m2707h());
                case 26:
                    return new C0822PL(c1312yz.m2707h());
                case 27:
                    return new C1156Ve(c1312yz.m2707h());
                case 28:
                    return new C0538K9(c1312yz.m2707h());
                case 30:
                    return new C0884Qc(m4549G(c1312yz));
            }
        } catch (IllegalArgumentException e) {
            throw new C2228q(i2, e.getMessage(), e);
        } catch (IllegalStateException e2) {
            throw new C2228q(i2, e2.getMessage(), e2);
        }
    }

    /* renamed from: x */
    public static int m4552x(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read < 31) {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i3 = read & 127;
        if (i3 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((read & 128) != 0) {
            if ((i3 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            int i4 = i3 << 7;
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i3 = i4 | (read2 & 127);
            read = read2;
        }
        return i3;
    }

    /* renamed from: y */
    public static int m4553y(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == read) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i2 = read & 127;
        int i3 = 0;
        int i4 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i3 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i3 = (i3 << 8) + read2;
            i4++;
        } while (i4 < i2);
        if (i3 < i || z) {
            return i3;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i3 + " >= " + i);
    }

    /* renamed from: C */
    public final AbstractC1593e m4554C() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int m4552x = m4552x(this, read);
        int i = this.f8263S;
        int i2 = 0;
        int m4553y = m4553y(this, i, false);
        if (m4553y >= 0) {
            try {
                return m4556z(read, m4552x, m4553y);
            } catch (IllegalArgumentException e) {
                throw new C2228q(i2, "corrupted stream detected", e);
            }
        }
        if ((read & 32) != 0) {
            C2382so c2382so = new C2382so(new C2133oE(this, i), i, this.f8264w);
            int i3 = read & 192;
            if (i3 != 0) {
                return c2382so.m4104Q(i3, m4552x);
            }
            if (m4552x != 3) {
                if (m4552x != 4) {
                    if (m4552x != 8) {
                        if (m4552x != 16) {
                            if (m4552x == 17) {
                                return new C0448IW(c2382so.m4107o());
                            }
                            throw new IOException("unknown BER object encountered");
                        }
                        return new C0622Lh(c2382so.m4107o());
                    }
                    try {
                        return new C0283FN(new C0423I1(c2382so.m4107o()), 1);
                    } catch (IllegalArgumentException e2) {
                        throw new C2228q(i2, e2.getMessage(), e2);
                    }
                }
                return new C1787hb(AbstractC0438II.m1029i(new C1115Us(c2382so)));
            }
            C2144oR c2144oR = new C2144oR(c2382so);
            return new C1400aG(c2144oR.f6594I, AbstractC0438II.m1029i(c2144oR));
        }
        throw new IOException("indefinite-length primitive encoding encountered");
    }

    /* renamed from: U8 */
    public final C2551w m4555U8(C1312YZ c1312yz) {
        int i = c1312yz.f4175I;
        if (i < 1) {
            return new C2551w(0);
        }
        C2651y c2651y = new C2651y(c1312yz, i, this.f8262R, this.f8264w);
        AbstractC1593e m4554C = c2651y.m4554C();
        if (m4554C == null) {
            return new C2551w(0);
        }
        C2551w c2551w = new C2551w();
        do {
            c2551w.m4371z(m4554C);
            m4554C = c2651y.m4554C();
        } while (m4554C != null);
        return c2551w;
    }

    /* renamed from: z */
    public final AbstractC1593e m4556z(int i, int i2, int i3) {
        C1312YZ c1312yz = new C1312YZ(this, i3, this.f8263S);
        if ((i & 224) == 0) {
            return m4551h(i2, c1312yz, this.f8264w);
        }
        int i4 = i & 192;
        boolean z = true;
        int i5 = 0;
        if (i4 != 0) {
            if ((i & 32) == 0) {
                z = false;
            }
            if (!z) {
                return new C1524cl(4, i4, i2, new C1745gp(c1312yz.m2707h()), 1);
            }
            return AbstractC1857j.m3473y(i4, i2, m4555U8(c1312yz));
        }
        if (i2 != 3) {
            if (i2 != 4) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 == 17) {
                            C2551w m4555U8 = m4555U8(c1312yz);
                            C0423I1 c0423i1 = AbstractC1768hF.f5571z;
                            if (m4555U8.f7796h < 1) {
                                return AbstractC1768hF.f5570h;
                            }
                            return new C0152Cy(m4555U8);
                        }
                        throw new IOException(AbstractC2441tz.m4190Q("unknown tag ", i2, " encountered"));
                    }
                    if (c1312yz.f4175I < 1) {
                        return AbstractC1768hF.f5571z;
                    }
                    if (this.f8262R) {
                        return new C0072BP(c1312yz.m2707h());
                    }
                    return AbstractC1768hF.m3296z(m4555U8(c1312yz));
                }
                return AbstractC1768hF.m3296z(m4555U8(c1312yz)).m951H();
            }
            C2551w m4555U82 = m4555U8(c1312yz);
            int i6 = m4555U82.f7796h;
            AbstractC0477J[] abstractC0477JArr = new AbstractC0477J[i6];
            while (i5 != i6) {
                InterfaceC0959S m4370v = m4555U82.m4370v(i5);
                if (m4370v instanceof AbstractC0477J) {
                    abstractC0477JArr[i5] = (AbstractC0477J) m4370v;
                    i5++;
                } else {
                    throw new C2228q("unknown object encountered in constructed OCTET STRING: " + m4370v.getClass());
                }
            }
            return new C1787hb(C1787hb.m3324s(abstractC0477JArr), abstractC0477JArr);
        }
        C2551w m4555U83 = m4555U8(c1312yz);
        int i7 = m4555U83.f7796h;
        AbstractC1176W[] abstractC1176WArr = new AbstractC1176W[i7];
        while (i5 != i7) {
            InterfaceC0959S m4370v2 = m4555U83.m4370v(i5);
            if (m4370v2 instanceof AbstractC1176W) {
                abstractC1176WArr[i5] = (AbstractC1176W) m4370v2;
                i5++;
            } else {
                throw new C2228q("unknown object encountered in constructed BIT STRING: " + m4370v2.getClass());
            }
        }
        return new C1400aG(abstractC1176WArr);
    }

    public C2651y(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.f8263S = i;
        this.f8262R = z;
        this.f8264w = bArr;
    }

    public C2651y(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    public C2651y(byte[] bArr, int i) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }
}
