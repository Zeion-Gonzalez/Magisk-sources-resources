package p000a;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: a.aF */
/* loaded from: classes.dex */
public final class C1399aF extends AbstractC1843ih {

    /* renamed from: g */
    public int f4403g;

    /* renamed from: s */
    public final /* synthetic */ SwipeDismissBehavior f4404s;

    /* renamed from: y */
    public int f4405y = -1;

    public C1399aF(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4404s = swipeDismissBehavior;
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: O */
    public final int mo2818O(View view) {
        return view.getWidth();
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: R */
    public final int mo1673R(View view, int i) {
        return view.getTop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r0 != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        r0 = r3.f4403g;
        r4 = r4.getWidth() + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r0 = r3.f4403g - r4.getWidth();
        r4 = r3.f4403g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r0 != false) goto L13;
     */
    @Override // p000a.AbstractC1843ih
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo1674S(android.view.View r4, int r5) {
        /*
            r3 = this;
            java.util.WeakHashMap r0 = p000a.AbstractC2446u3.f7488z
            int r0 = p000a.AbstractC0095Bq.m199P(r4)
            r1 = 1
            if (r0 != r1) goto Lb
            r0 = r1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.f4404s
            int r2 = r2.f9217N
            if (r2 != 0) goto L15
            if (r0 == 0) goto L19
            goto L21
        L15:
            if (r2 != r1) goto L2b
            if (r0 == 0) goto L21
        L19:
            int r0 = r3.f4403g
            int r4 = r4.getWidth()
            int r4 = r4 + r0
            goto L39
        L21:
            int r0 = r3.f4403g
            int r4 = r4.getWidth()
            int r0 = r0 - r4
            int r4 = r3.f4403g
            goto L39
        L2b:
            int r0 = r3.f4403g
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r3.f4403g
            int r4 = r4.getWidth()
            int r4 = r4 + r1
        L39:
            int r5 = java.lang.Math.max(r0, r5)
            int r4 = java.lang.Math.min(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1399aF.mo1674S(android.view.View, int):int");
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: Yd */
    public final void mo1675Yd(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4404s;
        float f = width * swipeDismissBehavior.f9223u;
        float width2 = view.getWidth() * swipeDismissBehavior.f9222o;
        float abs = Math.abs(i - this.f4403g);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: b */
    public final void mo2819b(View view, int i) {
        this.f4405y = i;
        this.f4403g = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4404s;
            swipeDismissBehavior.f9218P = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f9218P = false;
        }
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: nB */
    public final boolean mo1677nB(View view, int i) {
        int i2 = this.f4405y;
        return (i2 == -1 || i2 == i) && this.f4404s.mo5002g(view);
    }

    @Override // p000a.AbstractC1843ih
    /* renamed from: nP */
    public final void mo1678nP(int i) {
        C2196pM c2196pM = this.f4404s.f9221h;
        if (c2196pM != null) {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    C2671yR.m4574h().m4576P(((AbstractC2691yn) c2196pM.f6755R).f8400U);
                    return;
                }
                return;
            }
            C2671yR m4574h = C2671yR.m4574h();
            C0506JZ c0506jz = ((AbstractC2691yn) c2196pM.f6755R).f8400U;
            synchronized (m4574h.f8322z) {
                if (m4574h.m4579v(c0506jz)) {
                    C1848im c1848im = m4574h.f8321v;
                    if (c1848im.f5771v) {
                        c1848im.f5771v = false;
                        m4574h.m4577Q(c1848im);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f4403g) >= java.lang.Math.round(r9.getWidth() * r3.f9219Q)) goto L27;
     */
    @Override // p000a.AbstractC1843ih
    /* renamed from: qn */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo1679qn(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f4405y = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f4404s
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = p000a.AbstractC2446u3.f7488z
            int r5 = p000a.AbstractC0095Bq.m199P(r9)
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f9217N
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L54
            goto L52
        L2a:
            if (r1 <= 0) goto L54
            goto L52
        L2d:
            if (r6 != r2) goto L54
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L54
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L54
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f4403g
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f9219Q
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L54
        L52:
            r1 = r2
            goto L55
        L54:
            r1 = r4
        L55:
            if (r1 == 0) goto L6b
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L66
            int r10 = r9.getLeft()
            int r0 = r8.f4403g
            if (r10 >= r0) goto L64
            goto L66
        L64:
            int r0 = r0 + r11
            goto L6e
        L66:
            int r10 = r8.f4403g
            int r0 = r10 - r11
            goto L6e
        L6b:
            int r0 = r8.f4403g
            r2 = r4
        L6e:
            a.Nq r10 = r3.f9225z
            int r11 = r9.getTop()
            boolean r10 = r10.m1703q(r0, r11)
            if (r10 == 0) goto L85
            a.ol r10 = new a.ol
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = p000a.AbstractC2446u3.f7488z
            p000a.AbstractC2397t8.m4120S(r9, r10)
            goto L8e
        L85:
            if (r2 == 0) goto L8e
            a.pM r10 = r3.f9221h
            if (r10 == 0) goto L8e
            r10.m3818U(r9)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1399aF.mo1679qn(android.view.View, float, float):void");
    }
}
