package p000a;

import java.util.Arrays;

/* renamed from: a.g0 */
/* loaded from: classes.dex */
public final class C1703g0 {

    /* renamed from: P */
    public boolean f5331P;

    /* renamed from: h */
    public final boolean[] f5332h;

    /* renamed from: v */
    public final int[] f5333v;

    /* renamed from: z */
    public final long[] f5334z;

    public C1703g0(int i) {
        this.f5334z = new long[i];
        this.f5332h = new boolean[i];
        this.f5333v = new int[i];
    }

    /* renamed from: h */
    public final void m3210h() {
        synchronized (this) {
            Arrays.fill(this.f5332h, false);
            this.f5331P = true;
        }
    }

    /* renamed from: z */
    public final int[] m3211z() {
        synchronized (this) {
            if (!this.f5331P) {
                return null;
            }
            long[] jArr = this.f5334z;
            int length = jArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                int i4 = 1;
                boolean z = jArr[i] > 0;
                boolean[] zArr = this.f5332h;
                if (z != zArr[i2]) {
                    int[] iArr = this.f5333v;
                    if (!z) {
                        i4 = 2;
                    }
                    iArr[i2] = i4;
                } else {
                    this.f5333v[i2] = 0;
                }
                zArr[i2] = z;
                i++;
                i2 = i3;
            }
            this.f5331P = false;
            return (int[]) this.f5333v.clone();
        }
    }
}
