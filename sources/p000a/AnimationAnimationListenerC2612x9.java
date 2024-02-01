package p000a;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* renamed from: a.x9 */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC2612x9 implements Animation.AnimationListener {

    /* renamed from: P */
    public final /* synthetic */ C2478uj f8078P;

    /* renamed from: h */
    public final /* synthetic */ C0135Cc f8079h;

    /* renamed from: v */
    public final /* synthetic */ View f8080v;

    /* renamed from: z */
    public final /* synthetic */ AbstractC0204Du f8081z;

    public AnimationAnimationListenerC2612x9(View view, C2478uj c2478uj, C0135Cc c0135Cc, AbstractC0204Du abstractC0204Du) {
        this.f8081z = abstractC0204Du;
        this.f8079h = c0135Cc;
        this.f8080v = view;
        this.f8078P = c2478uj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C0135Cc c0135Cc = this.f8079h;
        c0135Cc.f459z.post(new RunnableC1247XH(c0135Cc, this.f8080v, this.f8078P));
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f8081z + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f8081z + " has reached onAnimationStart.");
        }
    }
}
