package p000a;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.sU */
/* loaded from: classes.dex */
public final class RunnableC2365sU implements Runnable {

    /* renamed from: I */
    public final /* synthetic */ ArrayList f7262I;

    /* renamed from: R */
    public final /* synthetic */ ArrayList f7263R;

    /* renamed from: S */
    public final /* synthetic */ int f7264S;

    /* renamed from: q */
    public final /* synthetic */ ArrayList f7265q;

    /* renamed from: w */
    public final /* synthetic */ ArrayList f7266w;

    public RunnableC2365sU(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f7264S = i;
        this.f7263R = arrayList;
        this.f7266w = arrayList2;
        this.f7262I = arrayList3;
        this.f7265q = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f7264S; i++) {
            View view = (View) this.f7263R.get(i);
            String str = (String) this.f7266w.get(i);
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC1548d9.m3003U(view, str);
            AbstractC1548d9.m3003U((View) this.f7262I.get(i), (String) this.f7265q.get(i));
        }
    }
}
