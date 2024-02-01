package p000a;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: a.Ij */
/* loaded from: classes.dex */
public final class C0461Ij {

    /* renamed from: N */
    public boolean f1548N;

    /* renamed from: P */
    public boolean f1549P;

    /* renamed from: Q */
    public int[] f1550Q;

    /* renamed from: h */
    public int f1551h;

    /* renamed from: u */
    public final /* synthetic */ StaggeredGridLayoutManager f1552u;

    /* renamed from: v */
    public boolean f1553v;

    /* renamed from: z */
    public int f1554z;

    public C0461Ij(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f1552u = staggeredGridLayoutManager;
        m1120z();
    }

    /* renamed from: z */
    public final void m1120z() {
        this.f1554z = -1;
        this.f1551h = Integer.MIN_VALUE;
        this.f1553v = false;
        this.f1549P = false;
        this.f1548N = false;
        int[] iArr = this.f1550Q;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
