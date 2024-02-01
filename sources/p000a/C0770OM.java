package p000a;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: a.OM */
/* loaded from: classes.dex */
public final class C0770OM extends AbstractC1906js {

    /* renamed from: G */
    public boolean f2617G;

    /* renamed from: M */
    public boolean f2619M;

    /* renamed from: N */
    public C2254qS f2620N;

    /* renamed from: P */
    public Socket f2621P;

    /* renamed from: Q */
    public EnumC1854ix f2622Q;

    /* renamed from: R */
    public int f2623R;

    /* renamed from: S */
    public int f2624S;

    /* renamed from: V */
    public int f2625V;

    /* renamed from: W */
    public C0418Hu f2626W;

    /* renamed from: h */
    public final C1946ke f2627h;

    /* renamed from: o */
    public C2323ri f2628o;

    /* renamed from: u */
    public C0669Mf f2630u;

    /* renamed from: v */
    public Socket f2631v;

    /* renamed from: w */
    public int f2632w = 1;

    /* renamed from: I */
    public final ArrayList f2618I = new ArrayList();

    /* renamed from: q */
    public long f2629q = Long.MAX_VALUE;

    public C0770OM(C1946ke c1946ke) {
        this.f2627h = c1946ke;
    }

    /* renamed from: P */
    public static void m1777P(C0234ES c0234es, C1946ke c1946ke, IOException iOException) {
        if (c1946ke.f6032h.type() != Proxy.Type.DIRECT) {
            C2305rO c2305rO = c1946ke.f6034z;
            c2305rO.f7115o.connectFailed(c2305rO.f7113W.m4565o(), c1946ke.f6032h.address(), iOException);
        }
        C0175DP c0175dp = c0234es.f788x;
        synchronized (c0175dp) {
            ((Set) c0175dp.f541R).add(c1946ke);
        }
    }

    /* renamed from: G */
    public final boolean m1778G(boolean z) {
        long j;
        byte[] bArr = AbstractC1181W6.f3860z;
        long nanoTime = System.nanoTime();
        Socket socket = this.f2631v;
        Socket socket2 = this.f2621P;
        C2323ri c2323ri = this.f2628o;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C0669Mf c0669Mf = this.f2630u;
        if (c0669Mf != null) {
            return c0669Mf.m1563V(nanoTime);
        }
        synchronized (this) {
            j = nanoTime - this.f2629q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z2 = !c2323ri.mo1626b();
                socket2.setSoTimeout(soTimeout);
                return z2;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: M */
    public final InterfaceC0297Fe m1779M(C0234ES c0234es, C2515vK c2515vK) {
        Socket socket = this.f2621P;
        C2323ri c2323ri = this.f2628o;
        C0418Hu c0418Hu = this.f2626W;
        C0669Mf c0669Mf = this.f2630u;
        if (c0669Mf != null) {
            return new C1437ay(c0234es, this, c2515vK, c0669Mf);
        }
        int i = c2515vK.f7703u;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c2323ri.mo189P().mo378u(i, timeUnit);
        c0418Hu.mo607P().mo378u(c2515vK.f7702o, timeUnit);
        return new C1177W2(c0234es, this, c2323ri, c0418Hu);
    }

    /* renamed from: N */
    public final void m1780N(int i, int i2, C1710g8 c1710g8) {
        int i3;
        Socket createSocket;
        C1946ke c1946ke = this.f2627h;
        Proxy proxy = c1946ke.f6032h;
        C2305rO c2305rO = c1946ke.f6034z;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i3 = -1;
        } else {
            i3 = AbstractC0454Ic.f1525z[type.ordinal()];
        }
        if (i3 != 1 && i3 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = c2305rO.f7114h.createSocket();
        }
        this.f2631v = createSocket;
        InetSocketAddress inetSocketAddress = this.f2627h.f6033v;
        c1710g8.getClass();
        createSocket.setSoTimeout(i2);
        try {
            C0799Ov c0799Ov = C0799Ov.f2726z;
            C0799Ov.f2726z.mo1883N(createSocket, this.f2627h.f6033v, i);
            try {
                Logger logger = AbstractC0982SQ.f3316z;
                C1052Ti c1052Ti = new C1052Ti(createSocket);
                this.f2628o = new C2323ri(new C2294rC(c1052Ti, new C2294rC(createSocket.getInputStream(), c1052Ti)));
                C1052Ti c1052Ti2 = new C1052Ti(createSocket);
                this.f2626W = new C0418Hu(new C0292FY(c1052Ti2, new C0292FY(createSocket.getOutputStream(), c1052Ti2)));
            } catch (NullPointerException e) {
                if (!AbstractC1292YB.m2695u(e.getMessage(), "throw with null exception")) {
                } else {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f2627h.f6033v);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: Q */
    public final void m1781Q(int i, int i2, int i3, C1710g8 c1710g8) {
        C2306rP c2306rP = new C2306rP();
        C1946ke c1946ke = this.f2627h;
        c2306rP.f7123z = c1946ke.f6034z.f7113W;
        c2306rP.m3964v("CONNECT", null);
        C2305rO c2305rO = c1946ke.f6034z;
        c2306rP.f7122v.m3043u("Host", AbstractC1181W6.m2432y(c2305rO.f7113W, true));
        c2306rP.f7122v.m3043u("Proxy-Connection", "Keep-Alive");
        c2306rP.f7122v.m3043u("User-Agent", "okhttp/4.12.0");
        C1364ZX m3965z = c2306rP.m3965z();
        C2368sZ c2368sZ = new C2368sZ();
        c2368sZ.f7286z = m3965z;
        c2368sZ.f7282h = EnumC1854ix.f5784w;
        c2368sZ.f7285v = 407;
        c2368sZ.f7277P = "Preemptive Authenticate";
        c2368sZ.f7284u = AbstractC1181W6.f3859v;
        c2368sZ.f7275M = -1L;
        c2368sZ.f7280V = -1L;
        c2368sZ.f7278Q.m3043u("Proxy-Authenticate", "OkHttp-Preemptive");
        c2368sZ.m4094z();
        c2305rO.f7112Q.getClass();
        C2658y7 c2658y7 = (C2658y7) m3965z.f4279h;
        m1780N(i, i2, c1710g8);
        String str = "CONNECT " + AbstractC1181W6.m2432y(c2658y7, true) + " HTTP/1.1";
        C2323ri c2323ri = this.f2628o;
        C0418Hu c0418Hu = this.f2626W;
        C1177W2 c1177w2 = new C1177W2(null, this, c2323ri, c0418Hu);
        C1819iG mo189P = c2323ri.mo189P();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo189P.mo378u(j, timeUnit);
        c0418Hu.mo607P().mo378u(i3, timeUnit);
        c1177w2.m2406G((C1494c7) m3965z.f4277P, str);
        c1177w2.mo627P();
        C2368sZ mo628Q = c1177w2.mo628Q(false);
        mo628Q.f7286z = m3965z;
        C1429ap m4094z = mo628Q.m4094z();
        long m2422W = AbstractC1181W6.m2422W(m4094z);
        if (m2422W != -1) {
            C0937Rd m2407W = c1177w2.m2407W(m2422W);
            AbstractC1181W6.m2425k(m2407W, Integer.MAX_VALUE, timeUnit);
            m2407W.close();
        }
        int i4 = m4094z.f4465I;
        if (i4 != 200) {
            if (i4 == 407) {
                c2305rO.f7112Q.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(AbstractC2441tz.m4188N("Unexpected response code for CONNECT: ", i4));
        }
        if (c2323ri.f7151R.mo1626b() && c0418Hu.f1391R.mo1626b()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* renamed from: S */
    public final void m1782S(int i) {
        int i2;
        Socket socket = this.f2621P;
        C2323ri c2323ri = this.f2628o;
        C0418Hu c0418Hu = this.f2626W;
        int i3 = 0;
        socket.setSoTimeout(0);
        C0634Lw c0634Lw = C0634Lw.f2051o;
        C2522vR c2522vR = new C2522vR(c0634Lw);
        String str = this.f2627h.f6034z.f7113W.f8279P;
        c2522vR.f7725h = socket;
        c2522vR.f7727v = AbstractC1181W6.f3858u + ' ' + str;
        c2522vR.f7723P = c2323ri;
        c2522vR.f7722N = c0418Hu;
        c2522vR.f7724Q = this;
        c2522vR.f7726u = i;
        C0669Mf c0669Mf = new C0669Mf(c2522vR);
        this.f2630u = c0669Mf;
        C1148VU c1148vu = C0669Mf.f2184O;
        if ((c1148vu.f3733z & 16) != 0) {
            i2 = c1148vu.f3732h[4];
        } else {
            i2 = Integer.MAX_VALUE;
        }
        this.f2632w = i2;
        C2483uo c2483uo = c0669Mf.f2191L;
        synchronized (c2483uo) {
            if (!c2483uo.f7608q) {
                if (c2483uo.f7605R) {
                    Logger logger = C2483uo.f7603g;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC1181W6.m2429u(">> CONNECTION " + AbstractC2367sX.f7273z.mo1979N(), new Object[0]));
                    }
                    c2483uo.f7606S.mo936D(AbstractC2367sX.f7273z);
                    c2483uo.f7606S.flush();
                }
            } else {
                throw new IOException("closed");
            }
        }
        c0669Mf.f2191L.m4263U8(c0669Mf.f2200e);
        if (c0669Mf.f2200e.m2360z() != 65535) {
            c0669Mf.f2191L.m4260BO(0, r0 - 65535);
        }
        c0634Lw.m1425Q().m3579v(new C2717zI(1, c0669Mf.f2203i, c0669Mf.f2189I, i3), 0L);
    }

    /* renamed from: V */
    public final synchronized void m1783V() {
        this.f2617G = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x00b7, code lost:
    
        if (r10 != false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m1784W(p000a.C2305rO r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0770OM.m1784W(a.rO, java.util.List):boolean");
    }

    @Override // p000a.AbstractC1906js
    /* renamed from: h */
    public final void mo1785h(C0573Kk c0573Kk) {
        c0573Kk.m1305v(EnumC0754O6.f2561k, null);
    }

    /* renamed from: o */
    public final synchronized void m1786o() {
        this.f2624S++;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C1946ke c1946ke = this.f2627h;
        sb.append(c1946ke.f6034z.f7113W.f8279P);
        sb.append(':');
        sb.append(c1946ke.f6034z.f7113W.f8278N);
        sb.append(", proxy=");
        sb.append(c1946ke.f6032h);
        sb.append(" hostAddress=");
        sb.append(c1946ke.f6033v);
        sb.append(" cipherSuite=");
        C2254qS c2254qS = this.f2620N;
        if (c2254qS == null || (obj = c2254qS.f6941h) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f2622Q);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1787u(C2532ve c2532ve, int i, C1710g8 c1710g8) {
        SSLSocket sSLSocket;
        C2305rO c2305rO = this.f2627h.f6034z;
        SSLSocketFactory sSLSocketFactory = c2305rO.f7117v;
        EnumC1854ix enumC1854ix = EnumC1854ix.f5784w;
        if (sSLSocketFactory == null) {
            List list = c2305rO.f7108G;
            EnumC1854ix enumC1854ix2 = EnumC1854ix.f5782k;
            if (list.contains(enumC1854ix2)) {
                this.f2621P = this.f2631v;
                this.f2622Q = enumC1854ix2;
                m1782S(i);
                return;
            } else {
                this.f2621P = this.f2631v;
                this.f2622Q = enumC1854ix;
                return;
            }
        }
        c1710g8.getClass();
        C2305rO c2305rO2 = this.f2627h.f6034z;
        SSLSocketFactory sSLSocketFactory2 = c2305rO2.f7117v;
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            Socket socket = this.f2631v;
            C2658y7 c2658y7 = c2305rO2.f7113W;
            sSLSocket = (SSLSocket) sSLSocketFactory2.createSocket(socket, c2658y7.f8279P, c2658y7.f8278N, true);
        } catch (Throwable th) {
            th = th;
        }
        try {
            C0673Mk m4366z = c2532ve.m4366z(sSLSocket);
            if (m4366z.f2222h) {
                C0799Ov c0799Ov = C0799Ov.f2726z;
                C0799Ov.f2726z.mo297P(sSLSocket, c2305rO2.f7113W.f8279P, c2305rO2.f7108G);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C2254qS m3238w = C1710g8.m3238w(session);
            int i2 = 2;
            if (!c2305rO2.f7111P.verify(c2305rO2.f7113W.f8279P, session)) {
                List m3898z = m3238w.m3898z();
                if ((!m3898z.isEmpty()) != false) {
                    X509Certificate x509Certificate = (X509Certificate) m3898z.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(c2305rO2.f7113W.f8279P);
                    sb.append(" not verified:\n              |    certificate: ");
                    C2216pl c2216pl = C2216pl.f6824v;
                    if (x509Certificate instanceof X509Certificate) {
                        StringBuilder sb2 = new StringBuilder("sha256/");
                        C1623eY c1623eY = C1623eY.f5009I;
                        sb2.append(C2252qQ.m3890k(x509Certificate.getPublicKey().getEncoded()).mo1988v("SHA-256").mo1989z());
                        sb.append(sb2.toString());
                        sb.append("\n              |    DN: ");
                        sb.append(x509Certificate.getSubjectDN().getName());
                        sb.append("\n              |    subjectAltNames: ");
                        sb.append(AbstractC2486us.m4280M6(C1113Uq.m2293z(x509Certificate, 2), C1113Uq.m2293z(x509Certificate, 7)));
                        sb.append("\n              ");
                        throw new SSLPeerUnverifiedException(AbstractC0438II.m989BO(sb.toString()));
                    }
                    throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
                }
                throw new SSLPeerUnverifiedException("Hostname " + c2305rO2.f7113W.f8279P + " not verified (no certificates)");
            }
            C2216pl c2216pl2 = c2305rO2.f7110N;
            this.f2620N = new C2254qS(m3238w.f6943z, m3238w.f6941h, m3238w.f6942v, new C2663yE(i2, c2216pl2, m3238w, c2305rO2));
            String str2 = c2305rO2.f7113W.f8279P;
            Iterator it = c2216pl2.f6826z.iterator();
            if (!it.hasNext()) {
                if (m4366z.f2222h) {
                    C0799Ov c0799Ov2 = C0799Ov.f2726z;
                    str = C0799Ov.f2726z.mo298Q(sSLSocket);
                }
                this.f2621P = sSLSocket;
                Logger logger = AbstractC0982SQ.f3316z;
                C1052Ti c1052Ti = new C1052Ti(sSLSocket);
                this.f2628o = new C2323ri(new C2294rC(c1052Ti, new C2294rC(sSLSocket.getInputStream(), c1052Ti)));
                C1052Ti c1052Ti2 = new C1052Ti(sSLSocket);
                this.f2626W = new C0418Hu(new C0292FY(c1052Ti2, new C0292FY(sSLSocket.getOutputStream(), c1052Ti2)));
                if (str != null) {
                    enumC1854ix = C1710g8.m3234q(str);
                }
                this.f2622Q = enumC1854ix;
                C0799Ov c0799Ov3 = C0799Ov.f2726z;
                C0799Ov.f2726z.mo1889z(sSLSocket);
                if (this.f2622Q == EnumC1854ix.f5783q) {
                    m1782S(i);
                    return;
                }
                return;
            }
            AbstractC2441tz.m4202q(it.next());
            throw null;
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                C0799Ov c0799Ov4 = C0799Ov.f2726z;
                C0799Ov.f2726z.mo1889z(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                AbstractC1181W6.m2416P(sSLSocket2);
            }
            throw th;
        }
    }

    /* renamed from: v */
    public final void m1788v(int i, int i2, int i3, int i4, boolean z, C0523Jr c0523Jr, C1710g8 c1710g8) {
        C1946ke c1946ke;
        boolean z2 = false;
        if (!(this.f2622Q == null)) {
            throw new IllegalStateException("already connected".toString());
        }
        C2305rO c2305rO = this.f2627h.f6034z;
        List list = c2305rO.f7109M;
        C2532ve c2532ve = new C2532ve(list);
        if (c2305rO.f7117v == null) {
            if (!list.contains(C0673Mk.f2220Q)) {
                throw new C1458bN(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f2627h.f6034z.f7113W.f8279P;
            C0799Ov c0799Ov = C0799Ov.f2726z;
            if (!C0799Ov.f2726z.mo300o(str)) {
                throw new C1458bN(new UnknownServiceException(AbstractC2441tz.m4184G("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c2305rO.f7108G.contains(EnumC1854ix.f5782k)) {
            throw new C1458bN(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C1458bN c1458bN = null;
        do {
            try {
                C1946ke c1946ke2 = this.f2627h;
                if (c1946ke2.f6034z.f7117v != null && c1946ke2.f6032h.type() == Proxy.Type.HTTP) {
                    m1781Q(i, i2, i3, c1710g8);
                    if (this.f2631v == null) {
                        c1946ke = this.f2627h;
                        if (c1946ke.f6034z.f7117v != null && c1946ke.f6032h.type() == Proxy.Type.HTTP) {
                            z2 = true;
                        }
                        if (!z2 && this.f2631v == null) {
                            throw new C1458bN(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f2629q = System.nanoTime();
                        return;
                    }
                } else {
                    m1780N(i, i2, c1710g8);
                }
                m1787u(c2532ve, i4, c1710g8);
                InetSocketAddress inetSocketAddress = this.f2627h.f6033v;
                c1946ke = this.f2627h;
                if (c1946ke.f6034z.f7117v != null) {
                    z2 = true;
                }
                if (!z2) {
                }
                this.f2629q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.f2621P;
                if (socket != null) {
                    AbstractC1181W6.m2416P(socket);
                }
                Socket socket2 = this.f2631v;
                if (socket2 != null) {
                    AbstractC1181W6.m2416P(socket2);
                }
                this.f2621P = null;
                this.f2631v = null;
                this.f2628o = null;
                this.f2626W = null;
                this.f2620N = null;
                this.f2622Q = null;
                this.f2630u = null;
                this.f2632w = 1;
                InetSocketAddress inetSocketAddress2 = this.f2627h.f6033v;
                if (c1458bN == null) {
                    c1458bN = new C1458bN(e);
                } else {
                    AbstractC1292YB.m2655N(c1458bN.f4548S, e);
                    c1458bN.f4547R = e;
                }
                if (z) {
                    c2532ve.f7752P = true;
                } else {
                    throw c1458bN;
                }
            }
        } while ((!c2532ve.f7754v || (e instanceof ProtocolException) || (e instanceof InterruptedIOException) || ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException) || !(e instanceof SSLException)) ? false : true);
        throw c1458bN;
    }

    @Override // p000a.AbstractC1906js
    /* renamed from: z */
    public final synchronized void mo1789z(C1148VU c1148vu) {
        int i;
        if ((c1148vu.f3733z & 16) != 0) {
            i = c1148vu.f3732h[4];
        } else {
            i = Integer.MAX_VALUE;
        }
        this.f2632w = i;
    }
}
