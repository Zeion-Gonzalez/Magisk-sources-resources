package p000a;

import android.transition.Transition;

/* renamed from: a.dZ */
/* loaded from: classes.dex */
public final class C1572dZ implements Transition.TransitionListener {

    /* renamed from: z */
    public final /* synthetic */ Runnable f4839z;

    public C1572dZ(RunnableC1547d8 runnableC1547d8) {
        this.f4839z = runnableC1547d8;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f4839z.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
