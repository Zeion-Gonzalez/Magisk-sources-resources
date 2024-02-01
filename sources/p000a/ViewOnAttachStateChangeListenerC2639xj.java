package p000a;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C2762z;
import java.util.WeakHashMap;

/* renamed from: a.xj */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2639xj implements View.OnAttachStateChangeListener {

    /* renamed from: R */
    public final /* synthetic */ C2762z f8230R;

    /* renamed from: S */
    public final /* synthetic */ int f8231S = 0;

    /* renamed from: w */
    public final /* synthetic */ Object f8232w;

    public ViewOnAttachStateChangeListenerC2639xj(LayoutInflaterFactory2C2724zP layoutInflaterFactory2C2724zP, C2762z c2762z) {
        this.f8232w = layoutInflaterFactory2C2724zP;
        this.f8230R = c2762z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f8231S;
        Object obj = this.f8232w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                C2762z c2762z = this.f8230R;
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z.f8996v;
                c2762z.m4825M();
                C0135Cc.m266o((ViewGroup) abstractComponentCallbacksC2342s3.f7222t.getParent(), ((LayoutInflaterFactory2C2724zP) obj).f8563S).m273u();
                return;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                AbstractC1589dw.m3064v(view2);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ViewOnAttachStateChangeListenerC2639xj(C2762z c2762z, View view) {
        this.f8230R = c2762z;
        this.f8232w = view;
    }
}
