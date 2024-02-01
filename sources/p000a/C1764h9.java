package p000a;

import java.io.IOException;

/* renamed from: a.h9 */
/* loaded from: classes.dex */
public final class C1764h9 extends AbstractC1986lN {

    /* renamed from: N */
    public final /* synthetic */ C0669Mf f5559N;

    /* renamed from: Q */
    public final /* synthetic */ long f5560Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1764h9(String str, C0669Mf c0669Mf, long j) {
        super(str, true);
        this.f5559N = c0669Mf;
        this.f5560Q = j;
    }

    @Override // p000a.AbstractC1986lN
    /* renamed from: z */
    public final long mo256z() {
        C0669Mf c0669Mf;
        boolean z;
        synchronized (this.f5559N) {
            c0669Mf = this.f5559N;
            long j = c0669Mf.f2196Y;
            long j2 = c0669Mf.f2208r;
            if (j < j2) {
                z = true;
            } else {
                c0669Mf.f2208r = j2 + 1;
                z = false;
            }
        }
        if (z) {
            c0669Mf.m1564h(null);
            return -1L;
        }
        try {
            c0669Mf.f2191L.m4261C(1, 0, false);
        } catch (IOException e) {
            c0669Mf.m1564h(e);
        }
        return this.f5560Q;
    }
}
