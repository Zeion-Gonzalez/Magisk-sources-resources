package p000a;

import com.topjohnwu.magisk.core.data.SuLogDatabase;
import java.util.concurrent.Callable;

/* renamed from: a.jk */
/* loaded from: classes.dex */
public final class CallableC1898jk implements Callable {

    /* renamed from: R */
    public final /* synthetic */ C1999lb f5934R;

    /* renamed from: S */
    public final /* synthetic */ long f5935S;

    public CallableC1898jk(C1999lb c1999lb, long j) {
        this.f5934R = c1999lb;
        this.f5935S = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1999lb c1999lb = this.f5934R;
        C0291FX c0291fx = c1999lb.f6208N;
        InterfaceC2721zM m1419v = c0291fx.m1419v();
        m1419v.mo2991Y(1, this.f5935S);
        SuLogDatabase suLogDatabase = c1999lb.f6210v;
        try {
            suLogDatabase.m3192z();
            suLogDatabase.m3180G();
            try {
                m1419v.mo4350p();
                InterfaceC0771ON interfaceC0771ON = suLogDatabase.f5278P;
                if (interfaceC0771ON == null) {
                    interfaceC0771ON = null;
                }
                interfaceC0771ON.mo1790l().mo1943e();
                c0291fx.m1421y(m1419v);
                return C0329GJ.f1115z;
            } finally {
                suLogDatabase.m3181M();
            }
        } catch (Throwable th) {
            c0291fx.m1421y(m1419v);
            throw th;
        }
    }
}
