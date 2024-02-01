package p000a;

import java.util.Locale;

/* renamed from: a.Fp */
/* loaded from: classes.dex */
public final class C0305Fp {

    /* renamed from: N */
    public final String f1049N;

    /* renamed from: P */
    public final int f1050P;

    /* renamed from: Q */
    public final int f1051Q;

    /* renamed from: h */
    public final String f1052h;

    /* renamed from: u */
    public final int f1053u;

    /* renamed from: v */
    public final boolean f1054v;

    /* renamed from: z */
    public final String f1055z;

    public C0305Fp(String str, String str2, boolean z, int i, String str3, int i2) {
        int i3;
        this.f1055z = str;
        this.f1052h = str2;
        this.f1054v = z;
        this.f1050P = i;
        this.f1049N = str3;
        this.f1051Q = i2;
        String upperCase = str2.toUpperCase(Locale.US);
        if (AbstractC1269Xn.m2591nB(upperCase, "INT", false)) {
            i3 = 3;
        } else if (!AbstractC1269Xn.m2591nB(upperCase, "CHAR", false) && !AbstractC1269Xn.m2591nB(upperCase, "CLOB", false) && !AbstractC1269Xn.m2591nB(upperCase, "TEXT", false)) {
            if (AbstractC1269Xn.m2591nB(upperCase, "BLOB", false)) {
                i3 = 5;
            } else if (!AbstractC1269Xn.m2591nB(upperCase, "REAL", false) && !AbstractC1269Xn.m2591nB(upperCase, "FLOA", false) && !AbstractC1269Xn.m2591nB(upperCase, "DOUB", false)) {
                i3 = 1;
            } else {
                i3 = 4;
            }
        } else {
            i3 = 2;
        }
        this.f1053u = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0057, code lost:
    
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof p000a.C0305Fp
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.Fp r9 = (p000a.C0305Fp) r9
            int r1 = r9.f1050P
            int r3 = r8.f1050P
            if (r3 == r1) goto L13
            return r2
        L13:
            java.lang.String r1 = r9.f1055z
            java.lang.String r3 = r8.f1055z
            boolean r1 = p000a.AbstractC1292YB.m2695u(r3, r1)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r1 = r8.f1054v
            boolean r3 = r9.f1054v
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r1 = r9.f1049N
            int r3 = r9.f1051Q
            r4 = 2
            java.lang.String r5 = r8.f1049N
            int r6 = r8.f1051Q
            if (r6 != r0) goto L3b
            if (r3 != r4) goto L3b
            if (r5 == 0) goto L3b
            boolean r7 = p000a.C1665fK.m3150W(r5, r1)
            if (r7 != 0) goto L3b
            return r2
        L3b:
            if (r6 != r4) goto L48
            if (r3 != r0) goto L48
            if (r1 == 0) goto L48
            boolean r4 = p000a.C1665fK.m3150W(r1, r5)
            if (r4 != 0) goto L48
            return r2
        L48:
            if (r6 == 0) goto L5d
            if (r6 != r3) goto L5d
            if (r5 == 0) goto L55
            boolean r1 = p000a.C1665fK.m3150W(r5, r1)
            if (r1 != 0) goto L59
            goto L57
        L55:
            if (r1 == 0) goto L59
        L57:
            r1 = r0
            goto L5a
        L59:
            r1 = r2
        L5a:
            if (r1 == 0) goto L5d
            return r2
        L5d:
            int r1 = r8.f1053u
            int r9 = r9.f1053u
            if (r1 != r9) goto L64
            goto L65
        L64:
            r0 = r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0305Fp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (((((this.f1055z.hashCode() * 31) + this.f1053u) * 31) + (this.f1054v ? 1231 : 1237)) * 31) + this.f1050P;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f1055z);
        sb.append("', type='");
        sb.append(this.f1052h);
        sb.append("', affinity='");
        sb.append(this.f1053u);
        sb.append("', notNull=");
        sb.append(this.f1054v);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f1050P);
        sb.append(", defaultValue='");
        String str = this.f1049N;
        if (str == null) {
            str = "undefined";
        }
        return AbstractC2441tz.m4187M(sb, str, "'}");
    }
}
