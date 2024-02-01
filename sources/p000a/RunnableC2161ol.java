package p000a;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: a.ol */
/* loaded from: classes.dex */
public final class RunnableC2161ol implements Runnable {

    /* renamed from: R */
    public final boolean f6629R;

    /* renamed from: S */
    public final View f6630S;

    /* renamed from: w */
    public final /* synthetic */ SwipeDismissBehavior f6631w;

    public RunnableC2161ol(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f6631w = swipeDismissBehavior;
        this.f6630S = view;
        this.f6629R = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2196pM c2196pM;
        SwipeDismissBehavior swipeDismissBehavior = this.f6631w;
        C0737Nq c0737Nq = swipeDismissBehavior.f9225z;
        View view = this.f6630S;
        if (c0737Nq != null && c0737Nq.m1704u()) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4120S(view, this);
        } else if (this.f6629R && (c2196pM = swipeDismissBehavior.f9221h) != null) {
            c2196pM.m3818U(view);
        }
    }
}
