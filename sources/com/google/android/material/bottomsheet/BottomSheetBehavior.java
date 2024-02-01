package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC1131VA;
import p000a.AbstractC1548d9;
import p000a.AbstractC2441tz;
import p000a.AbstractC2446u3;
import p000a.C0073BQ;
import p000a.C0080BX;
import p000a.C0099Bw;
import p000a.C0717NV;
import p000a.C0737Nq;
import p000a.C1168Vr;
import p000a.C1480br;
import p000a.C1555dG;
import p000a.C1862j5;
import p000a.C1893je;
import p000a.C2243qH;
import p000a.C2271qk;
import p000a.C2281qz;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC1131VA {

    /* renamed from: B */
    public int f9226B;

    /* renamed from: C */
    public final float f9227C;

    /* renamed from: D */
    public WeakReference f9228D;

    /* renamed from: E */
    public int f9229E;

    /* renamed from: F */
    public float f9230F;

    /* renamed from: G */
    public final ColorStateList f9231G;

    /* renamed from: H */
    public int f9232H;

    /* renamed from: HL */
    public HashMap f9233HL;

    /* renamed from: I */
    public final boolean f9234I;

    /* renamed from: J */
    public final C2271qk f9235J;

    /* renamed from: K */
    public int f9236K;

    /* renamed from: L */
    public boolean f9237L;

    /* renamed from: M */
    public int f9238M;

    /* renamed from: N */
    public int f9239N;

    /* renamed from: O */
    public boolean f9240O;

    /* renamed from: P */
    public int f9241P;

    /* renamed from: Q */
    public boolean f9242Q;

    /* renamed from: R */
    public boolean f9243R;

    /* renamed from: S */
    public int f9244S;

    /* renamed from: T */
    public final float f9245T;

    /* renamed from: U */
    public int f9246U;

    /* renamed from: V */
    public int f9247V;

    /* renamed from: W */
    public C2281qz f9248W;

    /* renamed from: X */
    public int f9249X;

    /* renamed from: Y */
    public boolean f9250Y;

    /* renamed from: Yd */
    public int f9251Yd;

    /* renamed from: Z */
    public int f9252Z;

    /* renamed from: b */
    public VelocityTracker f9253b;

    /* renamed from: c */
    public ValueAnimator f9254c;

    /* renamed from: d */
    public C0737Nq f9255d;

    /* renamed from: e */
    public int f9256e;

    /* renamed from: f */
    public final boolean f9257f;

    /* renamed from: g */
    public final boolean f9258g;

    /* renamed from: h */
    public boolean f9259h;

    /* renamed from: i */
    public int f9260i;

    /* renamed from: j */
    public boolean f9261j;

    /* renamed from: k */
    public final boolean f9262k;

    /* renamed from: l */
    public final ArrayList f9263l;

    /* renamed from: m */
    public WeakReference f9264m;

    /* renamed from: n */
    public int f9265n;

    /* renamed from: nF */
    public final C0717NV f9266nF;

    /* renamed from: nP */
    public int f9267nP;

    /* renamed from: o */
    public final int f9268o;

    /* renamed from: od */
    public final SparseIntArray f9269od;

    /* renamed from: p */
    public boolean f9270p;

    /* renamed from: q */
    public final boolean f9271q;

    /* renamed from: qn */
    public boolean f9272qn;

    /* renamed from: r */
    public final C0099Bw f9273r;

    /* renamed from: s */
    public final boolean f9274s;

    /* renamed from: t */
    public int f9275t;

    /* renamed from: u */
    public int f9276u;

    /* renamed from: v */
    public final float f9277v;

    /* renamed from: w */
    public final boolean f9278w;

    /* renamed from: x */
    public boolean f9279x;

    /* renamed from: y */
    public final boolean f9280y;

    /* renamed from: z */
    public int f9281z;

    public BottomSheetBehavior() {
        this.f9281z = 0;
        this.f9259h = true;
        this.f9238M = -1;
        this.f9247V = -1;
        this.f9235J = new C2271qk(this, 0);
        this.f9230F = 0.5f;
        this.f9227C = -1.0f;
        this.f9237L = true;
        this.f9260i = 4;
        this.f9245T = 0.1f;
        this.f9263l = new ArrayList();
        this.f9251Yd = -1;
        this.f9269od = new SparseIntArray();
        this.f9266nF = new C0717NV(this);
    }

    /* renamed from: E */
    public static View m5003E(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC1548d9.m2996I(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m5003E = m5003E(viewGroup.getChildAt(i));
                if (m5003E != null) {
                    return m5003E;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0014, code lost:
    
        if (r1.m1703q(r5.getLeft(), r0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0031, code lost:
    
        if (r5 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0033, code lost:
    
        r2 = true;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5004C(android.view.View r5, int r6, boolean r7) {
        /*
            r4 = this;
            int r0 = r4.m5011Y(r6)
            a.Nq r1 = r4.f9255d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r7 == 0) goto L17
            int r5 = r5.getLeft()
            boolean r5 = r1.m1703q(r5, r0)
            if (r5 == 0) goto L34
            goto L33
        L17:
            int r7 = r5.getLeft()
            r1.f2502k = r5
            r5 = -1
            r1.f2507v = r5
            boolean r5 = r1.m1698W(r7, r0, r2, r2)
            if (r5 != 0) goto L31
            int r7 = r1.f2510z
            if (r7 != 0) goto L31
            android.view.View r7 = r1.f2502k
            if (r7 == 0) goto L31
            r7 = 0
            r1.f2502k = r7
        L31:
            if (r5 == 0) goto L34
        L33:
            r2 = r3
        L34:
            if (r2 == 0) goto L43
            r5 = 2
            r4.m5005F(r5)
            r4.m5018j(r6, r3)
            a.qk r5 = r4.f9235J
            r5.m3909z(r6)
            goto L46
        L43:
            r4.m5005F(r6)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m5004C(android.view.View, int, boolean):void");
    }

    /* renamed from: F */
    public final void m5005F(int i) {
        if (this.f9260i == i) {
            return;
        }
        this.f9260i = i;
        WeakReference weakReference = this.f9228D;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m5008L(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m5008L(false);
        }
        m5018j(i, true);
        ArrayList arrayList = this.f9263l;
        if (arrayList.size() <= 0) {
            m5019p();
        } else {
            AbstractC2441tz.m4202q(arrayList.get(0));
            throw null;
        }
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: G */
    public final boolean mo2312G(View view) {
        WeakReference weakReference = this.f9264m;
        return (weakReference == null || view != weakReference.get() || this.f9260i == 3) ? false : true;
    }

    /* renamed from: H */
    public final void m5006H(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f9232H = i;
        m5018j(this.f9260i, true);
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: I */
    public final boolean mo2313I(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.f9265n = 0;
        this.f9279x = false;
        return (i & 2) != 0;
    }

    /* renamed from: J */
    public final boolean m5007J() {
        WeakReference weakReference = this.f9228D;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f9228D.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    /* renamed from: L */
    public final void m5008L(boolean z) {
        WeakReference weakReference = this.f9228D;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f9233HL != null) {
                    return;
                } else {
                    this.f9233HL = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f9228D.get() && z) {
                    this.f9233HL.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.f9233HL = null;
        }
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: M */
    public final void mo2314M(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        View view3;
        int i4;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f9264m;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i5 = top - i2;
        if (i2 > 0) {
            if (i5 < m5020r()) {
                int m5020r = top - m5020r();
                iArr[1] = m5020r;
                int i6 = -m5020r;
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                view.offsetTopAndBottom(i6);
                i4 = 3;
                m5005F(i4);
            } else {
                if (!this.f9237L) {
                    return;
                }
                iArr[1] = i2;
                int i7 = -i2;
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                view.offsetTopAndBottom(i7);
                m5005F(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i8 = this.f9252Z;
            if (i5 > i8 && !this.f9270p) {
                int i9 = top - i8;
                iArr[1] = i9;
                int i10 = -i9;
                WeakHashMap weakHashMap3 = AbstractC2446u3.f7488z;
                view.offsetTopAndBottom(i10);
                i4 = 4;
                m5005F(i4);
            } else {
                if (!this.f9237L) {
                    return;
                }
                iArr[1] = i2;
                int i72 = -i2;
                WeakHashMap weakHashMap22 = AbstractC2446u3.f7488z;
                view.offsetTopAndBottom(i72);
                m5005F(1);
            }
        }
        m5009U(view.getTop());
        this.f9265n = i2;
        this.f9279x = true;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: Q */
    public final void mo2317Q() {
        this.f9228D = null;
        this.f9255d = null;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: R */
    public final void mo2318R(View view, Parcelable parcelable) {
        C2243qH c2243qH = (C2243qH) parcelable;
        int i = this.f9281z;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f9239N = c2243qH.f6898I;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f9259h = c2243qH.f6901q;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f9270p = c2243qH.f6900k;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f9261j = c2243qH.f6899g;
            }
        }
        int i2 = c2243qH.f6902w;
        if (i2 != 1 && i2 != 2) {
            this.f9260i = i2;
        } else {
            this.f9260i = 4;
        }
    }

    /* renamed from: U */
    public final void m5009U(int i) {
        if (((View) this.f9228D.get()) != null) {
            ArrayList arrayList = this.f9263l;
            if (!arrayList.isEmpty()) {
                int i2 = this.f9252Z;
                if (i <= i2 && i2 != m5020r()) {
                    m5020r();
                }
                if (arrayList.size() > 0) {
                    AbstractC2441tz.m4202q(arrayList.get(0));
                    throw null;
                }
            }
        }
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: V */
    public final void mo2320V(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: W */
    public final boolean mo248W(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m5015f(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f9238M, marginLayoutParams.width), m5015f(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f9247V, marginLayoutParams.height));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0060, code lost:
    
        if (p000a.AbstractC1285Y3.m2633h(r5) != false) goto L81;
     */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5010X(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L72
            r1 = 2
            if (r5 != r1) goto L8
            goto L72
        L8:
            boolean r1 = r4.f9270p
            if (r1 != 0) goto L23
            r1 = 5
            if (r5 != r1) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L23:
            r1 = 6
            if (r5 != r1) goto L34
            boolean r1 = r4.f9259h
            if (r1 == 0) goto L34
            int r1 = r4.m5011Y(r5)
            int r2 = r4.f9256e
            if (r1 > r2) goto L34
            r1 = 3
            goto L35
        L34:
            r1 = r5
        L35:
            java.lang.ref.WeakReference r2 = r4.f9228D
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L40
            goto L6e
        L40:
            java.lang.ref.WeakReference r5 = r4.f9228D
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            a.lv r2 = new a.lv
            r3 = 4
            r2.<init>(r1, r3, r4, r5)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L63
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L63
            java.util.WeakHashMap r1 = p000a.AbstractC2446u3.f7488z
            boolean r1 = p000a.AbstractC1285Y3.m2633h(r5)
            if (r1 == 0) goto L63
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 == 0) goto L6a
            r5.post(r2)
            goto L71
        L6a:
            r2.run()
            goto L71
        L6e:
            r4.m5005F(r5)
        L71:
            return
        L72:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L80
            java.lang.String r5 = "DRAGGING"
            goto L82
        L80:
            java.lang.String r5 = "SETTLING"
        L82:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = p000a.AbstractC2441tz.m4187M(r2, r5, r0)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m5010X(int):void");
    }

    /* renamed from: Y */
    public final int m5011Y(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.f9249X;
                    }
                    throw new IllegalArgumentException(AbstractC2441tz.m4188N("Invalid state to get top offset: ", i));
                }
                return this.f9236K;
            }
            return this.f9252Z;
        }
        return m5020r();
    }

    /* renamed from: Z */
    public final boolean m5012Z(View view, float f) {
        if (this.f9261j) {
            return true;
        }
        if (view.getTop() < this.f9252Z) {
            return false;
        }
        return Math.abs(((f * this.f9245T) + ((float) view.getTop())) - ((float) this.f9252Z)) / ((float) m5021s()) > 0.5f;
    }

    /* renamed from: c */
    public final void m5013c(View view, C1862j5 c1862j5, int i) {
        AbstractC2446u3.m4214G(view, c1862j5, new C0073BQ(this, i));
    }

    /* renamed from: e */
    public final void m5014e(int i) {
        boolean z = false;
        if (i == -1) {
            if (!this.f9242Q) {
                this.f9242Q = true;
                z = true;
            }
        } else if (this.f9242Q || this.f9239N != i) {
            this.f9242Q = false;
            this.f9239N = Math.max(0, i);
            z = true;
        }
        if (z) {
            m5017i();
        }
    }

    /* renamed from: f */
    public final int m5015f(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* renamed from: g */
    public final void m5016g() {
        int m5021s = m5021s();
        if (this.f9259h) {
            this.f9252Z = Math.max(this.f9236K - m5021s, this.f9256e);
        } else {
            this.f9252Z = this.f9236K - m5021s;
        }
    }

    /* renamed from: i */
    public final void m5017i() {
        View view;
        if (this.f9228D != null) {
            m5016g();
            if (this.f9260i != 4 || (view = (View) this.f9228D.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    /* renamed from: j */
    public final void m5018j(int i, boolean z) {
        boolean z2;
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        if (this.f9260i == 3 && (this.f9257f || m5007J())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f9250Y != z2 && this.f9248W != null) {
            this.f9250Y = z2;
            float f = 1.0f;
            if (z && (valueAnimator = this.f9254c) != null) {
                if (valueAnimator.isRunning()) {
                    this.f9254c.reverse();
                    return;
                }
                float f2 = this.f9248W.f7021S.f4596G;
                if (z2) {
                    f = m5022y();
                }
                this.f9254c.setFloatValues(f2, f);
                this.f9254c.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.f9254c;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f9254c.cancel();
            }
            C2281qz c2281qz = this.f9248W;
            if (this.f9250Y) {
                f = m5022y();
            }
            C1480br c1480br = c2281qz.f7021S;
            if (c1480br.f4596G != f) {
                c1480br.f4596G = f;
                c2281qz.f7031q = true;
                c2281qz.invalidateSelf();
            }
        }
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: k */
    public final boolean mo2322k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f9260i;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C0737Nq c0737Nq = this.f9255d;
        if (c0737Nq != null && (this.f9237L || i == 1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c0737Nq.m1691M(motionEvent);
        }
        if (actionMasked == 0) {
            this.f9267nP = -1;
            this.f9251Yd = -1;
            VelocityTracker velocityTracker = this.f9253b;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9253b = null;
            }
        }
        if (this.f9253b == null) {
            this.f9253b = VelocityTracker.obtain();
        }
        this.f9253b.addMovement(motionEvent);
        if (this.f9255d != null && (this.f9237L || this.f9260i == 1)) {
            z2 = true;
        }
        if (z2 && actionMasked == 2 && !this.f9240O) {
            float abs = Math.abs(this.f9251Yd - motionEvent.getY());
            C0737Nq c0737Nq2 = this.f9255d;
            if (abs > c0737Nq2.f2501h) {
                c0737Nq2.m1700h(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f9240O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0128, code lost:
    
        if (r7 == (-1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x012e, code lost:
    
        if (r7 == (-1)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0131, code lost:
    
        r9 = java.lang.Math.min(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0135, code lost:
    
        r6.f9275t = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0198  */
    @Override // p000a.AbstractC1131VA
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2323o(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2323o(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* renamed from: p */
    public final void m5019p() {
        View view;
        C1862j5 c1862j5;
        int i;
        boolean z;
        C1555dG c1555dG;
        WeakReference weakReference = this.f9228D;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            AbstractC2446u3.m4222W(view, 524288);
            AbstractC2446u3.m4225u(view, 0);
            AbstractC2446u3.m4222W(view, 262144);
            AbstractC2446u3.m4225u(view, 0);
            AbstractC2446u3.m4222W(view, 1048576);
            AbstractC2446u3.m4225u(view, 0);
            SparseIntArray sparseIntArray = this.f9269od;
            int i2 = sparseIntArray.get(0, -1);
            if (i2 != -1) {
                AbstractC2446u3.m4222W(view, i2);
                AbstractC2446u3.m4225u(view, 0);
                sparseIntArray.delete(0);
            }
            int i3 = 6;
            if (!this.f9259h && this.f9260i != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                C0073BQ c0073bq = new C0073BQ(this, 6);
                ArrayList m4216N = AbstractC2446u3.m4216N(view);
                int i4 = 0;
                while (true) {
                    if (i4 < m4216N.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C1862j5) m4216N.get(i4)).f5831z).getLabel())) {
                            i = ((C1862j5) m4216N.get(i4)).m3486z();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 0;
                        int i6 = -1;
                        while (true) {
                            int[] iArr = AbstractC2446u3.f7484P;
                            if (i5 >= iArr.length || i6 != -1) {
                                break;
                            }
                            int i7 = iArr[i5];
                            boolean z2 = true;
                            for (int i8 = 0; i8 < m4216N.size(); i8++) {
                                if (((C1862j5) m4216N.get(i8)).m3486z() != i7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 &= z;
                            }
                            if (z2) {
                                i6 = i7;
                            }
                            i5++;
                        }
                        i = i6;
                    }
                }
                if (i != -1) {
                    C1862j5 c1862j52 = new C1862j5(null, i, string, c0073bq, null);
                    View.AccessibilityDelegate m4226v = AbstractC2446u3.m4226v(view);
                    if (m4226v == null) {
                        c1555dG = null;
                    } else if (m4226v instanceof C0080BX) {
                        c1555dG = ((C0080BX) m4226v).f313z;
                    } else {
                        c1555dG = new C1555dG(m4226v);
                    }
                    if (c1555dG == null) {
                        c1555dG = new C1555dG();
                    }
                    AbstractC2446u3.m4221V(view, c1555dG);
                    AbstractC2446u3.m4222W(view, c1862j52.m3486z());
                    AbstractC2446u3.m4216N(view).add(c1862j52);
                    AbstractC2446u3.m4225u(view, 0);
                }
                sparseIntArray.put(0, i);
            }
            if (this.f9270p && this.f9260i != 5) {
                m5013c(view, C1862j5.f5820G, 5);
            }
            int i9 = this.f9260i;
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 == 6) {
                        m5013c(view, C1862j5.f5825W, 4);
                        m5013c(view, C1862j5.f5826o, 3);
                        return;
                    }
                    return;
                }
                if (this.f9259h) {
                    i3 = 3;
                }
                c1862j5 = C1862j5.f5826o;
            } else {
                if (this.f9259h) {
                    i3 = 4;
                }
                c1862j5 = C1862j5.f5825W;
            }
            m5013c(view, c1862j5, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x008e, code lost:
    
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.f9252Z)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00a9, code lost:
    
        if (java.lang.Math.abs(r2 - r1.f9249X) < java.lang.Math.abs(r2 - r1.f9252Z)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x002f, code lost:
    
        if (r3.getTop() <= r1.f9249X) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x006f, code lost:
    
        if (java.lang.Math.abs(r2 - r1.f9256e) < java.lang.Math.abs(r2 - r1.f9252Z)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x007e, code lost:
    
        if (r2 < java.lang.Math.abs(r2 - r1.f9252Z)) goto L109;
     */
    @Override // p000a.AbstractC1131VA
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo2324q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.m5020r()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.m5005F(r0)
            return
        Lf:
            java.lang.ref.WeakReference r2 = r1.f9264m
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.f9279x
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.f9265n
            if (r2 <= 0) goto L33
            boolean r2 = r1.f9259h
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.f9249X
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.f9270p
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.f9253b
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f9277v
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.f9253b
            int r4 = r1.f9267nP
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.m5012Z(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.f9265n
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f9259h
            if (r4 == 0) goto L72
            int r4 = r1.f9256e
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f9252Z
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.f9249X
            if (r2 >= r4) goto L81
            int r4 = r1.f9252Z
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f9252Z
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f9259h
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.f9249X
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.f9252Z
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.m5004C(r3, r0, r2)
            r1.f9279x = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2324q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: r */
    public final int m5020r() {
        if (this.f9259h) {
            return this.f9256e;
        }
        return Math.max(this.f9232H, this.f9262k ? 0 : this.f9229E);
    }

    /* renamed from: s */
    public final int m5021s() {
        int i;
        return this.f9242Q ? Math.min(Math.max(this.f9276u, this.f9236K - ((this.f9226B * 9) / 16)), this.f9275t) + this.f9246U : (this.f9243R || this.f9278w || (i = this.f9244S) <= 0) ? this.f9239N + this.f9246U : Math.max(this.f9239N, i + this.f9268o);
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: u */
    public final boolean mo2325u(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        C0737Nq c0737Nq;
        if (view.isShown() && this.f9237L) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f9267nP = -1;
                this.f9251Yd = -1;
                VelocityTracker velocityTracker = this.f9253b;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f9253b = null;
                }
            }
            if (this.f9253b == null) {
                this.f9253b = VelocityTracker.obtain();
            }
            this.f9253b.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f9272qn = false;
                    this.f9267nP = -1;
                    if (this.f9240O) {
                        this.f9240O = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.f9251Yd = (int) motionEvent.getY();
                if (this.f9260i != 2) {
                    WeakReference weakReference = this.f9264m;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.m4777I(view2, x, this.f9251Yd)) {
                        this.f9267nP = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f9272qn = true;
                    }
                }
                if (this.f9267nP == -1 && !coordinatorLayout.m4777I(view, x, this.f9251Yd)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f9240O = z;
            }
            if (!this.f9240O && (c0737Nq = this.f9255d) != null && c0737Nq.m1701k(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.f9264m;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.f9240O || this.f9260i == 1 || coordinatorLayout.m4777I(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f9255d == null || (i = this.f9251Yd) == -1 || Math.abs(i - motionEvent.getY()) <= this.f9255d.f2501h) {
                return false;
            }
            return true;
        }
        this.f9240O = true;
        return false;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: v */
    public final void mo2326v(C1168Vr c1168Vr) {
        this.f9228D = null;
        this.f9255d = null;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: w */
    public final Parcelable mo2327w(View view) {
        return new C2243qH(View.BaseSavedState.EMPTY_STATE, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x005b  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m5022y() {
        /*
            r5 = this;
            a.qz r0 = r5.f9248W
            r1 = 0
            if (r0 == 0) goto L6f
            java.lang.ref.WeakReference r0 = r5.f9228D
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L6f
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L6f
            java.lang.ref.WeakReference r0 = r5.f9228D
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.m5007J()
            if (r2 == 0) goto L6f
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L6f
            a.qz r2 = r5.f9248W
            float r2 = r2.m3928G()
            android.view.RoundedCorner r3 = p000a.AbstractC0804P.m1903o(r0)
            if (r3 == 0) goto L44
            int r3 = p000a.AbstractC0804P.m1906v(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L44
            float r3 = r3 / r2
            goto L45
        L44:
            r3 = r1
        L45:
            a.qz r2 = r5.f9248W
            a.br r4 = r2.f7021S
            a.Bw r4 = r4.f4616z
            a.gQ r4 = r4.f374Q
            android.graphics.RectF r2 = r2.m3937W()
            float r2 = r4.mo2191z(r2)
            android.view.RoundedCorner r0 = p000a.AbstractC0804P.m1900g(r0)
            if (r0 == 0) goto L6a
            int r0 = p000a.AbstractC0804P.m1906v(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L6a
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L6a
            float r1 = r0 / r2
        L6a:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m5022y():float");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        int i;
        int i2 = 0;
        this.f9281z = 0;
        this.f9259h = true;
        this.f9238M = -1;
        this.f9247V = -1;
        this.f9235J = new C2271qk(this, i2);
        this.f9230F = 0.5f;
        this.f9227C = -1.0f;
        this.f9237L = true;
        this.f9260i = 4;
        this.f9245T = 0.1f;
        this.f9263l = new ArrayList();
        this.f9251Yd = -1;
        this.f9269od = new SparseIntArray();
        this.f9266nF = new C0717NV(this);
        this.f9268o = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2921N);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f9231G = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f9273r = new C0099Bw(C0099Bw.m208h(context, attributeSet, R.attr.bottomSheetStyle, 2131952493));
        }
        C0099Bw c0099Bw = this.f9273r;
        if (c0099Bw != null) {
            C2281qz c2281qz = new C2281qz(c0099Bw);
            this.f9248W = c2281qz;
            c2281qz.m3930M(context);
            ColorStateList colorStateList = this.f9231G;
            if (colorStateList != null) {
                this.f9248W.m3934R(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f9248W.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(m5022y(), 1.0f);
        this.f9254c = ofFloat;
        ofFloat.setDuration(500L);
        this.f9254c.addUpdateListener(new C1893je(i2, this));
        this.f9227C = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f9238M = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f9247V = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i = peekValue.data) != -1) {
            m5014e(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            m5014e(i);
        }
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        if (this.f9270p != z) {
            this.f9270p = z;
            if (!z && this.f9260i == 5) {
                m5010X(4);
            }
            m5019p();
        }
        this.f9243R = obtainStyledAttributes.getBoolean(13, false);
        boolean z2 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f9259h != z2) {
            this.f9259h = z2;
            if (this.f9228D != null) {
                m5016g();
            }
            m5005F((this.f9259h && this.f9260i == 6) ? 3 : this.f9260i);
            m5018j(this.f9260i, true);
            m5019p();
        }
        this.f9261j = obtainStyledAttributes.getBoolean(12, false);
        this.f9237L = obtainStyledAttributes.getBoolean(4, true);
        this.f9281z = obtainStyledAttributes.getInt(10, 0);
        float f = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f9230F = f;
            if (this.f9228D != null) {
                this.f9249X = (int) ((1.0f - f) * this.f9236K);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            m5006H((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(5, 0) : peekValue2.data);
            this.f9241P = obtainStyledAttributes.getInt(11, 500);
            this.f9278w = obtainStyledAttributes.getBoolean(17, false);
            this.f9234I = obtainStyledAttributes.getBoolean(18, false);
            this.f9271q = obtainStyledAttributes.getBoolean(19, false);
            this.f9262k = obtainStyledAttributes.getBoolean(20, true);
            this.f9258g = obtainStyledAttributes.getBoolean(14, false);
            this.f9280y = obtainStyledAttributes.getBoolean(15, false);
            this.f9274s = obtainStyledAttributes.getBoolean(16, false);
            this.f9257f = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.f9277v = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
