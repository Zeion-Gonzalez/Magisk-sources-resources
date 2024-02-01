package p000a;

/* renamed from: a.h */
/* loaded from: classes.dex */
public abstract class AbstractC1756h {

    /* renamed from: z */
    public static final byte[] f5545z = "0123456789abcdef".getBytes(AbstractC2047ma.f6374z);

    /* renamed from: h */
    public static final String m3283h(C2361sQ c2361sQ, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (c2361sQ.m4079U8(j2) == 13) {
                String m4072G5 = c2361sQ.m4072G5(j2);
                c2361sQ.mo1632r(2L);
                return m4072G5;
            }
        }
        String m4072G52 = c2361sQ.m4072G5(j);
        c2361sQ.mo1632r(1L);
        return m4072G52;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0053, code lost:
    
        if (r19 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0056, code lost:
    
        return r9;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int m3284v(p000a.C2361sQ r17, p000a.C2678ya r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC1756h.m3284v(a.sQ, a.ya, boolean):int");
    }

    /* renamed from: z */
    public static final boolean m3285z(C1740gk c1740gk, int i, byte[] bArr, int i2) {
        int i3 = c1740gk.f5482v;
        byte[] bArr2 = c1740gk.f5483z;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                c1740gk = c1740gk.f5479Q;
                bArr2 = c1740gk.f5483z;
                i = c1740gk.f5480h;
                i3 = c1740gk.f5482v;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
