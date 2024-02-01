package p000a;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: a.Ri */
/* loaded from: classes.dex */
public final class C0942Ri implements Transition.TransitionListener {

    /* renamed from: N */
    public final /* synthetic */ Object f3230N;

    /* renamed from: Q */
    public final /* synthetic */ ArrayList f3232Q;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f3233h;

    /* renamed from: u */
    public final /* synthetic */ C0079BW f3234u;

    /* renamed from: z */
    public final /* synthetic */ Object f3236z;

    /* renamed from: v */
    public final /* synthetic */ Object f3235v = null;

    /* renamed from: P */
    public final /* synthetic */ ArrayList f3231P = null;

    public C0942Ri(C0079BW c0079bw, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3234u = c0079bw;
        this.f3236z = obj;
        this.f3233h = arrayList;
        this.f3230N = obj2;
        this.f3232Q = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C0079BW c0079bw = this.f3234u;
        Object obj = this.f3236z;
        if (obj != null) {
            c0079bw.m177y(obj, this.f3233h, null);
        }
        Object obj2 = this.f3235v;
        if (obj2 != null) {
            c0079bw.m177y(obj2, this.f3231P, null);
        }
        Object obj3 = this.f3230N;
        if (obj3 != null) {
            c0079bw.m177y(obj3, this.f3232Q, null);
        }
    }
}
