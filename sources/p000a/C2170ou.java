package p000a;

/* renamed from: a.ou */
/* loaded from: classes.dex */
public final class C2170ou extends C0944Rl {

    /* renamed from: z */
    public final Throwable f6650z;

    public C2170ou(Throwable th) {
        this.f6650z = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2170ou) {
            if (AbstractC1292YB.m2695u(this.f6650z, ((C2170ou) obj).f6650z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f6650z;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p000a.C0944Rl
    public final String toString() {
        return "Closed(" + this.f6650z + ')';
    }
}
