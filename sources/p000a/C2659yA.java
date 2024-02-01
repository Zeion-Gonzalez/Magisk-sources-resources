package p000a;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.yA */
/* loaded from: classes.dex */
public final class C2659yA extends C1710g8 {

    /* renamed from: E */
    public final /* synthetic */ int f8287E;

    public /* synthetic */ C2659yA(int i) {
        this.f8287E = i;
    }

    @Override // p000a.C1710g8
    /* renamed from: M */
    public final EdgeEffect mo3241M(RecyclerView recyclerView, int i) {
        switch (this.f8287E) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new EdgeEffect(recyclerView.getContext());
            default:
                return new C0171DJ(i, recyclerView, recyclerView.getContext());
        }
    }
}
