package p000a;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.Jn */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0520Jn implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: R */
    public final /* synthetic */ AbstractC1153Va f1737R;

    /* renamed from: S */
    public final /* synthetic */ int f1738S;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0520Jn(AbstractC1153Va abstractC1153Va, int i) {
        this.f1738S = i;
        this.f1737R = abstractC1153Va;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f1738S;
        AbstractC1153Va abstractC1153Va = this.f1737R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ViewOnKeyListenerC0205Dw viewOnKeyListenerC0205Dw = (ViewOnKeyListenerC0205Dw) abstractC1153Va;
                if (viewOnKeyListenerC0205Dw.mo399h()) {
                    ArrayList arrayList = viewOnKeyListenerC0205Dw.f645s;
                    if (arrayList.size() > 0 && !((C0041Ar) arrayList.get(0)).f185z.f2127L) {
                        View view = viewOnKeyListenerC0205Dw.f634c;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0041Ar) it.next()).f185z.mo396Q();
                            }
                            return;
                        }
                        viewOnKeyListenerC0205Dw.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                ViewOnKeyListenerC2229q1 viewOnKeyListenerC2229q1 = (ViewOnKeyListenerC2229q1) abstractC1153Va;
                if (viewOnKeyListenerC2229q1.mo399h()) {
                    C0692N5 c0692n5 = viewOnKeyListenerC2229q1.f6868s;
                    if (!c0692n5.f2127L) {
                        View view2 = viewOnKeyListenerC2229q1.f6859Y;
                        if (view2 != null && view2.isShown()) {
                            c0692n5.mo396Q();
                            return;
                        } else {
                            viewOnKeyListenerC2229q1.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
