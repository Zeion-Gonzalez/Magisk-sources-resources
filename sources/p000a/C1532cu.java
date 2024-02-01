package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a.cu */
/* loaded from: classes.dex */
public final class C1532cu extends AbstractC0608LO implements Iterator, InterfaceC1564dP {

    /* renamed from: I */
    public final /* synthetic */ int f4732I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532cu(C0642M4 c0642m4, int i) {
        super(c0642m4);
        this.f4732I = i;
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                super(c0642m4);
                return;
            }
        }
        super(c0642m4);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4732I;
        C0642M4 c0642m4 = this.f1971S;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i2 = this.f1970R;
                if (i2 < c0642m4.f2076k) {
                    this.f1970R = i2 + 1;
                    this.f1972w = i2;
                    C0891Ql c0891Ql = new C0891Ql(c0642m4, i2);
                    m1342z();
                    return c0891Ql;
                }
                throw new NoSuchElementException();
            case 1:
                int i3 = this.f1970R;
                if (i3 < c0642m4.f2076k) {
                    this.f1970R = i3 + 1;
                    this.f1972w = i3;
                    Object obj = c0642m4.f2072S[i3];
                    m1342z();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                int i4 = this.f1970R;
                if (i4 < c0642m4.f2076k) {
                    this.f1970R = i4 + 1;
                    this.f1972w = i4;
                    Object obj2 = c0642m4.f2071R[i4];
                    m1342z();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
