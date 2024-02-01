package p000a;

import android.util.SparseIntArray;

/* renamed from: a.sl */
/* loaded from: classes.dex */
public final class C2380sl {

    /* renamed from: P */
    public Object f7310P;

    /* renamed from: h */
    public boolean f7311h;

    /* renamed from: v */
    public Object f7312v;

    /* renamed from: z */
    public boolean f7313z;

    public C2380sl() {
        this.f7312v = new SparseIntArray();
        this.f7310P = new SparseIntArray();
        this.f7313z = false;
        this.f7311h = false;
    }

    /* renamed from: P */
    public final void m4097P() {
        ((SparseIntArray) this.f7312v).clear();
    }

    /* renamed from: h */
    public final int m4098h(int i, int i2) {
        if (!this.f7313z) {
            return i % i2;
        }
        int i3 = ((SparseIntArray) this.f7312v).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = i % i2;
        ((SparseIntArray) this.f7312v).put(i, i4);
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m4099v(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f7311h
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L48
            java.lang.Object r0 = r8.f7310P
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = r2
        L11:
            if (r5 > r3) goto L22
            int r6 = r5 + r3
            int r6 = r6 >>> r1
            int r7 = r0.keyAt(r6)
            if (r7 >= r9) goto L1f
            int r5 = r6 + 1
            goto L11
        L1f:
            int r3 = r6 + (-1)
            goto L11
        L22:
            int r5 = r5 + r4
            if (r5 < 0) goto L30
            int r3 = r0.size()
            if (r5 >= r3) goto L30
            int r0 = r0.keyAt(r5)
            goto L31
        L30:
            r0 = r4
        L31:
            if (r0 == r4) goto L48
            java.lang.Object r3 = r8.f7310P
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r0 = r8.m4098h(r0, r10)
            int r0 = r0 + r1
            if (r0 != r10) goto L4b
            int r3 = r3 + 1
            r0 = r2
            goto L4b
        L48:
            r0 = r2
            r3 = r0
            r4 = r3
        L4b:
            if (r4 >= r9) goto L5d
            int r0 = r0 + 1
            if (r0 != r10) goto L55
            int r3 = r3 + 1
            r0 = r2
            goto L5a
        L55:
            if (r0 <= r10) goto L5a
            int r3 = r3 + 1
            r0 = r1
        L5a:
            int r4 = r4 + 1
            goto L4b
        L5d:
            int r0 = r0 + r1
            if (r0 <= r10) goto L62
            int r3 = r3 + 1
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2380sl.m4099v(int, int):int");
    }

    /* renamed from: z */
    public final int m4100z(int i, int i2) {
        if (!this.f7311h) {
            return m4099v(i, i2);
        }
        int i3 = ((SparseIntArray) this.f7310P).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int m4099v = m4099v(i, i2);
        ((SparseIntArray) this.f7310P).put(i, m4099v);
        return m4099v;
    }

    public /* synthetic */ C2380sl(int i) {
    }
}
