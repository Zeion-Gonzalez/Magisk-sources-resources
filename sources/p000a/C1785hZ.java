package p000a;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: a.hZ */
/* loaded from: classes.dex */
public final class C1785hZ implements AbsListView.OnScrollListener {

    /* renamed from: z */
    public final /* synthetic */ C0660MU f5606z;

    public C1785hZ(C0660MU c0660mu) {
        this.f5606z = c0660mu;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        boolean z = true;
        if (i == 1) {
            C0660MU c0660mu = this.f5606z;
            if (c0660mu.f2138i.getInputMethodMode() != 2) {
                z = false;
            }
            if (!z && c0660mu.f2138i.getContentView() != null) {
                Handler handler = c0660mu.f2121C;
                RunnableC0572Kj runnableC0572Kj = c0660mu.f2135e;
                handler.removeCallbacks(runnableC0572Kj);
                runnableC0572Kj.run();
            }
        }
    }
}
