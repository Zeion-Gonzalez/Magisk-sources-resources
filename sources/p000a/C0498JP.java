package p000a;

import java.util.regex.Pattern;

/* renamed from: a.JP */
/* loaded from: classes.dex */
public final class C0498JP implements InterfaceC2491ux {

    /* renamed from: R */
    public static final C0003A3 f1666R;

    /* renamed from: S */
    public final AbstractC1235X4 f1667S;

    static {
        Pattern pattern = C0003A3.f64P;
        f1666R = C1710g8.m3223I("application/json; charset=UTF-8");
    }

    public C0498JP(AbstractC1235X4 abstractC1235X4) {
        this.f1667S = abstractC1235X4;
    }

    @Override // p000a.InterfaceC2491ux
    /* renamed from: P */
    public final Object mo329P(Object obj) {
        C2361sQ c2361sQ = new C2361sQ();
        this.f1667S.mo1114v(new C2279qw(c2361sQ), obj);
        return new C1872jH(f1666R, c2361sQ.mo1631q());
    }
}
