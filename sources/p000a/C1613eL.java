package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.eL */
/* loaded from: classes.dex */
public final class C1613eL extends AnimatorListenerAdapter {

    /* renamed from: N */
    public final /* synthetic */ C2478uj f4944N;

    /* renamed from: P */
    public final /* synthetic */ AbstractC0204Du f4945P;

    /* renamed from: h */
    public final /* synthetic */ View f4946h;

    /* renamed from: v */
    public final /* synthetic */ boolean f4947v;

    /* renamed from: z */
    public final /* synthetic */ C0135Cc f4948z;

    public C1613eL(C0135Cc c0135Cc, View view, boolean z, AbstractC0204Du abstractC0204Du, C2478uj c2478uj) {
        this.f4948z = c0135Cc;
        this.f4946h = view;
        this.f4947v = z;
        this.f4945P = abstractC0204Du;
        this.f4944N = c2478uj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f4948z.f459z;
        View view = this.f4946h;
        viewGroup.endViewTransition(view);
        boolean z = this.f4947v;
        AbstractC0204Du abstractC0204Du = this.f4945P;
        if (z) {
            AbstractC2441tz.m4209z(abstractC0204Du.f621z, view);
        }
        this.f4944N.m446v();
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Animator from operation " + abstractC0204Du + " has ended.");
        }
    }
}
