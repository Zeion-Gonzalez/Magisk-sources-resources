package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.nT */
/* loaded from: classes.dex */
public final class C2095nT implements Iterator, InterfaceC1564dP {

    /* renamed from: R */
    public boolean f6465R;

    /* renamed from: S */
    public int f6466S = -1;

    /* renamed from: w */
    public final /* synthetic */ C1951kj f6467w;

    public C2095nT(C1951kj c1951kj) {
        this.f6467w = c1951kj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6466S + 1 < this.f6467w.f6044E.m4506o()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f6465R = true;
            C2616xE c2616xE = this.f6467w.f6044E;
            int i = this.f6466S + 1;
            this.f6466S = i;
            return (C1420ag) c2616xE.m4505W(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f6465R) {
            C2616xE c2616xE = this.f6467w.f6044E;
            ((C1420ag) c2616xE.m4505W(this.f6466S)).f4448R = null;
            int i = this.f6466S;
            Object[] objArr = c2616xE.f8093w;
            Object obj = objArr[i];
            Object obj2 = C2616xE.f8089q;
            if (obj != obj2) {
                objArr[i] = obj2;
                c2616xE.f8092S = true;
            }
            this.f6466S = i - 1;
            this.f6465R = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element".toString());
    }
}
