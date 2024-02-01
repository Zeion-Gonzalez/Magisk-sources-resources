package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.pT */
/* loaded from: classes.dex */
public final class C2202pT implements Iterator {

    /* renamed from: I */
    public boolean f6771I = false;

    /* renamed from: R */
    public int f6772R;

    /* renamed from: S */
    public final int f6773S;

    /* renamed from: q */
    public final /* synthetic */ AbstractC0632Lt f6774q;

    /* renamed from: w */
    public int f6775w;

    public C2202pT(AbstractC0632Lt abstractC0632Lt, int i) {
        this.f6774q = abstractC0632Lt;
        this.f6773S = i;
        this.f6772R = abstractC0632Lt.mo1416o();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6775w < this.f6772R;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object mo1409Q = this.f6774q.mo1409Q(this.f6775w, this.f6773S);
        this.f6775w++;
        this.f6771I = true;
        return mo1409Q;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6771I) {
            throw new IllegalStateException();
        }
        int i = this.f6775w - 1;
        this.f6775w = i;
        this.f6772R--;
        this.f6771I = false;
        this.f6774q.mo1412V(i);
    }
}
