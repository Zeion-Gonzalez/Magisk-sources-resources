package p000a;

import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.p001ui.module.ModuleFragment;

/* renamed from: a.vC */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2507vC implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ RecyclerView f7675R;

    /* renamed from: S */
    public final /* synthetic */ int f7676S;

    public /* synthetic */ RunnableC2507vC(RecyclerView recyclerView, int i) {
        this.f7676S = i;
        this.f7675R = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = this.f7676S;
        RecyclerView recyclerView = this.f7675R;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC0408Hk abstractC0408Hk = recyclerView.f9124r;
                if (abstractC0408Hk != null) {
                    i = abstractC0408Hk.mo918z() - 1;
                } else {
                    i = 0;
                }
                recyclerView.m4921UZ(i);
                return;
            default:
                int i3 = ModuleFragment.f9613BO;
                AbstractC0408Hk abstractC0408Hk2 = recyclerView.f9124r;
                if (abstractC0408Hk2 != null) {
                    abstractC0408Hk2.f1376z.registerObserver(new C0641M3(recyclerView, 2));
                    return;
                }
                return;
        }
    }
}
