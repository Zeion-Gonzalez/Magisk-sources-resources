package p000a;

import java.util.concurrent.CompletableFuture;

/* renamed from: a.ZT */
/* loaded from: classes.dex */
public final class C1361ZT implements InterfaceC1636el {

    /* renamed from: h */
    public final Object f4271h;

    /* renamed from: v */
    public final /* synthetic */ Object f4272v;

    /* renamed from: z */
    public final /* synthetic */ int f4273z;

    public /* synthetic */ C1361ZT(Object obj, int i, Object obj2) {
        this.f4273z = i;
        this.f4272v = obj;
        this.f4271h = obj2;
    }

    @Override // p000a.InterfaceC1636el
    /* renamed from: h */
    public final void mo2754h(Throwable th) {
        int i = this.f4273z;
        Object obj = this.f4271h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((CompletableFuture) obj).completeExceptionally(th);
                return;
            case 1:
                ((CompletableFuture) obj).completeExceptionally(th);
                return;
            default:
                ((C0727Nf) this.f4272v).f2455S.execute(new RunnableC1247XH(5, this, (InterfaceC1636el) obj, th));
                return;
        }
    }

    @Override // p000a.InterfaceC1636el
    /* renamed from: z */
    public final void mo2755z(InterfaceC0987SV interfaceC0987SV, C0870QJ c0870qj) {
        int i = this.f4273z;
        Object obj = this.f4271h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                CompletableFuture completableFuture = (CompletableFuture) obj;
                if (c0870qj.f2958z.m2858h()) {
                    completableFuture.complete(c0870qj.f2957h);
                    return;
                } else {
                    completableFuture.completeExceptionally(new C0600LE(c0870qj));
                    return;
                }
            case 1:
                ((CompletableFuture) obj).complete(c0870qj);
                return;
            default:
                ((C0727Nf) this.f4272v).f2455S.execute(new RunnableC1247XH(4, this, (InterfaceC1636el) obj, c0870qj));
                return;
        }
    }
}
