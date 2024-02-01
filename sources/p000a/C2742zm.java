package p000a;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.zm */
/* loaded from: classes.dex */
public final class C2742zm extends AbstractC1467ba {

    /* renamed from: h */
    public final /* synthetic */ AbstractC0632Lt f8596h;

    /* renamed from: z */
    public boolean f8597z = false;

    public C2742zm(AbstractC0632Lt abstractC0632Lt) {
        this.f8596h = abstractC0632Lt;
    }

    @Override // p000a.AbstractC1467ba
    /* renamed from: h */
    public final void mo102h(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f8597z = true;
    }

    @Override // p000a.AbstractC1467ba
    /* renamed from: z */
    public final void mo103z(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f8597z) {
            this.f8597z = false;
            this.f8596h.m1411U();
        }
    }
}
