package p000a;

import java.io.IOException;

/* renamed from: a.Si */
/* loaded from: classes.dex */
public final class C0998Si {

    /* renamed from: N */
    public boolean f3347N;

    /* renamed from: P */
    public final InterfaceC0297Fe f3348P;

    /* renamed from: Q */
    public boolean f3349Q;

    /* renamed from: h */
    public final C1710g8 f3350h;

    /* renamed from: u */
    public final C0770OM f3351u;

    /* renamed from: v */
    public final C1179W4 f3352v;

    /* renamed from: z */
    public final C0523Jr f3353z;

    public C0998Si(C0523Jr c0523Jr, C1710g8 c1710g8, C1179W4 c1179w4, InterfaceC0297Fe interfaceC0297Fe) {
        this.f3353z = c0523Jr;
        this.f3350h = c1710g8;
        this.f3352v = c1179w4;
        this.f3348P = interfaceC0297Fe;
        this.f3351u = interfaceC0297Fe.mo631u();
    }

    /* renamed from: h */
    public final C2368sZ m2170h(boolean z) {
        try {
            C2368sZ mo628Q = this.f3348P.mo628Q(z);
            if (mo628Q != null) {
                mo628Q.f7279S = this;
            }
            return mo628Q;
        } catch (IOException e) {
            this.f3350h.getClass();
            m2171v(e);
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0023, code lost:
    
        if (r6 > 1) goto L44;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2171v(java.io.IOException r6) {
        /*
            r5 = this;
            r0 = 1
            r5.f3349Q = r0
            a.W4 r1 = r5.f3352v
            r1.m2409h(r6)
            a.Fe r1 = r5.f3348P
            a.OM r1 = r1.mo631u()
            a.Jr r2 = r5.f3353z
            monitor-enter(r1)
            boolean r3 = r6 instanceof p000a.C1339Z5     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L35
            r3 = r6
            a.Z5 r3 = (p000a.C1339Z5) r3     // Catch: java.lang.Throwable -> L56
            a.O6 r3 = r3.f4233S     // Catch: java.lang.Throwable -> L56
            a.O6 r4 = p000a.EnumC0754O6.f2561k     // Catch: java.lang.Throwable -> L56
            if (r3 != r4) goto L28
            int r6 = r1.f2623R     // Catch: java.lang.Throwable -> L56
            int r6 = r6 + r0
            r1.f2623R = r6     // Catch: java.lang.Throwable -> L56
            if (r6 <= r0) goto L54
        L25:
            r1.f2617G = r0     // Catch: java.lang.Throwable -> L56
            goto L4f
        L28:
            a.Z5 r6 = (p000a.C1339Z5) r6     // Catch: java.lang.Throwable -> L56
            a.O6 r6 = r6.f4233S     // Catch: java.lang.Throwable -> L56
            a.O6 r3 = p000a.EnumC0754O6.f2560g     // Catch: java.lang.Throwable -> L56
            if (r6 != r3) goto L25
            boolean r6 = r2.f1752c     // Catch: java.lang.Throwable -> L56
            if (r6 != 0) goto L54
            goto L25
        L35:
            a.Mf r3 = r1.f2630u     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L3b
            r3 = r0
            goto L3c
        L3b:
            r3 = 0
        L3c:
            if (r3 == 0) goto L42
            boolean r3 = r6 instanceof p000a.C0390HP     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L54
        L42:
            r1.f2617G = r0     // Catch: java.lang.Throwable -> L56
            int r3 = r1.f2624S     // Catch: java.lang.Throwable -> L56
            if (r3 != 0) goto L54
            a.ES r2 = r2.f1749S     // Catch: java.lang.Throwable -> L56
            a.ke r3 = r1.f2627h     // Catch: java.lang.Throwable -> L56
            p000a.C0770OM.m1777P(r2, r3, r6)     // Catch: java.lang.Throwable -> L56
        L4f:
            int r6 = r1.f2625V     // Catch: java.lang.Throwable -> L56
            int r6 = r6 + r0
            r1.f2625V = r6     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r1)
            return
        L56:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0998Si.m2171v(java.io.IOException):void");
    }

    /* renamed from: z */
    public final C0679Mq m2172z(C1429ap c1429ap) {
        InterfaceC0297Fe interfaceC0297Fe = this.f3348P;
        try {
            String m2897h = c1429ap.f4472k.m2897h("Content-Type");
            if (m2897h == null) {
                m2897h = null;
            }
            long mo630o = interfaceC0297Fe.mo630o(c1429ap);
            return new C0679Mq(m2897h, mo630o, new C2323ri(new C2677yZ(this, interfaceC0297Fe.mo629h(c1429ap), mo630o)));
        } catch (IOException e) {
            this.f3350h.getClass();
            m2171v(e);
            throw e;
        }
    }
}
