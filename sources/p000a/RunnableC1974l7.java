package p000a;

import androidx.appcompat.widget.SearchView;

/* renamed from: a.l7 */
/* loaded from: classes.dex */
public final class RunnableC1974l7 implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ SearchView f6115R;

    /* renamed from: S */
    public final /* synthetic */ int f6116S;

    public /* synthetic */ RunnableC1974l7(SearchView searchView, int i) {
        this.f6116S = i;
        this.f6115R = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6116S;
        SearchView searchView = this.f6115R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                searchView.m4728q();
                return;
            default:
                searchView.getClass();
                return;
        }
    }
}
