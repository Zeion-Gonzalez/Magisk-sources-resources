package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.D0 */
/* loaded from: classes.dex */
public final class C0155D0 implements Iterator, InterfaceC1564dP {

    /* renamed from: I */
    public final /* synthetic */ InterfaceC2296rE f513I;

    /* renamed from: R */
    public int f514R;

    /* renamed from: S */
    public final /* synthetic */ int f515S;

    /* renamed from: w */
    public Object f516w;

    public C0155D0(C1831iT c1831iT) {
        this.f515S = 0;
        this.f513I = c1831iT;
        this.f514R = -2;
    }

    /* renamed from: h */
    public final void m321h() {
        while (this.f514R < ((C0004A4) this.f513I).f68h && ((Iterator) this.f516w).hasNext()) {
            ((Iterator) this.f516w).next();
            this.f514R++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f515S) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (this.f514R < 0) {
                    m322z();
                }
                if (this.f514R != 1) {
                    return false;
                }
                return true;
            default:
                m321h();
                if (this.f514R >= ((C0004A4) this.f513I).f69v || !((Iterator) this.f516w).hasNext()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f515S) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (this.f514R < 0) {
                    m322z();
                }
                if (this.f514R != 0) {
                    Object obj = this.f516w;
                    this.f514R = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                m321h();
                int i = this.f514R;
                if (i < ((C0004A4) this.f513I).f69v) {
                    this.f514R = i + 1;
                    return ((Iterator) this.f516w).next();
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f515S) {
            case AbstractC0795Op.f2698E /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: z */
    public final void m322z() {
        Object mo85W;
        int i;
        int i2 = this.f514R;
        C1831iT c1831iT = (C1831iT) this.f513I;
        if (i2 == -2) {
            mo85W = ((InterfaceC1459bP) c1831iT.f5725h).mo93z();
        } else {
            mo85W = c1831iT.f5726v.mo85W(this.f516w);
        }
        this.f516w = mo85W;
        if (mo85W == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.f514R = i;
    }

    public C0155D0(C0004A4 c0004a4) {
        this.f515S = 1;
        this.f513I = c0004a4;
        this.f516w = c0004a4.f70z.iterator();
    }
}
