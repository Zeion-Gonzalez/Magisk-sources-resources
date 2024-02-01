package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.RN */
/* loaded from: classes.dex */
public final class C0923RN implements Iterator, InterfaceC1564dP {

    /* renamed from: I */
    public Object f3170I;

    /* renamed from: R */
    public final Iterator f3171R;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2296rE f3173q;

    /* renamed from: S */
    public final /* synthetic */ int f3172S = 1;

    /* renamed from: w */
    public int f3174w = -1;

    public C0923RN(C1831iT c1831iT) {
        this.f3173q = c1831iT;
        this.f3171R = ((InterfaceC2296rE) c1831iT.f5725h).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3172S) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (this.f3174w == -1) {
                    m2073z();
                }
                if (this.f3174w != 1) {
                    return false;
                }
                return true;
            default:
                if (this.f3174w == -1) {
                    m2073z();
                }
                if (this.f3174w != 1) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3172S) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (this.f3174w == -1) {
                    m2073z();
                }
                if (this.f3174w != 0) {
                    Object obj = this.f3170I;
                    this.f3170I = null;
                    this.f3174w = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                if (this.f3174w == -1) {
                    m2073z();
                }
                if (this.f3174w != 0) {
                    Object obj2 = this.f3170I;
                    this.f3170I = null;
                    this.f3174w = -1;
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3172S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: z */
    public final void m2073z() {
        int i = this.f3172S;
        int i2 = 1;
        InterfaceC2296rE interfaceC2296rE = this.f3173q;
        Iterator it = this.f3171R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                break;
            default:
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((Boolean) ((C1831iT) interfaceC2296rE).f5726v.mo85W(next)).booleanValue()) {
                        this.f3174w = 1;
                        this.f3170I = next;
                        return;
                    }
                }
                this.f3174w = 0;
                return;
        }
        while (true) {
            if (it.hasNext()) {
                Object next2 = it.next();
                C2211pf c2211pf = (C2211pf) interfaceC2296rE;
                if (((Boolean) c2211pf.f6798v.mo85W(next2)).booleanValue() == c2211pf.f6797h) {
                    this.f3170I = next2;
                }
            } else {
                i2 = 0;
            }
        }
        this.f3174w = i2;
    }

    public C0923RN(C2211pf c2211pf) {
        this.f3173q = c2211pf;
        this.f3171R = c2211pf.f6799z.iterator();
    }
}
