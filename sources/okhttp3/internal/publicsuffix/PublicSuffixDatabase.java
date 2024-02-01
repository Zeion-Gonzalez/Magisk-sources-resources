package okhttp3.internal.publicsuffix;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import p000a.AbstractC0982SQ;
import p000a.AbstractC1269Xn;
import p000a.AbstractC1292YB;
import p000a.AbstractC2486us;
import p000a.C1138VI;
import p000a.C1819iG;
import p000a.C2252qQ;
import p000a.C2294rC;
import p000a.C2323ri;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: N */
    public static final byte[] f9630N;

    /* renamed from: Q */
    public static final List f9631Q;

    /* renamed from: u */
    public static final PublicSuffixDatabase f9632u;

    /* renamed from: P */
    public byte[] f9633P;

    /* renamed from: v */
    public byte[] f9635v;

    /* renamed from: z */
    public final AtomicBoolean f9636z = new AtomicBoolean(false);

    /* renamed from: h */
    public final CountDownLatch f9634h = new CountDownLatch(1);

    static {
        new C2252qQ(23, 0);
        f9630N = new byte[]{42};
        f9631Q = Collections.singletonList("*");
        f9632u = new PublicSuffixDatabase();
    }

    /* renamed from: v */
    public static List m5142v(String str) {
        int i = 0;
        List m2571F3 = AbstractC1269Xn.m2571F3(str, new char[]{'.'});
        if (AbstractC1292YB.m2695u(AbstractC2486us.m4283Ry(m2571F3), "")) {
            int size = m2571F3.size() - 1;
            if (size >= 0) {
                i = size;
            }
            return AbstractC2486us.m4290fH(m2571F3, i);
        }
        return m2571F3;
    }

    /* renamed from: h */
    public final void m5143h() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                Logger logger = AbstractC0982SQ.f3316z;
                C2323ri c2323ri = new C2323ri(new C1138VI(new C2294rC(resourceAsStream, new C1819iG())));
                try {
                    long mo1620L = c2323ri.mo1620L();
                    c2323ri.mo1615B(mo1620L);
                    byte[] m4074Lq = c2323ri.f7151R.m4074Lq(mo1620L);
                    long mo1620L2 = c2323ri.mo1620L();
                    c2323ri.mo1615B(mo1620L2);
                    byte[] m4074Lq2 = c2323ri.f7151R.m4074Lq(mo1620L2);
                    AbstractC1292YB.m2659R(c2323ri, null);
                    synchronized (this) {
                        this.f9635v = m4074Lq;
                        this.f9633P = m4074Lq2;
                    }
                } finally {
                }
            }
        } finally {
            this.f9634h.countDown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r1 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 != false) goto L15;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m5144z(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m5144z(java.lang.String):java.lang.String");
    }
}
