package p000a;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.TH */
/* loaded from: classes.dex */
public final class C1027TH implements Iterator, InterfaceC1564dP {

    /* renamed from: R */
    public boolean f3431R;

    /* renamed from: S */
    public String f3432S;

    /* renamed from: w */
    public final /* synthetic */ C1228Wy f3433w;

    public C1027TH(C1228Wy c1228Wy) {
        this.f3433w = c1228Wy;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3432S == null && !this.f3431R) {
            String readLine = ((BufferedReader) this.f3433w.f3996h).readLine();
            this.f3432S = readLine;
            if (readLine == null) {
                this.f3431R = true;
            }
        }
        if (this.f3432S != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.f3432S;
            this.f3432S = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
