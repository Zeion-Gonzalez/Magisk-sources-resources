package p000a;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: a.Y6 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1287Y6 implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ int f4121R;

    /* renamed from: S */
    public final /* synthetic */ int f4122S;

    /* renamed from: w */
    public final /* synthetic */ Object f4123w;

    public /* synthetic */ RunnableC1287Y6(int i, int i2, Object obj) {
        this.f4122S = i2;
        this.f4123w = obj;
        this.f4121R = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4122S;
        int i2 = this.f4121R;
        Object obj = this.f4123w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((AbstractC2703z2) obj).mo92Pm(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f9394I.get();
                if (view != null) {
                    sideSheetBehavior.m5068s(view, i2, false);
                    return;
                }
                return;
        }
    }
}
