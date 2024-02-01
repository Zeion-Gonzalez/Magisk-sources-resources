package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.MJ */
/* loaded from: classes.dex */
public final class C0652MJ implements Iterator, InterfaceC1564dP {

    /* renamed from: I */
    public C0325GF f2096I;

    /* renamed from: R */
    public int f2097R;

    /* renamed from: S */
    public int f2098S = -1;

    /* renamed from: k */
    public final /* synthetic */ C2556wA f2099k;

    /* renamed from: q */
    public int f2100q;

    /* renamed from: w */
    public int f2101w;

    public C0652MJ(C2556wA c2556wA) {
        this.f2099k = c2556wA;
        int i = c2556wA.f7806h;
        int length = c2556wA.f7808z.length();
        if (length >= 0) {
            if (i < 0) {
                i = 0;
            } else if (i > length) {
                i = length;
            }
            this.f2097R = i;
            this.f2101w = i;
            return;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4190Q("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2098S == -1) {
            m1457z();
        }
        return this.f2098S == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2098S == -1) {
            m1457z();
        }
        if (this.f2098S != 0) {
            C0325GF c0325gf = this.f2096I;
            this.f2096I = null;
            this.f2098S = -1;
            return c0325gf;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0018, code lost:
    
        if (r6 < r3) goto L32;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1457z() {
        /*
            r7 = this;
            int r0 = r7.f2101w
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f2098S = r1
            r0 = 0
            r7.f2096I = r0
            goto L77
        Lb:
            a.wA r2 = r7.f2099k
            int r3 = r2.f7807v
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f2100q
            int r6 = r6 + r5
            r7.f2100q = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f7808z
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            a.GF r0 = new a.GF
            int r1 = r7.f2097R
            java.lang.CharSequence r2 = r2.f7808z
            int r2 = p000a.AbstractC1269Xn.m2592tJ(r2)
            r0.<init>(r1, r2)
        L2f:
            r7.f2096I = r0
            r7.f2101w = r4
            goto L75
        L34:
            a.KW r0 = r2.f7805P
            java.lang.CharSequence r3 = r2.f7808z
            int r6 = r7.f2101w
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.mo51o(r3, r6)
            a.Bc r0 = (p000a.C0084Bc) r0
            if (r0 != 0) goto L54
            a.GF r0 = new a.GF
            int r1 = r7.f2097R
            java.lang.CharSequence r2 = r2.f7808z
            int r2 = p000a.AbstractC1269Xn.m2592tJ(r2)
            r0.<init>(r1, r2)
            goto L2f
        L54:
            java.lang.Object r2 = r0.f329S
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f328R
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f2097R
            a.GF r3 = p000a.AbstractC1292YB.m2645EC(r3, r2)
            r7.f2096I = r3
            int r2 = r2 + r0
            r7.f2097R = r2
            if (r0 != 0) goto L72
            r1 = r5
        L72:
            int r2 = r2 + r1
            r7.f2101w = r2
        L75:
            r7.f2098S = r5
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0652MJ.m1457z():void");
    }
}
