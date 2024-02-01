package p000a;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: a.Er */
/* loaded from: classes.dex */
public final class C0254Er implements Iterator, Map.Entry {

    /* renamed from: I */
    public final /* synthetic */ AbstractC0632Lt f905I;

    /* renamed from: S */
    public int f907S;

    /* renamed from: w */
    public boolean f908w = false;

    /* renamed from: R */
    public int f906R = -1;

    public C0254Er(AbstractC0632Lt abstractC0632Lt) {
        this.f905I = abstractC0632Lt;
        this.f907S = abstractC0632Lt.mo1416o() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.f908w) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f906R;
            AbstractC0632Lt abstractC0632Lt = this.f905I;
            Object mo1409Q = abstractC0632Lt.mo1409Q(i, 0);
            if (key != mo1409Q && (key == null || !key.equals(mo1409Q))) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            Object value = entry.getValue();
            Object mo1409Q2 = abstractC0632Lt.mo1409Q(this.f906R, 1);
            if (value != mo1409Q2 && (value == null || !value.equals(mo1409Q2))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f908w) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f905I.mo1409Q(this.f906R, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f908w) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f905I.mo1409Q(this.f906R, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f906R < this.f907S;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f908w) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f906R;
        AbstractC0632Lt abstractC0632Lt = this.f905I;
        Object mo1409Q = abstractC0632Lt.mo1409Q(i, 0);
        Object mo1409Q2 = abstractC0632Lt.mo1409Q(this.f906R, 1);
        return (mo1409Q == null ? 0 : mo1409Q.hashCode()) ^ (mo1409Q2 != null ? mo1409Q2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f906R++;
            this.f908w = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f908w) {
            throw new IllegalStateException();
        }
        this.f905I.mo1412V(this.f906R);
        this.f906R--;
        this.f907S--;
        this.f908w = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f908w) {
            return this.f905I.mo1410S(this.f906R, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
