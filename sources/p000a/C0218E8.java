package p000a;

import java.util.Calendar;

/* renamed from: a.E8 */
/* loaded from: classes.dex */
public final class C0218E8 {

    /* renamed from: Q */
    public static final long f684Q;

    /* renamed from: u */
    public static final long f685u;

    /* renamed from: N */
    public final InterfaceC0899Qx f686N;

    /* renamed from: P */
    public final int f687P;

    /* renamed from: h */
    public final long f688h;

    /* renamed from: v */
    public Long f689v;

    /* renamed from: z */
    public final long f690z;

    static {
        C0307Fr m651h = C0307Fr.m651h(1900, 0);
        Calendar m4585P = AbstractC2674yV.m4585P(null);
        m4585P.setTimeInMillis(m651h.f1060k);
        f684Q = AbstractC2674yV.m4586h(m4585P).getTimeInMillis();
        C0307Fr m651h2 = C0307Fr.m651h(2100, 11);
        Calendar m4585P2 = AbstractC2674yV.m4585P(null);
        m4585P2.setTimeInMillis(m651h2.f1060k);
        f685u = AbstractC2674yV.m4586h(m4585P2).getTimeInMillis();
    }

    public C0218E8(C2421tc c2421tc) {
        this.f690z = f684Q;
        this.f688h = f685u;
        this.f686N = new C2143oQ(Long.MIN_VALUE);
        this.f690z = c2421tc.f7412S.f1060k;
        this.f688h = c2421tc.f7411R.f1060k;
        this.f689v = Long.valueOf(c2421tc.f7410I.f1060k);
        this.f687P = c2421tc.f7415q;
        this.f686N = c2421tc.f7416w;
    }
}
