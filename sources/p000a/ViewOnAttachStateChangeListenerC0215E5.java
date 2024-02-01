package p000a;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: a.E5 */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0215E5 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: R */
    public final WeakReference f680R;

    /* renamed from: S */
    public final WeakReference f681S;

    public ViewOnAttachStateChangeListenerC0215E5(C0485J8 c0485j8, View view) {
        this.f681S = new WeakReference(c0485j8);
        this.f680R = new WeakReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        WeakReference weakReference = this.f681S;
        if (weakReference.get() == null) {
            m420z();
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AbstractC2691yn abstractC2691yn = (AbstractC2691yn) weakReference.get();
            C2174oz c2174oz = AbstractC2691yn.f8386E;
            abstractC2691yn.getClass();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z;
        if (this.f681S.get() == null) {
            m420z();
            z = true;
        } else {
            z = false;
        }
        if (!z && view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z;
        if (this.f681S.get() == null) {
            m420z();
            z = true;
        } else {
            z = false;
        }
        if (!z && view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: z */
    public final void m420z() {
        WeakReference weakReference = this.f680R;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            View view = (View) weakReference.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.f681S.clear();
    }
}
