package p000a;

import java.util.concurrent.CancellationException;

/* renamed from: a.Pf */
/* loaded from: classes.dex */
public final class C0840Pf {

    /* renamed from: N */
    public final Throwable f2835N;

    /* renamed from: P */
    public final Object f2836P;

    /* renamed from: h */
    public final AbstractC1264Xg f2837h;

    /* renamed from: v */
    public final InterfaceC2364sT f2838v;

    /* renamed from: z */
    public final Object f2839z;

    public C0840Pf(Object obj, AbstractC1264Xg abstractC1264Xg, InterfaceC2364sT interfaceC2364sT, Object obj2, Throwable th) {
        this.f2839z = obj;
        this.f2837h = abstractC1264Xg;
        this.f2838v = interfaceC2364sT;
        this.f2836P = obj2;
        this.f2835N = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    /* renamed from: z */
    public static C0840Pf m1957z(C0840Pf c0840Pf, AbstractC1264Xg abstractC1264Xg, CancellationException cancellationException, int i) {
        Object obj;
        InterfaceC2364sT interfaceC2364sT;
        Object obj2 = null;
        if ((i & 1) != 0) {
            obj = c0840Pf.f2839z;
        } else {
            obj = null;
        }
        if ((i & 2) != 0) {
            abstractC1264Xg = c0840Pf.f2837h;
        }
        AbstractC1264Xg abstractC1264Xg2 = abstractC1264Xg;
        if ((i & 4) != 0) {
            interfaceC2364sT = c0840Pf.f2838v;
        } else {
            interfaceC2364sT = null;
        }
        if ((i & 8) != 0) {
            obj2 = c0840Pf.f2836P;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0840Pf.f2835N;
        }
        c0840Pf.getClass();
        return new C0840Pf(obj, abstractC1264Xg2, interfaceC2364sT, obj3, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0840Pf)) {
            return false;
        }
        C0840Pf c0840Pf = (C0840Pf) obj;
        return AbstractC1292YB.m2695u(this.f2839z, c0840Pf.f2839z) && AbstractC1292YB.m2695u(this.f2837h, c0840Pf.f2837h) && AbstractC1292YB.m2695u(this.f2838v, c0840Pf.f2838v) && AbstractC1292YB.m2695u(this.f2836P, c0840Pf.f2836P) && AbstractC1292YB.m2695u(this.f2835N, c0840Pf.f2835N);
    }

    public final int hashCode() {
        Object obj = this.f2839z;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC1264Xg abstractC1264Xg = this.f2837h;
        int hashCode2 = (hashCode + (abstractC1264Xg == null ? 0 : abstractC1264Xg.hashCode())) * 31;
        InterfaceC2364sT interfaceC2364sT = this.f2838v;
        int hashCode3 = (hashCode2 + (interfaceC2364sT == null ? 0 : interfaceC2364sT.hashCode())) * 31;
        Object obj2 = this.f2836P;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2835N;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2839z + ", cancelHandler=" + this.f2837h + ", onCancellation=" + this.f2838v + ", idempotentResume=" + this.f2836P + ", cancelCause=" + this.f2835N + ')';
    }

    public /* synthetic */ C0840Pf(Object obj, AbstractC1264Xg abstractC1264Xg, InterfaceC2364sT interfaceC2364sT, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC1264Xg, (i & 4) != 0 ? null : interfaceC2364sT, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
