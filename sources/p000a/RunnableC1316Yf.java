package p000a;

import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: a.Yf */
/* loaded from: classes.dex */
public final class RunnableC1316Yf implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ ViewGroup f4178R;

    /* renamed from: S */
    public final /* synthetic */ int f4179S;

    public /* synthetic */ RunnableC1316Yf(ViewGroup viewGroup, int i) {
        this.f4179S = i;
        this.f4178R = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2192pI c2192pI;
        int i = this.f4179S;
        ViewGroup viewGroup = this.f4178R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2409tO c2409tO = (C2409tO) viewGroup;
                c2409tO.f7359f = null;
                c2409tO.drawableStateChanged();
                return;
            default:
                ActionMenuView actionMenuView = ((Toolbar) viewGroup).f8832S;
                if (actionMenuView != null && (c2192pI = actionMenuView.f8767p) != null) {
                    c2192pI.m3809w();
                    return;
                }
                return;
        }
    }
}
