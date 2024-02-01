package p000a;

import java.util.concurrent.locks.LockSupport;

/* renamed from: a.vr */
/* loaded from: classes.dex */
public final class C2542vr extends AbstractC0154D {

    /* renamed from: I */
    public final Thread f7776I;

    /* renamed from: q */
    public final AbstractC2738zi f7777q;

    public C2542vr(InterfaceC1255XS interfaceC1255XS, Thread thread, AbstractC2738zi abstractC2738zi) {
        super(interfaceC1255XS, true);
        this.f7776I = thread;
        this.f7777q = abstractC2738zi;
    }

    @Override // p000a.C0757O9
    /* renamed from: W */
    public final void mo32W(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f7776I;
        if (AbstractC1292YB.m2695u(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
