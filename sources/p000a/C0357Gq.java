package p000a;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: a.Gq */
/* loaded from: classes.dex */
public final class C0357Gq extends C0434IE {

    /* renamed from: U */
    public final boolean f1207U = false;

    /* renamed from: E */
    public boolean f1206E = true;

    public C0357Gq() {
        this.f1418I = C1453bH.m2872h();
    }

    /* renamed from: yF */
    public static void m779yF(C0357Gq c0357Gq, Executor executor, InterfaceC2487ut interfaceC2487ut, AbstractC0017AI abstractC0017AI) {
        ArrayList arrayList;
        if (c0357Gq.f1207U && !abstractC0017AI.m45G()) {
            c0357Gq.close();
            C0876QR c0876qr = C0876QR.f2983P;
            if (interfaceC2487ut != null) {
                if (executor == null) {
                    interfaceC2487ut.mo57h(c0876qr);
                    return;
                } else {
                    executor.execute(new RunnableC1547d8(c0876qr, 15, interfaceC2487ut));
                    return;
                }
            }
            return;
        }
        if (c0357Gq.f1418I instanceof C1453bH) {
            if (interfaceC2487ut == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
            }
            c0357Gq.f1418I = arrayList;
        }
        c0357Gq.f1420k = (C1996lX) abstractC0017AI;
        super.mo780dG(executor, new C1868jC(c0357Gq, executor, interfaceC2487ut));
    }

    @Override // p000a.C0434IE, p000a.AbstractC2703z2
    /* renamed from: dG */
    public final void mo780dG(Executor executor, InterfaceC2487ut interfaceC2487ut) {
        AbstractC0795Op.m1830U(null, new C1868jC(this, executor, interfaceC2487ut));
    }

    @Override // p000a.C0434IE, p000a.AbstractC2703z2
    /* renamed from: dx */
    public final AbstractC1823iK mo781dx() {
        C0876QR c0876qr = C0876QR.f2983P;
        try {
            C1996lX m1869s = AbstractC0795Op.m1869s();
            this.f1420k = m1869s;
            if (this.f1207U && !m1869s.m45G()) {
                close();
                return c0876qr;
            }
            if (this.f1418I instanceof C1453bH) {
                this.f1418I = new ArrayList();
            }
            C0876QR m972d3 = m972d3();
            if (this.f1206E && m972d3 == C0876QR.f2982N) {
                this.f1206E = false;
                return mo781dx();
            }
            return m972d3;
        } catch (C0861Q4 unused) {
            close();
            return c0876qr;
        }
    }
}
