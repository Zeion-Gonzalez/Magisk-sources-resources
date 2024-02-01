package p000a;

import java.io.IOException;
import java.util.List;

/* renamed from: a.Ei */
/* loaded from: classes.dex */
public final class C0246Ei extends AbstractC1986lN {

    /* renamed from: N */
    public final /* synthetic */ C0669Mf f839N;

    /* renamed from: Q */
    public final /* synthetic */ int f840Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0246Ei(String str, C0669Mf c0669Mf, int i, List list, boolean z) {
        super(str, true);
        this.f839N = c0669Mf;
        this.f840Q = i;
    }

    @Override // p000a.AbstractC1986lN
    /* renamed from: z */
    public final long mo256z() {
        this.f839N.f2201f.getClass();
        try {
            this.f839N.f2191L.m4267x(this.f840Q, EnumC0754O6.f2560g);
            synchronized (this.f839N) {
                this.f839N.f2199d.remove(Integer.valueOf(this.f840Q));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
