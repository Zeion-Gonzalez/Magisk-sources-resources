package p000a;

import java.io.Serializable;

/* renamed from: a.nn */
/* loaded from: classes.dex */
public class C2111nn implements Serializable {

    /* renamed from: S */
    public transient C0788Og f6513S;

    public C2111nn(C0788Og c0788Og) {
        this.f6513S = c0788Og;
        c0788Og.f2654R.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2111nn) {
            return this.f6513S.equals(((C2111nn) obj).f6513S);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6513S.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2111nn(byte[] r5) {
        /*
            r4 = this;
            java.lang.String r0 = "malformed data: "
            r1 = 1
            int r2 = p000a.AbstractC1450bC.f4532z     // Catch: java.lang.IllegalArgumentException -> L1b java.lang.ClassCastException -> L32
            a.e r5 = p000a.AbstractC1593e.m3067q(r5)     // Catch: java.lang.IllegalArgumentException -> L1b java.lang.ClassCastException -> L32
            if (r5 == 0) goto L13
            a.Og r5 = p000a.C0788Og.m1795V(r5)     // Catch: java.lang.IllegalArgumentException -> L1b java.lang.ClassCastException -> L32
            r4.<init>(r5)
            return
        L13:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.IllegalArgumentException -> L1b java.lang.ClassCastException -> L32
            java.lang.String r2 = "no content found"
            r5.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L1b java.lang.ClassCastException -> L32
            throw r5     // Catch: java.lang.IllegalArgumentException -> L1b java.lang.ClassCastException -> L32
        L1b:
            r5 = move-exception
            a.q r2 = new a.q
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r5.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r1, r0, r5)
            throw r2
        L32:
            r5 = move-exception
            a.q r2 = new a.q
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r5.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r1, r0, r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2111nn.<init>(byte[]):void");
    }
}
