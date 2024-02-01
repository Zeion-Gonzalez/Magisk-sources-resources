package p000a;

import java.io.Serializable;

/* renamed from: a.T6 */
/* loaded from: classes.dex */
public final class C1019T6 implements Serializable {

    /* renamed from: S */
    public final Throwable f3412S;

    public C1019T6(Throwable th) {
        this.f3412S = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1019T6) {
            if (AbstractC1292YB.m2695u(this.f3412S, ((C1019T6) obj).f3412S)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3412S.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f3412S + ')';
    }
}
