package p000a;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: a.AE */
/* loaded from: classes.dex */
public final class C0013AE extends Transition.EpicenterCallback {

    /* renamed from: h */
    public final /* synthetic */ Rect f102h;

    /* renamed from: z */
    public final /* synthetic */ int f103z;

    public /* synthetic */ C0013AE(Rect rect, int i) {
        this.f103z = i;
        this.f102h = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i = this.f103z;
        Rect rect = this.f102h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return rect;
            default:
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
