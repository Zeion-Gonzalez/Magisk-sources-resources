package p000a;

import android.graphics.Insets;

/* renamed from: a.zj */
/* loaded from: classes.dex */
public final class C2739zj {

    /* renamed from: N */
    public static final C2739zj f8590N = new C2739zj(0, 0, 0, 0);

    /* renamed from: P */
    public final int f8591P;

    /* renamed from: h */
    public final int f8592h;

    /* renamed from: v */
    public final int f8593v;

    /* renamed from: z */
    public final int f8594z;

    public C2739zj(int i, int i2, int i3, int i4) {
        this.f8594z = i;
        this.f8592h = i2;
        this.f8593v = i3;
        this.f8591P = i4;
    }

    /* renamed from: h */
    public static C2739zj m4673h(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f8590N : new C2739zj(i, i2, i3, i4);
    }

    /* renamed from: v */
    public static C2739zj m4674v(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return m4673h(i, i2, i3, i4);
    }

    /* renamed from: z */
    public static C2739zj m4675z(C2739zj c2739zj, C2739zj c2739zj2) {
        return m4673h(Math.max(c2739zj.f8594z, c2739zj2.f8594z), Math.max(c2739zj.f8592h, c2739zj2.f8592h), Math.max(c2739zj.f8593v, c2739zj2.f8593v), Math.max(c2739zj.f8591P, c2739zj2.f8591P));
    }

    /* renamed from: P */
    public final Insets m4676P() {
        return AbstractC1801hv.m3356z(this.f8594z, this.f8592h, this.f8593v, this.f8591P);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2739zj.class != obj.getClass()) {
            return false;
        }
        C2739zj c2739zj = (C2739zj) obj;
        return this.f8591P == c2739zj.f8591P && this.f8594z == c2739zj.f8594z && this.f8593v == c2739zj.f8593v && this.f8592h == c2739zj.f8592h;
    }

    public final int hashCode() {
        return (((((this.f8594z * 31) + this.f8592h) * 31) + this.f8593v) * 31) + this.f8591P;
    }

    public final String toString() {
        return "Insets{left=" + this.f8594z + ", top=" + this.f8592h + ", right=" + this.f8593v + ", bottom=" + this.f8591P + '}';
    }
}
