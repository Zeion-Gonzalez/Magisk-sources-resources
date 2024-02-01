package p000a;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: a.O7 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0755O7 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: R */
    public ViewTreeObserver f2566R;

    /* renamed from: S */
    public final View f2567S;

    /* renamed from: w */
    public final Runnable f2568w;

    public ViewTreeObserverOnPreDrawListenerC0755O7(View view, Runnable runnable) {
        this.f2567S = view;
        this.f2566R = view.getViewTreeObserver();
        this.f2568w = runnable;
    }

    /* renamed from: z */
    public static void m1727z(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0755O7 viewTreeObserverOnPreDrawListenerC0755O7 = new ViewTreeObserverOnPreDrawListenerC0755O7(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0755O7);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0755O7);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f2566R.isAlive();
        View view = this.f2567S;
        if (isAlive) {
            viewTreeObserver = this.f2566R;
        } else {
            viewTreeObserver = view.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f2568w.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f2566R = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f2566R.isAlive();
        View view2 = this.f2567S;
        if (isAlive) {
            viewTreeObserver = this.f2566R;
        } else {
            viewTreeObserver = view2.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
