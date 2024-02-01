package p000a;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: a.Yd */
/* loaded from: classes.dex */
public final class C1315Yd extends C2098nX implements ListIterator {

    /* renamed from: I */
    public final /* synthetic */ AbstractC0386HL f4177I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315Yd(AbstractC0386HL abstractC0386HL, int i) {
        super(2, abstractC0386HL);
        this.f4177I = abstractC0386HL;
        C0054B3.m98h(i, abstractC0386HL.mo26h());
        this.f6472R = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f6472R > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6472R;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f6472R - 1;
            this.f6472R = i;
            return this.f4177I.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6472R - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
