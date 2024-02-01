package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.nP */
/* loaded from: classes.dex */
public abstract class AbstractC2092nP implements Iterator, InterfaceC1564dP {

    /* renamed from: R */
    public Object f6457R;

    /* renamed from: S */
    public EnumC1988lP f6458S = EnumC1988lP.f6164R;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        EnumC1988lP enumC1988lP = this.f6458S;
        EnumC1988lP enumC1988lP2 = EnumC1988lP.f6163I;
        if (enumC1988lP != enumC1988lP2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int ordinal = enumC1988lP.ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.f6458S = enumC1988lP2;
                mo3170z();
                if (this.f6458S == EnumC1988lP.f6165S) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6458S = EnumC1988lP.f6164R;
        return this.f6457R;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: z */
    public abstract void mo3170z();
}
