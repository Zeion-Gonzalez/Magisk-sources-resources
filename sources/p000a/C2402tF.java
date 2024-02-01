package p000a;

import android.view.View;

/* renamed from: a.tF */
/* loaded from: classes.dex */
public final class C2402tF {

    /* renamed from: P */
    public int f7335P;

    /* renamed from: h */
    public int f7336h;

    /* renamed from: v */
    public int f7337v;

    /* renamed from: z */
    public int f7338z;

    public C2402tF(int i, int i2, int i3, int i4) {
        this.f7338z = i;
        this.f7336h = i2;
        this.f7337v = i3;
        this.f7335P = i4;
    }

    /* renamed from: z */
    public final void m4133z(AbstractC0249El abstractC0249El) {
        View view = abstractC0249El.f866z;
        this.f7338z = view.getLeft();
        this.f7336h = view.getTop();
        this.f7337v = view.getRight();
        this.f7335P = view.getBottom();
    }

    public C2402tF(C2402tF c2402tF) {
        this.f7338z = c2402tF.f7338z;
        this.f7336h = c2402tF.f7336h;
        this.f7337v = c2402tF.f7337v;
        this.f7335P = c2402tF.f7335P;
    }
}
