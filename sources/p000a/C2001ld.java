package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.ld */
/* loaded from: classes.dex */
public final class C2001ld implements Iterator, InterfaceC1564dP {

    /* renamed from: I */
    public int f6211I;

    /* renamed from: R */
    public final int f6212R;

    /* renamed from: S */
    public final int f6213S;

    /* renamed from: w */
    public boolean f6214w;

    public C2001ld(char c, char c2, int i) {
        this.f6213S = i;
        this.f6212R = c2;
        boolean z = true;
        if (i <= 0 ? AbstractC1292YB.m2696w(c, c2) < 0 : AbstractC1292YB.m2696w(c, c2) > 0) {
            z = false;
        }
        this.f6214w = z;
        this.f6211I = z ? c : c2;
    }

    /* renamed from: h */
    public final void m3624h() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6214w;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        m3624h();
        throw null;
    }

    @Override // java.util.Iterator
    /* renamed from: z */
    public final Object next() {
        int i = this.f6211I;
        if (i == this.f6212R) {
            if (this.f6214w) {
                this.f6214w = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f6211I = this.f6213S + i;
        }
        return Character.valueOf((char) i);
    }
}
