package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.NM */
/* loaded from: classes.dex */
public final class C0708NM implements Iterator, InterfaceC1564dP {

    /* renamed from: R */
    public int f2380R;

    /* renamed from: S */
    public final /* synthetic */ int f2381S = 0;

    /* renamed from: w */
    public final Iterator f2382w;

    public C0708NM(C2538vl c2538vl) {
        this.f2382w = c2538vl.f7769h.iterator();
        this.f2380R = c2538vl.f7770v;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f2381S;
        Iterator it = this.f2382w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                break;
            default:
                if (this.f2380R > 0 && it.hasNext()) {
                    return true;
                }
                return false;
        }
        while (this.f2380R > 0 && it.hasNext()) {
            it.next();
            this.f2380R--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2381S;
        Iterator it = this.f2382w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                break;
            default:
                int i2 = this.f2380R;
                if (i2 != 0) {
                    this.f2380R = i2 - 1;
                    return it.next();
                }
                throw new NoSuchElementException();
        }
        while (this.f2380R > 0 && it.hasNext()) {
            it.next();
            this.f2380R--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2381S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0708NM(C2538vl c2538vl, int i) {
        this.f2380R = c2538vl.f7770v;
        this.f2382w = c2538vl.f7769h.iterator();
    }
}
