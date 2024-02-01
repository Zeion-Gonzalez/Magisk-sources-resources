package p000a;

import java.io.IOException;

/* renamed from: a.gx */
/* loaded from: classes.dex */
public final class C1753gx extends AbstractC1986lN {

    /* renamed from: N */
    public final /* synthetic */ C0669Mf f5523N;

    /* renamed from: Q */
    public final /* synthetic */ int f5524Q;

    /* renamed from: u */
    public final /* synthetic */ int f5525u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1753gx(String str, C0669Mf c0669Mf, int i, int i2) {
        super(str, true);
        this.f5523N = c0669Mf;
        this.f5524Q = i;
        this.f5525u = i2;
    }

    @Override // p000a.AbstractC1986lN
    /* renamed from: z */
    public final long mo256z() {
        int i = this.f5524Q;
        int i2 = this.f5525u;
        C0669Mf c0669Mf = this.f5523N;
        c0669Mf.getClass();
        try {
            c0669Mf.f2191L.m4261C(i, i2, true);
            return -1L;
        } catch (IOException e) {
            c0669Mf.m1564h(e);
            return -1L;
        }
    }
}
