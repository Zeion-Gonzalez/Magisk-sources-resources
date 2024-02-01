package p000a;

import androidx.activity.C2752h;

/* renamed from: a.Zr */
/* loaded from: classes.dex */
public final class C1381Zr implements InterfaceC2582wf {

    /* renamed from: R */
    public final /* synthetic */ C2752h f4313R;

    /* renamed from: S */
    public final AbstractC0356Gp f4314S;

    public C1381Zr(C2752h c2752h, AbstractC0356Gp abstractC0356Gp) {
        this.f4313R = c2752h;
        this.f4314S = abstractC0356Gp;
    }

    @Override // p000a.InterfaceC2582wf
    public final void cancel() {
        C2752h c2752h = this.f4313R;
        C1200WR c1200wr = c2752h.f8637h;
        AbstractC0356Gp abstractC0356Gp = this.f4314S;
        c1200wr.remove(abstractC0356Gp);
        if (AbstractC1292YB.m2695u(c2752h.f8639v, abstractC0356Gp)) {
            abstractC0356Gp.getClass();
            c2752h.f8639v = null;
        }
        abstractC0356Gp.f1203h.remove(this);
        InterfaceC1459bP interfaceC1459bP = abstractC0356Gp.f1204v;
        if (interfaceC1459bP != null) {
            interfaceC1459bP.mo93z();
        }
        abstractC0356Gp.f1204v = null;
    }
}
