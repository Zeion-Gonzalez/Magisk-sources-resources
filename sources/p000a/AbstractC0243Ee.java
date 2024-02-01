package p000a;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.Ee */
/* loaded from: classes.dex */
public abstract class AbstractC0243Ee implements Iterator {

    /* renamed from: I */
    public final /* synthetic */ C1210Wc f829I;

    /* renamed from: R */
    public C0821PK f830R = null;

    /* renamed from: S */
    public C0821PK f831S;

    /* renamed from: w */
    public int f832w;

    public AbstractC0243Ee(C1210Wc c1210Wc) {
        this.f829I = c1210Wc;
        this.f831S = c1210Wc.f3934w.f2783I;
        this.f832w = c1210Wc.f3933q;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f831S != this.f829I.f3934w;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0821PK c0821pk = this.f830R;
        if (c0821pk == null) {
            throw new IllegalStateException();
        }
        C1210Wc c1210Wc = this.f829I;
        c1210Wc.m2490P(c0821pk, true);
        this.f830R = null;
        this.f832w = c1210Wc.f3933q;
    }

    /* renamed from: z */
    public final C0821PK m517z() {
        C0821PK c0821pk = this.f831S;
        C1210Wc c1210Wc = this.f829I;
        if (c0821pk == c1210Wc.f3934w) {
            throw new NoSuchElementException();
        }
        if (c1210Wc.f3933q != this.f832w) {
            throw new ConcurrentModificationException();
        }
        this.f831S = c0821pk.f2783I;
        this.f830R = c0821pk;
        return c0821pk;
    }
}
