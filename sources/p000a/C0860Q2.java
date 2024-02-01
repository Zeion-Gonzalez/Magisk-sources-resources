package p000a;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: a.Q2 */
/* loaded from: classes.dex */
public final class C0860Q2 {

    /* renamed from: N */
    public int f2905N;

    /* renamed from: P */
    public List f2906P;

    /* renamed from: Q */
    public List f2907Q;

    /* renamed from: h */
    public final C0175DP f2908h;

    /* renamed from: u */
    public final ArrayList f2909u;

    /* renamed from: v */
    public final C1710g8 f2910v;

    /* renamed from: z */
    public final C2305rO f2911z;

    public C0860Q2(C2305rO c2305rO, C0175DP c0175dp, C0523Jr c0523Jr, C1710g8 c1710g8) {
        boolean z;
        List m2428s;
        this.f2911z = c2305rO;
        this.f2908h = c0175dp;
        this.f2910v = c1710g8;
        C1239X8 c1239x8 = C1239X8.f4021S;
        this.f2906P = c1239x8;
        this.f2907Q = c1239x8;
        this.f2909u = new ArrayList();
        Proxy proxy = c2305rO.f7116u;
        if (proxy != null) {
            m2428s = Collections.singletonList(proxy);
        } else {
            URI m4565o = c2305rO.f7113W.m4565o();
            if (m4565o.getHost() == null) {
                m2428s = AbstractC1181W6.m2412G(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = c2305rO.f7115o.select(m4565o);
                if (select != null && !select.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    m2428s = AbstractC1181W6.m2412G(Proxy.NO_PROXY);
                } else {
                    m2428s = AbstractC1181W6.m2428s(select);
                }
            }
        }
        this.f2906P = m2428s;
        this.f2905N = 0;
    }

    /* renamed from: h */
    public final C1077UB m1994h() {
        boolean z;
        boolean z2;
        String str;
        int i;
        List mo1688h;
        boolean contains;
        if (m1995z()) {
            ArrayList arrayList = new ArrayList();
            do {
                boolean z3 = false;
                if (this.f2905N < this.f2906P.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
                if (this.f2905N < this.f2906P.size()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C2305rO c2305rO = this.f2911z;
                if (z2) {
                    List list = this.f2906P;
                    int i2 = this.f2905N;
                    this.f2905N = i2 + 1;
                    Proxy proxy = (Proxy) list.get(i2);
                    ArrayList arrayList2 = new ArrayList();
                    this.f2907Q = arrayList2;
                    if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                        SocketAddress address = proxy.address();
                        if (address instanceof InetSocketAddress) {
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                            InetAddress address2 = inetSocketAddress.getAddress();
                            if (address2 == null) {
                                str = inetSocketAddress.getHostName();
                            } else {
                                str = address2.getHostAddress();
                            }
                            i = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                        }
                    } else {
                        C2658y7 c2658y7 = c2305rO.f7113W;
                        str = c2658y7.f8279P;
                        i = c2658y7.f8278N;
                    }
                    if (1 <= i && i < 65536) {
                        z3 = true;
                    }
                    if (z3) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            arrayList2.add(InetSocketAddress.createUnresolved(str, i));
                        } else {
                            if (AbstractC1181W6.f3856Q.f6022S.matcher(str).matches()) {
                                mo1688h = Collections.singletonList(InetAddress.getByName(str));
                            } else {
                                this.f2910v.getClass();
                                mo1688h = c2305rO.f7118z.mo1688h(str);
                                if (mo1688h.isEmpty()) {
                                    throw new UnknownHostException(c2305rO.f7118z + " returned no addresses for " + str);
                                }
                            }
                            Iterator it = mo1688h.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i));
                            }
                        }
                        Iterator it2 = this.f2907Q.iterator();
                        while (it2.hasNext()) {
                            C1946ke c1946ke = new C1946ke(this.f2911z, proxy, (InetSocketAddress) it2.next());
                            C0175DP c0175dp = this.f2908h;
                            synchronized (c0175dp) {
                                contains = ((Set) c0175dp.f541R).contains(c1946ke);
                            }
                            if (contains) {
                                this.f2909u.add(c1946ke);
                            } else {
                                arrayList.add(c1946ke);
                            }
                        }
                    } else {
                        throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + c2305rO.f7113W.f8279P + "; exhausted proxy configurations: " + this.f2906P);
                }
            } while ((!arrayList.isEmpty()) == false);
            if (arrayList.isEmpty()) {
                AbstractC2708z8.m4637oI(this.f2909u, arrayList);
                this.f2909u.clear();
            }
            return new C1077UB(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: z */
    public final boolean m1995z() {
        boolean z;
        if (this.f2905N < this.f2906P.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z || (!this.f2909u.isEmpty()) != false) {
            return true;
        }
        return false;
    }
}
