package p000a;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: a.or */
/* loaded from: classes.dex */
public final class C2167or implements Closeable {

    /* renamed from: q */
    public static final Logger f6641q = Logger.getLogger(AbstractC2367sX.class.getName());

    /* renamed from: I */
    public final C2277qs f6642I;

    /* renamed from: R */
    public final boolean f6643R;

    /* renamed from: S */
    public final InterfaceC0694N7 f6644S;

    /* renamed from: w */
    public final C2126o6 f6645w;

    public C2167or(InterfaceC0694N7 interfaceC0694N7, boolean z) {
        this.f6644S = interfaceC0694N7;
        this.f6643R = z;
        C2126o6 c2126o6 = new C2126o6(interfaceC0694N7);
        this.f6645w = c2126o6;
        this.f6642I = new C2277qs(c2126o6);
    }

    /* renamed from: C */
    public final void m3779C(C0166DE c0166de, int i, int i2, int i3) {
        boolean z;
        if (i == 8) {
            if (i3 == 0) {
                int mo1620L = this.f6644S.mo1620L();
                int mo1620L2 = this.f6644S.mo1620L();
                if ((i2 & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C0669Mf c0669Mf = c0166de.f523R;
                    synchronized (c0669Mf) {
                        if (mo1620L != 1) {
                            if (mo1620L != 2) {
                                if (mo1620L == 3) {
                                    c0669Mf.notifyAll();
                                }
                            } else {
                                c0669Mf.f2198c++;
                            }
                        } else {
                            c0669Mf.f2196Y++;
                        }
                    }
                    return;
                }
                c0166de.f523R.f2209s.m3579v(new C1753gx(AbstractC2441tz.m4187M(new StringBuilder(), c0166de.f523R.f2189I, " ping"), c0166de.f523R, mo1620L, mo1620L2), 0L);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException(AbstractC2441tz.m4188N("TYPE_PING length != 8: ", i));
    }

    /* renamed from: G */
    public final void m3780G(C0166DE c0166de, int i, int i2) {
        int i3;
        Object[] array;
        if (i >= 8) {
            if (i2 == 0) {
                int mo1620L = this.f6644S.mo1620L();
                int mo1620L2 = this.f6644S.mo1620L();
                int i4 = i - 8;
                if (C2252qQ.m3887V(mo1620L2) != null) {
                    C1623eY c1623eY = C1623eY.f5009I;
                    if (i4 > 0) {
                        c1623eY = this.f6644S.mo1627g(i4);
                    }
                    c0166de.getClass();
                    c1623eY.mo1980P();
                    C0669Mf c0669Mf = c0166de.f523R;
                    synchronized (c0669Mf) {
                        array = c0669Mf.f2210w.values().toArray(new C0573Kk[0]);
                        c0669Mf.f2202g = true;
                    }
                    for (C0573Kk c0573Kk : (C0573Kk[]) array) {
                        if (c0573Kk.f1868z > mo1620L && c0573Kk.m1303o()) {
                            c0573Kk.m1296M(EnumC0754O6.f2561k);
                            c0166de.f523R.m1567y(c0573Kk.f1868z);
                        }
                    }
                    return;
                }
                throw new IOException(AbstractC2441tz.m4188N("TYPE_GOAWAY unexpected error code: ", mo1620L2));
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException(AbstractC2441tz.m4188N("TYPE_GOAWAY length < 8: ", i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: U8 */
    public final void m3781U8(C0166DE c0166de, int i, int i2) {
        C0573Kk c0573Kk;
        if (i == 4) {
            int mo1620L = this.f6644S.mo1620L();
            byte[] bArr = AbstractC1181W6.f3860z;
            long j = mo1620L & 2147483647L;
            if (j != 0) {
                if (i2 == 0) {
                    C0669Mf c0669Mf = c0166de.f523R;
                    synchronized (c0669Mf) {
                        c0669Mf.f2206p += j;
                        c0669Mf.notifyAll();
                        c0573Kk = c0669Mf;
                    }
                } else {
                    C0573Kk m1561G = c0166de.f523R.m1561G(i2);
                    if (m1561G != null) {
                        synchronized (m1561G) {
                            m1561G.f1859Q += j;
                            c0573Kk = m1561G;
                            if (j > 0) {
                                m1561G.notifyAll();
                                c0573Kk = m1561G;
                            }
                        }
                    } else {
                        return;
                    }
                }
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException(AbstractC2441tz.m4188N("TYPE_WINDOW_UPDATE length !=4: ", i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ee, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r3.f7005z);
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m3782V(int r3, int r4, int r5, int r6) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2167or.m3782V(int, int, int, int):java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6644S.close();
    }

    /* renamed from: h */
    public final void m3783h(C0166DE c0166de) {
        if (this.f6643R) {
            if (!m3786z(true, c0166de)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        C1623eY c1623eY = AbstractC2367sX.f7273z;
        C1623eY mo1627g = this.f6644S.mo1627g(c1623eY.f5011S.length);
        Level level = Level.FINE;
        Logger logger = f6641q;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC1181W6.m2429u("<< CONNECTION " + mo1627g.mo1979N(), new Object[0]));
        }
        if (AbstractC1292YB.m2695u(c1623eY, mo1627g)) {
        } else {
            throw new IOException("Expected a connection header but was ".concat(mo1627g.m3077M()));
        }
    }

    /* renamed from: x */
    public final void m3784x(C0166DE c0166de, int i, int i2, int i3) {
        int i4;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                byte mo1616EC = this.f6644S.mo1616EC();
                byte[] bArr = AbstractC1181W6.f3860z;
                i4 = mo1616EC & 255;
            } else {
                i4 = 0;
            }
            int mo1620L = this.f6644S.mo1620L() & Integer.MAX_VALUE;
            List m3782V = m3782V(C2252qQ.m3883I(i - 4, i2, i4), i4, i2, i3);
            C0669Mf c0669Mf = c0166de.f523R;
            synchronized (c0669Mf) {
                if (c0669Mf.f2199d.contains(Integer.valueOf(mo1620L))) {
                    c0669Mf.m1559BO(mo1620L, EnumC0754O6.f2563w);
                    return;
                }
                c0669Mf.f2199d.add(Integer.valueOf(mo1620L));
                c0669Mf.f2194U.m3579v(new C0128CT(c0669Mf.f2189I + '[' + mo1620L + "] onRequest", c0669Mf, mo1620L, m3782V, 2), 0L);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    /* renamed from: y */
    public final void m3785y(C0166DE c0166de, int i, int i2, int i3) {
        boolean z;
        int i4;
        if (i3 != 0) {
            boolean z2 = false;
            int i5 = 1;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 8) != 0) {
                byte mo1616EC = this.f6644S.mo1616EC();
                byte[] bArr = AbstractC1181W6.f3860z;
                i4 = mo1616EC & 255;
            } else {
                i4 = 0;
            }
            if ((i2 & 32) != 0) {
                InterfaceC0694N7 interfaceC0694N7 = this.f6644S;
                interfaceC0694N7.mo1620L();
                interfaceC0694N7.mo1616EC();
                byte[] bArr2 = AbstractC1181W6.f3860z;
                c0166de.getClass();
                i -= 5;
            }
            List m3782V = m3782V(C2252qQ.m3883I(i, i2, i4), i4, i2, i3);
            c0166de.f523R.getClass();
            if (i3 != 0 && (i3 & 1) == 0) {
                z2 = true;
            }
            C0669Mf c0669Mf = c0166de.f523R;
            if (z2) {
                c0669Mf.f2194U.m3579v(new C0246Ei(c0669Mf.f2189I + '[' + i3 + "] onHeaders", c0669Mf, i3, m3782V, z), 0L);
                return;
            }
            synchronized (c0669Mf) {
                C0573Kk m1561G = c0669Mf.m1561G(i3);
                if (m1561G == null) {
                    if (!c0669Mf.f2202g && i3 > c0669Mf.f2207q && i3 % 2 != c0669Mf.f2205k % 2) {
                        C0573Kk c0573Kk = new C0573Kk(i3, c0669Mf, false, z, AbstractC1181W6.m2423g(m3782V));
                        c0669Mf.f2207q = i3;
                        c0669Mf.f2210w.put(Integer.valueOf(i3), c0573Kk);
                        c0669Mf.f2211y.m1425Q().m3579v(new C0961S1(c0669Mf.f2189I + '[' + i3 + "] onStream", c0669Mf, c0573Kk, i5), 0L);
                    }
                    return;
                }
                m1561G.m1295G(AbstractC1181W6.m2423g(m3782V), z);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    /* renamed from: z */
    public final boolean m3786z(boolean z, C0166DE c0166de) {
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        int mo1620L;
        String m2429u;
        boolean z7 = false;
        try {
            this.f6644S.mo1615B(9L);
            InterfaceC0694N7 interfaceC0694N7 = this.f6644S;
            byte[] bArr = AbstractC1181W6.f3860z;
            int mo1616EC = (interfaceC0694N7.mo1616EC() & 255) | ((interfaceC0694N7.mo1616EC() & 255) << 16) | ((interfaceC0694N7.mo1616EC() & 255) << 8);
            if (mo1616EC <= 16384) {
                int mo1616EC2 = this.f6644S.mo1616EC() & 255;
                int mo1616EC3 = this.f6644S.mo1616EC() & 255;
                int mo1620L2 = this.f6644S.mo1620L() & Integer.MAX_VALUE;
                Logger logger = f6641q;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(AbstractC2367sX.m4092z(mo1620L2, mo1616EC, mo1616EC2, mo1616EC3, true));
                }
                if (z && mo1616EC2 != 4) {
                    StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                    String[] strArr = AbstractC2367sX.f7271h;
                    if (mo1616EC2 < strArr.length) {
                        m2429u = strArr[mo1616EC2];
                    } else {
                        m2429u = AbstractC1181W6.m2429u("0x%02x", Integer.valueOf(mo1616EC2));
                    }
                    sb.append(m2429u);
                    throw new IOException(sb.toString());
                }
                switch (mo1616EC2) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        if (mo1620L2 != 0) {
                            if ((mo1616EC3 & 1) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((mo1616EC3 & 32) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                if ((mo1616EC3 & 8) != 0) {
                                    i = this.f6644S.mo1616EC() & 255;
                                } else {
                                    i = 0;
                                }
                                int m3883I = C2252qQ.m3883I(mo1616EC, mo1616EC3, i);
                                InterfaceC0694N7 interfaceC0694N72 = this.f6644S;
                                c0166de.f523R.getClass();
                                if (mo1620L2 != 0 && (mo1620L2 & 1) == 0) {
                                    z7 = true;
                                }
                                if (z7) {
                                    C0669Mf c0669Mf = c0166de.f523R;
                                    c0669Mf.getClass();
                                    C2361sQ c2361sQ = new C2361sQ();
                                    long j = m3883I;
                                    interfaceC0694N72.mo1615B(j);
                                    interfaceC0694N72.mo188M(c2361sQ, j);
                                    c0669Mf.f2194U.m3579v(new C0269F8(c0669Mf.f2189I + '[' + mo1620L2 + "] onData", c0669Mf, mo1620L2, c2361sQ, m3883I, z2), 0L);
                                } else {
                                    C0573Kk m1561G = c0166de.f523R.m1561G(mo1620L2);
                                    if (m1561G == null) {
                                        c0166de.f523R.m1559BO(mo1620L2, EnumC0754O6.f2563w);
                                        long j2 = m3883I;
                                        c0166de.f523R.m1566x(j2);
                                        interfaceC0694N72.mo1632r(j2);
                                    } else {
                                        C0082Ba c0082Ba = m1561G.f1863W;
                                        long j3 = m3883I;
                                        C0573Kk c0573Kk = c0082Ba.f323k;
                                        long j4 = 0;
                                        long j5 = j3;
                                        while (true) {
                                            if (j5 > j4) {
                                                synchronized (c0082Ba.f323k) {
                                                    z4 = c0082Ba.f321R;
                                                    if (c0082Ba.f320I.f7260R + j5 > c0082Ba.f322S) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                }
                                                if (z5) {
                                                    interfaceC0694N72.mo1632r(j5);
                                                    c0082Ba.f323k.m1297N(EnumC0754O6.f2562q);
                                                } else if (z4) {
                                                    interfaceC0694N72.mo1632r(j5);
                                                } else {
                                                    long mo188M = interfaceC0694N72.mo188M(c0082Ba.f325w, j5);
                                                    if (mo188M != -1) {
                                                        j5 -= mo188M;
                                                        C0573Kk c0573Kk2 = c0082Ba.f323k;
                                                        synchronized (c0573Kk2) {
                                                            if (c0082Ba.f324q) {
                                                                c0082Ba.f325w.m4091z();
                                                                j4 = 0;
                                                            } else {
                                                                C2361sQ c2361sQ2 = c0082Ba.f320I;
                                                                if (c2361sQ2.f7260R == 0) {
                                                                    z6 = true;
                                                                } else {
                                                                    z6 = false;
                                                                }
                                                                c2361sQ2.m4075O4(c0082Ba.f325w);
                                                                if (z6) {
                                                                    c0573Kk2.notifyAll();
                                                                }
                                                                j4 = 0;
                                                            }
                                                        }
                                                    } else {
                                                        throw new EOFException();
                                                    }
                                                }
                                            } else {
                                                c0082Ba.m190z(j3);
                                            }
                                        }
                                        if (z2) {
                                            m1561G.m1295G(AbstractC1181W6.f3857h, true);
                                        }
                                    }
                                }
                                this.f6644S.mo1632r(i);
                                break;
                            } else {
                                throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                            }
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        }
                    case 1:
                        m3785y(c0166de, mo1616EC, mo1616EC3, mo1620L2);
                        return true;
                    case 2:
                        if (mo1616EC == 5) {
                            if (mo1620L2 != 0) {
                                InterfaceC0694N7 interfaceC0694N73 = this.f6644S;
                                interfaceC0694N73.mo1620L();
                                interfaceC0694N73.mo1616EC();
                                c0166de.getClass();
                                return true;
                            }
                            throw new IOException("TYPE_PRIORITY streamId == 0");
                        }
                        throw new IOException(AbstractC2441tz.m4190Q("TYPE_PRIORITY length: ", mo1616EC, " != 5"));
                    case 3:
                        if (mo1616EC == 4) {
                            if (mo1620L2 != 0) {
                                int mo1620L3 = this.f6644S.mo1620L();
                                EnumC0754O6 m3887V = C2252qQ.m3887V(mo1620L3);
                                if (m3887V != null) {
                                    C0669Mf c0669Mf2 = c0166de.f523R;
                                    c0669Mf2.getClass();
                                    if (mo1620L2 != 0 && (mo1620L2 & 1) == 0) {
                                        z7 = true;
                                    }
                                    if (z7) {
                                        c0669Mf2.f2194U.m3579v(new C0128CT(c0669Mf2.f2189I + '[' + mo1620L2 + "] onReset", c0669Mf2, mo1620L2, m3887V, 0), 0L);
                                        return true;
                                    }
                                    C0573Kk m1567y = c0669Mf2.m1567y(mo1620L2);
                                    if (m1567y == null) {
                                        return true;
                                    }
                                    m1567y.m1296M(m3887V);
                                    return true;
                                }
                                throw new IOException(AbstractC2441tz.m4188N("TYPE_RST_STREAM unexpected error code: ", mo1620L3));
                            }
                            throw new IOException("TYPE_RST_STREAM streamId == 0");
                        }
                        throw new IOException(AbstractC2441tz.m4190Q("TYPE_RST_STREAM length: ", mo1616EC, " != 4"));
                    case 4:
                        if (mo1620L2 == 0) {
                            if ((mo1616EC3 & 1) != 0) {
                                if (mo1616EC == 0) {
                                    return true;
                                }
                                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                            }
                            if (mo1616EC % 6 == 0) {
                                C1148VU c1148vu = new C1148VU();
                                C0760OC m2649HL = AbstractC1292YB.m2649HL(AbstractC1292YB.m2645EC(0, mo1616EC), 6);
                                int i2 = m2649HL.f2577S;
                                int i3 = m2649HL.f2576R;
                                int i4 = m2649HL.f2578w;
                                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                                    while (true) {
                                        InterfaceC0694N7 interfaceC0694N74 = this.f6644S;
                                        short mo1619J = interfaceC0694N74.mo1619J();
                                        byte[] bArr2 = AbstractC1181W6.f3860z;
                                        int i5 = mo1619J & 65535;
                                        mo1620L = interfaceC0694N74.mo1620L();
                                        if (i5 != 2) {
                                            if (i5 != 3) {
                                                if (i5 != 4) {
                                                    if (i5 == 5 && (mo1620L < 16384 || mo1620L > 16777215)) {
                                                    }
                                                } else if (mo1620L >= 0) {
                                                    i5 = 7;
                                                } else {
                                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                }
                                            } else {
                                                i5 = 4;
                                            }
                                        } else if (mo1620L != 0 && mo1620L != 1) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        c1148vu.m2359h(i5, mo1620L);
                                        if (i2 != i3) {
                                            i2 += i4;
                                        }
                                    }
                                    throw new IOException(AbstractC2441tz.m4188N("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", mo1620L));
                                }
                                C0669Mf c0669Mf3 = c0166de.f523R;
                                c0669Mf3.f2209s.m3579v(new C1808i3(AbstractC2441tz.m4187M(new StringBuilder(), c0669Mf3.f2189I, " applyAndAckSettings"), c0166de, c1148vu), 0L);
                                return true;
                            }
                            throw new IOException(AbstractC2441tz.m4188N("TYPE_SETTINGS length % 6 != 0: ", mo1616EC));
                        }
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    case 5:
                        m3784x(c0166de, mo1616EC, mo1616EC3, mo1620L2);
                        return true;
                    case 6:
                        m3779C(c0166de, mo1616EC, mo1616EC3, mo1620L2);
                        return true;
                    case 7:
                        m3780G(c0166de, mo1616EC, mo1620L2);
                        return true;
                    case 8:
                        m3781U8(c0166de, mo1616EC, mo1620L2);
                        return true;
                    default:
                        this.f6644S.mo1632r(mo1616EC);
                        break;
                }
                return true;
            }
            throw new IOException(AbstractC2441tz.m4188N("FRAME_SIZE_ERROR: ", mo1616EC));
        } catch (EOFException unused) {
            return false;
        }
    }
}
