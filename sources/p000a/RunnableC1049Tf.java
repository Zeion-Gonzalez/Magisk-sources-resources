package p000a;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: a.Tf */
/* loaded from: classes.dex */
public final class RunnableC1049Tf implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ ActionBarOverlayLayout f3472R;

    /* renamed from: S */
    public final /* synthetic */ int f3473S;

    public /* synthetic */ RunnableC1049Tf(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3473S = i;
        this.f3472R = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3473S;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3472R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                actionBarOverlayLayout.m4717o();
                actionBarOverlayLayout.f8746i = actionBarOverlayLayout.f8734I.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f8742d);
                return;
            default:
                actionBarOverlayLayout.m4717o();
                actionBarOverlayLayout.f8746i = actionBarOverlayLayout.f8734I.animate().translationY(-actionBarOverlayLayout.f8734I.getHeight()).setListener(actionBarOverlayLayout.f8742d);
                return;
        }
    }
}
