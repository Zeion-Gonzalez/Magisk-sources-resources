package p000a;

import android.window.BackEvent;

/* renamed from: a.cG */
/* loaded from: classes.dex */
public final class C1499cG {

    /* renamed from: P */
    public final int f4649P;

    /* renamed from: h */
    public final float f4650h;

    /* renamed from: v */
    public final float f4651v;

    /* renamed from: z */
    public final float f4652z;

    public C1499cG(BackEvent backEvent) {
        C1949kh c1949kh = C1949kh.f6040z;
        float m3565P = c1949kh.m3565P(backEvent);
        float m3564N = c1949kh.m3564N(backEvent);
        float m3566h = c1949kh.m3566h(backEvent);
        int m3567v = c1949kh.m3567v(backEvent);
        this.f4652z = m3565P;
        this.f4650h = m3564N;
        this.f4651v = m3566h;
        this.f4649P = m3567v;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f4652z + ", touchY=" + this.f4650h + ", progress=" + this.f4651v + ", swipeEdge=" + this.f4649P + '}';
    }
}
