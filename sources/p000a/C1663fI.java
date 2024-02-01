package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a.fI */
/* loaded from: classes.dex */
public class C1663fI {

    /* renamed from: h */
    public static final AtomicIntegerFieldUpdater f5198h = AtomicIntegerFieldUpdater.newUpdater(C1663fI.class, "_handled");
    private volatile int _handled;

    /* renamed from: z */
    public final Throwable f5199z;

    public C1663fI(Throwable th, boolean z) {
        this.f5199z = th;
        this._handled = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f5199z + ']';
    }
}
