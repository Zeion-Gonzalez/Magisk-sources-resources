package p000a;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.wr */
/* loaded from: classes.dex */
public class C2593wr {

    /* renamed from: M */
    public PointF f7954M;

    /* renamed from: N */
    public boolean f7955N;

    /* renamed from: P */
    public boolean f7956P;

    /* renamed from: Q */
    public View f7957Q;

    /* renamed from: R */
    public float f7958R;

    /* renamed from: V */
    public final DisplayMetrics f7960V;

    /* renamed from: h */
    public RecyclerView f7962h;

    /* renamed from: o */
    public boolean f7963o;

    /* renamed from: v */
    public AbstractC0667Md f7965v;

    /* renamed from: z */
    public int f7967z = -1;

    /* renamed from: u */
    public final C1730ga f7964u = new C1730ga();

    /* renamed from: W */
    public final LinearInterpolator f7961W = new LinearInterpolator();

    /* renamed from: G */
    public final DecelerateInterpolator f7952G = new DecelerateInterpolator();

    /* renamed from: S */
    public boolean f7959S = false;

    /* renamed from: w */
    public int f7966w = 0;

    /* renamed from: I */
    public int f7953I = 0;

    public C2593wr(Context context) {
        this.f7960V = context.getResources().getDisplayMetrics();
    }

    /* renamed from: z */
    public static int m4466z(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* renamed from: N */
    public int mo2268N(int i) {
        float abs = Math.abs(i);
        if (!this.f7959S) {
            this.f7958R = mo2269P(this.f7960V);
            this.f7959S = true;
        }
        return (int) Math.ceil(abs * this.f7958R);
    }

    /* renamed from: P */
    public float mo2269P(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: Q */
    public PointF mo2270Q(int i) {
        AbstractC0667Md abstractC0667Md = this.f7965v;
        if (abstractC0667Md instanceof InterfaceC1877jM) {
            return ((InterfaceC1877jM) abstractC0667Md).mo3494z(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1877jM.class.getCanonicalName());
        return null;
    }

    /* renamed from: W */
    public final void m4467W() {
        if (this.f7955N) {
            this.f7955N = false;
            this.f7953I = 0;
            this.f7966w = 0;
            this.f7954M = null;
            this.f7962h.f9064BX.f1665z = -1;
            this.f7957Q = null;
            this.f7967z = -1;
            this.f7956P = false;
            AbstractC0667Md abstractC0667Md = this.f7965v;
            if (abstractC0667Md.f2162N == this) {
                abstractC0667Md.f2162N = null;
            }
            this.f7965v = null;
            this.f7962h = null;
        }
    }

    /* renamed from: h */
    public int mo2271h(View view, int i) {
        AbstractC0667Md abstractC0667Md = this.f7965v;
        if (abstractC0667Md != null && abstractC0667Md.mo1507P()) {
            C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
            return m4466z((view.getLeft() - ((C0419Hv) view.getLayoutParams()).f1395h.left) - ((ViewGroup.MarginLayoutParams) c0419Hv).leftMargin, view.getRight() + ((C0419Hv) view.getLayoutParams()).f1395h.right + ((ViewGroup.MarginLayoutParams) c0419Hv).rightMargin, abstractC0667Md.m1496H(), abstractC0667Md.f2165R - abstractC0667Md.m1529e(), i);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2272o(android.view.View r6, p000a.C0496JN r7, p000a.C1730ga r8) {
        /*
            r5 = this;
            android.graphics.PointF r7 = r5.f7954M
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r7 == 0) goto L15
            float r7 = r7.x
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto Lf
            goto L15
        Lf:
            if (r7 <= 0) goto L13
            r7 = r0
            goto L16
        L13:
            r7 = r1
            goto L16
        L15:
            r7 = r3
        L16:
            int r7 = r5.mo2271h(r6, r7)
            android.graphics.PointF r4 = r5.f7954M
            if (r4 == 0) goto L29
            float r4 = r4.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L25
            goto L29
        L25:
            if (r2 <= 0) goto L2a
            r1 = r0
            goto L2a
        L29:
            r1 = r3
        L2a:
            int r6 = r5.mo2273v(r6, r1)
            int r1 = r7 * r7
            int r2 = r6 * r6
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r5.mo2268N(r1)
            double r1 = (double) r1
            r3 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r3
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r7 = -r7
            int r6 = -r6
            android.view.animation.DecelerateInterpolator r2 = r5.f7952G
            r8.f5457z = r7
            r8.f5454h = r6
            r8.f5456v = r1
            r8.f5451N = r2
            r8.f5453Q = r0
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2593wr.mo2272o(android.view.View, a.JN, a.ga):void");
    }

    /* renamed from: u */
    public final void m4468u(int i, int i2) {
        PointF mo2270Q;
        RecyclerView recyclerView = this.f7962h;
        int i3 = -1;
        if (this.f7967z == -1 || recyclerView == null) {
            m4467W();
        }
        if (this.f7956P && this.f7957Q == null && this.f7965v != null && (mo2270Q = mo2270Q(this.f7967z)) != null) {
            float f = mo2270Q.x;
            if (f != 0.0f || mo2270Q.y != 0.0f) {
                recyclerView.m4951zx((int) Math.signum(f), (int) Math.signum(mo2270Q.y), null);
            }
        }
        boolean z = false;
        this.f7956P = false;
        View view = this.f7957Q;
        C1730ga c1730ga = this.f7964u;
        if (view != null) {
            this.f7962h.getClass();
            AbstractC0249El m4894j = RecyclerView.m4894j(view);
            if (m4894j != null) {
                i3 = m4894j.m531v();
            }
            if (i3 == this.f7967z) {
                mo2272o(this.f7957Q, recyclerView.f9064BX, c1730ga);
                c1730ga.m3264z(recyclerView);
                m4467W();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f7957Q = null;
            }
        }
        if (this.f7955N) {
            C0496JN c0496jn = recyclerView.f9064BX;
            if (this.f7962h.f9077J.m1513U() == 0) {
                m4467W();
            } else {
                int i4 = this.f7966w;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.f7966w = i5;
                int i6 = this.f7953I;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f7953I = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF mo2270Q2 = mo2270Q(this.f7967z);
                    if (mo2270Q2 != null) {
                        if (mo2270Q2.x != 0.0f || mo2270Q2.y != 0.0f) {
                            float f2 = mo2270Q2.y;
                            float sqrt = (float) Math.sqrt((f2 * f2) + (r10 * r10));
                            float f3 = mo2270Q2.x / sqrt;
                            mo2270Q2.x = f3;
                            float f4 = mo2270Q2.y / sqrt;
                            mo2270Q2.y = f4;
                            this.f7954M = mo2270Q2;
                            this.f7966w = (int) (f3 * 10000.0f);
                            this.f7953I = (int) (f4 * 10000.0f);
                            int mo2268N = mo2268N(10000);
                            LinearInterpolator linearInterpolator = this.f7961W;
                            c1730ga.f5457z = (int) (this.f7966w * 1.2f);
                            c1730ga.f5454h = (int) (this.f7953I * 1.2f);
                            c1730ga.f5456v = (int) (mo2268N * 1.2f);
                            c1730ga.f5451N = linearInterpolator;
                            c1730ga.f5453Q = true;
                        }
                    }
                    c1730ga.f5452P = this.f7967z;
                    m4467W();
                }
            }
            if (c1730ga.f5452P >= 0) {
                z = true;
            }
            c1730ga.m3264z(recyclerView);
            if (z && this.f7955N) {
                this.f7956P = true;
                recyclerView.f9084Pm.m1637h();
            }
        }
    }

    /* renamed from: v */
    public int mo2273v(View view, int i) {
        AbstractC0667Md abstractC0667Md = this.f7965v;
        if (abstractC0667Md != null && abstractC0667Md.mo1504N()) {
            C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
            return m4466z((view.getTop() - ((C0419Hv) view.getLayoutParams()).f1395h.top) - ((ViewGroup.MarginLayoutParams) c0419Hv).topMargin, view.getBottom() + ((C0419Hv) view.getLayoutParams()).f1395h.bottom + ((ViewGroup.MarginLayoutParams) c0419Hv).bottomMargin, abstractC0667Md.m1518X(), abstractC0667Md.f2173w - abstractC0667Md.m1523c(), i);
        }
        return 0;
    }
}
