package p000a;

import java.util.WeakHashMap;

/* renamed from: a.Kj */
/* loaded from: classes.dex */
public final class RunnableC0572Kj implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ C0660MU f1853R;

    /* renamed from: S */
    public final /* synthetic */ int f1854S;

    public /* synthetic */ RunnableC0572Kj(C0660MU c0660mu, int i) {
        this.f1854S = i;
        this.f1853R = c0660mu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1854S;
        C0660MU c0660mu = this.f1853R;
        switch (i) {
            case 1:
                C2409tO c2409tO = c0660mu.f2145w;
                if (c2409tO != null) {
                    c2409tO.f7365y = true;
                    c2409tO.requestLayout();
                    return;
                }
                return;
            default:
                C2409tO c2409tO2 = c0660mu.f2145w;
                if (c2409tO2 != null) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    if (AbstractC1285Y3.m2633h(c2409tO2) && c0660mu.f2145w.getCount() > c0660mu.f2145w.getChildCount() && c0660mu.f2145w.getChildCount() <= c0660mu.f2143r) {
                        c0660mu.f2138i.setInputMethodMode(2);
                        c0660mu.mo396Q();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
