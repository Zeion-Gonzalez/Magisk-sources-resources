package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.Ut */
/* loaded from: classes.dex */
public final class C1116Ut implements Iterator, InterfaceC1171Vv, InterfaceC1564dP {

    /* renamed from: I */
    public InterfaceC1171Vv f3621I;

    /* renamed from: R */
    public Object f3622R;

    /* renamed from: S */
    public int f3623S;

    /* renamed from: w */
    public Iterator f3624w;

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: N */
    public final InterfaceC1255XS mo315N() {
        return C0070BN.f302S;
    }

    /* renamed from: h */
    public final Object m2296h(C1228Wy c1228Wy, InterfaceC1171Vv interfaceC1171Vv) {
        Object obj;
        Iterator it = c1228Wy.iterator();
        boolean hasNext = it.hasNext();
        Object obj2 = C0329GJ.f1115z;
        if (!hasNext) {
            obj = obj2;
        } else {
            this.f3624w = it;
            this.f3623S = 2;
            this.f3621I = interfaceC1171Vv;
            obj = EnumC0464Im.f1557S;
        }
        if (obj == EnumC0464Im.f1557S) {
            return obj;
        }
        return obj2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f3623S;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m2297z();
                }
                if (this.f3624w.hasNext()) {
                    this.f3623S = 2;
                    return true;
                }
                this.f3624w = null;
            }
            this.f3623S = 5;
            InterfaceC1171Vv interfaceC1171Vv = this.f3621I;
            this.f3621I = null;
            interfaceC1171Vv.mo320u(C0329GJ.f1115z);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3623S;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f3623S = 0;
                    Object obj = this.f3622R;
                    this.f3622R = null;
                    return obj;
                }
                throw m2297z();
            }
            this.f3623S = 1;
            return this.f3624w.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p000a.InterfaceC1171Vv
    /* renamed from: u */
    public final void mo320u(Object obj) {
        AbstractC1292YB.m2664UZ(obj);
        this.f3623S = 4;
    }

    /* renamed from: z */
    public final RuntimeException m2297z() {
        int i = this.f3623S;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3623S);
    }
}
