package p000a;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: a.x0 */
/* loaded from: classes.dex */
public final class C2603x0 extends AbstractC1882jS {

    /* renamed from: v */
    public final /* synthetic */ int f8022v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2603x0(AbstractC1235X4 abstractC1235X4, int i) {
        super(abstractC1235X4);
        this.f8022v = i;
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: v */
    public final void mo1114v(AbstractC2626xP abstractC2626xP, Object obj) {
        int i = this.f8022v;
        AbstractC1235X4 abstractC1235X4 = this.f5865z;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC2626xP.mo3927z();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    abstractC1235X4.mo1114v(abstractC2626xP, it.next());
                }
                ((C2279qw) abstractC2626xP).m3924he(']', 1, 2);
                return;
            default:
                abstractC2626xP.mo3927z();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    abstractC1235X4.mo1114v(abstractC2626xP, it2.next());
                }
                ((C2279qw) abstractC2626xP).m3924he(']', 1, 2);
                return;
        }
    }

    @Override // p000a.AbstractC1235X4
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ Object mo1115z(AbstractC0932RY abstractC0932RY) {
        switch (this.f8022v) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m3502P(abstractC0932RY);
            default:
                return m3502P(abstractC0932RY);
        }
    }
}
