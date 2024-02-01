package p000a;

/* renamed from: a.LO */
/* loaded from: classes.dex */
public abstract class AbstractC0608LO {

    /* renamed from: R */
    public int f1970R;

    /* renamed from: S */
    public final C0642M4 f1971S;

    /* renamed from: w */
    public int f1972w = -1;

    public AbstractC0608LO(C0642M4 c0642m4) {
        this.f1971S = c0642m4;
        m1342z();
    }

    public final boolean hasNext() {
        if (this.f1970R < this.f1971S.f2076k) {
            return true;
        }
        return false;
    }

    public final void remove() {
        boolean z;
        if (this.f1972w != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C0642M4 c0642m4 = this.f1971S;
            c0642m4.m1438h();
            c0642m4.m1439o(this.f1972w);
            this.f1972w = -1;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
    }

    /* renamed from: z */
    public final void m1342z() {
        while (true) {
            int i = this.f1970R;
            C0642M4 c0642m4 = this.f1971S;
            if (i < c0642m4.f2076k && c0642m4.f2079w[i] < 0) {
                this.f1970R = i + 1;
            } else {
                return;
            }
        }
    }
}
