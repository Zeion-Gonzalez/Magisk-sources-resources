package p000a;

import android.view.View;

/* renamed from: a.UW */
/* loaded from: classes.dex */
public class C1094UW extends C1665fK {

    /* renamed from: R */
    public final View f3579R;

    public C1094UW(View view) {
        super(8);
        this.f3579R = view;
    }

    @Override // p000a.C1665fK
    /* renamed from: r */
    public void mo2267r() {
        View view;
        View view2 = this.f3579R;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(16908290);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new RunnableC0308Fs(5, view));
    }
}
