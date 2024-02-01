package p000a;

import java.io.IOException;

/* renamed from: a.GA */
/* loaded from: classes.dex */
public final class C0321GA implements InterfaceC1007St {

    /* renamed from: h */
    public final /* synthetic */ C2139oL f1093h;

    /* renamed from: z */
    public final /* synthetic */ InterfaceC1636el f1094z;

    public C0321GA(C2139oL c2139oL, InterfaceC1636el interfaceC1636el) {
        this.f1093h = c2139oL;
        this.f1094z = interfaceC1636el;
    }

    @Override // p000a.InterfaceC1007St
    /* renamed from: h */
    public final void mo718h(C1429ap c1429ap) {
        InterfaceC1636el interfaceC1636el = this.f1094z;
        C2139oL c2139oL = this.f1093h;
        try {
            try {
                interfaceC1636el.mo2755z(c2139oL, c2139oL.m3758P(c1429ap));
            } catch (Throwable th) {
                AbstractC2575wW.m4388BX(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            AbstractC2575wW.m4388BX(th2);
            try {
                interfaceC1636el.mo2754h(th2);
            } catch (Throwable th3) {
                AbstractC2575wW.m4388BX(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // p000a.InterfaceC1007St
    /* renamed from: z */
    public final void mo719z(IOException iOException) {
        try {
            this.f1094z.mo2754h(iOException);
        } catch (Throwable th) {
            AbstractC2575wW.m4388BX(th);
            th.printStackTrace();
        }
    }
}
