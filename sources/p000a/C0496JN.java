package p000a;

/* renamed from: a.JN */
/* loaded from: classes.dex */
public final class C0496JN {

    /* renamed from: R */
    public int f1657R;

    /* renamed from: S */
    public long f1658S;

    /* renamed from: V */
    public int f1659V;

    /* renamed from: z */
    public int f1665z = -1;

    /* renamed from: h */
    public int f1661h = 0;

    /* renamed from: v */
    public int f1664v = 0;

    /* renamed from: P */
    public int f1655P = 1;

    /* renamed from: N */
    public int f1654N = 0;

    /* renamed from: Q */
    public boolean f1656Q = false;

    /* renamed from: u */
    public boolean f1663u = false;

    /* renamed from: o */
    public boolean f1662o = false;

    /* renamed from: W */
    public boolean f1660W = false;

    /* renamed from: G */
    public boolean f1652G = false;

    /* renamed from: M */
    public boolean f1653M = false;

    /* renamed from: h */
    public final int m1190h() {
        return this.f1663u ? this.f1661h - this.f1664v : this.f1654N;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1665z + ", mData=null, mItemCount=" + this.f1654N + ", mIsMeasuring=" + this.f1660W + ", mPreviousLayoutItemCount=" + this.f1661h + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1664v + ", mStructureChanged=" + this.f1656Q + ", mInPreLayout=" + this.f1663u + ", mRunSimpleAnimations=" + this.f1652G + ", mRunPredictiveAnimations=" + this.f1653M + '}';
    }

    /* renamed from: z */
    public final void m1191z(int i) {
        if ((this.f1655P & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f1655P));
    }
}
