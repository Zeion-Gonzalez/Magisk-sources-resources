package p000a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a.ru */
/* loaded from: classes.dex */
public final class C2333ru implements InterfaceC2296rE {

    /* renamed from: z */
    public final AtomicReference f7171z;

    public C2333ru(C1228Wy c1228Wy) {
        this.f7171z = new AtomicReference(c1228Wy);
    }

    @Override // p000a.InterfaceC2296rE
    public final Iterator iterator() {
        InterfaceC2296rE interfaceC2296rE = (InterfaceC2296rE) this.f7171z.getAndSet(null);
        if (interfaceC2296rE != null) {
            return interfaceC2296rE.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
