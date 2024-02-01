package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.eb */
/* loaded from: classes.dex */
public final class C1626eb implements Iterator {

    /* renamed from: R */
    public int f5017R = 0;

    /* renamed from: S */
    public final Object[] f5018S;

    public C1626eb(Object[] objArr) {
        this.f5018S = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5017R < this.f5018S.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f5017R;
        Object[] objArr = this.f5018S;
        if (i != objArr.length) {
            this.f5017R = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException("Out of elements: " + this.f5017R);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}
