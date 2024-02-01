package p000a;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: a.R5 */
/* loaded from: classes.dex */
public final class C0906R5 implements PopupWindow.OnDismissListener {

    /* renamed from: R */
    public final /* synthetic */ C2178p2 f3106R;

    /* renamed from: S */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f3107S;

    public C0906R5(C2178p2 c2178p2, ViewTreeObserverOnGlobalLayoutListenerC1238X7 viewTreeObserverOnGlobalLayoutListenerC1238X7) {
        this.f3106R = c2178p2;
        this.f3107S = viewTreeObserverOnGlobalLayoutListenerC1238X7;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f3106R.f6672K.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f3107S);
        }
    }
}
