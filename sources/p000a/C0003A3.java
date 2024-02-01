package p000a;

import java.util.regex.Pattern;

/* renamed from: a.A3 */
/* loaded from: classes.dex */
public final class C0003A3 {

    /* renamed from: h */
    public final String f65h;

    /* renamed from: v */
    public final String[] f66v;

    /* renamed from: z */
    public final String f67z;

    /* renamed from: P */
    public static final Pattern f64P = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: N */
    public static final Pattern f63N = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public C0003A3(String str, String str2, String[] strArr) {
        this.f67z = str;
        this.f65h = str2;
        this.f66v = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0003A3) && AbstractC1292YB.m2695u(((C0003A3) obj).f67z, this.f67z);
    }

    public final int hashCode() {
        return this.f67z.hashCode();
    }

    public final String toString() {
        return this.f67z;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset m21z(java.nio.charset.Charset r6) {
        /*
            r5 = this;
            java.lang.String[] r0 = r5.f66v
            int r1 = r0.length
            int r1 = r1 + (-1)
            r2 = 2
            r3 = 0
            int r1 = p000a.AbstractC1292YB.m2679j(r3, r1, r2)
            if (r1 < 0) goto L21
        Ld:
            r2 = r0[r3]
            java.lang.String r4 = "charset"
            boolean r2 = p000a.AbstractC1269Xn.m2594yF(r2, r4)
            if (r2 == 0) goto L1c
            int r3 = r3 + 1
            r0 = r0[r3]
            goto L22
        L1c:
            if (r3 == r1) goto L21
            int r3 = r3 + 2
            goto Ld
        L21:
            r0 = 0
        L22:
            if (r0 != 0) goto L25
            return r6
        L25:
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L29
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0003A3.m21z(java.nio.charset.Charset):java.nio.charset.Charset");
    }
}
