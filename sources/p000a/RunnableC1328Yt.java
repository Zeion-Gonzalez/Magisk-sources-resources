package p000a;

import androidx.appcompat.widget.C2755N;
import androidx.appcompat.widget.Toolbar;

/* renamed from: a.Yt */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1328Yt implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ Toolbar f4212R;

    /* renamed from: S */
    public final /* synthetic */ int f4213S;

    public /* synthetic */ RunnableC1328Yt(Toolbar toolbar, int i) {
        this.f4213S = i;
        this.f4212R = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1117Uu c1117Uu;
        int i = this.f4213S;
        Toolbar toolbar = this.f4212R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                toolbar.m4756w();
                return;
            default:
                C2755N c2755n = toolbar.f8825HL;
                if (c2755n == null) {
                    c1117Uu = null;
                } else {
                    c1117Uu = c2755n.f8781R;
                }
                if (c1117Uu != null) {
                    c1117Uu.collapseActionView();
                    return;
                }
                return;
        }
    }
}
