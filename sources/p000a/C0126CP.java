package p000a;

import java.util.Iterator;

/* renamed from: a.CP */
/* loaded from: classes.dex */
public final class C0126CP implements Iterator, InterfaceC1564dP {

    /* renamed from: R */
    public final /* synthetic */ C1831iT f436R;

    /* renamed from: S */
    public final Iterator f437S;

    public C0126CP(C1831iT c1831iT) {
        this.f436R = c1831iT;
        this.f437S = ((InterfaceC2296rE) c1831iT.f5725h).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f437S.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f436R.f5726v.mo85W(this.f437S.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
