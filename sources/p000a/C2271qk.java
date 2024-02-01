package p000a;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: a.qk */
/* loaded from: classes.dex */
public final class C2271qk {

    /* renamed from: N */
    public final /* synthetic */ AbstractC1131VA f6982N;

    /* renamed from: P */
    public final Runnable f6983P;

    /* renamed from: h */
    public int f6984h;

    /* renamed from: v */
    public boolean f6985v;

    /* renamed from: z */
    public final /* synthetic */ int f6986z;

    public C2271qk(BottomSheetBehavior bottomSheetBehavior) {
        this.f6986z = 0;
        this.f6982N = bottomSheetBehavior;
        this.f6983P = new RunnableC1286Y5(8, this);
    }

    /* renamed from: z */
    public final void m3909z(int i) {
        int i2 = this.f6986z;
        Runnable runnable = this.f6983P;
        AbstractC1131VA abstractC1131VA = this.f6982N;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC1131VA;
                WeakReference weakReference = bottomSheetBehavior.f9228D;
                if (weakReference != null && weakReference.get() != null) {
                    this.f6984h = i;
                    if (!this.f6985v) {
                        View view = (View) bottomSheetBehavior.f9228D.get();
                        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                        AbstractC2397t8.m4120S(view, runnable);
                        this.f6985v = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC1131VA;
                WeakReference weakReference2 = sideSheetBehavior.f9394I;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f6984h = i;
                    if (!this.f6985v) {
                        View view2 = (View) sideSheetBehavior.f9394I.get();
                        WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                        AbstractC2397t8.m4120S(view2, runnable);
                        this.f6985v = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2271qk(BottomSheetBehavior bottomSheetBehavior, int i) {
        this(bottomSheetBehavior);
        this.f6986z = 0;
    }

    public C2271qk(SideSheetBehavior sideSheetBehavior) {
        this.f6986z = 1;
        this.f6982N = sideSheetBehavior;
        this.f6983P = new RunnableC0308Fs(11, this);
    }
}
