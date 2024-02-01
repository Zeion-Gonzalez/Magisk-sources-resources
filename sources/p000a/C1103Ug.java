package p000a;

import java.util.ArrayList;

/* renamed from: a.Ug */
/* loaded from: classes.dex */
public final class C1103Ug implements InterfaceC1617eQ {

    /* renamed from: h */
    public final /* synthetic */ Object f3590h;

    /* renamed from: z */
    public final /* synthetic */ int f3591z;

    public /* synthetic */ C1103Ug(int i, Object obj) {
        this.f3591z = i;
        this.f3590h = obj;
    }

    /* renamed from: h */
    public final void m2274h(C1846ik c1846ik) {
        switch (this.f3591z) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (c1846ik == null) {
                    c1846ik = new C1846ik(-3);
                }
                ((C1624eZ) this.f3590h).m3082S(c1846ik);
                return;
            default:
                synchronized (AbstractC2159oj.f6627v) {
                    C2698yx c2698yx = AbstractC2159oj.f6625P;
                    ArrayList arrayList = (ArrayList) c2698yx.getOrDefault((String) this.f3590h, null);
                    if (arrayList != null) {
                        c2698yx.remove((String) this.f3590h);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC1617eQ) arrayList.get(i)).mo2146z(c1846ik);
                        }
                        return;
                    }
                    return;
                }
        }
    }

    @Override // p000a.InterfaceC1617eQ
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ void mo2146z(Object obj) {
        switch (this.f3591z) {
            case AbstractC0795Op.f2698E /* 0 */:
                m2274h((C1846ik) obj);
                return;
            default:
                m2274h((C1846ik) obj);
                return;
        }
    }
}
