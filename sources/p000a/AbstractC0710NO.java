package p000a;

import java.util.concurrent.CancellationException;

/* renamed from: a.NO */
/* loaded from: classes.dex */
public abstract class AbstractC0710NO extends AbstractRunnableC2453uD {

    /* renamed from: w */
    public int f2384w;

    public AbstractC0710NO(int i) {
        super(0L, AbstractC0331GL.f1129u);
        this.f2384w = i;
    }

    /* renamed from: G */
    public abstract Object mo1642G();

    /* renamed from: P */
    public abstract InterfaceC1171Vv mo1643P();

    /* renamed from: Q */
    public Throwable mo1644Q(Object obj) {
        C1663fI c1663fI = obj instanceof C1663fI ? (C1663fI) obj : null;
        if (c1663fI != null) {
            return c1663fI.f5199z;
        }
        return null;
    }

    /* renamed from: W */
    public final void m1645W(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC1292YB.m2655N(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        AbstractC0438II.m1000J(mo1643P().mo315N(), new C1076UA("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: h */
    public abstract void mo1646h(Object obj, CancellationException cancellationException);

    /* renamed from: o */
    public Object mo1647o(Object obj) {
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r7 = (p000a.InterfaceC1265Xh) r7.mo107y(p000a.C1710g8.f5381k);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r13 = this;
            a.GJ r0 = p000a.C0329GJ.f1115z
            a.qQ r1 = r13.f7529R
            a.Vv r2 = r13.mo1643P()     // Catch: java.lang.Throwable -> L9a
            a.qf r2 = (p000a.C2266qf) r2     // Catch: java.lang.Throwable -> L9a
            a.Vv r3 = r2.f6970q     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r2.f6968g     // Catch: java.lang.Throwable -> L9a
            a.XS r4 = r3.mo315N()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = p000a.AbstractC1292YB.m2663U8(r4, r2)     // Catch: java.lang.Throwable -> L9a
            a.DP r5 = p000a.AbstractC1292YB.f4138S     // Catch: java.lang.Throwable -> L9a
            r6 = 0
            if (r2 == r5) goto L20
            a.f6 r5 = p000a.AbstractC1292YB.m2641BO(r3, r4, r2)     // Catch: java.lang.Throwable -> L9a
            goto L21
        L20:
            r5 = r6
        L21:
            a.XS r7 = r3.mo315N()     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r8 = r13.mo1642G()     // Catch: java.lang.Throwable -> L5f
            java.lang.Throwable r9 = r13.mo1644Q(r8)     // Catch: java.lang.Throwable -> L5f
            if (r9 != 0) goto L44
            int r10 = r13.f2384w     // Catch: java.lang.Throwable -> L5f
            r11 = 1
            if (r10 == r11) goto L39
            r12 = 2
            if (r10 != r12) goto L38
            goto L39
        L38:
            r11 = 0
        L39:
            if (r11 == 0) goto L44
            a.g8 r10 = p000a.C1710g8.f5381k     // Catch: java.lang.Throwable -> L5f
            a.UM r7 = r7.mo107y(r10)     // Catch: java.lang.Throwable -> L5f
            a.Xh r7 = (p000a.InterfaceC1265Xh) r7     // Catch: java.lang.Throwable -> L5f
            goto L45
        L44:
            r7 = r6
        L45:
            if (r7 == 0) goto L61
            boolean r10 = r7.mo317h()     // Catch: java.lang.Throwable -> L5f
            if (r10 != 0) goto L61
            a.O9 r7 = (p000a.C0757O9) r7     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.CancellationException r7 = r7.m1741U()     // Catch: java.lang.Throwable -> L5f
            r13.mo1646h(r8, r7)     // Catch: java.lang.Throwable -> L5f
            a.T6 r8 = new a.T6     // Catch: java.lang.Throwable -> L5f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L5f
            r3.mo320u(r8)     // Catch: java.lang.Throwable -> L5f
            goto L70
        L5f:
            r3 = move-exception
            goto L8e
        L61:
            if (r9 == 0) goto L69
            a.T6 r7 = new a.T6     // Catch: java.lang.Throwable -> L5f
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L5f
            goto L6d
        L69:
            java.lang.Object r7 = r13.mo1647o(r8)     // Catch: java.lang.Throwable -> L5f
        L6d:
            r3.mo320u(r7)     // Catch: java.lang.Throwable -> L5f
        L70:
            if (r5 == 0) goto L78
            boolean r3 = r5.m3127m()     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L7b
        L78:
            p000a.AbstractC1292YB.m2682m(r4, r2)     // Catch: java.lang.Throwable -> L9a
        L7b:
            r1.getClass()     // Catch: java.lang.Throwable -> L7f
            goto L86
        L7f:
            r0 = move-exception
            a.T6 r1 = new a.T6
            r1.<init>(r0)
            r0 = r1
        L86:
            java.lang.Throwable r0 = p000a.AbstractC2740zk.m4677z(r0)
            r13.m1645W(r6, r0)
            goto Lad
        L8e:
            if (r5 == 0) goto L96
            boolean r5 = r5.m3127m()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L99
        L96:
            p000a.AbstractC1292YB.m2682m(r4, r2)     // Catch: java.lang.Throwable -> L9a
        L99:
            throw r3     // Catch: java.lang.Throwable -> L9a
        L9a:
            r2 = move-exception
            r1.getClass()     // Catch: java.lang.Throwable -> L9f
            goto La6
        L9f:
            r0 = move-exception
            a.T6 r1 = new a.T6
            r1.<init>(r0)
            r0 = r1
        La6:
            java.lang.Throwable r0 = p000a.AbstractC2740zk.m4677z(r0)
            r13.m1645W(r2, r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0710NO.run():void");
    }
}
