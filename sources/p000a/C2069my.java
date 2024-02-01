package p000a;

/* renamed from: a.my */
/* loaded from: classes.dex */
public final class C2069my extends AbstractC0178DS {

    /* renamed from: I */
    public boolean f6423I;

    @Override // p000a.AbstractC0178DS, p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((!this.f546R) != false) {
                if (this.f6423I) {
                    return -1L;
                }
                long mo188M = super.mo188M(c2361sQ, j);
                if (mo188M == -1) {
                    this.f6423I = true;
                    m348z();
                    return -1L;
                }
                return mo188M;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4205u("byteCount < 0: ", j).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f546R) {
            return;
        }
        if (!this.f6423I) {
            m348z();
        }
        this.f546R = true;
    }
}
