package p000a;

/* renamed from: a.ez */
/* loaded from: classes.dex */
public final class C1647ez extends AbstractC1442b2 {

    /* renamed from: I */
    public final /* synthetic */ C0878QT f5107I;

    /* renamed from: R */
    public boolean f5108R;

    /* renamed from: w */
    public final /* synthetic */ C0437IH f5109w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647ez(C2294rC c2294rC, C0437IH c0437ih, C0878QT c0878qt) {
        super(c2294rC);
        this.f5109w = c0437ih;
        this.f5107I = c0878qt;
    }

    @Override // p000a.AbstractC1442b2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.f5108R) {
            this.f5108R = true;
            C0437IH c0437ih = this.f5109w;
            C0878QT c0878qt = this.f5107I;
            synchronized (c0437ih) {
                int i = c0878qt.f3037o - 1;
                c0878qt.f3037o = i;
                if (i == 0 && c0878qt.f3034Q) {
                    c0437ih.m981ZH(c0878qt);
                }
            }
        }
    }
}
