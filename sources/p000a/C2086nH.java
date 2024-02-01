package p000a;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.nH */
/* loaded from: classes.dex */
public final class C2086nH extends LinearLayoutManager {

    /* renamed from: F */
    public final /* synthetic */ C2292rA f6450F;

    /* renamed from: X */
    public final /* synthetic */ int f6451X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2086nH(C2292rA c2292rA, int i, int i2) {
        super(i);
        this.f6450F = c2292rA;
        this.f6451X = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: EQ */
    public final void mo3716EQ(C0496JN c0496jn, int[] iArr) {
        int i = this.f6451X;
        C2292rA c2292rA = this.f6450F;
        if (i == 0) {
            iArr[0] = c2292rA.f7081Lq.getWidth();
            iArr[1] = c2292rA.f7081Lq.getWidth();
        } else {
            iArr[0] = c2292rA.f7081Lq.getHeight();
            iArr[1] = c2292rA.f7081Lq.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000a.AbstractC0667Md
    /* renamed from: d3 */
    public final void mo1526d3(RecyclerView recyclerView, int i) {
        C1100Ud c1100Ud = new C1100Ud(this, recyclerView.getContext(), 2);
        c1100Ud.f7967z = i;
        m1557yF(c1100Ud);
    }
}
