package p000a;

import java.util.concurrent.CompletableFuture;

/* renamed from: a.uV */
/* loaded from: classes.dex */
public final class C2468uV extends CompletableFuture {

    /* renamed from: z */
    public final InterfaceC0987SV f7566z;

    public C2468uV(C2139oL c2139oL) {
        this.f7566z = c2139oL;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.f7566z.cancel();
        }
        return super.cancel(z);
    }
}
