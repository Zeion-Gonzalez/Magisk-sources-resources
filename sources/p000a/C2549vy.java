package p000a;

import android.database.DataSetObserver;

/* renamed from: a.vy */
/* loaded from: classes.dex */
public final class C2549vy extends DataSetObserver {

    /* renamed from: z */
    public final /* synthetic */ C0660MU f7794z;

    public C2549vy(C0660MU c0660mu) {
        this.f7794z = c0660mu;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C0660MU c0660mu = this.f7794z;
        if (c0660mu.mo399h()) {
            c0660mu.mo396Q();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f7794z.dismiss();
    }
}
