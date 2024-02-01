package p000a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: a.gX */
/* loaded from: classes.dex */
public final class C1727gX extends C1663fI {

    /* renamed from: v */
    public static final AtomicIntegerFieldUpdater f5447v = AtomicIntegerFieldUpdater.newUpdater(C1727gX.class, "_resumed");
    private volatile int _resumed;

    public C1727gX(InterfaceC1171Vv interfaceC1171Vv, Throwable th, boolean z) {
        super(th, z);
        this._resumed = 0;
    }
}
