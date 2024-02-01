package p000a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.AK */
/* loaded from: classes.dex */
public final class C0018AK implements InterfaceC0910R9 {

    /* renamed from: H */
    public static final C1124V2 f109H = new C1124V2();

    /* renamed from: E */
    public int f110E;

    /* renamed from: I */
    public final int f111I;

    /* renamed from: J */
    public int f112J;

    /* renamed from: R */
    public final int f113R;

    /* renamed from: S */
    public final View f114S;

    /* renamed from: U */
    public int f115U;

    /* renamed from: Y */
    public int f116Y;

    /* renamed from: c */
    public C2621xJ f117c;

    /* renamed from: f */
    public int f118f;

    /* renamed from: g */
    public final int f119g;

    /* renamed from: k */
    public final int f120k;

    /* renamed from: q */
    public final int f121q;

    /* renamed from: r */
    public int f122r;

    /* renamed from: s */
    public boolean f123s;

    /* renamed from: w */
    public final int f124w;

    /* renamed from: y */
    public final int f125y;

    public C0018AK(View view, int i, int i2, int i3) {
        this.f114S = view;
        this.f113R = i;
        this.f124w = i2;
        this.f111I = i3;
        this.f121q = view.getPaddingLeft();
        this.f120k = view.getPaddingTop();
        this.f119g = view.getPaddingRight();
        this.f125y = view.getPaddingBottom();
    }

    @Override // p000a.InterfaceC0910R9
    /* renamed from: P */
    public final C2621xJ mo47P(View view, C2621xJ c2621xJ) {
        C2739zj mo3643G;
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int i7;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        int i8;
        if (AbstractC1292YB.m2695u(this.f117c, c2621xJ)) {
            return c2621xJ;
        }
        this.f117c = c2621xJ;
        C2194pK c2194pK = c2621xJ.f8107z;
        View view2 = this.f114S;
        int i9 = this.f113R;
        if (i9 != 0) {
            Rect rect = new Rect(this.f121q, this.f120k, this.f119g, this.f125y);
            m48z(c2194pK.mo3643G(), i9, new C2322rh(rect));
            view2.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        int i10 = this.f124w;
        if (i10 != 0) {
            if (!this.f123s) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = null;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                int i11 = 0;
                if (marginLayoutParams != null) {
                    i4 = marginLayoutParams.leftMargin;
                } else {
                    i4 = 0;
                }
                this.f115U = i4;
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    marginLayoutParams2 = null;
                }
                if (marginLayoutParams2 != null) {
                    i5 = marginLayoutParams2.topMargin;
                } else {
                    i5 = 0;
                }
                this.f110E = i5;
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                } else {
                    marginLayoutParams3 = null;
                }
                if (marginLayoutParams3 != null) {
                    i6 = marginLayoutParams3.rightMargin;
                } else {
                    i6 = 0;
                }
                this.f118f = i6;
                ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                } else {
                    marginLayoutParams4 = null;
                }
                if (marginLayoutParams4 != null) {
                    i7 = marginLayoutParams4.bottomMargin;
                } else {
                    i7 = 0;
                }
                this.f122r = i7;
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                } else {
                    marginLayoutParams5 = null;
                }
                if (marginLayoutParams5 != null) {
                    i8 = marginLayoutParams5.getMarginStart();
                } else {
                    i8 = 0;
                }
                this.f116Y = i8;
                ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
                if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                }
                if (marginLayoutParams6 != null) {
                    i11 = marginLayoutParams6.getMarginEnd();
                }
                this.f112J = i11;
                this.f123s = true;
            }
            int i12 = i10 & 8388608;
            if (i12 == 8388608) {
                i = this.f115U;
                i2 = this.f110E;
                i3 = this.f118f;
            } else {
                i = this.f116Y;
                i2 = this.f110E;
                i3 = this.f112J;
            }
            Rect rect2 = new Rect(i, i2, i3, this.f122r);
            m48z(c2194pK.mo3643G(), i10, new C2322rh(rect2));
            ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
            if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
                marginLayoutParams7.topMargin = rect2.top;
                marginLayoutParams7.bottomMargin = rect2.bottom;
                if (i12 == 8388608) {
                    marginLayoutParams7.setMarginStart(rect2.left);
                    marginLayoutParams7.setMarginEnd(rect2.right);
                } else {
                    marginLayoutParams7.leftMargin = rect2.left;
                    marginLayoutParams7.rightMargin = rect2.right;
                }
                view2.setLayoutParams(layoutParams7);
            }
        }
        int i13 = this.f111I;
        if (i13 != 0) {
            mo3643G = (C2739zj) m48z(c2194pK.mo3643G(), i13, new C1452bF());
        } else {
            mo3643G = c2194pK.mo3643G();
        }
        C2196pM c2196pM = new C2196pM(c2621xJ);
        ((AbstractC1522cj) c2196pM.f6755R).mo2380u(mo3643G);
        return c2196pM.m3817R();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x004d, code lost:
    
        if (r7 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0051, code lost:
    
        if (r1 != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x005f, code lost:
    
        if ((r17 & 5) == 5) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0061, code lost:
    
        r2 = true;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m48z(p000a.C2739zj r16, int r17, p000a.InterfaceC1029TJ r18) {
        /*
            r15 = this;
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r17 & r0
            r2 = 0
            r3 = 1
            if (r1 != r0) goto Lb
            r0 = r15
            r1 = r3
            goto Ld
        Lb:
            r0 = r15
            r1 = r2
        Ld:
            android.view.View r4 = r0.f114S
            int r4 = r4.getLayoutDirection()
            if (r4 != r3) goto L17
            r4 = r3
            goto L18
        L17:
            r4 = r2
        L18:
            r5 = r17 & 48
            r6 = 48
            if (r5 != r6) goto L20
            r5 = r3
            goto L21
        L20:
            r5 = r2
        L21:
            r6 = r17 & 80
            r7 = 80
            if (r6 != r7) goto L29
            r6 = r3
            goto L2a
        L29:
            r6 = r2
        L2a:
            if (r1 == 0) goto L54
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r7 = r17 & r1
            if (r7 != r1) goto L35
            r1 = r3
            goto L36
        L35:
            r1 = r2
        L36:
            r7 = 8388613(0x800005, float:1.175495E-38)
            r8 = r17 & r7
            if (r8 != r7) goto L3f
            r7 = r3
            goto L40
        L3f:
            r7 = r2
        L40:
            if (r4 != 0) goto L44
            if (r1 != 0) goto L48
        L44:
            if (r4 == 0) goto L4a
            if (r7 == 0) goto L4a
        L48:
            r8 = r3
            goto L4b
        L4a:
            r8 = r2
        L4b:
            if (r4 != 0) goto L4f
            if (r7 != 0) goto L61
        L4f:
            if (r4 == 0) goto L62
            if (r1 == 0) goto L62
            goto L61
        L54:
            r1 = r17 & 3
            r4 = 3
            if (r1 != r4) goto L5b
            r8 = r3
            goto L5c
        L5b:
            r8 = r2
        L5c:
            r1 = 5
            r4 = r17 & 5
            if (r4 != r1) goto L62
        L61:
            r2 = r3
        L62:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            r9 = r18
            r10 = r16
            java.lang.Object r1 = r9.mo2202Q(r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0018AK.m48z(a.zj, int, a.TJ):java.lang.Object");
    }
}
