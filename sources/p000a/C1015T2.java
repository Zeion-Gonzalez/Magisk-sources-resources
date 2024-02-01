package p000a;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;

/* renamed from: a.T2 */
/* loaded from: classes.dex */
public final class C1015T2 {

    /* renamed from: v */
    public C2562wG[] f3395v;

    /* renamed from: z */
    public long f3396z = 20;

    /* renamed from: h */
    public int f3394h = 0;

    /* renamed from: h */
    public final C1996lX m2193h(Process process) {
        int i;
        try {
            C1996lX c1996lX = new C1996lX(this, process);
            synchronized (AbstractC0795Op.class) {
                if (AbstractC0795Op.f2711h) {
                    C1996lX[] c1996lXArr = AbstractC0795Op.f2720z;
                    synchronized (c1996lXArr) {
                        c1996lXArr[0] = c1996lX;
                    }
                }
            }
            if (this.f3395v != null) {
                Context m2646F = AbstractC1292YB.m2646F();
                for (C2562wG c2562wG : this.f3395v) {
                    if (c2562wG != null && !c2562wG.m4383z(m2646F, c1996lX)) {
                        AbstractC0795Op.m1839ZH(null);
                        throw new C0861Q4();
                    }
                }
            }
            return c1996lX;
        } catch (IOException e) {
            throw new C0861Q4(e);
        }
    }

    /* renamed from: v */
    public final C1996lX m2194v(String... strArr) {
        try {
            TextUtils.join(" ", strArr);
            return m2193h(Runtime.getRuntime().exec(strArr));
        } catch (IOException e) {
            throw new C0861Q4(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0029, code lost:
    
        if (r0.m45G() == false) goto L72;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C1996lX m2195z() {
        /*
            r6 = this;
            int r0 = r6.f3394h
            r1 = r0 & 1
            r2 = 0
            r3 = 1
            if (r1 != r3) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            java.lang.String r4 = "su"
            r5 = 0
            if (r1 != 0) goto L2b
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L16
            r0 = r3
            goto L17
        L16:
            r0 = r2
        L17:
            if (r0 == 0) goto L2b
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: p000a.C0861Q4 -> L2b
            r0[r2] = r4     // Catch: p000a.C0861Q4 -> L2b
            java.lang.String r1 = "--mount-master"
            r0[r3] = r1     // Catch: p000a.C0861Q4 -> L2b
            a.lX r0 = r6.m2194v(r0)     // Catch: p000a.C0861Q4 -> L2b
            boolean r1 = r0.m45G()     // Catch: p000a.C0861Q4 -> L2c
            if (r1 != 0) goto L2c
        L2b:
            r0 = r5
        L2c:
            if (r0 != 0) goto L49
            int r1 = r6.f3394h
            r1 = r1 & r3
            if (r1 != r3) goto L35
            r1 = r3
            goto L36
        L35:
            r1 = r2
        L36:
            if (r1 != 0) goto L49
            java.lang.String[] r1 = new java.lang.String[]{r4}     // Catch: p000a.C0861Q4 -> L49
            a.lX r0 = r6.m2194v(r1)     // Catch: p000a.C0861Q4 -> L49
            boolean r1 = r0.m45G()     // Catch: p000a.C0861Q4 -> L49
            if (r1 != 0) goto L47
            goto L48
        L47:
            r5 = r0
        L48:
            r0 = r5
        L49:
            if (r0 != 0) goto L68
            int r0 = r6.f3394h
            r0 = r0 & r3
            if (r0 != r3) goto L51
            goto L52
        L51:
            r3 = r2
        L52:
            if (r3 != 0) goto L5e
            java.lang.Class<a.YB> r0 = p000a.AbstractC1292YB.class
            monitor-enter(r0)
            p000a.AbstractC1292YB.f4141h = r2     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            goto L5e
        L5b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L5e:
            java.lang.String r0 = "sh"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            a.lX r0 = r6.m2194v(r0)
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1015T2.m2195z():a.lX");
    }
}
