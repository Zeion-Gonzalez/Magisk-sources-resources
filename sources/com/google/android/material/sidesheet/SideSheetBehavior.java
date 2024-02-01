package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC1131VA;
import p000a.AbstractC1285Y3;
import p000a.AbstractC2441tz;
import p000a.AbstractC2446u3;
import p000a.C0099Bw;
import p000a.C0737Nq;
import p000a.C1168Vr;
import p000a.C1433at;
import p000a.C1862j5;
import p000a.C2271qk;
import p000a.C2281qz;
import p000a.C2351sF;
import p000a.C2590wo;
import p000a.InterfaceC0491JG;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC1131VA {

    /* renamed from: G */
    public boolean f9393G;

    /* renamed from: I */
    public WeakReference f9394I;

    /* renamed from: M */
    public final float f9395M;

    /* renamed from: N */
    public final C2271qk f9396N;

    /* renamed from: P */
    public final C0099Bw f9397P;

    /* renamed from: Q */
    public final float f9398Q;

    /* renamed from: R */
    public int f9399R;

    /* renamed from: S */
    public int f9400S;

    /* renamed from: U */
    public final C1433at f9401U;

    /* renamed from: V */
    public int f9402V;

    /* renamed from: W */
    public C0737Nq f9403W;

    /* renamed from: g */
    public VelocityTracker f9404g;

    /* renamed from: h */
    public C2281qz f9405h;

    /* renamed from: k */
    public int f9406k;

    /* renamed from: o */
    public int f9407o;

    /* renamed from: q */
    public WeakReference f9408q;

    /* renamed from: s */
    public final LinkedHashSet f9409s;

    /* renamed from: u */
    public boolean f9410u;

    /* renamed from: v */
    public final ColorStateList f9411v;

    /* renamed from: w */
    public int f9412w;

    /* renamed from: y */
    public int f9413y;

    /* renamed from: z */
    public C2351sF f9414z;

    public SideSheetBehavior() {
        this.f9396N = new C2271qk(this);
        this.f9410u = true;
        this.f9407o = 5;
        this.f9395M = 0.1f;
        this.f9406k = -1;
        this.f9409s = new LinkedHashSet();
        this.f9401U = new C1433at(this);
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: Q */
    public final void mo2317Q() {
        this.f9394I = null;
        this.f9403W = null;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: R */
    public final void mo2318R(View view, Parcelable parcelable) {
        int i = ((C2590wo) parcelable).f7931w;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f9407o = i;
    }

    /* renamed from: U */
    public final void m5066U() {
        View view;
        WeakReference weakReference = this.f9394I;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2446u3.m4222W(view, 262144);
        AbstractC2446u3.m4225u(view, 0);
        AbstractC2446u3.m4222W(view, 1048576);
        AbstractC2446u3.m4225u(view, 0);
        final int i = 5;
        if (this.f9407o != 5) {
            AbstractC2446u3.m4214G(view, C1862j5.f5820G, new InterfaceC0491JG() { // from class: a.yH
                @Override // p000a.InterfaceC0491JG
                /* renamed from: h */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean mo155h(android.view.View r5) {
                    /*
                        r4 = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r5 = com.google.android.material.sidesheet.SideSheetBehavior.this
                        r5.getClass()
                        r0 = 1
                        int r1 = r2
                        if (r1 == r0) goto L4b
                        r2 = 2
                        if (r1 != r2) goto Le
                        goto L4b
                    Le:
                        java.lang.ref.WeakReference r2 = r5.f9394I
                        if (r2 == 0) goto L47
                        java.lang.Object r2 = r2.get()
                        if (r2 != 0) goto L19
                        goto L47
                    L19:
                        java.lang.ref.WeakReference r2 = r5.f9394I
                        java.lang.Object r2 = r2.get()
                        android.view.View r2 = (android.view.View) r2
                        a.Y6 r3 = new a.Y6
                        r3.<init>(r1, r0, r5)
                        android.view.ViewParent r5 = r2.getParent()
                        if (r5 == 0) goto L3c
                        boolean r5 = r5.isLayoutRequested()
                        if (r5 == 0) goto L3c
                        java.util.WeakHashMap r5 = p000a.AbstractC2446u3.f7488z
                        boolean r5 = p000a.AbstractC1285Y3.m2633h(r2)
                        if (r5 == 0) goto L3c
                        r5 = r0
                        goto L3d
                    L3c:
                        r5 = 0
                    L3d:
                        if (r5 == 0) goto L43
                        r2.post(r3)
                        goto L4a
                    L43:
                        r3.run()
                        goto L4a
                    L47:
                        r5.m5069y(r1)
                    L4a:
                        return r0
                    L4b:
                        java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "STATE_"
                        r2.<init>(r3)
                        if (r1 != r0) goto L59
                        java.lang.String r0 = "DRAGGING"
                        goto L5b
                    L59:
                        java.lang.String r0 = "SETTLING"
                    L5b:
                        java.lang.String r1 = " should not be set externally."
                        java.lang.String r0 = p000a.AbstractC2441tz.m4187M(r2, r0, r1)
                        r5.<init>(r0)
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000a.C2666yH.mo155h(android.view.View):boolean");
                }
            });
        }
        final int i2 = 3;
        if (this.f9407o != 3) {
            AbstractC2446u3.m4214G(view, C1862j5.f5826o, new InterfaceC0491JG() { // from class: a.yH
                @Override // p000a.InterfaceC0491JG
                /* renamed from: h */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean mo155h(android.view.View r5) {
                    /*
                        r4 = this;
                        com.google.android.material.sidesheet.SideSheetBehavior r5 = com.google.android.material.sidesheet.SideSheetBehavior.this
                        r5.getClass()
                        r0 = 1
                        int r1 = r2
                        if (r1 == r0) goto L4b
                        r2 = 2
                        if (r1 != r2) goto Le
                        goto L4b
                    Le:
                        java.lang.ref.WeakReference r2 = r5.f9394I
                        if (r2 == 0) goto L47
                        java.lang.Object r2 = r2.get()
                        if (r2 != 0) goto L19
                        goto L47
                    L19:
                        java.lang.ref.WeakReference r2 = r5.f9394I
                        java.lang.Object r2 = r2.get()
                        android.view.View r2 = (android.view.View) r2
                        a.Y6 r3 = new a.Y6
                        r3.<init>(r1, r0, r5)
                        android.view.ViewParent r5 = r2.getParent()
                        if (r5 == 0) goto L3c
                        boolean r5 = r5.isLayoutRequested()
                        if (r5 == 0) goto L3c
                        java.util.WeakHashMap r5 = p000a.AbstractC2446u3.f7488z
                        boolean r5 = p000a.AbstractC1285Y3.m2633h(r2)
                        if (r5 == 0) goto L3c
                        r5 = r0
                        goto L3d
                    L3c:
                        r5 = 0
                    L3d:
                        if (r5 == 0) goto L43
                        r2.post(r3)
                        goto L4a
                    L43:
                        r3.run()
                        goto L4a
                    L47:
                        r5.m5069y(r1)
                    L4a:
                        return r0
                    L4b:
                        java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r3 = "STATE_"
                        r2.<init>(r3)
                        if (r1 != r0) goto L59
                        java.lang.String r0 = "DRAGGING"
                        goto L5b
                    L59:
                        java.lang.String r0 = "SETTLING"
                    L5b:
                        java.lang.String r1 = " should not be set externally."
                        java.lang.String r0 = p000a.AbstractC2441tz.m4187M(r2, r0, r1)
                        r5.<init>(r0)
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000a.C2666yH.mo155h(android.view.View):boolean");
                }
            });
        }
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: W */
    public final boolean mo248W(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    /* renamed from: g */
    public final C1168Vr m5067g() {
        View view;
        WeakReference weakReference = this.f9394I;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof C1168Vr)) {
            return null;
        }
        return (C1168Vr) view.getLayoutParams();
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: k */
    public final boolean mo2322k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        boolean z4 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f9407o;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C0737Nq c0737Nq = this.f9403W;
        if (c0737Nq != null && (this.f9410u || i == 1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c0737Nq.m1691M(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f9404g) != null) {
            velocityTracker.recycle();
            this.f9404g = null;
        }
        if (this.f9404g == null) {
            this.f9404g = VelocityTracker.obtain();
        }
        this.f9404g.addMovement(motionEvent);
        C0737Nq c0737Nq2 = this.f9403W;
        if (c0737Nq2 != null && (this.f9410u || this.f9407o == 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && actionMasked == 2 && !this.f9393G) {
            if (c0737Nq2 != null && (this.f9410u || this.f9407o == 1)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && Math.abs(this.f9413y - motionEvent.getX()) > this.f9403W.f2501h) {
                z4 = true;
            }
            if (z4) {
                this.f9403W.m1700h(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f9393G;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0130  */
    @Override // p000a.AbstractC1131VA
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo2323o(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.mo2323o(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002e, code lost:
    
        if (r1.m1703q(r0, r4.getTop()) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004b, code lost:
    
        if (r4 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004d, code lost:
    
        r2 = true;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5068s(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            r0 = 3
            if (r5 == r0) goto L19
            r0 = 5
            if (r5 != r0) goto Ld
            a.sF r0 = r3.f9414z
            int r0 = r0.m4048yF()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Invalid state to get outer edge offset: "
            java.lang.String r5 = p000a.AbstractC2441tz.m4188N(r6, r5)
            r4.<init>(r5)
            throw r4
        L19:
            a.sF r0 = r3.f9414z
            int r0 = r0.m4045d3()
        L1f:
            a.Nq r1 = r3.f9403W
            r2 = 0
            if (r1 == 0) goto L4e
            if (r6 == 0) goto L31
            int r4 = r4.getTop()
            boolean r4 = r1.m1703q(r0, r4)
            if (r4 == 0) goto L4e
            goto L4d
        L31:
            int r6 = r4.getTop()
            r1.f2502k = r4
            r4 = -1
            r1.f2507v = r4
            boolean r4 = r1.m1698W(r0, r6, r2, r2)
            if (r4 != 0) goto L4b
            int r6 = r1.f2510z
            if (r6 != 0) goto L4b
            android.view.View r6 = r1.f2502k
            if (r6 == 0) goto L4b
            r6 = 0
            r1.f2502k = r6
        L4b:
            if (r4 == 0) goto L4e
        L4d:
            r2 = 1
        L4e:
            if (r2 == 0) goto L5a
            r4 = 2
            r3.m5069y(r4)
            a.qk r4 = r3.f9396N
            r4.m3909z(r5)
            goto L5d
        L5a:
            r3.m5069y(r5)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.m5068s(android.view.View, int, boolean):void");
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: u */
    public final boolean mo2325u(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        C0737Nq c0737Nq;
        VelocityTracker velocityTracker;
        if ((view.isShown() || AbstractC2446u3.m4217P(view) != null) && this.f9410u) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f9393G = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f9404g) != null) {
            velocityTracker.recycle();
            this.f9404g = null;
        }
        if (this.f9404g == null) {
            this.f9404g = VelocityTracker.obtain();
        }
        this.f9404g.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f9393G) {
                this.f9393G = false;
                return false;
            }
        } else {
            this.f9413y = (int) motionEvent.getX();
        }
        if (!this.f9393G && (c0737Nq = this.f9403W) != null && c0737Nq.m1701k(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: v */
    public final void mo2326v(C1168Vr c1168Vr) {
        this.f9394I = null;
        this.f9403W = null;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: w */
    public final Parcelable mo2327w(View view) {
        return new C2590wo(View.BaseSavedState.EMPTY_STATE, this);
    }

    /* renamed from: y */
    public final void m5069y(int i) {
        View view;
        int i2;
        if (this.f9407o == i) {
            return;
        }
        this.f9407o = i;
        WeakReference weakReference = this.f9394I;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (this.f9407o == 5) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f9409s.iterator();
        if (!it.hasNext()) {
            m5066U();
        } else {
            AbstractC2441tz.m4202q(it.next());
            throw null;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f9396N = new C2271qk(this);
        this.f9410u = true;
        this.f9407o = 5;
        this.f9395M = 0.1f;
        this.f9406k = -1;
        this.f9409s = new LinkedHashSet();
        this.f9401U = new C1433at(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2914F);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f9411v = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f9397P = new C0099Bw(C0099Bw.m208h(context, attributeSet, 0, 2131952637));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f9406k = resourceId;
            WeakReference weakReference = this.f9408q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f9408q = null;
            WeakReference weakReference2 = this.f9394I;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    if (AbstractC1285Y3.m2635v(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        C0099Bw c0099Bw = this.f9397P;
        if (c0099Bw != null) {
            C2281qz c2281qz = new C2281qz(c0099Bw);
            this.f9405h = c2281qz;
            c2281qz.m3930M(context);
            ColorStateList colorStateList = this.f9411v;
            if (colorStateList != null) {
                this.f9405h.m3934R(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f9405h.setTint(typedValue.data);
            }
        }
        this.f9398Q = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f9410u = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
