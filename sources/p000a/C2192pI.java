package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;

/* renamed from: a.pI */
/* loaded from: classes.dex */
public final class C2192pI implements InterfaceC2687yj {

    /* renamed from: E */
    public boolean f6728E;

    /* renamed from: F */
    public RunnableC1387Zz f6729F;

    /* renamed from: I */
    public final LayoutInflater f6731I;

    /* renamed from: J */
    public int f6732J;

    /* renamed from: R */
    public Context f6733R;

    /* renamed from: S */
    public final Context f6734S;

    /* renamed from: U */
    public C2206pY f6735U;

    /* renamed from: X */
    public C0278FI f6736X;

    /* renamed from: Y */
    public int f6737Y;

    /* renamed from: Z */
    public C1073U7 f6738Z;

    /* renamed from: c */
    public boolean f6739c;

    /* renamed from: e */
    public C0278FI f6740e;

    /* renamed from: f */
    public boolean f6741f;

    /* renamed from: p */
    public int f6744p;

    /* renamed from: q */
    public InterfaceC0656MP f6745q;

    /* renamed from: r */
    public int f6746r;

    /* renamed from: s */
    public int f6747s;

    /* renamed from: w */
    public C2189pE f6748w;

    /* renamed from: y */
    public InterfaceC0108C6 f6749y;

    /* renamed from: k */
    public final int f6743k = R.layout.abc_action_menu_layout;

    /* renamed from: g */
    public final int f6742g = R.layout.abc_action_menu_item_layout;

    /* renamed from: H */
    public final SparseBooleanArray f6730H = new SparseBooleanArray();

    /* renamed from: C */
    public final C1073U7 f6727C = new C1073U7(this, 1);

    public C2192pI(Context context) {
        this.f6734S = context;
        this.f6731I = LayoutInflater.from(context);
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: G */
    public final void mo217G(Context context, C2189pE c2189pE) {
        this.f6733R = context;
        LayoutInflater.from(context);
        this.f6748w = c2189pE;
        Resources resources = context.getResources();
        C2196pM c2196pM = new C2196pM(2, context);
        if (!this.f6741f) {
            this.f6728E = true;
        }
        this.f6746r = ((Context) c2196pM.f6755R).getResources().getDisplayMetrics().widthPixels / 2;
        this.f6732J = c2196pM.m3820s();
        int i = this.f6746r;
        if (this.f6728E) {
            if (this.f6735U == null) {
                this.f6735U = new C2206pY(this, this.f6734S);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6735U.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f6735U.getMeasuredWidth();
        } else {
            this.f6735U = null;
        }
        this.f6737Y = i;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: M */
    public final boolean m3806M() {
        C0278FI c0278fi = this.f6740e;
        return c0278fi != null && c0278fi.m1773h();
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: N */
    public final boolean mo218N() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C2189pE c2189pE = this.f6748w;
        if (c2189pE != null) {
            arrayList = c2189pE.m3795V();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.f6732J;
        int i4 = this.f6737Y;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f6749y;
        int i5 = 0;
        boolean z8 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            C1117Uu c1117Uu = (C1117Uu) arrayList.get(i5);
            int i8 = c1117Uu.f3647r;
            if ((i8 & 2) == 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                i6++;
            } else {
                if ((i8 & 1) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i7++;
                } else {
                    z8 = true;
                }
            }
            if (this.f6739c && c1117Uu.f3627H) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f6728E && (z8 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f6730H;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            C1117Uu c1117Uu2 = (C1117Uu) arrayList.get(i10);
            int i12 = c1117Uu2.f3647r;
            if ((i12 & 2) == i2) {
                z2 = z;
            } else {
                z2 = false;
            }
            int i13 = c1117Uu2.f3643h;
            if (z2) {
                View m3808h = m3808h(c1117Uu2, null, viewGroup);
                m3808h.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = m3808h.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                c1117Uu2.m2303u(z);
            } else {
                if ((i12 & 1) == z) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (z3) {
                    boolean z9 = sparseBooleanArray.get(i13);
                    if ((i9 > 0 || z9) && i4 > 0) {
                        z4 = z;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        View m3808h2 = m3808h(c1117Uu2, null, viewGroup);
                        m3808h2.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = m3808h2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        if (i4 + i11 > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z4 &= z5;
                    }
                    if (z4 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z9) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i10; i14++) {
                            C1117Uu c1117Uu3 = (C1117Uu) arrayList.get(i14);
                            if (c1117Uu3.f3643h == i13) {
                                if (c1117Uu3.m2301Q()) {
                                    i9++;
                                }
                                c1117Uu3.m2303u(false);
                            }
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    c1117Uu2.m2303u(z4);
                } else {
                    c1117Uu2.m2303u(false);
                    i10++;
                    i2 = 2;
                    z = true;
                }
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x008f  */
    @Override // p000a.InterfaceC2687yj
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo219P(p000a.SubMenuC1188WE r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            a.pE r2 = r0.f3867Y
            a.pE r3 = r8.f6748w
            if (r2 == r3) goto L13
            r0 = r2
            a.WE r0 = (p000a.SubMenuC1188WE) r0
            goto L9
        L13:
            a.C6 r2 = r8.f6749y
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof p000a.InterfaceC0157D3
            if (r6 == 0) goto L35
            r6 = r5
            a.D3 r6 = (p000a.InterfaceC0157D3) r6
            a.Uu r6 = r6.mo128v()
            a.Uu r7 = r0.f3866J
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            a.Uu r0 = r9.f3866J
            int r0 = r0.f3653z
            r8.f6744p = r0
            int r0 = r9.size()
            r2 = r1
        L47:
            r3 = 1
            if (r2 >= r0) goto L5f
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5c
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5c
            r0 = r3
            goto L60
        L5c:
            int r2 = r2 + 1
            goto L47
        L5f:
            r0 = r1
        L60:
            a.FI r2 = new a.FI
            android.content.Context r4 = r8.f6733R
            r2.<init>(r8, r4, r9, r5)
            r8.f6736X = r2
            r2.f2613o = r0
            a.Va r2 = r2.f2605G
            if (r2 == 0) goto L72
            r2.mo400k(r0)
        L72:
            a.FI r0 = r8.f6736X
            boolean r2 = r0.m1773h()
            if (r2 == 0) goto L7c
        L7a:
            r1 = r3
            goto L85
        L7c:
            android.view.View r2 = r0.f2609Q
            if (r2 != 0) goto L81
            goto L85
        L81:
            r0.m1772P(r1, r1, r1, r1)
            goto L7a
        L85:
            if (r1 == 0) goto L8f
            a.MP r0 = r8.f6745q
            if (r0 == 0) goto L8e
            r0.mo1242v(r9)
        L8e:
            return r3
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2192pI.mo219P(a.WE):boolean");
    }

    /* renamed from: Q */
    public final boolean m3807Q() {
        InterfaceC0108C6 interfaceC0108C6;
        RunnableC1387Zz runnableC1387Zz = this.f6729F;
        if (runnableC1387Zz != null && (interfaceC0108C6 = this.f6749y) != null) {
            ((View) interfaceC0108C6).removeCallbacks(runnableC1387Zz);
            this.f6729F = null;
            return true;
        }
        C0278FI c0278fi = this.f6740e;
        if (c0278fi != null) {
            if (c0278fi.m1773h()) {
                c0278fi.f2605G.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: R */
    public final /* bridge */ /* synthetic */ boolean mo220R(C1117Uu c1117Uu) {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: S */
    public final void mo221S(boolean z) {
        int i;
        boolean z2;
        C1117Uu c1117Uu;
        ViewGroup viewGroup = (ViewGroup) this.f6749y;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            C2189pE c2189pE = this.f6748w;
            if (c2189pE != null) {
                c2189pE.m3796W();
                ArrayList m3795V = this.f6748w.m3795V();
                int size = m3795V.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C1117Uu c1117Uu2 = (C1117Uu) m3795V.get(i2);
                    if (c1117Uu2.m2301Q()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof InterfaceC0157D3) {
                            c1117Uu = ((InterfaceC0157D3) childAt).mo128v();
                        } else {
                            c1117Uu = null;
                        }
                        View m3808h = m3808h(c1117Uu2, childAt, viewGroup);
                        if (c1117Uu2 != c1117Uu) {
                            m3808h.setPressed(false);
                            m3808h.jumpDrawablesToCurrentState();
                        }
                        if (m3808h != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) m3808h.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(m3808h);
                            }
                            ((ViewGroup) this.f6749y).addView(m3808h, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f6735U) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f6749y).requestLayout();
        C2189pE c2189pE2 = this.f6748w;
        if (c2189pE2 != null) {
            c2189pE2.m3796W();
            ArrayList arrayList2 = c2189pE2.f6712W;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC0219EA abstractC0219EA = ((C1117Uu) arrayList2.get(i3)).f3629J;
            }
        }
        C2189pE c2189pE3 = this.f6748w;
        if (c2189pE3 != null) {
            c2189pE3.m3796W();
            arrayList = c2189pE3.f6702G;
        }
        if (this.f6728E && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((C1117Uu) arrayList.get(0)).f3627H;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        C2206pY c2206pY = this.f6735U;
        if (z3) {
            if (c2206pY == null) {
                this.f6735U = new C2206pY(this, this.f6734S);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f6735U.getParent();
            if (viewGroup3 != this.f6749y) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f6735U);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f6749y;
                C2206pY c2206pY2 = this.f6735U;
                actionMenuView.getClass();
                C0601LF c0601lf = new C0601LF();
                ((LinearLayout.LayoutParams) c0601lf).gravity = 16;
                c0601lf.f1929z = true;
                actionMenuView.addView(c2206pY2, c0601lf);
            }
        } else if (c2206pY != null) {
            ViewParent parent = c2206pY.getParent();
            InterfaceC0108C6 interfaceC0108C6 = this.f6749y;
            if (parent == interfaceC0108C6) {
                ((ViewGroup) interfaceC0108C6).removeView(this.f6735U);
            }
        }
        ((ActionMenuView) this.f6749y).f8757C = this.f6728E;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: V */
    public final /* bridge */ /* synthetic */ boolean mo222V(C1117Uu c1117Uu) {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: W */
    public final void mo223W(InterfaceC0656MP interfaceC0656MP) {
        this.f6745q = interfaceC0656MP;
    }

    /* renamed from: h */
    public final View m3808h(C1117Uu c1117Uu, View view, ViewGroup viewGroup) {
        InterfaceC0157D3 interfaceC0157D3;
        View actionView = c1117Uu.getActionView();
        int i = 0;
        if (actionView == null || c1117Uu.m2299N()) {
            if (view instanceof InterfaceC0157D3) {
                interfaceC0157D3 = (InterfaceC0157D3) view;
            } else {
                interfaceC0157D3 = (InterfaceC0157D3) this.f6731I.inflate(this.f6742g, viewGroup, false);
            }
            interfaceC0157D3.mo131z(c1117Uu);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0157D3;
            actionMenuItemView.f8674U = (ActionMenuView) this.f6749y;
            if (this.f6738Z == null) {
                this.f6738Z = new C1073U7(this, 0);
            }
            actionMenuItemView.f8676f = this.f6738Z;
            actionView = (View) interfaceC0157D3;
        }
        if (c1117Uu.f3627H) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m4718S(layoutParams));
        }
        return actionView;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: o */
    public final void mo224o(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C1318Yi) && (i = ((C1318Yi) parcelable).f4180S) > 0 && (findItem = this.f6748w.findItem(i)) != null) {
            mo219P((SubMenuC1188WE) findItem.getSubMenu());
        }
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: u */
    public final Parcelable mo225u() {
        C1318Yi c1318Yi = new C1318Yi();
        c1318Yi.f4180S = this.f6744p;
        return c1318Yi;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: v */
    public final int mo226v() {
        return this.f6747s;
    }

    /* renamed from: w */
    public final boolean m3809w() {
        C2189pE c2189pE;
        int i = 0;
        if (this.f6728E && !m3806M() && (c2189pE = this.f6748w) != null && this.f6749y != null && this.f6729F == null) {
            c2189pE.m3796W();
            if (!c2189pE.f6702G.isEmpty()) {
                RunnableC1387Zz runnableC1387Zz = new RunnableC1387Zz(this, i, new C0278FI(this, this.f6733R, this.f6748w, this.f6735U));
                this.f6729F = runnableC1387Zz;
                ((View) this.f6749y).post(runnableC1387Zz);
                return true;
            }
        }
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: z */
    public final void mo227z(C2189pE c2189pE, boolean z) {
        m3807Q();
        C0278FI c0278fi = this.f6736X;
        if (c0278fi != null && c0278fi.m1773h()) {
            c0278fi.f2605G.dismiss();
        }
        InterfaceC0656MP interfaceC0656MP = this.f6745q;
        if (interfaceC0656MP != null) {
            interfaceC0656MP.mo1243z(c2189pE, z);
        }
    }
}
