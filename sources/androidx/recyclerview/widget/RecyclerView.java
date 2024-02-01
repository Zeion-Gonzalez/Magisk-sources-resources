package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.AbstractC0249El;
import p000a.AbstractC0408Hk;
import p000a.AbstractC0632Lt;
import p000a.AbstractC0667Md;
import p000a.AbstractC0752O4;
import p000a.AbstractC0795Op;
import p000a.AbstractC1034TO;
import p000a.AbstractC1292YB;
import p000a.AbstractC1404aL;
import p000a.AbstractC1467ba;
import p000a.AbstractC1548d9;
import p000a.AbstractC1843ih;
import p000a.AbstractC2397t8;
import p000a.AbstractC2441tz;
import p000a.AbstractC2446u3;
import p000a.AbstractC2574wV;
import p000a.C0093Bo;
import p000a.C0380HF;
import p000a.C0419Hv;
import p000a.C0469Is;
import p000a.C0496JN;
import p000a.C0641M3;
import p000a.C0712NQ;
import p000a.C0787Of;
import p000a.C0872QL;
import p000a.C0926RQ;
import p000a.C1105Ui;
import p000a.C1192WI;
import p000a.C1228Wy;
import p000a.C1276Xv;
import p000a.C1280Xz;
import p000a.C1578df;
import p000a.C1710g8;
import p000a.C2093nR;
import p000a.C2247qL;
import p000a.C2382so;
import p000a.C2402tF;
import p000a.C2593wr;
import p000a.C2659yA;
import p000a.C2700yz;
import p000a.InterfaceC2218po;
import p000a.InterfaceC2383sq;
import p000a.InterpolatorC0315G0;
import p000a.RunnableC0705NJ;
import p000a.RunnableC0814PA;
import p000a.RunnableC2026m8;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC2218po {

    /* renamed from: F3 */
    public static final InterpolatorC0315G0 f9054F3;

    /* renamed from: fc */
    public static final Class[] f9059fc;

    /* renamed from: gv */
    public static final C2659yA f9060gv;

    /* renamed from: B */
    public boolean f9062B;

    /* renamed from: BO */
    public AbstractC0632Lt f9063BO;

    /* renamed from: BX */
    public final C0496JN f9064BX;

    /* renamed from: C */
    public boolean f9065C;

    /* renamed from: D */
    public int f9066D;

    /* renamed from: E */
    public final Rect f9067E;

    /* renamed from: EC */
    public int f9068EC;

    /* renamed from: EQ */
    public final int[] f9069EQ;

    /* renamed from: F */
    public InterfaceC2383sq f9070F;

    /* renamed from: Fu */
    public final int[] f9071Fu;

    /* renamed from: G5 */
    public final C2093nR f9072G5;

    /* renamed from: H */
    public final ArrayList f9073H;

    /* renamed from: HL */
    public int f9074HL;

    /* renamed from: Ha */
    public final boolean f9075Ha;

    /* renamed from: I */
    public C2700yz f9076I;

    /* renamed from: J */
    public AbstractC0667Md f9077J;

    /* renamed from: K */
    public int f9078K;

    /* renamed from: L */
    public int f9079L;

    /* renamed from: Lq */
    public final float f9080Lq;

    /* renamed from: M6 */
    public final RunnableC0814PA f9081M6;

    /* renamed from: O */
    public boolean f9082O;

    /* renamed from: O4 */
    public boolean f9083O4;

    /* renamed from: Pm */
    public final RunnableC0705NJ f9084Pm;

    /* renamed from: R */
    public final C0641M3 f9085R;

    /* renamed from: Rh */
    public final ArrayList f9086Rh;

    /* renamed from: Ry */
    public final int[] f9087Ry;

    /* renamed from: S */
    public final float f9088S;

    /* renamed from: T */
    public final AccessibilityManager f9089T;

    /* renamed from: T0 */
    public boolean f9090T0;

    /* renamed from: U */
    public final Rect f9091U;

    /* renamed from: U8 */
    public final int f9092U8;

    /* renamed from: UZ */
    public int f9093UZ;

    /* renamed from: Yd */
    public EdgeEffect f9094Yd;

    /* renamed from: ZH */
    public final float f9095ZH;

    /* renamed from: b */
    public EdgeEffect f9096b;

    /* renamed from: c */
    public final ArrayList f9097c;

    /* renamed from: d */
    public boolean f9098d;

    /* renamed from: d2 */
    public ArrayList f9099d2;

    /* renamed from: d3 */
    public C0469Is f9100d3;

    /* renamed from: dG */
    public boolean f9101dG;

    /* renamed from: dx */
    public final int f9102dx;

    /* renamed from: e */
    public final ArrayList f9103e;

    /* renamed from: f */
    public final RectF f9104f;

    /* renamed from: fH */
    public final C0872QL f9105fH;

    /* renamed from: g */
    public final C1105Ui f9106g;

    /* renamed from: he */
    public final int f9107he;

    /* renamed from: i */
    public boolean f9108i;

    /* renamed from: j */
    public boolean f9109j;

    /* renamed from: j5 */
    public int f9110j5;

    /* renamed from: k */
    public C0712NQ f9111k;

    /* renamed from: l */
    public EdgeEffect f9112l;

    /* renamed from: m */
    public C1710g8 f9113m;

    /* renamed from: n */
    public int f9114n;

    /* renamed from: n0 */
    public int f9115n0;

    /* renamed from: nB */
    public boolean f9116nB;

    /* renamed from: nF */
    public VelocityTracker f9117nF;

    /* renamed from: nP */
    public EdgeEffect f9118nP;

    /* renamed from: oI */
    public RunnableC2026m8 f9119oI;

    /* renamed from: od */
    public int f9120od;

    /* renamed from: p */
    public boolean f9121p;

    /* renamed from: q */
    public C1280Xz f9122q;

    /* renamed from: qn */
    public final C1192WI f9123qn;

    /* renamed from: r */
    public AbstractC0408Hk f9124r;

    /* renamed from: s */
    public final RunnableC0814PA f9125s;

    /* renamed from: t */
    public boolean f9126t;

    /* renamed from: tJ */
    public C0926RQ f9127tJ;

    /* renamed from: w */
    public final C1578df f9128w;

    /* renamed from: x */
    public boolean f9129x;

    /* renamed from: y */
    public boolean f9130y;

    /* renamed from: yF */
    public final int[] f9131yF;

    /* renamed from: zd */
    public int f9132zd;

    /* renamed from: zx */
    public int f9133zx;

    /* renamed from: LN */
    public static final int[] f9056LN = {16843830};

    /* renamed from: W9 */
    public static final float f9058W9 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: S3 */
    public static final boolean f9057S3 = true;

    /* renamed from: hs */
    public static final boolean f9061hs = true;

    /* renamed from: KM */
    public static final boolean f9055KM = true;

    static {
        Class cls = Integer.TYPE;
        f9059fc = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f9054F3 = new InterpolatorC0315G0(1);
        f9060gv = new C2659yA(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* renamed from: V */
    public static void m4890V(AbstractC0249El abstractC0249El) {
        WeakReference weakReference = abstractC0249El.f859h;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == abstractC0249El.f866z) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                abstractC0249El.f859h = null;
                return;
            }
        }
    }

    /* renamed from: X */
    public static RecyclerView m4891X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView m4891X = m4891X(viewGroup.getChildAt(i));
            if (m4891X != null) {
                return m4891X;
            }
        }
        return null;
    }

    /* renamed from: i */
    public static long m4893i() {
        if (f9055KM) {
            return System.nanoTime();
        }
        return 0L;
    }

    /* renamed from: j */
    public static AbstractC0249El m4894j(View view) {
        if (view == null) {
            return null;
        }
        return ((C0419Hv) view.getLayoutParams()).f1397z;
    }

    /* renamed from: qn */
    private int m4895qn(int i, float f) {
        float m3449l;
        EdgeEffect edgeEffect;
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect2 = this.f9096b;
        float f2 = 0.0f;
        if (edgeEffect2 == null || AbstractC1843ih.m3441e(edgeEffect2) == 0.0f) {
            EdgeEffect edgeEffect3 = this.f9094Yd;
            if (edgeEffect3 != null && AbstractC1843ih.m3441e(edgeEffect3) != 0.0f) {
                if (canScrollVertically(1)) {
                    edgeEffect = this.f9094Yd;
                    edgeEffect.onRelease();
                } else {
                    m3449l = AbstractC1843ih.m3449l(this.f9094Yd, height, 1.0f - width);
                    if (AbstractC1843ih.m3441e(this.f9094Yd) == 0.0f) {
                        this.f9094Yd.onRelease();
                    }
                    f2 = m3449l;
                }
            }
            return Math.round(f2 * getHeight());
        }
        if (canScrollVertically(-1)) {
            edgeEffect = this.f9096b;
            edgeEffect.onRelease();
        } else {
            m3449l = -AbstractC1843ih.m3449l(this.f9096b, -height, width);
            if (AbstractC1843ih.m3441e(this.f9096b) == 0.0f) {
                this.f9096b.onRelease();
            }
            f2 = m3449l;
        }
        invalidate();
        return Math.round(f2 * getHeight());
    }

    /* renamed from: w */
    public static int m4898w(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC1843ih.m3441e(edgeEffect) != 0.0f) {
            int round = Math.round(AbstractC1843ih.m3449l(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC1843ih.m3441e(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int round2 = Math.round(AbstractC1843ih.m3449l(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (round2 != i) {
            edgeEffect2.finish();
        }
        return i - round2;
    }

    /* renamed from: B */
    public final void m4900B() {
        this.f9078K++;
    }

    /* renamed from: BO */
    public final boolean m4901BO(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float m3441e = AbstractC1843ih.m3441e(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f = this.f9088S * 0.015f;
        double log = Math.log(abs / f);
        double d = f9058W9;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < m3441e) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final long m4902C(AbstractC0249El abstractC0249El) {
        if (this.f9124r.f1374h) {
            return abstractC0249El.f851N;
        }
        return abstractC0249El.f864v;
    }

    /* renamed from: D */
    public final void m4903D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9120od) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f9120od = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f9115n0 = x;
            this.f9133zx = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f9068EC = y;
            this.f9093UZ = y;
        }
    }

    /* renamed from: E */
    public final void m4904E() {
        int measuredHeight;
        int measuredWidth;
        if (this.f9112l != null) {
            return;
        }
        EdgeEffect mo3241M = this.f9113m.mo3241M(this, 0);
        this.f9112l = mo3241M;
        if (this.f9130y) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        mo3241M.setSize(measuredHeight, measuredWidth);
    }

    /* renamed from: EC */
    public final void m4905EC(AbstractC0667Md abstractC0667Md) {
        C0872QL c0872ql;
        RecyclerView recyclerView;
        C2593wr c2593wr;
        if (abstractC0667Md == this.f9077J) {
            return;
        }
        int i = 0;
        m4920U8(0);
        RunnableC0705NJ runnableC0705NJ = this.f9084Pm;
        runnableC0705NJ.f2369g.removeCallbacks(runnableC0705NJ);
        runnableC0705NJ.f2372w.abortAnimation();
        AbstractC0667Md abstractC0667Md2 = this.f9077J;
        if (abstractC0667Md2 != null && (c2593wr = abstractC0667Md2.f2162N) != null) {
            c2593wr.m4467W();
        }
        AbstractC0667Md abstractC0667Md3 = this.f9077J;
        C1578df c1578df = this.f9128w;
        if (abstractC0667Md3 != null) {
            C1192WI c1192wi = this.f9123qn;
            if (c1192wi != null) {
                c1192wi.m2466o();
            }
            this.f9077J.m1515UZ(c1578df);
            this.f9077J.m1539n0(c1578df);
            ((ArrayList) c1578df.f4857v).clear();
            c1578df.m3057u();
            if (this.f9065C) {
                AbstractC0667Md abstractC0667Md4 = this.f9077J;
                abstractC0667Md4.f2171u = false;
                abstractC0667Md4.mo1555x(this);
            }
            this.f9077J.m1525d2(null);
            this.f9077J = null;
        } else {
            ((ArrayList) c1578df.f4857v).clear();
            c1578df.m3057u();
        }
        C0712NQ c0712nq = this.f9111k;
        c0712nq.f2392h.m4061u();
        ArrayList arrayList = c0712nq.f2393v;
        int size = arrayList.size();
        while (true) {
            size--;
            c0872ql = c0712nq.f2394z;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            c0872ql.getClass();
            AbstractC0249El m4894j = m4894j(view);
            if (m4894j != null) {
                int i2 = m4894j.f849I;
                RecyclerView recyclerView2 = c0872ql.f2961z;
                if (recyclerView2.m4938n()) {
                    m4894j.f862q = i2;
                    recyclerView2.f9086Rh.add(m4894j);
                } else {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC2397t8.m4123g(m4894j.f866z, i2);
                }
                m4894j.f849I = 0;
            }
            arrayList.remove(size);
        }
        int m2008v = c0872ql.m2008v();
        while (true) {
            recyclerView = c0872ql.f2961z;
            if (i >= m2008v) {
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getClass();
            m4894j(childAt);
            AbstractC0408Hk abstractC0408Hk = recyclerView.f9124r;
            childAt.clearAnimation();
            i++;
        }
        recyclerView.removeAllViews();
        this.f9077J = abstractC0667Md;
        if (abstractC0667Md != null) {
            if (abstractC0667Md.f2169h == null) {
                abstractC0667Md.m1525d2(this);
                if (this.f9065C) {
                    this.f9077J.f2171u = true;
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + abstractC0667Md + " is already attached to a RecyclerView:" + abstractC0667Md.f2169h.m4923Y());
            }
        }
        c1578df.m3051R();
        requestLayout();
    }

    /* renamed from: F */
    public final AbstractC0249El m4906F(int i) {
        AbstractC0249El abstractC0249El = null;
        if (this.f9126t) {
            return null;
        }
        int m1657o = this.f9111k.m1657o();
        for (int i2 = 0; i2 < m1657o; i2++) {
            AbstractC0249El m4894j = m4894j(this.f9111k.m1658u(i2));
            if (m4894j != null && !m4894j.m527W() && m4925Z(m4894j) == i) {
                if (!this.f9111k.m1650G(m4894j.f866z)) {
                    return m4894j;
                }
                abstractC0249El = m4894j;
            }
        }
        return abstractC0249El;
    }

    /* renamed from: G */
    public final void m4907G(AbstractC1467ba abstractC1467ba) {
        if (this.f9099d2 == null) {
            this.f9099d2 = new ArrayList();
        }
        this.f9099d2.add(abstractC1467ba);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x005c, code lost:
    
        if (r7 == 2) goto L74;
     */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4908H(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            java.util.ArrayList r1 = r12.f9103e
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L6c
            java.lang.Object r5 = r1.get(r4)
            a.sq r5 = (p000a.InterfaceC2383sq) r5
            r6 = r5
            a.LH r6 = (p000a.C0602LH) r6
            int r7 = r6.f1942U
            r8 = 1
            r9 = 2
            if (r7 != r8) goto L5c
            float r7 = r13.getX()
            float r10 = r13.getY()
            boolean r7 = r6.m1325N(r7, r10)
            float r10 = r13.getX()
            float r11 = r13.getY()
            boolean r10 = r6.m1326P(r10, r11)
            int r11 = r13.getAction()
            if (r11 != 0) goto L60
            if (r7 != 0) goto L3f
            if (r10 == 0) goto L60
        L3f:
            if (r10 == 0) goto L4c
            r6.f1932E = r8
            float r7 = r13.getX()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f1934I = r7
            goto L58
        L4c:
            if (r7 == 0) goto L58
            r6.f1932E = r9
            float r7 = r13.getY()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f1941S = r7
        L58:
            r6.m1329u(r9)
            goto L5e
        L5c:
            if (r7 != r9) goto L60
        L5e:
            r6 = r8
            goto L61
        L60:
            r6 = r3
        L61:
            if (r6 == 0) goto L69
            r6 = 3
            if (r0 == r6) goto L69
            r12.f9070F = r5
            return r8
        L69:
            int r4 = r4 + 1
            goto Lc
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4908H(android.view.MotionEvent):boolean");
    }

    /* renamed from: HL */
    public final void m4909HL(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f9091U;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0419Hv) {
            C0419Hv c0419Hv = (C0419Hv) layoutParams;
            if (!c0419Hv.f1396v) {
                int i = rect.left;
                Rect rect2 = c0419Hv.f1395h;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f9077J.mo1533he(this, view, this.f9091U, !this.f9109j, view2 == null);
    }

    /* renamed from: I */
    public final void m4910I() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f9109j && !this.f9126t) {
            if (!this.f9122q.m2618u()) {
                return;
            }
            C1280Xz c1280Xz = this.f9122q;
            int i = c1280Xz.f4109Q;
            boolean z4 = false;
            if ((4 & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if ((i & 11) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    int i2 = AbstractC2574wV.f7854z;
                    AbstractC1404aL.m2824z("RV PartialInvalidate");
                    m4930dx();
                    m4900B();
                    this.f9122q.m2608G();
                    if (!this.f9108i) {
                        int m1652N = this.f9111k.m1652N();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= m1652N) {
                                break;
                            }
                            AbstractC0249El m4894j = m4894j(this.f9111k.m1653P(i3));
                            if (m4894j != null && !m4894j.m532w()) {
                                if ((m4894j.f848G & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    z4 = true;
                                    break;
                                }
                            }
                            i3++;
                        }
                        if (z4) {
                            m4935k();
                        } else {
                            this.f9122q.m2616h();
                        }
                    }
                    m4926ZH(true);
                    m4912K(true);
                    AbstractC1404aL.m2823h();
                    return;
                }
            }
            if (c1280Xz.m2618u()) {
                int i4 = AbstractC2574wV.f7854z;
                AbstractC1404aL.m2824z("RV FullInvalidate");
                m4935k();
                AbstractC1404aL.m2823h();
                return;
            }
            return;
        }
        int i5 = AbstractC2574wV.f7854z;
        AbstractC1404aL.m2824z("RV FullInvalidate");
        m4935k();
        AbstractC1404aL.m2823h();
    }

    /* renamed from: J */
    public final void m4911J(C0496JN c0496jn) {
        if (this.f9074HL == 2) {
            OverScroller overScroller = this.f9084Pm.f2372w;
            overScroller.getFinalX();
            overScroller.getCurrX();
            c0496jn.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c0496jn.getClass();
    }

    /* renamed from: K */
    public final void m4912K(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.f9078K - 1;
        this.f9078K = i2;
        if (i2 < 1) {
            this.f9078K = 0;
            if (z) {
                int i3 = this.f9114n;
                this.f9114n = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f9089T;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z2 = false;
                    }
                    if (z2) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        AbstractC0752O4.m1725h(obtain, i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.f9086Rh;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0249El abstractC0249El = (AbstractC0249El) arrayList.get(size);
                    if (abstractC0249El.f866z.getParent() == this && !abstractC0249El.m532w() && (i = abstractC0249El.f862q) != -1) {
                        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                        AbstractC2397t8.m4123g(abstractC0249El.f866z, i);
                        abstractC0249El.f862q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: L */
    public final Rect m4913L(View view) {
        C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
        boolean z = c0419Hv.f1396v;
        Rect rect = c0419Hv.f1395h;
        if (!z) {
            return rect;
        }
        if (this.f9064BX.f1663u && (c0419Hv.m948h() || c0419Hv.f1397z.m530u())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f9073H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f9091U;
            rect2.set(0, 0, 0, 0);
            ((AbstractC1034TO) arrayList.get(i)).mo1388z(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0419Hv.f1396v = false;
        return rect;
    }

    /* renamed from: M */
    public final void m4914M(String str) {
        if (m4938n()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m4923Y());
        }
        if (this.f9066D > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m4923Y()));
        }
    }

    /* renamed from: O */
    public final void m4915O() {
        if (this.f9073H.size() == 0) {
            return;
        }
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null) {
            abstractC0667Md.mo1553v("Cannot invalidate item decorations during a scroll or layout");
        }
        m4918T();
        requestLayout();
    }

    /* renamed from: R */
    public final void m4916R(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f9112l;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.f9112l.onRelease();
            z = this.f9112l.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f9118nP;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f9118nP.onRelease();
            z |= this.f9118nP.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f9096b;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f9096b.onRelease();
            z |= this.f9096b.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f9094Yd;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f9094Yd.onRelease();
            z |= this.f9094Yd.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4115M(this);
        }
    }

    /* renamed from: S */
    public final void m4917S() {
        int m1657o = this.f9111k.m1657o();
        for (int i = 0; i < m1657o; i++) {
            AbstractC0249El m4894j = m4894j(this.f9111k.m1658u(i));
            if (!m4894j.m532w()) {
                m4894j.f852P = -1;
                m4894j.f863u = -1;
            }
        }
        C1578df c1578df = this.f9128w;
        int size = ((ArrayList) c1578df.f4851N).size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0249El abstractC0249El = (AbstractC0249El) ((ArrayList) c1578df.f4851N).get(i2);
            abstractC0249El.f852P = -1;
            abstractC0249El.f863u = -1;
        }
        ArrayList arrayList = (ArrayList) c1578df.f4857v;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0249El abstractC0249El2 = (AbstractC0249El) arrayList.get(i3);
            abstractC0249El2.f852P = -1;
            abstractC0249El2.f863u = -1;
        }
        ArrayList arrayList2 = (ArrayList) c1578df.f4852P;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC0249El abstractC0249El3 = (AbstractC0249El) ((ArrayList) c1578df.f4852P).get(i4);
                abstractC0249El3.f852P = -1;
                abstractC0249El3.f863u = -1;
            }
        }
    }

    /* renamed from: T */
    public final void m4918T() {
        int m1657o = this.f9111k.m1657o();
        for (int i = 0; i < m1657o; i++) {
            ((C0419Hv) this.f9111k.m1658u(i).getLayoutParams()).f1396v = true;
        }
        C1578df c1578df = this.f9128w;
        int size = ((ArrayList) c1578df.f4851N).size();
        for (int i2 = 0; i2 < size; i2++) {
            C0419Hv c0419Hv = (C0419Hv) ((AbstractC0249El) ((ArrayList) c1578df.f4851N).get(i2)).f866z.getLayoutParams();
            if (c0419Hv != null) {
                c0419Hv.f1396v = true;
            }
        }
    }

    /* renamed from: U */
    public final void m4919U() {
        int measuredWidth;
        int measuredHeight;
        if (this.f9094Yd != null) {
            return;
        }
        EdgeEffect mo3241M = this.f9113m.mo3241M(this, 3);
        this.f9094Yd = mo3241M;
        if (this.f9130y) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        mo3241M.setSize(measuredWidth, measuredHeight);
    }

    /* renamed from: U8 */
    public final void m4920U8(int i) {
        C2593wr c2593wr;
        if (i == this.f9074HL) {
            return;
        }
        this.f9074HL = i;
        if (i != 2) {
            RunnableC0705NJ runnableC0705NJ = this.f9084Pm;
            runnableC0705NJ.f2369g.removeCallbacks(runnableC0705NJ);
            runnableC0705NJ.f2372w.abortAnimation();
            AbstractC0667Md abstractC0667Md = this.f9077J;
            if (abstractC0667Md != null && (c2593wr = abstractC0667Md.f2162N) != null) {
                c2593wr.m4467W();
            }
        }
        AbstractC0667Md abstractC0667Md2 = this.f9077J;
        if (abstractC0667Md2 != null) {
            abstractC0667Md2.mo1558zx(i);
        }
        ArrayList arrayList = this.f9099d2;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AbstractC1467ba) this.f9099d2.get(size)).mo103z(this, i);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: UZ */
    public final void m4921UZ(int i) {
        C2593wr c2593wr;
        if (this.f9098d) {
            return;
        }
        m4920U8(0);
        RunnableC0705NJ runnableC0705NJ = this.f9084Pm;
        runnableC0705NJ.f2369g.removeCallbacks(runnableC0705NJ);
        runnableC0705NJ.f2372w.abortAnimation();
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null && (c2593wr = abstractC0667Md.f2162N) != null) {
            c2593wr.m4467W();
        }
        AbstractC0667Md abstractC0667Md2 = this.f9077J;
        if (abstractC0667Md2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0667Md2.mo1502Lq(i);
            awakenScrollBars();
        }
    }

    /* renamed from: W */
    public final void m4922W(AbstractC1034TO abstractC1034TO) {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null) {
            abstractC0667Md.mo1553v("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f9073H;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC1034TO);
        m4918T();
        requestLayout();
    }

    /* renamed from: Y */
    public final String m4923Y() {
        return " " + super.toString() + ", adapter:" + this.f9124r + ", layout:" + this.f9077J + ", context:" + getContext();
    }

    /* renamed from: Yd */
    public final int m4924Yd(int i, float f) {
        float m3449l;
        EdgeEffect edgeEffect;
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect2 = this.f9112l;
        float f2 = 0.0f;
        if (edgeEffect2 == null || AbstractC1843ih.m3441e(edgeEffect2) == 0.0f) {
            EdgeEffect edgeEffect3 = this.f9118nP;
            if (edgeEffect3 != null && AbstractC1843ih.m3441e(edgeEffect3) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    edgeEffect = this.f9118nP;
                    edgeEffect.onRelease();
                } else {
                    m3449l = AbstractC1843ih.m3449l(this.f9118nP, width, height);
                    if (AbstractC1843ih.m3441e(this.f9118nP) == 0.0f) {
                        this.f9118nP.onRelease();
                    }
                    f2 = m3449l;
                }
            }
            return Math.round(f2 * getWidth());
        }
        if (canScrollHorizontally(-1)) {
            edgeEffect = this.f9112l;
            edgeEffect.onRelease();
        } else {
            m3449l = -AbstractC1843ih.m3449l(this.f9112l, -width, 1.0f - height);
            if (AbstractC1843ih.m3441e(this.f9112l) == 0.0f) {
                this.f9112l.onRelease();
            }
            f2 = m3449l;
        }
        invalidate();
        return Math.round(f2 * getWidth());
    }

    /* renamed from: Z */
    public final int m4925Z(AbstractC0249El abstractC0249El) {
        boolean z;
        if ((abstractC0249El.f848G & 524) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && abstractC0249El.m523Q()) {
            C1280Xz c1280Xz = this.f9122q;
            int i = abstractC0249El.f864v;
            ArrayList arrayList = c1280Xz.f4110h;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0093Bo c0093Bo = (C0093Bo) arrayList.get(i2);
                int i3 = c0093Bo.f353z;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            int i4 = c0093Bo.f351h;
                            if (i4 == i) {
                                i = c0093Bo.f350P;
                            } else {
                                if (i4 < i) {
                                    i--;
                                }
                                if (c0093Bo.f350P <= i) {
                                    i++;
                                }
                            }
                        }
                    } else {
                        int i5 = c0093Bo.f351h;
                        if (i5 <= i) {
                            int i6 = c0093Bo.f350P;
                            if (i5 + i6 <= i) {
                                i -= i6;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (c0093Bo.f351h <= i) {
                    i += c0093Bo.f350P;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: ZH */
    public final void m4926ZH(boolean z) {
        if (this.f9079L < 1) {
            this.f9079L = 1;
        }
        if (!z && !this.f9098d) {
            this.f9108i = false;
        }
        if (this.f9079L == 1) {
            if (z && this.f9108i && !this.f9098d && this.f9077J != null && this.f9124r != null) {
                m4935k();
            }
            if (!this.f9098d) {
                this.f9108i = false;
            }
        }
        this.f9079L--;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null) {
            abstractC0667Md.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* renamed from: b */
    public final void m4927b(boolean z) {
        this.f9062B = z | this.f9062B;
        this.f9126t = true;
        int m1657o = this.f9111k.m1657o();
        for (int i = 0; i < m1657o; i++) {
            AbstractC0249El m4894j = m4894j(this.f9111k.m1658u(i));
            if (m4894j != null && !m4894j.m532w()) {
                m4894j.m528h(6);
            }
        }
        m4918T();
        C1578df c1578df = this.f9128w;
        int size = ((ArrayList) c1578df.f4851N).size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0249El abstractC0249El = (AbstractC0249El) ((ArrayList) c1578df.f4851N).get(i2);
            if (abstractC0249El != null) {
                abstractC0249El.m528h(6);
                abstractC0249El.m533z(null);
            }
        }
        AbstractC0408Hk abstractC0408Hk = c1578df.f4855o.f9124r;
        if (abstractC0408Hk == null || !abstractC0408Hk.f1374h) {
            c1578df.m3057u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return r3;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View m4928c(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4928c(android.view.View):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0419Hv) && this.f9077J.mo1509Q((C0419Hv) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null && abstractC0667Md.mo1507P()) {
            return this.f9077J.mo1494G(this.f9064BX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null && abstractC0667Md.mo1507P()) {
            return this.f9077J.mo1503M(this.f9064BX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null && abstractC0667Md.mo1507P()) {
            return this.f9077J.mo1516V(this.f9064BX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null && abstractC0667Md.mo1504N()) {
            return this.f9077J.mo1511S(this.f9064BX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null && abstractC0667Md.mo1504N()) {
            return this.f9077J.mo1510R(this.f9064BX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null && abstractC0667Md.mo1504N()) {
            return this.f9077J.mo1554w(this.f9064BX);
        }
        return 0;
    }

    /* renamed from: d */
    public final C0926RQ m4929d() {
        if (this.f9127tJ == null) {
            this.f9127tJ = new C0926RQ(this);
        }
        return this.f9127tJ;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return m4929d().m2082z(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return m4929d().m2078h(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m4929d().m2081v(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m4929d().m2075N(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        C1192WI c1192wi;
        float f;
        float f2;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        ArrayList arrayList = this.f9073H;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC1034TO) arrayList.get(i3)).mo1330v(canvas, this);
        }
        EdgeEffect edgeEffect = this.f9112l;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f9130y) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.f9112l;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.f9096b;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f9130y) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f9096b;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f9118nP;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f9130y) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.f9118nP;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f9094Yd;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f9130y) {
                f = getPaddingRight() + (-getWidth());
                f2 = getPaddingBottom() + (-getHeight());
            } else {
                f = -getWidth();
                f2 = -getHeight();
            }
            canvas.translate(f, f2);
            EdgeEffect edgeEffect8 = this.f9094Yd;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || (c1192wi = this.f9123qn) == null || arrayList.size() <= 0 || !c1192wi.m2461M()) {
            z5 = z;
        }
        if (z5) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4115M(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: dx */
    public final void m4930dx() {
        int i = this.f9079L + 1;
        this.f9079L = i;
        if (i != 1 || this.f9098d) {
            return;
        }
        this.f9108i = false;
    }

    /* renamed from: e */
    public final void m4931e(int[] iArr) {
        int m1652N = this.f9111k.m1652N();
        if (m1652N == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < m1652N; i3++) {
            AbstractC0249El m4894j = m4894j(this.f9111k.m1653P(i3));
            if (!m4894j.m532w()) {
                int m531v = m4894j.m531v();
                if (m531v < i) {
                    i = m531v;
                }
                if (m531v > i2) {
                    i2 = m531v;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: f */
    public final void m4932f() {
        int measuredHeight;
        int measuredWidth;
        if (this.f9118nP != null) {
            return;
        }
        EdgeEffect mo3241M = this.f9113m.mo3241M(this, 2);
        this.f9118nP = mo3241M;
        if (this.f9130y) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        mo3241M.setSize(measuredHeight, measuredWidth);
    }

    /* JADX WARN: Code restructure failed: missing block: B:398:0x0160, code lost:
    
        if (r7 > 0) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0180, code lost:
    
        if (r5 > 0) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0183, code lost:
    
        if (r7 < 0) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0186, code lost:
    
        if (r5 < 0) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x018e, code lost:
    
        if ((r5 * r6) <= 0) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0196, code lost:
    
        if ((r5 * r6) >= 0) goto L400;
     */
    /* JADX WARN: Removed duplicated region for block: B:312:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:422:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:407:? A[LOOP:4: B:306:0x0074->B:407:?, LOOP_END, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4933g() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4933g():void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null) {
            return abstractC0667Md.mo1535k();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m4923Y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null) {
            return abstractC0667Md.mo1531g(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m4923Y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md == null) {
            return super.getBaseline();
        }
        abstractC0667Md.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.f9130y;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (m4929d().m2077Q(0) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: he */
    public final void m4934he(int i, int i2, boolean z) {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f9098d) {
            return;
        }
        int i3 = 0;
        if (!abstractC0667Md.mo1507P()) {
            i = 0;
        }
        if (!this.f9077J.mo1504N()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                m4929d().m2080u(i3, 1);
            }
            this.f9084Pm.m1638v(i, i2, Integer.MIN_VALUE, null);
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f9065C;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f9098d;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return m4929d().f3181z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:758:0x03c3, code lost:
    
        if (r23.f9111k.m1650G(getFocusedChild()) == false) goto L821;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x041a, code lost:
    
        if (r6.hasFocusable() != false) goto L786;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x0466  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4935k() {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4935k():void");
    }

    /* renamed from: l */
    public final void m4936l() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (this.f9126t) {
            C1280Xz c1280Xz = this.f9122q;
            c1280Xz.m2614V(c1280Xz.f4110h);
            c1280Xz.m2614V(c1280Xz.f4111v);
            c1280Xz.f4109Q = 0;
            if (this.f9062B) {
                this.f9077J.mo1536l();
            }
        }
        C1192WI c1192wi = this.f9123qn;
        if (c1192wi != null && this.f9077J.mo1552tJ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f9122q.m2608G();
        } else {
            this.f9122q.m2619v();
        }
        if (!this.f9101dG && !this.f9083O4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f9109j && c1192wi != null && (((z5 = this.f9126t) || z2 || this.f9077J.f2164Q) && (!z5 || this.f9124r.f1374h))) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0496JN c0496jn = this.f9064BX;
        c0496jn.f1652G = z3;
        if (z3 && z2 && !this.f9126t) {
            if (c1192wi != null && this.f9077J.mo1552tJ()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                z6 = true;
            }
        }
        c0496jn.f1653M = z6;
    }

    /* renamed from: m */
    public final void m4937m() {
        if (!this.f9116nB && this.f9065C) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4120S(this, this.f9081M6);
            this.f9116nB = true;
        }
    }

    /* renamed from: n */
    public final boolean m4938n() {
        return this.f9078K > 0;
    }

    /* renamed from: n0 */
    public final void m4939n0(AbstractC0408Hk abstractC0408Hk) {
        suppressLayout(false);
        AbstractC0408Hk abstractC0408Hk2 = this.f9124r;
        C0641M3 c0641m3 = this.f9085R;
        if (abstractC0408Hk2 != null) {
            abstractC0408Hk2.f1376z.unregisterObserver(c0641m3);
            this.f9124r.mo916u();
        }
        C1192WI c1192wi = this.f9123qn;
        if (c1192wi != null) {
            c1192wi.m2466o();
        }
        AbstractC0667Md abstractC0667Md = this.f9077J;
        C1578df c1578df = this.f9128w;
        if (abstractC0667Md != null) {
            abstractC0667Md.m1515UZ(c1578df);
            this.f9077J.m1539n0(c1578df);
        }
        ((ArrayList) c1578df.f4857v).clear();
        c1578df.m3057u();
        C1280Xz c1280Xz = this.f9122q;
        c1280Xz.m2614V(c1280Xz.f4110h);
        c1280Xz.m2614V(c1280Xz.f4111v);
        c1280Xz.f4109Q = 0;
        AbstractC0408Hk abstractC0408Hk3 = this.f9124r;
        this.f9124r = abstractC0408Hk;
        abstractC0408Hk.f1376z.registerObserver(c0641m3);
        abstractC0408Hk.mo913P(this);
        AbstractC0667Md abstractC0667Md2 = this.f9077J;
        if (abstractC0667Md2 != null) {
            abstractC0667Md2.mo1538n();
        }
        AbstractC0408Hk abstractC0408Hk4 = this.f9124r;
        ((ArrayList) c1578df.f4857v).clear();
        c1578df.m3057u();
        c1578df.m3050Q(abstractC0408Hk3, true);
        C2382so m3058v = c1578df.m3058v();
        if (abstractC0408Hk3 != null) {
            m3058v.f7316z--;
        }
        if (m3058v.f7316z == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) m3058v.f7314h;
                if (i >= sparseArray.size()) {
                    break;
                }
                C2247qL c2247qL = (C2247qL) sparseArray.valueAt(i);
                Iterator it = c2247qL.f6914z.iterator();
                while (it.hasNext()) {
                    AbstractC0795Op.m1821N(((AbstractC0249El) it.next()).f866z);
                }
                c2247qL.f6914z.clear();
                i++;
            }
        }
        if (abstractC0408Hk4 != null) {
            m3058v.f7316z++;
        }
        c1578df.m3048N();
        this.f9064BX.f1656Q = true;
        m4927b(false);
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0109  */
    /* renamed from: nF */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4940nF(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4940nF(int, int, android.view.MotionEvent, int):boolean");
    }

    /* renamed from: nP */
    public final void m4941nP(AbstractC0249El abstractC0249El, C2402tF c2402tF) {
        boolean z = false;
        int i = (abstractC0249El.f848G & (-8193)) | 0;
        abstractC0249El.f848G = i;
        boolean z2 = this.f9064BX.f1662o;
        C1105Ui c1105Ui = this.f9106g;
        if (z2) {
            if ((i & 2) != 0) {
                z = true;
            }
            if (z && !abstractC0249El.m527W() && !abstractC0249El.m532w()) {
                ((C1276Xv) c1105Ui.f3595v).m2604u(m4902C(abstractC0249El), abstractC0249El);
            }
        }
        c1105Ui.m2286v(abstractC0249El, c2402tF);
    }

    /* renamed from: o */
    public final void m4942o(AbstractC0249El abstractC0249El) {
        boolean z;
        View view = abstractC0249El.f866z;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f9128w.m3052S(m4944p(view));
        if (abstractC0249El.m520M()) {
            this.f9111k.m1656h(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0712NQ c0712nq = this.f9111k;
        if (!z) {
            c0712nq.m1660z(view, -1, true);
            return;
        }
        int indexOfChild = c0712nq.f2394z.f2961z.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0712nq.f2392h.m4060o(indexOfChild);
            c0712nq.m1655W(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: od */
    public final void m4943od() {
        VelocityTracker velocityTracker = this.f9117nF;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        m4929d().m2079o(0);
        EdgeEffect edgeEffect = this.f9112l;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f9112l.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f9096b;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f9096b.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f9118nP;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f9118nP.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f9094Yd;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f9094Yd.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4115M(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0052, code lost:
    
        if (r1 >= 30.0f) goto L74;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f9078K = r0
            r1 = 1
            r5.f9065C = r1
            boolean r2 = r5.f9109j
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f9109j = r2
            a.df r2 = r5.f9128w
            r2.m3048N()
            a.Md r2 = r5.f9077J
            if (r2 == 0) goto L23
            r2.f2171u = r1
        L23:
            r5.f9116nB = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f9055KM
            if (r0 == 0) goto L6d
            java.lang.ThreadLocal r0 = p000a.RunnableC2026m8.f6291q
            java.lang.Object r1 = r0.get()
            a.m8 r1 = (p000a.RunnableC2026m8) r1
            r5.f9119oI = r1
            if (r1 != 0) goto L63
            a.m8 r1 = new a.m8
            r1.<init>()
            r5.f9119oI = r1
            java.util.WeakHashMap r1 = p000a.AbstractC2446u3.f7488z
            android.view.Display r1 = p000a.AbstractC0095Bq.m202h(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            a.m8 r2 = r5.f9119oI
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f6295w = r3
            r0.set(r2)
        L63:
            a.m8 r0 = r5.f9119oI
            r0.getClass()
            java.util.ArrayList r0 = r0.f6294S
            r0.add(r5)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1578df c1578df;
        RunnableC2026m8 runnableC2026m8;
        C2593wr c2593wr;
        super.onDetachedFromWindow();
        C1192WI c1192wi = this.f9123qn;
        if (c1192wi != null) {
            c1192wi.m2466o();
        }
        int i = 0;
        m4920U8(0);
        RunnableC0705NJ runnableC0705NJ = this.f9084Pm;
        runnableC0705NJ.f2369g.removeCallbacks(runnableC0705NJ);
        runnableC0705NJ.f2372w.abortAnimation();
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null && (c2593wr = abstractC0667Md.f2162N) != null) {
            c2593wr.m4467W();
        }
        this.f9065C = false;
        AbstractC0667Md abstractC0667Md2 = this.f9077J;
        if (abstractC0667Md2 != null) {
            abstractC0667Md2.f2171u = false;
            abstractC0667Md2.mo1555x(this);
        }
        this.f9086Rh.clear();
        removeCallbacks(this.f9081M6);
        this.f9106g.getClass();
        do {
        } while (C0380HF.f1297P.mo1757z() != null);
        int i2 = 0;
        while (true) {
            c1578df = this.f9128w;
            if (i2 >= ((ArrayList) c1578df.f4851N).size()) {
                break;
            }
            AbstractC0795Op.m1821N(((AbstractC0249El) ((ArrayList) c1578df.f4851N).get(i2)).f866z);
            i2++;
        }
        c1578df.m3050Q(c1578df.f4855o.f9124r, false);
        Iterator it = new C1228Wy(i, this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            C0787Of c0787Of = (C0787Of) view.getTag(R.id.pooling_container_listener_holder_tag);
            if (c0787Of == null) {
                c0787Of = new C0787Of();
                view.setTag(R.id.pooling_container_listener_holder_tag, c0787Of);
            }
            ArrayList arrayList = c0787Of.f2653z;
            int m2642C = AbstractC1292YB.m2642C(arrayList);
            if (-1 < m2642C) {
                AbstractC2441tz.m4202q(arrayList.get(m2642C));
                throw null;
            }
        }
        if (f9055KM && (runnableC2026m8 = this.f9119oI) != null) {
            runnableC2026m8.f6294S.remove(this);
            this.f9119oI = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f9073H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1034TO) arrayList.get(i)).mo2203h(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0083  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.f9098d) {
            return false;
        }
        this.f9070F = null;
        if (m4908H(motionEvent)) {
            m4943od();
            m4920U8(0);
            return true;
        }
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md == null) {
            return false;
        }
        boolean mo1507P = abstractC0667Md.mo1507P();
        boolean mo1504N = this.f9077J.mo1504N();
        if (this.f9117nF == null) {
            this.f9117nF = VelocityTracker.obtain();
        }
        this.f9117nF.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m4903D(motionEvent);
                            }
                        } else {
                            this.f9120od = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f9115n0 = x;
                            this.f9133zx = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f9068EC = y;
                            this.f9093UZ = y;
                        }
                    } else {
                        m4943od();
                        m4920U8(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f9120od);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f9120od + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f9074HL != 1) {
                        int i = x2 - this.f9133zx;
                        int i2 = y2 - this.f9093UZ;
                        int i3 = this.f9092U8;
                        if (mo1507P && Math.abs(i) > i3) {
                            this.f9115n0 = x2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (mo1504N && Math.abs(i2) > i3) {
                            this.f9068EC = y2;
                            z2 = true;
                        }
                        if (z2) {
                            m4920U8(1);
                        }
                    }
                }
            } else {
                this.f9117nF.clear();
                m4929d().m2079o(0);
            }
        } else {
            if (this.f9082O) {
                this.f9082O = false;
            }
            this.f9120od = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f9115n0 = x3;
            this.f9133zx = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f9068EC = y3;
            this.f9093UZ = y3;
            EdgeEffect edgeEffect = this.f9112l;
            if (edgeEffect != null && AbstractC1843ih.m3441e(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
                AbstractC1843ih.m3449l(this.f9112l, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            } else {
                z = false;
            }
            EdgeEffect edgeEffect2 = this.f9118nP;
            boolean z3 = z;
            if (edgeEffect2 != null) {
                z3 = z;
                if (AbstractC1843ih.m3441e(edgeEffect2) != 0.0f) {
                    z3 = z;
                    if (!canScrollHorizontally(1)) {
                        AbstractC1843ih.m3449l(this.f9118nP, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                }
            }
            EdgeEffect edgeEffect3 = this.f9096b;
            boolean z4 = z3;
            if (edgeEffect3 != null) {
                z4 = z3;
                if (AbstractC1843ih.m3441e(edgeEffect3) != 0.0f) {
                    z4 = z3;
                    if (!canScrollVertically(-1)) {
                        AbstractC1843ih.m3449l(this.f9096b, 0.0f, motionEvent.getX() / getWidth());
                        z4 = true;
                    }
                }
            }
            EdgeEffect edgeEffect4 = this.f9094Yd;
            boolean z5 = z4;
            if (edgeEffect4 != null) {
                z5 = z4;
                if (AbstractC1843ih.m3441e(edgeEffect4) != 0.0f) {
                    z5 = z4;
                    if (!canScrollVertically(1)) {
                        AbstractC1843ih.m3449l(this.f9094Yd, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                }
            }
            if (z5 || this.f9074HL == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                m4920U8(1);
                m4929d().m2079o(1);
            }
            int[] iArr = this.f9087Ry;
            iArr[1] = 0;
            iArr[0] = 0;
            int i4 = mo1507P;
            if (mo1504N) {
                i4 = (mo1507P ? 1 : 0) | 2;
            }
            m4929d().m2080u(i4, 0);
        }
        if (this.f9074HL != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = AbstractC2574wV.f7854z;
        AbstractC1404aL.m2824z("RV OnLayout");
        m4935k();
        AbstractC1404aL.m2823h();
        this.f9109j = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md == null) {
            m4945q(i, i2);
            return;
        }
        boolean mo1534j = abstractC0667Md.mo1534j();
        boolean z = false;
        C0496JN c0496jn = this.f9064BX;
        if (mo1534j) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f9077J.f2169h.m4945q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f9090T0 = z;
            if (!z && this.f9124r != null) {
                if (c0496jn.f1655P == 1) {
                    m4933g();
                }
                this.f9077J.m1544oI(i, i2);
                c0496jn.f1660W = true;
                m4950y();
                this.f9077J.m1490BX(i, i2);
                if (this.f9077J.mo1506O4()) {
                    this.f9077J.m1544oI(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    c0496jn.f1660W = true;
                    m4950y();
                    this.f9077J.m1490BX(i, i2);
                }
                this.f9110j5 = getMeasuredWidth();
                this.f9132zd = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.f9121p) {
            this.f9077J.f2169h.m4945q(i, i2);
            return;
        }
        if (this.f9129x) {
            m4930dx();
            m4900B();
            m4936l();
            m4912K(true);
            if (c0496jn.f1653M) {
                c0496jn.f1663u = true;
            } else {
                this.f9122q.m2619v();
                c0496jn.f1663u = false;
            }
            this.f9129x = false;
            m4926ZH(false);
        } else if (c0496jn.f1653M) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0408Hk abstractC0408Hk = this.f9124r;
        if (abstractC0408Hk != null) {
            c0496jn.f1654N = abstractC0408Hk.mo918z();
        } else {
            c0496jn.f1654N = 0;
        }
        m4930dx();
        this.f9077J.f2169h.m4945q(i, i2);
        m4926ZH(false);
        c0496jn.f1663u = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m4938n()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2700yz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2700yz c2700yz = (C2700yz) parcelable;
        this.f9076I = c2700yz;
        super.onRestoreInstanceState(c2700yz.f8021S);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        C2700yz c2700yz = new C2700yz(super.onSaveInstanceState());
        C2700yz c2700yz2 = this.f9076I;
        if (c2700yz2 != null) {
            c2700yz.f8518w = c2700yz2.f8518w;
        } else {
            AbstractC0667Md abstractC0667Md = this.f9077J;
            if (abstractC0667Md != null) {
                parcelable = abstractC0667Md.mo1541nF();
            } else {
                parcelable = null;
            }
            c2700yz.f8518w = parcelable;
        }
        return c2700yz;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.f9094Yd = null;
            this.f9096b = null;
            this.f9118nP = null;
            this.f9112l = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:585:0x00e1, code lost:
    
        if (r14 >= 0) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0138, code lost:
    
        if (r12 >= 0) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x03ca, code lost:
    
        if (r2 == 0) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x0421, code lost:
    
        if (r1 == false) goto L792;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x0449, code lost:
    
        if (r4 != false) goto L800;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:649:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x03ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:760:0x03d6  */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final AbstractC0249El m4944p(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4894j(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: q */
    public final void m4945q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        setMeasuredDimension(AbstractC0667Md.m1487u(i, paddingRight, AbstractC2397t8.m4116N(this)), AbstractC0667Md.m1487u(i2, getPaddingBottom() + getPaddingTop(), AbstractC2397t8.m4117P(this)));
    }

    /* renamed from: r */
    public final void m4946r() {
        int measuredWidth;
        int measuredHeight;
        if (this.f9096b != null) {
            return;
        }
        EdgeEffect mo3241M = this.f9113m.mo3241M(this, 1);
        this.f9096b = mo3241M;
        if (this.f9130y) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        mo3241M.setSize(measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        AbstractC0249El m4894j = m4894j(view);
        if (m4894j != null) {
            if (m4894j.m520M()) {
                m4894j.f848G &= -257;
            } else if (!m4894j.m532w()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m4894j + m4923Y());
            }
        }
        view.clearAnimation();
        m4894j(view);
        AbstractC0408Hk abstractC0408Hk = this.f9124r;
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        boolean z;
        C2593wr c2593wr = this.f9077J.f2162N;
        boolean z2 = true;
        if (c2593wr != null && c2593wr.f7955N) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !m4938n()) {
            z2 = false;
        }
        if (!z2 && view2 != null) {
            m4909HL(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f9077J.mo1533he(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.f9103e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC2383sq) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f9079L != 0 || this.f9098d) {
            this.f9108i = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m4947s(int i, int i2) {
        this.f9066D++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        ArrayList arrayList = this.f9099d2;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((AbstractC1467ba) this.f9099d2.get(size)).mo102h(this, i, i2);
                }
            }
        }
        this.f9066D--;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f9098d) {
            return;
        }
        boolean mo1507P = abstractC0667Md.mo1507P();
        boolean mo1504N = this.f9077J.mo1504N();
        if (mo1507P || mo1504N) {
            if (!mo1507P) {
                i = 0;
            }
            if (!mo1504N) {
                i2 = 0;
            }
            m4940nF(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (m4938n()) {
            if (accessibilityEvent != null) {
                i = AbstractC0752O4.m1726z(accessibilityEvent);
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.f9114n |= i2;
            i2 = 1;
        }
        if (i2 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.f9130y) {
            this.f9094Yd = null;
            this.f9096b = null;
            this.f9118nP = null;
            this.f9112l = null;
        }
        this.f9130y = z;
        super.setClipToPadding(z);
        if (this.f9109j) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        C0926RQ m4929d = m4929d();
        if (m4929d.f3181z) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC1548d9.m3006Y(m4929d.f3178P);
        }
        m4929d.f3181z = z;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return m4929d().m2080u(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m4929d().m2079o(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        C2593wr c2593wr;
        if (z != this.f9098d) {
            m4914M("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f9098d = false;
                if (this.f9108i && this.f9077J != null && this.f9124r != null) {
                    requestLayout();
                }
                this.f9108i = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f9098d = true;
            this.f9082O = true;
            m4920U8(0);
            RunnableC0705NJ runnableC0705NJ = this.f9084Pm;
            runnableC0705NJ.f2369g.removeCallbacks(runnableC0705NJ);
            runnableC0705NJ.f2372w.abortAnimation();
            AbstractC0667Md abstractC0667Md = this.f9077J;
            if (abstractC0667Md != null && (c2593wr = abstractC0667Md.f2162N) != null) {
                c2593wr.m4467W();
            }
        }
    }

    /* renamed from: t */
    public final void m4948t(int i, int i2, boolean z) {
        int i3 = i + i2;
        int m1657o = this.f9111k.m1657o();
        for (int i4 = 0; i4 < m1657o; i4++) {
            AbstractC0249El m4894j = m4894j(this.f9111k.m1658u(i4));
            if (m4894j != null && !m4894j.m532w()) {
                int i5 = m4894j.f864v;
                if (i5 >= i3) {
                    m4894j.m526V(-i2, z);
                } else if (i5 >= i) {
                    m4894j.m528h(8);
                    m4894j.m526V(-i2, z);
                    m4894j.f864v = i - 1;
                }
                this.f9064BX.f1656Q = true;
            }
        }
        C1578df c1578df = this.f9128w;
        int size = ((ArrayList) c1578df.f4851N).size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC0249El abstractC0249El = (AbstractC0249El) ((ArrayList) c1578df.f4851N).get(size);
                if (abstractC0249El != null) {
                    int i6 = abstractC0249El.f864v;
                    if (i6 >= i3) {
                        abstractC0249El.m526V(-i2, z);
                    } else if (i6 >= i) {
                        abstractC0249El.m528h(8);
                        c1578df.m3056o(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* renamed from: x */
    public final void m4949x(int i) {
        if (this.f9077J == null) {
            return;
        }
        m4920U8(2);
        this.f9077J.mo1502Lq(i);
        awakenScrollBars();
    }

    /* renamed from: y */
    public final void m4950y() {
        boolean z;
        boolean z2;
        m4930dx();
        m4900B();
        C0496JN c0496jn = this.f9064BX;
        c0496jn.m1191z(6);
        this.f9122q.m2619v();
        c0496jn.f1654N = this.f9124r.mo918z();
        c0496jn.f1664v = 0;
        if (this.f9076I != null) {
            AbstractC0408Hk abstractC0408Hk = this.f9124r;
            int m4204s = AbstractC2441tz.m4204s(abstractC0408Hk.f1375v);
            if (m4204s == 1 ? abstractC0408Hk.mo918z() > 0 : m4204s != 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Parcelable parcelable = this.f9076I.f8518w;
                if (parcelable != null) {
                    this.f9077J.mo1545od(parcelable);
                }
                this.f9076I = null;
            }
        }
        c0496jn.f1663u = false;
        this.f9077J.mo1548qn(this.f9128w, c0496jn);
        c0496jn.f1656Q = false;
        if (c0496jn.f1652G && this.f9123qn != null) {
            z = true;
        } else {
            z = false;
        }
        c0496jn.f1652G = z;
        c0496jn.f1655P = 4;
        m4912K(true);
        m4926ZH(false);
    }

    /* renamed from: zx */
    public final void m4951zx(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        AbstractC0249El abstractC0249El;
        m4930dx();
        m4900B();
        int i5 = AbstractC2574wV.f7854z;
        AbstractC1404aL.m2824z("RV Scroll");
        C0496JN c0496jn = this.f9064BX;
        m4911J(c0496jn);
        C1578df c1578df = this.f9128w;
        if (i != 0) {
            i3 = this.f9077J.mo1521ZH(i, c1578df, c0496jn);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.f9077J.mo1498Ha(i2, c1578df, c0496jn);
        } else {
            i4 = 0;
        }
        AbstractC1404aL.m2823h();
        int m1652N = this.f9111k.m1652N();
        for (int i6 = 0; i6 < m1652N; i6++) {
            View m1653P = this.f9111k.m1653P(i6);
            AbstractC0249El m4944p = m4944p(m1653P);
            if (m4944p != null && (abstractC0249El = m4944p.f857W) != null) {
                int left = m1653P.getLeft();
                int top = m1653P.getTop();
                View view = abstractC0249El.f866z;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m4912K(true);
        m4926ZH(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:38|(1:40)(11:79|(1:81)|42|43|44|(1:46)(1:63)|47|48|49|50|51)|41|42|43|44|(0)(0)|47|48|49|50|51) */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0290, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0292, code lost:
    
        r0 = r3.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0298, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x02aa, code lost:
    
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02ca, code lost:
    
        throw new java.lang.IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x025f A[Catch: ClassCastException -> 0x02cb, IllegalAccessException -> 0x02ea, InstantiationException -> 0x0309, InvocationTargetException -> 0x0326, ClassNotFoundException -> 0x0343, TryCatch #4 {ClassCastException -> 0x02cb, ClassNotFoundException -> 0x0343, IllegalAccessException -> 0x02ea, InstantiationException -> 0x0309, InvocationTargetException -> 0x0326, blocks: (B:241:0x0259, B:243:0x025f, B:245:0x026c, B:246:0x0276, B:253:0x029b, B:250:0x0292, B:255:0x02aa, B:256:0x02ca, B:244:0x0268), top: B:278:0x0259 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0268 A[Catch: ClassCastException -> 0x02cb, IllegalAccessException -> 0x02ea, InstantiationException -> 0x0309, InvocationTargetException -> 0x0326, ClassNotFoundException -> 0x0343, TryCatch #4 {ClassCastException -> 0x02cb, ClassNotFoundException -> 0x0343, IllegalAccessException -> 0x02ea, InstantiationException -> 0x0309, InvocationTargetException -> 0x0326, blocks: (B:241:0x0259, B:243:0x025f, B:245:0x026c, B:246:0x0276, B:253:0x029b, B:250:0x0292, B:255:0x02aa, B:256:0x02ca, B:244:0x0268), top: B:278:0x0259 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0667Md abstractC0667Md = this.f9077J;
        if (abstractC0667Md != null) {
            return abstractC0667Md.mo1556y(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m4923Y());
    }
}
