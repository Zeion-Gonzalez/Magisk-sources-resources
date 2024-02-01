package p000a;

import java.util.Arrays;

/* renamed from: a.ww */
/* loaded from: classes.dex */
public final class C2598ww implements Comparable {

    /* renamed from: S */
    public boolean f7993S;

    /* renamed from: f */
    public int f7995f;

    /* renamed from: q */
    public float f7998q;

    /* renamed from: R */
    public int f7992R = -1;

    /* renamed from: w */
    public int f8000w = -1;

    /* renamed from: I */
    public int f7991I = 0;

    /* renamed from: k */
    public boolean f7997k = false;

    /* renamed from: g */
    public final float[] f7996g = new float[9];

    /* renamed from: y */
    public final float[] f8001y = new float[9];

    /* renamed from: s */
    public C1335Z1[] f7999s = new C1335Z1[16];

    /* renamed from: U */
    public int f7994U = 0;

    /* renamed from: E */
    public int f7990E = 0;

    public C2598ww(int i) {
        this.f7995f = i;
    }

    /* renamed from: N */
    public final void m4476N(C0457If c0457If, C1335Z1 c1335z1) {
        int i = this.f7994U;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7999s[i2].mo2182W(c0457If, c1335z1, false);
        }
        this.f7994U = 0;
    }

    /* renamed from: P */
    public final void m4477P(C0457If c0457If, float f) {
        this.f7998q = f;
        this.f7997k = true;
        int i = this.f7994U;
        this.f8000w = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7999s[i2].m2725o(c0457If, this, false);
        }
        this.f7994U = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7992R - ((C2598ww) obj).f7992R;
    }

    /* renamed from: h */
    public final void m4478h(C1335Z1 c1335z1) {
        int i = this.f7994U;
        int i2 = 0;
        while (i2 < i) {
            if (this.f7999s[i2] == c1335z1) {
                while (i2 < i - 1) {
                    C1335Z1[] c1335z1Arr = this.f7999s;
                    int i3 = i2 + 1;
                    c1335z1Arr[i2] = c1335z1Arr[i3];
                    i2 = i3;
                }
                this.f7994U--;
                return;
            }
            i2++;
        }
    }

    public final String toString() {
        return "" + this.f7992R;
    }

    /* renamed from: v */
    public final void m4479v() {
        this.f7995f = 5;
        this.f7991I = 0;
        this.f7992R = -1;
        this.f8000w = -1;
        this.f7998q = 0.0f;
        this.f7997k = false;
        int i = this.f7994U;
        for (int i2 = 0; i2 < i; i2++) {
            this.f7999s[i2] = null;
        }
        this.f7994U = 0;
        this.f7990E = 0;
        this.f7993S = false;
        Arrays.fill(this.f8001y, 0.0f);
    }

    /* renamed from: z */
    public final void m4480z(C1335Z1 c1335z1) {
        int i = 0;
        while (true) {
            int i2 = this.f7994U;
            if (i >= i2) {
                C1335Z1[] c1335z1Arr = this.f7999s;
                if (i2 >= c1335z1Arr.length) {
                    this.f7999s = (C1335Z1[]) Arrays.copyOf(c1335z1Arr, c1335z1Arr.length * 2);
                }
                C1335Z1[] c1335z1Arr2 = this.f7999s;
                int i3 = this.f7994U;
                c1335z1Arr2[i3] = c1335z1;
                this.f7994U = i3 + 1;
                return;
            }
            if (this.f7999s[i] == c1335z1) {
                return;
            } else {
                i++;
            }
        }
    }
}
