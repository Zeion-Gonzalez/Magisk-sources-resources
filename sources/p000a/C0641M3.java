package p000a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: a.M3 */
/* loaded from: classes.dex */
public final class C0641M3 extends AbstractC1978lB {

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f2066h;

    /* renamed from: z */
    public final /* synthetic */ int f2067z;

    public /* synthetic */ C0641M3(RecyclerView recyclerView, int i) {
        this.f2067z = i;
        this.f2066h = recyclerView;
    }

    /* renamed from: z */
    public final void m1434z() {
        boolean z = RecyclerView.f9061hs;
        RecyclerView recyclerView = this.f2066h;
        if (z && recyclerView.f9121p && recyclerView.f9065C) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4120S(recyclerView, recyclerView.f9125s);
        } else {
            recyclerView.f9129x = true;
            recyclerView.requestLayout();
        }
    }
}
