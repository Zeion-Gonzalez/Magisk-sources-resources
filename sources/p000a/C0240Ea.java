package p000a;

import java.util.Map;

/* renamed from: a.Ea */
/* loaded from: classes.dex */
public final class C0240Ea implements InterfaceC1964kx {

    /* renamed from: N */
    public final C0054B3 f822N;

    /* renamed from: P */
    public final Map f823P;

    /* renamed from: h */
    public final C2528vZ f824h;

    /* renamed from: v */
    public final C1682fd f825v;

    /* renamed from: z */
    public final C1774hM f826z;

    public C0240Ea(C1774hM c1774hM, C2528vZ c2528vZ, C1682fd c1682fd, Map map, C0054B3 c0054b3) {
        this.f826z = c1774hM;
        this.f824h = c2528vZ;
        this.f825v = c1682fd;
        this.f823P = map;
        this.f822N = c0054b3;
    }

    /* renamed from: N */
    public final void m509N(AbstractC1462bT abstractC1462bT, int i) {
        boolean z;
        Class<?> cls = abstractC1462bT.getClass();
        C1774hM c1774hM = this.f826z;
        InterfaceC2312rW interfaceC2312rW = (InterfaceC2312rW) ((C2528vZ) c1774hM.f5592u).f7742z.get(cls);
        if (interfaceC2312rW != null) {
            Object m2190z = ((C1011Sz) interfaceC2312rW).m2190z(c1774hM, this.f824h);
            C1682fd c1682fd = this.f825v;
            int length = c1682fd.length();
            int length2 = c1682fd.length();
            if (length > i && i >= 0 && length <= length2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C1682fd.m3174v(c1682fd, m2190z, i, length);
            }
        }
    }

    /* renamed from: P */
    public final int m510P() {
        return this.f825v.length();
    }

    /* renamed from: Q */
    public final void m511Q(AbstractC1462bT abstractC1462bT) {
        InterfaceC0332GN interfaceC0332GN = (InterfaceC0332GN) this.f823P.get(abstractC1462bT.getClass());
        if (interfaceC0332GN != null) {
            interfaceC0332GN.mo80z(this, abstractC1462bT);
        } else {
            m513u(abstractC1462bT);
        }
    }

    /* renamed from: h */
    public final void m512h() {
        this.f822N.getClass();
        m514v();
    }

    /* renamed from: u */
    public final void m513u(AbstractC1462bT abstractC1462bT) {
        AbstractC1462bT abstractC1462bT2 = abstractC1462bT.f4555h;
        while (abstractC1462bT2 != null) {
            AbstractC1462bT abstractC1462bT3 = abstractC1462bT2.f4553N;
            abstractC1462bT2.mo60z(this);
            abstractC1462bT2 = abstractC1462bT3;
        }
    }

    /* renamed from: v */
    public final void m514v() {
        C1682fd c1682fd = this.f825v;
        if (c1682fd.length() > 0) {
            if ('\n' != c1682fd.f5271S.charAt(c1682fd.length() - 1)) {
                c1682fd.m3176z('\n');
            }
        }
    }

    /* renamed from: z */
    public final void m515z(AbstractC1462bT abstractC1462bT) {
        boolean z;
        this.f822N.getClass();
        if (abstractC1462bT.f4553N != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m514v();
            this.f825v.m3176z('\n');
        }
    }
}
