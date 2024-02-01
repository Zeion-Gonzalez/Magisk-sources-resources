package p000a;

import android.os.IBinder;

/* renamed from: a.fp */
/* loaded from: classes.dex */
public abstract class AbstractC1693fp implements IBinder.DeathRecipient {

    /* renamed from: z */
    public final IBinder f5306z;

    public AbstractC1693fp(IBinder iBinder) {
        this.f5306z = iBinder;
        iBinder.linkToDeath(this, 0);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f5306z.unlinkToDeath(this, 0);
        AbstractC1110Un.m2289z(new RunnableC0308Fs(16, this));
    }

    /* renamed from: z */
    public abstract void mo2408z();
}
