package p000a;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: a.NV */
/* loaded from: classes.dex */
public final class C0717NV extends AbstractC1843ih {

    /* renamed from: g */
    public final /* synthetic */ BottomSheetBehavior f2412g;

    public C0717NV(BottomSheetBehavior bottomSheetBehavior) {
        this.f2412g = bottomSheetBehavior;
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: R */
    public final int mo1673R(View view, int i) {
        return AbstractC2575wW.m4408Q(i, this.f2412g.m5020r(), mo1676n());
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: S */
    public final int mo1674S(View view, int i) {
        return view.getLeft();
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: Yd */
    public final void mo1675Yd(View view, int i, int i2) {
        this.f2412g.m5009U(i2);
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: n */
    public final int mo1676n() {
        BottomSheetBehavior bottomSheetBehavior = this.f2412g;
        if (bottomSheetBehavior.f9270p) {
            return bottomSheetBehavior.f9236K;
        }
        return bottomSheetBehavior.f9252Z;
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: nB */
    public final boolean mo1677nB(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f2412g;
        int i2 = bottomSheetBehavior.f9260i;
        if (i2 == 1 || bottomSheetBehavior.f9272qn) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f9267nP == i) {
            WeakReference weakReference = bottomSheetBehavior.f9264m;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.f9228D;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: nP */
    public final void mo1678nP(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f2412g;
            if (bottomSheetBehavior.f9237L) {
                bottomSheetBehavior.m5005F(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (java.lang.Math.abs(r5.getTop() - r3.m5020r()) < java.lang.Math.abs(r5.getTop() - r3.f9249X)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (java.lang.Math.abs(r6 - r3.f9249X) < java.lang.Math.abs(r6 - r3.f9252Z)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        if (java.lang.Math.abs(r6 - r3.f9256e) < java.lang.Math.abs(r6 - r3.f9252Z)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        if (r6 < java.lang.Math.abs(r6 - r3.f9252Z)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
    
        if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r3.f9252Z)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r6 > r3.f9249X) goto L53;
     */
    @Override // p000a.AbstractC1843ih
    /* renamed from: qn */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1679qn(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r4.f2412g
            if (r1 >= 0) goto L1b
            boolean r6 = r3.f9259h
            if (r6 == 0) goto Le
            goto Lc4
        Le:
            int r6 = r5.getTop()
            java.lang.System.currentTimeMillis()
            int r7 = r3.f9249X
            if (r6 <= r7) goto Lc4
            goto Ld5
        L1b:
            boolean r1 = r3.f9270p
            if (r1 == 0) goto L70
            boolean r1 = r3.m5012Z(r5, r7)
            if (r1 == 0) goto L70
            float r6 = java.lang.Math.abs(r6)
            float r0 = java.lang.Math.abs(r7)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L38
            int r6 = r3.f9241P
            float r6 = (float) r6
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 > 0) goto L4c
        L38:
            int r6 = r5.getTop()
            int r7 = r3.f9236K
            int r0 = r3.m5020r()
            int r0 = r0 + r7
            int r0 = r0 / 2
            if (r6 <= r0) goto L49
            r6 = r2
            goto L4a
        L49:
            r6 = 0
        L4a:
            if (r6 == 0) goto L4f
        L4c:
            r6 = 5
            goto Ld8
        L4f:
            boolean r6 = r3.f9259h
            if (r6 == 0) goto L55
            goto Lc4
        L55:
            int r6 = r5.getTop()
            int r7 = r3.m5020r()
            int r6 = r6 - r7
            int r6 = java.lang.Math.abs(r6)
            int r7 = r5.getTop()
            int r0 = r3.f9249X
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto Ld5
            goto Lc4
        L70:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L9c
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L81
            goto L9c
        L81:
            boolean r6 = r3.f9259h
            if (r6 == 0) goto L86
            goto Ld7
        L86:
            int r6 = r5.getTop()
            int r7 = r3.f9249X
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.f9252Z
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
            goto Ld5
        L9c:
            int r6 = r5.getTop()
            boolean r7 = r3.f9259h
            if (r7 == 0) goto Lb6
            int r7 = r3.f9256e
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.f9252Z
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
            goto Lc4
        Lb6:
            int r7 = r3.f9249X
            if (r6 >= r7) goto Lc6
            int r7 = r3.f9252Z
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto Ld5
        Lc4:
            r6 = 3
            goto Ld8
        Lc6:
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.f9252Z
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
        Ld5:
            r6 = 6
            goto Ld8
        Ld7:
            r6 = 4
        Ld8:
            r3.getClass()
            r3.m5004C(r5, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0717NV.mo1679qn(android.view.View, float, float):void");
    }
}
