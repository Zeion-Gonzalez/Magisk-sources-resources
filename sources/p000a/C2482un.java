package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.un */
/* loaded from: classes.dex */
public final class C2482un implements Iterator, InterfaceC1564dP {

    /* renamed from: I */
    public int f7599I;

    /* renamed from: R */
    public final int f7600R;

    /* renamed from: S */
    public final int f7601S;

    /* renamed from: w */
    public boolean f7602w;

    public C2482un(int i, int i2, int i3) {
        this.f7601S = i3;
        this.f7600R = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f7602w = z;
        this.f7599I = z ? i : i2;
    }

    /* renamed from: h */
    public final int m4257h() {
        int i = this.f7599I;
        if (i != this.f7600R) {
            this.f7599I = this.f7601S + i;
        } else {
            if (!this.f7602w) {
                throw new NoSuchElementException();
            }
            this.f7602w = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7602w;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        m4258v();
        throw null;
    }

    /* renamed from: v */
    public final void m4258v() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(m4257h());
    }
}
