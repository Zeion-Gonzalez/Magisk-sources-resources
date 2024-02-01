package p000a;

import java.io.IOException;

/* renamed from: a.r6 */
/* loaded from: classes.dex */
public final class C2289r6 extends AbstractC1442b2 {

    /* renamed from: R */
    public final /* synthetic */ int f7072R = 0;

    /* renamed from: w */
    public final /* synthetic */ AbstractC1449bB f7073w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2289r6(C1723gR c1723gR, InterfaceC0694N7 interfaceC0694N7) {
        super(interfaceC0694N7);
        this.f7073w = c1723gR;
    }

    @Override // p000a.AbstractC1442b2, p000a.InterfaceC0984SS
    /* renamed from: M */
    public final long mo188M(C2361sQ c2361sQ, long j) {
        switch (this.f7072R) {
            case 1:
                try {
                    return super.mo188M(c2361sQ, j);
                } catch (IOException e) {
                    ((C1723gR) this.f7073w).f5406w = e;
                    throw e;
                }
            default:
                return super.mo188M(c2361sQ, j);
        }
    }

    @Override // p000a.AbstractC1442b2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7072R) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C1943ka) this.f7073w).f6029S.close();
                super.close();
                return;
            default:
                super.close();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2289r6(InterfaceC0984SS interfaceC0984SS, C1943ka c1943ka) {
        super(interfaceC0984SS);
        this.f7073w = c1943ka;
    }
}
