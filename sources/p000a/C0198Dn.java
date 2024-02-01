package p000a;

import java.io.IOException;

/* renamed from: a.Dn */
/* loaded from: classes.dex */
public final class C0198Dn extends AbstractC1986lN {

    /* renamed from: N */
    public final /* synthetic */ C0669Mf f600N;

    /* renamed from: Q */
    public final /* synthetic */ int f601Q;

    /* renamed from: u */
    public final /* synthetic */ long f602u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198Dn(String str, C0669Mf c0669Mf, int i, long j) {
        super(str, true);
        this.f600N = c0669Mf;
        this.f601Q = i;
        this.f602u = j;
    }

    @Override // p000a.AbstractC1986lN
    /* renamed from: z */
    public final long mo256z() {
        C0669Mf c0669Mf = this.f600N;
        try {
            c0669Mf.f2191L.m4260BO(this.f601Q, this.f602u);
            return -1L;
        } catch (IOException e) {
            c0669Mf.m1564h(e);
            return -1L;
        }
    }
}
