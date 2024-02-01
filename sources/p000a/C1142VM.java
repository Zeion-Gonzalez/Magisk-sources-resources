package p000a;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* renamed from: a.VM */
/* loaded from: classes.dex */
public final class C1142VM extends AbstractC0614LY {

    /* renamed from: i */
    public static final String[] f3719i = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: L */
    public int f3720L;

    public C1142VM() {
        this.f3720L = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x006d, code lost:
    
        if (r9 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0077, code lost:
    
        if (r0.f4408N == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0087, code lost:
    
        if (r0.f4412v == 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0085  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000a.C1401aI m2338n(p000a.C2495v0 r8, p000a.C2495v0 r9) {
        /*
            a.aI r0 = new a.aI
            r0.<init>()
            r1 = 0
            r0.f4413z = r1
            r0.f4411h = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f7632z
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f4412v = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f4408N = r6
            goto L33
        L2f:
            r0.f4412v = r4
            r0.f4408N = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f7632z
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f4409P = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f4410Q = r2
            goto L56
        L52:
            r0.f4409P = r4
            r0.f4410Q = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L7a
            if (r9 == 0) goto L7a
            int r8 = r0.f4412v
            int r9 = r0.f4409P
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f4408N
            android.view.ViewGroup r4 = r0.f4410Q
            if (r3 != r4) goto L68
            goto L8d
        L68:
            if (r8 == r9) goto L70
            if (r8 != 0) goto L6d
            goto L89
        L6d:
            if (r9 != 0) goto L8d
            goto L80
        L70:
            android.view.ViewGroup r8 = r0.f4410Q
            if (r8 != 0) goto L75
            goto L89
        L75:
            android.view.ViewGroup r8 = r0.f4408N
            if (r8 != 0) goto L8d
            goto L80
        L7a:
            if (r8 != 0) goto L83
            int r8 = r0.f4409P
            if (r8 != 0) goto L83
        L80:
            r0.f4411h = r2
            goto L8b
        L83:
            if (r9 != 0) goto L8d
            int r8 = r0.f4412v
            if (r8 != 0) goto L8d
        L89:
            r0.f4411h = r1
        L8b:
            r0.f4413z = r2
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1142VM.m2338n(a.v0, a.v0):a.aI");
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: E */
    public final boolean mo1360E(C2495v0 c2495v0, C2495v0 c2495v02) {
        if ((c2495v0 != null || c2495v02 != null) && (c2495v0 == null || c2495v02 == null || c2495v02.f7632z.containsKey("android:visibility:visibility") == c2495v0.f7632z.containsKey("android:visibility:visibility"))) {
            C1401aI m2338n = m2338n(c2495v0, c2495v02);
            if (m2338n.f4413z && (m2338n.f4412v == 0 || m2338n.f4409P == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: N */
    public final void mo292N(C2495v0 c2495v0) {
        m2340d(c2495v0);
    }

    /* renamed from: O */
    public final ObjectAnimator m2339O(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC0043At.f188z.mo2166M(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AbstractC0043At.f187h, f2);
        ofFloat.addListener(new C0027AV(view));
        mo1385z(new C0107C5(this, 0, view));
        return ofFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0043, code lost:
    
        if (m2338n(m1379k(r3, false), m1369U(r3, false)).f4413z != false) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01ee  */
    @Override // p000a.AbstractC0614LY
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo293R(android.view.ViewGroup r23, p000a.C2495v0 r24, p000a.C2495v0 r25) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1142VM.mo293R(android.view.ViewGroup, a.v0, a.v0):android.animation.Animator");
    }

    /* renamed from: d */
    public final void m2340d(C2495v0 c2495v0) {
        View view = c2495v0.f7630h;
        int visibility = view.getVisibility();
        HashMap hashMap = c2495v0.f7632z;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: o */
    public final void mo295o(C2495v0 c2495v0) {
        m2340d(c2495v0);
        c2495v0.f7632z.put("android:fade:transitionAlpha", Float.valueOf(AbstractC0043At.f188z.mo2165G(c2495v0.f7630h)));
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ String[] mo296s() {
        return f3719i;
    }

    public C1142VM(int i) {
        this.f3720L = 3;
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f3720L = i;
    }
}
