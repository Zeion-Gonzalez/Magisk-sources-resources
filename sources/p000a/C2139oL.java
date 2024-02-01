package p000a;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: a.oL */
/* loaded from: classes.dex */
public final class C2139oL implements InterfaceC0987SV {

    /* renamed from: I */
    public final InterfaceC2491ux f6584I;

    /* renamed from: R */
    public final Object[] f6585R;

    /* renamed from: S */
    public final C2559wD f6586S;

    /* renamed from: g */
    public Throwable f6587g;

    /* renamed from: k */
    public C0523Jr f6588k;

    /* renamed from: q */
    public volatile boolean f6589q;

    /* renamed from: w */
    public final InterfaceC0820PJ f6590w;

    /* renamed from: y */
    public boolean f6591y;

    public C2139oL(C2559wD c2559wD, Object[] objArr, InterfaceC0820PJ interfaceC0820PJ, InterfaceC2491ux interfaceC2491ux) {
        this.f6586S = c2559wD;
        this.f6585R = objArr;
        this.f6590w = interfaceC0820PJ;
        this.f6584I = interfaceC2491ux;
    }

    @Override // p000a.InterfaceC0987SV
    /* renamed from: G */
    public final InterfaceC0987SV clone() {
        return new C2139oL(this.f6586S, this.f6585R, this.f6590w, this.f6584I);
    }

    /* renamed from: P */
    public final C0870QJ m3758P(C1429ap c1429ap) {
        C2368sZ c2368sZ = new C2368sZ(c1429ap);
        AbstractC1449bB abstractC1449bB = c1429ap.f4471g;
        c2368sZ.f7284u = new C0947Ro(abstractC1449bB.mo1578h(), abstractC1449bB.mo1579z());
        C1429ap m4094z = c2368sZ.m4094z();
        int i = m4094z.f4465I;
        if (i >= 200 && i < 300) {
            if (i != 204 && i != 205) {
                C1723gR c1723gR = new C1723gR(abstractC1449bB);
                try {
                    Object mo329P = this.f6584I.mo329P(c1723gR);
                    if (m4094z.m2858h()) {
                        return new C0870QJ(m4094z, mo329P);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e) {
                    IOException iOException = c1723gR.f5406w;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
            abstractC1449bB.close();
            if (m4094z.m2858h()) {
                return new C0870QJ(m4094z, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            abstractC1449bB.mo1577G().mo1618I(new C2361sQ());
            abstractC1449bB.mo1578h();
            abstractC1449bB.mo1579z();
            if (!m4094z.m2858h()) {
                return new C0870QJ(m4094z, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            abstractC1449bB.close();
        }
    }

    @Override // p000a.InterfaceC0987SV
    /* renamed from: V */
    public final synchronized C1364ZX mo1685V() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((C0523Jr) m3759v()).f1748R;
    }

    @Override // p000a.InterfaceC0987SV
    public final void cancel() {
        C0523Jr c0523Jr;
        this.f6589q = true;
        synchronized (this) {
            c0523Jr = this.f6588k;
        }
        if (c0523Jr != null) {
            c0523Jr.cancel();
        }
    }

    public final Object clone() {
        return new C2139oL(this.f6586S, this.f6585R, this.f6590w, this.f6584I);
    }

    @Override // p000a.InterfaceC0987SV
    /* renamed from: h */
    public final void mo1686h(InterfaceC1636el interfaceC1636el) {
        C0523Jr c0523Jr;
        Throwable th;
        synchronized (this) {
            if (this.f6591y) {
                throw new IllegalStateException("Already executed.");
            }
            this.f6591y = true;
            c0523Jr = this.f6588k;
            th = this.f6587g;
            if (c0523Jr == null && th == null) {
                try {
                    C0523Jr m3760z = m3760z();
                    this.f6588k = m3760z;
                    c0523Jr = m3760z;
                } catch (Throwable th2) {
                    th = th2;
                    AbstractC2575wW.m4388BX(th);
                    this.f6587g = th;
                }
            }
        }
        if (th != null) {
            interfaceC1636el.mo2754h(th);
            return;
        }
        if (this.f6589q) {
            c0523Jr.cancel();
        }
        c0523Jr.m1213N(new C0321GA(this, interfaceC1636el));
    }

    /* renamed from: v */
    public final InterfaceC2381sm m3759v() {
        C0523Jr c0523Jr = this.f6588k;
        if (c0523Jr != null) {
            return c0523Jr;
        }
        Throwable th = this.f6587g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            C0523Jr m3760z = m3760z();
            this.f6588k = m3760z;
            return m3760z;
        } catch (IOException | Error | RuntimeException e) {
            AbstractC2575wW.m4388BX(e);
            this.f6587g = e;
            throw e;
        }
    }

    @Override // p000a.InterfaceC0987SV
    /* renamed from: y */
    public final boolean mo1687y() {
        boolean z = true;
        if (this.f6589q) {
            return true;
        }
        synchronized (this) {
            C0523Jr c0523Jr = this.f6588k;
            if (c0523Jr == null || !c0523Jr.f1752c) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: z */
    public final C0523Jr m3760z() {
        C0349Gf c0349Gf;
        C2658y7 c2658y7;
        C2559wD c2559wD = this.f6586S;
        c2559wD.getClass();
        Object[] objArr = this.f6585R;
        int length = objArr.length;
        AbstractC1500cH[] abstractC1500cHArr = c2559wD.f7814G;
        if (length == abstractC1500cHArr.length) {
            C1120Uy c1120Uy = new C1120Uy(c2559wD.f7823v, c2559wD.f7820h, c2559wD.f7817P, c2559wD.f7816N, c2559wD.f7818Q, c2559wD.f7822u, c2559wD.f7821o, c2559wD.f7819W);
            if (c2559wD.f7815M) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                abstractC1500cHArr[i].mo332z(c1120Uy, objArr[i]);
            }
            C0349Gf c0349Gf2 = c1120Uy.f3663P;
            if (c0349Gf2 != null) {
                c2658y7 = c0349Gf2.m762h();
            } else {
                String str = c1120Uy.f3669v;
                C2658y7 c2658y72 = c1120Uy.f3666h;
                c2658y72.getClass();
                try {
                    c0349Gf = new C0349Gf();
                    c0349Gf.m760N(c2658y72, str);
                } catch (IllegalArgumentException unused) {
                    c0349Gf = null;
                }
                if (c0349Gf != null) {
                    c2658y7 = c0349Gf.m762h();
                } else {
                    c2658y7 = null;
                }
                if (c2658y7 == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + c2658y72 + ", Relative: " + c1120Uy.f3669v);
                }
            }
            C1872jH c1872jH = c1120Uy.f3661M;
            if (c1872jH == null) {
                C0918RI c0918ri = c1120Uy.f3660G;
                if (c0918ri != null) {
                    c1872jH = new C0714NS(c0918ri.f3162z, c0918ri.f3161h);
                } else {
                    C1151VX c1151vx = c1120Uy.f3665W;
                    if (c1151vx != null) {
                        ArrayList arrayList2 = c1151vx.f3736v;
                        if ((!arrayList2.isEmpty()) != false) {
                            c1872jH = new C2566wL(c1151vx.f3737z, c1151vx.f3735h, AbstractC1181W6.m2428s(arrayList2));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                    } else if (c1120Uy.f3667o) {
                        long j = 0;
                        AbstractC1181W6.m2424h(j, j, j);
                        c1872jH = new C0032Ae(null, new byte[0], 0, 0);
                    }
                }
            }
            C0003A3 c0003a3 = c1120Uy.f3668u;
            C1571dY c1571dY = c1120Uy.f3664Q;
            if (c0003a3 != null) {
                if (c1872jH != null) {
                    c1872jH = new C1872jH(c1872jH, c0003a3);
                } else {
                    c1571dY.m3045z("Content-Type", c0003a3.f67z);
                }
            }
            C2306rP c2306rP = c1120Uy.f3662N;
            c2306rP.f7123z = c2658y7;
            c2306rP.f7122v = c1571dY.m3040P().m2895P();
            c2306rP.m3964v(c1120Uy.f3670z, c1872jH);
            c2306rP.m3961N(C1794hl.class, new C1794hl(c2559wD.f7824z, arrayList));
            C1364ZX m3965z = c2306rP.m3965z();
            C0234ES c0234es = (C0234ES) this.f6590w;
            c0234es.getClass();
            return new C0523Jr(c0234es, m3965z, false);
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC1500cHArr.length + ")");
    }
}
