package p000a;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.topjohnwu.magisk.R;

/* renamed from: a.A5 */
/* loaded from: classes.dex */
public final class C0005A5 extends C0489JE {

    /* renamed from: P */
    public final ViewGroupOnHierarchyChangeListenerC0595L9 f71P;

    /* renamed from: v */
    public ViewTreeObserverOnPreDrawListenerC2585wi f72v;

    public C0005A5(Activity activity) {
        super(activity);
        this.f71P = new ViewGroupOnHierarchyChangeListenerC0595L9(this, activity);
    }

    @Override // p000a.C0489JE
    /* renamed from: h */
    public final void mo24h(C1447b9 c1447b9) {
        this.f1640h = c1447b9;
        View findViewById = this.f1641z.findViewById(16908290);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.f72v != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f72v);
        }
        ViewTreeObserverOnPreDrawListenerC2585wi viewTreeObserverOnPreDrawListenerC2585wi = new ViewTreeObserverOnPreDrawListenerC2585wi(this, findViewById, 1);
        this.f72v = viewTreeObserverOnPreDrawListenerC2585wi;
        viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2585wi);
    }

    @Override // p000a.C0489JE
    /* renamed from: z */
    public final void mo25z() {
        int i;
        Activity activity = this.f1641z;
        Resources.Theme theme = activity.getTheme();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            activity.setTheme(i);
        }
        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f71P);
    }
}
