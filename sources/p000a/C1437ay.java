package p000a;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: a.ay */
/* loaded from: classes.dex */
public final class C1437ay implements InterfaceC0297Fe {

    /* renamed from: N */
    public final EnumC1854ix f4502N;

    /* renamed from: P */
    public volatile C0573Kk f4503P;

    /* renamed from: Q */
    public volatile boolean f4504Q;

    /* renamed from: h */
    public final C2515vK f4505h;

    /* renamed from: v */
    public final C0669Mf f4506v;

    /* renamed from: z */
    public final C0770OM f4507z;

    /* renamed from: u */
    public static final List f4501u = AbstractC1181W6.m2412G("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: o */
    public static final List f4500o = AbstractC1181W6.m2412G("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public C1437ay(C0234ES c0234es, C0770OM c0770om, C2515vK c2515vK, C0669Mf c0669Mf) {
        this.f4507z = c0770om;
        this.f4505h = c2515vK;
        this.f4506v = c0669Mf;
        EnumC1854ix enumC1854ix = EnumC1854ix.f5782k;
        this.f4502N = c0234es.f762F.contains(enumC1854ix) ? enumC1854ix : EnumC1854ix.f5783q;
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: N */
    public final void mo626N() {
        this.f4506v.f2191L.flush();
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: P */
    public final void mo627P() {
        this.f4503P.m1304u().close();
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: Q */
    public final C2368sZ mo628Q(boolean z) {
        C1494c7 c1494c7;
        C0573Kk c0573Kk = this.f4503P;
        if (c0573Kk != null) {
            synchronized (c0573Kk) {
                c0573Kk.f1856M.m3687o();
                while (c0573Kk.f1866u.isEmpty() && c0573Kk.f1861S == null) {
                    try {
                        c0573Kk.m1300V();
                    } catch (Throwable th) {
                        c0573Kk.f1856M.m3654V();
                        throw th;
                    }
                }
                c0573Kk.f1856M.m3654V();
                if ((!c0573Kk.f1866u.isEmpty()) != false) {
                    c1494c7 = (C1494c7) c0573Kk.f1866u.removeFirst();
                } else {
                    IOException iOException = c0573Kk.f1860R;
                    if (iOException != null) {
                        throw iOException;
                    }
                    throw new C1339Z5(c0573Kk.f1861S);
                }
            }
            EnumC1854ix enumC1854ix = this.f4502N;
            ArrayList arrayList = new ArrayList(20);
            int length = c1494c7.f4637S.length / 2;
            C1014T1 c1014t1 = null;
            for (int i = 0; i < length; i++) {
                String m2898v = c1494c7.m2898v(i);
                String m2894N = c1494c7.m2894N(i);
                if (AbstractC1292YB.m2695u(m2898v, ":status")) {
                    c1014t1 = C1710g8.m3220E("HTTP/1.1 " + m2894N);
                } else if (!f4500o.contains(m2898v)) {
                    arrayList.add(m2898v);
                    arrayList.add(AbstractC1269Xn.m2580Uf(m2894N).toString());
                }
            }
            if (c1014t1 != null) {
                C2368sZ c2368sZ = new C2368sZ();
                c2368sZ.f7282h = enumC1854ix;
                c2368sZ.f7285v = c1014t1.f3391h;
                c2368sZ.f7277P = c1014t1.f3392v;
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C1571dY c1571dY = new C1571dY();
                c1571dY.f4838z.addAll(Arrays.asList(strArr));
                c2368sZ.f7278Q = c1571dY;
                if (z && c2368sZ.f7285v == 100) {
                    return null;
                }
                return c2368sZ;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override // p000a.InterfaceC0297Fe
    public final void cancel() {
        this.f4504Q = true;
        C0573Kk c0573Kk = this.f4503P;
        if (c0573Kk != null) {
            c0573Kk.m1297N(EnumC0754O6.f2560g);
        }
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: h */
    public final InterfaceC0984SS mo629h(C1429ap c1429ap) {
        return this.f4503P.f1863W;
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: o */
    public final long mo630o(C1429ap c1429ap) {
        if (AbstractC0967S9.m2150z(c1429ap)) {
            return AbstractC1181W6.m2422W(c1429ap);
        }
        return 0L;
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: u */
    public final C0770OM mo631u() {
        return this.f4507z;
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: v */
    public final InterfaceC2578wb mo632v(C1364ZX c1364zx, long j) {
        return this.f4503P.m1304u();
    }

    @Override // p000a.InterfaceC0297Fe
    /* renamed from: z */
    public final void mo633z(C1364ZX c1364zx) {
        boolean z;
        int i;
        C0573Kk c0573Kk;
        if (this.f4503P != null) {
            return;
        }
        boolean z2 = true;
        if (((AbstractC1911jx) c1364zx.f4276N) != null) {
            z = true;
        } else {
            z = false;
        }
        C1494c7 c1494c7 = (C1494c7) c1364zx.f4277P;
        ArrayList arrayList = new ArrayList((c1494c7.f4637S.length / 2) + 4);
        arrayList.add(new C0668Me((String) c1364zx.f4281v, C0668Me.f2177Q));
        C1623eY c1623eY = C0668Me.f2180u;
        C2658y7 c2658y7 = (C2658y7) c1364zx.f4279h;
        String m4564h = c2658y7.m4564h();
        String m4562P = c2658y7.m4562P();
        if (m4562P != null) {
            m4564h = m4564h + '?' + m4562P;
        }
        arrayList.add(new C0668Me(m4564h, c1623eY));
        String m2760N = c1364zx.m2760N("Host");
        if (m2760N != null) {
            arrayList.add(new C0668Me(m2760N, C0668Me.f2178W));
        }
        arrayList.add(new C0668Me(c2658y7.f8286z, C0668Me.f2179o));
        int length = c1494c7.f4637S.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = c1494c7.m2898v(i2).toLowerCase(Locale.US);
            if (!f4501u.contains(lowerCase) || (AbstractC1292YB.m2695u(lowerCase, "te") && AbstractC1292YB.m2695u(c1494c7.m2894N(i2), "trailers"))) {
                arrayList.add(new C0668Me(lowerCase, c1494c7.m2894N(i2)));
            }
        }
        C0669Mf c0669Mf = this.f4506v;
        boolean z3 = !z;
        synchronized (c0669Mf.f2191L) {
            synchronized (c0669Mf) {
                if (c0669Mf.f2205k > 1073741823) {
                    c0669Mf.m1560C(EnumC0754O6.f2561k);
                }
                if (!c0669Mf.f2202g) {
                    i = c0669Mf.f2205k;
                    c0669Mf.f2205k = i + 2;
                    c0573Kk = new C0573Kk(i, c0669Mf, z3, false, null);
                    if (z && c0669Mf.f2185C < c0669Mf.f2206p && c0573Kk.f1857N < c0573Kk.f1859Q) {
                        z2 = false;
                    }
                    if (c0573Kk.m1301W()) {
                        c0669Mf.f2210w.put(Integer.valueOf(i), c0573Kk);
                    }
                } else {
                    throw new C0390HP();
                }
            }
            c0669Mf.f2191L.m4268y(i, arrayList, z3);
        }
        if (z2) {
            c0669Mf.f2191L.flush();
        }
        this.f4503P = c0573Kk;
        if (!this.f4504Q) {
            C2014lt c2014lt = this.f4503P.f1856M;
            long j = this.f4505h.f7703u;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c2014lt.mo378u(j, timeUnit);
            this.f4503P.f1862V.mo378u(this.f4505h.f7702o, timeUnit);
            return;
        }
        this.f4503P.m1297N(EnumC0754O6.f2560g);
        throw new IOException("Canceled");
    }
}
