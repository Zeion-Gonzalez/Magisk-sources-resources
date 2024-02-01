package p000a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: a.zu */
/* loaded from: classes.dex */
public abstract class AbstractC2747zu {

    /* renamed from: z */
    public C0872QL f8613z = null;

    /* renamed from: h */
    public final ArrayList f8610h = new ArrayList();

    /* renamed from: v */
    public final long f8612v = 120;

    /* renamed from: P */
    public final long f8608P = 120;

    /* renamed from: N */
    public final long f8607N = 250;

    /* renamed from: Q */
    public final long f8609Q = 250;

    /* renamed from: u */
    public final boolean f8611u = true;

    /* renamed from: h */
    public static void m4678h(AbstractC0249El abstractC0249El) {
        RecyclerView recyclerView;
        int i = abstractC0249El.f848G & 14;
        if (!abstractC0249El.m530u() && (i & 4) == 0 && (recyclerView = abstractC0249El.f860k) != null) {
            recyclerView.m4925Z(abstractC0249El);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0068  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4679v(p000a.AbstractC0249El r10) {
        /*
            r9 = this;
            a.QL r0 = r9.f8613z
            if (r0 == 0) goto L91
            r1 = 1
            r10.m524R(r1)
            a.El r2 = r10.f861o
            r3 = 0
            if (r2 == 0) goto L13
            a.El r2 = r10.f857W
            if (r2 != 0) goto L13
            r10.f861o = r3
        L13:
            r10.f857W = r3
            int r2 = r10.f848G
            r2 = r2 & 16
            r3 = 0
            if (r2 == 0) goto L1e
            r2 = r1
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 != 0) goto L91
            androidx.recyclerview.widget.RecyclerView r0 = r0.f2961z
            r0.m4930dx()
            a.NQ r2 = r0.f9111k
            a.sH r4 = r2.f2392h
            a.QL r5 = r2.f2394z
            int r6 = r2.f2391P
            android.view.View r7 = r10.f866z
            if (r6 != r1) goto L3f
            android.view.View r1 = r2.f2390N
            if (r1 != r7) goto L37
            goto L65
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L3f:
            r8 = 2
            if (r6 == r8) goto L89
            r2.f2391P = r8     // Catch: java.lang.Throwable -> L85
            androidx.recyclerview.widget.RecyclerView r6 = r5.f2961z     // Catch: java.lang.Throwable -> L85
            int r6 = r6.indexOfChild(r7)     // Catch: java.lang.Throwable -> L85
            r8 = -1
            if (r6 != r8) goto L51
            r2.m1651M(r7)     // Catch: java.lang.Throwable -> L85
            goto L60
        L51:
            boolean r8 = r4.m4057P(r6)     // Catch: java.lang.Throwable -> L85
            if (r8 == 0) goto L63
            r4.m4058Q(r6)     // Catch: java.lang.Throwable -> L85
            r2.m1651M(r7)     // Catch: java.lang.Throwable -> L85
            r5.m2007u(r6)     // Catch: java.lang.Throwable -> L85
        L60:
            r2.f2391P = r3
            goto L66
        L63:
            r2.f2391P = r3
        L65:
            r1 = r3
        L66:
            if (r1 == 0) goto L74
            a.El r2 = androidx.recyclerview.widget.RecyclerView.m4894j(r7)
            a.df r4 = r0.f9128w
            r4.m3052S(r2)
            r4.m3046G(r2)
        L74:
            r2 = r1 ^ 1
            r0.m4926ZH(r2)
            if (r1 != 0) goto L91
            boolean r10 = r10.m520M()
            if (r10 == 0) goto L91
            r0.removeDetachedView(r7, r3)
            goto L91
        L85:
            r10 = move-exception
            r2.f2391P = r3
            throw r10
        L89:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC2747zu.m4679v(a.El):void");
    }

    /* renamed from: z */
    public final boolean m4680z(AbstractC0249El abstractC0249El, AbstractC0249El abstractC0249El2, C2402tF c2402tF, C2402tF c2402tF2) {
        int i;
        int i2;
        int i3 = c2402tF.f7338z;
        int i4 = c2402tF.f7336h;
        if (abstractC0249El2.m532w()) {
            int i5 = c2402tF.f7338z;
            i2 = c2402tF.f7336h;
            i = i5;
        } else {
            i = c2402tF2.f7338z;
            i2 = c2402tF2.f7336h;
        }
        C1192WI c1192wi = (C1192WI) this;
        if (abstractC0249El == abstractC0249El2) {
            return c1192wi.m2462P(abstractC0249El, i3, i4, i, i2);
        }
        View view = abstractC0249El.f866z;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        c1192wi.m2464V(abstractC0249El);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        c1192wi.m2464V(abstractC0249El2);
        float f = -((int) ((i - i3) - translationX));
        View view2 = abstractC0249El2.f866z;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        c1192wi.f3873M.add(new C1418ae(abstractC0249El, abstractC0249El2, i3, i4, i, i2));
        return true;
    }
}
