package p000a;

/* renamed from: a.Ro */
/* loaded from: classes.dex */
public final class C0947Ro extends AbstractC1449bB {

    /* renamed from: R */
    public final long f3245R;

    /* renamed from: S */
    public final C0003A3 f3246S;

    public C0947Ro(C0003A3 c0003a3, long j) {
        this.f3246S = c0003a3;
        this.f3245R = j;
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: G */
    public final InterfaceC0694N7 mo1577G() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: h */
    public final C0003A3 mo1578h() {
        return this.f3246S;
    }

    @Override // p000a.AbstractC1449bB
    /* renamed from: z */
    public final long mo1579z() {
        return this.f3245R;
    }
}
