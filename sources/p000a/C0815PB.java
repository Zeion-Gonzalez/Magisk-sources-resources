package p000a;

/* renamed from: a.PB */
/* loaded from: classes.dex */
public final class C0815PB {

    /* renamed from: N */
    public final boolean f2766N;

    /* renamed from: P */
    public final boolean f2767P;

    /* renamed from: Q */
    public final int f2768Q;

    /* renamed from: W */
    public final int f2769W;

    /* renamed from: h */
    public final boolean f2770h;

    /* renamed from: o */
    public final int f2771o;

    /* renamed from: u */
    public final int f2772u;

    /* renamed from: v */
    public final int f2773v;

    /* renamed from: z */
    public final boolean f2774z;

    public C0815PB(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.f2774z = z;
        this.f2770h = z2;
        this.f2773v = i;
        this.f2767P = z3;
        this.f2766N = z4;
        this.f2768Q = i2;
        this.f2772u = i3;
        this.f2771o = i4;
        this.f2769W = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1292YB.m2695u(C0815PB.class, obj.getClass())) {
            return false;
        }
        C0815PB c0815pb = (C0815PB) obj;
        if (this.f2774z == c0815pb.f2774z && this.f2770h == c0815pb.f2770h && this.f2773v == c0815pb.f2773v) {
            c0815pb.getClass();
            if (AbstractC1292YB.m2695u(null, null) && this.f2767P == c0815pb.f2767P && this.f2766N == c0815pb.f2766N && this.f2768Q == c0815pb.f2768Q && this.f2772u == c0815pb.f2772u && this.f2771o == c0815pb.f2771o && this.f2769W == c0815pb.f2769W) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f2774z ? 1 : 0) * 31) + (this.f2770h ? 1 : 0)) * 31) + this.f2773v) * 31) + 0) * 31) + (this.f2767P ? 1 : 0)) * 31) + (this.f2766N ? 1 : 0)) * 31) + this.f2768Q) * 31) + this.f2772u) * 31) + this.f2771o) * 31) + this.f2769W;
    }
}
