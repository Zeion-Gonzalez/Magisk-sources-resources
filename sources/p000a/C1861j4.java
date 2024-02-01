package p000a;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: a.j4 */
/* loaded from: classes.dex */
public final class C1861j4 implements Transition.TransitionListener {

    /* renamed from: h */
    public final /* synthetic */ ArrayList f5818h;

    /* renamed from: z */
    public final /* synthetic */ View f5819z;

    public C1861j4(View view, ArrayList arrayList) {
        this.f5819z = view;
        this.f5818h = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f5819z.setVisibility(8);
        ArrayList arrayList = this.f5818h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
