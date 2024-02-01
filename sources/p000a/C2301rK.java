package p000a;

/* renamed from: a.rK */
/* loaded from: classes.dex */
public final class C2301rK extends AbstractC0122CL {
    static {
        new C2301rK((char) 1, (char) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0025, code lost:
    
        if (r3 == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p000a.C2301rK
            r1 = 0
            if (r0 == 0) goto L32
            char r0 = r6.f424S
            char r2 = r6.f423R
            int r3 = p000a.AbstractC1292YB.m2696w(r0, r2)
            r4 = 1
            if (r3 <= 0) goto L12
            r3 = r4
            goto L13
        L12:
            r3 = r1
        L13:
            if (r3 == 0) goto L27
            r3 = r7
            a.rK r3 = (p000a.C2301rK) r3
            char r5 = r3.f424S
            char r3 = r3.f423R
            int r3 = p000a.AbstractC1292YB.m2696w(r5, r3)
            if (r3 <= 0) goto L24
            r3 = r4
            goto L25
        L24:
            r3 = r1
        L25:
            if (r3 != 0) goto L31
        L27:
            a.rK r7 = (p000a.C2301rK) r7
            char r3 = r7.f424S
            if (r0 != r3) goto L32
            char r7 = r7.f423R
            if (r2 != r7) goto L32
        L31:
            r1 = r4
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2301rK.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        boolean z;
        char c = this.f424S;
        char c2 = this.f423R;
        if (AbstractC1292YB.m2696w(c, c2) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return -1;
        }
        return (c * 31) + c2;
    }

    public final String toString() {
        return this.f424S + ".." + this.f423R;
    }
}
