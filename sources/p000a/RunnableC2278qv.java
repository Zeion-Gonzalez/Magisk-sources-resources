package p000a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.qv */
/* loaded from: classes.dex */
public final class RunnableC2278qv implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ int f7006R;

    /* renamed from: S */
    public final /* synthetic */ int f7007S;

    /* renamed from: w */
    public final /* synthetic */ Object f7008w;

    public /* synthetic */ RunnableC2278qv(int i, int i2, Object obj) {
        this.f7007S = i2;
        this.f7008w = obj;
        this.f7006R = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7007S;
        int i2 = this.f7006R;
        Object obj = this.f7008w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                RecyclerView recyclerView = ((C2292rA) obj).f7081Lq;
                if (!recyclerView.f9098d) {
                    AbstractC0667Md abstractC0667Md = recyclerView.f9077J;
                    if (abstractC0667Md == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        abstractC0667Md.mo1526d3(recyclerView, i2);
                        return;
                    }
                }
                return;
            default:
                int[] iArr = C0065BH.f259D;
                ((C0065BH) obj).m111E(i2);
                return;
        }
    }
}
