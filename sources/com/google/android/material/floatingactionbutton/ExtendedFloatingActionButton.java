package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.AbstractC0095Bq;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC1131VA;
import p000a.AbstractC2446u3;
import p000a.AbstractC2471uY;
import p000a.AbstractC2575wW;
import p000a.C0030Ab;
import p000a.C0099Bw;
import p000a.C0414Hq;
import p000a.C0436IG;
import p000a.C0476Iz;
import p000a.C0500JS;
import p000a.C1168Vr;
import p000a.C1174Vy;
import p000a.C1624eZ;
import p000a.C2196pM;
import p000a.C2388sw;
import p000a.InterfaceC0416Hs;
import p000a.InterfaceC1594e0;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements InterfaceC1594e0 {

    /* renamed from: Yd */
    public static final C0414Hq f9343Yd;

    /* renamed from: b */
    public static final C0414Hq f9344b;

    /* renamed from: l */
    public static final C0414Hq f9345l;

    /* renamed from: nP */
    public static final C0414Hq f9346nP;

    /* renamed from: B */
    public boolean f9347B;

    /* renamed from: D */
    public int f9348D;

    /* renamed from: K */
    public ColorStateList f9349K;

    /* renamed from: L */
    public final C0500JS f9350L;

    /* renamed from: O */
    public final int f9351O;

    /* renamed from: T */
    public final ExtendedFloatingActionButtonBehavior f9352T;

    /* renamed from: d */
    public final C0436IG f9353d;

    /* renamed from: i */
    public final C0476Iz f9354i;

    /* renamed from: j */
    public final C0500JS f9355j;

    /* renamed from: m */
    public int f9356m;

    /* renamed from: n */
    public int f9357n;

    /* renamed from: p */
    public int f9358p;

    /* renamed from: t */
    public boolean f9359t;

    /* renamed from: x */
    public int f9360x;

    /* loaded from: classes.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends AbstractC1131VA {

        /* renamed from: h */
        public final boolean f9361h;

        /* renamed from: v */
        public final boolean f9362v;

        /* renamed from: z */
        public Rect f9363z;

        public ExtendedFloatingActionButtonBehavior() {
            this.f9361h = false;
            this.f9362v = true;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: P */
        public final boolean mo2316P(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                m5055g(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof C1168Vr) {
                    z = ((C1168Vr) layoutParams).f3818z instanceof BottomSheetBehavior;
                } else {
                    z = false;
                }
                if (z) {
                    m5056y(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        /* renamed from: g */
        public final boolean m5055g(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            int i;
            C1168Vr c1168Vr = (C1168Vr) extendedFloatingActionButton.getLayoutParams();
            boolean z2 = this.f9361h;
            boolean z3 = this.f9362v;
            int i2 = 0;
            if ((!z2 && !z3) || c1168Vr.f3807Q != appBarLayout.getId()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            if (this.f9363z == null) {
                this.f9363z = new Rect();
            }
            Rect rect = this.f9363z;
            AbstractC2471uY.m4247z(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.m4984N()) {
                if (z3) {
                    i = 2;
                } else {
                    i = 1;
                }
                C0414Hq c0414Hq = ExtendedFloatingActionButton.f9345l;
                extendedFloatingActionButton.m5053S(i);
            } else {
                if (z3) {
                    i2 = 3;
                }
                C0414Hq c0414Hq2 = ExtendedFloatingActionButton.f9345l;
                extendedFloatingActionButton.m5053S(i2);
            }
            return true;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: o */
        public final boolean mo2323o(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList m4778M = coordinatorLayout.m4778M(extendedFloatingActionButton);
            int size = m4778M.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) m4778M.get(i2);
                if (view2 instanceof AppBarLayout) {
                    if (m5055g(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof C1168Vr) {
                        z = ((C1168Vr) layoutParams).f3818z instanceof BottomSheetBehavior;
                    } else {
                        z = false;
                    }
                    if (z && m5056y(view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m4784k(extendedFloatingActionButton, i);
            return true;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: v */
        public final void mo2326v(C1168Vr c1168Vr) {
            if (c1168Vr.f3813o == 0) {
                c1168Vr.f3813o = 80;
            }
        }

        /* renamed from: y */
        public final boolean m5056y(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z;
            C1168Vr c1168Vr = (C1168Vr) extendedFloatingActionButton.getLayoutParams();
            boolean z2 = this.f9361h;
            boolean z3 = this.f9362v;
            int i = 0;
            if ((!z2 && !z3) || c1168Vr.f3807Q != view.getId()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            int i2 = 2;
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((C1168Vr) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (!z3) {
                    i2 = 1;
                }
                C0414Hq c0414Hq = ExtendedFloatingActionButton.f9345l;
                extendedFloatingActionButton.m5053S(i2);
            } else {
                if (z3) {
                    i = 3;
                }
                C0414Hq c0414Hq2 = ExtendedFloatingActionButton.f9345l;
                extendedFloatingActionButton.m5053S(i);
            }
            return true;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: z */
        public final /* bridge */ /* synthetic */ boolean mo2328z(View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2920M);
            this.f9361h = obtainStyledAttributes.getBoolean(0, false);
            this.f9362v = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    static {
        Class<Float> cls = Float.class;
        f9345l = new C0414Hq(cls, "width", 8);
        f9344b = new C0414Hq(cls, "height", 9);
        f9346nP = new C0414Hq(cls, "paddingStart", 10);
        f9343Yd = new C0414Hq(cls, "paddingEnd", 11);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.extendedFloatingActionButtonStyle, 2131952714), attributeSet, R.attr.extendedFloatingActionButtonStyle);
        boolean z;
        int i = 0;
        this.f9358p = 0;
        int i2 = 22;
        C2196pM c2196pM = new C2196pM(i2, i);
        C0476Iz c0476Iz = new C0476Iz(this, c2196pM);
        this.f9354i = c0476Iz;
        C0436IG c0436ig = new C0436IG(this, c2196pM);
        this.f9353d = c0436ig;
        this.f9359t = true;
        this.f9347B = false;
        Context context2 = getContext();
        this.f9352T = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray m1817K = AbstractC0795Op.m1817K(context2, attributeSet, AbstractC0863Q8.f2915G, R.attr.extendedFloatingActionButtonStyle, 2131952714, new int[0]);
        C0030Ab m69z = C0030Ab.m69z(context2, m1817K, 5);
        C0030Ab m69z2 = C0030Ab.m69z(context2, m1817K, 4);
        C0030Ab m69z3 = C0030Ab.m69z(context2, m1817K, 2);
        C0030Ab m69z4 = C0030Ab.m69z(context2, m1817K, 6);
        this.f9351O = m1817K.getDimensionPixelSize(0, -1);
        int i3 = m1817K.getInt(3, 1);
        this.f9357n = AbstractC0095Bq.m200Q(this);
        this.f9360x = AbstractC0095Bq.m198N(this);
        C2196pM c2196pM2 = new C2196pM(i2, i);
        InterfaceC0416Hs c2388sw = new C2388sw(this, 1);
        InterfaceC0416Hs c1624eZ = new C1624eZ(this, c2388sw, 11);
        InterfaceC0416Hs c1174Vy = new C1174Vy(9, this, c1624eZ, c2388sw);
        if (i3 != 1) {
            if (i3 != 2) {
                c2388sw = c1174Vy;
            } else {
                c2388sw = c1624eZ;
            }
            z = true;
        } else {
            z = true;
        }
        C0500JS c0500js = new C0500JS(this, c2196pM2, c2388sw, z);
        this.f9350L = c0500js;
        C0500JS c0500js2 = new C0500JS(this, c2196pM2, new C2388sw(this, 0), false);
        this.f9355j = c0500js2;
        c0476Iz.f316Q = m69z;
        c0436ig.f316Q = m69z2;
        c0500js.f316Q = m69z3;
        c0500js2.f316Q = m69z4;
        m1817K.recycle();
        mo3137h(new C0099Bw(C0099Bw.m209v(context2, attributeSet, R.attr.extendedFloatingActionButtonStyle, 2131952714, C0099Bw.f369S)));
        this.f9349K = getTextColors();
    }

    /* renamed from: R */
    public final void m5052R(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x003a, code lost:
    
        if (isInEditMode() == false) goto L64;
     */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5053S(int r6) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            if (r6 == 0) goto L20
            if (r6 == r1) goto L1d
            if (r6 == r0) goto L1a
            r2 = 3
            if (r6 != r2) goto Le
            a.JS r2 = r5.f9350L
            goto L22
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown strategy type: "
            java.lang.String r6 = p000a.AbstractC2441tz.m4188N(r1, r6)
            r0.<init>(r6)
            throw r0
        L1a:
            a.JS r2 = r5.f9355j
            goto L22
        L1d:
            a.IG r2 = r5.f9353d
            goto L22
        L20:
            a.Iz r2 = r5.f9354i
        L22:
            boolean r3 = r2.mo182W()
            if (r3 == 0) goto L29
            return
        L29:
            java.util.WeakHashMap r3 = p000a.AbstractC2446u3.f7488z
            boolean r3 = p000a.AbstractC1285Y3.m2635v(r5)
            r4 = 0
            if (r3 != 0) goto L36
            r5.getVisibility()
            goto L3d
        L36:
            boolean r3 = r5.isInEditMode()
            if (r3 != 0) goto L3d
            goto L3e
        L3d:
            r1 = r4
        L3e:
            if (r1 != 0) goto L47
            r2.mo184o()
            r2.mo185u()
            return
        L47:
            if (r6 != r0) goto L62
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            if (r6 == 0) goto L56
            int r0 = r6.width
            r5.f9348D = r0
            int r6 = r6.height
            goto L60
        L56:
            int r6 = r5.getWidth()
            r5.f9348D = r6
            int r6 = r5.getHeight()
        L60:
            r5.f9356m = r6
        L62:
            r5.measure(r4, r4)
            android.animation.AnimatorSet r6 = r2.mo187z()
            a.Qg r0 = new a.Qg
            r0.<init>(r2)
            r6.addListener(r0)
            java.util.ArrayList r0 = r2.f318v
            java.util.Iterator r0 = r0.iterator()
        L77:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r0.next()
            android.animation.Animator$AnimatorListener r1 = (android.animation.Animator.AnimatorListener) r1
            r6.addListener(r1)
            goto L77
        L87:
            r6.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.m5053S(int):void");
    }

    /* renamed from: V */
    public final int m5054V() {
        int i = this.f9351O;
        if (i < 0) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            return (Math.min(AbstractC0095Bq.m200Q(this), AbstractC0095Bq.m198N(this)) * 2) + this.f9284E;
        }
        return i;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9359t && TextUtils.isEmpty(getText()) && this.f9296s != null) {
            this.f9359t = false;
            this.f9355j.mo184o();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f9359t && !this.f9347B) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            this.f9357n = AbstractC0095Bq.m200Q(this);
            this.f9360x = AbstractC0095Bq.m198N(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.f9359t || this.f9347B) {
            return;
        }
        this.f9357n = i;
        this.f9360x = i3;
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        super.setTextColor(i);
        this.f9349K = getTextColors();
    }

    @Override // p000a.InterfaceC1594e0
    /* renamed from: z */
    public final AbstractC1131VA mo3069z() {
        return this.f9352T;
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.f9349K = getTextColors();
    }
}
