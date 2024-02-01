package p000a;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: a.xf */
/* loaded from: classes.dex */
public final class C2636xf implements ListIterator, InterfaceC1564dP {

    /* renamed from: R */
    public int f8222R;

    /* renamed from: S */
    public final C0474Ix f8223S;

    /* renamed from: w */
    public int f8224w = -1;

    public C2636xf(C0474Ix c0474Ix, int i) {
        this.f8223S = c0474Ix;
        this.f8222R = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f8222R;
        this.f8222R = i + 1;
        this.f8223S.add(i, obj);
        this.f8224w = -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f8222R < this.f8223S.f1585w) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8222R > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f8222R;
        C0474Ix c0474Ix = this.f8223S;
        if (i < c0474Ix.f1585w) {
            this.f8222R = i + 1;
            this.f8224w = i;
            return c0474Ix.f1582S[c0474Ix.f1581R + i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8222R;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f8222R;
        if (i > 0) {
            int i2 = i - 1;
            this.f8222R = i2;
            this.f8224w = i2;
            C0474Ix c0474Ix = this.f8223S;
            return c0474Ix.f1582S[c0474Ix.f1581R + i2];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8222R - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        boolean z;
        int i = this.f8224w;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f8223S.mo1152v(i);
            this.f8222R = this.f8224w;
            this.f8224w = -1;
            return;
        }
        throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f8224w;
        if (!(i != -1)) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.f8223S.set(i, obj);
    }
}
