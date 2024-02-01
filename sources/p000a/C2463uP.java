package p000a;

import android.content.DialogInterface;

/* renamed from: a.uP */
/* loaded from: classes.dex */
public final class C2463uP extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f7562R;

    /* renamed from: w */
    public static final C2463uP f7561w = new C2463uP(0);

    /* renamed from: I */
    public static final C2463uP f7559I = new C2463uP(1);

    /* renamed from: q */
    public static final C2463uP f7560q = new C2463uP(2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2463uP(int i) {
        super(1);
        this.f7562R = i;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        C0329GJ c0329gj = C0329GJ.f1115z;
        switch (this.f7562R) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0738Nr c0738Nr = (C0738Nr) obj;
                c0738Nr.m1710W("");
                c0738Nr.m1713u(0);
                if (!c0738Nr.f2511I) {
                    c0738Nr.f2511I = true;
                    AbstractC0795Op.m1801B(c0738Nr, 9);
                }
                c0738Nr.f2516q = false;
                c0738Nr.f2515k = f7560q;
                return c0329gj;
            case 1:
                DialogInterface dialogInterface = (DialogInterface) obj;
                return c0329gj;
            default:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                return c0329gj;
        }
    }
}
