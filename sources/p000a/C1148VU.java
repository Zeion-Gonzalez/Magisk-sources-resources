package p000a;

/* renamed from: a.VU */
/* loaded from: classes.dex */
public final class C1148VU {

    /* renamed from: h */
    public final int[] f3732h = new int[10];

    /* renamed from: z */
    public int f3733z;

    /* renamed from: h */
    public final void m2359h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f3732h;
            if (i >= iArr.length) {
                return;
            }
            this.f3733z = (1 << i) | this.f3733z;
            iArr[i] = i2;
        }
    }

    /* renamed from: z */
    public final int m2360z() {
        if ((this.f3733z & 128) != 0) {
            return this.f3732h[7];
        }
        return 65535;
    }
}
