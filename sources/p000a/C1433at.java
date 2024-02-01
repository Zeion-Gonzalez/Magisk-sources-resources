package p000a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: a.at */
/* loaded from: classes.dex */
public final class C1433at extends AbstractC1843ih {

    /* renamed from: g */
    public final /* synthetic */ SideSheetBehavior f4489g;

    public C1433at(SideSheetBehavior sideSheetBehavior) {
        this.f4489g = sideSheetBehavior;
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: O */
    public final int mo2818O(View view) {
        SideSheetBehavior sideSheetBehavior = this.f4489g;
        return sideSheetBehavior.f9402V + sideSheetBehavior.f9412w;
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: R */
    public final int mo1673R(View view, int i) {
        return view.getTop();
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: S */
    public final int mo1674S(View view, int i) {
        int m4045d3;
        int i2;
        SideSheetBehavior sideSheetBehavior = this.f4489g;
        C2351sF c2351sF = sideSheetBehavior.f9414z;
        switch (c2351sF.f7242R) {
            case AbstractC0795Op.f2698E /* 0 */:
                m4045d3 = -c2351sF.f7243w.f9402V;
                break;
            default:
                m4045d3 = c2351sF.m4045d3();
                break;
        }
        C2351sF c2351sF2 = sideSheetBehavior.f9414z;
        int i3 = c2351sF2.f7242R;
        SideSheetBehavior sideSheetBehavior2 = c2351sF2.f7243w;
        switch (i3) {
            case AbstractC0795Op.f2698E /* 0 */:
                i2 = sideSheetBehavior2.f9412w;
                break;
            default:
                i2 = sideSheetBehavior2.f9400S;
                break;
        }
        return AbstractC2575wW.m4408Q(i, m4045d3, i2);
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: Yd */
    public final void mo1675Yd(View view, int i, int i2) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f4489g;
        WeakReference weakReference = sideSheetBehavior.f9408q;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            C2351sF c2351sF = sideSheetBehavior.f9414z;
            int left = view.getLeft();
            int right = view.getRight();
            int i3 = c2351sF.f7242R;
            SideSheetBehavior sideSheetBehavior2 = c2351sF.f7243w;
            switch (i3) {
                case AbstractC0795Op.f2698E /* 0 */:
                    if (left <= sideSheetBehavior2.f9400S) {
                        marginLayoutParams.leftMargin = right;
                        break;
                    }
                    break;
                default:
                    int i4 = sideSheetBehavior2.f9400S;
                    if (left <= i4) {
                        marginLayoutParams.rightMargin = i4 - left;
                        break;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f9409s;
        if (!linkedHashSet.isEmpty()) {
            sideSheetBehavior.f9414z.m4046nB(i);
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                AbstractC2441tz.m4202q(it.next());
                throw null;
            }
        }
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: nB */
    public final boolean mo1677nB(View view, int i) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f4489g;
        if (sideSheetBehavior.f9407o == 1 || (weakReference = sideSheetBehavior.f9394I) == null || weakReference.get() != view) {
            return false;
        }
        return true;
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: nP */
    public final void mo1678nP(int i) {
        if (i == 1) {
            SideSheetBehavior sideSheetBehavior = this.f4489g;
            if (sideSheetBehavior.f9410u) {
                sideSheetBehavior.m5069y(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0.f9414z.m4042Rh(r4) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (java.lang.Math.abs(r5 - r0.f9414z.m4045d3()) < java.lang.Math.abs(r5 - r0.f9414z.m4048yF())) goto L21;
     */
    @Override // p000a.AbstractC1843ih
    /* renamed from: qn */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1679qn(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.f4489g
            a.sF r1 = r0.f9414z
            boolean r1 = r1.m4039Fu(r5)
            r2 = 1
            if (r1 == 0) goto Lc
            goto L58
        Lc:
            a.sF r1 = r0.f9414z
            boolean r1 = r1.m4044T0(r4, r5)
            if (r1 == 0) goto L25
            a.sF r1 = r0.f9414z
            boolean r5 = r1.m4040M6(r5, r6)
            if (r5 != 0) goto L5a
            a.sF r5 = r0.f9414z
            boolean r5 = r5.m4042Rh(r4)
            if (r5 == 0) goto L58
            goto L5a
        L25:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L3b
            float r5 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.abs(r6)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L38
            r5 = r2
            goto L39
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L5a
        L3b:
            int r5 = r4.getLeft()
            a.sF r6 = r0.f9414z
            int r6 = r6.m4045d3()
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            a.sF r1 = r0.f9414z
            int r1 = r1.m4048yF()
            int r5 = r5 - r1
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L5a
        L58:
            r5 = 3
            goto L5b
        L5a:
            r5 = 5
        L5b:
            r0.m5068s(r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1433at.mo1679qn(android.view.View, float, float):void");
    }
}
