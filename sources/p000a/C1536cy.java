package p000a;

import android.transition.Transition;

/* renamed from: a.cy */
/* loaded from: classes.dex */
public final class C1536cy extends AbstractC0227EK {

    /* renamed from: N */
    public final boolean f4758N;

    /* renamed from: P */
    public final Object f4759P;

    /* renamed from: Q */
    public final Object f4760Q;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0016, code lost:
    
        if (r6 == p000a.AbstractComponentCallbacksC2342s3.f7181UZ) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0024, code lost:
    
        if (r6 == p000a.AbstractComponentCallbacksC2342s3.f7181UZ) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1536cy(p000a.AbstractC0204Du r5, p000a.C1251XO r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            int r6 = r5.f621z
            r0 = 2
            r1 = 0
            a.s3 r2 = r5.f620v
            if (r6 != r0) goto L19
            if (r7 == 0) goto L27
            a.eM r6 = r2.f7184D
            if (r6 != 0) goto L12
            goto L2a
        L12:
            java.lang.Object r6 = r6.f4949G
            java.lang.Object r3 = p000a.AbstractComponentCallbacksC2342s3.f7181UZ
            if (r6 != r3) goto L2b
            goto L2a
        L19:
            if (r7 == 0) goto L27
            a.eM r6 = r2.f7184D
            if (r6 != 0) goto L20
            goto L2a
        L20:
            java.lang.Object r6 = r6.f4956W
            java.lang.Object r3 = p000a.AbstractComponentCallbacksC2342s3.f7181UZ
            if (r6 != r3) goto L2b
            goto L2a
        L27:
            r2.getClass()
        L2a:
            r6 = r1
        L2b:
            r4.f4759P = r6
            int r5 = r5.f621z
            if (r5 != r0) goto L38
            if (r7 == 0) goto L36
            a.eM r5 = r2.f7184D
            goto L38
        L36:
            a.eM r5 = r2.f7184D
        L38:
            r5 = 1
            r4.f4758N = r5
            if (r8 == 0) goto L50
            if (r7 == 0) goto L4d
            a.eM r5 = r2.f7184D
            if (r5 != 0) goto L44
            goto L50
        L44:
            java.lang.Object r5 = r5.f4950M
            java.lang.Object r6 = p000a.AbstractComponentCallbacksC2342s3.f7181UZ
            if (r5 != r6) goto L4b
            goto L50
        L4b:
            r1 = r5
            goto L50
        L4d:
            r2.getClass()
        L50:
            r4.f4760Q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1536cy.<init>(a.Du, a.XO, boolean, boolean):void");
    }

    /* renamed from: R */
    public final AbstractC0119CI m2982R(Object obj) {
        if (obj == null) {
            return null;
        }
        C0079BW c0079bw = AbstractC1759h2.f5554z;
        if (obj instanceof Transition) {
            return c0079bw;
        }
        AbstractC0119CI abstractC0119CI = AbstractC1759h2.f5553h;
        if (abstractC0119CI != null && abstractC0119CI.mo166N(obj)) {
            return abstractC0119CI;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((AbstractC0204Du) this.f741h).f620v + " is not a valid framework Transition or AndroidX Transition");
    }

    /* renamed from: S */
    public final AbstractC0119CI m2983S() {
        boolean z;
        Object obj = this.f4759P;
        AbstractC0119CI m2982R = m2982R(obj);
        Object obj2 = this.f4760Q;
        AbstractC0119CI m2982R2 = m2982R(obj2);
        if (m2982R != null && m2982R2 != null && m2982R != m2982R2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (m2982R == null) {
                return m2982R2;
            }
            return m2982R;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((AbstractC0204Du) this.f741h).f620v + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }
}
