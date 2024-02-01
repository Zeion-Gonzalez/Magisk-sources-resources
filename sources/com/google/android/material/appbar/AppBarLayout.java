package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.AbstractC0095Bq;
import p000a.AbstractC0124CN;
import p000a.AbstractC0438II;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC0979SN;
import p000a.AbstractC1090US;
import p000a.AbstractC1131VA;
import p000a.AbstractC1548d9;
import p000a.AbstractC2340s1;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.AbstractC2527vY;
import p000a.AbstractC2575wW;
import p000a.AbstractC2602x;
import p000a.C0087Bg;
import p000a.C0191Dg;
import p000a.C0914RD;
import p000a.C1168Vr;
import p000a.C1862j5;
import p000a.C2052mg;
import p000a.C2281qz;
import p000a.C2621xJ;
import p000a.InterfaceC1594e0;
import p000a.InterfaceC2218po;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements InterfaceC1594e0 {

    /* renamed from: i */
    public static final /* synthetic */ int f9158i = 0;

    /* renamed from: C */
    public int[] f9159C;

    /* renamed from: E */
    public final int f9160E;

    /* renamed from: F */
    public final TimeInterpolator f9161F;

    /* renamed from: H */
    public final ArrayList f9162H;

    /* renamed from: I */
    public int f9163I;

    /* renamed from: J */
    public ValueAnimator f9164J;

    /* renamed from: L */
    public Behavior f9165L;

    /* renamed from: R */
    public int f9166R;

    /* renamed from: S */
    public int f9167S;

    /* renamed from: U */
    public final boolean f9168U;

    /* renamed from: c */
    public C0191Dg f9169c;

    /* renamed from: e */
    public final long f9170e;

    /* renamed from: f */
    public WeakReference f9171f;

    /* renamed from: g */
    public C2621xJ f9172g;

    /* renamed from: j */
    public final float f9173j;

    /* renamed from: k */
    public int f9174k;

    /* renamed from: p */
    public Drawable f9175p;

    /* renamed from: q */
    public boolean f9176q;

    /* renamed from: r */
    public final ColorStateList f9177r;

    /* renamed from: s */
    public boolean f9178s;

    /* renamed from: w */
    public int f9179w;

    /* renamed from: y */
    public boolean f9180y;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC2527vY {

        /* renamed from: G */
        public int f9181G;

        /* renamed from: M */
        public int f9182M;

        /* renamed from: R */
        public WeakReference f9183R;

        /* renamed from: S */
        public C2768Q f9184S;

        /* renamed from: V */
        public ValueAnimator f9185V;

        /* renamed from: w */
        public boolean f9186w;

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0063  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void m4992e(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                r0 = 1
                if (r5 == 0) goto L5e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                a.RD r1 = (p000a.C0914RD) r1
                int r1 = r1.f3142z
                r3 = r1 & 1
                if (r3 == 0) goto L5e
                java.util.WeakHashMap r3 = p000a.AbstractC2446u3.f7488z
                int r3 = p000a.AbstractC2397t8.m4117P(r5)
                if (r10 <= 0) goto L4b
                r10 = r1 & 12
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.m4986Q()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
                goto L5c
            L4b:
                r10 = r1 & 2
                if (r10 == 0) goto L5e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.m4986Q()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
            L5c:
                r9 = r0
                goto L5f
            L5e:
                r9 = r2
            L5f:
                boolean r10 = r8.f9168U
                if (r10 == 0) goto L6b
                android.view.View r9 = m4993r(r7)
                boolean r9 = r8.m4983M(r9)
            L6b:
                boolean r9 = r8.m4982G(r9)
                if (r11 != 0) goto Laf
                if (r9 == 0) goto Ld6
                a.Ju r9 = r7.f8902R
                java.lang.Object r9 = r9.f1763N
                a.yx r9 = (p000a.C2698yx) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f8900I
                r7.clear()
                if (r9 == 0) goto L89
                r7.addAll(r9)
            L89:
                int r9 = r7.size()
                r10 = r2
            L8e:
                if (r10 >= r9) goto Lad
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                a.Vr r11 = (p000a.C1168Vr) r11
                a.VA r11 = r11.f3818z
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto Laa
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f433Q
                if (r7 == 0) goto Lad
                r2 = r0
                goto Lad
            Laa:
                int r10 = r10 + 1
                goto L8e
            Lad:
                if (r2 == 0) goto Ld6
            Laf:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto Lbc
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            Lbc:
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                if (r7 == 0) goto Lc9
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                r7.jumpToCurrentState()
            Lc9:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto Ld6
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            Ld6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.m4992e(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: r */
        public static View m4993r(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC2218po) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: H */
        public final void m4994H(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            View view;
            boolean z;
            boolean z2;
            boolean z3;
            AbstractC2446u3.m4222W(coordinatorLayout, C1862j5.f5823Q.m3486z());
            boolean z4 = false;
            AbstractC2446u3.m4225u(coordinatorLayout, 0);
            AbstractC2446u3.m4222W(coordinatorLayout, C1862j5.f5827u.m3486z());
            AbstractC2446u3.m4225u(coordinatorLayout, 0);
            if (appBarLayout.m4990u() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    view = coordinatorLayout.getChildAt(i);
                    if (((C1168Vr) view.getLayoutParams()).f3818z instanceof ScrollingViewBehavior) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = appBarLayout.getChildCount();
            int i2 = 0;
            while (true) {
                z = true;
                if (i2 < childCount2) {
                    if (((C0914RD) appBarLayout.getChildAt(i2).getLayoutParams()).f3142z != 0) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                return;
            }
            if (AbstractC2446u3.m4226v(coordinatorLayout) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                AbstractC2446u3.m4221V(coordinatorLayout, new C2769h(this));
            }
            if (mo4363s() != (-appBarLayout.m4990u())) {
                AbstractC2446u3.m4214G(coordinatorLayout, C1862j5.f5823Q, new C2767P(appBarLayout, false));
                z4 = true;
            }
            if (mo4363s() != 0) {
                if (view2.canScrollVertically(-1)) {
                    int i3 = -appBarLayout.m4991v();
                    if (i3 != 0) {
                        AbstractC2446u3.m4214G(coordinatorLayout, C1862j5.f5827u, new C2770v(this, coordinatorLayout, appBarLayout, view2, i3));
                    }
                } else {
                    AbstractC2446u3.m4214G(coordinatorLayout, C1862j5.f5827u, new C2767P(appBarLayout, true));
                }
                this.f9186w = z;
            }
            z = z4;
            this.f9186w = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0029, code lost:
        
            if (r3 != false) goto L39;
         */
        @Override // p000a.AbstractC1131VA
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean mo2313I(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r6 = r6 & 2
                r0 = 0
                if (r6 == 0) goto L2c
                boolean r6 = r4.f9168U
                r1 = 1
                if (r6 != 0) goto L2b
                int r6 = r4.m4990u()
                if (r6 == 0) goto L14
                r6 = r1
                goto L15
            L14:
                r6 = r0
            L15:
                if (r6 == 0) goto L28
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L28
                r3 = r1
                goto L29
            L28:
                r3 = r0
            L29:
                if (r3 == 0) goto L2c
            L2b:
                r0 = r1
            L2c:
                if (r0 == 0) goto L35
                android.animation.ValueAnimator r3 = r2.f9185V
                if (r3 == 0) goto L35
                r3.cancel()
            L35:
                r3 = 0
                r2.f9183R = r3
                r2.f9182M = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo2313I(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int):boolean");
        }

        /* renamed from: J */
        public final C2768Q m4995J(Parcelable parcelable, AppBarLayout appBarLayout) {
            boolean z;
            boolean z2;
            int m4095g = m4095g();
            int childCount = appBarLayout.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + m4095g;
                if (childAt.getTop() + m4095g <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbstractC2602x.f8020R;
                    }
                    C2768Q c2768q = new C2768Q(parcelable);
                    if (m4095g == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c2768q.f9195I = z;
                    if (!z && (-m4095g) >= appBarLayout.m4990u()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c2768q.f9199w = z2;
                    c2768q.f9198q = i;
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    if (bottom == appBarLayout.m4986Q() + AbstractC2397t8.m4117P(childAt)) {
                        z3 = true;
                    }
                    c2768q.f9196g = z3;
                    c2768q.f9197k = bottom / childAt.getHeight();
                    return c2768q;
                }
            }
            return null;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: M */
        public final /* bridge */ /* synthetic */ void mo2314M(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            m4996Y(coordinatorLayout, (AppBarLayout) view, view2, i2, iArr);
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: R */
        public final void mo2318R(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof C2768Q) {
                C2768Q c2768q = this.f9184S;
                this.f9184S = (C2768Q) parcelable;
            } else {
                this.f9184S = null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:121:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0170  */
        @Override // p000a.AbstractC2527vY
        /* renamed from: U */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int mo4362U(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 380
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.mo4362U(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: V */
        public final void mo2320V(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                iArr[1] = mo4362U(coordinatorLayout, appBarLayout, mo4363s() - i3, -appBarLayout.m4985P(), 0);
            }
            if (i3 == 0) {
                m4994H(coordinatorLayout, appBarLayout);
            }
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: W */
        public final boolean mo248W(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((C1168Vr) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.m4783g(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        /* renamed from: Y */
        public final void m4996Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int[] iArr) {
            int i2;
            int i3;
            if (i != 0) {
                if (i < 0) {
                    i2 = -appBarLayout.m4990u();
                    i3 = appBarLayout.m4991v() + i2;
                } else {
                    i2 = -appBarLayout.m4990u();
                    i3 = 0;
                }
                int i4 = i2;
                int i5 = i3;
                if (i4 != i5) {
                    iArr[1] = mo4362U(coordinatorLayout, appBarLayout, mo4363s() - i, i4, i5);
                }
            }
            if (appBarLayout.f9168U) {
                appBarLayout.m4982G(appBarLayout.m4983M(view));
            }
        }

        /* renamed from: c */
        public final void m4997c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int paddingTop = appBarLayout.getPaddingTop() + appBarLayout.m4986Q();
            int mo4363s = mo4363s() - paddingTop;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                z = true;
                if (i < childCount) {
                    View childAt = appBarLayout.getChildAt(i);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    C0914RD c0914rd = (C0914RD) childAt.getLayoutParams();
                    if ((c0914rd.f3142z & 32) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        top -= ((LinearLayout.LayoutParams) c0914rd).topMargin;
                        bottom += ((LinearLayout.LayoutParams) c0914rd).bottomMargin;
                    }
                    int i2 = -mo4363s;
                    if (top <= i2 && bottom >= i2) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                C0914RD c0914rd2 = (C0914RD) childAt2.getLayoutParams();
                int i3 = c0914rd2.f3142z;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0) {
                        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                        if (AbstractC2397t8.m4124h(appBarLayout) && AbstractC2397t8.m4124h(childAt2)) {
                            i4 -= appBarLayout.m4986Q();
                        }
                    }
                    if ((i3 & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                        i5 += AbstractC2397t8.m4117P(childAt2);
                    } else {
                        if ((i3 & 5) == 5) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            WeakHashMap weakHashMap3 = AbstractC2446u3.f7488z;
                            int m4117P = AbstractC2397t8.m4117P(childAt2) + i5;
                            if (mo4363s < m4117P) {
                                i4 = m4117P;
                            } else {
                                i5 = m4117P;
                            }
                        }
                    }
                    if ((i3 & 32) != 32) {
                        z = false;
                    }
                    if (z) {
                        i4 += ((LinearLayout.LayoutParams) c0914rd2).topMargin;
                        i5 -= ((LinearLayout.LayoutParams) c0914rd2).bottomMargin;
                    }
                    if (mo4363s < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    m4998f(coordinatorLayout, appBarLayout, AbstractC2575wW.m4408Q(i4 + paddingTop, -appBarLayout.m4990u(), 0));
                }
            }
        }

        /* renamed from: f */
        public final void m4998f(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(mo4363s() - i);
            float abs2 = Math.abs(0.0f);
            float f = abs;
            if (abs2 > 0.0f) {
                height = Math.round((f / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((f / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int mo4363s = mo4363s();
            if (mo4363s == i) {
                ValueAnimator valueAnimator = this.f9185V;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f9185V.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f9185V;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f9185V = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC1090US.f3560N);
                this.f9185V.addUpdateListener(new C2771z(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f9185V.setDuration(Math.min(height, 600));
            this.f9185V.setIntValues(mo4363s, i);
            this.f9185V.start();
        }

        @Override // p000a.AbstractC2370sb, p000a.AbstractC1131VA
        /* renamed from: o */
        public final boolean mo2323o(CoordinatorLayout coordinatorLayout, View view, int i) {
            boolean z;
            int i2;
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.mo2323o(coordinatorLayout, appBarLayout, i);
            int i3 = appBarLayout.f9174k;
            C2768Q c2768q = this.f9184S;
            if (c2768q != null && (i3 & 8) == 0) {
                if (c2768q.f9199w) {
                    i2 = -appBarLayout.m4990u();
                    m4361E(coordinatorLayout, appBarLayout, i2);
                } else {
                    if (!c2768q.f9195I) {
                        View childAt = appBarLayout.getChildAt(c2768q.f9198q);
                        int i4 = -childAt.getBottom();
                        if (this.f9184S.f9196g) {
                            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                            round = appBarLayout.m4986Q() + AbstractC2397t8.m4117P(childAt) + i4;
                        } else {
                            round = Math.round(childAt.getHeight() * this.f9184S.f9197k) + i4;
                        }
                        m4361E(coordinatorLayout, appBarLayout, round);
                    }
                    m4361E(coordinatorLayout, appBarLayout, 0);
                }
            } else if (i3 != 0) {
                if ((i3 & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i3 & 2) != 0) {
                    i2 = -appBarLayout.m4990u();
                    if (z) {
                        m4998f(coordinatorLayout, appBarLayout, i2);
                    }
                    m4361E(coordinatorLayout, appBarLayout, i2);
                } else if ((i3 & 1) != 0) {
                    if (z) {
                        m4998f(coordinatorLayout, appBarLayout, 0);
                    }
                    m4361E(coordinatorLayout, appBarLayout, 0);
                }
            }
            appBarLayout.f9174k = 0;
            this.f9184S = null;
            int m4408Q = AbstractC2575wW.m4408Q(m4095g(), -appBarLayout.m4990u(), 0);
            C0087Bg c0087Bg = this.f7288z;
            if (c0087Bg != null) {
                if (c0087Bg.f333P != m4408Q) {
                    c0087Bg.f333P = m4408Q;
                    c0087Bg.m193z();
                }
            } else {
                this.f7287h = m4408Q;
            }
            m4992e(coordinatorLayout, appBarLayout, m4095g(), 0, true);
            appBarLayout.f9167S = m4095g();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                AbstractC2397t8.m4115M(appBarLayout);
            }
            m4994H(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: q */
        public final void mo2324q(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f9182M == 0 || i == 1) {
                m4997c(coordinatorLayout, appBarLayout);
                if (appBarLayout.f9168U) {
                    appBarLayout.m4982G(appBarLayout.m4983M(view2));
                }
            }
            this.f9183R = new WeakReference(view2);
        }

        @Override // p000a.AbstractC2527vY
        /* renamed from: s */
        public final int mo4363s() {
            return m4095g() + this.f9181G;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: w */
        public final Parcelable mo2327w(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            C2768Q m4995J = m4995J(absSavedState, (AppBarLayout) view);
            if (m4995J != null) {
                return m4995J;
            }
            return absSavedState;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends AbstractC0124CN {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2933e);
            this.f433Q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: U */
        public static AppBarLayout m4999U(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                View view = (View) arrayList.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: N */
        public final void mo2315N(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                AbstractC2446u3.m4222W(coordinatorLayout, C1862j5.f5823Q.m3486z());
                AbstractC2446u3.m4225u(coordinatorLayout, 0);
                AbstractC2446u3.m4222W(coordinatorLayout, C1862j5.f5827u.m3486z());
                AbstractC2446u3.m4225u(coordinatorLayout, 0);
                AbstractC2446u3.m4221V(coordinatorLayout, null);
            }
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: P */
        public boolean mo2316P(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC1131VA abstractC1131VA = ((C1168Vr) view2.getLayoutParams()).f3818z;
            if (abstractC1131VA instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) abstractC1131VA).f9181G) + this.f431N) - m249s(view2);
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f9168U) {
                    appBarLayout.m4982G(appBarLayout.m4983M(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: S */
        public final boolean mo2319S(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout m4999U = m4999U(coordinatorLayout.m4778M(view));
            if (m4999U != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.f434v;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    m4999U.m4988W(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // p000a.AbstractC1131VA
        /* renamed from: h */
        public final boolean mo2321h(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.appBarLayoutStyle, 2131952491), attributeSet, R.attr.appBarLayoutStyle);
        ColorStateList colorStateList;
        boolean z;
        int i;
        this.f9166R = -1;
        this.f9179w = -1;
        this.f9163I = -1;
        int i2 = 0;
        this.f9174k = 0;
        this.f9162H = new ArrayList();
        Context context2 = getContext();
        int i3 = 1;
        setOrientation(1);
        int i4 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray m1817K = AbstractC0795Op.m1817K(context3, attributeSet, AbstractC0438II.f1452H, R.attr.appBarLayoutStyle, 2131952491, new int[0]);
        try {
            if (m1817K.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, m1817K.getResourceId(0, 0)));
            }
            m1817K.recycle();
            TypedArray m1817K2 = AbstractC0795Op.m1817K(context2, attributeSet, AbstractC0863Q8.f2949z, R.attr.appBarLayoutStyle, 2131952491, new int[0]);
            Drawable drawable = m1817K2.getDrawable(0);
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4127q(this, drawable);
            ColorStateList m1812H = AbstractC0795Op.m1812H(context2, m1817K2, 6);
            this.f9177r = m1812H;
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                colorStateList = ColorStateList.valueOf(((ColorDrawable) background).getColor());
            } else if (i4 >= 29) {
                colorStateList = AbstractC0979SN.m2157h(background);
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                C2281qz c2281qz = new C2281qz();
                c2281qz.m3934R(colorStateList);
                if (m1812H != null) {
                    if (this.f9178s) {
                        i = 255;
                    } else {
                        i = 0;
                    }
                    c2281qz.setAlpha(i);
                    c2281qz.m3934R(m1812H);
                    this.f9169c = new C0191Dg(this, i2, c2281qz);
                } else {
                    c2281qz.m3930M(context2);
                    this.f9169c = new C0191Dg(this, i3, c2281qz);
                }
                AbstractC2397t8.m4127q(this, c2281qz);
            }
            this.f9170e = AbstractC0795Op.m1831U8(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f9161F = AbstractC0795Op.m1802BO(context2, R.attr.motionEasingStandardInterpolator, AbstractC1090US.f3564z);
            if (m1817K2.hasValue(4)) {
                m4988W(m1817K2.getBoolean(4, false), false, false);
            }
            if (m1817K2.hasValue(3)) {
                AbstractC0438II.m1043qn(this, m1817K2.getDimensionPixelSize(3, 0));
            }
            int i5 = 2;
            if (i4 >= 26) {
                if (m1817K2.hasValue(2)) {
                    setKeyboardNavigationCluster(m1817K2.getBoolean(2, false));
                }
                if (m1817K2.hasValue(1)) {
                    setTouchscreenBlocksFocus(m1817K2.getBoolean(1, false));
                }
            }
            this.f9173j = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f9168U = m1817K2.getBoolean(5, false);
            this.f9160E = m1817K2.getResourceId(7, -1);
            Drawable drawable2 = m1817K2.getDrawable(8);
            Drawable drawable3 = this.f9175p;
            if (drawable3 != drawable2) {
                if (drawable3 != null) {
                    drawable3.setCallback(null);
                }
                Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
                this.f9175p = mutate;
                if (mutate != null) {
                    if (mutate.isStateful()) {
                        this.f9175p.setState(getDrawableState());
                    }
                    AbstractC2340s1.m3999h(this.f9175p, AbstractC0095Bq.m199P(this));
                    Drawable drawable4 = this.f9175p;
                    if (getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    drawable4.setVisible(z, false);
                    this.f9175p.setCallback(this);
                }
                if (this.f9175p != null && m4986Q() > 0) {
                    i2 = 1;
                }
                setWillNotDraw(i2 ^ 1);
                AbstractC2397t8.m4115M(this);
            }
            m1817K2.recycle();
            AbstractC1548d9.m3014s(this, new C2052mg(i5, this));
        } catch (Throwable th) {
            m1817K.recycle();
            throw th;
        }
    }

    /* renamed from: h */
    public static C0914RD m4981h(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C0914RD((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0914RD((ViewGroup.MarginLayoutParams) layoutParams) : new C0914RD(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0023, code lost:
    
        if (r6 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x002d, code lost:
    
        if (r6 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0030, code lost:
    
        r6 = r5.f9164J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0032, code lost:
    
        if (r6 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0034, code lost:
    
        r6.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0037, code lost:
    
        r6 = android.animation.ValueAnimator.ofFloat(r4, r3);
        r5.f9164J = r6;
        r6.setDuration(r5.f9170e);
        r5.f9164J.setInterpolator(r5.f9161F);
        r6 = r5.f9169c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0052, code lost:
    
        if (r6 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0054, code lost:
    
        r5.f9164J.addUpdateListener(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0059, code lost:
    
        r5.f9164J.start();
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4982G(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.f9178s
            r1 = 0
            if (r0 == r6) goto L5f
            r5.f9178s = r6
            r5.refreshDrawableState()
            boolean r0 = r5.f9168U
            r2 = 1
            if (r0 == 0) goto L5e
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r0 = r0 instanceof p000a.C2281qz
            if (r0 == 0) goto L5e
            android.content.res.ColorStateList r0 = r5.f9177r
            r3 = 0
            if (r0 == 0) goto L26
            r0 = 1132396544(0x437f0000, float:255.0)
            if (r6 == 0) goto L22
            r4 = r3
            goto L23
        L22:
            r4 = r0
        L23:
            if (r6 == 0) goto L30
            goto L2f
        L26:
            float r0 = r5.f9173j
            if (r6 == 0) goto L2c
            r4 = r3
            goto L2d
        L2c:
            r4 = r0
        L2d:
            if (r6 == 0) goto L30
        L2f:
            r3 = r0
        L30:
            android.animation.ValueAnimator r6 = r5.f9164J
            if (r6 == 0) goto L37
            r6.cancel()
        L37:
            r6 = 2
            float[] r6 = new float[r6]
            r6[r1] = r4
            r6[r2] = r3
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofFloat(r6)
            r5.f9164J = r6
            long r0 = r5.f9170e
            r6.setDuration(r0)
            android.animation.ValueAnimator r6 = r5.f9164J
            android.animation.TimeInterpolator r0 = r5.f9161F
            r6.setInterpolator(r0)
            a.Dg r6 = r5.f9169c
            if (r6 == 0) goto L59
            android.animation.ValueAnimator r0 = r5.f9164J
            r0.addUpdateListener(r6)
        L59:
            android.animation.ValueAnimator r6 = r5.f9164J
            r6.start()
        L5e:
            r1 = r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.m4982G(boolean):boolean");
    }

    /* renamed from: M */
    public final boolean m4983M(View view) {
        int i;
        View view2;
        View view3 = null;
        if (this.f9171f == null && (i = this.f9160E) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(i);
            }
            if (view2 != null) {
                this.f9171f = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f9171f;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final int m4984N() {
        int m4986Q = m4986Q();
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        int m4117P = AbstractC2397t8.m4117P(this);
        if (m4117P == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                m4117P = AbstractC2397t8.m4117P(getChildAt(childCount - 1));
            } else {
                m4117P = 0;
            }
            if (m4117P == 0) {
                return getHeight() / 3;
            }
        }
        return (m4117P * 2) + m4986Q;
    }

    /* renamed from: P */
    public final int m4985P() {
        int i = this.f9163I;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0914RD c0914rd = (C0914RD) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) c0914rd).topMargin + ((LinearLayout.LayoutParams) c0914rd).bottomMargin + childAt.getMeasuredHeight();
                int i4 = c0914rd.f3142z;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    i3 -= AbstractC2397t8.m4117P(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f9163I = max;
        return max;
    }

    /* renamed from: Q */
    public final int m4986Q() {
        C2621xJ c2621xJ = this.f9172g;
        if (c2621xJ != null) {
            return c2621xJ.m4515N();
        }
        return 0;
    }

    /* renamed from: V */
    public final boolean m4987V() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC2397t8.m4124h(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public final void m4988W(boolean z, boolean z2, boolean z3) {
        this.f9174k = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0914RD;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        if (this.f9175p != null && m4986Q() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f9167S);
            this.f9175p.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9175p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0914RD();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0914RD(getContext(), attributeSet);
    }

    /* renamed from: o */
    public final void m4989o() {
        C2768Q c2768q;
        Behavior behavior = this.f9165L;
        if (behavior != null && this.f9166R != -1 && this.f9174k == 0) {
            c2768q = behavior.m4995J(AbstractC2602x.f8020R, this);
        } else {
            c2768q = null;
        }
        this.f9166R = -1;
        this.f9179w = -1;
        this.f9163I = -1;
        if (c2768q != null) {
            Behavior behavior2 = this.f9165L;
            if (behavior2.f9184S == null) {
                behavior2.f9184S = c2768q;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2281qz) {
            AbstractC0795Op.m1811G5(this, (C2281qz) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.f9159C == null) {
            this.f9159C = new int[4];
        }
        int[] iArr = this.f9159C;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f9180y;
        iArr[0] = z ? R.attr.state_liftable : -2130969633;
        iArr[1] = (z && this.f9178s) ? R.attr.state_lifted : -2130969634;
        iArr[2] = z ? R.attr.state_collapsible : -2130969628;
        iArr[3] = (z && this.f9178s) ? R.attr.state_collapsed : -2130969627;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.f9171f;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f9171f = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        boolean z4 = true;
        if (AbstractC2397t8.m4124h(this) && m4987V()) {
            int m4986Q = m4986Q();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(m4986Q);
            }
        }
        m4989o();
        this.f9176q = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C0914RD) getChildAt(i5).getLayoutParams()).f3141v != null) {
                this.f9176q = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.f9175p;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), m4986Q());
        }
        if (!this.f9168U) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount3) {
                    int i7 = ((C0914RD) getChildAt(i6).getLayoutParams()).f3142z;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        z2 = true;
                        break;
                    }
                    i6++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                z4 = false;
            }
        }
        if (this.f9180y != z4) {
            this.f9180y = z4;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (AbstractC2397t8.m4124h(this) && m4987V()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += m4986Q();
                    }
                } else {
                    measuredHeight = AbstractC2575wW.m4408Q(m4986Q() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i2));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        m4989o();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C2281qz) {
            ((C2281qz) background).m3935S(f);
        }
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f9175p;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: u */
    public final int m4990u() {
        int i = this.f9166R;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                C0914RD c0914rd = (C0914RD) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = c0914rd.f3142z;
                if ((i4 & 1) == 0) {
                    break;
                }
                int i5 = measuredHeight + ((LinearLayout.LayoutParams) c0914rd).topMargin + ((LinearLayout.LayoutParams) c0914rd).bottomMargin + i3;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    if (AbstractC2397t8.m4124h(childAt)) {
                        i5 -= m4986Q();
                    }
                }
                i3 = i5;
                if ((i4 & 2) != 0) {
                    WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                    i3 -= AbstractC2397t8.m4117P(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f9166R = max;
        return max;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0050  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m4991v() {
        /*
            r9 = this;
            int r0 = r9.f9179w
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            a.RD r4 = (p000a.C0914RD) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f3142z
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap r4 = p000a.AbstractC2446u3.f7488z
            int r4 = p000a.AbstractC2397t8.m4117P(r3)
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap r4 = p000a.AbstractC2446u3.f7488z
            int r4 = p000a.AbstractC2397t8.m4117P(r3)
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap r6 = p000a.AbstractC2446u3.f7488z
            boolean r3 = p000a.AbstractC2397t8.m4124h(r3)
            if (r3 == 0) goto L61
            int r3 = r9.m4986Q()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f9179w = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.m4991v():int");
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9175p;
    }

    @Override // p000a.InterfaceC1594e0
    /* renamed from: z */
    public final AbstractC1131VA mo3069z() {
        Behavior behavior = new Behavior();
        this.f9165L = behavior;
        return behavior;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C0914RD();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4981h(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0914RD(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m4981h(layoutParams);
    }
}
