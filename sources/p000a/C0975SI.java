package p000a;

/* renamed from: a.SI */
/* loaded from: classes.dex */
public final class C0975SI {

    /* renamed from: N */
    public int f3291N;

    /* renamed from: P */
    public int f3292P;

    /* renamed from: h */
    public int f3293h;

    /* renamed from: v */
    public int f3294v;

    /* renamed from: z */
    public int f3295z = 0;

    /* renamed from: z */
    public final boolean m2154z() {
        int i = this.f3295z;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f3292P;
            int i4 = this.f3293h;
            if ((((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) << 0) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.f3292P;
            int i6 = this.f3294v;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f3291N;
            int i8 = this.f3293h;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f3291N;
            int i10 = this.f3294v;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
