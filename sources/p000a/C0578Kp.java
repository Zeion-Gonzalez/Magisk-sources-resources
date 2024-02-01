package p000a;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: a.Kp */
/* loaded from: classes.dex */
public final class C0578Kp implements Iterator, InterfaceC1564dP {

    /* renamed from: S */
    public final /* synthetic */ Enumeration f1881S;

    public C0578Kp(Enumeration enumeration) {
        this.f1881S = enumeration;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1881S.hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1881S.nextElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
