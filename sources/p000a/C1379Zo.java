package p000a;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: a.Zo */
/* loaded from: classes.dex */
public final class C1379Zo implements InterfaceC0656MP, InterfaceC0148Cs {

    /* renamed from: R */
    public final Object f4310R;

    /* renamed from: S */
    public boolean f4311S;

    public C1379Zo(C2003lg c2003lg) {
        this.f4310R = c2003lg;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    @Override // p000a.InterfaceC0148Cs
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C2621xJ mo306G(android.view.View r11, p000a.C2621xJ r12, p000a.C2402tF r13) {
        /*
            r10 = this;
            r0 = 7
            a.zj r0 = r12.m4520z(r0)
            r1 = 32
            a.zj r1 = r12.m4520z(r1)
            java.lang.Object r2 = r10.f4310R
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r3 = r0.f8592h
            r2.f9229E = r3
            boolean r3 = p000a.AbstractC0795Op.m1842d(r11)
            int r4 = r11.getPaddingBottom()
            int r5 = r11.getPaddingLeft()
            int r6 = r11.getPaddingRight()
            boolean r7 = r2.f9278w
            if (r7 == 0) goto L30
            int r4 = r12.m4517h()
            r2.f9246U = r4
            int r7 = r13.f7335P
            int r4 = r4 + r7
        L30:
            boolean r7 = r2.f9234I
            int r8 = r0.f8594z
            if (r7 == 0) goto L3e
            if (r3 == 0) goto L3b
            int r5 = r13.f7337v
            goto L3d
        L3b:
            int r5 = r13.f7338z
        L3d:
            int r5 = r5 + r8
        L3e:
            boolean r7 = r2.f9271q
            int r9 = r0.f8593v
            if (r7 == 0) goto L4d
            if (r3 == 0) goto L49
            int r13 = r13.f7338z
            goto L4b
        L49:
            int r13 = r13.f7337v
        L4b:
            int r6 = r13 + r9
        L4d:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            boolean r3 = r2.f9258g
            r7 = 1
            if (r3 == 0) goto L60
            int r3 = r13.leftMargin
            if (r3 == r8) goto L60
            r13.leftMargin = r8
            r3 = r7
            goto L61
        L60:
            r3 = 0
        L61:
            boolean r8 = r2.f9280y
            if (r8 == 0) goto L6c
            int r8 = r13.rightMargin
            if (r8 == r9) goto L6c
            r13.rightMargin = r9
            r3 = r7
        L6c:
            boolean r8 = r2.f9274s
            if (r8 == 0) goto L79
            int r8 = r13.topMargin
            int r0 = r0.f8592h
            if (r8 == r0) goto L79
            r13.topMargin = r0
            goto L7a
        L79:
            r7 = r3
        L7a:
            if (r7 == 0) goto L7f
            r11.setLayoutParams(r13)
        L7f:
            int r13 = r11.getPaddingTop()
            r11.setPadding(r5, r13, r6, r4)
            boolean r11 = r10.f4311S
            if (r11 == 0) goto L8e
            int r13 = r1.f8591P
            r2.f9244S = r13
        L8e:
            boolean r13 = r2.f9278w
            if (r13 != 0) goto L94
            if (r11 == 0) goto L97
        L94:
            r2.m5017i()
        L97:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1379Zo.mo306G(android.view.View, a.xJ, a.tF):a.xJ");
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: v */
    public final boolean mo1242v(C2189pE c2189pE) {
        ((C2003lg) this.f4310R).f6227v.onMenuOpened(108, c2189pE);
        return true;
    }

    @Override // p000a.InterfaceC0656MP
    /* renamed from: z */
    public final void mo1243z(C2189pE c2189pE, boolean z) {
        C2192pI c2192pI;
        if (this.f4311S) {
            return;
        }
        this.f4311S = true;
        C2003lg c2003lg = (C2003lg) this.f4310R;
        ActionMenuView actionMenuView = c2003lg.f6224h.f7482z.f8832S;
        if (actionMenuView != null && (c2192pI = actionMenuView.f8767p) != null) {
            c2192pI.m3807Q();
            C0278FI c0278fi = c2192pI.f6736X;
            if (c0278fi != null && c0278fi.m1773h()) {
                c0278fi.f2605G.dismiss();
            }
        }
        c2003lg.f6227v.onPanelClosed(108, c2189pE);
        this.f4311S = false;
    }

    public C1379Zo(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f4310R = bottomSheetBehavior;
        this.f4311S = z;
    }

    public C1379Zo(String str, boolean z) {
        this.f4311S = z;
        this.f4310R = str;
    }
}
