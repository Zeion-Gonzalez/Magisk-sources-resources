package p000a;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: a.NJ */
/* loaded from: classes.dex */
public final class RunnableC0705NJ implements Runnable {

    /* renamed from: I */
    public Interpolator f2366I;

    /* renamed from: R */
    public int f2367R;

    /* renamed from: S */
    public int f2368S;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f2369g;

    /* renamed from: k */
    public boolean f2370k;

    /* renamed from: q */
    public boolean f2371q;

    /* renamed from: w */
    public OverScroller f2372w;

    public RunnableC0705NJ(RecyclerView recyclerView) {
        this.f2369g = recyclerView;
        InterpolatorC0315G0 interpolatorC0315G0 = RecyclerView.f9054F3;
        this.f2366I = interpolatorC0315G0;
        this.f2371q = false;
        this.f2370k = false;
        this.f2372w = new OverScroller(recyclerView.getContext(), interpolatorC0315G0);
    }

    /* renamed from: h */
    public final void m1637h() {
        if (this.f2371q) {
            this.f2370k = true;
            return;
        }
        RecyclerView recyclerView = this.f2369g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4120S(recyclerView, this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        boolean awakenScrollBars;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        RecyclerView recyclerView = this.f2369g;
        if (recyclerView.f9077J == null) {
            recyclerView.removeCallbacks(this);
            this.f2372w.abortAnimation();
            return;
        }
        this.f2370k = false;
        this.f2371q = true;
        recyclerView.m4910I();
        OverScroller overScroller = this.f2372w;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i4 = currX - this.f2368S;
            int i5 = currY - this.f2367R;
            this.f2368S = currX;
            this.f2367R = currY;
            int m4898w = RecyclerView.m4898w(i4, recyclerView.f9112l, recyclerView.f9118nP, recyclerView.getWidth());
            int m4898w2 = RecyclerView.m4898w(i5, recyclerView.f9096b, recyclerView.f9094Yd, recyclerView.getHeight());
            int[] iArr = recyclerView.f9071Fu;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean m2081v = recyclerView.m4929d().m2081v(m4898w, m4898w2, iArr, null, 1);
            int[] iArr2 = recyclerView.f9071Fu;
            if (m2081v) {
                m4898w -= iArr2[0];
                m4898w2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m4916R(m4898w, m4898w2);
            }
            if (recyclerView.f9124r != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m4951zx(m4898w, m4898w2, iArr2);
                i = iArr2[0];
                i2 = iArr2[1];
                m4898w -= i;
                m4898w2 -= i2;
                C2593wr c2593wr = recyclerView.f9077J.f2162N;
                if (c2593wr != null && !c2593wr.f7956P && c2593wr.f7955N) {
                    int m1190h = recyclerView.f9064BX.m1190h();
                    if (m1190h == 0) {
                        c2593wr.m4467W();
                    } else {
                        if (c2593wr.f7967z >= m1190h) {
                            c2593wr.f7967z = m1190h - 1;
                        }
                        c2593wr.m4468u(i, i2);
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            if (!recyclerView.f9073H.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f9071Fu;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m4929d().m2075N(i, i2, m4898w, m4898w2, null, 1, iArr3);
            int i6 = m4898w - iArr2[0];
            int i7 = m4898w2 - iArr2[1];
            if (i != 0 || i2 != 0) {
                recyclerView.m4947s(i, i2);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z = true;
            } else {
                z = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!overScroller.isFinished() && ((!z && i6 == 0) || (!z2 && i7 == 0))) {
                z3 = false;
            } else {
                z3 = true;
            }
            C2593wr c2593wr2 = recyclerView.f9077J.f2162N;
            if (c2593wr2 != null && c2593wr2.f7956P) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4 && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i6 < 0) {
                        i3 = -currVelocity;
                    } else if (i6 > 0) {
                        i3 = currVelocity;
                    } else {
                        i3 = 0;
                    }
                    if (i7 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i7 <= 0) {
                        currVelocity = 0;
                    }
                    if (i3 < 0) {
                        recyclerView.m4904E();
                        if (recyclerView.f9112l.isFinished()) {
                            recyclerView.f9112l.onAbsorb(-i3);
                        }
                    } else if (i3 > 0) {
                        recyclerView.m4932f();
                        if (recyclerView.f9118nP.isFinished()) {
                            recyclerView.f9118nP.onAbsorb(i3);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m4946r();
                        if (recyclerView.f9096b.isFinished()) {
                            recyclerView.f9096b.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m4919U();
                        if (recyclerView.f9094Yd.isFinished()) {
                            recyclerView.f9094Yd.onAbsorb(currVelocity);
                        }
                    }
                    if (i3 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                        AbstractC2397t8.m4115M(recyclerView);
                    }
                }
                if (RecyclerView.f9055KM) {
                    C2093nR c2093nR = recyclerView.f9072G5;
                    int[] iArr4 = (int[]) c2093nR.f6459P;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c2093nR.f6461v = 0;
                }
            } else {
                m1637h();
                RunnableC2026m8 runnableC2026m8 = recyclerView.f9119oI;
                if (runnableC2026m8 != null) {
                    runnableC2026m8.m3666z(recyclerView, i, i2);
                }
            }
        }
        C2593wr c2593wr3 = recyclerView.f9077J.f2162N;
        if (c2593wr3 != null && c2593wr3.f7956P) {
            c2593wr3.m4468u(0, 0);
        }
        this.f2371q = false;
        if (this.f2370k) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4120S(recyclerView, this);
        } else {
            recyclerView.m4920U8(0);
            recyclerView.m4929d().m2079o(1);
        }
    }

    /* renamed from: v */
    public final void m1638v(int i, int i2, int i3, Interpolator interpolator) {
        boolean z;
        int height;
        RecyclerView recyclerView = this.f2369g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f9054F3;
        }
        if (this.f2366I != interpolator) {
            this.f2366I = interpolator;
            this.f2372w = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2367R = 0;
        this.f2368S = 0;
        recyclerView.m4920U8(2);
        this.f2372w.startScroll(0, 0, i, i2, i4);
        m1637h();
    }

    /* renamed from: z */
    public final void m1639z(int i, int i2) {
        RecyclerView recyclerView = this.f2369g;
        recyclerView.m4920U8(2);
        this.f2367R = 0;
        this.f2368S = 0;
        Interpolator interpolator = this.f2366I;
        InterpolatorC0315G0 interpolatorC0315G0 = RecyclerView.f9054F3;
        if (interpolator != interpolatorC0315G0) {
            this.f2366I = interpolatorC0315G0;
            this.f2372w = new OverScroller(recyclerView.getContext(), interpolatorC0315G0);
        }
        this.f2372w.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m1637h();
    }
}
